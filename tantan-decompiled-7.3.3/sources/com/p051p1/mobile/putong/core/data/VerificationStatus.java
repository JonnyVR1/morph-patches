package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class VerificationStatus extends TEnum {
    public static final TEnumJsonAdapter<VerificationStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<VerificationStatus> PROTOBUF_ADAPTER;
    private static final Map<String, VerificationStatus> _VerificationStatus;
    private static final int int_pending = 1;
    private static final int int_rejected = 2;
    private static final int int_unknown_ = -1;
    private static final int int_verified = 0;
    public static final String pending = "pending";
    public static final String rejected = "rejected";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String verified = "verified";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<VerificationStatus> tEnumJsonAdapter = new TEnumJsonAdapter<VerificationStatus>() { // from class: com.p1.mobile.putong.core.data.VerificationStatus.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public VerificationStatus newTEnum(String str, int i) {
                return VerificationStatus.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<VerificationStatus>() { // from class: com.p1.mobile.putong.core.data.VerificationStatus.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public VerificationStatus newTEnum(String str, int i) {
                return VerificationStatus.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("verified", 0);
        tEnumJsonAdapter.addExtJsonValue("pending", 1);
        tEnumJsonAdapter.addExtJsonValue("rejected", 2);
        supportEnum.add("verified");
        supportEnum.add("pending");
        supportEnum.add("rejected");
        _VerificationStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private VerificationStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<VerificationStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<VerificationStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, VerificationStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, VerificationStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static VerificationStatus get(String str) {
        Map<String, VerificationStatus> map = _VerificationStatus;
        VerificationStatus verificationStatus = map.get(str);
        if (verificationStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            verificationStatus = integer == null ? new VerificationStatus(str, -1) : new VerificationStatus(str, integer.intValue());
            map.put(str, verificationStatus);
        }
        return verificationStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static VerificationStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<VerificationStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, VerificationStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static VerificationStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
