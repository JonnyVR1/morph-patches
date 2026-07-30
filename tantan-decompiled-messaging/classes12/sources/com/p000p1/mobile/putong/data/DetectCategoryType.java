package com.p000p1.mobile.putong.data;

import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class DetectCategoryType extends TEnum {
    public static final TEnumJsonAdapter<DetectCategoryType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<DetectCategoryType> PROTOBUF_ADAPTER;
    private static final Map<String, DetectCategoryType> _DetectCategoryType;
    public static final String chat_background = "chat_background";
    public static final String chat_common = "chat_common";
    public static final String chat_common_mainland = "chat_common_mainland";
    public static final String chat_common_overseas = "chat_common_overseas";
    public static final String chat_search = "chat_search";
    public static final String comment = "comment";
    public static final String contact_information = "contact_information";
    public static final String greeting = "greeting";
    public static final String group_apply = "group_apply";
    public static final String group_chat = "group_chat";
    public static final String group_profile = "group_profile";
    public static final String group_search = "group_search";
    private static final int int_unknown_ = -1;
    public static final String live = "live";
    public static final String login = "login";
    public static final String moment = "moment";
    public static final String profile = "profile";
    public static final String profile_comment = "profile_comment";
    public static final String remark = "remark";
    protected static HashSet<String> supportEnum = null;
    public static final String unknown_ = "unknown_";
    public static final String user_tag = "user_tag";
    public static final String voice_room_name = "voice_room_name";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<DetectCategoryType> tEnumJsonAdapter = new TEnumJsonAdapter<DetectCategoryType>() { // from class: com.p1.mobile.putong.data.DetectCategoryType.1
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public DetectCategoryType newTEnum(String str, int i) {
                return DetectCategoryType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<DetectCategoryType>() { // from class: com.p1.mobile.putong.data.DetectCategoryType.2
            @Override // com.p000p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public DetectCategoryType newTEnum(String str, int i) {
                return DetectCategoryType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        supportEnum.add("moment");
        supportEnum.add("profile");
        supportEnum.add("live");
        supportEnum.add("comment");
        supportEnum.add("login");
        supportEnum.add("greeting");
        supportEnum.add(remark);
        supportEnum.add(chat_background);
        supportEnum.add(profile_comment);
        supportEnum.add(chat_search);
        supportEnum.add(chat_common);
        supportEnum.add(chat_common_mainland);
        supportEnum.add(chat_common_overseas);
        supportEnum.add("group_chat");
        supportEnum.add(user_tag);
        supportEnum.add(group_apply);
        supportEnum.add(group_profile);
        supportEnum.add(group_search);
        supportEnum.add(contact_information);
        supportEnum.add(voice_room_name);
        _DetectCategoryType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private DetectCategoryType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<DetectCategoryType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<DetectCategoryType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, DetectCategoryType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, DetectCategoryType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static DetectCategoryType get(String str) {
        Map<String, DetectCategoryType> map = _DetectCategoryType;
        DetectCategoryType detectCategoryType = map.get(str);
        if (detectCategoryType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            detectCategoryType = integer == null ? new DetectCategoryType(str, -1) : new DetectCategoryType(str, integer.intValue());
            map.put(str, detectCategoryType);
        }
        return detectCategoryType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DetectCategoryType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<DetectCategoryType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, DetectCategoryType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static DetectCategoryType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
