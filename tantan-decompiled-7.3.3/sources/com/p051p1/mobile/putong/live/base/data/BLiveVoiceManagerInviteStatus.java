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
public class BLiveVoiceManagerInviteStatus extends TEnum {
    public static final TEnumJsonAdapter<BLiveVoiceManagerInviteStatus> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<BLiveVoiceManagerInviteStatus> PROTOBUF_ADAPTER;
    private static final Map<String, BLiveVoiceManagerInviteStatus> _BLiveVoiceManagerInviteStatus;
    public static final String default_ = "default";
    private static final int int_default_ = 0;
    private static final int int_inviting = 1;
    private static final int int_unknown_ = -1;
    public static final String inviting = "inviting";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceManagerInviteStatus$a */
    public class C12494a extends TEnumJsonAdapter<BLiveVoiceManagerInviteStatus> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceManagerInviteStatus newTEnum(String str, int i) {
            return BLiveVoiceManagerInviteStatus.getForData(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceManagerInviteStatus$b */
    public class C12495b extends TEnumProtobufAdapter<BLiveVoiceManagerInviteStatus> {
        @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceManagerInviteStatus newTEnum(String str, int i) {
            return BLiveVoiceManagerInviteStatus.getForData(str, i);
        }
    }

    static {
        C12494a c12494a = new C12494a();
        JSON_ADAPTER = c12494a;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new C12495b();
        c12494a.addExtJsonValue("unknown_", -1);
        c12494a.addExtJsonValue("default", 0);
        c12494a.addExtJsonValue(inviting, 1);
        supportEnum.add("default");
        supportEnum.add(inviting);
        _BLiveVoiceManagerInviteStatus = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private BLiveVoiceManagerInviteStatus(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<BLiveVoiceManagerInviteStatus> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<BLiveVoiceManagerInviteStatus> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, BLiveVoiceManagerInviteStatus> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, BLiveVoiceManagerInviteStatus> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static BLiveVoiceManagerInviteStatus get(String str) {
        Map<String, BLiveVoiceManagerInviteStatus> map = _BLiveVoiceManagerInviteStatus;
        BLiveVoiceManagerInviteStatus bLiveVoiceManagerInviteStatus = map.get(str);
        if (bLiveVoiceManagerInviteStatus == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            bLiveVoiceManagerInviteStatus = integer == null ? new BLiveVoiceManagerInviteStatus(str, -1) : new BLiveVoiceManagerInviteStatus(str, integer.intValue());
            map.put(str, bLiveVoiceManagerInviteStatus);
        }
        return bLiveVoiceManagerInviteStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BLiveVoiceManagerInviteStatus getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<BLiveVoiceManagerInviteStatus> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, BLiveVoiceManagerInviteStatus> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static BLiveVoiceManagerInviteStatus get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
