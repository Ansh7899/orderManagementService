package dev.ansh.mc_ordermanagementService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Orders {
    @Id
    private long id;
    private String customerName;
    private String bookId;
    private String orderStatus;
}
