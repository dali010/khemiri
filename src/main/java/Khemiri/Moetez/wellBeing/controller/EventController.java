package Khemiri.Moetez.wellBeing.controller;


import Khemiri.Moetez.wellBeing.model.Event;
import Khemiri.Moetez.wellBeing.repository.EventRepository;
import Khemiri.Moetez.wellBeing.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @Autowired
    private EventRepository eventRepository;

    // create
    @RequestMapping(value = "/addEvent", method = RequestMethod.POST)
    public Event saveEvent(@RequestBody Event event) {
        return eventService.addEvent(event);
    }

    //update event
    @RequestMapping(value = "/replaceEvent", method = RequestMethod.PUT)
    Event replaceEvent(@RequestBody Event newEvent, @RequestParam(name = "eventId") final Long id) {

        return eventRepository.findById(id)
                .map(event -> {
                    event.setName(newEvent.getName());
                    event.setDescription(newEvent.getDescription());
                    event.setComment(newEvent.getComment());
                    event.setType(newEvent.getType());
                    event.setMail(newEvent.getMail());
                    event.setDate(newEvent.getDate());
                    return eventRepository.save(event);
                })
                .orElseGet(() -> {
                    return eventRepository.save(newEvent);
                });
    }

    //get all events
    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public List<Event> retrieveEvents() {
        return eventService.getAllEvents();
    }

    // get event by id
    @RequestMapping(value = "/eventById", method = RequestMethod.GET)
    public Event retrieveEventById(@RequestParam(name = "eventId") final Long eventId) {
        return eventService.getEventById(eventId);
    }

    // get events by name
    @RequestMapping(value = "/eventByName", method = RequestMethod.GET)
    public List<Event> retrieveEventByName(@RequestParam(name = "eventName") final String eventName) {
        return eventService.getEventsByName(eventName);
    }







}
