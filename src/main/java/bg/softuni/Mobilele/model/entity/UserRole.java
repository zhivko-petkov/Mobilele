package bg.softuni.Mobilele.model.entity;

import bg.softuni.Mobilele.model.entity.enumerations.Role;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="userRoles")
public class UserRole extends BaseEntity{
    @Enumerated(EnumType.STRING)
    private Role role;

    public UserRole() {
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
