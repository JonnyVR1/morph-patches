package com.immomo.mmhttp.model;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.io.File;
import java.io.Serializable;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p149l.hyx;

/* JADX INFO: loaded from: classes7.dex */
public class HttpParams implements Serializable {
    private static final long serialVersionUID = 7369819159227055048L;
    public LinkedHashMap<String, List<C3794a>> fileParamsMap;
    public LinkedHashMap<String, List<String>> urlParamsMap;

    public HttpParams(String str, String str2) {
        init();
        put(str, str2);
    }

    private hyx guessMimeType(String str) {
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        if (contentTypeFor == null) {
            contentTypeFor = OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE;
        }
        return hyx.m133628d(contentTypeFor);
    }

    private void init() {
        this.urlParamsMap = new LinkedHashMap<>();
        this.fileParamsMap = new LinkedHashMap<>();
    }

    public void clear() {
        this.urlParamsMap.clear();
        this.fileParamsMap.clear();
    }

    public void put(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public void putFileParams(String str, List<File> list) {
        if (str == null || list == null || list.isEmpty()) {
            return;
        }
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            put(str, it.next());
        }
    }

    public void putFileWrapperParams(String str, List<C3794a> list) {
        if (str == null || list == null || list.isEmpty()) {
            return;
        }
        Iterator<C3794a> it = list.iterator();
        while (it.hasNext()) {
            put(str, it.next());
        }
    }

    public void putUrlParams(String str, List<String> list) {
        if (str == null || list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            put(str, it.next());
        }
    }

    public void removeFile(String str) {
        this.fileParamsMap.remove(str);
    }

    public void removeUrl(String str) {
        this.urlParamsMap.remove(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : this.urlParamsMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        for (Map.Entry<String, List<C3794a>> entry2 : this.fileParamsMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue());
        }
        return sb.toString();
    }

    public HttpParams() {
        init();
    }

    public HttpParams(String str, File file) {
        init();
        put(str, file);
    }

    /* JADX INFO: renamed from: com.immomo.mmhttp.model.HttpParams$a */
    public static class C3794a {

        /* JADX INFO: renamed from: a */
        public File f12958a;

        /* JADX INFO: renamed from: b */
        public String f12959b;

        /* JADX INFO: renamed from: c */
        public hyx f12960c;

        /* JADX INFO: renamed from: d */
        public long f12961d;

        /* JADX INFO: renamed from: e */
        public byte[] f12962e;

        public C3794a(File file, String str, hyx hyxVar) {
            this.f12958a = file;
            this.f12959b = str;
            this.f12960c = hyxVar;
            this.f12961d = file.length();
        }

        public String toString() {
            return "FileWrapper{file=" + this.f12958a + ", fileName='" + this.f12959b + ", contentType=" + this.f12960c + ", fileSize=" + this.f12961d + '}';
        }

        public C3794a(byte[] bArr, String str, hyx hyxVar) {
            this.f12962e = bArr;
            this.f12959b = str;
            this.f12960c = hyxVar;
            this.f12961d = bArr.length;
        }
    }

    public void put(HttpParams httpParams) {
        if (httpParams != null) {
            LinkedHashMap<String, List<String>> linkedHashMap = httpParams.urlParamsMap;
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                this.urlParamsMap.putAll(httpParams.urlParamsMap);
            }
            LinkedHashMap<String, List<C3794a>> linkedHashMap2 = httpParams.fileParamsMap;
            if (linkedHashMap2 == null || linkedHashMap2.isEmpty()) {
                return;
            }
            this.fileParamsMap.putAll(httpParams.fileParamsMap);
        }
    }

    public void put(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        List<String> arrayList = this.urlParamsMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.urlParamsMap.put(str, arrayList);
        }
        arrayList.add(str2);
    }

    public void put(String str, File file) {
        put(str, file, file.getName());
    }

    public void put(String str, File file, String str2) {
        put(str, file, str2, guessMimeType(str2));
    }

    public void put(String str, byte[] bArr, String str2) {
        put(str, bArr, str2, guessMimeType(str2));
    }

    public void put(String str, byte[] bArr, String str2, hyx hyxVar) {
        if (str != null) {
            List<C3794a> arrayList = this.fileParamsMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.fileParamsMap.put(str, arrayList);
            }
            arrayList.add(new C3794a(bArr, str2, hyxVar));
        }
    }

    public void put(String str, C3794a c3794a) {
        if (str == null || c3794a == null) {
            return;
        }
        put(str, c3794a.f12958a, c3794a.f12959b, c3794a.f12960c);
    }

    public void put(String str, File file, String str2, hyx hyxVar) {
        if (str != null) {
            List<C3794a> arrayList = this.fileParamsMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.fileParamsMap.put(str, arrayList);
            }
            arrayList.add(new C3794a(file, str2, hyxVar));
        }
    }
}
