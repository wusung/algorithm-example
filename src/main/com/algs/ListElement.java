package com.algs;

/**
 * @author Green
 * @since 2015/10/29
 */
public class ListElement {
    public ListElement next;
    public Object data;

    public ListElement(Object data) {
        this.data = data;
    }

    public ListElement insertToFront(ListElement elem, Object data) {
        ListElement newElem = new ListElement(data);
        newElem.next = elem;
        return newElem;
    }
}
