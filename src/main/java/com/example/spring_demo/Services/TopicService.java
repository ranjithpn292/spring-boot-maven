package com.example.spring_demo.Services;

import com.example.spring_demo.Entities.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("java","java language","OOP language"),
            new Topic("javascript","JS language","scripting language")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic gettopic(String id){
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addtopic(Topic topic) {
        topics.add(topic);
    }
}
