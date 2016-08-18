package ru.ncedu.java.tasks;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

/**
 * Created by Senketsu on 12.08.2016.
 */
public class DateCollectionsImpl implements DateCollections {

    Map<String, Element> mainmap;

    int dateStyle = DateFormat.MEDIUM;

    @Override
    public void setDateStyle(int dateStyle) {
        this.dateStyle = dateStyle;
    }

    @Override
    public Calendar toCalendar(String dateString) throws ParseException {
        Calendar result;
        result =
    }

    @Override
    public String toString(Calendar date) {
        String result = "";
        result += date.toString();

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
