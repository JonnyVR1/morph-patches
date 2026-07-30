package com.p051p1.mobile.putong.live.base.data;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveMultiCallAnnouncementState extends TEnum {
    public static final TEnumJsonAdapter<BLiveMultiCallAnnouncementState> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveMultiCallAnnouncementState> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveMultiCallAnnouncementState> _BLiveMultiCallAnnouncementState;
    public static final String approved = "approved";
    public static final String canceled = "canceled";
    public static final String default_ = "default";
    private static final int int_unknown_ = -1;
    public static final String pending = "pending";
    public static final String rejected = "rejected";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncementState$a */
    public class C12004a extends TEnumJsonAdapter<BLiveMultiCallAnnouncementState> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveMultiCallAnnouncementState newTEnum(String str, int i) {
            return BLiveMultiCallAnnouncementState.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncementState$b */
    public class C12005b extends TEnumProtobufAdapter<BLiveMultiCallAnnouncementState> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveMultiCallAnnouncementState newTEnum(String str, int i) {
            return BLiveMultiCallAnnouncementState.getForData(str, i);
        }
    }

    static {
        C12004a c12004a = new C12004a();
        JSON_ADAPTER = c12004a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12005b();
        c12004a.addExtJsonValue("unknown_", -1);
        supportEnum.add("default");
        supportEnum.add("approved");
        supportEnum.add("pending");
        supportEnum.add("canceled");
        supportEnum.add("rejected");
        _BLiveMultiCallAnnouncementState = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveMultiCallAnnouncementState(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveMultiCallAnnouncementState> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveMultiCallAnnouncementState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveMultiCallAnnouncementState> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveMultiCallAnnouncementState> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveMultiCallAnnouncementState get(String str) {
        Map<String, BLiveMultiCallAnnouncementState> map = _BLiveMultiCallAnnouncementState;
        BLiveMultiCallAnnouncementState bLiveMultiCallAnnouncementState = map.get(str);
        if (bLiveMultiCallAnnouncementState == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveMultiCallAnnouncementState = integer == null ? new BLiveMultiCallAnnouncementState(str, -1) : new BLiveMultiCallAnnouncementState(str, integer.intValue());
            map.put(str, bLiveMultiCallAnnouncementState);
        }
        return bLiveMultiCallAnnouncementState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveMultiCallAnnouncementState getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveMultiCallAnnouncementState> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveMultiCallAnnouncementState> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveMultiCallAnnouncementState get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
