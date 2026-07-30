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
public class BLivePkStage extends TEnum {
    public static final TEnumJsonAdapter<BLivePkStage> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLivePkStage> PROTOBUF_ADAPTER;
    private static final Map<String, BLivePkStage> _BLivePkStage;
    public static final String ended = "ended";
    private static final int int_ended = 3;
    private static final int int_playing = 1;
    private static final int int_preparing = 0;
    private static final int int_punishing = 2;
    private static final int int_unknown_ = -1;
    public static final String playing = "playing";
    public static final String preparing = "preparing";
    public static final String punishing = "punishing";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLivePkStage$a */
    public class C11974a extends TEnumJsonAdapter<BLivePkStage> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLivePkStage newTEnum(String str, int i) {
            return BLivePkStage.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLivePkStage$b */
    public class C11975b extends TEnumProtobufAdapter<BLivePkStage> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLivePkStage newTEnum(String str, int i) {
            return BLivePkStage.getForData(str, i);
        }
    }

    static {
        C11974a c11974a = new C11974a();
        JSON_ADAPTER = c11974a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11975b();
        c11974a.addExtJsonValue("unknown_", -1);
        c11974a.addExtJsonValue("preparing", 0);
        c11974a.addExtJsonValue("playing", 1);
        c11974a.addExtJsonValue(punishing, 2);
        c11974a.addExtJsonValue("ended", 3);
        supportEnum.add("preparing");
        supportEnum.add("playing");
        supportEnum.add(punishing);
        supportEnum.add("ended");
        _BLivePkStage = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLivePkStage(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLivePkStage> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLivePkStage> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLivePkStage> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLivePkStage> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLivePkStage get(String str) {
        Map<String, BLivePkStage> map = _BLivePkStage;
        BLivePkStage bLivePkStage = map.get(str);
        if (bLivePkStage == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLivePkStage = integer == null ? new BLivePkStage(str, -1) : new BLivePkStage(str, integer.intValue());
            map.put(str, bLivePkStage);
        }
        return bLivePkStage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLivePkStage getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLivePkStage> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLivePkStage> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLivePkStage get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
