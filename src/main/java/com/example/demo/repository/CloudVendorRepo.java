package com.example.demo.repository;

import com.example.demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepo extends JpaRepository<CloudVendor,String> {
}
