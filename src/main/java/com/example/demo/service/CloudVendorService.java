package com.example.demo.service;

import com.example.demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createVendorDetails(CloudVendor vendor);
    public String UpdateVendorDetails(CloudVendor vendor);
    public String deleteVendorDetails(String VendorId);
    public CloudVendor getVendorDetails(String VendorId);
    public List<CloudVendor> getAllVendorDetails();

}
