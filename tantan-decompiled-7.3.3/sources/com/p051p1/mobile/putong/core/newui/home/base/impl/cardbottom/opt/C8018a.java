package com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8018a;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p137rx.subjects.C22507a;
import p153l.a7j;
import p153l.a8j;
import p153l.b7j;
import p153l.d79;
import p153l.du4;
import p153l.em2;
import p153l.f7j;
import p153l.gra;
import p153l.i7j;
import p153l.j6j;
import p153l.kcg0;
import p153l.o6j;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.qk4;
import p153l.r6j;
import p153l.r7j;
import p153l.s6j;
import p153l.s7j;
import p153l.u6j;
import p153l.uqb0;
import p153l.uqi;
import p153l.w6j;
import p153l.wyd0;
import p153l.x20;
import p153l.x6j;
import p153l.y20;
import p153l.y6j;
import p153l.z6j;
import p153l.z7j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8018a {

    /* JADX INFO: renamed from: g */
    public static boolean f22733g = false;

    /* JADX INFO: renamed from: h */
    public static C8018a f22734h;

    /* JADX INFO: renamed from: a */
    public List<CardBottomFrame> f22735a;

    /* JADX INFO: renamed from: f */
    public kcg0 f22740f;

    /* JADX INFO: renamed from: e */
    public List<String> f22739e = new ArrayList();

    /* JADX INFO: renamed from: d */
    public wyd0 f22738d = new wyd0("frame_old_load_list_" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: b */
    public HashMap<CardBottomFrame, em2> f22736b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public SparseArray<s7j> f22737c = new SparseArray<>();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22741a;

        static {
            int[] iArr = new int[CardBottomFrame.values().length];
            f22741a = iArr;
            try {
                iArr[CardBottomFrame.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22741a[CardBottomFrame.BOOK_MOVIE_DREAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22741a[CardBottomFrame.LETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22741a[CardBottomFrame.LIKE_STYLE_COMP_DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22741a[CardBottomFrame.LITERATURE_DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22741a[CardBottomFrame.LITERATURE_MESSAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22741a[CardBottomFrame.LIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22741a[CardBottomFrame.MOMENT_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22741a[CardBottomFrame.MOMENT_GREET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22741a[CardBottomFrame.MOMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22741a[CardBottomFrame.TAG.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22741a[CardBottomFrame.THEME_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22741a[CardBottomFrame.INTL_LIVE_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22741a[CardBottomFrame.INTL_VOICE_CARD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22741a[CardBottomFrame.INTL_FIREND_PURPOSE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22741a[CardBottomFrame.INTL_COMPLIMENT_RECEIVED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public C8018a() {
        m38424m();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m38412a(Bundle bundle) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m38413b(pf60 pf60Var) {
        uqi.m197339f(LaunchStep.PreNet);
        CoreModule.f18264c.f20405m0.m32130m8();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m38416e(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static C8018a m38417i() {
        if (f22734h == null) {
            synchronized (C8018a.class) {
                try {
                    if (f22734h == null) {
                        f22734h = new C8018a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22734h;
    }

    /* JADX INFO: renamed from: f */
    public void m38418f(Context context, qk4 qk4Var) {
        if (context instanceof Act) {
            Act act = (Act) context;
            if (act.isFinishing() || act.isDestroyed() || act.lifecycle_() == C4470c.f16271m || act.lifecycle_() == C4470c.f16273o) {
                return;
            }
            s7j s7jVarM38422k = m38422k(context);
            if (NullChecker.m82486a(s7jVarM38422k)) {
                s7jVarM38422k.m185008a(qk4Var.f158092a, qk4Var);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public qk4 m38419g(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context, FrameLayout frameLayout) {
        if (this.f22739e.size() < 4) {
            this.f22739e.add(cardBottomFrame.name());
            if (this.f22738d != null && this.f22739e.size() >= 4) {
                this.f22738d.put(du4.m118067a(Constants.SEPARATOR_COMMA, this.f22739e));
            }
        }
        qk4 qk4VarM185009b = m38422k(context).m185009b(cardBottomFrame);
        em2 em2VarM38423l = m38423l(cardBottomFrame);
        if (qk4VarM185009b == null) {
            qk4 qk4Var = new qk4(cardBottomFrame, ((Act) context).getLayoutInflater().inflate(cardBottomFrame.getFrameLayoutId(), (ViewGroup) frameLayout, false), em2VarM38423l);
            if (f22733g) {
                String str = c8021d.getUser().name;
            }
            qk4VarM185009b = qk4Var;
        } else if (f22733g) {
            String str2 = cardBottomFrame.explain;
            String str3 = c8021d.getUser().name;
        }
        qk4VarM185009b.m176924f(c8021d.m38477b());
        em2VarM38423l.m121316b(frameLayout, qk4VarM185009b.f158093b);
        em2VarM38423l.mo96365c(c8021d, qk4VarM185009b.f158093b, frameLayout, i, context);
        return qk4VarM185009b;
    }

    /* JADX INFO: renamed from: h */
    public List<CardBottomFrame> m38420h() {
        return this.f22735a;
    }

    /* JADX INFO: renamed from: j */
    public List<CardBottomFrame> m38421j() {
        String[] strArrSplit;
        ArrayList arrayList = new ArrayList();
        String str = this.f22738d.get();
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
    public final s7j m38422k(final Context context) {
        s7j s7jVar = this.f22737c.get(context.hashCode());
        if (s7jVar == null) {
            s7jVar = new s7j();
            this.f22737c.put(context.hashCode(), s7jVar);
            if (context instanceof Act) {
                ((Act) context).creates(new y20() { // from class: l.yh4
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8018a.m38412a((Bundle) obj);
                    }
                }, new x20() { // from class: l.zh4
                    @Override // p153l.x20
                    public final void call() {
                        this.f204373a.m38425n(context);
                    }
                });
            }
        }
        return s7jVar;
    }

    /* JADX INFO: renamed from: l */
    public em2 m38423l(CardBottomFrame cardBottomFrame) {
        em2 o6jVar = this.f22736b.get(cardBottomFrame);
        if (NullChecker.m82486a(o6jVar)) {
            return o6jVar;
        }
        switch (a.f22741a[cardBottomFrame.ordinal()]) {
            case 1:
                o6jVar = new o6j();
                break;
            case 2:
                o6jVar = new j6j();
                break;
            case 3:
                o6jVar = new x6j();
                break;
            case 4:
                o6jVar = new y6j();
                break;
            case 5:
                o6jVar = new z6j();
                break;
            case 6:
                o6jVar = new a7j();
                break;
            case 7:
                o6jVar = new b7j();
                break;
            case 8:
                o6jVar = new f7j();
                break;
            case 9:
                o6jVar = new i7j();
                break;
            case 10:
                o6jVar = new r7j();
                break;
            case 11:
                o6jVar = new z7j();
                break;
            case 12:
                o6jVar = new a8j();
                break;
            case 13:
                o6jVar = new u6j();
                break;
            case 14:
                o6jVar = new w6j();
                break;
            case 15:
                o6jVar = new s6j();
                break;
            case 16:
                o6jVar = new r6j();
                break;
        }
        this.f22736b.put(cardBottomFrame, o6jVar);
        return o6jVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m38424m() {
        ArrayList arrayList = new ArrayList();
        this.f22735a = arrayList;
        arrayList.add(CardBottomFrame.INTL_COMPLIMENT_RECEIVED);
        if (!d79.m114691m0()) {
            this.f22735a.add(CardBottomFrame.INTL_LIVE_CARD);
        }
        this.f22735a.add(CardBottomFrame.INTL_VOICE_CARD);
        if (gra.m131770x1()) {
            this.f22735a.add(CardBottomFrame.LIVE);
        }
        this.f22735a.add(CardBottomFrame.MOMENT_CARD);
        if (gra.m131613P1() || CoreModule.m30932N().mo61451Co()) {
            this.f22735a.add(CardBottomFrame.LIKE_STYLE_COMP_DEFAULT);
            this.f22735a.add(CardBottomFrame.MOMENT_GREET);
        }
        this.f22735a.add(CardBottomFrame.DEFAULT);
        this.f22735a.add(CardBottomFrame.INTL_FIREND_PURPOSE);
        if (gra.m131692h3()) {
            this.f22735a.add(CardBottomFrame.TAG);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m38425n(Context context) {
        this.f22737c.remove(context.hashCode());
    }

    /* JADX INFO: renamed from: o */
    public void m38426o() {
        this.f22735a = null;
        f22734h = null;
        psd0.m173633z(this.f22740f);
        C22507a<pf60<Boolean, Boolean>> c22507a = uqb0.f180363A0;
        c22507a.m137019l(pf60.m172085a(c22507a.m222761e().f152156a, Boolean.FALSE));
    }

    /* JADX INFO: renamed from: p */
    public void m38427p() {
        if (NullChecker.m82486a(this.f22740f)) {
            psd0.m173633z(this.f22740f);
        }
        this.f22740f = uqb0.f180363A0.filter(new qcj() { // from class: l.ai4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return Boolean.valueOf(((Boolean) pf60Var.f152156a).booleanValue() && ((Boolean) pf60Var.f152157b).booleanValue());
            }
        }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.bi4
            @Override // p153l.y20
            public final void call(Object obj) {
                C8018a.m38413b((pf60) obj);
            }
        }, new y20() { // from class: l.ci4
            @Override // p153l.y20
            public final void call(Object obj) {
                C8018a.m38416e((Throwable) obj);
            }
        }));
    }
}
