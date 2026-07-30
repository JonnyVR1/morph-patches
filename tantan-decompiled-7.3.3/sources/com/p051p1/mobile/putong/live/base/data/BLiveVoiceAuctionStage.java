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
public class BLiveVoiceAuctionStage extends TEnum {
    public static final TEnumJsonAdapter<BLiveVoiceAuctionStage> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveVoiceAuctionStage> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveVoiceAuctionStage> _BLiveVoiceAuctionStage;
    public static final String announcing = "announcing";
    public static final String created = "created";
    public static final String ended = "ended";
    private static final int int_unknown_ = -1;
    public static final String playing = "playing";
    public static final String preparing = "preparing";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceAuctionStage$a */
    public class C12410a extends TEnumJsonAdapter<BLiveVoiceAuctionStage> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceAuctionStage newTEnum(String str, int i) {
            return BLiveVoiceAuctionStage.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceAuctionStage$b */
    public class C12411b extends TEnumProtobufAdapter<BLiveVoiceAuctionStage> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceAuctionStage newTEnum(String str, int i) {
            return BLiveVoiceAuctionStage.getForData(str, i);
        }
    }

    static {
        C12410a c12410a = new C12410a();
        JSON_ADAPTER = c12410a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12411b();
        c12410a.addExtJsonValue("unknown_", -1);
        supportEnum.add("created");
        supportEnum.add("preparing");
        supportEnum.add("playing");
        supportEnum.add(announcing);
        supportEnum.add("ended");
        _BLiveVoiceAuctionStage = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveVoiceAuctionStage(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveVoiceAuctionStage> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveVoiceAuctionStage> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveVoiceAuctionStage> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveVoiceAuctionStage> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveVoiceAuctionStage get(String str) {
        Map<String, BLiveVoiceAuctionStage> map = _BLiveVoiceAuctionStage;
        BLiveVoiceAuctionStage bLiveVoiceAuctionStage = map.get(str);
        if (bLiveVoiceAuctionStage == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveVoiceAuctionStage = integer == null ? new BLiveVoiceAuctionStage(str, -1) : new BLiveVoiceAuctionStage(str, integer.intValue());
            map.put(str, bLiveVoiceAuctionStage);
        }
        return bLiveVoiceAuctionStage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveVoiceAuctionStage getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveVoiceAuctionStage> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveVoiceAuctionStage> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveVoiceAuctionStage get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
