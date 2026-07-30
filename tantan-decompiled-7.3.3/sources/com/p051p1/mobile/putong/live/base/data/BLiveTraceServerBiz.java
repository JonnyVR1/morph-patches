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
public class BLiveTraceServerBiz extends TEnum {
    public static final String Grabheadlines = "Grabheadlines";
    public static final TEnumJsonAdapter<BLiveTraceServerBiz> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveTraceServerBiz> PROTOBUF_ADAPTER;
    public static final String PacketUnJail = "PacketUnJail";
    private static final Map<String, BLiveTraceServerBiz> _BLiveTraceServerBiz;
    public static final String audio_pay_guide_follow_like = "audio_pay_guide_follow_like";
    public static final String audio_pay_guide_follow_match = "audio_pay_guide_follow_match";
    public static final String audio_pay_guide_follow_stranger = "audio_pay_guide_follow_stranger";
    public static final String audio_pay_guide_key_pop = "audio_pay_guide_key_pop";
    public static final String audio_pay_guide_nearby_pop = "audio_pay_guide_nearby_pop";
    public static final String audio_pay_guide_not_follow_like_strategyA = "audio_pay_guide_not_follow_like_strategyA";
    public static final String audio_pay_guide_not_follow_like_strategyB = "audio_pay_guide_not_follow_like_strategyB";
    public static final String audio_pay_guide_not_follow_like_strategyC = "audio_pay_guide_not_follow_like_strategyC";
    public static final String audio_pay_guide_not_follow_stranger_strategyA = "audio_pay_guide_not_follow_stranger_strategyA";
    public static final String audio_pay_guide_not_follow_stranger_strategyB = "audio_pay_guide_not_follow_stranger_strategyB";
    public static final String audio_pay_guide_not_follow_stranger_strategyC = "audio_pay_guide_not_follow_stranger_strategyC";
    public static final String audio_pay_guide_profile_add = "audio_pay_guide_profile_add";
    public static final String audio_pay_guide_relationship_pop = "audio_pay_guide_relationship_pop";
    public static final String bulletstorm = "bulletstorm";
    public static final String callCard = "callCard";

    /* JADX INFO: renamed from: cp */
    public static final String f45308cp = "cp";
    public static final String fans = "fans";
    public static final String firstblood = "firstblood";
    public static final String firstrecharge = "firstrecharge";
    public static final String firstscreen = "firstscreen";
    public static final String giftcollection = "giftcollection";
    public static final String giftcombination = "giftcombination";
    public static final String guard = "guard";
    private static final int int_Grabheadlines = 8;
    private static final int int_bulletstorm = 9;
    private static final int int_fans = 0;
    private static final int int_firstblood = 4;
    private static final int int_firstrecharge = 10;
    private static final int int_firstscreen = 5;
    private static final int int_giftcombination = 2;
    private static final int int_guard = 1;
    private static final int int_interactivepk = 7;
    private static final int int_sweetaccompany = 3;
    private static final int int_unknown_ = -1;
    private static final int int_withyoutravel = 6;
    public static final String interactivepk = "interactivepk";
    public static final String sticker = "sticker";
    protected static HashSet<String> supportEnum = null;
    public static final String sweetaccompany = "sweetaccompany";
    public static final String topchat = "topchat";
    public static final String unknown_ = "unknown_";
    public static final String withyoutravel = "withyoutravel";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz$a */
    public class C12314a extends TEnumJsonAdapter<BLiveTraceServerBiz> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveTraceServerBiz newTEnum(String str, int i) {
            return BLiveTraceServerBiz.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz$b */
    public class C12315b extends TEnumProtobufAdapter<BLiveTraceServerBiz> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveTraceServerBiz newTEnum(String str, int i) {
            return BLiveTraceServerBiz.getForData(str, i);
        }
    }

    static {
        C12314a c12314a = new C12314a();
        JSON_ADAPTER = c12314a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12315b();
        c12314a.addExtJsonValue("unknown_", -1);
        c12314a.addExtJsonValue("fans", 0);
        c12314a.addExtJsonValue(guard, 1);
        c12314a.addExtJsonValue(giftcombination, 2);
        c12314a.addExtJsonValue(sweetaccompany, 3);
        c12314a.addExtJsonValue(firstblood, 4);
        c12314a.addExtJsonValue(firstscreen, 5);
        c12314a.addExtJsonValue(withyoutravel, 6);
        c12314a.addExtJsonValue(interactivepk, 7);
        c12314a.addExtJsonValue(Grabheadlines, 8);
        c12314a.addExtJsonValue(bulletstorm, 9);
        c12314a.addExtJsonValue(firstrecharge, 10);
        supportEnum.add("fans");
        supportEnum.add(guard);
        supportEnum.add(giftcombination);
        supportEnum.add(sweetaccompany);
        supportEnum.add(firstblood);
        supportEnum.add(firstscreen);
        supportEnum.add(withyoutravel);
        supportEnum.add(interactivepk);
        supportEnum.add(Grabheadlines);
        supportEnum.add(bulletstorm);
        supportEnum.add(firstrecharge);
        supportEnum.add(topchat);
        supportEnum.add("sticker");
        supportEnum.add(PacketUnJail);
        supportEnum.add(callCard);
        supportEnum.add(f45308cp);
        supportEnum.add(audio_pay_guide_relationship_pop);
        supportEnum.add(audio_pay_guide_key_pop);
        supportEnum.add(audio_pay_guide_nearby_pop);
        supportEnum.add(audio_pay_guide_profile_add);
        supportEnum.add(audio_pay_guide_follow_like);
        supportEnum.add(audio_pay_guide_follow_match);
        supportEnum.add(audio_pay_guide_follow_stranger);
        supportEnum.add(audio_pay_guide_not_follow_like_strategyA);
        supportEnum.add(audio_pay_guide_not_follow_like_strategyB);
        supportEnum.add(audio_pay_guide_not_follow_like_strategyC);
        supportEnum.add(audio_pay_guide_not_follow_stranger_strategyA);
        supportEnum.add(audio_pay_guide_not_follow_stranger_strategyB);
        supportEnum.add(audio_pay_guide_not_follow_stranger_strategyC);
        supportEnum.add(giftcollection);
        _BLiveTraceServerBiz = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveTraceServerBiz(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveTraceServerBiz> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveTraceServerBiz> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveTraceServerBiz> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveTraceServerBiz> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveTraceServerBiz get(String str) {
        Map<String, BLiveTraceServerBiz> map = _BLiveTraceServerBiz;
        BLiveTraceServerBiz bLiveTraceServerBiz = map.get(str);
        if (bLiveTraceServerBiz == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveTraceServerBiz = integer == null ? new BLiveTraceServerBiz(str, -1) : new BLiveTraceServerBiz(str, integer.intValue());
            map.put(str, bLiveTraceServerBiz);
        }
        return bLiveTraceServerBiz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveTraceServerBiz getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveTraceServerBiz> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveTraceServerBiz> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveTraceServerBiz get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
