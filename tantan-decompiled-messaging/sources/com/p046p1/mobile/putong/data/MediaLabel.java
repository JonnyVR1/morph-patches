package com.p046p1.mobile.putong.data;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.e01;

/* JADX INFO: loaded from: classes12.dex */
public class MediaLabel extends TEnum {
    public static final TEnumJsonAdapter<MediaLabel> JSON_ADAPTER;
    public static final String LOW_FACE_MARK = "LOW_FACE_MARK";
    public static final String LOW_FAKE = "LOW_FAKE";
    public static final String NOT_SAME_PERSON = "NOT_SAME_PERSON";
    public static final String NOT_VERIFICATION = "NOT_VERIFICATION";
    public static final TEnumProtobufAdapter<MediaLabel> PROTOBUF_ADAPTER;
    public static final String RECOMMEND = "RECOMMEND";
    public static final String UNKNOWN = "UNKNOWN";
    public static final String WITH_AI_ALBUM = "WITH_AI_ALBUM";
    public static final String WITH_AUDIT_AI_PICTURE = "WITH_AUDIT_AI_PICTURE";
    public static final String WITH_AUDIT_NET_MAIN_PICTURE = "WITH_AUDIT_NET_MAIN_PICTURE";
    public static final String WITH_FULL_BODY = "WITH_FULL_BODY";
    public static final String WITH_LOW = "WITH_LOW";
    public static final String WITH_NET_MAIN_PICTURE = "WITH_NET_MAIN_PICTURE";
    public static final String WITH_OUTDOOR = "WITH_OUTDOOR";
    public static final String WITH_PETS = "WITH_PETS";
    public static final String WITH_REPEAT_MAIN_PICTURE = "WITH_REPEAT_MAIN_PICTURE";
    public static final String WITH_SPORTS = "WITH_SPORTS";
    public static final String WITH_TRIP = "WITH_TRIP";
    private static final Map<String, MediaLabel> _MediaLabel;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MediaLabel> tEnumJsonAdapter = new TEnumJsonAdapter<MediaLabel>() { // from class: com.p1.mobile.putong.data.MediaLabel.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MediaLabel newTEnum(String str, int i) {
                return MediaLabel.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MediaLabel>() { // from class: com.p1.mobile.putong.data.MediaLabel.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MediaLabel newTEnum(String str, int i) {
                return MediaLabel.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("UNKNOWN");
        supportEnum.add(WITH_PETS);
        supportEnum.add(WITH_SPORTS);
        supportEnum.add(WITH_TRIP);
        supportEnum.add(WITH_AI_ALBUM);
        supportEnum.add(WITH_LOW);
        supportEnum.add(WITH_NET_MAIN_PICTURE);
        supportEnum.add(WITH_REPEAT_MAIN_PICTURE);
        supportEnum.add(WITH_AUDIT_NET_MAIN_PICTURE);
        supportEnum.add(WITH_OUTDOOR);
        supportEnum.add(WITH_FULL_BODY);
        supportEnum.add(NOT_VERIFICATION);
        supportEnum.add(RECOMMEND);
        supportEnum.add(LOW_FAKE);
        supportEnum.add(LOW_FACE_MARK);
        supportEnum.add(NOT_SAME_PERSON);
        supportEnum.add(WITH_AUDIT_AI_PICTURE);
        _MediaLabel = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private MediaLabel(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MediaLabel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MediaLabel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MediaLabel> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, MediaLabel> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static MediaLabel get(String str) {
        Map<String, MediaLabel> map = _MediaLabel;
        MediaLabel mediaLabel = map.get(str);
        if (mediaLabel == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            mediaLabel = integer == null ? new MediaLabel(str, -1) : new MediaLabel(str, integer.intValue());
            map.put(str, mediaLabel);
        }
        return mediaLabel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaLabel getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MediaLabel> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MediaLabel> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(-1);
            }
            e01Var.put(entry.getKey(), get(entry.getValue().intValue()));
        }
        return e01Var;
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

    private static MediaLabel get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
