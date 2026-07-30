package com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7867a;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p133rx.subjects.C22392a;
import p149l.b4j;
import p149l.c4g0;
import p149l.c4j;
import p149l.d30;
import p149l.d4j;
import p149l.e30;
import p149l.e4j;
import p149l.e5j;
import p149l.et4;
import p149l.f4j;
import p149l.f5j;
import p149l.g4j;
import p149l.j760;
import p149l.k4j;
import p149l.mkd0;
import p149l.n4j;
import p149l.o3j;
import p149l.qib0;
import p149l.rj4;
import p149l.t3j;
import p149l.u59;
import p149l.upa;
import p149l.uqd0;
import p149l.w3j;
import p149l.w4j;
import p149l.w9j;
import p149l.wl2;
import p149l.x3j;
import p149l.x4j;
import p149l.yni;
import p149l.z3j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.a */
/* JADX INFO: loaded from: classes11.dex */
public class C7867a {

    /* JADX INFO: renamed from: g */
    public static boolean f21991g = false;

    /* JADX INFO: renamed from: h */
    public static C7867a f21992h;

    /* JADX INFO: renamed from: a */
    public List<CardBottomFrame> f21993a;

    /* JADX INFO: renamed from: f */
    public c4g0 f21998f;

    /* JADX INFO: renamed from: e */
    public List<String> f21997e = new ArrayList();

    /* JADX INFO: renamed from: d */
    public uqd0 f21996d = new uqd0("frame_old_load_list_" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: b */
    public HashMap<CardBottomFrame, wl2> f21994b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public SparseArray<x4j> f21995c = new SparseArray<>();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21999a;

        static {
            int[] iArr = new int[CardBottomFrame.values().length];
            f21999a = iArr;
            try {
                iArr[CardBottomFrame.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21999a[CardBottomFrame.BOOK_MOVIE_DREAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21999a[CardBottomFrame.LETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21999a[CardBottomFrame.LIKE_STYLE_COMP_DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21999a[CardBottomFrame.LITERATURE_DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21999a[CardBottomFrame.LITERATURE_MESSAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21999a[CardBottomFrame.LIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21999a[CardBottomFrame.MOMENT_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21999a[CardBottomFrame.MOMENT_GREET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21999a[CardBottomFrame.MOMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21999a[CardBottomFrame.TAG.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21999a[CardBottomFrame.THEME_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21999a[CardBottomFrame.INTL_LIVE_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21999a[CardBottomFrame.INTL_VOICE_CARD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21999a[CardBottomFrame.INTL_FIREND_PURPOSE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21999a[CardBottomFrame.INTL_COMPLIMENT_RECEIVED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public C7867a() {
        m37421m();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m37409a(Bundle bundle) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m37410b(j760 j760Var) {
        yni.m215417f(LaunchStep.PreNet);
        CoreModule.f17545c.f19663m0.m31127m8();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m37413e(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static C7867a m37414i() {
        if (f21992h == null) {
            synchronized (C7867a.class) {
                try {
                    if (f21992h == null) {
                        f21992h = new C7867a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21992h;
    }

    /* JADX INFO: renamed from: f */
    public void m37415f(Context context, rj4 rj4Var) {
        if (context instanceof Act) {
            Act act = (Act) context;
            if (act.isFinishing() || act.isDestroyed() || act.lifecycle_() == C4319c.f15552m || act.lifecycle_() == C4319c.f15554o) {
                return;
            }
            x4j x4jVarM37419k = m37419k(context);
            if (NullChecker.m81303a(x4jVarM37419k)) {
                x4jVarM37419k.m206985a(rj4Var.f159626a, rj4Var);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public rj4 m37416g(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context, FrameLayout frameLayout) {
        if (this.f21997e.size() < 4) {
            this.f21997e.add(cardBottomFrame.name());
            if (this.f21996d != null && this.f21997e.size() >= 4) {
                this.f21996d.put(et4.m117971a(Constants.SEPARATOR_COMMA, this.f21997e));
            }
        }
        rj4 rj4VarM206986b = m37419k(context).m206986b(cardBottomFrame);
        wl2 wl2VarM37420l = m37420l(cardBottomFrame);
        if (rj4VarM206986b == null) {
            rj4 rj4Var = new rj4(cardBottomFrame, ((Act) context).getLayoutInflater().inflate(cardBottomFrame.getFrameLayoutId(), (ViewGroup) frameLayout, false), wl2VarM37420l);
            if (f21991g) {
                String str = c7870d.getUser().name;
            }
            rj4VarM206986b = rj4Var;
        } else if (f21991g) {
            String str2 = cardBottomFrame.explain;
            String str3 = c7870d.getUser().name;
        }
        rj4VarM206986b.m179551f(c7870d.m37474b());
        wl2VarM37420l.m203738b(frameLayout, rj4VarM206986b.f159627b);
        wl2VarM37420l.mo100261c(c7870d, rj4VarM206986b.f159627b, frameLayout, i, context);
        return rj4VarM206986b;
    }

    /* JADX INFO: renamed from: h */
    public List<CardBottomFrame> m37417h() {
        return this.f21993a;
    }

    /* JADX INFO: renamed from: j */
    public List<CardBottomFrame> m37418j() {
        String[] strArrSplit;
        ArrayList arrayList = new ArrayList();
        String str = this.f21996d.get();
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(Constants.SEPARATOR_COMMA)) != null && strArrSplit.length > 0) {
            for (String str2 : strArrSplit) {
                try {
                    arrayList.add(CardBottomFrame.valueOf(str2));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final x4j m37419k(final Context context) {
        x4j x4jVar = this.f21995c.get(context.hashCode());
        if (x4jVar == null) {
            x4jVar = new x4j();
            this.f21995c.put(context.hashCode(), x4jVar);
            if (context instanceof Act) {
                ((Act) context).creates(new e30() { // from class: l.zg4
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C7867a.m37409a((Bundle) obj);
                    }
                }, new d30() { // from class: l.ah4
                    @Override // p149l.d30
                    public final void call() {
                        this.f69549a.m37422n(context);
                    }
                });
            }
        }
        return x4jVar;
    }

    /* JADX INFO: renamed from: l */
    public wl2 m37420l(CardBottomFrame cardBottomFrame) {
        wl2 t3jVar = this.f21994b.get(cardBottomFrame);
        if (NullChecker.m81303a(t3jVar)) {
            return t3jVar;
        }
        switch (a.f21999a[cardBottomFrame.ordinal()]) {
            case 1:
                t3jVar = new t3j();
                break;
            case 2:
                t3jVar = new o3j();
                break;
            case 3:
                t3jVar = new c4j();
                break;
            case 4:
                t3jVar = new d4j();
                break;
            case 5:
                t3jVar = new e4j();
                break;
            case 6:
                t3jVar = new f4j();
                break;
            case 7:
                t3jVar = new g4j();
                break;
            case 8:
                t3jVar = new k4j();
                break;
            case 9:
                t3jVar = new n4j();
                break;
            case 10:
                t3jVar = new w4j();
                break;
            case 11:
                t3jVar = new e5j();
                break;
            case 12:
                t3jVar = new f5j();
                break;
            case 13:
                t3jVar = new z3j();
                break;
            case 14:
                t3jVar = new b4j();
                break;
            case 15:
                t3jVar = new x3j();
                break;
            case 16:
                t3jVar = new w3j();
                break;
        }
        this.f21994b.put(cardBottomFrame, t3jVar);
        return t3jVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m37421m() {
        ArrayList arrayList = new ArrayList();
        this.f21993a = arrayList;
        arrayList.add(CardBottomFrame.INTL_COMPLIMENT_RECEIVED);
        if (!u59.m191833i0()) {
            this.f21993a.add(CardBottomFrame.INTL_LIVE_CARD);
        }
        this.f21993a.add(CardBottomFrame.INTL_VOICE_CARD);
        if (upa.m194839x1()) {
            this.f21993a.add(CardBottomFrame.LIVE);
        }
        this.f21993a.add(CardBottomFrame.MOMENT_CARD);
        if (upa.m194682P1() || CoreModule.m29934N().mo60267Co()) {
            this.f21993a.add(CardBottomFrame.LIKE_STYLE_COMP_DEFAULT);
            this.f21993a.add(CardBottomFrame.MOMENT_GREET);
        }
        this.f21993a.add(CardBottomFrame.DEFAULT);
        this.f21993a.add(CardBottomFrame.INTL_FIREND_PURPOSE);
        if (upa.m194761h3()) {
            this.f21993a.add(CardBottomFrame.TAG);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m37422n(Context context) {
        this.f21995c.remove(context.hashCode());
    }

    /* JADX INFO: renamed from: o */
    public void m37423o() {
        this.f21993a = null;
        f21992h = null;
        mkd0.m154992z(this.f21998f);
        C22392a<j760<Boolean, Boolean>> c22392a = qib0.f154680A0;
        c22392a.m132487l(j760.m140076a(c22392a.m221515e().f116564a, Boolean.FALSE));
    }

    /* JADX INFO: renamed from: p */
    public void m37424p() {
        if (NullChecker.m81303a(this.f21998f)) {
            mkd0.m154992z(this.f21998f);
        }
        this.f21998f = qib0.f154680A0.filter(new w9j() { // from class: l.bh4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(((Boolean) j760Var.f116564a).booleanValue() && ((Boolean) j760Var.f116565b).booleanValue());
            }
        }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.ch4
            @Override // p149l.e30
            public final void call(Object obj) {
                C7867a.m37410b((j760) obj);
            }
        }, new e30() { // from class: l.dh4
            @Override // p149l.e30
            public final void call(Object obj) {
                C7867a.m37413e((Throwable) obj);
            }
        }));
    }
}
