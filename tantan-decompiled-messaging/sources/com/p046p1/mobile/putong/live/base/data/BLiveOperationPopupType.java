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
public class BLiveOperationPopupType extends TEnum {
    public static final String H5Drawer = "H5Drawer";
    public static final String H5PopUp = "H5PopUp";
    public static final TEnumJsonAdapter<BLiveOperationPopupType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveOperationPopupType> PROTOBUF_ADAPTER;
    public static final String TextDrawer = "TextDrawer";
    private static final Map<String, BLiveOperationPopupType> _BLiveOperationPopupType;
    private static final int int_H5Drawer = 1;
    private static final int int_H5PopUp = 3;
    private static final int int_TextDrawer = 2;
    private static final int int_none = 0;
    private static final int int_unknown_ = -1;
    public static final String none = "none";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationPopupType$a */
    public class C11924a extends TEnumJsonAdapter<BLiveOperationPopupType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationPopupType newTEnum(String str, int i) {
            return BLiveOperationPopupType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOperationPopupType$b */
    public class C11925b extends TEnumProtobufAdapter<BLiveOperationPopupType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveOperationPopupType newTEnum(String str, int i) {
            return BLiveOperationPopupType.getForData(str, i);
        }
    }

    static {
        C11924a c11924a = new C11924a();
        JSON_ADAPTER = c11924a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11925b();
        c11924a.addExtJsonValue("unknown_", -1);
        c11924a.addExtJsonValue("none", 0);
        c11924a.addExtJsonValue(H5Drawer, 1);
        c11924a.addExtJsonValue(TextDrawer, 2);
        c11924a.addExtJsonValue(H5PopUp, 3);
        supportEnum.add("none");
        supportEnum.add(H5Drawer);
        supportEnum.add(TextDrawer);
        supportEnum.add(H5PopUp);
        _BLiveOperationPopupType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveOperationPopupType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveOperationPopupType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveOperationPopupType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveOperationPopupType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveOperationPopupType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveOperationPopupType get(String str) {
        Map<String, BLiveOperationPopupType> map = _BLiveOperationPopupType;
        BLiveOperationPopupType bLiveOperationPopupType = map.get(str);
        if (bLiveOperationPopupType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveOperationPopupType = integer == null ? new BLiveOperationPopupType(str, -1) : new BLiveOperationPopupType(str, integer.intValue());
            map.put(str, bLiveOperationPopupType);
        }
        return bLiveOperationPopupType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveOperationPopupType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveOperationPopupType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveOperationPopupType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveOperationPopupType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
