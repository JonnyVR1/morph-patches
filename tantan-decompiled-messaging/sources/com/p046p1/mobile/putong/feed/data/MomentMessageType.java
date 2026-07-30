package com.p046p1.mobile.putong.feed.data;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.e01;

/* JADX INFO: loaded from: classes12.dex */
public class MomentMessageType extends TEnum {
    public static final TEnumJsonAdapter<MomentMessageType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MomentMessageType> PROTOBUF_ADAPTER;
    private static final Map<String, MomentMessageType> _MomentMessageType;
    public static final String audio = "audio";
    public static final String call_2_buy = "call_2_buy";
    public static final String card = "card";
    public static final String contact_info = "contact_info";
    public static final String contact_info_rejection = "contact_info_rejection";
    public static final String contact_info_request = "contact_info_request";
    public static final String default_ = "default";
    public static final String express_heart = "express_heart";
    public static final String gift = "gift";
    private static final int int_audio = 6;
    private static final int int_call_2_buy = 32;
    private static final int int_card = 21;
    private static final int int_contact_info = 1;
    private static final int int_contact_info_rejection = 2;
    private static final int int_contact_info_request = 0;
    private static final int int_default_ = 3;
    private static final int int_express_heart = 14;
    private static final int int_gift = 13;
    private static final int int_letter = 18;
    private static final int int_live_vip_greet = 37;
    private static final int int_local_friend_comment_toast = 38;
    private static final int int_local_tickle_tip = 36;
    private static final int int_location = 8;
    private static final int int_moment_chat = 16;
    private static final int int_moment_comment = 11;
    private static final int int_moment_like = 12;
    private static final int int_mood_comment = 28;
    private static final int int_mood_like = 27;
    private static final int int_mood_moment_local = 30;
    private static final int int_mood_status_local = 29;
    private static final int int_new_question = 24;
    private static final int int_picture = 7;
    private static final int int_profile_cover_comment = 20;
    private static final int int_profile_cover_like = 19;
    private static final int int_question = 10;
    private static final int int_question_answer = 25;
    private static final int int_question_result = 26;
    private static final int int_reminder = 15;
    private static final int int_soulmate_apply = 17;
    private static final int int_sticker = 9;
    private static final int int_survey = 22;
    private static final int int_tantan_verify_toast = 31;
    private static final int int_text = 4;
    private static final int int_tickle = 35;
    private static final int int_unknown_ = -1;
    private static final int int_video = 5;
    private static final int int_voice_call = 23;
    private static final int int_voice_call_invitation = 33;
    private static final int int_wechat_block_toast = 34;
    public static final String letter = "letter";
    public static final String live_vip_greet = "live_vip_greet";
    public static final String local_friend_comment_toast = "local_friend_comment_toast";
    public static final String local_tickle_tip = "local_tickle_tip";
    public static final String location = "location";
    public static final String moment_chat = "moment_chat";
    public static final String moment_comment = "moment_comment";
    public static final String moment_like = "moment_like";
    public static final String mood_comment = "mood_comment";
    public static final String mood_like = "mood_like";
    public static final String mood_moment_local = "mood_moment_local";
    public static final String mood_status_local = "mood_status_local";
    public static final String new_question = "new_question";
    public static final String picture = "picture";
    public static final String profile_cover_comment = "profile_cover_comment";
    public static final String profile_cover_like = "profile_cover_like";
    public static final String question = "question";
    public static final String question_answer = "question_answer";
    public static final String question_result = "question_result";
    public static final String reminder = "reminder";
    public static final String soulmate_apply = "soulmate_apply";
    public static final String sticker = "sticker";
    protected static HashSet<String> supportEnum = null;
    public static final String survey = "survey";
    public static final String tantan_verify_toast = "tantan_verify_toast";
    public static final String text = "text";
    public static final String tickle = "tickle";
    public static final String unknown_ = "unknown_";
    public static final String video = "video";
    public static final String voice_call = "voice_call";
    public static final String voice_call_invitation = "voice_call_invitation";
    public static final String wechat_block_toast = "wechat_block_toast";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MomentMessageType> tEnumJsonAdapter = new TEnumJsonAdapter<MomentMessageType>() { // from class: com.p1.mobile.putong.feed.data.MomentMessageType.1
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public MomentMessageType newTEnum(String str, int i) {
                return MomentMessageType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MomentMessageType>() { // from class: com.p1.mobile.putong.feed.data.MomentMessageType.2
            @Override // com.p046p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public MomentMessageType newTEnum(String str, int i) {
                return MomentMessageType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("contact_info_request", 0);
        tEnumJsonAdapter.addExtJsonValue("contact_info", 1);
        tEnumJsonAdapter.addExtJsonValue("contact_info_rejection", 2);
        tEnumJsonAdapter.addExtJsonValue("default", 3);
        tEnumJsonAdapter.addExtJsonValue("text", 4);
        tEnumJsonAdapter.addExtJsonValue("video", 5);
        tEnumJsonAdapter.addExtJsonValue("audio", 6);
        tEnumJsonAdapter.addExtJsonValue("picture", 7);
        tEnumJsonAdapter.addExtJsonValue("location", 8);
        tEnumJsonAdapter.addExtJsonValue("sticker", 9);
        tEnumJsonAdapter.addExtJsonValue("question", 10);
        tEnumJsonAdapter.addExtJsonValue("moment_comment", 11);
        tEnumJsonAdapter.addExtJsonValue("moment_like", 12);
        tEnumJsonAdapter.addExtJsonValue("gift", 13);
        tEnumJsonAdapter.addExtJsonValue("express_heart", 14);
        tEnumJsonAdapter.addExtJsonValue("reminder", 15);
        tEnumJsonAdapter.addExtJsonValue("moment_chat", 16);
        tEnumJsonAdapter.addExtJsonValue("soulmate_apply", 17);
        tEnumJsonAdapter.addExtJsonValue("letter", 18);
        tEnumJsonAdapter.addExtJsonValue("profile_cover_like", 19);
        tEnumJsonAdapter.addExtJsonValue("profile_cover_comment", 20);
        tEnumJsonAdapter.addExtJsonValue("card", 21);
        tEnumJsonAdapter.addExtJsonValue("survey", 22);
        tEnumJsonAdapter.addExtJsonValue("voice_call", 23);
        tEnumJsonAdapter.addExtJsonValue("new_question", 24);
        tEnumJsonAdapter.addExtJsonValue("question_answer", 25);
        tEnumJsonAdapter.addExtJsonValue("question_result", 26);
        tEnumJsonAdapter.addExtJsonValue("mood_like", 27);
        tEnumJsonAdapter.addExtJsonValue("mood_comment", 28);
        tEnumJsonAdapter.addExtJsonValue("mood_status_local", 29);
        tEnumJsonAdapter.addExtJsonValue("mood_moment_local", 30);
        tEnumJsonAdapter.addExtJsonValue("tantan_verify_toast", 31);
        tEnumJsonAdapter.addExtJsonValue("call_2_buy", 32);
        tEnumJsonAdapter.addExtJsonValue("voice_call_invitation", 33);
        tEnumJsonAdapter.addExtJsonValue("wechat_block_toast", 34);
        tEnumJsonAdapter.addExtJsonValue("tickle", 35);
        tEnumJsonAdapter.addExtJsonValue("local_tickle_tip", 36);
        tEnumJsonAdapter.addExtJsonValue("live_vip_greet", 37);
        tEnumJsonAdapter.addExtJsonValue("local_friend_comment_toast", 38);
        supportEnum.add("contact_info_request");
        supportEnum.add("contact_info");
        supportEnum.add("contact_info_rejection");
        supportEnum.add("default");
        supportEnum.add("text");
        supportEnum.add("video");
        supportEnum.add("audio");
        supportEnum.add("picture");
        supportEnum.add("location");
        supportEnum.add("sticker");
        supportEnum.add("question");
        supportEnum.add("moment_comment");
        supportEnum.add("moment_like");
        supportEnum.add("gift");
        supportEnum.add("express_heart");
        supportEnum.add("reminder");
        supportEnum.add("moment_chat");
        supportEnum.add("soulmate_apply");
        supportEnum.add("letter");
        supportEnum.add("profile_cover_like");
        supportEnum.add("profile_cover_comment");
        supportEnum.add("card");
        supportEnum.add("survey");
        supportEnum.add("voice_call");
        supportEnum.add("new_question");
        supportEnum.add("question_answer");
        supportEnum.add("question_result");
        supportEnum.add("mood_like");
        supportEnum.add("mood_comment");
        supportEnum.add("mood_status_local");
        supportEnum.add("mood_moment_local");
        supportEnum.add("tantan_verify_toast");
        supportEnum.add("call_2_buy");
        supportEnum.add("voice_call_invitation");
        supportEnum.add("wechat_block_toast");
        supportEnum.add("tickle");
        supportEnum.add("local_tickle_tip");
        supportEnum.add("live_vip_greet");
        supportEnum.add("local_friend_comment_toast");
        _MomentMessageType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private MomentMessageType(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MomentMessageType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MomentMessageType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MomentMessageType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, MomentMessageType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static MomentMessageType get(String str) {
        Map<String, MomentMessageType> map = _MomentMessageType;
        MomentMessageType momentMessageType = map.get(str);
        if (momentMessageType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            momentMessageType = integer == null ? new MomentMessageType(str, -1) : new MomentMessageType(str, integer.intValue());
            map.put(str, momentMessageType);
        }
        return momentMessageType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MomentMessageType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MomentMessageType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MomentMessageType> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static MomentMessageType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
