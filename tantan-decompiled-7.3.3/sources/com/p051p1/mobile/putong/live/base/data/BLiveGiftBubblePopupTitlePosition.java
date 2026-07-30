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
public class BLiveGiftBubblePopupTitlePosition extends TEnum {
    public static final TEnumJsonAdapter<BLiveGiftBubblePopupTitlePosition> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveGiftBubblePopupTitlePosition> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveGiftBubblePopupTitlePosition> _BLiveGiftBubblePopupTitlePosition;
    public static final String center = "center";
    private static final int int_left = 0;
    private static final int int_middle = 1;
    private static final int int_unknown_ = -1;
    public static final String left = "left";
    public static final String middle = "middle";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition$a */
    public class C11843a extends TEnumJsonAdapter<BLiveGiftBubblePopupTitlePosition> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveGiftBubblePopupTitlePosition newTEnum(String str, int i) {
            return BLiveGiftBubblePopupTitlePosition.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition$b */
    public class C11844b extends TEnumProtobufAdapter<BLiveGiftBubblePopupTitlePosition> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveGiftBubblePopupTitlePosition newTEnum(String str, int i) {
            return BLiveGiftBubblePopupTitlePosition.getForData(str, i);
        }
    }

    static {
        C11843a c11843a = new C11843a();
        JSON_ADAPTER = c11843a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11844b();
        c11843a.addExtJsonValue("unknown_", -1);
        c11843a.addExtJsonValue(left, 0);
        c11843a.addExtJsonValue(middle, 1);
        supportEnum.add(left);
        supportEnum.add(middle);
        supportEnum.add("center");
        _BLiveGiftBubblePopupTitlePosition = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveGiftBubblePopupTitlePosition(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveGiftBubblePopupTitlePosition> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveGiftBubblePopupTitlePosition> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveGiftBubblePopupTitlePosition> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveGiftBubblePopupTitlePosition> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveGiftBubblePopupTitlePosition get(String str) {
        Map<String, BLiveGiftBubblePopupTitlePosition> map = _BLiveGiftBubblePopupTitlePosition;
        BLiveGiftBubblePopupTitlePosition bLiveGiftBubblePopupTitlePosition = map.get(str);
        if (bLiveGiftBubblePopupTitlePosition == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveGiftBubblePopupTitlePosition = integer == null ? new BLiveGiftBubblePopupTitlePosition(str, -1) : new BLiveGiftBubblePopupTitlePosition(str, integer.intValue());
            map.put(str, bLiveGiftBubblePopupTitlePosition);
        }
        return bLiveGiftBubblePopupTitlePosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveGiftBubblePopupTitlePosition getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveGiftBubblePopupTitlePosition> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveGiftBubblePopupTitlePosition> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveGiftBubblePopupTitlePosition get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
