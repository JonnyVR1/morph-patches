package com.p000p1.mobile.putong.core.data;

import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AudioTextStatus extends TEnum {
    public static final TEnumJsonAdapter<AudioTextStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<AudioTextStatus> PROTOBUF_ADAPTER;
    private static final Map<String, AudioTextStatus> _AudioTextStatus;
    public static final String default_ = "default";
    public static final String failed = "failed";
    private static final int int_default_ = 0;
    private static final int int_failed = 2;
    private static final int int_pending = 1;
    private static final int int_unknown_ = -1;
    public static final String pending = "pending";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<AudioTextStatus> tEnumJsonAdapter = new TEnumJsonAdapter<AudioTextStatus>() { // from class: com.p1.mobile.putong.core.data.AudioTextStatus.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public AudioTextStatus m11663newTEnum(String str, int i) {
                return AudioTextStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<AudioTextStatus>() { // from class: com.p1.mobile.putong.core.data.AudioTextStatus.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public AudioTextStatus m11664newTEnum(String str, int i) {
                return AudioTextStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue("default", int_default_);
        tEnumJsonAdapter.addExtJsonValue("pending", 1);
        tEnumJsonAdapter.addExtJsonValue("failed", 2);
        supportEnum.add("default");
        supportEnum.add("pending");
        supportEnum.add("failed");
        _AudioTextStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private AudioTextStatus(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<AudioTextStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<AudioTextStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, AudioTextStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, AudioTextStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static AudioTextStatus get(String str) {
        Map<String, AudioTextStatus> map = _AudioTextStatus;
        AudioTextStatus audioTextStatus = map.get(str);
        if (audioTextStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            audioTextStatus = integer == null ? new AudioTextStatus(str, int_unknown_) : new AudioTextStatus(str, integer.intValue());
            map.put(str, audioTextStatus);
        }
        return audioTextStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioTextStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<AudioTextStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, AudioTextStatus> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(Integer.valueOf(int_unknown_));
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
        return !supportEnum.contains(((TEnum) this).name);
    }

    private static AudioTextStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
