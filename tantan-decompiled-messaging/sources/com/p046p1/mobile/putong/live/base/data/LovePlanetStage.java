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
public class LovePlanetStage extends TEnum {
    public static final TEnumJsonAdapter<LovePlanetStage> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<LovePlanetStage> PROTOBUF_ADAPTER;
    private static final Map<String, LovePlanetStage> _LovePlanetStage;
    public static final String choice = "choice";
    private static final int int_unknown_ = -1;
    public static final String introduction = "introduction";
    public static final String prepare = "prepare";
    public static final String result = "result";
    protected static HashSet<String> supportEnum = null;
    public static final String trip = "trip";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.LovePlanetStage$a */
    public class C12439a extends TEnumJsonAdapter<LovePlanetStage> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LovePlanetStage newTEnum(String str, int i) {
            return LovePlanetStage.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.LovePlanetStage$b */
    public class C12440b extends TEnumProtobufAdapter<LovePlanetStage> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LovePlanetStage newTEnum(String str, int i) {
            return LovePlanetStage.getForData(str, i);
        }
    }

    static {
        C12439a c12439a = new C12439a();
        JSON_ADAPTER = c12439a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12440b();
        c12439a.addExtJsonValue("unknown_", -1);
        supportEnum.add("prepare");
        supportEnum.add("introduction");
        supportEnum.add(choice);
        supportEnum.add(result);
        supportEnum.add("trip");
        _LovePlanetStage = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private LovePlanetStage(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<LovePlanetStage> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<LovePlanetStage> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, LovePlanetStage> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, LovePlanetStage> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static LovePlanetStage get(String str) {
        Map<String, LovePlanetStage> map = _LovePlanetStage;
        LovePlanetStage lovePlanetStage = map.get(str);
        if (lovePlanetStage == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            lovePlanetStage = integer == null ? new LovePlanetStage(str, -1) : new LovePlanetStage(str, integer.intValue());
            map.put(str, lovePlanetStage);
        }
        return lovePlanetStage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LovePlanetStage getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<LovePlanetStage> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, LovePlanetStage> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static LovePlanetStage get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
