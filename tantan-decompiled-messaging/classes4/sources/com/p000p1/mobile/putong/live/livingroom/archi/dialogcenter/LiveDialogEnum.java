package com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveDialogEnum {
    public static final LiveDialogEnum UNKNOWN = new LiveDialogEnum("UNKNOWN", 0);
    public static final LiveDialogEnum CHAT_INPUT = new LiveDialogEnum("CHAT_INPUT", 1);
    public static final LiveDialogEnum FAST_RECHARGE = new LiveDialogEnum("FAST_RECHARGE", 2);
    public static final LiveDialogEnum GIFT = new LiveDialogEnum("GIFT", 3);
    public static final LiveDialogEnum GIFT_REMINDER = new LiveDialogEnum("GIFT_REMINDER", 4);
    public static final LiveDialogEnum MEMBER = new LiveDialogEnum("MEMBER", 5);
    public static final LiveDialogEnum USER_CARD = new LiveDialogEnum("USER_CARD", 6);
    public static final LiveDialogEnum WEBVIEW = new LiveDialogEnum("WEBVIEW", 7);
    public static final LiveDialogEnum FOLLOW = new LiveDialogEnum("FOLLOW", 8);
    public static final LiveDialogEnum HOUR_LEADER_BOARD = new LiveDialogEnum("HOUR_LEADER_BOARD", 9);
    public static final LiveDialogEnum CALL_ANCHOR_CHECK_DIALOG = new LiveDialogEnum("CALL_ANCHOR_CHECK_DIALOG", 10);
    public static final LiveDialogEnum CALl_AUDIENCE_APPLY_DIALOG = new LiveDialogEnum("CALl_AUDIENCE_APPLY_DIALOG", 11);
    public static final LiveDialogEnum VOICE_CALL_ALL_LIST_DIALOG = new LiveDialogEnum("VOICE_CALL_ALL_LIST_DIALOG", 12);
    public static final LiveDialogEnum VOICE_CALL_AUDIENCE_APPLY_DIALOG = new LiveDialogEnum("VOICE_CALL_AUDIENCE_APPLY_DIALOG", 13);
    public static final LiveDialogEnum TOPIC_LIST_DIALOG = new LiveDialogEnum("TOPIC_LIST_DIALOG", 14);
    public static final LiveDialogEnum SCRAP_GIFT = new LiveDialogEnum("SCRAP_GIFT", 15);
    public static final LiveDialogEnum SIGN_IN = new LiveDialogEnum("SIGN_IN", 16);
    public static final LiveDialogEnum EFFECTS_DANMAKU = new LiveDialogEnum("EFFECTS_DANMAKU", 17);
    public static final LiveDialogEnum VOICE_HOUR_LEADER_BOARD = new LiveDialogEnum("VOICE_HOUR_LEADER_BOARD", 18);
    public static final LiveDialogEnum VOICE_SWEET_CP = new LiveDialogEnum("VOICE_SWEET_CP", 19);
    public static final LiveDialogEnum VOICE_KTV_DIALOG = new LiveDialogEnum("VOICE_KTV_DIALOG", 20);
    public static final LiveDialogEnum VOICE_MEMBER_MANAGER = new LiveDialogEnum("VOICE_MEMBER_MANAGER", 21);
    public static final LiveDialogEnum GIFT_WALL = new LiveDialogEnum("GIFT_WALL", 22);
    public static final LiveDialogEnum SUPER_GOD = new LiveDialogEnum("SUPER_GOD", 23);
    public static final LiveDialogEnum GIFT_SHOW_EXPIRATION_DIALOG = new C01991("GIFT_SHOW_EXPIRATION_DIALOG", 24);
    private static final /* synthetic */ LiveDialogEnum[] $VALUES = $values();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum$1 */
    public final enum C01991 extends LiveDialogEnum {
        private C01991(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum
        public boolean canShowGrayBackground() {
            return false;
        }
    }

    private static /* synthetic */ LiveDialogEnum[] $values() {
        return new LiveDialogEnum[]{UNKNOWN, CHAT_INPUT, FAST_RECHARGE, GIFT, GIFT_REMINDER, MEMBER, USER_CARD, WEBVIEW, FOLLOW, HOUR_LEADER_BOARD, CALL_ANCHOR_CHECK_DIALOG, CALl_AUDIENCE_APPLY_DIALOG, VOICE_CALL_ALL_LIST_DIALOG, VOICE_CALL_AUDIENCE_APPLY_DIALOG, TOPIC_LIST_DIALOG, SCRAP_GIFT, SIGN_IN, EFFECTS_DANMAKU, VOICE_HOUR_LEADER_BOARD, VOICE_SWEET_CP, VOICE_KTV_DIALOG, VOICE_MEMBER_MANAGER, GIFT_WALL, SUPER_GOD, GIFT_SHOW_EXPIRATION_DIALOG};
    }

    public static LiveDialogEnum valueOf(String str) {
        return (LiveDialogEnum) Enum.valueOf(LiveDialogEnum.class, str);
    }

    public static LiveDialogEnum[] values() {
        return (LiveDialogEnum[]) $VALUES.clone();
    }

    public boolean canShowGrayBackground() {
        return true;
    }

    private LiveDialogEnum(String str, int i) {
        super(str, i);
    }
}
