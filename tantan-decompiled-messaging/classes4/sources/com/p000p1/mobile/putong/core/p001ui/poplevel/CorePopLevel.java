package com.p000p1.mobile.putong.core.p001ui.poplevel;

import l.i0m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public enum CorePopLevel implements i0m {
    UNKNOWN("core_unknown", "未识别的弹窗"),
    PIN_LIKE_SEND("core_pink_like_send", "白金置顶喜欢发送成功"),
    SUPER_LIKE_SEND("core_super_like_send", "超级喜欢发送成功"),
    MULTI_SUPER_LIKE_SEND("core_multi_super_like_send", "超级喜欢发送成功"),
    SEE_TOAST("seeToastBanner", "首页see引导banner"),
    BUZZ_NOTIFY("BUZZ_NOTIFY", "buzz引导"),
    QUICK_NOTIFY_MATCH_SUCCESS("QUICK_NOTIFY_MATCH_SUCCESS", "闪聊成功"),
    QUICK_NOTIFY_BROADCAST("QUICK_NOTIFY_BROADCAST", "闪聊广播"),
    QUICK_NOTIFY_PEI_LIAO_BROADCAST("QUICK_NOTIFY_PEI_LAIO_BROADCAST", "陪聊广播"),
    CITY_C_BROADCAST("e_city_cover_broadcast", "C位置广播"),
    NEW_USER_GREETING("core_old_welcome_card_guide_layout", "新用户打招呼:人刚加入探探，欢迎一下他们吧"),
    PICKS("PICKS", "每日心动"),
    LIVE_PUSH("liveBanner", "直播提示push"),
    VIRTUAL_VOICE_PUSH("VirtualVoiceBanner", "语音房push"),
    INTL_SEE_ANIM_BUBBLE("IntlSeeAnimBubble", "SeeAnimBubble"),
    INTL_PET("core_intl_pet_toast_small", "国际化宠物"),
    PICKS_GUIDE("dailyPickBanner", "PicksGuideBubble"),
    OOF_GUIDE("core_oof_card_guide_layout", "极限四选一引导"),
    IMMERSION_SEND_MSG("e_immersion_in_app_messaging", "e_immersion_in_app_messaging"),
    KANKAN_PUBLISH("core_kankan_publish_success", "core_kankan_publish_success"),
    SOUL_MATCH("core_immersion_video_in_app_message", "SoulMatchTabPresenter#core_immersion_video_in_app_message"),
    SUGGEST_SHOW_PUSH("SUGGEST_SHOW_PUSH", "SuggesterHelper#showPush"),
    GROWTH_NEW_USER_GUIDE("core_growth_new_user_guide", "core_growth_new_user_guide"),
    GROWTH_NEW_EXPOSURE_USER_GUIDE("core_growth_exposure_user_guide", "core_growth_exposure_user_guide"),
    GROWTH_PLAN_A("core_growth_new_user_plan_a", "core_growth_new_user_plan_a"),
    GROWTH_PLAN_B("core_growth_new_user_plan_b", "core_growth_new_user_plan_b"),
    IMPRESS("Impress", "心动信号"),
    MATCH_SEND_MSG_DONE("MATCH_SEND_MSG_DONE", "MATCH_SEND_MSG_DONE"),
    PROFILE_SEND_MSG_DONE("PROFILE_SEND_MSG_DONE", "PROFILE_SEND_MSG_DONE"),
    PIC_POST_SUCCESS("PIC_POST_SUCCESS", "PIC_POST_SUCCESS"),
    LETTER_SEND_DONE("LETTER_SEND_DONE", "LETTER_SEND_DONE"),
    SPOT_PUSH_BUBBLE("SPOT_PUSH_BUBBLE", "core_spotlight_message_sent"),
    FreeTrialBubble("FreeTrialBubble", "core_free_trial_bubble"),
    MediaReorderCardDone("MediaReorderCardDone", "MediaReorderCardDone"),
    datingPurposePopup("datingPurposePopup", "交友目的选择"),
    PERMISSION_REQUEST_TEST("PERMISSION_REQUEST_TEST", "权限测试"),
    Notifycation("core_push_diglog_guide_layout", "core_push_diglog_guide_layout"),
    HOME_AUTH_TAB("HOME_AUTH_TAB", "首页认证tab"),
    FRIEND_TACIT("friend_tacit", "好友默契测试"),
    MARRYSPRINGFESTIVAL("marrySpringFestival", "婚恋春节活动"),
    GAME_CP("game_cp", "游戏CP"),
    BAR_LOVER("bar_lover", "酒吧爱人"),
    SURPRISE_BOX("surprise_box", "惊喜盲盒"),
    WECHAT_NOTIFY_GUIDE("wechat_notify_guide", "微信通知引导"),
    CHAT_PARTNER("chat_partner", "聊天搭子"),
    ICE_BREAK_OFFLINE("ice_break_offline", "男性离线心动告白"),
    AUDIO_QUICK_NOTIFY_BROADCAST("AUDIO_QUICK_NOTIFY_BROADCAST", "语音闪聊广播"),
    JUST_REAL_SUCCESS("JUST_REAL_SUCCESS", "只看认证成功的弹窗"),
    HIGH_SPEED_RIGHT_SLIDE("HIGH_SPEED_RIGHT_SLIDE", "快速右滑引导弹窗"),
    VERIFIED_EXTRA_SWIPE_COUNT("VERIFIED_EXTRA_SWIPE_COUNT", "认证后额外右滑动次数提示"),
    VERIFIED_SUCCESS("VERIFIED_SUCCESS", "认证成功后新的Bubble"),
    ONLINE_MESSAGE_GUIDE("online_message_guide", "在线消息引导"),
    TEST("core_test", "未识别的弹窗");

    long cdTime;
    String desc;
    String onlyName;

    CorePopLevel(String str, long j, String str2) {
        this.onlyName = str;
        this.cdTime = j;
        this.desc = str2;
    }

    public long getCdTime() {
        return this.cdTime;
    }

    public String getOnlyName() {
        return this.onlyName;
    }

    CorePopLevel(String str, String str2) {
        this.onlyName = str;
        this.desc = str2;
    }
}
