package org.ngalonm.congregatr.entities
/**
 * Created by phoenix on 10/02/17.
 */
public class BaseEntity {
    private Integer id
    private Date created
    private Date updated

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    Date getCreated() {
        return created
    }

    void setCreated(Date created) {
        this.created = created
    }

    Date getUpdated() {
        return updated
    }

    void setUpdated(Date updated) {
        this.updated = updated
    }
}
