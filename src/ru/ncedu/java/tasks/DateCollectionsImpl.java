package ru.ncedu.java.tasks;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

/**
 * Created by Senketsu on 12.08.2016.
 */
public class DateCollectionsImpl implements DateCollections {


    @Override
    public void setDateStyle(int dateStyle) {

    }

    @Override
    public Calendar toCalendar(String dateString) throws ParseException {
        return null;
    }

    @Override
    public String toString(Calendar date) {
        return null;
    }

    @Override
    public void initMainMap(int elementsNumber, Calendar firstDate) {

    }

    @Override
    public void setMainMap(Map<String, Element> map) {

    }

    @Override
    public Map<String, Element> getMainMap() {
        return null;
    }

    @Override
    public SortedMap<String, Element> getSortedSubMap() {
        return null;
    }

    @Override
    public List<Element> getMainList() {
        return null;
    }

    @Override
    public void sortList(List<Element> list) {

    }

    @Override
    public void removeFromList(List<Element> list) {

    }
}
