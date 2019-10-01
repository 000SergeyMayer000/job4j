package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"First name", "Fist description", "12345"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI111.creatItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("First name", "Fist description", 12345L);
        assertThat(created, is(expected));//  метод equals в классе Item переопределен.
    }
    @Test
public void whenEditItem(){
        Tracker tracker = new Tracker();
        Item item = new Item("new item","new decs",12345L);
        tracker.add(item);
        String[] answers = {
                item.getId(), // id сохраненной заявки в объект tracker.
                "replaced item"
        };
        StartUI111.editItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("new item"));
    }
}
