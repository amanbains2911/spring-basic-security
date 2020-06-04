/**
 * 
 */
package com.aman.spring.securityapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author amanb
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Role {
	@Id
    @GeneratedValue
	private int role_id;
	private String role;

}
