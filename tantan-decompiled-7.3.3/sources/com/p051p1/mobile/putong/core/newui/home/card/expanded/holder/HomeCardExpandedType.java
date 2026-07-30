package com.p051p1.mobile.putong.core.newui.home.card.expanded.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import p153l.C20722v2;
import p153l.der;
import p153l.ela0;
import p153l.exb0;
import p153l.f6l;
import p153l.fdi0;
import p153l.hs5;
import p153l.hzm;
import p153l.i9l0;
import p153l.kec0;
import p153l.lia0;
import p153l.mt2;
import p153l.pcj;
import p153l.pzk;
import p153l.r1a0;
import p153l.rx00;
import p153l.s320;
import p153l.vb20;
import p153l.xq90;
import p153l.xyk;
import p153l.ywc0;

/* JADX INFO: loaded from: classes11.dex */
public enum HomeCardExpandedType {
    REPORT(kec0.f125657V0, 0, "report", "举报", new pcj() { // from class: l.p6l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39147v();
        }
    }, 2),
    AVATAR(new pcj() { // from class: l.r6l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(kec0.f125449I0);
        }
    }, 1, "avatar", "头图-基本信息", new pcj() { // from class: l.d7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39149x();
        }
    }, 2),
    LIVE_ROOM(new pcj() { // from class: l.e7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(CoreModule.m30934Q().mo68451gg());
        }
    }, 2, "liveRoom", "直播间-语音房", new pcj() { // from class: l.f7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39127I();
        }
    }, 2),
    ABOUT_ME(kec0.f125822f0, 3, "my_bio", "my bio", new pcj() { // from class: l.g7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39141p();
        }
    }, 2),
    LIFE_PIC(kec0.f125497L0, 4, ProfileLikeType.life_pic, "生活照", new pcj() { // from class: l.h7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39142q();
        }
    }, 3),
    MOMENT(kec0.f125529N0, 5, "moment", "动态", new pcj() { // from class: l.i7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39151z();
        }
    }, 2),
    BASE_INFO(kec0.f125839g0, 6, "aboutMe", "个人信息", new pcj() { // from class: l.j7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39150y();
        }
    }, 2),
    QUESTION(kec0.f125625T0, 7, "questionAnswer", "问答", new pcj() { // from class: l.k7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39138m();
        }
    }, 1),
    VERIFY(kec0.f125705Y0, 8, "verification", "我的认证信息", new pcj() { // from class: l.a7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39124C();
        }
    }, 1),
    CARD_NAME(new pcj() { // from class: l.l7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(kec0.f125545O0);
        }
    }, 9, AuthenticationTokenClaims.JSON_KEY_NAME, "名称-头像下面显示", new pcj() { // from class: l.m7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39126H();
        }
    }, 2),
    RELATIONSHIP_GOALS(new pcj() { // from class: l.n7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(kec0.f125641U0);
        }
    }, 10, "relationship_goals", "恋爱目标", new pcj() { // from class: l.o7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39132b();
        }
    }, 2),
    INTERESTS(new pcj() { // from class: l.p7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(kec0.f125481K0);
        }
    }, 11, "interests", "兴趣爱好", new pcj() { // from class: l.q7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39144s();
        }
    }, 2),
    HASH_TAG(new pcj() { // from class: l.r7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(kec0.f125433H0);
        }
    }, 12, "hash_tag", "多个标签", new pcj() { // from class: l.s7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39129K();
        }
    }, 2),
    ADMOB(new pcj() { // from class: l.q6l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(kec0.f125577Q0);
        }
    }, 13, "admob", "广告", new pcj() { // from class: l.s6l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39125F();
        }
    }, 2),
    MEMBER(new pcj() { // from class: l.t6l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(kec0.f125593R0);
        }
    }, 14, "member", "会员", new pcj() { // from class: l.u6l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39146u();
        }
    }, 2),
    LIKES(new pcj() { // from class: l.v6l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(kec0.f125609S0);
        }
    }, 15, "likes", "几人喜欢我", new pcj() { // from class: l.w6l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39123B();
        }
    }, 2),
    TANTANID(kec0.f125673W0, 16, "tantanid", "Tantan ID", new pcj() { // from class: l.x6l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39133f();
        }
    }, 2),
    COMPLIMENT(new pcj() { // from class: l.y6l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(kec0.f125367D0);
        }
    }, 17, "compliment", "称赞栏", new pcj() { // from class: l.z6l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39145t();
        }
    }, 2),
    COMPLIMENT_RECEIVED(new pcj() { // from class: l.b7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return Integer.valueOf(kec0.f125384E0);
        }
    }, 18, "compliment_received", "收到的称赞", new pcj() { // from class: l.c7l
        @Override // p153l.pcj, java.util.concurrent.Callable
        public final Object call() {
            return HomeCardExpandedType.m39139n();
        }
    }, 2);

    private String alias;
    private pcj<f6l> createFun;
    private String desc;
    private pcj<Integer> layoutCreateFun;
    private int layoutId;
    private int preLoadSize;
    private int typeIndex;

    HomeCardExpandedType(int i, int i2, String str, String str2, pcj pcjVar, int i3) {
        this.layoutCreateFun = null;
        this.layoutId = i;
        this.typeIndex = i2;
        this.desc = str2;
        this.createFun = pcjVar;
        this.alias = str;
        this.preLoadSize = i3;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ f6l m39123B() {
        return new ela0();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ f6l m39124C() {
        return new i9l0();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ f6l m39125F() {
        return new r1a0();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ f6l m39126H() {
        return new vb20();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ f6l m39127I() {
        return new s320();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ f6l m39129K() {
        return new xyk();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ f6l m39132b() {
        return new ywc0();
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
    public static /* synthetic */ f6l m39133f() {
        return new fdi0();
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
    public static /* synthetic */ f6l m39138m() {
        return new exb0();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ f6l m39139n() {
        return new hs5();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ f6l m39141p() {
        return new C20722v2();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ f6l m39142q() {
        return new der();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ f6l m39144s() {
        return new hzm();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ f6l m39145t() {
        return new xq90();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ f6l m39146u() {
        return new lia0();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ f6l m39147v() {
        return new ReportCardExpandeHolder();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ f6l m39149x() {
        return new pzk();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ f6l m39150y() {
        return new mt2();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ f6l m39151z() {
        return new rx00();
    }

    public f6l createEmptyHolder() {
        return this.createFun.call();
    }

    public f6l createHolder(Context context, ViewGroup viewGroup) {
        f6l f6lVarCall = this.createFun.call();
        f6lVarCall.m116948i(this.layoutCreateFun != null ? LayoutInflater.from(context).inflate(this.layoutCreateFun.call().intValue(), viewGroup, false) : LayoutInflater.from(context).inflate(this.layoutId, viewGroup, false));
        return f6lVarCall;
    }

    public String getAlias() {
        return this.alias;
    }

    public int getLayoutId() {
        pcj<Integer> pcjVar;
        int i = this.layoutId;
        return (i != 0 || (pcjVar = this.layoutCreateFun) == null) ? i : pcjVar.call().intValue();
    }

    public int getPreLoadSize() {
        return this.preLoadSize;
    }

    public int getType() {
        return this.typeIndex;
    }

    HomeCardExpandedType(pcj pcjVar, int i, String str, String str2, pcj pcjVar2, int i2) {
        this.layoutCreateFun = pcjVar;
        this.typeIndex = i;
        this.desc = str2;
        this.createFun = pcjVar2;
        this.alias = str;
        this.preLoadSize = i2;
    }
}
