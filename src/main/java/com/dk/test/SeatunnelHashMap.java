package com.dk.test;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Xuhui
 * @title: SeatunnelHashMap
 * @projectName dk
 * @description: TODO
 * @date 2022/6/1011:29
 */
public class SeatunnelHashMap<K, V> extends HashMap<K, V> {

    private String name;

    public SeatunnelHashMap(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        Iterator<Entry<K,V>> i = entrySet().iterator();
        if (! i.hasNext()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name + " ");
        sb.append("{\n");
        for (;;) {
            Entry<K,V> e = i.next();
            K key = e.getKey();
            V value = e.getValue();
            sb.append(key   == this ? "(this Map)" : key);
            sb.append(" = ");
            sb.append(value == this ? "(this Map)" : value);
            if (! i.hasNext()) {
                return sb.append("\n}").toString();
            }
            sb.append('\n');
        }

    }
}