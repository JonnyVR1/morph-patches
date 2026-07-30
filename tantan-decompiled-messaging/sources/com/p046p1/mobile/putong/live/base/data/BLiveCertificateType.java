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
public class BLiveCertificateType extends TEnum {
    public static final TEnumJsonAdapter<BLiveCertificateType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveCertificateType> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveCertificateType> _BLiveCertificateType;
    public static final String idCard = "idCard";
    private static final int int_idCard = 0;
    private static final int int_unknown_ = -1;
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveCertificateType$a */
    public class C11553a extends TEnumJsonAdapter<BLiveCertificateType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveCertificateType newTEnum(String str, int i) {
            return BLiveCertificateType.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveCertificateType$b */
    public class C11554b extends TEnumProtobufAdapter<BLiveCertificateType> {
        @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveCertificateType newTEnum(String str, int i) {
            return BLiveCertificateType.getForData(str, i);
        }
    }

    static {
        C11553a c11553a = new C11553a();
        JSON_ADAPTER = c11553a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C11554b();
        c11553a.addExtJsonValue("unknown_", -1);
        c11553a.addExtJsonValue("idCard", 0);
        supportEnum.add("idCard");
        _BLiveCertificateType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private BLiveCertificateType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveCertificateType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveCertificateType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveCertificateType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, BLiveCertificateType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static BLiveCertificateType get(String str) {
        Map<String, BLiveCertificateType> map = _BLiveCertificateType;
        BLiveCertificateType bLiveCertificateType = map.get(str);
        if (bLiveCertificateType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveCertificateType = integer == null ? new BLiveCertificateType(str, -1) : new BLiveCertificateType(str, integer.intValue());
            map.put(str, bLiveCertificateType);
        }
        return bLiveCertificateType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveCertificateType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveCertificateType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveCertificateType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveCertificateType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
