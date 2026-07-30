package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class VoiceCallStatus extends TEnum {
    public static final TEnumJsonAdapter<VoiceCallStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<VoiceCallStatus> PROTOBUF_ADAPTER;
    private static final Map<String, VoiceCallStatus> _VoiceCallStatus;
    public static final String accepted = "accepted";
    public static final String busy = "busy";
    public static final String callee_reject = "callee_reject";
    public static final String calling = "calling";
    public static final String canceled = "canceled";
    public static final String finished = "finished";
    private static final int int_accepted = 1;
    private static final int int_busy = 2;
    private static final int int_callee_reject = 7;
    private static final int int_calling = 5;
    private static final int int_canceled = 6;
    private static final int int_finished = 4;
    private static final int int_notAnswered = 3;
    private static final int int_rejected = 0;
    private static final int int_unknown_ = -1;
    public static final String notAnswered = "notAnswered";
    public static final String rejected = "rejected";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<VoiceCallStatus> tEnumJsonAdapter = new TEnumJsonAdapter<VoiceCallStatus>() { // from class: com.p1.mobile.putong.core.data.VoiceCallStatus.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public VoiceCallStatus newTEnum(String str, int i) {
                return VoiceCallStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<VoiceCallStatus>() { // from class: com.p1.mobile.putong.core.data.VoiceCallStatus.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public VoiceCallStatus newTEnum(String str, int i) {
                return VoiceCallStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("rejected", 0);
        tEnumJsonAdapter.addExtJsonValue("accepted", 1);
        tEnumJsonAdapter.addExtJsonValue(busy, 2);
        tEnumJsonAdapter.addExtJsonValue(notAnswered, 3);
        tEnumJsonAdapter.addExtJsonValue("finished", 4);
        tEnumJsonAdapter.addExtJsonValue(calling, 5);
        tEnumJsonAdapter.addExtJsonValue("canceled", 6);
        tEnumJsonAdapter.addExtJsonValue(callee_reject, 7);
        supportEnum.add("rejected");
        supportEnum.add("accepted");
        supportEnum.add(busy);
        supportEnum.add(notAnswered);
        supportEnum.add("finished");
        supportEnum.add(calling);
        supportEnum.add("canceled");
        supportEnum.add(callee_reject);
        _VoiceCallStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private VoiceCallStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<VoiceCallStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<VoiceCallStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, VoiceCallStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, VoiceCallStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static VoiceCallStatus get(String str) {
        Map<String, VoiceCallStatus> map = _VoiceCallStatus;
        VoiceCallStatus voiceCallStatus = map.get(str);
        if (voiceCallStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            voiceCallStatus = integer == null ? new VoiceCallStatus(str, -1) : new VoiceCallStatus(str, integer.intValue());
            map.put(str, voiceCallStatus);
        }
        return voiceCallStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static VoiceCallStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<VoiceCallStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, VoiceCallStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static VoiceCallStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
