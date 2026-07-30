package com.p046p1.mobile.putong.live.base.bean;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import p149l.cll;
import p149l.g3c0;
import p149l.s8k0;
import p149l.w0d0;
import p149l.w8u;
import p149l.xh5;
import p149l.ytr;

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
    public final enum C114311 extends UserRightType {
        private C114311(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getBindRightsToAnchorUrlStr() {
            return "/userMedals";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return context.getString(R$string.f44160d1);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return g3c0.f100393O;
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f44154b1);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "/medals/medalId/" + str + "/anchors?lastId=" + str2 + "&limit=20";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public cll getRightEquipUrlStr(w0d0 w0d0Var, String str) {
            cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(xh5.m208761i("/userMedals/"));
            c16188aM67307m.m107535b(w0d0Var.m200851c());
            c16188aM67307m.m107535b(Constants.KEY_ACTIONS);
            c16188aM67307m.m107535b(str);
            if (!TextUtils.isEmpty(w0d0Var.m200850b())) {
                c16188aM67307m.m107536c("roomId", w0d0Var.m200850b());
            }
            if (!TextUtils.isEmpty(w0d0Var.m200849a())) {
                c16188aM67307m.m107536c("liveId", w0d0Var.m200849a());
            }
            return c16188aM67307m.m107537d();
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(s8k0 s8k0Var) {
            cll.C16188a c16188aM107536c = LiveApiBuilder.m67307m(ytr.m216073b("/medals/me")).m107536c("liveId", s8k0Var.getLiveId()).m107536c("roomId", s8k0Var.getRoomId()).m107536c("placeType", s8k0Var.getPlaceType());
            if (TextUtils.equals(s8k0Var.getPlaceType(), "voiceRoom")) {
                c16188aM107536c.m107536c("templateType", "profit");
            }
            return c16188aM107536c.toString();
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$2 */
    public final enum C114322 extends UserRightType {
        private C114322(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getBindRightsToAnchorUrlStr() {
            return "/userRoomEnterEffects";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return context.getString(R$string.f44130Q0);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return g3c0.f100391M;
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f44128P0);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "/enterRoomEffects/effectId/" + str + "/anchors?lastId=" + str2 + "&limit=20";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public cll getRightEquipUrlStr(w0d0 w0d0Var, String str) {
            cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(xh5.m208761i("/userRoomEnterEffects/"));
            c16188aM67307m.m107535b(w0d0Var.m200851c());
            c16188aM67307m.m107535b(Constants.KEY_ACTIONS);
            c16188aM67307m.m107535b(str);
            if (!TextUtils.isEmpty(w0d0Var.m200850b())) {
                c16188aM67307m.m107536c("roomId", w0d0Var.m200850b());
            }
            if (!TextUtils.isEmpty(w0d0Var.m200849a())) {
                c16188aM67307m.m107536c("liveId", w0d0Var.m200849a());
            }
            return c16188aM67307m.m107537d();
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(s8k0 s8k0Var) {
            cll.C16188a c16188aM67307m;
            if (TextUtils.isEmpty(s8k0Var.getRoomId())) {
                c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/enterRoomEffects/me"));
            } else {
                c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/enterRoomEffects/rooms/" + s8k0Var.getRoomId()));
            }
            if (TextUtils.equals(s8k0Var.getPlaceType(), "voiceRoom")) {
                c16188aM67307m.m107536c("templateType", "profit");
            }
            return c16188aM67307m.m107536c("placeType", s8k0Var.getPlaceType()).toString();
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$3 */
    public final enum C114333 extends UserRightType {
        private C114333(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return context.getString(R$string.f44126O0);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return g3c0.f100390L;
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f44124N0);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "/rights/chatShading/rightId/" + str + "/anchors?lastId=" + str2 + "&limit=20";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(s8k0 s8k0Var) {
            cll.C16188a c16188aM67307m;
            if (TextUtils.isEmpty(s8k0Var.getRoomId())) {
                c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/rights/chatShading/me"));
            } else {
                c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/rights/chatShading/rooms/" + s8k0Var.getRoomId()));
            }
            if (TextUtils.equals(s8k0Var.getPlaceType(), "voiceRoom")) {
                c16188aM67307m.m107536c("templateType", "profit");
            }
            return c16188aM67307m.m107536c("placeType", s8k0Var.getPlaceType()).toString();
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$4 */
    public final enum C114344 extends UserRightType {
        private C114344(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return context.getString(R$string.f44122M0);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return g3c0.f100387I;
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f44120L0);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "/rights/avatar/rightId/" + str + "/anchors?lastId=" + str2 + "&limit=20";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(s8k0 s8k0Var) {
            cll.C16188a c16188aM67307m;
            if (TextUtils.isEmpty(s8k0Var.getRoomId())) {
                c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/rights/avatar/me"));
            } else {
                c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/rights/avatar/rooms/" + s8k0Var.getRoomId()));
            }
            if (TextUtils.equals(s8k0Var.getPlaceType(), "voiceRoom")) {
                c16188aM67307m.m107536c("templateType", "profit");
            }
            return c16188aM67307m.m107536c("placeType", s8k0Var.getPlaceType()).toString();
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$5 */
    public final enum C114355 extends UserRightType {
        private C114355(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return context.getString(R$string.f44184l1);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return g3c0.f100395Q;
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f44181k1);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "/rights/profile/rightId/" + str + "/anchors?lastId=" + str2 + "&limit=20";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(s8k0 s8k0Var) {
            cll.C16188a c16188aM67307m;
            if (TextUtils.isEmpty(s8k0Var.getRoomId())) {
                c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/rights/profile/me"));
            } else {
                c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/rights/profile/rooms/" + s8k0Var.getRoomId()));
            }
            if (TextUtils.equals(s8k0Var.getPlaceType(), "voiceRoom")) {
                c16188aM67307m.m107536c("templateType", "profit");
            }
            return c16188aM67307m.m107536c("placeType", s8k0Var.getPlaceType()).toString();
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$6 */
    public final enum C114366 extends UserRightType {
        private C114366(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return null;
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return 0;
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f44103D1);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return null;
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(s8k0 s8k0Var) {
            return "";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "/rights/avatar/actions/unequip";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getVoiceAvatarRightsUrl() {
            return "/voiceRights/avatar/me";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public boolean isVideoRoomRight() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$7 */
    public final enum C114377 extends UserRightType {
        private C114377(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return "";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return 0;
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return context.getString(R$string.f44097B1);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public cll getRightEquipUrlStr(w0d0 w0d0Var, String str) {
            cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(xh5.m208761i("/userMedals/"));
            c16188aM67307m.m107535b(w0d0Var.m200851c());
            c16188aM67307m.m107535b(Constants.KEY_ACTIONS);
            c16188aM67307m.m107535b(str);
            if (!TextUtils.isEmpty(w0d0Var.m200850b())) {
                c16188aM67307m.m107536c("roomId", w0d0Var.m200850b());
            }
            if (!TextUtils.isEmpty(w0d0Var.m200849a())) {
                c16188aM67307m.m107536c("liveId", w0d0Var.m200849a());
            }
            return c16188aM67307m.m107537d();
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(s8k0 s8k0Var) {
            return "";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "/rights/medal/actions/unequip";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getVoiceAvatarRightsUrl() {
            return "/voiceRights/medal/me";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public boolean isVideoRoomRight() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$8 */
    public final enum C114388 extends UserRightType {
        private C114388(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return "";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return g3c0.f100394P;
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return w8u.m202217t(R$string.f44175i1);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(s8k0 s8k0Var) {
            return "";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.UserRightType$9 */
    public final enum C114399 extends UserRightType {
        private C114399(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getEquipNotice(Context context) {
            return "";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public int getLeftIcon() {
            return g3c0.f100388J;
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getManageTitle(Context context) {
            return "麦位动效管理";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightBindAnchorsUrlStr(String str, String str2) {
            return "";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getRightListUrlStr(s8k0 s8k0Var) {
            cll.C16188a c16188aM67307m;
            if (TextUtils.isEmpty(s8k0Var.getRoomId())) {
                c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/rights/callEffect/me"));
            } else {
                c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/rights/callEffect/rooms/" + s8k0Var.getRoomId()));
                c16188aM67307m.m107536c("placeType", s8k0Var.getPlaceType());
                c16188aM67307m.m107536c("templateType", "profit");
            }
            return c16188aM67307m.toString();
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public String getUnEquipUrl() {
            return "";
        }

        @Override // com.p046p1.mobile.putong.live.base.bean.UserRightType
        public boolean isVideoRoomRight() {
            return false;
        }
    }

    private static /* synthetic */ UserRightType[] $values() {
        return new UserRightType[]{USER_MEDAL_MANAGE, ENTER_ROOM_EFFECT, CHAT_UNDER_SHADE, AVATAR_MANAGE, PROFILE_CARD_MANAGE, VOICE_AVATAR_RIGHT, VOICE_AVATAR_MEDAL, LIVE_NICE_NUMBER, CALL_EFFECT};
    }

    static {
        USER_MEDAL_MANAGE = new C114311("USER_MEDAL_MANAGE", 0);
        ENTER_ROOM_EFFECT = new C114322("ENTER_ROOM_EFFECT", 1);
        CHAT_UNDER_SHADE = new C114333("CHAT_UNDER_SHADE", 2);
        AVATAR_MANAGE = new C114344("AVATAR_MANAGE", 3);
        PROFILE_CARD_MANAGE = new C114355("PROFILE_CARD_MANAGE", 4);
        VOICE_AVATAR_RIGHT = new C114366("VOICE_AVATAR_RIGHT", 5);
        VOICE_AVATAR_MEDAL = new C114377("VOICE_AVATAR_MEDAL", 6);
        LIVE_NICE_NUMBER = new C114388("LIVE_NICE_NUMBER", 7);
        CALL_EFFECT = new C114399("CALL_EFFECT", 8);
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

    public cll getRightEquipUrlStr(w0d0 w0d0Var, String str) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(xh5.m208761i("/userRights/"));
        c16188aM67307m.m107535b(w0d0Var.m200851c());
        c16188aM67307m.m107535b(Constants.KEY_ACTIONS);
        c16188aM67307m.m107535b(str);
        if (!TextUtils.isEmpty(w0d0Var.m200850b())) {
            c16188aM67307m.m107536c("roomId", w0d0Var.m200850b());
        }
        if (!TextUtils.isEmpty(w0d0Var.m200849a())) {
            c16188aM67307m.m107536c("liveId", w0d0Var.m200849a());
        }
        return c16188aM67307m.m107537d();
    }

    public abstract String getRightListUrlStr(s8k0 s8k0Var);

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
