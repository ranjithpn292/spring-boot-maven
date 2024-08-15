package com.example.spring_demo.Repositories;

import com.example.spring_demo.Entities.Topic;
import org.springframework.data.repository.CrudRepository;


public interface TopicRepository extends CrudRepository<Topic,String> {

    //getAllTopics()
    //getTopicById(String id)
    //updateTopic(Topic t)
    //deleteTopic(String id)  all methods are taken care by CRUDRepository;
}
