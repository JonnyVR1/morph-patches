package com.p000p1.mobile.putong.core.data;

import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.data.tenum.TEnumProtobufAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e01;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MessageType extends TEnum {
    public static final TEnumJsonAdapter<MessageType> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<MessageType> PROTOBUF_ADAPTER;
    private static final Map<String, MessageType> _MessageType;
    public static final String ai_chat_analysis = "ai_chat_analysis";
    public static final String ai_chat_analysis_guide = "ai_chat_analysis_guide";
    public static final String ai_picture = "ai_picture";
    public static final String ai_picture_query_auth = "ai_picture_query_auth";
    public static final String ai_story_text = "ai_story_text";
    public static final String audio = "audio";
    public static final String call_2_buy = "call_2_buy";
    public static final String card = "card";
    public static final String chat_assistant_question = "chat_assistant_question";
    public static final String chat_gift = "chat_gift";
    public static final String chatroom_share = "chatroom_share";
    public static final String christmas_match = "christmas_match";
    public static final String common_double_title_icon_click = "common_double_title_icon_click";
    public static final String common_tip = "common_tip";
    public static final String common_tip_box = "common_tip_box";
    public static final String common_tip_box_v2 = "common_tip_box_v2";
    public static final String common_tip_list_show = "common_tip_list_show";
    public static final String contact_info = "contact_info";
    public static final String contact_info_rejection = "contact_info_rejection";
    public static final String contact_info_request = "contact_info_request";
    public static final String continuous_chat_tip = "continuous_chat_tip";
    public static final String conversation_notification = "conversation_notification";
    public static final String default_ = "default";
    public static final String exchange_picture = "exchange_picture";
    public static final String exclusive_chat_invite = "exclusive_chat_invite";
    public static final String express_heart = "express_heart";
    public static final String feedback = "feedback";
    public static final String female_unreply_reminder = "female_unreply_reminder";
    public static final String gift = "gift";
    public static final String group_invitation = "group_invitation";
    public static final String harass_alert = "harass_alert";
    public static final String heartbeat_notify = "heartbeat_notify";
    public static final String heartbeat_success = "heartbeat_success";
    public static final String heartbeat_waiting_response = "heartbeat_waiting_response";
    public static final String hide_for_fake_user = "hide_for_fake_user";
    public static final String ice_breaking = "ice_breaking";
    public static final String icebreak_qa = "icebreak_qa";
    private static final int int_audio = 6;
    private static final int int_call_2_buy = 32;
    private static final int int_card = 21;
    private static final int int_chat_gift = 49;
    private static final int int_christmas_match = 65;
    private static final int int_contact_info = 1;
    private static final int int_contact_info_rejection = 2;
    private static final int int_contact_info_request = 0;
    private static final int int_conversation_notification = 45;
    private static final int int_default_ = 3;
    private static final int int_express_heart = 14;
    private static final int int_gift = 13;
    private static final int int_ice_breaking = 41;
    private static final int int_letter = 18;
    private static final int int_live_vip_greet = 37;
    private static final int int_local_chat_greeting_tip = 58;
    private static final int int_local_chat_inc_temp_warn = 63;
    private static final int int_local_countdown_like_notify = 60;
    private static final int int_local_countdown_like_success = 61;
    private static final int int_local_create_chat_group = 44;
    private static final int int_local_friend_comment_toast = 38;
    private static final int int_local_greeting_agree_match = 56;
    private static final int int_local_greeting_match_success = 57;
    private static final int int_local_greeting_reply = 54;
    private static final int int_local_meet_reply = 64;
    private static final int int_local_real_shot_tips = 62;
    private static final int int_local_send_agreematch_notice = 55;
    private static final int int_local_tickle_tip = 36;
    private static final int int_location = 8;
    private static final int int_moment_chat = 16;
    private static final int int_moment_comment = 11;
    private static final int int_moment_gift = 50;
    private static final int int_moment_like = 12;
    private static final int int_moment_notification = 59;
    private static final int int_mood_comment = 28;
    private static final int int_mood_like = 27;
    private static final int int_mood_moment_local = 30;
    private static final int int_mood_status_local = 29;
    private static final int int_new_question = 24;
    private static final int int_new_survey = 51;
    private static final int int_oneweekcp_task = 43;
    private static final int int_operation = 39;
    private static final int int_picture = 7;
    private static final int int_picture_text_style = 52;
    private static final int int_profile_cover_comment = 20;
    private static final int int_profile_cover_like = 19;
    private static final int int_question = 10;
    private static final int int_question_answer = 25;
    private static final int int_question_result = 26;
    private static final int int_real_shot = 53;
    private static final int int_red_packet = 46;
    private static final int int_red_packet_notification = 47;
    private static final int int_red_packet_text_record = 48;
    private static final int int_reminder = 15;
    private static final int int_song = 40;
    private static final int int_soul_match_invite_upload_profile = 66;
    private static final int int_soul_test_guide = 42;
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
    public static final String liaoliao = "liaoliao";
    public static final String limit_time_picture = "limit_time_picture";
    public static final String literature = "literature";
    public static final String live_vip_greet = "live_vip_greet";
    public static final String local_add_artwork_guide = "local_add_artwork_guide";
    public static final String local_add_tags_guide = "local_add_tags_guide";
    public static final String local_ai_p2p_chat_guide = "local_ai_p2p_chat_guide";
    public static final String local_birthday_tip = "local_birthday_tip";
    public static final String local_blindbox_guide = "local_blindbox_guide";
    public static final String local_break_ice = "local_break_ice";
    public static final String local_chanllenge_tips = "local_chanllenge_tips";
    public static final String local_chat_assistant_question_new = "local_chat_assistant_question_new";
    public static final String local_chat_greeting_tip = "local_chat_greeting_tip";
    public static final String local_chat_inc_temp_warn = "local_chat_inc_temp_warn";
    public static final String local_city_centre_greet = "local_city_centre_greet";
    public static final String local_countdown_like_notify = "local_countdown_like_notify";
    public static final String local_countdown_like_success = "local_countdown_like_success";
    public static final String local_create_chat_group = "local_create_chat_group";
    public static final String local_dynamic_greeting_agree_match = "local_dynamic_greeting_agree_match";
    public static final String local_friend_active_remind_female = "local_friend_active_remind_female";
    public static final String local_friend_comment_toast = "local_friend_comment_toast";
    public static final String local_greet_receive_match_tip = "local_greet_receive_match_tip";
    public static final String local_greet_send_notice = "local_greet_send_notice";
    public static final String local_greeting_agree_match = "local_greeting_agree_match";
    public static final String local_greeting_match_success = "local_greeting_match_success";
    public static final String local_greeting_reply = "local_greeting_reply";
    public static final String local_heart_beat_lock_tip = "local_heart_beat_lock_tip";
    public static final String local_ideal_enquiry = "local_ideal_enquiry";
    public static final String local_intl_prompt_message_type = "local_intl_prompt_message_type";
    public static final String local_intl_read_receipts_guide = "local_intl_read_receipts_guide";
    public static final String local_invitation_for_authentication = "local_invitation_for_authentication";
    public static final String local_long_time_no_see = "local_long_time_no_see";
    public static final String local_love_buzz_break_ice = "local_love_buzz_break_ice";
    public static final String local_love_letter_guide = "local_love_letter_guide";
    public static final String local_match_ice_break = "local_match_ice_break";
    public static final String local_meet_reply = "local_meet_reply";
    public static final String local_moment_post_guide = "local_moment_post_guide";
    public static final String local_normal_tips = "local_normal_tips";
    public static final String local_o_diamond_visitor_guide = "local_o_diamond_visitor_guide";
    public static final String local_pic_cert_guide = "local_pic_cert_guide";
    public static final String local_pin_chat_normal_guide = "local_pin_chat_normal_guide";
    public static final String local_platinum_pin_guide = "local_platinum_pin_guide";
    public static final String local_push_switch = "local_push_switch";
    public static final String local_push_switch_plus = "local_push_switch_plus";
    public static final String local_real_shot_tips = "local_real_shot_tips";
    public static final String local_send_agreematch_notice = "local_send_agreematch_notice";
    public static final String local_send_artwork_text = "local_send_artwork_text";
    public static final String local_send_tags_text = "local_send_tags_text";
    public static final String local_soul_match_like = "local_soul_match_like";
    public static final String local_soul_match_profile_limit = "local_soul_match_profile_limit";
    public static final String local_soul_match_tags = "local_soul_match_tags";
    public static final String local_tickle_tip = "local_tickle_tip";
    public static final String local_user_moment_message = "local_user_moment_message";
    public static final String local_ux_questionnaire = "local_ux_questionnaire";
    public static final String local_ux_questionnaire_tip = "local_ux_questionnaire_tip";
    public static final String local_visitor_hide_footprint = "local_visitor_hide_footprint";
    public static final String local_wechat_notify_guide = "local_wechat_notify_guide";
    public static final String location = "location";
    public static final String love_letter = "love_letter";
    public static final String marriage_prologue = "marriage_prologue";
    public static final String middle_text = "middle_text";
    public static final String mm_task = "mm_task";
    public static final String moment_chat = "moment_chat";
    public static final String moment_comment = "moment_comment";
    public static final String moment_gift = "moment_gift";
    public static final String moment_inspire = "moment_inspire";
    public static final String moment_like = "moment_like";
    public static final String moment_notification = "moment_notification";
    public static final String moment_reference = "moment_reference";
    public static final String moment_user_state = "moment_user_state";
    public static final String monetization_buy = "monetization_buy";
    public static final String monetization_buy_v2 = "monetization_buy_v2";
    public static final String monetization_pending_payment_guidance = "monetization_pending_payment_guidance";
    public static final String mood_comment = "mood_comment";
    public static final String mood_like = "mood_like";
    public static final String mood_moment_local = "mood_moment_local";
    public static final String mood_status_local = "mood_status_local";
    public static final String new_question = "new_question";
    public static final String new_survey = "new_survey";
    public static final String normal_card = "normal_card";
    public static final String oneweekcp_task = "oneweekcp_task";
    public static final String operation = "operation";
    public static final String picture = "picture";
    public static final String picture_compliment = "picture_compliment";
    public static final String picture_text_deeplink = "picture_text_deeplink";
    public static final String picture_text_style = "picture_text_style";
    public static final String profile_cover_comment = "profile_cover_comment";
    public static final String profile_cover_like = "profile_cover_like";
    public static final String profile_like = "profile_like";
    public static final String prologue = "prologue";
    public static final String question = "question";
    public static final String question_answer = "question_answer";
    public static final String question_result = "question_result";
    public static final String real_shot = "real_shot";
    public static final String red_packet = "red_packet";
    public static final String red_packet_notification = "red_packet_notification";
    public static final String red_packet_text_record = "red_packet_text_record";
    public static final String reminder = "reminder";
    public static final String setting_event = "setting_event";
    public static final String song = "song";
    public static final String soul_match_invite_upload_profile = "soul_match_invite_upload_profile";
    public static final String soul_test_guide = "soul_test_guide";
    public static final String soulmate_apply = "soulmate_apply";
    public static final String state_comment = "state_comment";
    public static final String state_like = "state_like";
    public static final String sticker = "sticker";
    public static final String stripes = "stripes";
    public static final String stripes_without_button = "stripes_without_button";
    protected static HashSet<String> supportEnum = null;
    public static final String survey = "survey";
    public static final String system_reminder = "system_reminder";
    public static final String tacit_test = "tacit_test";
    public static final String tag_guide = "tag_guide";
    public static final String tantan_verify_toast = "tantan_verify_toast";
    public static final String text = "text";
    public static final String tickle = "tickle";
    public static final String two_sides_different_tip = "two_sides_different_tip";
    public static final String understand_share = "understand_share";
    public static final String unknown_ = "unknown_";
    public static final String user_info_card = "user_info_card";
    public static final String video = "video";
    public static final String voice_call = "voice_call";
    public static final String voice_call_invitation = "voice_call_invitation";
    public static final String wanwan_invite = "wanwan_invite";
    public static final String wanwan_tip = "wanwan_tip";
    public static final String wechat_block_toast = "wechat_block_toast";
    public static final String wooden_fish = "wooden_fish";
    public static final String zuju_offline = "zuju_offline";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<MessageType> tEnumJsonAdapter = new TEnumJsonAdapter<MessageType>() { // from class: com.p1.mobile.putong.core.data.MessageType.1
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public MessageType m14295newTEnum(String str, int i) {
                return MessageType.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<MessageType>() { // from class: com.p1.mobile.putong.core.data.MessageType.2
            /* JADX INFO: renamed from: newTEnum, reason: merged with bridge method [inline-methods] */
            public MessageType m14296newTEnum(String str, int i) {
                return MessageType.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", int_unknown_);
        tEnumJsonAdapter.addExtJsonValue(contact_info_request, int_contact_info_request);
        tEnumJsonAdapter.addExtJsonValue(contact_info, 1);
        tEnumJsonAdapter.addExtJsonValue(contact_info_rejection, 2);
        tEnumJsonAdapter.addExtJsonValue("default", 3);
        tEnumJsonAdapter.addExtJsonValue("text", int_text);
        tEnumJsonAdapter.addExtJsonValue("video", 5);
        tEnumJsonAdapter.addExtJsonValue("audio", int_audio);
        tEnumJsonAdapter.addExtJsonValue("picture", int_picture);
        tEnumJsonAdapter.addExtJsonValue(location, int_location);
        tEnumJsonAdapter.addExtJsonValue("sticker", int_sticker);
        tEnumJsonAdapter.addExtJsonValue("question", 10);
        tEnumJsonAdapter.addExtJsonValue(moment_comment, int_moment_comment);
        tEnumJsonAdapter.addExtJsonValue(moment_like, int_moment_like);
        tEnumJsonAdapter.addExtJsonValue("gift", int_gift);
        tEnumJsonAdapter.addExtJsonValue(express_heart, int_express_heart);
        tEnumJsonAdapter.addExtJsonValue("reminder", int_reminder);
        tEnumJsonAdapter.addExtJsonValue(moment_chat, int_moment_chat);
        tEnumJsonAdapter.addExtJsonValue(soulmate_apply, int_soulmate_apply);
        tEnumJsonAdapter.addExtJsonValue("letter", int_letter);
        tEnumJsonAdapter.addExtJsonValue(profile_cover_like, int_profile_cover_like);
        tEnumJsonAdapter.addExtJsonValue(profile_cover_comment, int_profile_cover_comment);
        tEnumJsonAdapter.addExtJsonValue("card", int_card);
        tEnumJsonAdapter.addExtJsonValue("survey", int_survey);
        tEnumJsonAdapter.addExtJsonValue(voice_call, int_voice_call);
        tEnumJsonAdapter.addExtJsonValue(new_question, int_new_question);
        tEnumJsonAdapter.addExtJsonValue(question_answer, int_question_answer);
        tEnumJsonAdapter.addExtJsonValue(question_result, int_question_result);
        tEnumJsonAdapter.addExtJsonValue(mood_like, int_mood_like);
        tEnumJsonAdapter.addExtJsonValue(mood_comment, int_mood_comment);
        tEnumJsonAdapter.addExtJsonValue(mood_status_local, int_mood_status_local);
        tEnumJsonAdapter.addExtJsonValue(mood_moment_local, int_mood_moment_local);
        tEnumJsonAdapter.addExtJsonValue(tantan_verify_toast, int_tantan_verify_toast);
        tEnumJsonAdapter.addExtJsonValue(call_2_buy, int_call_2_buy);
        tEnumJsonAdapter.addExtJsonValue(voice_call_invitation, int_voice_call_invitation);
        tEnumJsonAdapter.addExtJsonValue(wechat_block_toast, int_wechat_block_toast);
        tEnumJsonAdapter.addExtJsonValue(tickle, int_tickle);
        tEnumJsonAdapter.addExtJsonValue(local_tickle_tip, int_local_tickle_tip);
        tEnumJsonAdapter.addExtJsonValue(live_vip_greet, int_live_vip_greet);
        tEnumJsonAdapter.addExtJsonValue(local_friend_comment_toast, int_local_friend_comment_toast);
        tEnumJsonAdapter.addExtJsonValue(operation, int_operation);
        tEnumJsonAdapter.addExtJsonValue(song, int_song);
        tEnumJsonAdapter.addExtJsonValue(ice_breaking, int_ice_breaking);
        tEnumJsonAdapter.addExtJsonValue(soul_test_guide, int_soul_test_guide);
        tEnumJsonAdapter.addExtJsonValue(oneweekcp_task, int_oneweekcp_task);
        tEnumJsonAdapter.addExtJsonValue(local_create_chat_group, int_local_create_chat_group);
        tEnumJsonAdapter.addExtJsonValue(conversation_notification, int_conversation_notification);
        tEnumJsonAdapter.addExtJsonValue(red_packet, int_red_packet);
        tEnumJsonAdapter.addExtJsonValue(red_packet_notification, int_red_packet_notification);
        tEnumJsonAdapter.addExtJsonValue(red_packet_text_record, int_red_packet_text_record);
        tEnumJsonAdapter.addExtJsonValue(chat_gift, int_chat_gift);
        tEnumJsonAdapter.addExtJsonValue(moment_gift, 50);
        tEnumJsonAdapter.addExtJsonValue(new_survey, int_new_survey);
        tEnumJsonAdapter.addExtJsonValue(picture_text_style, int_picture_text_style);
        tEnumJsonAdapter.addExtJsonValue(real_shot, int_real_shot);
        tEnumJsonAdapter.addExtJsonValue(local_greeting_reply, int_local_greeting_reply);
        tEnumJsonAdapter.addExtJsonValue(local_send_agreematch_notice, 55);
        tEnumJsonAdapter.addExtJsonValue(local_greeting_agree_match, int_local_greeting_agree_match);
        tEnumJsonAdapter.addExtJsonValue(local_greeting_match_success, int_local_greeting_match_success);
        tEnumJsonAdapter.addExtJsonValue(local_chat_greeting_tip, int_local_chat_greeting_tip);
        tEnumJsonAdapter.addExtJsonValue(moment_notification, int_moment_notification);
        tEnumJsonAdapter.addExtJsonValue(local_countdown_like_notify, int_local_countdown_like_notify);
        tEnumJsonAdapter.addExtJsonValue(local_countdown_like_success, int_local_countdown_like_success);
        tEnumJsonAdapter.addExtJsonValue(local_real_shot_tips, int_local_real_shot_tips);
        tEnumJsonAdapter.addExtJsonValue(local_chat_inc_temp_warn, int_local_chat_inc_temp_warn);
        tEnumJsonAdapter.addExtJsonValue(local_meet_reply, int_local_meet_reply);
        tEnumJsonAdapter.addExtJsonValue(christmas_match, int_christmas_match);
        tEnumJsonAdapter.addExtJsonValue(soul_match_invite_upload_profile, int_soul_match_invite_upload_profile);
        supportEnum.add(contact_info_request);
        supportEnum.add(contact_info);
        supportEnum.add(contact_info_rejection);
        supportEnum.add("default");
        supportEnum.add("text");
        supportEnum.add("video");
        supportEnum.add("audio");
        supportEnum.add("picture");
        supportEnum.add(location);
        supportEnum.add("sticker");
        supportEnum.add("question");
        supportEnum.add(moment_comment);
        supportEnum.add(moment_like);
        supportEnum.add("gift");
        supportEnum.add(express_heart);
        supportEnum.add("reminder");
        supportEnum.add(moment_chat);
        supportEnum.add(soulmate_apply);
        supportEnum.add("letter");
        supportEnum.add(profile_cover_like);
        supportEnum.add(profile_cover_comment);
        supportEnum.add("card");
        supportEnum.add("survey");
        supportEnum.add(voice_call);
        supportEnum.add(new_question);
        supportEnum.add(question_answer);
        supportEnum.add(question_result);
        supportEnum.add(mood_like);
        supportEnum.add(mood_comment);
        supportEnum.add(mood_status_local);
        supportEnum.add(mood_moment_local);
        supportEnum.add(tantan_verify_toast);
        supportEnum.add(call_2_buy);
        supportEnum.add(voice_call_invitation);
        supportEnum.add(wechat_block_toast);
        supportEnum.add(tickle);
        supportEnum.add(local_tickle_tip);
        supportEnum.add(live_vip_greet);
        supportEnum.add(local_friend_comment_toast);
        supportEnum.add(operation);
        supportEnum.add(song);
        supportEnum.add(ice_breaking);
        supportEnum.add(soul_test_guide);
        supportEnum.add(oneweekcp_task);
        supportEnum.add(local_create_chat_group);
        supportEnum.add(conversation_notification);
        supportEnum.add(red_packet);
        supportEnum.add(red_packet_notification);
        supportEnum.add(red_packet_text_record);
        supportEnum.add(chat_gift);
        supportEnum.add(moment_gift);
        supportEnum.add(new_survey);
        supportEnum.add(picture_text_style);
        supportEnum.add(real_shot);
        supportEnum.add(local_greeting_reply);
        supportEnum.add(local_send_agreematch_notice);
        supportEnum.add(local_greeting_agree_match);
        supportEnum.add(local_greeting_match_success);
        supportEnum.add(local_chat_greeting_tip);
        supportEnum.add(moment_notification);
        supportEnum.add(local_countdown_like_notify);
        supportEnum.add(local_countdown_like_success);
        supportEnum.add(local_real_shot_tips);
        supportEnum.add(local_chat_inc_temp_warn);
        supportEnum.add(local_meet_reply);
        supportEnum.add(christmas_match);
        supportEnum.add(soul_match_invite_upload_profile);
        supportEnum.add(local_normal_tips);
        supportEnum.add("literature");
        supportEnum.add(state_like);
        supportEnum.add(state_comment);
        supportEnum.add(feedback);
        supportEnum.add(local_user_moment_message);
        supportEnum.add(wanwan_invite);
        supportEnum.add(group_invitation);
        supportEnum.add(local_greet_send_notice);
        supportEnum.add(local_greet_receive_match_tip);
        supportEnum.add(heartbeat_notify);
        supportEnum.add("heartbeat_waiting_response");
        supportEnum.add(heartbeat_success);
        supportEnum.add(understand_share);
        supportEnum.add(local_soul_match_tags);
        supportEnum.add(local_soul_match_like);
        supportEnum.add(local_soul_match_profile_limit);
        supportEnum.add("liaoliao");
        supportEnum.add("tacit_test");
        supportEnum.add(stripes);
        supportEnum.add(normal_card);
        supportEnum.add(user_info_card);
        supportEnum.add(local_break_ice);
        supportEnum.add(wanwan_tip);
        supportEnum.add(stripes_without_button);
        supportEnum.add(local_push_switch);
        supportEnum.add(setting_event);
        supportEnum.add(tag_guide);
        supportEnum.add(chatroom_share);
        supportEnum.add(profile_like);
        supportEnum.add(local_moment_post_guide);
        supportEnum.add(exclusive_chat_invite);
        supportEnum.add(common_tip);
        supportEnum.add(common_tip_list_show);
        supportEnum.add(zuju_offline);
        supportEnum.add(picture_text_deeplink);
        supportEnum.add(local_chanllenge_tips);
        supportEnum.add(moment_reference);
        supportEnum.add(local_dynamic_greeting_agree_match);
        supportEnum.add(local_love_buzz_break_ice);
        supportEnum.add(local_add_tags_guide);
        supportEnum.add(local_add_artwork_guide);
        supportEnum.add(local_send_tags_text);
        supportEnum.add(local_send_artwork_text);
        supportEnum.add(local_match_ice_break);
        supportEnum.add(middle_text);
        supportEnum.add(common_double_title_icon_click);
        supportEnum.add(local_birthday_tip);
        supportEnum.add(wooden_fish);
        supportEnum.add(moment_user_state);
        supportEnum.add(moment_inspire);
        supportEnum.add(monetization_buy);
        supportEnum.add(exchange_picture);
        supportEnum.add(ai_story_text);
        supportEnum.add(chat_assistant_question);
        supportEnum.add(two_sides_different_tip);
        supportEnum.add(hide_for_fake_user);
        supportEnum.add(local_friend_active_remind_female);
        supportEnum.add(female_unreply_reminder);
        supportEnum.add(local_ai_p2p_chat_guide);
        supportEnum.add(ai_picture);
        supportEnum.add(harass_alert);
        supportEnum.add(local_heart_beat_lock_tip);
        supportEnum.add(continuous_chat_tip);
        supportEnum.add(system_reminder);
        supportEnum.add(ai_picture_query_auth);
        supportEnum.add(local_chat_assistant_question_new);
        supportEnum.add(limit_time_picture);
        supportEnum.add(local_pic_cert_guide);
        supportEnum.add(local_platinum_pin_guide);
        supportEnum.add(local_long_time_no_see);
        supportEnum.add(marriage_prologue);
        supportEnum.add(local_blindbox_guide);
        supportEnum.add(local_city_centre_greet);
        supportEnum.add(local_visitor_hide_footprint);
        supportEnum.add(monetization_buy_v2);
        supportEnum.add(local_intl_prompt_message_type);
        supportEnum.add(common_tip_box);
        supportEnum.add(local_wechat_notify_guide);
        supportEnum.add(local_o_diamond_visitor_guide);
        supportEnum.add(local_ux_questionnaire);
        supportEnum.add(local_ux_questionnaire_tip);
        supportEnum.add(local_ideal_enquiry);
        supportEnum.add(local_love_letter_guide);
        supportEnum.add(love_letter);
        supportEnum.add(local_invitation_for_authentication);
        supportEnum.add(common_tip_box_v2);
        supportEnum.add(icebreak_qa);
        supportEnum.add(monetization_pending_payment_guidance);
        supportEnum.add(ai_chat_analysis);
        supportEnum.add(mm_task);
        supportEnum.add("prologue");
        supportEnum.add(local_push_switch_plus);
        supportEnum.add(ai_chat_analysis_guide);
        supportEnum.add(local_intl_read_receipts_guide);
        supportEnum.add(local_pin_chat_normal_guide);
        supportEnum.add("picture_compliment");
        _MessageType = Collections.synchronizedMap(new e01());
    }

    @Deprecated
    private MessageType(String str, int i) {
        super(str, i);
        String str2 = ((TEnum) this).name;
        if (str2 == null || str2.length() == 0) {
            ((TEnum) this).name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                ((TEnum) this).name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<MessageType> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MessageType> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, MessageType> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, MessageType> entry : map.entrySet()) {
            e01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return e01Var;
    }

    public static MessageType get(String str) {
        Map<String, MessageType> map = _MessageType;
        MessageType messageType = map.get(str);
        if (messageType == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            messageType = integer == null ? new MessageType(str, int_unknown_) : new MessageType(str, integer.intValue());
            map.put(str, messageType);
        }
        return messageType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MessageType getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<MessageType> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer numValueOf : list) {
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(int_unknown_);
            }
            arrayList.add(get(numValueOf.intValue()));
        }
        return arrayList;
    }

    public static Map<String, MessageType> oldEnumCovertMap(Map<String, Integer> map) {
        e01 e01Var = new e01();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(Integer.valueOf(int_unknown_));
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
        return !supportEnum.contains(((TEnum) this).name);
    }

    private static MessageType get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
