package Khemiri.Moetez.wellBeing.service;

import Khemiri.Moetez.wellBeing.model.Event;
import Khemiri.Moetez.wellBeing.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // add event
    public Event addEvent(Event event){
        return eventRepository.save(event);
    }

    // get all events
    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    // get event by id
    public Event getEventById(Long eventId){
        return eventRepository.findById(eventId).orElse(null);
    }

    // get events by name
    public List<Event> getEventsByName(String eventName){
        return eventRepository.findByNameEquals(eventName);
    }





}
