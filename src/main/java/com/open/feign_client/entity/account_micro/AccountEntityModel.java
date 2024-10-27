package com.open.feign_client.entity.account_micro;



import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import com.api.open.crud.api.entity.BaseEntity;





@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public class AccountEntityModel extends BaseEntity<Long>
implements Serializable {

private static final long serialVersionUID = 1L;
@Id
@Column(name = "id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "name")
@NaturalId
private String name;

@Override
public String updatedByColumn() {
return "";
}

@Override
public String updatedOnColumn() {
return "";
}

@Override
public String createdByColumn() {
return "";
}

@Override
public String createdOnColumn() {
return "";
}

}
