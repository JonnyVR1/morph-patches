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
public class BLiveBottomContentTypeEnum extends TEnum {
    public static final TEnumJsonAdapter<BLiveBottomContentTypeEnum> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveBottomContentTypeEnum> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveBottomContentTypeEnum> _BLiveBottomContentTypeEnum;
    public static final String countdown = "countdown";
    private static final int int_unknown_ = -1;
    public static final String picture = "picture";
    protected static HashSet<String> supportEnum = null;
    public static final String text = "text";
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveBottomContentTypeEnum$a */
    public class C11682a extends TEnumJsonAdapter<BLiveBottomContentTypeEnum> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveBottomContentTypeEnum newTEnum(String str, int i) {
            return BLiveBottomContentTypeEnum.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveBottomContentTypeEnum$b */
    public class C11683b extends TEnumProtobufAdapter<BLiveBottomContentTypeEnum> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveBottomContentTypeEnum newTEnum(String str, int i) {
            return BLiveBottomContentTypeEnum.getForData(str, i);
        }
    }

    static {
        C11682a c11682a = new C11682a();
        JSON_ADAPTER = c11682a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11683b();
        c11682a.addExtJsonValue("unknown_", -1);
        supportEnum.add("text");
        supportEnum.add("picture");
        supportEnum.add("countdown");
        _BLiveBottomContentTypeEnum = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveBottomContentTypeEnum(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveBottomContentTypeEnum> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveBottomContentTypeEnum> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveBottomContentTypeEnum> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveBottomContentTypeEnum> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveBottomContentTypeEnum get(String str) {
        Map<String, BLiveBottomContentTypeEnum> map = _BLiveBottomContentTypeEnum;
        BLiveBottomContentTypeEnum bLiveBottomContentTypeEnum = map.get(str);
        if (bLiveBottomContentTypeEnum == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveBottomContentTypeEnum = integer == null ? new BLiveBottomContentTypeEnum(str, -1) : new BLiveBottomContentTypeEnum(str, integer.intValue());
            map.put(str, bLiveBottomContentTypeEnum);
        }
        return bLiveBottomContentTypeEnum;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveBottomContentTypeEnum getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveBottomContentTypeEnum> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveBottomContentTypeEnum> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveBottomContentTypeEnum get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
