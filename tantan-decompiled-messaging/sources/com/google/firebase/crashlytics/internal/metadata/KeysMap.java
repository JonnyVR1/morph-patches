package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p149l.ig3;

/* JADX INFO: loaded from: classes7.dex */
class KeysMap {
    private final Map<String, String> keys = new HashMap();
    private final int maxEntries;
    private final int maxEntryLength;

    public KeysMap(int i, int i2) {
        this.maxEntries = i;
        this.maxEntryLength = i2;
    }

    private String sanitizeKey(String str) {
        if (str != null) {
            return sanitizeString(str, this.maxEntryLength);
        }
        ig3.m135964a("Custom attribute key must not be null.");
        return null;
    }

    public static String sanitizeString(String str, int i) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }

    @NonNull
    public synchronized Map<String, String> getKeys() {
        return Collections.unmodifiableMap(new HashMap(this.keys));
    }

    public synchronized boolean setKey(String str, String str2) {
        String strSanitizeKey = sanitizeKey(str);
        if (this.keys.size() >= this.maxEntries && !this.keys.containsKey(strSanitizeKey)) {
            Logger.getLogger().m16729w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.maxEntries);
            return false;
        }
        String strSanitizeString = sanitizeString(str2, this.maxEntryLength);
        if (CommonUtils.nullSafeEquals(this.keys.get(strSanitizeKey), strSanitizeString)) {
            return false;
        }
        Map<String, String> map = this.keys;
        if (str2 == null) {
            strSanitizeString = "";
        }
        map.put(strSanitizeKey, strSanitizeString);
        return true;
    }

    public synchronized void setKeys(Map<String, String> map) {
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String strSanitizeKey = sanitizeKey(entry.getKey());
                if (this.keys.size() < this.maxEntries || this.keys.containsKey(strSanitizeKey)) {
                    String value = entry.getValue();
                    this.keys.put(strSanitizeKey, value == null ? "" : sanitizeString(value, this.maxEntryLength));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Logger.getLogger().m16729w("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.maxEntries);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
