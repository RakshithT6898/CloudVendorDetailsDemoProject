package com.example.demo.service.impl;

import com.example.demo.exception.CloudVendorNotFoundException;
import com.example.demo.model.CloudVendor;
import com.example.demo.repository.CloudVendorRepo;
import com.example.demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepo cloudVendorRepo;

    public CloudVendorServiceImpl(CloudVendorRepo cloudVendorRepo) {
        this.cloudVendorRepo = cloudVendorRepo;
    }

    @Override
    public String createVendorDetails(CloudVendor vendor) {
        cloudVendorRepo.save(vendor);
        return "Successfully created";
    }

    @Override
    public String UpdateVendorDetails(CloudVendor vendor) {
        cloudVendorRepo.save(vendor);
        return "Successfully updated";
    }

    @Override
    public String deleteVendorDetails(String VendorId) {
        cloudVendorRepo.deleteById(VendorId);
        return "Successfully deleted";
    }

    @Override
    public CloudVendor getVendorDetails(String VendorId) {
        if(cloudVendorRepo.findById(VendorId).isEmpty()){
            throw new CloudVendorNotFoundException("Requested Cloud Vendor details not found");
        }else {
            return cloudVendorRepo.findById(VendorId).get();
        }
    }

    @Override
    public List<CloudVendor> getAllVendorDetails() {
        return cloudVendorRepo.findAll();
    }
}
