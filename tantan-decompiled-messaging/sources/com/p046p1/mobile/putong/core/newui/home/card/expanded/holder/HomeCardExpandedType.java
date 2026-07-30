package com.p046p1.mobile.putong.core.newui.home.card.expanded.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import p149l.C20562v2;
import p149l.ada0;
import p149l.apb0;
import p149l.ccr;
import p149l.d0l0;
import p149l.dr5;
import p149l.f6c0;
import p149l.haa0;
import p149l.hwk;
import p149l.hxm;
import p149l.ip00;
import p149l.kv10;
import p149l.n320;
import p149l.nt90;
import p149l.p3l;
import p149l.ti90;
import p149l.toc0;
import p149l.v4i0;
import p149l.v9j;
import p149l.ws2;
import p149l.zwk;

/* JADX INFO: loaded from: classes11.dex */
public enum HomeCardExpandedType {
    REPORT(f6c0.f95603V0, 0, "report", "举报", new v9j() { // from class: l.z3l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38144v();
        }
    }, 2),
    AVATAR(new v9j() { // from class: l.b4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(f6c0.f95395I0);
        }
    }, 1, "avatar", "头图-基本信息", new v9j() { // from class: l.n4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38146x();
        }
    }, 2),
    LIVE_ROOM(new v9j() { // from class: l.o4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(CoreModule.m29936Q().mo67268gg());
        }
    }, 2, "liveRoom", "直播间-语音房", new v9j() { // from class: l.p4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38124I();
        }
    }, 2),
    ABOUT_ME(f6c0.f95768f0, 3, "my_bio", "my bio", new v9j() { // from class: l.q4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38138p();
        }
    }, 2),
    LIFE_PIC(f6c0.f95443L0, 4, ProfileLikeType.life_pic, "生活照", new v9j() { // from class: l.r4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38139q();
        }
    }, 3),
    MOMENT(f6c0.f95475N0, 5, "moment", "动态", new v9j() { // from class: l.s4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38148z();
        }
    }, 2),
    BASE_INFO(f6c0.f95785g0, 6, "aboutMe", "个人信息", new v9j() { // from class: l.t4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38147y();
        }
    }, 2),
    QUESTION(f6c0.f95571T0, 7, "questionAnswer", "问答", new v9j() { // from class: l.u4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38135m();
        }
    }, 1),
    VERIFY(f6c0.f95651Y0, 8, "verification", "我的认证信息", new v9j() { // from class: l.k4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38121C();
        }
    }, 1),
    CARD_NAME(new v9j() { // from class: l.v4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(f6c0.f95491O0);
        }
    }, 9, AuthenticationTokenClaims.JSON_KEY_NAME, "名称-头像下面显示", new v9j() { // from class: l.w4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38123H();
        }
    }, 2),
    RELATIONSHIP_GOALS(new v9j() { // from class: l.x4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(f6c0.f95587U0);
        }
    }, 10, "relationship_goals", "恋爱目标", new v9j() { // from class: l.y4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38129b();
        }
    }, 2),
    INTERESTS(new v9j() { // from class: l.z4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(f6c0.f95427K0);
        }
    }, 11, "interests", "兴趣爱好", new v9j() { // from class: l.a5l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38141s();
        }
    }, 2),
    HASH_TAG(new v9j() { // from class: l.b5l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(f6c0.f95379H0);
        }
    }, 12, "hash_tag", "多个标签", new v9j() { // from class: l.c5l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38126K();
        }
    }, 2),
    ADMOB(new v9j() { // from class: l.a4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(f6c0.f95523Q0);
        }
    }, 13, "admob", "广告", new v9j() { // from class: l.c4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38122F();
        }
    }, 2),
    MEMBER(new v9j() { // from class: l.d4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(f6c0.f95539R0);
        }
    }, 14, "member", "会员", new v9j() { // from class: l.e4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38143u();
        }
    }, 2),
    LIKES(new v9j() { // from class: l.f4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(f6c0.f95555S0);
        }
    }, 15, "likes", "几人喜欢我", new v9j() { // from class: l.g4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38120B();
        }
    }, 2),
    TANTANID(f6c0.f95619W0, 16, "tantanid", "Tantan ID", new v9j() { // from class: l.h4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38130f();
        }
    }, 2),
    COMPLIMENT(new v9j() { // from class: l.i4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(f6c0.f95315D0);
        }
    }, 17, "compliment", "称赞栏", new v9j() { // from class: l.j4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38142t();
        }
    }, 2),
    COMPLIMENT_RECEIVED(new v9j() { // from class: l.l4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(f6c0.f95331E0);
        }
    }, 18, "compliment_received", "收到的称赞", new v9j() { // from class: l.m4l
        @Override // p149l.v9j, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m38136n();
        }
    }, 2);

    private String alias;
    private v9j<p3l> createFun;
    private String desc;
    private v9j<Integer> layoutCreateFun;
    private int layoutId;
    private int preLoadSize;
    private int typeIndex;

    HomeCardExpandedType(int i, int i2, String str, String str2, v9j v9jVar, int i3) {
        this.layoutCreateFun = null;
        this.layoutId = i;
        this.typeIndex = i2;
        this.desc = str2;
        this.createFun = v9jVar;
        this.alias = str;
        this.preLoadSize = i3;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ p3l m38120B() {
        return new ada0();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ p3l m38121C() {
        return new d0l0();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ p3l m38122F() {
        return new nt90();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ p3l m38123H() {
        return new n320();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ p3l m38124I() {
        return new kv10();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ p3l m38126K() {
        return new hwk();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ p3l m38129b() {
        return new toc0();
    }

    public static HomeCardExpandedType createType(int i) {
        for (HomeCardExpandedType homeCardExpandedType : values()) {
            if (homeCardExpandedType.typeIndex == i) {
                return homeCardExpandedType;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ p3l m38130f() {
        return new v4i0();
    }

    public static HomeCardExpandedType getTypeByAlias(String str) {
        HomeCardExpandedType[] homeCardExpandedTypeArrValues = values();
        for (int i = 0; i < homeCardExpandedTypeArrValues.length; i++) {
            if (TextUtils.equals(homeCardExpandedTypeArrValues[i].alias, str)) {
                return homeCardExpandedTypeArrValues[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ p3l m38135m() {
        return new apb0();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ p3l m38136n() {
        return new dr5();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ p3l m38138p() {
        return new C20562v2();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ p3l m38139q() {
        return new ccr();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ p3l m38141s() {
        return new hxm();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ p3l m38142t() {
        return new ti90();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ p3l m38143u() {
        return new haa0();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ p3l m38144v() {
        return new ReportCardExpandeHolder();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ p3l m38146x() {
        return new zwk();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ p3l m38147y() {
        return new ws2();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ p3l m38148z() {
        return new ip00();
    }

    public p3l createEmptyHolder() {
        return this.createFun.call();
    }

    public p3l createHolder(Context context, ViewGroup viewGroup) {
        p3l p3lVarCall = this.createFun.call();
        p3lVarCall.m209779i(this.layoutCreateFun != null ? LayoutInflater.from(context).inflate(this.layoutCreateFun.call().intValue(), viewGroup, false) : LayoutInflater.from(context).inflate(this.layoutId, viewGroup, false));
        return p3lVarCall;
    }

    public String getAlias() {
        return this.alias;
    }

    public int getLayoutId() {
        v9j<Integer> v9jVar;
        int i = this.layoutId;
        return (i != 0 || (v9jVar = this.layoutCreateFun) == null) ? i : v9jVar.call().intValue();
    }

    public int getPreLoadSize() {
        return this.preLoadSize;
    }

    public int getType() {
        return this.typeIndex;
    }

    HomeCardExpandedType(v9j v9jVar, int i, String str, String str2, v9j v9jVar2, int i2) {
        this.layoutCreateFun = v9jVar;
        this.typeIndex = i;
        this.desc = str2;
        this.createFun = v9jVar2;
        this.alias = str;
        this.preLoadSize = i2;
    }
}
