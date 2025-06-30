package com.marvellous.MarvellousPortal.controller;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    private Map<Long, BatchEntry> batchentries = new HashMap<>();

    //HTTP : GET
    //Read
    //select * from batches;
    @GetMapping
    public List<BatchEntry> getAll()
    {
        return new ArrayList<>(batchentries.values());
    }

    //HTTP: POST
    //create
    //insert into batches values(1,"PPA",27000)
    @PostMapping
    public boolean createEntry(@RequestBody BatchEntry myentry)
    {
        batchentries.put(myentry.getId(), myentry);
        return true;
    }


    @GetMapping("id/{myid}")
    public BatchEntry getBatchEntryById(@PathVariable long myid)
    {
        return batchentries.get(myid);
    }

    //HTTP : Delete
    //delete
    //delete from batches where id = 1;
    @DeleteMapping("id/{myid}")
    public BatchEntry deleteEntryById(@PathVariable long myid)
    {
        return batchentries.remove(myid);
    }

    //HTTP : PUT
    //updaate
    //update batches set fees = 30000 where id = 1;
    @PutMapping("id/{myid}")
    public BatchEntry updateEntryById(@PathVariable BatchEntry myentry)
    {
        return batchentries.put(myentry.getId(), myentry);
    }

    //get the data by name

//    @GetMapping("name/{myname}")
//    public List<BatchEntry> getBatchEntriesByName(@PathVariable String myname) {
//        List<BatchEntry> result = new ArrayList<>();
//        for (BatchEntry name : batchentries.values()) {
//            if (name.getName().equals(myname)) {
//                result.add(name);
//            }
//        }
//        return result;
//    }
       @GetMapping("name/{Batchname}")
       public BatchEntry getBatchEntryByName(@PathVariable String Batchname) {
            for (BatchEntry name : batchentries.values()) {
            if (name.getName().equals(Batchname)) {
                 return name;  // Return only the first match
            }
        }
            return null;
}



}
