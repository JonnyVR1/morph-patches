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
public class BLiveGiftBubblePopupButtonJumpType extends TEnum {
    public static final TEnumJsonAdapter<BLiveGiftBubblePopupButtonJumpType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveGiftBubblePopupButtonJumpType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveGiftBubblePopupButtonJumpType> _BLiveGiftBubblePopupButtonJumpType;
    private static final int int_schema = 1;
    private static final int int_unknown_ = -1;
    private static final int int_url = 0;
    public static final String schema = "schema";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String url = "url";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButtonJumpType$a */
    public class C11840a extends TEnumJsonAdapter<BLiveGiftBubblePopupButtonJumpType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveGiftBubblePopupButtonJumpType newTEnum(String str, int i) {
            return BLiveGiftBubblePopupButtonJumpType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButtonJumpType$b */
    public class C11841b extends TEnumProtobufAdapter<BLiveGiftBubblePopupButtonJumpType> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveGiftBubblePopupButtonJumpType newTEnum(String str, int i) {
            return BLiveGiftBubblePopupButtonJumpType.getForData(str, i);
        }
    }

    static {
        C11840a c11840a = new C11840a();
        JSON_ADAPTER = c11840a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11841b();
        c11840a.addExtJsonValue("unknown_", -1);
        c11840a.addExtJsonValue("url", 0);
        c11840a.addExtJsonValue("schema", 1);
        supportEnum.add("url");
        supportEnum.add("schema");
        _BLiveGiftBubblePopupButtonJumpType = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveGiftBubblePopupButtonJumpType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveGiftBubblePopupButtonJumpType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveGiftBubblePopupButtonJumpType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveGiftBubblePopupButtonJumpType> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveGiftBubblePopupButtonJumpType> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveGiftBubblePopupButtonJumpType get(String str) {
        Map<String, BLiveGiftBubblePopupButtonJumpType> map = _BLiveGiftBubblePopupButtonJumpType;
        BLiveGiftBubblePopupButtonJumpType bLiveGiftBubblePopupButtonJumpType = map.get(str);
        if (bLiveGiftBubblePopupButtonJumpType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveGiftBubblePopupButtonJumpType = integer == null ? new BLiveGiftBubblePopupButtonJumpType(str, -1) : new BLiveGiftBubblePopupButtonJumpType(str, integer.intValue());
            map.put(str, bLiveGiftBubblePopupButtonJumpType);
        }
        return bLiveGiftBubblePopupButtonJumpType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveGiftBubblePopupButtonJumpType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveGiftBubblePopupButtonJumpType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveGiftBubblePopupButtonJumpType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveGiftBubblePopupButtonJumpType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
