package com.p051p1.mobile.putong.live.base.bean;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import p153l.mbc0;
import p153l.rnl;
import p153l.xau;
import p153l.xi5;
import p153l.yhk0;
import p153l.z8d0;
import p153l.zvr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public abstract class UserRightType {
    private static final /* synthetic */ UserRightType[] $VALUES = $values();
    public static final UserRightType AVATAR_MANAGE;
    public static final UserRightType CALL_EFFECT;
    public static final UserRightType CHAT_UNDER_SHADE;
    public static final UserRightType ENTER_ROOM_EFFECT;
    public static final UserRightType LIVE_NICE_NUMBER;
    public static final int PAGE_LIMIT = 20;
    public static final UserRightType PROFILE_CARD_MANAGE;
    public static final UserRightType USER_MEDAL_MANAGE;
    public static final UserRightType VOICE_AVATAR_MEDAL;
    public static final UserRightType VOICE_AVATAR_RIGHT;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$1 */
    public final enum C115941 extends UserRightType {
        private C115941(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getBindRightsToAnchorUrlStr() {
            return "/userMedals";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return context.getString(R$string.f45008d1);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return mbc0.f135655O;
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f45002b1);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "/medals/medalId/" + str + "/anchors?lastId=" + str2 + "&limit=20";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public rnl getRightEquipUrlStr(z8d0 z8d0Var, String str) {
            rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(xi5.m211107i("/userMedals/"));
            c19886aM68490m.m182299b(z8d0Var.m218965c());
            c19886aM68490m.m182299b(Constants.KEY_ACTIONS);
            c19886aM68490m.m182299b(str);
            if (!TextUtils.isEmpty(z8d0Var.m218964b())) {
                c19886aM68490m.m182300c("roomId", z8d0Var.m218964b());
            }
            if (!TextUtils.isEmpty(z8d0Var.m218963a())) {
                c19886aM68490m.m182300c("liveId", z8d0Var.m218963a());
            }
            return c19886aM68490m.m182301d();
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(yhk0 yhk0Var) {
            rnl.C19886a c19886aM182300c = LiveApiBuilder.m68490m(zvr.m221802b("/medals/me")).m182300c("liveId", yhk0Var.getLiveId()).m182300c("roomId", yhk0Var.getRoomId()).m182300c("placeType", yhk0Var.getPlaceType());
            if (TextUtils.equals(yhk0Var.getPlaceType(), "voiceRoom")) {
                c19886aM182300c.m182300c("templateType", "profit");
            }
            return c19886aM182300c.toString();
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$2 */
    public final enum C115952 extends UserRightType {
        private C115952(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getBindRightsToAnchorUrlStr() {
            return "/userRoomEnterEffects";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return context.getString(R$string.f44978Q0);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return mbc0.f135653M;
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f44976P0);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "/enterRoomEffects/effectId/" + str + "/anchors?lastId=" + str2 + "&limit=20";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public rnl getRightEquipUrlStr(z8d0 z8d0Var, String str) {
            rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(xi5.m211107i("/userRoomEnterEffects/"));
            c19886aM68490m.m182299b(z8d0Var.m218965c());
            c19886aM68490m.m182299b(Constants.KEY_ACTIONS);
            c19886aM68490m.m182299b(str);
            if (!TextUtils.isEmpty(z8d0Var.m218964b())) {
                c19886aM68490m.m182300c("roomId", z8d0Var.m218964b());
            }
            if (!TextUtils.isEmpty(z8d0Var.m218963a())) {
                c19886aM68490m.m182300c("liveId", z8d0Var.m218963a());
            }
            return c19886aM68490m.m182301d();
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(yhk0 yhk0Var) {
            rnl.C19886a c19886aM68490m;
            if (TextUtils.isEmpty(yhk0Var.getRoomId())) {
                c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/enterRoomEffects/me"));
            } else {
                c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/enterRoomEffects/rooms/" + yhk0Var.getRoomId()));
            }
            if (TextUtils.equals(yhk0Var.getPlaceType(), "voiceRoom")) {
                c19886aM68490m.m182300c("templateType", "profit");
            }
            return c19886aM68490m.m182300c("placeType", yhk0Var.getPlaceType()).toString();
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$3 */
    public final enum C115963 extends UserRightType {
        private C115963(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return context.getString(R$string.f44974O0);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return mbc0.f135652L;
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f44972N0);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "/rights/chatShading/rightId/" + str + "/anchors?lastId=" + str2 + "&limit=20";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(yhk0 yhk0Var) {
            rnl.C19886a c19886aM68490m;
            if (TextUtils.isEmpty(yhk0Var.getRoomId())) {
                c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/rights/chatShading/me"));
            } else {
                c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/rights/chatShading/rooms/" + yhk0Var.getRoomId()));
            }
            if (TextUtils.equals(yhk0Var.getPlaceType(), "voiceRoom")) {
                c19886aM68490m.m182300c("templateType", "profit");
            }
            return c19886aM68490m.m182300c("placeType", yhk0Var.getPlaceType()).toString();
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$4 */
    public final enum C115974 extends UserRightType {
        private C115974(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return context.getString(R$string.f44970M0);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return mbc0.f135649I;
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f44968L0);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "/rights/avatar/rightId/" + str + "/anchors?lastId=" + str2 + "&limit=20";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(yhk0 yhk0Var) {
            rnl.C19886a c19886aM68490m;
            if (TextUtils.isEmpty(yhk0Var.getRoomId())) {
                c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/rights/avatar/me"));
            } else {
                c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/rights/avatar/rooms/" + yhk0Var.getRoomId()));
            }
            if (TextUtils.equals(yhk0Var.getPlaceType(), "voiceRoom")) {
                c19886aM68490m.m182300c("templateType", "profit");
            }
            return c19886aM68490m.m182300c("placeType", yhk0Var.getPlaceType()).toString();
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$5 */
    public final enum C115985 extends UserRightType {
        private C115985(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return context.getString(R$string.f45032l1);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return mbc0.f135657Q;
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f45029k1);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "/rights/profile/rightId/" + str + "/anchors?lastId=" + str2 + "&limit=20";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(yhk0 yhk0Var) {
            rnl.C19886a c19886aM68490m;
            if (TextUtils.isEmpty(yhk0Var.getRoomId())) {
                c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/rights/profile/me"));
            } else {
                c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/rights/profile/rooms/" + yhk0Var.getRoomId()));
            }
            if (TextUtils.equals(yhk0Var.getPlaceType(), "voiceRoom")) {
                c19886aM68490m.m182300c("templateType", "profit");
            }
            return c19886aM68490m.m182300c("placeType", yhk0Var.getPlaceType()).toString();
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$6 */
    public final enum C115996 extends UserRightType {
        private C115996(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return null;
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return 0;
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f44951D1);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return null;
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(yhk0 yhk0Var) {
            return "";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "/rights/avatar/actions/unequip";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getVoiceAvatarRightsUrl() {
            return "/voiceRights/avatar/me";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public boolean isVideoRoomRight() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$7 */
    public final enum C116007 extends UserRightType {
        private C116007(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return "";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return 0;
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f44945B1);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public rnl getRightEquipUrlStr(z8d0 z8d0Var, String str) {
            rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(xi5.m211107i("/userMedals/"));
            c19886aM68490m.m182299b(z8d0Var.m218965c());
            c19886aM68490m.m182299b(Constants.KEY_ACTIONS);
            c19886aM68490m.m182299b(str);
            if (!TextUtils.isEmpty(z8d0Var.m218964b())) {
                c19886aM68490m.m182300c("roomId", z8d0Var.m218964b());
            }
            if (!TextUtils.isEmpty(z8d0Var.m218963a())) {
                c19886aM68490m.m182300c("liveId", z8d0Var.m218963a());
            }
            return c19886aM68490m.m182301d();
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(yhk0 yhk0Var) {
            return "";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "/rights/medal/actions/unequip";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getVoiceAvatarRightsUrl() {
            return "/voiceRights/medal/me";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public boolean isVideoRoomRight() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$8 */
    public final enum C116018 extends UserRightType {
        private C116018(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return "";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return mbc0.f135656P;
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return xau.m209910t(R$string.f45023i1);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(yhk0 yhk0Var) {
            return "";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$9 */
    public final enum C116029 extends UserRightType {
        private C116029(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return "";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return mbc0.f135650J;
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return "麦位动效管理";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(yhk0 yhk0Var) {
            rnl.C19886a c19886aM68490m;
            if (TextUtils.isEmpty(yhk0Var.getRoomId())) {
                c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/rights/callEffect/me"));
            } else {
                c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/rights/callEffect/rooms/" + yhk0Var.getRoomId()));
                c19886aM68490m.m182300c("placeType", yhk0Var.getPlaceType());
                c19886aM68490m.m182300c("templateType", "profit");
            }
            return c19886aM68490m.toString();
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "";
        }

        @Override // com.p051p1.mobile.putong.live.base.bean.UserRightType
        public boolean isVideoRoomRight() {
            return false;
        }
    }

    private static /* synthetic */ UserRightType[] $values() {
        return new UserRightType[]{USER_MEDAL_MANAGE, ENTER_ROOM_EFFECT, CHAT_UNDER_SHADE, AVATAR_MANAGE, PROFILE_CARD_MANAGE, VOICE_AVATAR_RIGHT, VOICE_AVATAR_MEDAL, LIVE_NICE_NUMBER, CALL_EFFECT};
    }

    static {
        USER_MEDAL_MANAGE = new C115941("USER_MEDAL_MANAGE", 0);
        ENTER_ROOM_EFFECT = new C115952("ENTER_ROOM_EFFECT", 1);
        CHAT_UNDER_SHADE = new C115963("CHAT_UNDER_SHADE", 2);
        AVATAR_MANAGE = new C115974("AVATAR_MANAGE", 3);
        PROFILE_CARD_MANAGE = new C115985("PROFILE_CARD_MANAGE", 4);
        VOICE_AVATAR_RIGHT = new C115996("VOICE_AVATAR_RIGHT", 5);
        VOICE_AVATAR_MEDAL = new C116007("VOICE_AVATAR_MEDAL", 6);
        LIVE_NICE_NUMBER = new C116018("LIVE_NICE_NUMBER", 7);
        CALL_EFFECT = new C116029("CALL_EFFECT", 8);
    }

    public static UserRightType valueOf(String str) {
        return (UserRightType) Enum.valueOf(UserRightType.class, str);
    }

    public static UserRightType[] values() {
        return (UserRightType[]) $VALUES.clone();
    }

    public String getBindRightsToAnchorUrlStr() {
        return "/userRights";
    }

    public abstract String getEquipNotice(Context context);

    public abstract int getLeftIcon();

    public abstract String getManageTitle(Context context);

    public abstract String getRightBindAnchorsUrlStr(String str, String str2);

    public rnl getRightEquipUrlStr(z8d0 z8d0Var, String str) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(xi5.m211107i("/userRights/"));
        c19886aM68490m.m182299b(z8d0Var.m218965c());
        c19886aM68490m.m182299b(Constants.KEY_ACTIONS);
        c19886aM68490m.m182299b(str);
        if (!TextUtils.isEmpty(z8d0Var.m218964b())) {
            c19886aM68490m.m182300c("roomId", z8d0Var.m218964b());
        }
        if (!TextUtils.isEmpty(z8d0Var.m218963a())) {
            c19886aM68490m.m182300c("liveId", z8d0Var.m218963a());
        }
        return c19886aM68490m.m182301d();
    }

    public abstract String getRightListUrlStr(yhk0 yhk0Var);

    public abstract String getUnEquipUrl();

    public String getVoiceAvatarRightsUrl() {
        return "";
    }

    public boolean isVideoRoomRight() {
        return true;
    }

    private UserRightType(String str, int i) {
        super(str, i);
    }
}
