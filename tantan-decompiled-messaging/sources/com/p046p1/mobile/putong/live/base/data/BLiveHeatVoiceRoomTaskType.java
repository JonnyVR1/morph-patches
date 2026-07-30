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
public class BLiveHeatVoiceRoomTaskType extends TEnum {
    public static final TEnumJsonAdapter<BLiveHeatVoiceRoomTaskType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveHeatVoiceRoomTaskType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveHeatVoiceRoomTaskType> _BLiveHeatVoiceRoomTaskType;
    public static final String call = "call";
    private static final int int_unknown_ = -1;
    public static final String notifyFans = "notifyFans";
    public static final String notifySettled = "notifySettled";
    public static final String shareRoom = "shareRoom";
    public static final String starRedPacket = "starRedPacket";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTaskType$a */
    public class C11746a extends TEnumJsonAdapter<BLiveHeatVoiceRoomTaskType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveHeatVoiceRoomTaskType newTEnum(String str, int i) {
            return BLiveHeatVoiceRoomTaskType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTaskType$b */
    public class C11747b extends TEnumProtobufAdapter<BLiveHeatVoiceRoomTaskType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveHeatVoiceRoomTaskType newTEnum(String str, int i) {
            return BLiveHeatVoiceRoomTaskType.getForData(str, i);
        }
    }

    static {
        C11746a c11746a = new C11746a();
        JSON_ADAPTER = c11746a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11747b();
        c11746a.addExtJsonValue("unknown_", -1);
        supportEnum.add("call");
        supportEnum.add(notifyFans);
        supportEnum.add(notifySettled);
        supportEnum.add(shareRoom);
        supportEnum.add(starRedPacket);
        _BLiveHeatVoiceRoomTaskType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveHeatVoiceRoomTaskType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveHeatVoiceRoomTaskType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveHeatVoiceRoomTaskType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveHeatVoiceRoomTaskType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveHeatVoiceRoomTaskType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveHeatVoiceRoomTaskType get(String str) {
        Map<String, BLiveHeatVoiceRoomTaskType> map = _BLiveHeatVoiceRoomTaskType;
        BLiveHeatVoiceRoomTaskType bLiveHeatVoiceRoomTaskType = map.get(str);
        if (bLiveHeatVoiceRoomTaskType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveHeatVoiceRoomTaskType = integer == null ? new BLiveHeatVoiceRoomTaskType(str, -1) : new BLiveHeatVoiceRoomTaskType(str, integer.intValue());
            map.put(str, bLiveHeatVoiceRoomTaskType);
        }
        return bLiveHeatVoiceRoomTaskType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveHeatVoiceRoomTaskType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveHeatVoiceRoomTaskType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveHeatVoiceRoomTaskType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveHeatVoiceRoomTaskType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
