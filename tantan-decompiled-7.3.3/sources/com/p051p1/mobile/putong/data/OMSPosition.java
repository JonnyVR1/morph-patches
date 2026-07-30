package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class OMSPosition extends TEnum {
    public static final TEnumJsonAdapter<OMSPosition> JSON_ADAPTER;
    public static final TEnumProtobufAdapter<OMSPosition> PROTOBUF_ADAPTER;
    private static final Map<String, OMSPosition> _OMSPosition;
    private static final int int_me_privilege_quickchat_button_renew_title = 50;
    private static final int int_me_privilege_quickchat_button_title = 51;
    private static final int int_me_privilege_quickchat_card_subtitle = 45;
    private static final int int_me_privilege_see_button_renew_title = 49;
    private static final int int_me_privilege_see_button_title = 48;
    private static final int int_me_privilege_see_card_subtitle = 44;
    private static final int int_me_privilege_svip_advancefilter = 71;
    private static final int int_me_privilege_svip_advancefilter_pop = 72;
    private static final int int_me_privilege_svip_boost = 69;
    private static final int int_me_privilege_svip_boost_pop = 70;
    private static final int int_me_privilege_svip_letter = 63;
    private static final int int_me_privilege_svip_letter_pop = 64;
    private static final int int_me_privilege_svip_like = 59;
    private static final int int_me_privilege_svip_like_pop = 60;
    private static final int int_me_privilege_svip_likeme = 57;
    private static final int int_me_privilege_svip_likeme_pop = 58;
    private static final int int_me_privilege_svip_peek = 83;
    private static final int int_me_privilege_svip_peek_pop = 84;
    private static final int int_me_privilege_svip_privacy = 75;
    private static final int int_me_privilege_svip_privacy_pop = 76;
    private static final int int_me_privilege_svip_quickchat = 61;
    private static final int int_me_privilege_svip_quickchat_pop = 62;
    private static final int int_me_privilege_svip_read = 73;
    private static final int int_me_privilege_svip_read_pop = 74;
    private static final int int_me_privilege_svip_roaming = 81;
    private static final int int_me_privilege_svip_roaming_pop = 82;
    private static final int int_me_privilege_svip_superlike = 65;
    private static final int int_me_privilege_svip_superlike_pop = 66;
    private static final int int_me_privilege_svip_svip = 85;
    private static final int int_me_privilege_svip_svip_pop = 86;
    private static final int int_me_privilege_svip_undo = 79;
    private static final int int_me_privilege_svip_undo_pop = 80;
    private static final int int_me_privilege_svip_unlockmylikes = 67;
    private static final int int_me_privilege_svip_unlockmylikes_pop = 68;
    private static final int int_me_privilege_svip_unmatch = 77;
    private static final int int_me_privilege_svip_unmatch_pop = 78;
    private static final int int_me_privilege_vip_button_renew_title = 47;
    private static final int int_me_privilege_vip_button_title = 46;
    private static final int int_me_privilege_vip_card_subtitle = 43;
    private static final int int_me_privilege_vip_like = 41;
    private static final int int_me_privilege_vip_like_pop = 42;
    private static final int int_me_privilege_vip_roaming = 39;
    private static final int int_me_privilege_vip_roaming_pop = 40;
    private static final int int_me_privilege_vip_superlike = 35;
    private static final int int_me_privilege_vip_superlike_pop = 36;
    private static final int int_me_privilege_vip_undo = 37;
    private static final int int_me_privilege_vip_undo_pop = 38;
    private static final int int_me_privilege_vip_vip = 33;
    private static final int int_me_privilege_vip_vip_pop = 34;
    private static final int int_p_suggest_users_home_view = 0;
    private static final int int_quickchat_purchase_button_alipay = 12;
    private static final int int_quickchat_purchase_button_wechat = 13;
    private static final int int_quickchat_purchase_header = 6;
    private static final int int_quickchat_searching = 18;
    private static final int int_quickchat_wait_with_count = 19;
    private static final int int_quickchat_wait_without_count = 20;
    private static final int int_see_bubble_conversation_tab_new_likes = 17;
    private static final int int_see_bubble_conversation_tab_total_likes = 16;
    private static final int int_see_entrance_conversation_tab = 14;
    private static final int int_see_entrance_conversation_tab_new_likes = 54;
    private static final int int_see_entrance_conversation_tab_total_likes = 53;
    private static final int int_see_entrance_conversation_tab_without_likes = 55;
    private static final int int_see_entrance_me_tab = 15;
    private static final int int_see_purchase_button_alipay = 11;
    private static final int int_see_purchase_button_wechat = 10;
    private static final int int_see_purchase_header = 5;
    private static final int int_superlike_letter_letter = 102;
    private static final int int_superlike_letter_letter_bottom = 104;
    private static final int int_superlike_letter_page = 105;
    private static final int int_superlike_letter_page_feed = 108;
    private static final int int_superlike_letter_page_news = 109;
    private static final int int_superlike_letter_page_superlike = 106;
    private static final int int_superlike_letter_page_unlike = 107;
    private static final int int_superlike_letter_superlike = 103;
    private static final int int_svip_purchase_advancefilter = 94;
    private static final int int_svip_purchase_boost = 93;
    private static final int int_svip_purchase_letter = 90;
    private static final int int_svip_purchase_like = 88;
    private static final int int_svip_purchase_likeme = 87;
    private static final int int_svip_purchase_peek = 100;
    private static final int int_svip_purchase_privacy = 96;
    private static final int int_svip_purchase_quickchat = 89;
    private static final int int_svip_purchase_read = 95;
    private static final int int_svip_purchase_roaming = 99;
    private static final int int_svip_purchase_superlike = 91;
    private static final int int_svip_purchase_svip = 101;
    private static final int int_svip_purchase_undo = 98;
    private static final int int_svip_purchase_unlockmylikes = 92;
    private static final int int_svip_purchase_unmatch = 97;
    private static final int int_unknown_ = -1;
    private static final int int_vip_purchase_button_alipay = 8;
    private static final int int_vip_purchase_button_appstore = 7;
    private static final int int_vip_purchase_button_wechat = 9;
    private static final int int_vip_purchase_like = 3;
    private static final int int_vip_purchase_renew_vip = 56;
    private static final int int_vip_purchase_roaming = 4;
    private static final int int_vip_purchase_superlike = 1;
    private static final int int_vip_purchase_undo = 2;
    private static final int int_vip_purchase_vip = 52;
    private static final int int_wallet_privilege_boost_desc = 32;
    private static final int int_wallet_privilege_quickchatPeek_desc = 30;
    private static final int int_wallet_privilege_quickchat_desc = 31;
    private static final int int_wallet_privilege_superlike_desc = 29;
    private static final int int_wallet_recharge_balance = 22;
    private static final int int_wallet_recharge_boost = 26;
    private static final int int_wallet_recharge_button = 28;
    private static final int int_wallet_recharge_hint = 27;
    private static final int int_wallet_recharge_quickchat = 25;
    private static final int int_wallet_recharge_quickchat_peek = 24;
    private static final int int_wallet_recharge_superlike = 23;
    private static final int int_wallet_recharge_title = 21;
    public static final String me_privilege_quickchat_button_renew_title = "me_privilege_quickchat_button_renew_title";
    public static final String me_privilege_quickchat_button_title = "me_privilege_quickchat_button_title";
    public static final String me_privilege_quickchat_card_subtitle = "me_privilege_quickchat_card_subtitle";
    public static final String me_privilege_see_button_renew_title = "me_privilege_see_button_renew_title";
    public static final String me_privilege_see_button_title = "me_privilege_see_button_title";
    public static final String me_privilege_see_card_subtitle = "me_privilege_see_card_subtitle";
    public static final String me_privilege_svip_advancefilter = "me_privilege_svip_advancefilter";
    public static final String me_privilege_svip_advancefilter_pop = "me_privilege_svip_advancefilter_pop";
    public static final String me_privilege_svip_boost = "me_privilege_svip_boost";
    public static final String me_privilege_svip_boost_pop = "me_privilege_svip_boost_pop";
    public static final String me_privilege_svip_letter = "me_privilege_svip_letter";
    public static final String me_privilege_svip_letter_pop = "me_privilege_svip_letter_pop";
    public static final String me_privilege_svip_like = "me_privilege_svip_like";
    public static final String me_privilege_svip_like_pop = "me_privilege_svip_like_pop";
    public static final String me_privilege_svip_likeme = "me_privilege_svip_likeme";
    public static final String me_privilege_svip_likeme_pop = "me_privilege_svip_likeme_pop";
    public static final String me_privilege_svip_peek = "me_privilege_svip_peek";
    public static final String me_privilege_svip_peek_pop = "me_privilege_svip_peek_pop";
    public static final String me_privilege_svip_privacy = "me_privilege_svip_privacy";
    public static final String me_privilege_svip_privacy_pop = "me_privilege_svip_privacy_pop";
    public static final String me_privilege_svip_quickchat = "me_privilege_svip_quickchat";
    public static final String me_privilege_svip_quickchat_pop = "me_privilege_svip_quickchat_pop";
    public static final String me_privilege_svip_read = "me_privilege_svip_read";
    public static final String me_privilege_svip_read_pop = "me_privilege_svip_read_pop";
    public static final String me_privilege_svip_roaming = "me_privilege_svip_roaming";
    public static final String me_privilege_svip_roaming_pop = "me_privilege_svip_roaming_pop";
    public static final String me_privilege_svip_superlike = "me_privilege_svip_superlike";
    public static final String me_privilege_svip_superlike_pop = "me_privilege_svip_superlike_pop";
    public static final String me_privilege_svip_svip = "me_privilege_svip_svip";
    public static final String me_privilege_svip_svip_pop = "me_privilege_svip_svip_pop";
    public static final String me_privilege_svip_undo = "me_privilege_svip_undo";
    public static final String me_privilege_svip_undo_pop = "me_privilege_svip_undo_pop";
    public static final String me_privilege_svip_unlockmylikes = "me_privilege_svip_unlockmylikes";
    public static final String me_privilege_svip_unlockmylikes_pop = "me_privilege_svip_unlockmylikes_pop";
    public static final String me_privilege_svip_unmatch = "me_privilege_svip_unmatch";
    public static final String me_privilege_svip_unmatch_pop = "me_privilege_svip_unmatch_pop";
    public static final String me_privilege_vip_button_renew_title = "me_privilege_vip_button_renew_title";
    public static final String me_privilege_vip_button_title = "me_privilege_vip_button_title";
    public static final String me_privilege_vip_card_subtitle = "me_privilege_vip_card_subtitle";
    public static final String me_privilege_vip_like = "me_privilege_vip_like";
    public static final String me_privilege_vip_like_pop = "me_privilege_vip_like_pop";
    public static final String me_privilege_vip_roaming = "me_privilege_vip_roaming";
    public static final String me_privilege_vip_roaming_pop = "me_privilege_vip_roaming_pop";
    public static final String me_privilege_vip_superlike = "me_privilege_vip_superlike";
    public static final String me_privilege_vip_superlike_pop = "me_privilege_vip_superlike_pop";
    public static final String me_privilege_vip_undo = "me_privilege_vip_undo";
    public static final String me_privilege_vip_undo_pop = "me_privilege_vip_undo_pop";
    public static final String me_privilege_vip_vip = "me_privilege_vip_vip";
    public static final String me_privilege_vip_vip_pop = "me_privilege_vip_vip_pop";
    public static final String p_suggest_users_home_view = "p_suggest_users_home_view";
    public static final String quickchat_purchase_button_alipay = "quickchat_purchase_button_alipay";
    public static final String quickchat_purchase_button_wechat = "quickchat_purchase_button_wechat";
    public static final String quickchat_purchase_header = "quickchat_purchase_header";
    public static final String quickchat_searching = "quickchat_searching";
    public static final String quickchat_wait_with_count = "quickchat_wait_with_count";
    public static final String quickchat_wait_without_count = "quickchat_wait_without_count";
    public static final String see_bubble_conversation_tab_new_likes = "see_bubble_conversation_tab_new_likes";
    public static final String see_bubble_conversation_tab_total_likes = "see_bubble_conversation_tab_total_likes";
    public static final String see_entrance_conversation_tab = "see_entrance_conversation_tab";
    public static final String see_entrance_conversation_tab_new_likes = "see_entrance_conversation_tab_new_likes";
    public static final String see_entrance_conversation_tab_total_likes = "see_entrance_conversation_tab_total_likes";
    public static final String see_entrance_conversation_tab_without_likes = "see_entrance_conversation_tab_without_likes";
    public static final String see_entrance_me_tab = "see_entrance_me_tab";
    public static final String see_purchase_button_alipay = "see_purchase_button_alipay";
    public static final String see_purchase_button_wechat = "see_purchase_button_wechat";
    public static final String see_purchase_header = "see_purchase_header";
    public static final String superlike_letter_letter = "superlike_letter_letter";
    public static final String superlike_letter_letter_bottom = "superlike_letter_letter_bottom";
    public static final String superlike_letter_page = "superlike_letter_page";
    public static final String superlike_letter_page_feed = "superlike_letter_page_feed";
    public static final String superlike_letter_page_news = "superlike_letter_page_news";
    public static final String superlike_letter_page_superlike = "superlike_letter_page_superlike";
    public static final String superlike_letter_page_unlike = "superlike_letter_page_unlike";
    public static final String superlike_letter_superlike = "superlike_letter_superlike";
    protected static HashSet<String> supportEnum = null;
    public static final String svip_purchase_advancefilter = "svip_purchase_advancefilter";
    public static final String svip_purchase_boost = "svip_purchase_boost";
    public static final String svip_purchase_letter = "svip_purchase_letter";
    public static final String svip_purchase_like = "svip_purchase_like";
    public static final String svip_purchase_likeme = "svip_purchase_likeme";
    public static final String svip_purchase_peek = "svip_purchase_peek";
    public static final String svip_purchase_privacy = "svip_purchase_privacy";
    public static final String svip_purchase_quickchat = "svip_purchase_quickchat";
    public static final String svip_purchase_read = "svip_purchase_read";
    public static final String svip_purchase_roaming = "svip_purchase_roaming";
    public static final String svip_purchase_superlike = "svip_purchase_superlike";
    public static final String svip_purchase_svip = "svip_purchase_svip";
    public static final String svip_purchase_undo = "svip_purchase_undo";
    public static final String svip_purchase_unlockmylikes = "svip_purchase_unlockmylikes";
    public static final String svip_purchase_unmatch = "svip_purchase_unmatch";
    public static final String unknown_ = "unknown_";
    public static final String vip_purchase_button_alipay = "vip_purchase_button_alipay";
    public static final String vip_purchase_button_appstore = "vip_purchase_button_appstore";
    public static final String vip_purchase_button_wechat = "vip_purchase_button_wechat";
    public static final String vip_purchase_like = "vip_purchase_like";
    public static final String vip_purchase_renew_vip = "vip_purchase_renew_vip";
    public static final String vip_purchase_roaming = "vip_purchase_roaming";
    public static final String vip_purchase_superlike = "vip_purchase_superlike";
    public static final String vip_purchase_undo = "vip_purchase_undo";
    public static final String vip_purchase_vip = "vip_purchase_vip";
    public static final String wallet_privilege_boost_desc = "wallet_privilege_boost_desc";
    public static final String wallet_privilege_quickchatPeek_desc = "wallet_privilege_quickchatPeek_desc";
    public static final String wallet_privilege_quickchat_desc = "wallet_privilege_quickchat_desc";
    public static final String wallet_privilege_superlike_desc = "wallet_privilege_superlike_desc";
    public static final String wallet_recharge_balance = "wallet_recharge_balance";
    public static final String wallet_recharge_boost = "wallet_recharge_boost";
    public static final String wallet_recharge_button = "wallet_recharge_button";
    public static final String wallet_recharge_hint = "wallet_recharge_hint";
    public static final String wallet_recharge_quickchat = "wallet_recharge_quickchat";
    public static final String wallet_recharge_quickchat_peek = "wallet_recharge_quickchat_peek";
    public static final String wallet_recharge_superlike = "wallet_recharge_superlike";
    public static final String wallet_recharge_title = "wallet_recharge_title";

    @Retention(RetentionPolicy.SOURCE)
    public @interface constants {
    }

    static {
        TEnumJsonAdapter<OMSPosition> tEnumJsonAdapter = new TEnumJsonAdapter<OMSPosition>() { // from class: com.p1.mobile.putong.data.OMSPosition.1
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumJsonAdapter
            public OMSPosition newTEnum(String str, int i) {
                return OMSPosition.getForData(str, i);
            }
        };
        JSON_ADAPTER = tEnumJsonAdapter;
        supportEnum = new HashSet<>();
        PROTOBUF_ADAPTER = new TEnumProtobufAdapter<OMSPosition>() { // from class: com.p1.mobile.putong.data.OMSPosition.2
            @Override // com.p051p1.mobile.putong.data.tenum.TEnumProtobufAdapter
            public OMSPosition newTEnum(String str, int i) {
                return OMSPosition.getForData(str, i);
            }
        };
        tEnumJsonAdapter.addExtJsonValue("unknown_", -1);
        tEnumJsonAdapter.addExtJsonValue("p_suggest_users_home_view", 0);
        tEnumJsonAdapter.addExtJsonValue(vip_purchase_superlike, 1);
        tEnumJsonAdapter.addExtJsonValue(vip_purchase_undo, 2);
        tEnumJsonAdapter.addExtJsonValue(vip_purchase_like, 3);
        tEnumJsonAdapter.addExtJsonValue(vip_purchase_roaming, 4);
        tEnumJsonAdapter.addExtJsonValue(see_purchase_header, 5);
        tEnumJsonAdapter.addExtJsonValue(quickchat_purchase_header, 6);
        tEnumJsonAdapter.addExtJsonValue(vip_purchase_button_appstore, 7);
        tEnumJsonAdapter.addExtJsonValue(vip_purchase_button_alipay, 8);
        tEnumJsonAdapter.addExtJsonValue(vip_purchase_button_wechat, 9);
        tEnumJsonAdapter.addExtJsonValue(see_purchase_button_wechat, 10);
        tEnumJsonAdapter.addExtJsonValue(see_purchase_button_alipay, 11);
        tEnumJsonAdapter.addExtJsonValue(quickchat_purchase_button_alipay, 12);
        tEnumJsonAdapter.addExtJsonValue(quickchat_purchase_button_wechat, 13);
        tEnumJsonAdapter.addExtJsonValue(see_entrance_conversation_tab, 14);
        tEnumJsonAdapter.addExtJsonValue(see_entrance_me_tab, 15);
        tEnumJsonAdapter.addExtJsonValue(see_bubble_conversation_tab_total_likes, 16);
        tEnumJsonAdapter.addExtJsonValue(see_bubble_conversation_tab_new_likes, 17);
        tEnumJsonAdapter.addExtJsonValue(quickchat_searching, 18);
        tEnumJsonAdapter.addExtJsonValue(quickchat_wait_with_count, 19);
        tEnumJsonAdapter.addExtJsonValue(quickchat_wait_without_count, 20);
        tEnumJsonAdapter.addExtJsonValue(wallet_recharge_title, 21);
        tEnumJsonAdapter.addExtJsonValue(wallet_recharge_balance, 22);
        tEnumJsonAdapter.addExtJsonValue(wallet_recharge_superlike, 23);
        tEnumJsonAdapter.addExtJsonValue(wallet_recharge_quickchat_peek, 24);
        tEnumJsonAdapter.addExtJsonValue(wallet_recharge_quickchat, 25);
        tEnumJsonAdapter.addExtJsonValue(wallet_recharge_boost, 26);
        tEnumJsonAdapter.addExtJsonValue(wallet_recharge_hint, 27);
        tEnumJsonAdapter.addExtJsonValue(wallet_recharge_button, 28);
        tEnumJsonAdapter.addExtJsonValue(wallet_privilege_superlike_desc, 29);
        tEnumJsonAdapter.addExtJsonValue(wallet_privilege_quickchatPeek_desc, 30);
        tEnumJsonAdapter.addExtJsonValue(wallet_privilege_quickchat_desc, 31);
        tEnumJsonAdapter.addExtJsonValue(wallet_privilege_boost_desc, 32);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_vip, 33);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_vip_pop, 34);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_superlike, 35);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_superlike_pop, 36);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_undo, 37);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_undo_pop, 38);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_roaming, 39);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_roaming_pop, 40);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_like, 41);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_like_pop, 42);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_card_subtitle, 43);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_see_card_subtitle, 44);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_quickchat_card_subtitle, 45);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_button_title, 46);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_vip_button_renew_title, 47);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_see_button_title, 48);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_see_button_renew_title, 49);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_quickchat_button_renew_title, 50);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_quickchat_button_title, 51);
        tEnumJsonAdapter.addExtJsonValue(vip_purchase_vip, 52);
        tEnumJsonAdapter.addExtJsonValue(see_entrance_conversation_tab_total_likes, 53);
        tEnumJsonAdapter.addExtJsonValue(see_entrance_conversation_tab_new_likes, 54);
        tEnumJsonAdapter.addExtJsonValue(see_entrance_conversation_tab_without_likes, 55);
        tEnumJsonAdapter.addExtJsonValue(vip_purchase_renew_vip, 56);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_likeme, 57);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_likeme_pop, 58);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_like, 59);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_like_pop, 60);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_quickchat, 61);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_quickchat_pop, 62);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_letter, 63);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_letter_pop, 64);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_superlike, 65);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_superlike_pop, 66);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_unlockmylikes, 67);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_unlockmylikes_pop, 68);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_boost, 69);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_boost_pop, 70);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_advancefilter, 71);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_advancefilter_pop, 72);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_read, 73);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_read_pop, int_me_privilege_svip_read_pop);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_privacy, int_me_privilege_svip_privacy);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_privacy_pop, 76);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_unmatch, 77);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_unmatch_pop, 78);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_undo, 79);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_undo_pop, 80);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_roaming, 81);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_roaming_pop, 82);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_peek, 83);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_peek_pop, 84);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_svip, int_me_privilege_svip_svip);
        tEnumJsonAdapter.addExtJsonValue(me_privilege_svip_svip_pop, 86);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_likeme, 87);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_like, 88);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_quickchat, 89);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_letter, 90);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_superlike, 91);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_unlockmylikes, 92);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_boost, 93);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_advancefilter, 94);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_read, int_svip_purchase_read);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_privacy, 96);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_unmatch, 97);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_undo, 98);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_roaming, 99);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_peek, 100);
        tEnumJsonAdapter.addExtJsonValue(svip_purchase_svip, 101);
        tEnumJsonAdapter.addExtJsonValue(superlike_letter_letter, 102);
        tEnumJsonAdapter.addExtJsonValue(superlike_letter_superlike, 103);
        tEnumJsonAdapter.addExtJsonValue(superlike_letter_letter_bottom, 104);
        tEnumJsonAdapter.addExtJsonValue(superlike_letter_page, 105);
        tEnumJsonAdapter.addExtJsonValue(superlike_letter_page_superlike, 106);
        tEnumJsonAdapter.addExtJsonValue(superlike_letter_page_unlike, 107);
        tEnumJsonAdapter.addExtJsonValue(superlike_letter_page_feed, 108);
        tEnumJsonAdapter.addExtJsonValue(superlike_letter_page_news, 109);
        supportEnum.add("p_suggest_users_home_view");
        supportEnum.add(vip_purchase_superlike);
        supportEnum.add(vip_purchase_undo);
        supportEnum.add(vip_purchase_like);
        supportEnum.add(vip_purchase_roaming);
        supportEnum.add(see_purchase_header);
        supportEnum.add(quickchat_purchase_header);
        supportEnum.add(vip_purchase_button_appstore);
        supportEnum.add(vip_purchase_button_alipay);
        supportEnum.add(vip_purchase_button_wechat);
        supportEnum.add(see_purchase_button_wechat);
        supportEnum.add(see_purchase_button_alipay);
        supportEnum.add(quickchat_purchase_button_alipay);
        supportEnum.add(quickchat_purchase_button_wechat);
        supportEnum.add(see_entrance_conversation_tab);
        supportEnum.add(see_entrance_me_tab);
        supportEnum.add(see_bubble_conversation_tab_total_likes);
        supportEnum.add(see_bubble_conversation_tab_new_likes);
        supportEnum.add(quickchat_searching);
        supportEnum.add(quickchat_wait_with_count);
        supportEnum.add(quickchat_wait_without_count);
        supportEnum.add(wallet_recharge_title);
        supportEnum.add(wallet_recharge_balance);
        supportEnum.add(wallet_recharge_superlike);
        supportEnum.add(wallet_recharge_quickchat_peek);
        supportEnum.add(wallet_recharge_quickchat);
        supportEnum.add(wallet_recharge_boost);
        supportEnum.add(wallet_recharge_hint);
        supportEnum.add(wallet_recharge_button);
        supportEnum.add(wallet_privilege_superlike_desc);
        supportEnum.add(wallet_privilege_quickchatPeek_desc);
        supportEnum.add(wallet_privilege_quickchat_desc);
        supportEnum.add(wallet_privilege_boost_desc);
        supportEnum.add(me_privilege_vip_vip);
        supportEnum.add(me_privilege_vip_vip_pop);
        supportEnum.add(me_privilege_vip_superlike);
        supportEnum.add(me_privilege_vip_superlike_pop);
        supportEnum.add(me_privilege_vip_undo);
        supportEnum.add(me_privilege_vip_undo_pop);
        supportEnum.add(me_privilege_vip_roaming);
        supportEnum.add(me_privilege_vip_roaming_pop);
        supportEnum.add(me_privilege_vip_like);
        supportEnum.add(me_privilege_vip_like_pop);
        supportEnum.add(me_privilege_vip_card_subtitle);
        supportEnum.add(me_privilege_see_card_subtitle);
        supportEnum.add(me_privilege_quickchat_card_subtitle);
        supportEnum.add(me_privilege_vip_button_title);
        supportEnum.add(me_privilege_vip_button_renew_title);
        supportEnum.add(me_privilege_see_button_title);
        supportEnum.add(me_privilege_see_button_renew_title);
        supportEnum.add(me_privilege_quickchat_button_renew_title);
        supportEnum.add(me_privilege_quickchat_button_title);
        supportEnum.add(vip_purchase_vip);
        supportEnum.add(see_entrance_conversation_tab_total_likes);
        supportEnum.add(see_entrance_conversation_tab_new_likes);
        supportEnum.add(see_entrance_conversation_tab_without_likes);
        supportEnum.add(vip_purchase_renew_vip);
        supportEnum.add(me_privilege_svip_likeme);
        supportEnum.add(me_privilege_svip_likeme_pop);
        supportEnum.add(me_privilege_svip_like);
        supportEnum.add(me_privilege_svip_like_pop);
        supportEnum.add(me_privilege_svip_quickchat);
        supportEnum.add(me_privilege_svip_quickchat_pop);
        supportEnum.add(me_privilege_svip_letter);
        supportEnum.add(me_privilege_svip_letter_pop);
        supportEnum.add(me_privilege_svip_superlike);
        supportEnum.add(me_privilege_svip_superlike_pop);
        supportEnum.add(me_privilege_svip_unlockmylikes);
        supportEnum.add(me_privilege_svip_unlockmylikes_pop);
        supportEnum.add(me_privilege_svip_boost);
        supportEnum.add(me_privilege_svip_boost_pop);
        supportEnum.add(me_privilege_svip_advancefilter);
        supportEnum.add(me_privilege_svip_advancefilter_pop);
        supportEnum.add(me_privilege_svip_read);
        supportEnum.add(me_privilege_svip_read_pop);
        supportEnum.add(me_privilege_svip_privacy);
        supportEnum.add(me_privilege_svip_privacy_pop);
        supportEnum.add(me_privilege_svip_unmatch);
        supportEnum.add(me_privilege_svip_unmatch_pop);
        supportEnum.add(me_privilege_svip_undo);
        supportEnum.add(me_privilege_svip_undo_pop);
        supportEnum.add(me_privilege_svip_roaming);
        supportEnum.add(me_privilege_svip_roaming_pop);
        supportEnum.add(me_privilege_svip_peek);
        supportEnum.add(me_privilege_svip_peek_pop);
        supportEnum.add(me_privilege_svip_svip);
        supportEnum.add(me_privilege_svip_svip_pop);
        supportEnum.add(svip_purchase_likeme);
        supportEnum.add(svip_purchase_like);
        supportEnum.add(svip_purchase_quickchat);
        supportEnum.add(svip_purchase_letter);
        supportEnum.add(svip_purchase_superlike);
        supportEnum.add(svip_purchase_unlockmylikes);
        supportEnum.add(svip_purchase_boost);
        supportEnum.add(svip_purchase_advancefilter);
        supportEnum.add(svip_purchase_read);
        supportEnum.add(svip_purchase_privacy);
        supportEnum.add(svip_purchase_unmatch);
        supportEnum.add(svip_purchase_undo);
        supportEnum.add(svip_purchase_roaming);
        supportEnum.add(svip_purchase_peek);
        supportEnum.add(svip_purchase_svip);
        supportEnum.add(superlike_letter_letter);
        supportEnum.add(superlike_letter_superlike);
        supportEnum.add(superlike_letter_letter_bottom);
        supportEnum.add(superlike_letter_page);
        supportEnum.add(superlike_letter_page_superlike);
        supportEnum.add(superlike_letter_page_unlike);
        supportEnum.add(superlike_letter_page_feed);
        supportEnum.add(superlike_letter_page_news);
        _OMSPosition = Collections.synchronizedMap(new l01());
    }

    @Deprecated
    private OMSPosition(String str, int i) {
        super(str, i);
        String str2 = this.name;
        if (str2 == null || str2.length() == 0) {
            this.name = JSON_ADAPTER.getString(Integer.valueOf(i));
            if (str == null) {
                this.name = "unknown_";
            }
        }
    }

    public static List<Integer> covertToOldEnumList(List<OMSPosition> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<OMSPosition> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().ordinal()));
        }
        return arrayList;
    }

    public static Map<String, Integer> covertToOldEnumMap(Map<String, OMSPosition> map) {
        l01 l01Var = new l01();
        for (Map.Entry<String, OMSPosition> entry : map.entrySet()) {
            l01Var.put(entry.getKey(), Integer.valueOf(entry.getValue().ordinal()));
        }
        return l01Var;
    }

    public static OMSPosition get(String str) {
        Map<String, OMSPosition> map = _OMSPosition;
        OMSPosition oMSPosition = map.get(str);
        if (oMSPosition == null) {
            Integer integer = JSON_ADAPTER.getInteger(str);
            oMSPosition = integer == null ? new OMSPosition(str, -1) : new OMSPosition(str, integer.intValue());
            map.put(str, oMSPosition);
        }
        return oMSPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OMSPosition getForData(String str, int i) {
        if (str == null) {
            str = JSON_ADAPTER.getString(Integer.valueOf(i));
        }
        return get(str);
    }

    public static List<OMSPosition> oldEnumCovertList(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (num == null) {
                num = -1;
            }
            arrayList.add(get(num.intValue()));
        }
        return arrayList;
    }

    public static Map<String, OMSPosition> oldEnumCovertMap(Map<String, Integer> map) {
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

    private static OMSPosition get(int i) {
        String string = JSON_ADAPTER.getString(Integer.valueOf(i));
        if (string == null) {
            string = "unknown_";
        }
        return get(string);
    }
}
