package org.tillery.controller;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.DgsSubscription;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

@DgsComponent
public class PublisherController {

    @DgsQuery
    public List<Thing> fetchThings() {
        return List.of(new Thing("1", "One"));
    }

    @DgsSubscription
    public Publisher<Thing> thingsPublisher() {
        return Flux.interval(Duration.ofSeconds(5)).map(t -> new Thing(String.valueOf(t), "Thing at time " + t));
    }

}

record Thing(String name, String description) {}
