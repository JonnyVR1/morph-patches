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
public class VoiceLiveMode extends TEnum {
    public static final TEnumJsonAdapter<VoiceLiveMode> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<VoiceLiveMode> PROTOBUF_ADAPTER;
    private static final Map<String, VoiceLiveMode> _VoiceLiveMode;
    public static final String auction = "auction";
    private static final int int_unknown_ = -1;
    public static final String normal = "normal";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.VoiceLiveMode$a */
    public class C12449a extends TEnumJsonAdapter<VoiceLiveMode> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VoiceLiveMode newTEnum(String str, int i) {
            return VoiceLiveMode.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.VoiceLiveMode$b */
    public class C12450b extends TEnumProtobufAdapter<VoiceLiveMode> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VoiceLiveMode newTEnum(String str, int i) {
            return VoiceLiveMode.getForData(str, i);
        }
    }

    static {
        C12449a c12449a = new C12449a();
        JSON_ADAPTER = c12449a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12450b();
        c12449a.addExtJsonValue("unknown_", -1);
        supportEnum.add("normal");
        supportEnum.add("auction");
        _VoiceLiveMode = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private VoiceLiveMode(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<VoiceLiveMode> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<VoiceLiveMode> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, VoiceLiveMode> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, VoiceLiveMode> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static VoiceLiveMode get(String str) {
        Map<String, VoiceLiveMode> map = _VoiceLiveMode;
        VoiceLiveMode voiceLiveMode = map.get(str);
        if (voiceLiveMode == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            voiceLiveMode = integer == null ? new VoiceLiveMode(str, -1) : new VoiceLiveMode(str, integer.intValue());
            map.put(str, voiceLiveMode);
        }
        return voiceLiveMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static VoiceLiveMode getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<VoiceLiveMode> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, VoiceLiveMode> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static VoiceLiveMode get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
