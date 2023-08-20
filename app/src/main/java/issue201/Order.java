package issue201;

import io.jstach.jstache.JStache;

import java.util.List;

@JStache(path = "test")
record Order(String description, List<Item> items) {
    record Item(String name){}
}
