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
public class BLiveVoiceUserProfileMiddleCardType extends TEnum {
    public static final TEnumJsonAdapter<BLiveVoiceUserProfileMiddleCardType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveVoiceUserProfileMiddleCardType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveVoiceUserProfileMiddleCardType> _BLiveVoiceUserProfileMiddleCardType;
    public static final String auction = "auction";
    public static final String companyBoard = "companyBoard";
    public static final String contribute = "contribute";
    public static final String giftWall = "giftWall";
    private static final int int_unknown_ = -1;
    public static final String littleFlame = "littleFlame";
    protected static HashSet<String> supportEnum = null;
    public static final String sweetCp = "sweetCp";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCardType$a */
    public class C12569a extends TEnumJsonAdapter<BLiveVoiceUserProfileMiddleCardType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceUserProfileMiddleCardType newTEnum(String str, int i) {
            return BLiveVoiceUserProfileMiddleCardType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCardType$b */
    public class C12570b extends TEnumProtobufAdapter<BLiveVoiceUserProfileMiddleCardType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceUserProfileMiddleCardType newTEnum(String str, int i) {
            return BLiveVoiceUserProfileMiddleCardType.getForData(str, i);
        }
    }

    static {
        C12569a c12569a = new C12569a();
        JSON_ADAPTER = c12569a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12570b();
        c12569a.addExtJsonValue("unknown_", -1);
        supportEnum.add(companyBoard);
        supportEnum.add("giftWall");
        supportEnum.add("littleFlame");
        supportEnum.add("sweetCp");
        supportEnum.add("auction");
        supportEnum.add(contribute);
        _BLiveVoiceUserProfileMiddleCardType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveVoiceUserProfileMiddleCardType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveVoiceUserProfileMiddleCardType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveVoiceUserProfileMiddleCardType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveVoiceUserProfileMiddleCardType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveVoiceUserProfileMiddleCardType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveVoiceUserProfileMiddleCardType get(String str) {
        Map<String, BLiveVoiceUserProfileMiddleCardType> map = _BLiveVoiceUserProfileMiddleCardType;
        BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType = map.get(str);
        if (bLiveVoiceUserProfileMiddleCardType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveVoiceUserProfileMiddleCardType = integer == null ? new BLiveVoiceUserProfileMiddleCardType(str, -1) : new BLiveVoiceUserProfileMiddleCardType(str, integer.intValue());
            map.put(str, bLiveVoiceUserProfileMiddleCardType);
        }
        return bLiveVoiceUserProfileMiddleCardType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveVoiceUserProfileMiddleCardType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveVoiceUserProfileMiddleCardType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveVoiceUserProfileMiddleCardType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveVoiceUserProfileMiddleCardType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
