package com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0031a;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.util.launch.LaunchStep;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.c4g0;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.qib0;
import l.u59;
import l.upa;
import l.uqd0;
import l.w9j;
import p009l.b4j;
import p009l.c4j;
import p009l.d4j;
import p009l.e4j;
import p009l.e5j;
import p009l.et4;
import p009l.f4j;
import p009l.f5j;
import p009l.g4j;
import p009l.k4j;
import p009l.n4j;
import p009l.o3j;
import p009l.rj4;
import p009l.t3j;
import p009l.w3j;
import p009l.w4j;
import p009l.wl2;
import p009l.x3j;
import p009l.x4j;
import p009l.yni;
import p009l.z3j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0031a {

    /* JADX INFO: renamed from: g */
    public static boolean f769g = false;

    /* JADX INFO: renamed from: h */
    public static C0031a f770h;

    /* JADX INFO: renamed from: a */
    public List<CardBottomFrame> f771a;

    /* JADX INFO: renamed from: f */
    public c4g0 f776f;

    /* JADX INFO: renamed from: e */
    public List<String> f775e = new ArrayList();

    /* JADX INFO: renamed from: d */
    public uqd0 f774d = new uqd0("frame_old_load_list_" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: b */
    public HashMap<CardBottomFrame, wl2> f772b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public SparseArray<x4j> f773c = new SparseArray<>();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f777a;

        static {
            int[] iArr = new int[CardBottomFrame.values().length];
            f777a = iArr;
            try {
                iArr[CardBottomFrame.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f777a[CardBottomFrame.BOOK_MOVIE_DREAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f777a[CardBottomFrame.LETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f777a[CardBottomFrame.LIKE_STYLE_COMP_DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f777a[CardBottomFrame.LITERATURE_DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f777a[CardBottomFrame.LITERATURE_MESSAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f777a[CardBottomFrame.LIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f777a[CardBottomFrame.MOMENT_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f777a[CardBottomFrame.MOMENT_GREET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f777a[CardBottomFrame.MOMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f777a[CardBottomFrame.TAG.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f777a[CardBottomFrame.THEME_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f777a[CardBottomFrame.INTL_LIVE_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f777a[CardBottomFrame.INTL_VOICE_CARD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f777a[CardBottomFrame.INTL_FIREND_PURPOSE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f777a[CardBottomFrame.INTL_COMPLIMENT_RECEIVED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public C0031a() {
        m1392m();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1380a(Bundle bundle) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1381b(j760 j760Var) {
        yni.m25474f(LaunchStep.PreNet);
        CoreModule.c.m0.m8();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m1384e(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static C0031a m1385i() {
        if (f770h == null) {
            synchronized (C0031a.class) {
                try {
                    if (f770h == null) {
                        f770h = new C0031a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f770h;
    }

    /* JADX INFO: renamed from: f */
    public void m1386f(Context context, rj4 rj4Var) {
        if (context instanceof Act) {
            Act act = (Act) context;
            if (act.isFinishing() || act.isDestroyed() || act.lifecycle_() == c.m || act.lifecycle_() == c.o) {
                return;
            }
            x4j x4jVarM1390k = m1390k(context);
            if (NullChecker.a(x4jVarM1390k)) {
                x4jVarM1390k.m24704a(rj4Var.f19858a, rj4Var);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public rj4 m1387g(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context, FrameLayout frameLayout) {
        if (this.f775e.size() < 4) {
            this.f775e.add(cardBottomFrame.name());
            if (this.f774d != null && this.f775e.size() >= 4) {
                this.f774d.put(et4.m14104a(",", this.f775e));
            }
        }
        rj4 rj4VarM24705b = m1390k(context).m24705b(cardBottomFrame);
        wl2 wl2VarM1391l = m1391l(cardBottomFrame);
        if (rj4VarM24705b == null) {
            rj4 rj4Var = new rj4(cardBottomFrame, ((Act) context).getLayoutInflater().inflate(cardBottomFrame.getFrameLayoutId(), (ViewGroup) frameLayout, false), wl2VarM1391l);
            if (f769g) {
                String str = c0034d.getUser().name;
            }
            rj4VarM24705b = rj4Var;
        } else if (f769g) {
            String str2 = cardBottomFrame.explain;
            String str3 = c0034d.getUser().name;
        }
        rj4VarM24705b.m21683f(c0034d.m1445b());
        wl2VarM1391l.m24307b(frameLayout, rj4VarM24705b.f19859b);
        wl2VarM1391l.mo11838c(c0034d, rj4VarM24705b.f19859b, frameLayout, i, context);
        return rj4VarM24705b;
    }

    /* JADX INFO: renamed from: h */
    public List<CardBottomFrame> m1388h() {
        return this.f771a;
    }

    /* JADX INFO: renamed from: j */
    public List<CardBottomFrame> m1389j() {
        String[] strArrSplit;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.f774d.get();
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(",")) != null && strArrSplit.length > 0) {
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
    public final x4j m1390k(final Context context) {
        x4j x4jVar = this.f773c.get(context.hashCode());
        if (x4jVar == null) {
            x4jVar = new x4j();
            this.f773c.put(context.hashCode(), x4jVar);
            if (context instanceof Act) {
                ((Act) context).creates(new e30() { // from class: l.zg4
                    public final void call(Object obj) {
                        C0031a.m1380a((Bundle) obj);
                    }
                }, new d30() { // from class: l.ah4
                    public final void call() {
                        this.f9499a.m1393n(context);
                    }
                });
            }
        }
        return x4jVar;
    }

    /* JADX INFO: renamed from: l */
    public wl2 m1391l(CardBottomFrame cardBottomFrame) {
        wl2 t3jVar = this.f772b.get(cardBottomFrame);
        if (NullChecker.a(t3jVar)) {
            return t3jVar;
        }
        switch (a.f777a[cardBottomFrame.ordinal()]) {
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
            case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                t3jVar = new n4j();
                break;
            case 10:
                t3jVar = new w4j();
                break;
            case MediaPickerParamsObject.FROM_CHAT_SWITCH_BACK_PIC /* 11 */:
                t3jVar = new e5j();
                break;
            case MediaPickerParamsObject.FROM_PROFILE_WEALTH /* 12 */:
                t3jVar = new f5j();
                break;
            case MediaPickerParamsObject.FROM_CHAT_LIMIT_SHOOT_PIC /* 13 */:
                t3jVar = new z3j();
                break;
            case MediaPickerParamsObject.FROM_CITY_CENTER_UPLOAD_PIC /* 14 */:
                t3jVar = new b4j();
                break;
            case MediaPickerParamsObject.FROM_PROFILE_GAME /* 15 */:
                t3jVar = new x3j();
                break;
            case MediaPickerParamsObject.FROM_DEFAULT /* 16 */:
                t3jVar = new w3j();
                break;
        }
        this.f772b.put(cardBottomFrame, t3jVar);
        return t3jVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m1392m() {
        ArrayList arrayList = new ArrayList();
        this.f771a = arrayList;
        arrayList.add(CardBottomFrame.INTL_COMPLIMENT_RECEIVED);
        if (!u59.i0()) {
            this.f771a.add(CardBottomFrame.INTL_LIVE_CARD);
        }
        this.f771a.add(CardBottomFrame.INTL_VOICE_CARD);
        if (upa.x1()) {
            this.f771a.add(CardBottomFrame.LIVE);
        }
        this.f771a.add(CardBottomFrame.MOMENT_CARD);
        if (upa.P1() || CoreModule.N().Co()) {
            this.f771a.add(CardBottomFrame.LIKE_STYLE_COMP_DEFAULT);
            this.f771a.add(CardBottomFrame.MOMENT_GREET);
        }
        this.f771a.add(CardBottomFrame.DEFAULT);
        this.f771a.add(CardBottomFrame.INTL_FIREND_PURPOSE);
        if (upa.h3()) {
            this.f771a.add(CardBottomFrame.TAG);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m1393n(Context context) {
        this.f773c.remove(context.hashCode());
    }

    /* JADX INFO: renamed from: o */
    public void m1394o() {
        this.f771a = null;
        f770h = null;
        mkd0.z(this.f776f);
        rx.subjects.a aVar = qib0.A0;
        aVar.onNext(j760.a((Boolean) ((j760) aVar.e()).a, Boolean.FALSE));
    }

    /* JADX INFO: renamed from: p */
    public void m1395p() {
        if (NullChecker.a(this.f776f)) {
            mkd0.z(this.f776f);
        }
        this.f776f = qib0.A0.filter(new w9j() { // from class: l.bh4
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(((Boolean) j760Var.a).booleanValue() && ((Boolean) j760Var.b).booleanValue());
            }
        }).take(1).subscribe(mkd0.H(new e30() { // from class: l.ch4
            public final void call(Object obj) {
                C0031a.m1381b((j760) obj);
            }
        }, new e30() { // from class: l.dh4
            public final void call(Object obj) {
                C0031a.m1384e((Throwable) obj);
            }
        }));
    }
}
