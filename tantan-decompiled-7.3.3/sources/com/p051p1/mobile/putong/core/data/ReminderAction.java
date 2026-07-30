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
public class ReminderAction extends TEnum {
    public static final TEnumJsonAdapter<ReminderAction> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<ReminderAction> PROTOBUF_ADAPTER;
    private static final Map<String, ReminderAction> _ReminderAction;
    public static final String audio = "audio";
    public static final String avatar = "avatar";
    private static final int int_audio = 2;
    private static final int int_avatar = 1;
    private static final int int_photo = 0;
    private static final int int_text = 4;
    private static final int int_unknown_ = -1;
    private static final int int_video = 3;
    public static final String photo = "photo";
    protected static HashSet<String> supportEnum = null;
    public static final String text = "text";
    public static final String unknown_ = "unknown_";
    public static final String video = "video";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<ReminderAction> tEnumJsonAdapter = new TEnumJsonAdapter<ReminderAction>() { // from class: com.p1.mobile.putong.core.data.ReminderAction.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public ReminderAction newTEnum(String str, int i) {
                return ReminderAction.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<ReminderAction>() { // from class: com.p1.mobile.putong.core.data.ReminderAction.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public ReminderAction newTEnum(String str, int i) {
                return ReminderAction.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue(photo, 0);
        tEnumJsonAdapter.addExtJsonValue("avatar", 1);
        tEnumJsonAdapter.addExtJsonValue("audio", 2);
        tEnumJsonAdapter.addExtJsonValue("video", 3);
        tEnumJsonAdapter.addExtJsonValue("text", 4);
        supportEnum.add(photo);
        supportEnum.add("avatar");
        supportEnum.add("audio");
        supportEnum.add("video");
        supportEnum.add("text");
        _ReminderAction = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private ReminderAction(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<ReminderAction> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ReminderAction> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, ReminderAction> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, ReminderAction> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static ReminderAction get(String str) {
        Map<String, ReminderAction> map = _ReminderAction;
        ReminderAction reminderAction = map.get(str);
        if (reminderAction == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            reminderAction = integer == null ? new ReminderAction(str, -1) : new ReminderAction(str, integer.intValue());
            map.put(str, reminderAction);
        }
        return reminderAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ReminderAction getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<ReminderAction> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, ReminderAction> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static ReminderAction get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
