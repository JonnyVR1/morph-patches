package com.sina.weibo.sdk.net;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WeiboParameters {
    private static final String DEFAULT_CHARSET = "UTF-8";
    private String mAnonymousCookie;
    private String mAppKey;
    private LinkedHashMap<String, Object> mParams = new LinkedHashMap<>();

    public WeiboParameters(String str) {
        this.mAppKey = str;
    }

    @Deprecated
    public void add(String str, int i) {
        this.mParams.put(str, String.valueOf(i));
    }

    public boolean containsKey(String str) {
        return this.mParams.containsKey(str);
    }

    public boolean containsValue(String str) {
        return this.mParams.containsValue(str);
    }

    public String encodeUrl() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : this.mParams.keySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            Object obj = this.mParams.get(str);
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        sb.append(URLEncoder.encode(str, DEFAULT_CHARSET) + "=" + URLEncoder.encode(str2, DEFAULT_CHARSET));
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return sb.toString();
    }

    public Object get(String str) {
        return this.mParams.get(str);
    }

    public String getAnonymousCookie() {
        return this.mAnonymousCookie;
    }

    public String getAppKey() {
        return this.mAppKey;
    }

    public LinkedHashMap<String, Object> getParams() {
        return this.mParams;
    }

    public boolean hasBinaryData() {
        Iterator<String> it = this.mParams.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.mParams.get(it.next());
            if ((obj instanceof ByteArrayOutputStream) || (obj instanceof Bitmap)) {
                return true;
            }
        }
        return false;
    }

    public Set<String> keySet() {
        return this.mParams.keySet();
    }

    public void put(String str, int i) {
        this.mParams.put(str, String.valueOf(i));
    }

    public void remove(String str) {
        if (this.mParams.containsKey(str)) {
            this.mParams.remove(str);
            LinkedHashMap<String, Object> linkedHashMap = this.mParams;
            linkedHashMap.remove(linkedHashMap.get(str));
        }
    }

    public void setAnonymousCookie(String str) {
        this.mAnonymousCookie = str;
    }

    public void setParams(LinkedHashMap<String, Object> linkedHashMap) {
        this.mParams = linkedHashMap;
    }

    public int size() {
        return this.mParams.size();
    }

    @Deprecated
    public void add(String str, String str2) {
        this.mParams.put(str, str2);
    }

    public void put(String str, String str2) {
        this.mParams.put(str, str2);
    }

    @Deprecated
    public void add(String str, long j) {
        this.mParams.put(str, String.valueOf(j));
    }

    public void put(String str, long j) {
        this.mParams.put(str, String.valueOf(j));
    }

    @Deprecated
    public void add(String str, Object obj) {
        this.mParams.put(str, obj.toString());
    }

    public void put(String str, Bitmap bitmap) {
        this.mParams.put(str, bitmap);
    }

    public void put(String str, Object obj) {
        this.mParams.put(str, obj.toString());
    }
}
