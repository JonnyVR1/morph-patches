package com.p000p1.mobile.putong.core.newui.home.card.expanded.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p1.mobile.putong.core.CoreModule;
import l.f6c0;
import l.v9j;
import p009l.C1227v2;
import p009l.ada0;
import p009l.apb0;
import p009l.ccr;
import p009l.d0l0;
import p009l.dr5;
import p009l.haa0;
import p009l.hwk;
import p009l.hxm;
import p009l.ip00;
import p009l.kv10;
import p009l.n320;
import p009l.nt90;
import p009l.p3l;
import p009l.ti90;
import p009l.toc0;
import p009l.v4i0;
import p009l.ws2;
import p009l.zwk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public enum HomeCardExpandedType {
    REPORT(f6c0.V0, 0, "report", "举报", new v9j() { // from class: l.z3l
        public final Object call() {
            return HomeCardExpandedType.m2118v();
        }
    }, 2),
    AVATAR(new v9j() { // from class: l.b4l
        public final Object call() {
            return Integer.valueOf(f6c0.I0);
        }
    }, 1, "avatar", "头图-基本信息", new v9j() { // from class: l.n4l
        public final Object call() {
            return HomeCardExpandedType.m2120x();
        }
    }, 2),
    LIVE_ROOM(new v9j() { // from class: l.o4l
        public final Object call() {
            return Integer.valueOf(CoreModule.Q().m9053gg());
        }
    }, 2, "liveRoom", "直播间-语音房", new v9j() { // from class: l.p4l
        public final Object call() {
            return HomeCardExpandedType.m2098I();
        }
    }, 2),
    ABOUT_ME(f6c0.f0, 3, "my_bio", "my bio", new v9j() { // from class: l.q4l
        public final Object call() {
            return HomeCardExpandedType.m2112p();
        }
    }, 2),
    LIFE_PIC(f6c0.L0, 4, "life_pic", "生活照", new v9j() { // from class: l.r4l
        public final Object call() {
            return HomeCardExpandedType.m2113q();
        }
    }, 3),
    MOMENT(f6c0.N0, 5, "moment", "动态", new v9j() { // from class: l.s4l
        public final Object call() {
            return HomeCardExpandedType.m2122z();
        }
    }, 2),
    BASE_INFO(f6c0.g0, 6, "aboutMe", "个人信息", new v9j() { // from class: l.t4l
        public final Object call() {
            return HomeCardExpandedType.m2121y();
        }
    }, 2),
    QUESTION(f6c0.T0, 7, "questionAnswer", "问答", new v9j() { // from class: l.u4l
        public final Object call() {
            return HomeCardExpandedType.m2109m();
        }
    }, 1),
    VERIFY(f6c0.Y0, 8, "verification", "我的认证信息", new v9j() { // from class: l.k4l
        public final Object call() {
            return HomeCardExpandedType.m2095C();
        }
    }, 1),
    CARD_NAME(new v9j() { // from class: l.v4l
        public final Object call() {
            return Integer.valueOf(f6c0.O0);
        }
    }, 9, "name", "名称-头像下面显示", new v9j() { // from class: l.w4l
        public final Object call() {
            return HomeCardExpandedType.m2097H();
        }
    }, 2),
    RELATIONSHIP_GOALS(new v9j() { // from class: l.x4l
        public final Object call() {
            return Integer.valueOf(f6c0.U0);
        }
    }, 10, "relationship_goals", "恋爱目标", new v9j() { // from class: l.y4l
        public final Object call() {
            return HomeCardExpandedType.m2103b();
        }
    }, 2),
    INTERESTS(new v9j() { // from class: l.z4l
        public final Object call() {
            return Integer.valueOf(f6c0.K0);
        }
    }, 11, "interests", "兴趣爱好", new v9j() { // from class: l.a5l
        public final Object call() {
            return HomeCardExpandedType.m2115s();
        }
    }, 2),
    HASH_TAG(new v9j() { // from class: l.b5l
        public final Object call() {
            return Integer.valueOf(f6c0.H0);
        }
    }, 12, "hash_tag", "多个标签", new v9j() { // from class: l.c5l
        public final Object call() {
            return HomeCardExpandedType.m2100K();
        }
    }, 2),
    ADMOB(new v9j() { // from class: l.a4l
        public final Object call() {
            return Integer.valueOf(f6c0.Q0);
        }
    }, 13, "admob", "广告", new v9j() { // from class: l.c4l
        public final Object call() {
            return HomeCardExpandedType.m2096F();
        }
    }, 2),
    MEMBER(new v9j() { // from class: l.d4l
        public final Object call() {
            return Integer.valueOf(f6c0.R0);
        }
    }, 14, "member", "会员", new v9j() { // from class: l.e4l
        public final Object call() {
            return HomeCardExpandedType.m2117u();
        }
    }, 2),
    LIKES(new v9j() { // from class: l.f4l
        public final Object call() {
            return Integer.valueOf(f6c0.S0);
        }
    }, 15, "likes", "几人喜欢我", new v9j() { // from class: l.g4l
        public final Object call() {
            return HomeCardExpandedType.m2094B();
        }
    }, 2),
    TANTANID(f6c0.W0, 16, "tantanid", "Tantan ID", new v9j() { // from class: l.h4l
        public final Object call() {
            return HomeCardExpandedType.m2104f();
        }
    }, 2),
    COMPLIMENT(new v9j() { // from class: l.i4l
        public final Object call() {
            return Integer.valueOf(f6c0.D0);
        }
    }, 17, "compliment", "称赞栏", new v9j() { // from class: l.j4l
        public final Object call() {
            return HomeCardExpandedType.m2116t();
        }
    }, 2),
    COMPLIMENT_RECEIVED(new v9j() { // from class: l.l4l
        public final Object call() {
            return Integer.valueOf(f6c0.E0);
        }
    }, 18, "compliment_received", "收到的称赞", new v9j() { // from class: l.m4l
        public final Object call() {
            return HomeCardExpandedType.m2110n();
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
    public static /* synthetic */ p3l m2094B() {
        return new ada0();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ p3l m2095C() {
        return new d0l0();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ p3l m2096F() {
        return new nt90();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ p3l m2097H() {
        return new n320();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ p3l m2098I() {
        return new kv10();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ p3l m2100K() {
        return new hwk();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ p3l m2103b() {
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
    public static /* synthetic */ p3l m2104f() {
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
    public static /* synthetic */ p3l m2109m() {
        return new apb0();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ p3l m2110n() {
        return new dr5();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ p3l m2112p() {
        return new C1227v2();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ p3l m2113q() {
        return new ccr();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ p3l m2115s() {
        return new hxm();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ p3l m2116t() {
        return new ti90();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ p3l m2117u() {
        return new haa0();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ p3l m2118v() {
        return new ReportCardExpandeHolder();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ p3l m2120x() {
        return new zwk();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ p3l m2121y() {
        return new ws2();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ p3l m2122z() {
        return new ip00();
    }

    public p3l createEmptyHolder() {
        return (p3l) this.createFun.call();
    }

    public p3l createHolder(Context context, ViewGroup viewGroup) {
        p3l p3lVar = (p3l) this.createFun.call();
        p3lVar.m24917i(this.layoutCreateFun != null ? LayoutInflater.from(context).inflate(((Integer) this.layoutCreateFun.call()).intValue(), viewGroup, false) : LayoutInflater.from(context).inflate(this.layoutId, viewGroup, false));
        return p3lVar;
    }

    public String getAlias() {
        return this.alias;
    }

    public int getLayoutId() {
        v9j<Integer> v9jVar;
        int i = this.layoutId;
        return (i != 0 || (v9jVar = this.layoutCreateFun) == null) ? i : ((Integer) v9jVar.call()).intValue();
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
