package com.example.demo.controller;

import com.example.demo.model.CloudVendor;
import com.example.demo.response.RequestHandler;
import com.example.demo.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CloudVendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    //Read for specific vendor details
    @GetMapping("{VendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("VendorId") String vendorId)
    {
        return RequestHandler.responseBuilder("Requested vendor details found", HttpStatus.OK,cloudVendorService.getVendorDetails(vendorId));

//        return new CloudVendor("C1","Abc","xyz","8888");
    }

    // Reading for all vendors details in Db
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails()
    {
        return cloudVendorService.getAllVendorDetails();
//        return new CloudVendor("C1","Abc","xyz","8888");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
//        this.cloudVendor=cloudVendor;
//        return "Vendor details created successfully";
        cloudVendorService.createVendorDetails(cloudVendor);
        return "Vendor details created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
//        this.cloudVendor=cloudVendor;
        cloudVendorService.UpdateVendorDetails(cloudVendor);
        return "Vendor details updated successfully";
    }

    @DeleteMapping("{VendorId}")
    public String deleteCloudVendorDetails(@PathVariable("VendorId") String VendorId)
    {
//        this.cloudVendor=null;
        cloudVendorService.deleteVendorDetails(VendorId);
        return "Vendor details deleted successfully";
    }
}
