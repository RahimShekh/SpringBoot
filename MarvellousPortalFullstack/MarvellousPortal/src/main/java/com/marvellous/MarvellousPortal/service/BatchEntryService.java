package com.marvellous.MarvellousPortal.service;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import com.marvellous.MarvellousPortal.Repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryRepository;

    //C:create
    //POST
    public void saveEntry(BatchEntry batchEntry)
    {
        batchEntryRepository.save(batchEntry);
    }


    public List<BatchEntry> getAll()
    {
        return batchEntryRepository.findAll();
    }

    // R : Read
    //GET

    public Optional<BatchEntry> findById(ObjectId id)
    {
        return batchEntryRepository.findById(id);
    }


    // D : Delete
    // DELETE
    public void deleteById(ObjectId id)
    {
        batchEntryRepository.deleteById(id);
    }

    //P : Post
    // PUT

    public void editById(BatchEntry updatedEntry)
    {
        batchEntryRepository.save(updatedEntry);
    }

}
