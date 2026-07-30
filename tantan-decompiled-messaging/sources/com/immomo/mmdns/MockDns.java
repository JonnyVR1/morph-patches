package com.immomo.mmdns;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class MockDns {
    private static Map<String, String> customMapping = new ConcurrentHashMap();
    private static boolean mockDNSOpen = false;

    public static void addHost(String str, String str2) {
        mockDNSOpen = true;
        synchronized (MockDns.class) {
            customMapping.put(str, str2);
        }
    }

    public static String getIpByHost(String str) {
        String str2;
        if (!mockDNSOpen) {
            return null;
        }
        synchronized (MockDns.class) {
            str2 = customMapping.get(str);
        }
        return str2;
    }

    public static void removeHost(String str) {
        synchronized (MockDns.class) {
            customMapping.remove(str);
            mockDNSOpen = customMapping.size() > 0;
        }
    }

    public static void setHostMapping(Map<String, String> map) {
        synchronized (MockDns.class) {
            mockDNSOpen = map.size() > 0;
            customMapping.clear();
            customMapping.putAll(map);
        }
    }
}
