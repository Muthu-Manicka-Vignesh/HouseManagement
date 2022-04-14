package com.myprogramming.SpringBootApplication.RentalManager;

import com.myprogramming.SpringBootApplication.Records.Records;
import com.myprogramming.SpringBootApplication.model.House;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RentalManager {
    private Records records;

    @PostMapping("saveHouse")
    public House addHouse(@RequestBody House house){
        return records.save(house);
    }

    @GetMapping("getByType")
    public List<House> getHouse(@PathVariable String type){
            return records.findByType(type);
    }

    @GetMapping("getHouse")
    public Optional<House> getHouseById(@PathVariable int id){
        return records.findById(id);
    }

    @GetMapping("getAllHouse")
    public List<House> getAllHouses(){
        return records.findAll();
    }

    @DeleteMapping("deleteHouse")
    public String deleteHouse(@PathVariable int id){
        String result;
        try{
            records.deleteById(id);
            result="record deleted";
        }catch (Exception e){
            result="error";
        }
        return result;
    }

}
