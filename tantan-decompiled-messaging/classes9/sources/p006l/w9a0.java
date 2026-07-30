package p006l;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.d30;
import l.e520;
import l.g6l0;
import l.h70;
import l.hmb;
import l.i520;
import l.irv;
import l.j70;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.qqi0;
import l.t100;
import l.u0n;
import l.vwb;
import l.w70;
import l.w9j;
import l.xdl0;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class w9a0 {

    /* JADX INFO: renamed from: d */
    public static final String f25040d = "w9a0";

    /* JADX INFO: renamed from: e */
    public static w9a0 f25041e;

    /* JADX INFO: renamed from: a */
    public boolean f25042a;

    /* JADX INFO: renamed from: b */
    public String f25043b = "";

    /* JADX INFO: renamed from: c */
    public e520 f25044c;

    /* JADX INFO: renamed from: l.w9a0$a */
    public class C1400a extends h70 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f25045a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f25046b;

        public C1400a(z3g0 z3g0Var, boolean z) {
            this.f25045a = z3g0Var;
            this.f25046b = z;
        }

        public void onAdClicked() {
            super.onAdClicked();
            if (this.f25046b) {
                o6j0.c("e_clone_profile_photo_ads", "p_suggest_users_home_view", new o6j0.a[0]);
            }
        }

        /* JADX INFO: renamed from: x */
        public void m26296x(@NonNull irv irvVar) {
            super.x(irvVar);
            hfw.m16208a(w9a0.f25040d, "admob onAdFailedToLoad = ca-app-pub-6567608331519569/1891609663errorCode:" + irvVar);
            this.f25045a.onNext(new Pair(null, "ca-app-pub-6567608331519569/1891609663"));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m26266b(Act act, z3g0 z3g0Var) {
        if (!NullChecker.a(act) || act.isFinishing()) {
            z3g0Var.onNext(new Pair(null, "ca-app-pub-6567608331519569/1891609663"));
        } else {
            z3g0Var.onNext(new Pair(new j70.a(act, "ca-app-pub-6567608331519569/1891609663"), "ca-app-pub-6567608331519569/1891609663"));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m26271g(e520 e520Var, FrameLayout frameLayout, NativeAdView nativeAdView) {
        float fC = e520Var.f().c();
        xdl0.C0(nativeAdView.getMediaView(), (int) (nativeAdView.getMediaView().getWidth() / fC));
        if (fC >= 1.7f) {
            xdl0.U(frameLayout.findViewById(u4c0.f23119n), t100.d(36.0f));
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.findViewById(u4c0.f23119n).getLayoutParams();
        layoutParams.gravity = 81;
        frameLayout.findViewById(u4c0.f23119n).setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: m */
    public static w9a0 m26276m() {
        if (f25041e == null) {
            synchronized (w9a0.class) {
                try {
                    if (f25041e == null) {
                        f25041e = new w9a0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25041e;
    }

    /* JADX INFO: renamed from: A */
    public void m26277A(ViewGroup viewGroup, Act act, d30 d30Var) {
        if (NullChecker.a(this.f25044c)) {
            m26295z(viewGroup, act, d30Var, this.f25044c);
        } else {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m26278B(String str) {
        this.f25043b = str;
    }

    /* JADX INFO: renamed from: C */
    public final void m26279C(final TextView textView, final TextView textView2, final TextView textView3, final Act act) {
        textView.post(new Runnable() { // from class: l.t9a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21963a.m26292w(act, textView, textView3, textView2);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m26280D(boolean z) {
        if (z) {
            m26282l();
        }
        this.f25042a = z;
    }

    /* JADX INFO: renamed from: E */
    public void m26281E(Act act, boolean z) {
        o6j0.c(z ? "e_profile_photo_no_ad_button" : "e_profile_info_no_ad_button", "p_suggest_user_profile_info_view", new o6j0.a[0]);
        if (!CoreModule.f1534c.f3643j0.m2502B4()) {
            CoreModule.m1854P().m11706a().m5458i6(act, z ? "p_suggest_user_profile_info_view,e_profile_photo_no_ad_button,click" : "p_suggest_user_profile_info_view,e_profile_info_no_ad_button,click", Privilege.intl_no_ad);
            return;
        }
        Intent intentA2 = WebViewAct.a2(act, CoreModule.f1534c.f3643j0.m2504C4().titleText, CoreModule.f1534c.f3643j0.m2504C4().promotionUrl, true);
        intentA2.putExtra("hideNavigationBar", true);
        act.startActivity(intentA2);
    }

    /* JADX INFO: renamed from: l */
    public final void m26282l() {
        int iIntValue = ((Integer) CoreModule.f1534c.f3628e0.f18899V1.get()).intValue();
        if (iIntValue > 0) {
            CoreModule.f1534c.f3628e0.f18899V1.put(Integer.valueOf(iIntValue - 1));
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m26283n() {
        return ((Integer) CoreModule.f1534c.f3628e0.f18899V1.get()).intValue();
    }

    /* JADX INFO: renamed from: o */
    public boolean m26284o() {
        return this.f25042a;
    }

    /* JADX INFO: renamed from: p */
    public boolean m26285p(User user) {
        return NullChecker.a(user) && m26286q() && TEnum.equals(user.gender, "female");
    }

    /* JADX INFO: renamed from: q */
    public boolean m26286q() {
        Settings settings;
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (userM21490p9 != null && (settings = userM21490p9.settings) != null && !vwb.J(settings.settingGroups)) {
            LookingFor lookingFor = settings.getSettingGroup().search.lookingForGender;
            if (qqi0.h(mqi0.o(), (long) userM21490p9.createdTime, u59.f23350h) && TEnum.equals(userM21490p9.gender, "male") && !TEnum.equals(lookingFor, "male") && !vdj.m25808e() && u59.m25013n() && m26283n() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m26287r(Act act, Pair pair, boolean z, final z3g0 z3g0Var) {
        if (!NullChecker.a(act) || act.isFinishing() || !NullChecker.a(pair.first)) {
            z3g0Var.onNext(new Pair(null, "ca-app-pub-6567608331519569/1891609663"));
            return;
        }
        ((j70.a) pair.first).b(new e520.c() { // from class: l.v9a0
            /* JADX INFO: renamed from: a */
            public final void m25770a(e520 e520Var) {
                z3g0Var.onNext(new Pair(e520Var, "ca-app-pub-6567608331519569/1891609663"));
            }
        });
        ((j70.a) pair.first).d(new i520.a().h(new g6l0.a().b(true).a()).a());
        j70 j70VarA = ((j70.a) pair.first).c(new C1400a(z3g0Var, z)).a();
        w70.a aVar = new w70.a();
        if (TextUtils.isEmpty(this.f25043b)) {
            aVar.e(u0n.g(false));
        } else {
            aVar.d(this.f25043b);
        }
        j70VarA.a(aVar.i());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ c m26288s(final Act act, final boolean z, final Pair pair) {
        return c.create(new c.a() { // from class: l.u9a0
            public final void call(Object obj) {
                this.f23436a.m26287r(act, pair, z, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Boolean m26289t(Pair pair) {
        e520 e520Var = (e520) pair.first;
        this.f25044c = e520Var;
        return Boolean.valueOf(e520Var != null);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Boolean m26290u(Throwable th) {
        this.f25044c = null;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m26291v(Act act, View view) {
        m26281E(act, true);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m26292w(Act act, TextView textView, TextView textView2, TextView textView3) {
        if (!NullChecker.a(act) || act.isFinishing()) {
            return;
        }
        if (hmb.u1(textView.getTextSize()) > 18) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
        }
        if (xdl0.O0(textView) && textView.getWidth() + textView3.getWidth() + t100.d(96.0f) > xdl0.y0()) {
            textView.setTextSize(hmb.u1(textView.getTextSize()) - 1);
            m26279C(textView, textView3, textView2, act);
        } else {
            if (!xdl0.O0(textView2) || textView2.getWidth() + textView3.getWidth() + t100.d(96.0f) <= xdl0.y0()) {
                return;
            }
            textView2.setTextSize(hmb.u1(textView2.getTextSize()) - 1);
            m26279C(textView, textView3, textView2, act);
        }
    }

    /* JADX INFO: renamed from: x */
    public final c<Pair<e520, String>> m26293x(final Act act, final boolean z) {
        return c.create(new c.a() { // from class: l.r9a0
            public final void call(Object obj) {
                w9a0.m26266b(act, (z3g0) obj);
            }
        }).observeOn(jo0.a()).flatMap(new w9j() { // from class: l.s9a0
            public final Object call(Object obj) {
                return this.f21153a.m26288s(act, z, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public c<Boolean> m26294y(Act act, boolean z) {
        if (r70.m22713g().m22714f()) {
            return !m26286q() ? c.just(Boolean.FALSE) : m26293x(act, z).map(new w9j() { // from class: l.m9a0
                public final Object call(Object obj) {
                    return this.f16872a.m26289t((Pair) obj);
                }
            }).onErrorReturn(new w9j() { // from class: l.n9a0
                public final Object call(Object obj) {
                    return this.f17543a.m26290u((Throwable) obj);
                }
            });
        }
        return c.just(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: z */
    public final void m26295z(ViewGroup viewGroup, final Act act, final d30 d30Var, final e520 e520Var) {
        final FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f11716C3, (ViewGroup) null);
        final NativeAdView nativeAdViewFindViewById = frameLayout.findViewById(u4c0.f22643K8);
        View viewFindViewById = frameLayout.findViewById(u4c0.f23051j);
        nativeAdViewFindViewById.setMediaView(frameLayout.findViewById(u4c0.f23119n));
        nativeAdViewFindViewById.setHeadlineView(frameLayout.findViewById(u4c0.f22939c5));
        nativeAdViewFindViewById.setBodyView(frameLayout.findViewById(u4c0.f23001g));
        nativeAdViewFindViewById.setCallToActionView(frameLayout.findViewById(u4c0.f23018h));
        nativeAdViewFindViewById.setIconView(frameLayout.findViewById(u4c0.f22702O));
        ((TextView) nativeAdViewFindViewById.getHeadlineView()).setText(e520Var.d());
        TextView textView = (TextView) frameLayout.findViewById(u4c0.f22956d5);
        textView.setText(e520Var.d());
        m26279C((TextView) frameLayout.findViewById(u4c0.f22939c5), (TextView) frameLayout.findViewById(u4c0.f23018h), textView, act);
        if (NullChecker.a(e520Var.f())) {
            nativeAdViewFindViewById.getMediaView().setMediaContent(e520Var.f());
            nativeAdViewFindViewById.getMediaView().post(new Runnable() { // from class: l.o9a0
                @Override // java.lang.Runnable
                public final void run() {
                    w9a0.m26271g(e520Var, frameLayout, nativeAdViewFindViewById);
                }
            });
            Drawable drawableB = e520Var.f().b();
            ImageView imageView = (ImageView) frameLayout.findViewById(u4c0.f23313y6);
            if (drawableB != null) {
                c cVarDuringCreated = act.duringCreated(u0n.s(drawableB, 25, true));
                Objects.requireNonNull(imageView);
                cVarDuringCreated.subscribe(mkd0.H(new y60(imageView), new z60()));
            } else {
                imageView.setBackgroundColor(Color.parseColor("#FFEDE5"));
            }
        }
        if (e520Var.b() == null) {
            xdl0.M0(nativeAdViewFindViewById.getBodyView(), false);
        } else {
            xdl0.M0(nativeAdViewFindViewById.getBodyView(), true);
            ((TextView) nativeAdViewFindViewById.getBodyView()).setText(e520Var.b());
        }
        if (e520Var.c() == null) {
            xdl0.M0(nativeAdViewFindViewById.getCallToActionView(), false);
        } else {
            xdl0.M0(nativeAdViewFindViewById.getCallToActionView(), true);
            ((TextView) nativeAdViewFindViewById.getCallToActionView()).setText(e520Var.c());
        }
        if (e520Var.e() == null) {
            xdl0.M0(nativeAdViewFindViewById.getIconView(), false);
        } else {
            ((ImageView) nativeAdViewFindViewById.getIconView()).setImageDrawable(e520Var.e().a());
            xdl0.M0(nativeAdViewFindViewById.getIconView(), true);
        }
        nativeAdViewFindViewById.setNativeAd(e520Var);
        o6j0.h("e_profile_photo_no_ad_button", "p_suggest_user_profile_info_view", new o6j0.a[0]);
        frameLayout.findViewById(u4c0.f23280w7).setOnClickListener(new View.OnClickListener() { // from class: l.p9a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18638a.m26291v(act, view);
            }
        });
        xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.q9a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        viewGroup.removeAllViews();
        viewGroup.addView(frameLayout);
    }
}
