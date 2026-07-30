package com.p046p1.mobile.putong.live.base.data;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.e01;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveKtvPlayInfoStatus extends TEnum {
    public static final TEnumJsonAdapter<BLiveKtvPlayInfoStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveKtvPlayInfoStatus> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveKtvPlayInfoStatus> _BLiveKtvPlayInfoStatus;
    public static final String end = "end";
    private static final int int_unknown_ = -1;
    public static final String pause = "pause";
    public static final String playing = "playing";
    public static final String prepare = "prepare";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String waiting = "waiting";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveKtvPlayInfoStatus$a */
    public class C11797a extends TEnumJsonAdapter<BLiveKtvPlayInfoStatus> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveKtvPlayInfoStatus newTEnum(String str, int i) {
            return BLiveKtvPlayInfoStatus.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveKtvPlayInfoStatus$b */
    public class C11798b extends TEnumProtobufAdapter<BLiveKtvPlayInfoStatus> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveKtvPlayInfoStatus newTEnum(String str, int i) {
            return BLiveKtvPlayInfoStatus.getForData(str, i);
        }
    }

    static {
        C11797a c11797a = new C11797a();
        JSON_ADAPTER = c11797a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11798b();
        c11797a.addExtJsonValue("unknown_", -1);
        supportEnum.add("waiting");
        supportEnum.add("prepare");
        supportEnum.add("pause");
        supportEnum.add("playing");
        supportEnum.add("end");
        _BLiveKtvPlayInfoStatus = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveKtvPlayInfoStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveKtvPlayInfoStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveKtvPlayInfoStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveKtvPlayInfoStatus> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveKtvPlayInfoStatus> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveKtvPlayInfoStatus get(String str) {
        Map<String, BLiveKtvPlayInfoStatus> map = _BLiveKtvPlayInfoStatus;
        BLiveKtvPlayInfoStatus bLiveKtvPlayInfoStatus = map.get(str);
        if (bLiveKtvPlayInfoStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveKtvPlayInfoStatus = integer == null ? new BLiveKtvPlayInfoStatus(str, -1) : new BLiveKtvPlayInfoStatus(str, integer.intValue());
            map.put(str, bLiveKtvPlayInfoStatus);
        }
        return bLiveKtvPlayInfoStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveKtvPlayInfoStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveKtvPlayInfoStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveKtvPlayInfoStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveKtvPlayInfoStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
