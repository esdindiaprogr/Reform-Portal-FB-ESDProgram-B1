package com.rpfb.portal.Reform.Portal.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.rpfb.portal.Reform.Portal.model.NgoBranch;
import com.rpfb.portal.Reform.Portal.repo.NgoBranchRepository;


public class NgoBranchService {

	@Autowired
		private NgoBranchRepository repository;
		
		
		public String addNgoBranch(NgoBranch ngobranch) {
		repository.save(ngobranch);
		return "Ngo Branch Saved";
		
	}

}
