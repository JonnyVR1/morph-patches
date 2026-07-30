package com.p051p1.mobile.putong.core.data;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.l01;

/* JADX INFO: loaded from: classes10.dex */
public class RegionRuleTag extends TEnum {

    /* JADX INFO: renamed from: BS */
    public static final String f21235BS = "BS";
    public static final String CCPA = "CCPA";

    /* JADX INFO: renamed from: CM */
    public static final String f21236CM = "CM";
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
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public RegionRuleTag newTEnum(String str, int i) {
                return RegionRuleTag.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<RegionRuleTag>() { // from class: com.p1.mobile.putong.core.data.RegionRuleTag.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public RegionRuleTag newTEnum(String str, int i) {
                return RegionRuleTag.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(GDPR, 0);
        tEnumJsonAdapter.addExtJsonValue(CCPA, 1);
        tEnumJsonAdapter.addExtJsonValue(f21235BS, 2);
        tEnumJsonAdapter.addExtJsonValue(f21236CM, 3);
        tEnumJsonAdapter.addExtJsonValue(LiveHijackHttpDNS, 4);
        supportEnum.add(GDPR);
        supportEnum.add(CCPA);
        supportEnum.add(f21235BS);
        supportEnum.add(f21236CM);
        supportEnum.add(LiveHijackHttpDNS);
        _RegionRuleTag = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private RegionRuleTag(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
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
        l01 l01Var = new l01();
        for (Map.Entry<String, RegionRuleTag> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static RegionRuleTag get(String str) {
        Map<String, RegionRuleTag> map = _RegionRuleTag;
        RegionRuleTag regionRuleTag = map.get(str);
        if (regionRuleTag == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            regionRuleTag = integer == null ? new RegionRuleTag(str, -1) : new RegionRuleTag(str, integer.intValue());
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
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, RegionRuleTag> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static RegionRuleTag get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
