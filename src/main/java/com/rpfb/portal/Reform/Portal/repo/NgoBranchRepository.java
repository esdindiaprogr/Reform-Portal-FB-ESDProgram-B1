package com.rpfb.portal.Reform.Portal.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rpfb.portal.Reform.Portal.model.NgoBranch;

public interface NgoBranchRepository extends CrudRepository<NgoBranch, Long> {
	List<NgoBranch> findByName(String BranchName);
//	Customer findById(long id);

}
