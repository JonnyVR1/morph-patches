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
public class VirtualVoiceMotionType extends TEnum {
    public static final TEnumJsonAdapter<VirtualVoiceMotionType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<VirtualVoiceMotionType> PROTOBUF_ADAPTER;
    private static final Map<String, VirtualVoiceMotionType> _VirtualVoiceMotionType;
    public static final String announcement = "announcement";
    public static final String auction = "auction";
    public static final String backgroundMusic = "backgroundMusic";
    public static final String bottomCall = "bottomCall";
    public static final String chatTopic = "chatTopic";
    public static final String functionPanel = "functionPanel";
    public static final String game = "game";
    private static final int int_unknown_ = -1;
    public static final String ktv = "ktv";
    public static final String lovePlanet = "lovePlanet";
    public static final String nineDeputy = "nineDeputy";
    public static final String none = "none";
    public static final String normal = "normal";
    public static final String rightCall = "rightCall";
    public static final String shareScreen = "shareScreen";
    protected static HashSet<String> supportEnum = null;
    public static final String undercover = "undercover";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.VirtualVoiceMotionType$a */
    public class C12445a extends TEnumJsonAdapter<VirtualVoiceMotionType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VirtualVoiceMotionType newTEnum(String str, int i) {
            return VirtualVoiceMotionType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.VirtualVoiceMotionType$b */
    public class C12446b extends TEnumProtobufAdapter<VirtualVoiceMotionType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VirtualVoiceMotionType newTEnum(String str, int i) {
            return VirtualVoiceMotionType.getForData(str, i);
        }
    }

    static {
        C12445a c12445a = new C12445a();
        JSON_ADAPTER = c12445a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12446b();
        c12445a.addExtJsonValue("unknown_", -1);
        supportEnum.add("normal");
        supportEnum.add(ktv);
        supportEnum.add(bottomCall);
        supportEnum.add(rightCall);
        supportEnum.add("none");
        supportEnum.add(chatTopic);
        supportEnum.add(announcement);
        supportEnum.add(backgroundMusic);
        supportEnum.add(functionPanel);
        supportEnum.add("auction");
        supportEnum.add(shareScreen);
        supportEnum.add(nineDeputy);
        supportEnum.add(undercover);
        supportEnum.add(lovePlanet);
        supportEnum.add("game");
        _VirtualVoiceMotionType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private VirtualVoiceMotionType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<VirtualVoiceMotionType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<VirtualVoiceMotionType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, VirtualVoiceMotionType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, VirtualVoiceMotionType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static VirtualVoiceMotionType get(String str) {
        Map<String, VirtualVoiceMotionType> map = _VirtualVoiceMotionType;
        VirtualVoiceMotionType virtualVoiceMotionType = map.get(str);
        if (virtualVoiceMotionType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            virtualVoiceMotionType = integer == null ? new VirtualVoiceMotionType(str, -1) : new VirtualVoiceMotionType(str, integer.intValue());
            map.put(str, virtualVoiceMotionType);
        }
        return virtualVoiceMotionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static VirtualVoiceMotionType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<VirtualVoiceMotionType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, VirtualVoiceMotionType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static VirtualVoiceMotionType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
