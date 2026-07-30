package org.seamless.http;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class Query {
    protected final Map<String, List<String>> parameters;

    public Query(String str) {
        this.parameters = new LinkedHashMap();
        if (str == null) {
            return;
        }
        for (String str2 : str.split("&")) {
            int iIndexOf = str2.indexOf(61);
            String strDecode = null;
            if (iIndexOf != -1) {
                try {
                    String strDecode2 = URLDecoder.decode(str2.substring(0, iIndexOf), "UTF-8");
                    strDecode = URLDecoder.decode(str2.substring(iIndexOf + 1, str2.length()), "UTF-8");
                    str2 = strDecode2;
                } catch (UnsupportedEncodingException unused) {
                    wtq0.m207906a("Query string is not UTF-8");
                    throw null;
                }
            }
            List<String> arrayList = this.parameters.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.parameters.put(str2, arrayList);
            }
            arrayList.add(strDecode);
        }
    }

    public static Query newInstance(Map<String, List<String>> map) {
        Query query = new Query();
        query.parameters.putAll(map);
        return query;
    }

    public Query cloneAndAdd(String str, String... strArr) {
        HashMap map = new HashMap(getMapWithLists());
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.addAll(Arrays.asList(strArr));
        return newInstance(map);
    }

    public String get(String str) {
        List<String> list = this.parameters.get(str);
        return (list == null || list.size() == 0) ? "" : list.get(0);
    }

    public Map<String, String[]> getMap() {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, List<String>> entry : this.parameters.entrySet()) {
            List<String> value = entry.getValue();
            treeMap.put(entry.getKey(), value == null ? null : (String[]) value.toArray(new String[value.size()]));
        }
        return treeMap;
    }

    public Map<String, List<String>> getMapWithLists() {
        return Collections.unmodifiableMap(this.parameters);
    }

    public Enumeration<String> getNames() {
        return Collections.enumeration(this.parameters.keySet());
    }

    public String[] getValues(String str) {
        List<String> list = this.parameters.get(str);
        if (list == null) {
            return null;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    public List<String> getValuesAsList(String str) {
        if (this.parameters.containsKey(str)) {
            return Collections.unmodifiableList(this.parameters.get(str));
        }
        return null;
    }

    public boolean isEmpty() {
        return this.parameters.size() == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : this.parameters.entrySet()) {
            for (String str : entry.getValue()) {
                if (str != null && str.length() != 0) {
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public Query(Map<String, String[]> map) {
        this.parameters = new LinkedHashMap();
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            this.parameters.put(entry.getKey(), Arrays.asList(entry.getValue() != null ? entry.getValue() : new String[0]));
        }
    }

    public Query(URL url) {
        this(url.getQuery());
    }

    public Query() {
        this.parameters = new LinkedHashMap();
    }
}
