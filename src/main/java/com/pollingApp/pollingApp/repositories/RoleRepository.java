package com.pollingApp.pollingApp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pollingApp.pollingApp.models.Role;
import com.pollingApp.pollingApp.models.RoleName;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Optional<Role> findByName(RoleName roleName);

}
