package com.immomo.medialog.api;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class ParamsMap extends HashMap<String, String> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String put(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return (String) super.put(str, str2);
    }
}
