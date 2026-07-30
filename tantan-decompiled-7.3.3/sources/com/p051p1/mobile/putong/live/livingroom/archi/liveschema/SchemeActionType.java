package com.p051p1.mobile.putong.live.livingroom.archi.liveschema;

import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardType;
import p153l.aek0;
import p153l.aeo;
import p153l.afp;
import p153l.aoo0;
import p153l.atb;
import p153l.b7k0;
import p153l.bfn0;
import p153l.bk1;
import p153l.boh0;
import p153l.bwh0;
import p153l.bzr;
import p153l.c35;
import p153l.cmn;
import p153l.cpm0;
import p153l.dfg;
import p153l.dlj;
import p153l.e8o0;
import p153l.eik0;
import p153l.enp0;
import p153l.ero0;
import p153l.eso0;
import p153l.fje;
import p153l.fpj;
import p153l.fzl0;
import p153l.h3j0;
import p153l.hgn;
import p153l.i4m0;
import p153l.i7f0;
import p153l.iin;
import p153l.ivo0;
import p153l.ix50;
import p153l.j6g;
import p153l.j7f0;
import p153l.jeo0;
import p153l.kcp;
import p153l.kxl0;
import p153l.ky50;
import p153l.l7f0;
import p153l.lsq;
import p153l.m24;
import p153l.ne10;
import p153l.nyj;
import p153l.nz4;
import p153l.o2e0;
import p153l.o7f0;
import p153l.o8m0;
import p153l.ofk0;
import p153l.oul0;
import p153l.p2f;
import p153l.p7f0;
import p153l.peo0;
import p153l.pln0;
import p153l.pp90;
import p153l.pxp;
import p153l.q7f0;
import p153l.qro0;
import p153l.qxp;
import p153l.qy50;
import p153l.r3n0;
import p153l.rbe0;
import p153l.rcn0;
import p153l.rn90;
import p153l.rpq;
import p153l.rx50;
import p153l.ry50;
import p153l.s3l;
import p153l.s7f0;
import p153l.seo0;
import p153l.swk;
import p153l.sx50;
import p153l.t7f0;
import p153l.tme0;
import p153l.tx50;
import p153l.u5g;
import p153l.u7f0;
import p153l.ueg;
import p153l.ukk0;
import p153l.uv4;
import p153l.ux50;
import p153l.v01;
import p153l.v3m0;
import p153l.v7f0;
import p153l.vjo0;
import p153l.vqi;
import p153l.w06;
import p153l.w7f0;
import p153l.wx50;
import p153l.x1r;
import p153l.x7f0;
import p153l.xqn0;
import p153l.xt5;
import p153l.y5g;
import p153l.y7f0;
import p153l.z7f0;
import p153l.zao0;
import p153l.zqo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class SchemeActionType {
    private static final /* synthetic */ SchemeActionType[] $VALUES = $values();
    public static final SchemeActionType ACTION_ANCHOR_GUARD;
    public static final SchemeActionType ACTION_CONSUME_ALERT;
    public static final SchemeActionType ACTION_DYNAMIC_SCHEME;
    public static final SchemeActionType ACTION_GENERATE_STAR_RED_PACKET;
    public static final SchemeActionType ACTION_GIFT_DIALOG_SWITCH_PACKET_PANEL;
    public static final SchemeActionType ACTION_GIFT_SUIT;
    public static final SchemeActionType ACTION_HIDE_FANS_CLUB;
    public static final SchemeActionType ACTION_JOIN_FAN_BASE_AFTER_SEND_GIFT;
    public static final SchemeActionType ACTION_JUMP_FAN_BASE_RED_PACKET;
    public static final SchemeActionType ACTION_JUMP_ROOM;
    public static final SchemeActionType ACTION_ONLINE_GUARD;
    public static final SchemeActionType ACTION_OPEN_ARTICULATION_DIALOG;
    public static final SchemeActionType ACTION_OPEN_BLACK_LIST_DIALOG;
    public static final SchemeActionType ACTION_OPEN_CALL_CARD_DIALOG;
    public static final SchemeActionType ACTION_OPEN_DEBLOCK_ANCHOR_ACTION;
    public static final SchemeActionType ACTION_OPEN_INPUT_BAR;
    public static final SchemeActionType ACTION_OPEN_INTL_GAME_BOARD_DIALOG;
    public static final SchemeActionType ACTION_OPEN_INTL_MEDAL_WALL;
    public static final SchemeActionType ACTION_OPEN_INTL_MUSIC_PAGE;
    public static final SchemeActionType ACTION_OPEN_INTL_SERVICE_CENTER;
    public static final SchemeActionType ACTION_OPEN_INTL_VOICE_SHARE_PANEL;
    public static final SchemeActionType ACTION_OPEN_MEDAL;
    public static final SchemeActionType ACTION_OPEN_PK_STATE_PANEL;
    public static final SchemeActionType ACTION_OPEN_SUPER_GOD_DIALOG;
    public static final SchemeActionType ACTION_OPEN_TOP_CHAT_DIALOG;
    public static final SchemeActionType ACTION_OPEN_VOICE_GAME_DIALOG;
    public static final SchemeActionType ACTION_OPEN_VOICE_LIMIT_HOUSE_DIALOG;
    public static final SchemeActionType ACTION_OPEN_VOICE_SHARE_PANEL;
    public static final SchemeActionType ACTION_POTENTIAL_GUARD;
    public static final SchemeActionType ACTION_SEND_GIFT;
    public static final SchemeActionType ACTION_SEND_VOICE_BROADCAST;
    public static final SchemeActionType ACTION_SHOW_CHAT_INPUT;
    public static final SchemeActionType ACTION_SHOW_CHAT_MANAGER_DIALOG;
    public static final SchemeActionType ACTION_SHOW_CHAT_SHADE;
    public static final SchemeActionType ACTION_SHOW_COMPANION;
    public static final SchemeActionType ACTION_SHOW_CONFESS_GIFT_DETAIL_DIALOG;
    public static final SchemeActionType ACTION_SHOW_CP_GIFT_DETAIL_DIALOG;
    public static final SchemeActionType ACTION_SHOW_DRAW_GUESS_PANEL;
    public static final SchemeActionType ACTION_SHOW_FANS_CLUB;
    public static final SchemeActionType ACTION_SHOW_FANS_CLUB_COMPANY;
    public static final SchemeActionType ACTION_SHOW_FAN_BASE_ENTRY;
    public static final SchemeActionType ACTION_SHOW_FIRST_RECHARGE;
    public static final SchemeActionType ACTION_SHOW_GIFT_DETAIL;
    public static final SchemeActionType ACTION_SHOW_GIFT_DIALOG;
    public static final SchemeActionType ACTION_SHOW_GIFT_SKIN_DIALOG;
    public static final SchemeActionType ACTION_SHOW_H5;
    public static final SchemeActionType ACTION_SHOW_INTL_OCTOPUS_GAME;
    public static final SchemeActionType ACTION_SHOW_MULTI_CALL_APPLY_DIALOG;
    public static final SchemeActionType ACTION_SHOW_MULTI_CALL_DIALOG;
    public static final SchemeActionType ACTION_SHOW_NOTICE_PANEL;
    public static final SchemeActionType ACTION_SHOW_PLAY_LIBRARY_PANEL;
    public static final SchemeActionType ACTION_SHOW_PROFILE_CARD_SKIN;
    public static final SchemeActionType ACTION_SHOW_PROFILE_PAGE;
    public static final SchemeActionType ACTION_SHOW_RECHARGE_DIALOG;
    public static final SchemeActionType ACTION_SHOW_SCRAP_INFO_DIALOG;
    public static final SchemeActionType ACTION_SHOW_STORM_DANMAKU;
    public static final SchemeActionType ACTION_SHOW_SUD_GAME_DIALOG;
    public static final SchemeActionType ACTION_SHOW_TT_RECHARGE_PAGE;
    public static final SchemeActionType ACTION_SHOW_USER_CARD;
    public static final SchemeActionType ACTION_SHOW_USER_DAILY_TASK;
    public static final SchemeActionType ACTION_SHOW_USER_MEDAL;
    public static final SchemeActionType ACTION_SHOW_USER_RIGHTS_PAGE;
    public static final SchemeActionType ACTION_SHOW_USER_VOICE_RIGHTS_PAGE;
    public static final SchemeActionType ACTION_SHOW_VIP_PURCHASE_DIALOG;
    public static final SchemeActionType ACTION_SHOW_VIRTUAL_AVATAR_PANEL;
    public static final SchemeActionType ACTION_SHOW_VOCIE_SWEET_CP_HOUSE;
    public static final SchemeActionType ACTION_SHOW_VOICE_MIC_EMOJI_DIALOG;
    public static final SchemeActionType ACTION_SHOW_VOICE_PAY_GUIDE_USER;
    public static final SchemeActionType ACTION_SHOW_VOICE_ROOMGRABHAT;
    public static final SchemeActionType ACTION_SHOW_VOICE_ROOM_MANAGER_PANEL;
    public static final SchemeActionType ACTION_SHOW_VOICE_SWEET_CP_DIALOG;
    public static final SchemeActionType ACTION_SHOW_VOTE_MANAGER_DIALOG;
    public static final SchemeActionType ACTION_SHOW_WHO_IS_UNDERCOVER_PANEL;
    public static final SchemeActionType ACTION_SIGN_IN_MAIN_PAGE;
    public static final SchemeActionType ACTION_SIGN_IN_MEDAL_PAGE;
    public static final SchemeActionType ACTION_SIGN_IN_PRIZE_AVATAR_BOARD;
    public static final SchemeActionType ACTION_SIGN_IN_PRIZE_ENTER_EFFECTS;
    public static final SchemeActionType ACTION_SWITCH_VOICE_LIVE_MODE;
    public static final SchemeActionType ACTION_USER_GUARD;
    public static final SchemeActionType ACTION_VIRTUAL_FLOWER_BOARD_PAGE;
    public static final SchemeActionType ACTION_VIRTUAL_ROOM_LEVEL_DETAIL;
    public static final SchemeActionType ACTION_VOICE_AUCTION;
    public static final SchemeActionType ACTION_VOICE_KTV;
    public static final SchemeActionType ACTION_VOICE_NORMAL;
    public static final SchemeActionType ACTION_VOICE_ROOM_CANCEL_ENROLLMEN;
    public static final SchemeActionType ACTION_VOICE_ROOM_DELETE_ROOM;
    public static final SchemeActionType ACTION_VOICE_ROOM_FEEDBACK;
    public static final SchemeActionType ACTION_VOICE_ROOM_GIFT_WALL;
    public static final SchemeActionType ACTION_VOICE_ROOM_HEAT_PANEL;
    public static final SchemeActionType ACTION_VOICE_ROOM_MEMBER_MANAGE;
    public static final SchemeActionType ACTION_VOICE_ROOM_MORE_SETTING;
    public static final SchemeActionType ACTION_VOICE_ROOM_NOTIFY_FANS;
    public static final SchemeActionType ACTION_VOICE_ROOM_REPORT;
    public static final SchemeActionType ACTION_VOICE_ROOM_SET_BACKGROUND;
    public static final SchemeActionType ACTION_VOICE_SETTLE_GUIDE;
    public static final SchemeActionType FANBASEGROUP_APPKY_MANAGE_DIALOG;
    public static final SchemeActionType FANBASEGROUP_MANAGE_DIALOG;
    public static final SchemeActionType IntlFeedbackAction;
    private String action;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$1 */
    public final enum C127761 extends SchemeActionType {
        private C127761(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new swk();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$10 */
    public final enum C1277710 extends SchemeActionType {
        private C1277710(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new uv4();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$11 */
    public final enum C1277811 extends SchemeActionType {
        private C1277811(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new s3l();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$12 */
    public final enum C1277912 extends SchemeActionType {
        private C1277912(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new j7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$13 */
    public final enum C1278013 extends SchemeActionType {
        private C1278013(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new u5g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$14 */
    public final enum C1278114 extends SchemeActionType {
        private C1278114(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new oul0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$15 */
    public final enum C1278215 extends SchemeActionType {
        private C1278215(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new eik0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$16 */
    public final enum C1278316 extends SchemeActionType {
        private C1278316(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new ukk0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$17 */
    public final enum C1278417 extends SchemeActionType {
        private C1278417(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new rn90();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$18 */
    public final enum C1278518 extends SchemeActionType {
        private C1278518(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new bwh0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$19 */
    public final enum C1278619 extends SchemeActionType {
        private C1278619(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new x1r();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$2 */
    public final enum C127872 extends SchemeActionType {
        private C127872(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new zqo();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$20 */
    public final enum C1278820 extends SchemeActionType {
        private C1278820(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new x1r();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$21 */
    public final enum C1278921 extends SchemeActionType {
        private C1278921(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new x1r();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$22 */
    public final enum C1279022 extends SchemeActionType {
        private C1279022(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new x1r();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$23 */
    public final enum C1279123 extends SchemeActionType {
        private C1279123(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new rbe0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$24 */
    public final enum C1279224 extends SchemeActionType {
        private C1279224(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new nz4();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$25 */
    public final enum C1279325 extends SchemeActionType {
        private C1279325(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new nyj();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$26 */
    public final enum C1279426 extends SchemeActionType {
        private C1279426(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new boh0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$27 */
    public final enum C1279527 extends SchemeActionType {
        private C1279527(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new s7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$28 */
    public final enum C1279628 extends SchemeActionType {
        private C1279628(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new t7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$29 */
    public final enum C1279729 extends SchemeActionType {
        private C1279729(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new bk1();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$3 */
    public final enum C127983 extends SchemeActionType {
        private C127983(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new b7k0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$30 */
    public final enum C1279930 extends SchemeActionType {
        private C1279930(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new p2f();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$31 */
    public final enum C1280031 extends SchemeActionType {
        private C1280031(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new ofk0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$32 */
    public final enum C1280132 extends SchemeActionType {
        private C1280132(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new c35();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$33 */
    public final enum C1280233 extends SchemeActionType {
        private C1280233(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new pp90();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$34 */
    public final enum C1280334 extends SchemeActionType {
        private C1280334(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new aek0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$35 */
    public final enum C1280435 extends SchemeActionType {
        private C1280435(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new o7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$36 */
    public final enum C1280536 extends SchemeActionType {
        private C1280536(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new u7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$37 */
    public final enum C1280637 extends SchemeActionType {
        private C1280637(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new enp0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$38 */
    public final enum C1280738 extends SchemeActionType {
        private C1280738(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new xt5();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$39 */
    public final enum C1280839 extends SchemeActionType {
        private C1280839(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new atb();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$4 */
    public final enum C128094 extends SchemeActionType {
        private C128094(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new fpj();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$40 */
    public final enum C1281040 extends SchemeActionType {
        private C1281040(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new ne10();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$41 */
    public final enum C1281141 extends SchemeActionType {
        private C1281141(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new kxl0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$42 */
    public final enum C1281242 extends SchemeActionType {
        private C1281242(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new z7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$43 */
    public final enum C1281343 extends SchemeActionType {
        private C1281343(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new i7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$44 */
    public final enum C1281444 extends SchemeActionType {
        private C1281444(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new q7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$45 */
    public final enum C1281545 extends SchemeActionType {
        private C1281545(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new x7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$46 */
    public final enum C1281646 extends SchemeActionType {
        private C1281646(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new ueg();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$47 */
    public final enum C1281747 extends SchemeActionType {
        private C1281747(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new dfg();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$48 */
    public final enum C1281848 extends SchemeActionType {
        private C1281848(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new tme0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$49 */
    public final enum C1281949 extends SchemeActionType {
        private C1281949(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new h3j0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$5 */
    public final enum C128205 extends SchemeActionType {
        private C128205(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new j6g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$50 */
    public final enum C1282150 extends SchemeActionType {
        private C1282150(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new rpq();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$51 */
    public final enum C1282251 extends SchemeActionType {
        private C1282251(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new ix50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$52 */
    public final enum C1282352 extends SchemeActionType {
        private C1282352(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new qy50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$53 */
    public final enum C1282453 extends SchemeActionType {
        private C1282453(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new cpm0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$54 */
    public final enum C1282554 extends SchemeActionType {
        private C1282554(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new xqn0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$55 */
    public final enum C1282655 extends SchemeActionType {
        private C1282655(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new jeo0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$56 */
    public final enum C1282756 extends SchemeActionType {
        private C1282756(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new y7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$57 */
    public final enum C1282857 extends SchemeActionType {
        private C1282857(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new ero0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$58 */
    public final enum C1282958 extends SchemeActionType {
        private C1282958(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new w06();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$59 */
    public final enum C1283059 extends SchemeActionType {
        private C1283059(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new ry50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$6 */
    public final enum C128316 extends SchemeActionType {
        private C128316(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new lsq();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$60 */
    public final enum C1283260 extends SchemeActionType {
        private C1283260(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new aoo0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$61 */
    public final enum C1283361 extends SchemeActionType {
        private C1283361(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new tx50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$62 */
    public final enum C1283462 extends SchemeActionType {
        private C1283462(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new bzr();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$63 */
    public final enum C1283563 extends SchemeActionType {
        private C1283563(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new vjo0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$64 */
    public final enum C1283664 extends SchemeActionType {
        private C1283664(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new bfn0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$65 */
    public final enum C1283765 extends SchemeActionType {
        private C1283765(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new seo0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$66 */
    public final enum C1283866 extends SchemeActionType {
        private C1283866(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new rcn0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$67 */
    public final enum C1283967 extends SchemeActionType {
        private C1283967(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new e8o0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$68 */
    public final enum C1284068 extends SchemeActionType {
        private C1284068(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new pln0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$69 */
    public final enum C1284169 extends SchemeActionType {
        private C1284169(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new ivo0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$7 */
    public final enum C128427 extends SchemeActionType {
        private C128427(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new wx50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$70 */
    public final enum C1284370 extends SchemeActionType {
        private C1284370(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new v3m0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$71 */
    public final enum C1284471 extends SchemeActionType {
        private C1284471(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new zao0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$72 */
    public final enum C1284572 extends SchemeActionType {
        private C1284572(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new r3n0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$73 */
    public final enum C1284673 extends SchemeActionType {
        private C1284673(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new m24();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$74 */
    public final enum C1284774 extends SchemeActionType {
        private C1284774(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new v01();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$75 */
    public final enum C1284875 extends SchemeActionType {
        private C1284875(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new eso0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$76 */
    public final enum C1284976 extends SchemeActionType {
        private C1284976(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new qro0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$77 */
    public final enum C1285077 extends SchemeActionType {
        private C1285077(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new fzl0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$78 */
    public final enum C1285178 extends SchemeActionType {
        private C1285178(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new o8m0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$79 */
    public final enum C1285279 extends SchemeActionType {
        private C1285279(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new i4m0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$8 */
    public final enum C128538 extends SchemeActionType {
        private C128538(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new vqi();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$80 */
    public final enum C1285480 extends SchemeActionType {
        private C1285480(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new l7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$81 */
    public final enum C1285581 extends SchemeActionType {
        private C1285581(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new v7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$82 */
    public final enum C1285682 extends SchemeActionType {
        private C1285682(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new w7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$83 */
    public final enum C1285783 extends SchemeActionType {
        private C1285783(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new ux50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$84 */
    public final enum C1285884 extends SchemeActionType {
        private C1285884(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new ky50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$85 */
    public final enum C1285985 extends SchemeActionType {
        private C1285985(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new peo0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$86 */
    public final enum C1286086 extends SchemeActionType {
        private C1286086(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new fje();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$87 */
    public final enum C1286187 extends SchemeActionType {
        private C1286187(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new afp();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$88 */
    public final enum C1286288 extends SchemeActionType {
        private C1286288(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new iin();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$89 */
    public final enum C1286389 extends SchemeActionType {
        private C1286389(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new pxp();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$9 */
    public final enum C128649 extends SchemeActionType {
        private C128649(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new y5g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$90 */
    public final enum C1286590 extends SchemeActionType {
        private C1286590(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new qxp();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$91 */
    public final enum C1286691 extends SchemeActionType {
        private C1286691(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new kcp();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$92 */
    public final enum C1286792 extends SchemeActionType {
        private C1286792(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new aeo();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$93 */
    public final enum C1286893 extends SchemeActionType {
        private C1286893(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new dlj();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$94 */
    public final enum C1286994 extends SchemeActionType {
        private C1286994(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new sx50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$95 */
    public final enum C1287095 extends SchemeActionType {
        private C1287095(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new rx50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$96 */
    public final enum C1287196 extends SchemeActionType {
        private C1287196(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new p7f0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$97 */
    public final enum C1287297 extends SchemeActionType {
        private C1287297(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new cmn();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$98 */
    public final enum C1287398 extends SchemeActionType {
        private C1287398(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public o2e0 getSchemaAction() {
            return new hgn();
        }
    }

    private static /* synthetic */ SchemeActionType[] $values() {
        return new SchemeActionType[]{ACTION_SHOW_H5, ACTION_SHOW_INTL_OCTOPUS_GAME, ACTION_SHOW_USER_CARD, ACTION_SHOW_GIFT_DIALOG, ACTION_SHOW_FANS_CLUB_COMPANY, ACTION_JUMP_ROOM, ACTION_SHOW_RECHARGE_DIALOG, ACTION_SHOW_FIRST_RECHARGE, ACTION_SHOW_FAN_BASE_ENTRY, ACTION_SHOW_CHAT_INPUT, ACTION_HIDE_FANS_CLUB, ACTION_SHOW_FANS_CLUB, ACTION_JUMP_FAN_BASE_RED_PACKET, ACTION_SHOW_VIP_PURCHASE_DIALOG, ACTION_SHOW_USER_RIGHTS_PAGE, ACTION_SHOW_USER_VOICE_RIGHTS_PAGE, ACTION_SHOW_PROFILE_PAGE, ACTION_SHOW_TT_RECHARGE_PAGE, ACTION_USER_GUARD, ACTION_ANCHOR_GUARD, ACTION_POTENTIAL_GUARD, ACTION_ONLINE_GUARD, ACTION_SHOW_SCRAP_INFO_DIALOG, ACTION_SHOW_CHAT_MANAGER_DIALOG, ACTION_GIFT_SUIT, ACTION_GIFT_DIALOG_SWITCH_PACKET_PANEL, ACTION_SIGN_IN_MAIN_PAGE, ACTION_SIGN_IN_MEDAL_PAGE, ACTION_SIGN_IN_PRIZE_AVATAR_BOARD, ACTION_SIGN_IN_PRIZE_ENTER_EFFECTS, ACTION_SHOW_USER_MEDAL, ACTION_SHOW_CHAT_SHADE, ACTION_SHOW_PROFILE_CARD_SKIN, ACTION_SHOW_USER_DAILY_TASK, ACTION_SHOW_MULTI_CALL_APPLY_DIALOG, ACTION_SHOW_STORM_DANMAKU, ACTION_SHOW_VOTE_MANAGER_DIALOG, ACTION_SHOW_CONFESS_GIFT_DETAIL_DIALOG, ACTION_SHOW_CP_GIFT_DETAIL_DIALOG, ACTION_SHOW_MULTI_CALL_DIALOG, ACTION_SHOW_VIRTUAL_AVATAR_PANEL, ACTION_SHOW_WHO_IS_UNDERCOVER_PANEL, ACTION_SHOW_DRAW_GUESS_PANEL, ACTION_SHOW_PLAY_LIBRARY_PANEL, ACTION_SHOW_VOICE_ROOM_MANAGER_PANEL, FANBASEGROUP_APPKY_MANAGE_DIALOG, FANBASEGROUP_MANAGE_DIALOG, ACTION_SEND_GIFT, ACTION_OPEN_TOP_CHAT_DIALOG, ACTION_JOIN_FAN_BASE_AFTER_SEND_GIFT, ACTION_OPEN_DEBLOCK_ANCHOR_ACTION, ACTION_SHOW_VOICE_ROOMGRABHAT, ACTION_VOICE_AUCTION, ACTION_VOICE_KTV, ACTION_VOICE_NORMAL, ACTION_SHOW_VOICE_SWEET_CP_DIALOG, ACTION_VOICE_ROOM_SET_BACKGROUND, ACTION_CONSUME_ALERT, ACTION_OPEN_VOICE_SHARE_PANEL, ACTION_VOICE_ROOM_GIFT_WALL, ACTION_OPEN_INTL_VOICE_SHARE_PANEL, ACTION_OPEN_BLACK_LIST_DIALOG, ACTION_VOICE_ROOM_REPORT, ACTION_VOICE_ROOM_FEEDBACK, ACTION_VOICE_ROOM_NOTIFY_FANS, ACTION_VOICE_ROOM_DELETE_ROOM, ACTION_VOICE_ROOM_MEMBER_MANAGE, ACTION_VOICE_ROOM_HEAT_PANEL, ACTION_GENERATE_STAR_RED_PACKET, ACTION_VIRTUAL_ROOM_LEVEL_DETAIL, ACTION_VOICE_ROOM_MORE_SETTING, ACTION_VOICE_ROOM_CANCEL_ENROLLMEN, ACTION_OPEN_CALL_CARD_DIALOG, ACTION_OPEN_ARTICULATION_DIALOG, ACTION_VOICE_SETTLE_GUIDE, ACTION_SWITCH_VOICE_LIVE_MODE, ACTION_VIRTUAL_FLOWER_BOARD_PAGE, ACTION_OPEN_MEDAL, ACTION_SHOW_COMPANION, ACTION_SHOW_GIFT_SKIN_DIALOG, ACTION_SHOW_VOICE_MIC_EMOJI_DIALOG, ACTION_SHOW_VOICE_PAY_GUIDE_USER, ACTION_OPEN_PK_STATE_PANEL, ACTION_OPEN_SUPER_GOD_DIALOG, ACTION_SEND_VOICE_BROADCAST, ACTION_DYNAMIC_SCHEME, ACTION_SHOW_SUD_GAME_DIALOG, ACTION_OPEN_INTL_GAME_BOARD_DIALOG, ACTION_OPEN_VOICE_LIMIT_HOUSE_DIALOG, ACTION_SHOW_VOCIE_SWEET_CP_HOUSE, ACTION_OPEN_INTL_SERVICE_CENTER, ACTION_OPEN_INTL_MEDAL_WALL, ACTION_OPEN_VOICE_GAME_DIALOG, ACTION_OPEN_INTL_MUSIC_PAGE, ACTION_OPEN_INPUT_BAR, ACTION_SHOW_NOTICE_PANEL, ACTION_SHOW_GIFT_DETAIL, IntlFeedbackAction};
    }

    static {
        ACTION_SHOW_H5 = new C127761("ACTION_SHOW_H5", 0, "showH5");
        ACTION_SHOW_INTL_OCTOPUS_GAME = new C127872("ACTION_SHOW_INTL_OCTOPUS_GAME", 1, "octopusGame");
        ACTION_SHOW_USER_CARD = new C127983("ACTION_SHOW_USER_CARD", 2, "showUserCard");
        ACTION_SHOW_GIFT_DIALOG = new C128094("ACTION_SHOW_GIFT_DIALOG", 3, "showGiftDialog");
        ACTION_SHOW_FANS_CLUB_COMPANY = new C128205("ACTION_SHOW_FANS_CLUB_COMPANY", 4, "showAccommpanyEntry");
        ACTION_JUMP_ROOM = new C128316("ACTION_JUMP_ROOM", 5, "jumpRoom");
        ACTION_SHOW_RECHARGE_DIALOG = new C128427("ACTION_SHOW_RECHARGE_DIALOG", 6, "showRechargeDialog");
        ACTION_SHOW_FIRST_RECHARGE = new C128538("ACTION_SHOW_FIRST_RECHARGE", 7, "showFirstRecharge");
        ACTION_SHOW_FAN_BASE_ENTRY = new C128649("ACTION_SHOW_FAN_BASE_ENTRY", 8, "showFanbaseEntry");
        ACTION_SHOW_CHAT_INPUT = new C1277710("ACTION_SHOW_CHAT_INPUT", 9, "showChatInput");
        ACTION_HIDE_FANS_CLUB = new C1277811("ACTION_HIDE_FANS_CLUB", 10, "hideFanbase");
        ACTION_SHOW_FANS_CLUB = new C1277912("ACTION_SHOW_FANS_CLUB", 11, "showFanbase");
        ACTION_JUMP_FAN_BASE_RED_PACKET = new C1278013("ACTION_JUMP_FAN_BASE_RED_PACKET", 12, "jumpFanbaseRedPacket");
        ACTION_SHOW_VIP_PURCHASE_DIALOG = new C1278114("ACTION_SHOW_VIP_PURCHASE_DIALOG", 13, "showVipPurchaseDialog");
        ACTION_SHOW_USER_RIGHTS_PAGE = new C1278215("ACTION_SHOW_USER_RIGHTS_PAGE", 14, "showUserRightsPage");
        ACTION_SHOW_USER_VOICE_RIGHTS_PAGE = new C1278316("ACTION_SHOW_USER_VOICE_RIGHTS_PAGE", 15, "showUserVoiceRightsPage");
        ACTION_SHOW_PROFILE_PAGE = new C1278417("ACTION_SHOW_PROFILE_PAGE", 16, "showProfilePage");
        ACTION_SHOW_TT_RECHARGE_PAGE = new C1278518("ACTION_SHOW_TT_RECHARGE_PAGE", 17, "showTTCoinDialog");
        ACTION_USER_GUARD = new C1278619("ACTION_USER_GUARD", 18, BLiveGuardType.userGuard);
        ACTION_ANCHOR_GUARD = new C1278820("ACTION_ANCHOR_GUARD", 19, BLiveGuardType.anchorGuard);
        ACTION_POTENTIAL_GUARD = new C1278921("ACTION_POTENTIAL_GUARD", 20, BLiveGuardType.potentialGuard);
        ACTION_ONLINE_GUARD = new C1279022("ACTION_ONLINE_GUARD", 21, BLiveGuardType.onlineGuard);
        ACTION_SHOW_SCRAP_INFO_DIALOG = new C1279123("ACTION_SHOW_SCRAP_INFO_DIALOG", 22, "showScrapDialog");
        ACTION_SHOW_CHAT_MANAGER_DIALOG = new C1279224("ACTION_SHOW_CHAT_MANAGER_DIALOG", 23, BLiveButtonType.chatManager);
        ACTION_GIFT_SUIT = new C1279325("ACTION_GIFT_SUIT", 24, "showGiftSetInfo");
        ACTION_GIFT_DIALOG_SWITCH_PACKET_PANEL = new C1279426("ACTION_GIFT_DIALOG_SWITCH_PACKET_PANEL", 25, "switchPacketPanel");
        ACTION_SIGN_IN_MAIN_PAGE = new C1279527("ACTION_SIGN_IN_MAIN_PAGE", 26, "showSignInDialog");
        ACTION_SIGN_IN_MEDAL_PAGE = new C1279628("ACTION_SIGN_IN_MEDAL_PAGE", 27, "showSignInMedal");
        ACTION_SIGN_IN_PRIZE_AVATAR_BOARD = new C1279729("ACTION_SIGN_IN_PRIZE_AVATAR_BOARD", 28, "showAvatarBoard");
        ACTION_SIGN_IN_PRIZE_ENTER_EFFECTS = new C1279930("ACTION_SIGN_IN_PRIZE_ENTER_EFFECTS", 29, "showEnterEffects");
        ACTION_SHOW_USER_MEDAL = new C1280031("ACTION_SHOW_USER_MEDAL", 30, "showUserMedal");
        ACTION_SHOW_CHAT_SHADE = new C1280132("ACTION_SHOW_CHAT_SHADE", 31, "showChatShade");
        ACTION_SHOW_PROFILE_CARD_SKIN = new C1280233("ACTION_SHOW_PROFILE_CARD_SKIN", 32, "showProfileCardSkin");
        ACTION_SHOW_USER_DAILY_TASK = new C1280334("ACTION_SHOW_USER_DAILY_TASK", 33, "showUserDailyTask");
        ACTION_SHOW_MULTI_CALL_APPLY_DIALOG = new C1280435("ACTION_SHOW_MULTI_CALL_APPLY_DIALOG", 34, "showMultiCallApplyDialog");
        ACTION_SHOW_STORM_DANMAKU = new C1280536("ACTION_SHOW_STORM_DANMAKU", 35, "showStormBullet");
        ACTION_SHOW_VOTE_MANAGER_DIALOG = new C1280637("ACTION_SHOW_VOTE_MANAGER_DIALOG", 36, "openVoteManager");
        ACTION_SHOW_CONFESS_GIFT_DETAIL_DIALOG = new C1280738("ACTION_SHOW_CONFESS_GIFT_DETAIL_DIALOG", 37, "showConfessGiftDetailDialog");
        ACTION_SHOW_CP_GIFT_DETAIL_DIALOG = new C1280839("ACTION_SHOW_CP_GIFT_DETAIL_DIALOG", 38, "showCpGiftDetailDialog");
        ACTION_SHOW_MULTI_CALL_DIALOG = new C1281040("ACTION_SHOW_MULTI_CALL_DIALOG", 39, "showMultiCallDialog");
        ACTION_SHOW_VIRTUAL_AVATAR_PANEL = new C1281141("ACTION_SHOW_VIRTUAL_AVATAR_PANEL", 40, "showVirtualAvatarPanel");
        ACTION_SHOW_WHO_IS_UNDERCOVER_PANEL = new C1281242("ACTION_SHOW_WHO_IS_UNDERCOVER_PANEL", 41, "showWhoIsUndercoverPanel");
        ACTION_SHOW_DRAW_GUESS_PANEL = new C1281343("ACTION_SHOW_DRAW_GUESS_PANEL", 42, "showDrawGuessPanel");
        ACTION_SHOW_PLAY_LIBRARY_PANEL = new C1281444("ACTION_SHOW_PLAY_LIBRARY_PANEL", 43, "game-lib");
        ACTION_SHOW_VOICE_ROOM_MANAGER_PANEL = new C1281545("ACTION_SHOW_VOICE_ROOM_MANAGER_PANEL", 44, "showVoiceRoomManagerPanel");
        FANBASEGROUP_APPKY_MANAGE_DIALOG = new C1281646("FANBASEGROUP_APPKY_MANAGE_DIALOG", 45, "fanBaseGroupApplyManage");
        FANBASEGROUP_MANAGE_DIALOG = new C1281747("FANBASEGROUP_MANAGE_DIALOG", 46, "fanBaseGroupManage");
        ACTION_SEND_GIFT = new C1281848("ACTION_SEND_GIFT", 47, "sendGift");
        ACTION_OPEN_TOP_CHAT_DIALOG = new C1281949("ACTION_OPEN_TOP_CHAT_DIALOG", 48, "openTopChatDialog");
        ACTION_JOIN_FAN_BASE_AFTER_SEND_GIFT = new C1282150("ACTION_JOIN_FAN_BASE_AFTER_SEND_GIFT", 49, "joinFanbaseAfterSendGift");
        ACTION_OPEN_DEBLOCK_ANCHOR_ACTION = new C1282251("ACTION_OPEN_DEBLOCK_ANCHOR_ACTION", 50, "openDeblockAnchorPage");
        ACTION_SHOW_VOICE_ROOMGRABHAT = new C1282352("ACTION_SHOW_VOICE_ROOMGRABHAT", 51, "showVoiceRoomGrabHat");
        ACTION_VOICE_AUCTION = new C1282453("ACTION_VOICE_AUCTION", 52, "voice_auction");
        ACTION_VOICE_KTV = new C1282554("ACTION_VOICE_KTV", 53, "KTV");
        ACTION_VOICE_NORMAL = new C1282655("ACTION_VOICE_NORMAL", 54, "voice_normal");
        ACTION_SHOW_VOICE_SWEET_CP_DIALOG = new C1282756("ACTION_SHOW_VOICE_SWEET_CP_DIALOG", 55, "openSweetCp");
        ACTION_VOICE_ROOM_SET_BACKGROUND = new C1282857("ACTION_VOICE_ROOM_SET_BACKGROUND", 56, "setVoiceRoomBg");
        ACTION_CONSUME_ALERT = new C1282958("ACTION_CONSUME_ALERT", 57, "consume_alert");
        ACTION_OPEN_VOICE_SHARE_PANEL = new C1283059("ACTION_OPEN_VOICE_SHARE_PANEL", 58, "openSharePanel");
        ACTION_VOICE_ROOM_GIFT_WALL = new C1283260("ACTION_VOICE_ROOM_GIFT_WALL", 59, "openGiftWallBook");
        ACTION_OPEN_INTL_VOICE_SHARE_PANEL = new C1283361("ACTION_OPEN_INTL_VOICE_SHARE_PANEL", 60, "openIntlSharePanel");
        ACTION_OPEN_BLACK_LIST_DIALOG = new C1283462("ACTION_OPEN_BLACK_LIST_DIALOG", 61, BLiveButtonType.blackList);
        ACTION_VOICE_ROOM_REPORT = new C1283563("ACTION_VOICE_ROOM_REPORT", 62, "report");
        ACTION_VOICE_ROOM_FEEDBACK = new C1283664("ACTION_VOICE_ROOM_FEEDBACK", 63, MessageType.feedback);
        ACTION_VOICE_ROOM_NOTIFY_FANS = new C1283765("ACTION_VOICE_ROOM_NOTIFY_FANS", 64, "notifyfans");
        ACTION_VOICE_ROOM_DELETE_ROOM = new C1283866("ACTION_VOICE_ROOM_DELETE_ROOM", 65, "deleteroom");
        ACTION_VOICE_ROOM_MEMBER_MANAGE = new C1283967("ACTION_VOICE_ROOM_MEMBER_MANAGE", 66, "memberManage");
        ACTION_VOICE_ROOM_HEAT_PANEL = new C1284068("ACTION_VOICE_ROOM_HEAT_PANEL", 67, "showHeatPanel");
        ACTION_GENERATE_STAR_RED_PACKET = new C1284169("ACTION_GENERATE_STAR_RED_PACKET", 68, "generateStarRedPacket");
        ACTION_VIRTUAL_ROOM_LEVEL_DETAIL = new C1284370("ACTION_VIRTUAL_ROOM_LEVEL_DETAIL", 69, "levelRightDetail");
        ACTION_VOICE_ROOM_MORE_SETTING = new C1284471("ACTION_VOICE_ROOM_MORE_SETTING", 70, "showMoreSettings");
        ACTION_VOICE_ROOM_CANCEL_ENROLLMEN = new C1284572("ACTION_VOICE_ROOM_CANCEL_ENROLLMEN", 71, "cancelenrollmen");
        ACTION_OPEN_CALL_CARD_DIALOG = new C1284673("ACTION_OPEN_CALL_CARD_DIALOG", 72, "openNobleChatDialog");
        ACTION_OPEN_ARTICULATION_DIALOG = new C1284774("ACTION_OPEN_ARTICULATION_DIALOG", 73, "openClarityPanel");
        ACTION_VOICE_SETTLE_GUIDE = new C1284875("ACTION_VOICE_SETTLE_GUIDE", 74, "settleGuide");
        ACTION_SWITCH_VOICE_LIVE_MODE = new C1284976("ACTION_SWITCH_VOICE_LIVE_MODE", 75, "switchVoiceLiveMode");
        ACTION_VIRTUAL_FLOWER_BOARD_PAGE = new C1285077("ACTION_VIRTUAL_FLOWER_BOARD_PAGE", 76, "showLeaderboard");
        ACTION_OPEN_MEDAL = new C1285178("ACTION_OPEN_MEDAL", 77, "voiceLiveGiftWall");
        ACTION_SHOW_COMPANION = new C1285279("ACTION_SHOW_COMPANION", 78, "showCompanionList");
        ACTION_SHOW_GIFT_SKIN_DIALOG = new C1285480("ACTION_SHOW_GIFT_SKIN_DIALOG", 79, "switchGiftSkinPanel");
        ACTION_SHOW_VOICE_MIC_EMOJI_DIALOG = new C1285581("ACTION_SHOW_VOICE_MIC_EMOJI_DIALOG", 80, BLiveButtonType.emojiPlayPanel);
        ACTION_SHOW_VOICE_PAY_GUIDE_USER = new C1285682("ACTION_SHOW_VOICE_PAY_GUIDE_USER", 81, "showVoicePayGuideUser");
        ACTION_OPEN_PK_STATE_PANEL = new C1285783("ACTION_OPEN_PK_STATE_PANEL", 82, "openPKStatePanel");
        ACTION_OPEN_SUPER_GOD_DIALOG = new C1285884("ACTION_OPEN_SUPER_GOD_DIALOG", 83, "showSuperGod");
        ACTION_SEND_VOICE_BROADCAST = new C1285985("ACTION_SEND_VOICE_BROADCAST", 84, "sendVoiceBroadcast");
        ACTION_DYNAMIC_SCHEME = new C1286086("ACTION_DYNAMIC_SCHEME", 85, "dynamicScheme");
        ACTION_SHOW_SUD_GAME_DIALOG = new C1286187("ACTION_SHOW_SUD_GAME_DIALOG", 86, "sudGame");
        ACTION_OPEN_INTL_GAME_BOARD_DIALOG = new C1286288("ACTION_OPEN_INTL_GAME_BOARD_DIALOG", 87, "showGameBoard");
        ACTION_OPEN_VOICE_LIMIT_HOUSE_DIALOG = new C1286389("ACTION_OPEN_VOICE_LIMIT_HOUSE_DIALOG", 88, "showVoiceLimitHouse");
        ACTION_SHOW_VOCIE_SWEET_CP_HOUSE = new C1286590("ACTION_SHOW_VOCIE_SWEET_CP_HOUSE", 89, "showSweetCPHouse");
        ACTION_OPEN_INTL_SERVICE_CENTER = new C1286691("ACTION_OPEN_INTL_SERVICE_CENTER", 90, SchemeKey.jumpIntlServiceCenter);
        ACTION_OPEN_INTL_MEDAL_WALL = new C1286792("ACTION_OPEN_INTL_MEDAL_WALL", 91, "jumpIntlMedalWall");
        ACTION_OPEN_VOICE_GAME_DIALOG = new C1286893("ACTION_OPEN_VOICE_GAME_DIALOG", 92, "game");
        ACTION_OPEN_INTL_MUSIC_PAGE = new C1286994("ACTION_OPEN_INTL_MUSIC_PAGE", 93, "openIntlMusicPage");
        ACTION_OPEN_INPUT_BAR = new C1287095("ACTION_OPEN_INPUT_BAR", 94, "openVoiceInputBar");
        ACTION_SHOW_NOTICE_PANEL = new C1287196("ACTION_SHOW_NOTICE_PANEL", 95, "showNoticePanel");
        ACTION_SHOW_GIFT_DETAIL = new C1287297("ACTION_SHOW_GIFT_DETAIL", 96, "showReceiveGiftBillPanel");
        IntlFeedbackAction = new C1287398("IntlFeedbackAction", 97, SchemeKey.jumpLiveFeedbackQuestionPage);
    }

    private SchemeActionType(String str, int i, String str2) {
        super(str, i);
        this.action = str2;
    }

    public static SchemeActionType valueOf(String str) {
        return (SchemeActionType) Enum.valueOf(SchemeActionType.class, str);
    }

    public static SchemeActionType[] values() {
        return (SchemeActionType[]) $VALUES.clone();
    }

    public String getAction() {
        return this.action;
    }

    public abstract o2e0 getSchemaAction();
}
