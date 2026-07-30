package com.p000p1.mobile.putong.core.data;

import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ConversationType extends TEnum {
    public static final TEnumJsonAdapter<ConversationType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ConversationType> PROTOBUF_ADAPTER;
    private static final Map<String, ConversationType> _ConversationType;
    public static final String compliment = "compliment";
    public static final String default_ = "default";
    public static final String fakeIntlReceiveLikeGuideSVip = "fakeIntlReceiveLikeGuideSVip";
    public static final String fakeReceiveLikeGuideSVip = "fakeReceiveLikeGuideSVip";
    public static final String fake_one_side = "fake_one_side";
    public static final String fake_one_side_no_match = "fake_one_side_no_match";
    public static final String feedinteraction = "feedinteraction";
    public static final String feedstate = "feedstate";
    public static final String free_see_match = "free_see_match";
    public static final String friendmoment = "friendmoment";
    public static final String greetset = "greetset";
    public static final String heartbeatMatch = "heartbeatMatch";
    private static final int int_default_ = 0;
    private static final int int_greetset = 4;
    private static final int int_qianshou = 3;
    private static final int int_quickchat = 6;
    private static final int int_shuoshuo = 2;
    private static final int int_soulmate = 1;
    private static final int int_svipad = 5;
    private static final int int_unknown_ = -1;
    public static final String intlBoostMatch = "intlBoostMatch";
    public static final String intlSeeChatRequest = "intlSeeChatRequest";
    public static final String liaoliao = "liaoliao";
    public static final String liveactivites = "liveactivites";
    public static final String local_instant_chat_guide = "local_instant_chat_guide";
    public static final String lovebuzz = "lovebuzz";
    public static final String lovescript = "lovescript";
    public static final String marriage = "marriage";
    public static final String qianshou = "qianshou";
    public static final String quickchat = "quickchat";
    public static final String shuoshuo = "shuoshuo";
    public static final String soulmate = "soulmate";
    protected static HashSet<String> supportEnum = null;
    public static final String svipad = "svipad";
    public static final String swiper = "swiper";
    public static final String unknown_ = "unknown_";
    public static final String virtualvoice = "virtualvoice";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ConversationType> tEnumJsonAdapter = new TEnumJsonAdapter<ConversationType>() { // from class: com.p1.mobile.putong.core.data.ConversationType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public ConversationType m12437newTEnum(String str, int i) {
                return ConversationType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ConversationType>() { // from class: com.p1.mobile.putong.core.data.ConversationType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public ConversationType m12438newTEnum(String str, int i) {
                return ConversationType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue("default", int_default_);
        tEnumJsonAdapter.addExtJsonValue(soulmate, 1);
        tEnumJsonAdapter.addExtJsonValue(shuoshuo, 2);
        tEnumJsonAdapter.addExtJsonValue(qianshou, 3);
        tEnumJsonAdapter.addExtJsonValue(greetset, int_greetset);
        tEnumJsonAdapter.addExtJsonValue(svipad, 5);
        tEnumJsonAdapter.addExtJsonValue("quickchat", int_quickchat);
        supportEnum.add("default");
        supportEnum.add(soulmate);
        supportEnum.add(shuoshuo);
        supportEnum.add(qianshou);
        supportEnum.add(greetset);
        supportEnum.add(svipad);
        supportEnum.add("quickchat");
        supportEnum.add(feedstate);
        supportEnum.add("liaoliao");
        supportEnum.add(feedinteraction);
        supportEnum.add(intlBoostMatch);
        supportEnum.add(lovebuzz);
        supportEnum.add(virtualvoice);
        supportEnum.add("lovescript");
        supportEnum.add(friendmoment);
        supportEnum.add(fake_one_side_no_match);
        supportEnum.add(fakeReceiveLikeGuideSVip);
        supportEnum.add(liveactivites);
        supportEnum.add(fake_one_side);
        supportEnum.add("marriage");
        supportEnum.add(fakeIntlReceiveLikeGuideSVip);
        supportEnum.add(free_see_match);
        supportEnum.add(local_instant_chat_guide);
        supportEnum.add("heartbeatMatch");
        supportEnum.add(intlSeeChatRequest);
        supportEnum.add("compliment");
        supportEnum.add(swiper);
        _ConversationType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private ConversationType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ConversationType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ConversationType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, ConversationType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static ConversationType get(String str) {
        Map<String, ConversationType> map = _ConversationType;
        ConversationType conversationType = map.get(str);
        if (conversationType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            conversationType = integer == null ? new ConversationType(str, int_unknown_) : new ConversationType(str, integer.intValue());
            map.put(str, conversationType);
        }
        return conversationType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ConversationType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ConversationType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ConversationType> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(Integer.valueOf(int_unknown_));
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
        return !supportEnum.contains(((TEnum) this).name);
    }

    private static ConversationType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
