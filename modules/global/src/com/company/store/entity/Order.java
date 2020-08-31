package com.company.store.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "STORE_ORDER")
@Entity(name = "store_Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 7926138598070772348L;

    @NotNull
    @Column(name = "ORDER_NUMBER", nullable = false, unique = true)
    private Long orderNumber;

    @NotNull
    @JoinColumn(name = "CLIENT_ID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Client client;

    @OneToMany(mappedBy = "order")
    private List<OrderPosition> positions;

//    @Column(name = "SUM_", nullable = false)
//    @NotNull
//    private Long sum;

    @Transient
    @MetaProperty(mandatory = true)
    @NotNull
    public Long getSum() {
        Long sum = 0L;
        for (OrderPosition o: positions){
            sum += o.getProduct().getPrice() * o.getCount();
        }
        return sum;
    }

    public List<OrderPosition> getPositions() {
        return positions;
    }

    public void setPositions(List<OrderPosition> positions) {
        this.positions = positions;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }
}