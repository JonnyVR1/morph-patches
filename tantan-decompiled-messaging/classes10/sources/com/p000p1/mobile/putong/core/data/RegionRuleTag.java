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
public class RegionRuleTag extends TEnum {

    /* JADX INFO: renamed from: BS */
    public static final String f155BS = "BS";
    public static final String CCPA = "CCPA";

    /* JADX INFO: renamed from: CM */
    public static final String f156CM = "CM";
    public static final String GDPR = "GDPR";
    public static final TEnumJsonAdapter<RegionRuleTag> JSON_ADAPTER;
    public static final String LiveHijackHttpDNS = "LiveHijackHttpDNS";
    public static final TEnumProtobufAdapter<RegionRuleTag> PROTOBUF_ADAPTER;
    private static final Map<String, RegionRuleTag> _RegionRuleTag;
    private static final int int_BS = 2;
    private static final int int_CCPA = 1;
    private static final int int_CM = 3;
    private static final int int_GDPR = 0;
    private static final int int_LiveHijackHttpDNS = 4;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<RegionRuleTag> tEnumJsonAdapter = new TEnumJsonAdapter<RegionRuleTag>() { // from class: com.p1.mobile.putong.core.data.RegionRuleTag.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public RegionRuleTag m15365newTEnum(String str, int i) {
                return RegionRuleTag.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<RegionRuleTag>() { // from class: com.p1.mobile.putong.core.data.RegionRuleTag.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public RegionRuleTag m15366newTEnum(String str, int i) {
                return RegionRuleTag.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(GDPR, int_GDPR);
        tEnumJsonAdapter.addExtJsonValue(CCPA, 1);
        tEnumJsonAdapter.addExtJsonValue(f155BS, 2);
        tEnumJsonAdapter.addExtJsonValue(f156CM, 3);
        tEnumJsonAdapter.addExtJsonValue(LiveHijackHttpDNS, int_LiveHijackHttpDNS);
        supportEnum.add(GDPR);
        supportEnum.add(CCPA);
        supportEnum.add(f155BS);
        supportEnum.add(f156CM);
        supportEnum.add(LiveHijackHttpDNS);
        _RegionRuleTag = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private RegionRuleTag(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<RegionRuleTag> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<RegionRuleTag> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, RegionRuleTag> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, RegionRuleTag> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static RegionRuleTag get(String str) {
        Map<String, RegionRuleTag> map = _RegionRuleTag;
        RegionRuleTag regionRuleTag = map.get(str);
        if (regionRuleTag == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            regionRuleTag = integer == null ? new RegionRuleTag(str, int_unknown_) : new RegionRuleTag(str, integer.intValue());
            map.put(str, regionRuleTag);
        }
        return regionRuleTag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RegionRuleTag getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<RegionRuleTag> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, RegionRuleTag> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static RegionRuleTag get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
