package com.p051p1.mobile.putong.core.newui.home.bubble;

/* JADX INFO: loaded from: classes11.dex */
public enum MagicBubble {
    SEE_ANIM("see_anim_bubble", "main_tab"),
    INTERNAL_PUSH_LIVE("internal_push_live", "main_tab"),
    SEE_FLOAT("see_float_bubble", "main_tab"),
    MATCH_SEND_MESSAGE_FLOAT("match_send_message_float", "main_tab"),
    PROFILE_MOMENT_SEND_MESSAGE_FLOAT("profile_moment_send_message_float", "profile"),
    PICKS_GUIDE_BUBBLE("picks_guide_bubble", "main_tab"),
    HELLO_CLUB_BUBBLE("hello_club_bubble", "main_tab"),
    IMPRESS_SIGNAL_BUBBLE("impress_signal_bubble", "main_tab"),
    QUICK_CHAT_BUBBLE("quick_chat_bubble", "main_tab"),
    AUDIO_QUICK_CHAT_BUBBLE("audio_quick_chat_bubble", "main_tab");

    private final String group;

    /* JADX INFO: renamed from: id */
    private final String f22890id;

    MagicBubble(String str, String str2) {
        this.f22890id = str;
        this.group = str2;
    }

    public String getGroup() {
        return this.group;
    }

    public String getId() {
        return this.f22890id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.group;
    }
}
