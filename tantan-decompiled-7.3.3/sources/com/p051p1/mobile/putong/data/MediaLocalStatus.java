package com.p051p1.mobile.putong.data;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes12.dex */
public class MediaLocalStatus extends TEnum {
    public static final TEnumJsonAdapter<MediaLocalStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MediaLocalStatus> PROTOBUF_ADAPTER;
    private static final Map<String, MediaLocalStatus> _MediaLocalStatus;
    private static final int int_normal = 0;
    private static final int int_preprocessed = 2;
    private static final int int_raw = 1;
    private static final int int_unknown_ = -1;
    public static final String normal = "normal";
    public static final String preprocessed = "preprocessed";
    public static final String raw = "raw";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MediaLocalStatus> tEnumJsonAdapter = new TEnumJsonAdapter<MediaLocalStatus>() { // from class: com.p1.mobile.putong.data.MediaLocalStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MediaLocalStatus newTEnum(String str, int i) {
                return MediaLocalStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MediaLocalStatus>() { // from class: com.p1.mobile.putong.data.MediaLocalStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MediaLocalStatus newTEnum(String str, int i) {
                return MediaLocalStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("normal", 0);
        tEnumJsonAdapter.addExtJsonValue("raw", 1);
        tEnumJsonAdapter.addExtJsonValue(preprocessed, 2);
        supportEnum.add("normal");
        supportEnum.add("raw");
        supportEnum.add(preprocessed);
        _MediaLocalStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private MediaLocalStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MediaLocalStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MediaLocalStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MediaLocalStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, MediaLocalStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static MediaLocalStatus get(String str) {
        Map<String, MediaLocalStatus> map = _MediaLocalStatus;
        MediaLocalStatus mediaLocalStatus = map.get(str);
        if (mediaLocalStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            mediaLocalStatus = integer == null ? new MediaLocalStatus(str, -1) : new MediaLocalStatus(str, integer.intValue());
            map.put(str, mediaLocalStatus);
        }
        return mediaLocalStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaLocalStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MediaLocalStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MediaLocalStatus> oldEnumCovertMap(Map<String, Integer> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(-1);
            }
            l01Var.put(entry.getKey(), get(entry.getValue().intValue()));
        }
        return l01Var;
    }

    public boolean equals(String str) {
        return name().equals(str);
    }

    public boolean isUnknownType() {
        if (equals("unknown_")) {
            return true;
        }
        return !supportEnum.contains(this.name);
    }

    private static MediaLocalStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
