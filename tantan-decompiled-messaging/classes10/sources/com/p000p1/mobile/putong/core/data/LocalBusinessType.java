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
public class LocalBusinessType extends TEnum {
    public static final TEnumJsonAdapter<LocalBusinessType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LocalBusinessType> PROTOBUF_ADAPTER;
    private static final Map<String, LocalBusinessType> _LocalBusinessType;
    private static final int int_nickNameUnLockTip = 0;
    private static final int int_stickTopUnlockTip = 2;
    private static final int int_unknown_ = -1;
    private static final int int_voiceCallUnLockTip = 1;
    public static final String nickNameUnLockTip = "nickNameUnLockTip";
    public static final String stickTopUnlockTip = "stickTopUnlockTip";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String voiceCallUnLockTip = "voiceCallUnLockTip";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<LocalBusinessType> tEnumJsonAdapter = new TEnumJsonAdapter<LocalBusinessType>() { // from class: com.p1.mobile.putong.core.data.LocalBusinessType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public LocalBusinessType m13951newTEnum(String str, int i) {
                return LocalBusinessType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<LocalBusinessType>() { // from class: com.p1.mobile.putong.core.data.LocalBusinessType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public LocalBusinessType m13952newTEnum(String str, int i) {
                return LocalBusinessType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(nickNameUnLockTip, int_nickNameUnLockTip);
        tEnumJsonAdapter.addExtJsonValue(voiceCallUnLockTip, 1);
        tEnumJsonAdapter.addExtJsonValue(stickTopUnlockTip, 2);
        supportEnum.add(nickNameUnLockTip);
        supportEnum.add(voiceCallUnLockTip);
        supportEnum.add(stickTopUnlockTip);
        _LocalBusinessType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private LocalBusinessType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LocalBusinessType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LocalBusinessType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LocalBusinessType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, LocalBusinessType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static LocalBusinessType get(String str) {
        Map<String, LocalBusinessType> map = _LocalBusinessType;
        LocalBusinessType localBusinessType = map.get(str);
        if (localBusinessType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            localBusinessType = integer == null ? new LocalBusinessType(str, int_unknown_) : new LocalBusinessType(str, integer.intValue());
            map.put(str, localBusinessType);
        }
        return localBusinessType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LocalBusinessType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LocalBusinessType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LocalBusinessType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LocalBusinessType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
