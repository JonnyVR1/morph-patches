package com.p046p1.mobile.putong.live.livingroom.archi.liveschema;

import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardType;
import p149l.aco;
import p149l.adp;
import p149l.aep0;
import p149l.aio0;
import p149l.ajo0;
import p149l.axr;
import p149l.azn0;
import p149l.bie;
import p149l.bql0;
import p149l.bze0;
import p149l.c1l;
import p149l.ckn;
import p149l.cp50;
import p149l.cuk;
import p149l.cze0;
import p149l.d25;
import p149l.d610;
import p149l.dui0;
import p149l.emo0;
import p149l.eq50;
import p149l.evl0;
import p149l.eze0;
import p149l.f5o0;
import p149l.g4g;
import p149l.gdg;
import p149l.gol0;
import p149l.hen;
import p149l.hze0;
import p149l.i6k0;
import p149l.ign;
import p149l.ize0;
import p149l.jij;
import p149l.jze0;
import p149l.k1f;
import p149l.k4g;
import p149l.kap;
import p149l.kll0;
import p149l.kq50;
import p149l.kqq;
import p149l.kud0;
import p149l.kzl0;
import p149l.l5o0;
import p149l.lcn0;
import p149l.lh90;
import p149l.lp50;
import p149l.lq50;
import p149l.lze0;
import p149l.mio0;
import p149l.mp50;
import p149l.mrb;
import p149l.mze0;
import p149l.n14;
import p149l.n3e0;
import p149l.n3n0;
import p149l.nf90;
import p149l.np50;
import p149l.num0;
import p149l.nze0;
import p149l.o01;
import p149l.o5o0;
import p149l.obk0;
import p149l.oee0;
import p149l.op50;
import p149l.oy4;
import p149l.oze0;
import p149l.pdg;
import p149l.pmj;
import p149l.pvp;
import p149l.pze0;
import p149l.qp50;
import p149l.qvp;
import p149l.qze0;
import p149l.rao0;
import p149l.rul0;
import p149l.rz5;
import p149l.rze0;
import p149l.snq;
import p149l.sze0;
import p149l.tfh0;
import p149l.thn0;
import p149l.ts5;
import p149l.u4k0;
import p149l.uj1;
import p149l.unh0;
import p149l.v1o0;
import p149l.v4g;
import p149l.vu4;
import p149l.vxj0;
import p149l.weo0;
import p149l.wzq;
import p149l.x5n0;
import p149l.xvj;
import p149l.y8k0;
import p149l.yfm0;
import p149l.zni;
import p149l.zoo;

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
    public final enum C126131 extends SchemeActionType {
        private C126131(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new cuk();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$10 */
    public final enum C1261410 extends SchemeActionType {
        private C1261410(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new vu4();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$11 */
    public final enum C1261511 extends SchemeActionType {
        private C1261511(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new c1l();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$12 */
    public final enum C1261612 extends SchemeActionType {
        private C1261612(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new cze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$13 */
    public final enum C1261713 extends SchemeActionType {
        private C1261713(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new g4g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$14 */
    public final enum C1261814 extends SchemeActionType {
        private C1261814(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new kll0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$15 */
    public final enum C1261915 extends SchemeActionType {
        private C1261915(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new y8k0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$16 */
    public final enum C1262016 extends SchemeActionType {
        private C1262016(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new obk0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$17 */
    public final enum C1262117 extends SchemeActionType {
        private C1262117(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new nf90();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$18 */
    public final enum C1262218 extends SchemeActionType {
        private C1262218(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new unh0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$19 */
    public final enum C1262319 extends SchemeActionType {
        private C1262319(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new wzq();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$2 */
    public final enum C126242 extends SchemeActionType {
        private C126242(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new zoo();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$20 */
    public final enum C1262520 extends SchemeActionType {
        private C1262520(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new wzq();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$21 */
    public final enum C1262621 extends SchemeActionType {
        private C1262621(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new wzq();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$22 */
    public final enum C1262722 extends SchemeActionType {
        private C1262722(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new wzq();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$23 */
    public final enum C1262823 extends SchemeActionType {
        private C1262823(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new n3e0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$24 */
    public final enum C1262924 extends SchemeActionType {
        private C1262924(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new oy4();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$25 */
    public final enum C1263025 extends SchemeActionType {
        private C1263025(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new xvj();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$26 */
    public final enum C1263126 extends SchemeActionType {
        private C1263126(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new tfh0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$27 */
    public final enum C1263227 extends SchemeActionType {
        private C1263227(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new lze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$28 */
    public final enum C1263328 extends SchemeActionType {
        private C1263328(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new mze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$29 */
    public final enum C1263429 extends SchemeActionType {
        private C1263429(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new uj1();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$3 */
    public final enum C126353 extends SchemeActionType {
        private C126353(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new vxj0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$30 */
    public final enum C1263630 extends SchemeActionType {
        private C1263630(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new k1f();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$31 */
    public final enum C1263731 extends SchemeActionType {
        private C1263731(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new i6k0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$32 */
    public final enum C1263832 extends SchemeActionType {
        private C1263832(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new d25();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$33 */
    public final enum C1263933 extends SchemeActionType {
        private C1263933(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new lh90();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$34 */
    public final enum C1264034 extends SchemeActionType {
        private C1264034(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new u4k0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$35 */
    public final enum C1264135 extends SchemeActionType {
        private C1264135(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new hze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$36 */
    public final enum C1264236 extends SchemeActionType {
        private C1264236(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new nze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$37 */
    public final enum C1264337 extends SchemeActionType {
        private C1264337(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new aep0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$38 */
    public final enum C1264438 extends SchemeActionType {
        private C1264438(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new ts5();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$39 */
    public final enum C1264539 extends SchemeActionType {
        private C1264539(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new mrb();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$4 */
    public final enum C126464 extends SchemeActionType {
        private C126464(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new pmj();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$40 */
    public final enum C1264740 extends SchemeActionType {
        private C1264740(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new d610();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$41 */
    public final enum C1264841 extends SchemeActionType {
        private C1264841(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new gol0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$42 */
    public final enum C1264942 extends SchemeActionType {
        private C1264942(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new sze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$43 */
    public final enum C1265043 extends SchemeActionType {
        private C1265043(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new bze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$44 */
    public final enum C1265144 extends SchemeActionType {
        private C1265144(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new jze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$45 */
    public final enum C1265245 extends SchemeActionType {
        private C1265245(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new qze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$46 */
    public final enum C1265346 extends SchemeActionType {
        private C1265346(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new gdg();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$47 */
    public final enum C1265447 extends SchemeActionType {
        private C1265447(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new pdg();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$48 */
    public final enum C1265548 extends SchemeActionType {
        private C1265548(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new oee0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$49 */
    public final enum C1265649 extends SchemeActionType {
        private C1265649(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new dui0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$5 */
    public final enum C126575 extends SchemeActionType {
        private C126575(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new v4g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$50 */
    public final enum C1265850 extends SchemeActionType {
        private C1265850(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new snq();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$51 */
    public final enum C1265951 extends SchemeActionType {
        private C1265951(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new cp50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$52 */
    public final enum C1266052 extends SchemeActionType {
        private C1266052(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new kq50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$53 */
    public final enum C1266153 extends SchemeActionType {
        private C1266153(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new yfm0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$54 */
    public final enum C1266254 extends SchemeActionType {
        private C1266254(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new thn0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$55 */
    public final enum C1266355 extends SchemeActionType {
        private C1266355(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new f5o0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$56 */
    public final enum C1266456 extends SchemeActionType {
        private C1266456(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new rze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$57 */
    public final enum C1266557 extends SchemeActionType {
        private C1266557(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new aio0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$58 */
    public final enum C1266658 extends SchemeActionType {
        private C1266658(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new rz5();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$59 */
    public final enum C1266759 extends SchemeActionType {
        private C1266759(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new lq50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$6 */
    public final enum C126686 extends SchemeActionType {
        private C126686(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new kqq();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$60 */
    public final enum C1266960 extends SchemeActionType {
        private C1266960(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new weo0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$61 */
    public final enum C1267061 extends SchemeActionType {
        private C1267061(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new np50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$62 */
    public final enum C1267162 extends SchemeActionType {
        private C1267162(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new axr();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$63 */
    public final enum C1267263 extends SchemeActionType {
        private C1267263(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new rao0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$64 */
    public final enum C1267364 extends SchemeActionType {
        private C1267364(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new x5n0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$65 */
    public final enum C1267465 extends SchemeActionType {
        private C1267465(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new o5o0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$66 */
    public final enum C1267566 extends SchemeActionType {
        private C1267566(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new n3n0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$67 */
    public final enum C1267667 extends SchemeActionType {
        private C1267667(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new azn0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$68 */
    public final enum C1267768 extends SchemeActionType {
        private C1267768(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new lcn0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$69 */
    public final enum C1267869 extends SchemeActionType {
        private C1267869(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new emo0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$7 */
    public final enum C126797 extends SchemeActionType {
        private C126797(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new qp50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$70 */
    public final enum C1268070 extends SchemeActionType {
        private C1268070(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new rul0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$71 */
    public final enum C1268171 extends SchemeActionType {
        private C1268171(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new v1o0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$72 */
    public final enum C1268272 extends SchemeActionType {
        private C1268272(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new num0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$73 */
    public final enum C1268373 extends SchemeActionType {
        private C1268373(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new n14();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$74 */
    public final enum C1268474 extends SchemeActionType {
        private C1268474(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new o01();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$75 */
    public final enum C1268575 extends SchemeActionType {
        private C1268575(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new ajo0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$76 */
    public final enum C1268676 extends SchemeActionType {
        private C1268676(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new mio0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$77 */
    public final enum C1268777 extends SchemeActionType {
        private C1268777(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new bql0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$78 */
    public final enum C1268878 extends SchemeActionType {
        private C1268878(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new kzl0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$79 */
    public final enum C1268979 extends SchemeActionType {
        private C1268979(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new evl0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$8 */
    public final enum C126908 extends SchemeActionType {
        private C126908(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new zni();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$80 */
    public final enum C1269180 extends SchemeActionType {
        private C1269180(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new eze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$81 */
    public final enum C1269281 extends SchemeActionType {
        private C1269281(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new oze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$82 */
    public final enum C1269382 extends SchemeActionType {
        private C1269382(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new pze0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$83 */
    public final enum C1269483 extends SchemeActionType {
        private C1269483(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new op50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$84 */
    public final enum C1269584 extends SchemeActionType {
        private C1269584(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new eq50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$85 */
    public final enum C1269685 extends SchemeActionType {
        private C1269685(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new l5o0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$86 */
    public final enum C1269786 extends SchemeActionType {
        private C1269786(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new bie();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$87 */
    public final enum C1269887 extends SchemeActionType {
        private C1269887(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new adp();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$88 */
    public final enum C1269988 extends SchemeActionType {
        private C1269988(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new ign();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$89 */
    public final enum C1270089 extends SchemeActionType {
        private C1270089(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new pvp();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$9 */
    public final enum C127019 extends SchemeActionType {
        private C127019(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new k4g();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$90 */
    public final enum C1270290 extends SchemeActionType {
        private C1270290(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new qvp();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$91 */
    public final enum C1270391 extends SchemeActionType {
        private C1270391(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new kap();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$92 */
    public final enum C1270492 extends SchemeActionType {
        private C1270492(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new aco();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$93 */
    public final enum C1270593 extends SchemeActionType {
        private C1270593(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new jij();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$94 */
    public final enum C1270694 extends SchemeActionType {
        private C1270694(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new mp50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$95 */
    public final enum C1270795 extends SchemeActionType {
        private C1270795(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new lp50();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$96 */
    public final enum C1270896 extends SchemeActionType {
        private C1270896(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new ize0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$97 */
    public final enum C1270997 extends SchemeActionType {
        private C1270997(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new ckn();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType$98 */
    public final enum C1271098 extends SchemeActionType {
        private C1271098(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.archi.liveschema.SchemeActionType
        public kud0 getSchemaAction() {
            return new hen();
        }
    }

    private static /* synthetic */ SchemeActionType[] $values() {
        return new SchemeActionType[]{ACTION_SHOW_H5, ACTION_SHOW_INTL_OCTOPUS_GAME, ACTION_SHOW_USER_CARD, ACTION_SHOW_GIFT_DIALOG, ACTION_SHOW_FANS_CLUB_COMPANY, ACTION_JUMP_ROOM, ACTION_SHOW_RECHARGE_DIALOG, ACTION_SHOW_FIRST_RECHARGE, ACTION_SHOW_FAN_BASE_ENTRY, ACTION_SHOW_CHAT_INPUT, ACTION_HIDE_FANS_CLUB, ACTION_SHOW_FANS_CLUB, ACTION_JUMP_FAN_BASE_RED_PACKET, ACTION_SHOW_VIP_PURCHASE_DIALOG, ACTION_SHOW_USER_RIGHTS_PAGE, ACTION_SHOW_USER_VOICE_RIGHTS_PAGE, ACTION_SHOW_PROFILE_PAGE, ACTION_SHOW_TT_RECHARGE_PAGE, ACTION_USER_GUARD, ACTION_ANCHOR_GUARD, ACTION_POTENTIAL_GUARD, ACTION_ONLINE_GUARD, ACTION_SHOW_SCRAP_INFO_DIALOG, ACTION_SHOW_CHAT_MANAGER_DIALOG, ACTION_GIFT_SUIT, ACTION_GIFT_DIALOG_SWITCH_PACKET_PANEL, ACTION_SIGN_IN_MAIN_PAGE, ACTION_SIGN_IN_MEDAL_PAGE, ACTION_SIGN_IN_PRIZE_AVATAR_BOARD, ACTION_SIGN_IN_PRIZE_ENTER_EFFECTS, ACTION_SHOW_USER_MEDAL, ACTION_SHOW_CHAT_SHADE, ACTION_SHOW_PROFILE_CARD_SKIN, ACTION_SHOW_USER_DAILY_TASK, ACTION_SHOW_MULTI_CALL_APPLY_DIALOG, ACTION_SHOW_STORM_DANMAKU, ACTION_SHOW_VOTE_MANAGER_DIALOG, ACTION_SHOW_CONFESS_GIFT_DETAIL_DIALOG, ACTION_SHOW_CP_GIFT_DETAIL_DIALOG, ACTION_SHOW_MULTI_CALL_DIALOG, ACTION_SHOW_VIRTUAL_AVATAR_PANEL, ACTION_SHOW_WHO_IS_UNDERCOVER_PANEL, ACTION_SHOW_DRAW_GUESS_PANEL, ACTION_SHOW_PLAY_LIBRARY_PANEL, ACTION_SHOW_VOICE_ROOM_MANAGER_PANEL, FANBASEGROUP_APPKY_MANAGE_DIALOG, FANBASEGROUP_MANAGE_DIALOG, ACTION_SEND_GIFT, ACTION_OPEN_TOP_CHAT_DIALOG, ACTION_JOIN_FAN_BASE_AFTER_SEND_GIFT, ACTION_OPEN_DEBLOCK_ANCHOR_ACTION, ACTION_SHOW_VOICE_ROOMGRABHAT, ACTION_VOICE_AUCTION, ACTION_VOICE_KTV, ACTION_VOICE_NORMAL, ACTION_SHOW_VOICE_SWEET_CP_DIALOG, ACTION_VOICE_ROOM_SET_BACKGROUND, ACTION_CONSUME_ALERT, ACTION_OPEN_VOICE_SHARE_PANEL, ACTION_VOICE_ROOM_GIFT_WALL, ACTION_OPEN_INTL_VOICE_SHARE_PANEL, ACTION_OPEN_BLACK_LIST_DIALOG, ACTION_VOICE_ROOM_REPORT, ACTION_VOICE_ROOM_FEEDBACK, ACTION_VOICE_ROOM_NOTIFY_FANS, ACTION_VOICE_ROOM_DELETE_ROOM, ACTION_VOICE_ROOM_MEMBER_MANAGE, ACTION_VOICE_ROOM_HEAT_PANEL, ACTION_GENERATE_STAR_RED_PACKET, ACTION_VIRTUAL_ROOM_LEVEL_DETAIL, ACTION_VOICE_ROOM_MORE_SETTING, ACTION_VOICE_ROOM_CANCEL_ENROLLMEN, ACTION_OPEN_CALL_CARD_DIALOG, ACTION_OPEN_ARTICULATION_DIALOG, ACTION_VOICE_SETTLE_GUIDE, ACTION_SWITCH_VOICE_LIVE_MODE, ACTION_VIRTUAL_FLOWER_BOARD_PAGE, ACTION_OPEN_MEDAL, ACTION_SHOW_COMPANION, ACTION_SHOW_GIFT_SKIN_DIALOG, ACTION_SHOW_VOICE_MIC_EMOJI_DIALOG, ACTION_SHOW_VOICE_PAY_GUIDE_USER, ACTION_OPEN_PK_STATE_PANEL, ACTION_OPEN_SUPER_GOD_DIALOG, ACTION_SEND_VOICE_BROADCAST, ACTION_DYNAMIC_SCHEME, ACTION_SHOW_SUD_GAME_DIALOG, ACTION_OPEN_INTL_GAME_BOARD_DIALOG, ACTION_OPEN_VOICE_LIMIT_HOUSE_DIALOG, ACTION_SHOW_VOCIE_SWEET_CP_HOUSE, ACTION_OPEN_INTL_SERVICE_CENTER, ACTION_OPEN_INTL_MEDAL_WALL, ACTION_OPEN_VOICE_GAME_DIALOG, ACTION_OPEN_INTL_MUSIC_PAGE, ACTION_OPEN_INPUT_BAR, ACTION_SHOW_NOTICE_PANEL, ACTION_SHOW_GIFT_DETAIL, IntlFeedbackAction};
    }

    static {
        ACTION_SHOW_H5 = new C126131("ACTION_SHOW_H5", 0, "showH5");
        ACTION_SHOW_INTL_OCTOPUS_GAME = new C126242("ACTION_SHOW_INTL_OCTOPUS_GAME", 1, "octopusGame");
        ACTION_SHOW_USER_CARD = new C126353("ACTION_SHOW_USER_CARD", 2, "showUserCard");
        ACTION_SHOW_GIFT_DIALOG = new C126464("ACTION_SHOW_GIFT_DIALOG", 3, "showGiftDialog");
        ACTION_SHOW_FANS_CLUB_COMPANY = new C126575("ACTION_SHOW_FANS_CLUB_COMPANY", 4, "showAccommpanyEntry");
        ACTION_JUMP_ROOM = new C126686("ACTION_JUMP_ROOM", 5, "jumpRoom");
        ACTION_SHOW_RECHARGE_DIALOG = new C126797("ACTION_SHOW_RECHARGE_DIALOG", 6, "showRechargeDialog");
        ACTION_SHOW_FIRST_RECHARGE = new C126908("ACTION_SHOW_FIRST_RECHARGE", 7, "showFirstRecharge");
        ACTION_SHOW_FAN_BASE_ENTRY = new C127019("ACTION_SHOW_FAN_BASE_ENTRY", 8, "showFanbaseEntry");
        ACTION_SHOW_CHAT_INPUT = new C1261410("ACTION_SHOW_CHAT_INPUT", 9, "showChatInput");
        ACTION_HIDE_FANS_CLUB = new C1261511("ACTION_HIDE_FANS_CLUB", 10, "hideFanbase");
        ACTION_SHOW_FANS_CLUB = new C1261612("ACTION_SHOW_FANS_CLUB", 11, "showFanbase");
        ACTION_JUMP_FAN_BASE_RED_PACKET = new C1261713("ACTION_JUMP_FAN_BASE_RED_PACKET", 12, "jumpFanbaseRedPacket");
        ACTION_SHOW_VIP_PURCHASE_DIALOG = new C1261814("ACTION_SHOW_VIP_PURCHASE_DIALOG", 13, "showVipPurchaseDialog");
        ACTION_SHOW_USER_RIGHTS_PAGE = new C1261915("ACTION_SHOW_USER_RIGHTS_PAGE", 14, "showUserRightsPage");
        ACTION_SHOW_USER_VOICE_RIGHTS_PAGE = new C1262016("ACTION_SHOW_USER_VOICE_RIGHTS_PAGE", 15, "showUserVoiceRightsPage");
        ACTION_SHOW_PROFILE_PAGE = new C1262117("ACTION_SHOW_PROFILE_PAGE", 16, "showProfilePage");
        ACTION_SHOW_TT_RECHARGE_PAGE = new C1262218("ACTION_SHOW_TT_RECHARGE_PAGE", 17, "showTTCoinDialog");
        ACTION_USER_GUARD = new C1262319("ACTION_USER_GUARD", 18, BLiveGuardType.userGuard);
        ACTION_ANCHOR_GUARD = new C1262520("ACTION_ANCHOR_GUARD", 19, BLiveGuardType.anchorGuard);
        ACTION_POTENTIAL_GUARD = new C1262621("ACTION_POTENTIAL_GUARD", 20, BLiveGuardType.potentialGuard);
        ACTION_ONLINE_GUARD = new C1262722("ACTION_ONLINE_GUARD", 21, BLiveGuardType.onlineGuard);
        ACTION_SHOW_SCRAP_INFO_DIALOG = new C1262823("ACTION_SHOW_SCRAP_INFO_DIALOG", 22, "showScrapDialog");
        ACTION_SHOW_CHAT_MANAGER_DIALOG = new C1262924("ACTION_SHOW_CHAT_MANAGER_DIALOG", 23, BLiveButtonType.chatManager);
        ACTION_GIFT_SUIT = new C1263025("ACTION_GIFT_SUIT", 24, "showGiftSetInfo");
        ACTION_GIFT_DIALOG_SWITCH_PACKET_PANEL = new C1263126("ACTION_GIFT_DIALOG_SWITCH_PACKET_PANEL", 25, "switchPacketPanel");
        ACTION_SIGN_IN_MAIN_PAGE = new C1263227("ACTION_SIGN_IN_MAIN_PAGE", 26, "showSignInDialog");
        ACTION_SIGN_IN_MEDAL_PAGE = new C1263328("ACTION_SIGN_IN_MEDAL_PAGE", 27, "showSignInMedal");
        ACTION_SIGN_IN_PRIZE_AVATAR_BOARD = new C1263429("ACTION_SIGN_IN_PRIZE_AVATAR_BOARD", 28, "showAvatarBoard");
        ACTION_SIGN_IN_PRIZE_ENTER_EFFECTS = new C1263630("ACTION_SIGN_IN_PRIZE_ENTER_EFFECTS", 29, "showEnterEffects");
        ACTION_SHOW_USER_MEDAL = new C1263731("ACTION_SHOW_USER_MEDAL", 30, "showUserMedal");
        ACTION_SHOW_CHAT_SHADE = new C1263832("ACTION_SHOW_CHAT_SHADE", 31, "showChatShade");
        ACTION_SHOW_PROFILE_CARD_SKIN = new C1263933("ACTION_SHOW_PROFILE_CARD_SKIN", 32, "showProfileCardSkin");
        ACTION_SHOW_USER_DAILY_TASK = new C1264034("ACTION_SHOW_USER_DAILY_TASK", 33, "showUserDailyTask");
        ACTION_SHOW_MULTI_CALL_APPLY_DIALOG = new C1264135("ACTION_SHOW_MULTI_CALL_APPLY_DIALOG", 34, "showMultiCallApplyDialog");
        ACTION_SHOW_STORM_DANMAKU = new C1264236("ACTION_SHOW_STORM_DANMAKU", 35, "showStormBullet");
        ACTION_SHOW_VOTE_MANAGER_DIALOG = new C1264337("ACTION_SHOW_VOTE_MANAGER_DIALOG", 36, "openVoteManager");
        ACTION_SHOW_CONFESS_GIFT_DETAIL_DIALOG = new C1264438("ACTION_SHOW_CONFESS_GIFT_DETAIL_DIALOG", 37, "showConfessGiftDetailDialog");
        ACTION_SHOW_CP_GIFT_DETAIL_DIALOG = new C1264539("ACTION_SHOW_CP_GIFT_DETAIL_DIALOG", 38, "showCpGiftDetailDialog");
        ACTION_SHOW_MULTI_CALL_DIALOG = new C1264740("ACTION_SHOW_MULTI_CALL_DIALOG", 39, "showMultiCallDialog");
        ACTION_SHOW_VIRTUAL_AVATAR_PANEL = new C1264841("ACTION_SHOW_VIRTUAL_AVATAR_PANEL", 40, "showVirtualAvatarPanel");
        ACTION_SHOW_WHO_IS_UNDERCOVER_PANEL = new C1264942("ACTION_SHOW_WHO_IS_UNDERCOVER_PANEL", 41, "showWhoIsUndercoverPanel");
        ACTION_SHOW_DRAW_GUESS_PANEL = new C1265043("ACTION_SHOW_DRAW_GUESS_PANEL", 42, "showDrawGuessPanel");
        ACTION_SHOW_PLAY_LIBRARY_PANEL = new C1265144("ACTION_SHOW_PLAY_LIBRARY_PANEL", 43, "game-lib");
        ACTION_SHOW_VOICE_ROOM_MANAGER_PANEL = new C1265245("ACTION_SHOW_VOICE_ROOM_MANAGER_PANEL", 44, "showVoiceRoomManagerPanel");
        FANBASEGROUP_APPKY_MANAGE_DIALOG = new C1265346("FANBASEGROUP_APPKY_MANAGE_DIALOG", 45, "fanBaseGroupApplyManage");
        FANBASEGROUP_MANAGE_DIALOG = new C1265447("FANBASEGROUP_MANAGE_DIALOG", 46, "fanBaseGroupManage");
        ACTION_SEND_GIFT = new C1265548("ACTION_SEND_GIFT", 47, "sendGift");
        ACTION_OPEN_TOP_CHAT_DIALOG = new C1265649("ACTION_OPEN_TOP_CHAT_DIALOG", 48, "openTopChatDialog");
        ACTION_JOIN_FAN_BASE_AFTER_SEND_GIFT = new C1265850("ACTION_JOIN_FAN_BASE_AFTER_SEND_GIFT", 49, "joinFanbaseAfterSendGift");
        ACTION_OPEN_DEBLOCK_ANCHOR_ACTION = new C1265951("ACTION_OPEN_DEBLOCK_ANCHOR_ACTION", 50, "openDeblockAnchorPage");
        ACTION_SHOW_VOICE_ROOMGRABHAT = new C1266052("ACTION_SHOW_VOICE_ROOMGRABHAT", 51, "showVoiceRoomGrabHat");
        ACTION_VOICE_AUCTION = new C1266153("ACTION_VOICE_AUCTION", 52, "voice_auction");
        ACTION_VOICE_KTV = new C1266254("ACTION_VOICE_KTV", 53, "KTV");
        ACTION_VOICE_NORMAL = new C1266355("ACTION_VOICE_NORMAL", 54, "voice_normal");
        ACTION_SHOW_VOICE_SWEET_CP_DIALOG = new C1266456("ACTION_SHOW_VOICE_SWEET_CP_DIALOG", 55, "openSweetCp");
        ACTION_VOICE_ROOM_SET_BACKGROUND = new C1266557("ACTION_VOICE_ROOM_SET_BACKGROUND", 56, "setVoiceRoomBg");
        ACTION_CONSUME_ALERT = new C1266658("ACTION_CONSUME_ALERT", 57, "consume_alert");
        ACTION_OPEN_VOICE_SHARE_PANEL = new C1266759("ACTION_OPEN_VOICE_SHARE_PANEL", 58, "openSharePanel");
        ACTION_VOICE_ROOM_GIFT_WALL = new C1266960("ACTION_VOICE_ROOM_GIFT_WALL", 59, "openGiftWallBook");
        ACTION_OPEN_INTL_VOICE_SHARE_PANEL = new C1267061("ACTION_OPEN_INTL_VOICE_SHARE_PANEL", 60, "openIntlSharePanel");
        ACTION_OPEN_BLACK_LIST_DIALOG = new C1267162("ACTION_OPEN_BLACK_LIST_DIALOG", 61, BLiveButtonType.blackList);
        ACTION_VOICE_ROOM_REPORT = new C1267263("ACTION_VOICE_ROOM_REPORT", 62, "report");
        ACTION_VOICE_ROOM_FEEDBACK = new C1267364("ACTION_VOICE_ROOM_FEEDBACK", 63, MessageType.feedback);
        ACTION_VOICE_ROOM_NOTIFY_FANS = new C1267465("ACTION_VOICE_ROOM_NOTIFY_FANS", 64, "notifyfans");
        ACTION_VOICE_ROOM_DELETE_ROOM = new C1267566("ACTION_VOICE_ROOM_DELETE_ROOM", 65, "deleteroom");
        ACTION_VOICE_ROOM_MEMBER_MANAGE = new C1267667("ACTION_VOICE_ROOM_MEMBER_MANAGE", 66, "memberManage");
        ACTION_VOICE_ROOM_HEAT_PANEL = new C1267768("ACTION_VOICE_ROOM_HEAT_PANEL", 67, "showHeatPanel");
        ACTION_GENERATE_STAR_RED_PACKET = new C1267869("ACTION_GENERATE_STAR_RED_PACKET", 68, "generateStarRedPacket");
        ACTION_VIRTUAL_ROOM_LEVEL_DETAIL = new C1268070("ACTION_VIRTUAL_ROOM_LEVEL_DETAIL", 69, "levelRightDetail");
        ACTION_VOICE_ROOM_MORE_SETTING = new C1268171("ACTION_VOICE_ROOM_MORE_SETTING", 70, "showMoreSettings");
        ACTION_VOICE_ROOM_CANCEL_ENROLLMEN = new C1268272("ACTION_VOICE_ROOM_CANCEL_ENROLLMEN", 71, "cancelenrollmen");
        ACTION_OPEN_CALL_CARD_DIALOG = new C1268373("ACTION_OPEN_CALL_CARD_DIALOG", 72, "openNobleChatDialog");
        ACTION_OPEN_ARTICULATION_DIALOG = new C1268474("ACTION_OPEN_ARTICULATION_DIALOG", 73, "openClarityPanel");
        ACTION_VOICE_SETTLE_GUIDE = new C1268575("ACTION_VOICE_SETTLE_GUIDE", 74, "settleGuide");
        ACTION_SWITCH_VOICE_LIVE_MODE = new C1268676("ACTION_SWITCH_VOICE_LIVE_MODE", 75, "switchVoiceLiveMode");
        ACTION_VIRTUAL_FLOWER_BOARD_PAGE = new C1268777("ACTION_VIRTUAL_FLOWER_BOARD_PAGE", 76, "showLeaderboard");
        ACTION_OPEN_MEDAL = new C1268878("ACTION_OPEN_MEDAL", 77, "voiceLiveGiftWall");
        ACTION_SHOW_COMPANION = new C1268979("ACTION_SHOW_COMPANION", 78, "showCompanionList");
        ACTION_SHOW_GIFT_SKIN_DIALOG = new C1269180("ACTION_SHOW_GIFT_SKIN_DIALOG", 79, "switchGiftSkinPanel");
        ACTION_SHOW_VOICE_MIC_EMOJI_DIALOG = new C1269281("ACTION_SHOW_VOICE_MIC_EMOJI_DIALOG", 80, BLiveButtonType.emojiPlayPanel);
        ACTION_SHOW_VOICE_PAY_GUIDE_USER = new C1269382("ACTION_SHOW_VOICE_PAY_GUIDE_USER", 81, "showVoicePayGuideUser");
        ACTION_OPEN_PK_STATE_PANEL = new C1269483("ACTION_OPEN_PK_STATE_PANEL", 82, "openPKStatePanel");
        ACTION_OPEN_SUPER_GOD_DIALOG = new C1269584("ACTION_OPEN_SUPER_GOD_DIALOG", 83, "showSuperGod");
        ACTION_SEND_VOICE_BROADCAST = new C1269685("ACTION_SEND_VOICE_BROADCAST", 84, "sendVoiceBroadcast");
        ACTION_DYNAMIC_SCHEME = new C1269786("ACTION_DYNAMIC_SCHEME", 85, "dynamicScheme");
        ACTION_SHOW_SUD_GAME_DIALOG = new C1269887("ACTION_SHOW_SUD_GAME_DIALOG", 86, "sudGame");
        ACTION_OPEN_INTL_GAME_BOARD_DIALOG = new C1269988("ACTION_OPEN_INTL_GAME_BOARD_DIALOG", 87, "showGameBoard");
        ACTION_OPEN_VOICE_LIMIT_HOUSE_DIALOG = new C1270089("ACTION_OPEN_VOICE_LIMIT_HOUSE_DIALOG", 88, "showVoiceLimitHouse");
        ACTION_SHOW_VOCIE_SWEET_CP_HOUSE = new C1270290("ACTION_SHOW_VOCIE_SWEET_CP_HOUSE", 89, "showSweetCPHouse");
        ACTION_OPEN_INTL_SERVICE_CENTER = new C1270391("ACTION_OPEN_INTL_SERVICE_CENTER", 90, SchemeKey.jumpIntlServiceCenter);
        ACTION_OPEN_INTL_MEDAL_WALL = new C1270492("ACTION_OPEN_INTL_MEDAL_WALL", 91, "jumpIntlMedalWall");
        ACTION_OPEN_VOICE_GAME_DIALOG = new C1270593("ACTION_OPEN_VOICE_GAME_DIALOG", 92, "game");
        ACTION_OPEN_INTL_MUSIC_PAGE = new C1270694("ACTION_OPEN_INTL_MUSIC_PAGE", 93, "openIntlMusicPage");
        ACTION_OPEN_INPUT_BAR = new C1270795("ACTION_OPEN_INPUT_BAR", 94, "openVoiceInputBar");
        ACTION_SHOW_NOTICE_PANEL = new C1270896("ACTION_SHOW_NOTICE_PANEL", 95, "showNoticePanel");
        ACTION_SHOW_GIFT_DETAIL = new C1270997("ACTION_SHOW_GIFT_DETAIL", 96, "showReceiveGiftBillPanel");
        IntlFeedbackAction = new C1271098("IntlFeedbackAction", 97, SchemeKey.jumpLiveFeedbackQuestionPage);
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

    public abstract kud0 getSchemaAction();
}
