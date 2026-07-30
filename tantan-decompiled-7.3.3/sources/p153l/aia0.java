package p153l;

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
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class aia0 {

    /* JADX INFO: renamed from: d */
    public static final String f71469d = "aia0";

    /* JADX INFO: renamed from: e */
    public static aia0 f71470e;

    /* JADX INFO: renamed from: a */
    public boolean f71471a;

    /* JADX INFO: renamed from: b */
    public String f71472b = "";

    /* JADX INFO: renamed from: c */
    public md20 f71473c;

    /* JADX INFO: renamed from: l.aia0$a */
    public class C15713a extends d70 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f71474a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f71475b;

        public C15713a(gcg0 gcg0Var, boolean z) {
            this.f71474a = gcg0Var;
            this.f71475b = z;
        }

        @Override // p153l.d70
        public void onAdClicked() {
            super.onAdClicked();
            if (this.f71475b) {
                sfj0.m185596c("e_clone_profile_photo_ads", "p_suggest_users_home_view", new sfj0.C20032a[0]);
            }
        }

        @Override // p153l.d70
        /* JADX INFO: renamed from: x */
        public void mo30988x(@NonNull jtv jtvVar) {
            super.mo30988x(jtvVar);
            fhw.m125605a(aia0.f71469d, "admob onAdFailedToLoad = ca-app-pub-6567608331519569/1891609663errorCode:" + jtvVar);
            this.f71474a.m137019l(new Pair(null, "ca-app-pub-6567608331519569/1891609663"));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m97962b(Act act, gcg0 gcg0Var) {
        if (!NullChecker.m82486a(act) || act.isFinishing()) {
            gcg0Var.m137019l(new Pair(null, "ca-app-pub-6567608331519569/1891609663"));
        } else {
            gcg0Var.m137019l(new Pair(new f70.C16918a(act, "ca-app-pub-6567608331519569/1891609663"), "ca-app-pub-6567608331519569/1891609663"));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m97967g(md20 md20Var, FrameLayout frameLayout, NativeAdView nativeAdView) {
        float fMo117783c = md20Var.mo128560f().mo117783c();
        bnl0.m105505C0(nativeAdView.getMediaView(), (int) (nativeAdView.getMediaView().getWidth() / fMo117783c));
        if (fMo117783c >= 1.7f) {
            bnl0.m105537U(frameLayout.findViewById(adc0.f70462n), qa00.m175859d(36.0f));
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.findViewById(adc0.f70462n).getLayoutParams();
        layoutParams.gravity = 81;
        frameLayout.findViewById(adc0.f70462n).setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: m */
    public static aia0 m97972m() {
        if (f71470e == null) {
            synchronized (aia0.class) {
                try {
                    if (f71470e == null) {
                        f71470e = new aia0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f71470e;
    }

    /* JADX INFO: renamed from: A */
    public void m97973A(ViewGroup viewGroup, Act act, x20 x20Var) {
        if (NullChecker.m82486a(this.f71473c)) {
            m97991z(viewGroup, act, x20Var, this.f71473c);
        } else {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m97974B(String str) {
        this.f71472b = str;
    }

    /* JADX INFO: renamed from: C */
    public final void m97975C(final TextView textView, final TextView textView2, final TextView textView3, final Act act) {
        textView.post(new Runnable() { // from class: l.xha0
            @Override // java.lang.Runnable
            public final void run() {
                this.f194285a.m97988w(act, textView, textView3, textView2);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m97976D(boolean z) {
        if (z) {
            m97978l();
        }
        this.f71471a = z;
    }

    /* JADX INFO: renamed from: E */
    public void m97977E(Act act, boolean z) {
        sfj0.m185596c(z ? "e_profile_photo_no_ad_button" : "e_profile_info_no_ad_button", OMSDialogPositon.p_suggest_user_profile_info_view, new sfj0.C20032a[0]);
        if (!CoreModule.f18264c.f20396j0.m31577B4()) {
            CoreModule.m30933P().m143405a().mo34524i6(act, z ? "p_suggest_user_profile_info_view,e_profile_photo_no_ad_button,click" : "p_suggest_user_profile_info_view,e_profile_info_no_ad_button,click", Privilege.intl_no_ad);
            return;
        }
        Intent intentM81348b2 = WebViewAct.m81348b2(act, CoreModule.f18264c.f20396j0.m31579C4().titleText, CoreModule.f18264c.f20396j0.m31579C4().promotionUrl, true);
        intentM81348b2.putExtra("hideNavigationBar", true);
        act.startActivity(intentM81348b2);
    }

    /* JADX INFO: renamed from: l */
    public final void m97978l() {
        int iIntValue = CoreModule.f18264c.f20381e0.f89144V1.get().intValue();
        if (iIntValue > 0) {
            CoreModule.f18264c.f20381e0.f89144V1.put(Integer.valueOf(iIntValue - 1));
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m97979n() {
        return CoreModule.f18264c.f20381e0.f89144V1.get().intValue();
    }

    /* JADX INFO: renamed from: o */
    public boolean m97980o() {
        return this.f71471a;
    }

    /* JADX INFO: renamed from: p */
    public boolean m97981p(User user) {
        return NullChecker.m82486a(user) && m97982q() && TEnum.equals(user.gender, "female");
    }

    /* JADX INFO: renamed from: q */
    public boolean m97982q() {
        Settings settings;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 != null && (settings = userM116600p9.settings) != null && !jyb.m147479J(settings.settingGroups)) {
            LookingFor lookingFor = settings.getSettingGroup().search.lookingForGender;
            if (tzi0.m193670h(pzi0.m174454o(), (long) userM116600p9.createdTime, d79.f85475h) && TEnum.equals(userM116600p9.gender, "male") && !TEnum.equals(lookingFor, "male") && !pgj.m172248e() && d79.m114692n() && m97979n() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m97983r(Act act, Pair pair, boolean z, final gcg0 gcg0Var) {
        if (!NullChecker.m82486a(act) || act.isFinishing() || !NullChecker.m82486a(pair.first)) {
            gcg0Var.m137019l(new Pair(null, "ca-app-pub-6567608331519569/1891609663"));
            return;
        }
        ((f70.C16918a) pair.first).m124342b(new md20.InterfaceC18591c() { // from class: l.zha0
            @Override // p153l.md20.InterfaceC18591c
            /* JADX INFO: renamed from: a */
            public final void mo103686a(md20 md20Var) {
                gcg0Var.m137019l(new Pair(md20Var, "ca-app-pub-6567608331519569/1891609663"));
            }
        });
        ((f70.C16918a) pair.first).m124344d(new qd20.C19553a().m176152h(new kfl0.C18151a().m149566b(true).m149565a()).m176145a());
        f70 f70VarM124341a = ((f70.C16918a) pair.first).m124343c(new C15713a(gcg0Var, z)).m124341a();
        s70.C19999a c19999a = new s70.C19999a();
        if (TextUtils.isEmpty(this.f71472b)) {
            c19999a.m179964e(u2n.m194281g(false));
        } else {
            c19999a.m179963d(this.f71472b);
        }
        f70VarM124341a.m124338a(c19999a.m184941i());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C22421c m97984s(final Act act, final boolean z, final Pair pair) {
        return C22421c.create(new C22421c.a() { // from class: l.yha0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199914a.m97983r(act, pair, z, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Boolean m97985t(Pair pair) {
        md20 md20Var = (md20) pair.first;
        this.f71473c = md20Var;
        return Boolean.valueOf(md20Var != null);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Boolean m97986u(Throwable th) {
        this.f71473c = null;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m97987v(Act act, View view) {
        m97977E(act, true);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m97988w(Act act, TextView textView, TextView textView2, TextView textView3) {
        if (!NullChecker.m82486a(act) || act.isFinishing()) {
            return;
        }
        if (vnb.m201961u1(textView.getTextSize()) > 18) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
        }
        if (bnl0.m105529O0(textView) && textView.getWidth() + textView3.getWidth() + qa00.m175859d(96.0f) > bnl0.m105592y0()) {
            textView.setTextSize(vnb.m201961u1(textView.getTextSize()) - 1);
            m97975C(textView, textView3, textView2, act);
        } else {
            if (!bnl0.m105529O0(textView2) || textView2.getWidth() + textView3.getWidth() + qa00.m175859d(96.0f) <= bnl0.m105592y0()) {
                return;
            }
            textView2.setTextSize(vnb.m201961u1(textView2.getTextSize()) - 1);
            m97975C(textView, textView3, textView2, act);
        }
    }

    /* JADX INFO: renamed from: x */
    public final C22421c<Pair<md20, String>> m97989x(final Act act, final boolean z) {
        return C22421c.create(new C22421c.a() { // from class: l.vha0
            @Override // p153l.y20
            public final void call(Object obj) {
                aia0.m97962b(act, (gcg0) obj);
            }
        }).observeOn(fo0.m126432a()).flatMap(new qcj() { // from class: l.wha0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189104a.m97984s(act, z, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public C22421c<Boolean> m97990y(Act act, boolean z) {
        if (n70.m161856g().m161857f()) {
            return !m97982q() ? C22421c.just(Boolean.FALSE) : m97989x(act, z).map(new qcj() { // from class: l.qha0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f157524a.m97985t((Pair) obj);
                }
            }).onErrorReturn(new qcj() { // from class: l.rha0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f163090a.m97986u((Throwable) obj);
                }
            });
        }
        return C22421c.just(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: z */
    public final void m97991z(ViewGroup viewGroup, final Act act, final x20 x20Var, final md20 md20Var) {
        final FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f125353C3, (ViewGroup) null);
        final NativeAdView nativeAdView = (NativeAdView) frameLayout.findViewById(adc0.f70017M8);
        View viewFindViewById = frameLayout.findViewById(adc0.f70394j);
        nativeAdView.setMediaView((MediaView) frameLayout.findViewById(adc0.f70462n));
        nativeAdView.setHeadlineView(frameLayout.findViewById(adc0.f70316e5));
        nativeAdView.setBodyView(frameLayout.findViewById(adc0.f70344g));
        nativeAdView.setCallToActionView(frameLayout.findViewById(adc0.f70361h));
        nativeAdView.setIconView(frameLayout.findViewById(adc0.f70042O));
        ((TextView) nativeAdView.getHeadlineView()).setText(md20Var.mo128558d());
        TextView textView = (TextView) frameLayout.findViewById(adc0.f70333f5);
        textView.setText(md20Var.mo128558d());
        m97975C((TextView) frameLayout.findViewById(adc0.f70316e5), (TextView) frameLayout.findViewById(adc0.f70361h), textView, act);
        if (NullChecker.m82486a(md20Var.mo128560f())) {
            nativeAdView.getMediaView().setMediaContent(md20Var.mo128560f());
            nativeAdView.getMediaView().post(new Runnable() { // from class: l.sha0
                @Override // java.lang.Runnable
                public final void run() {
                    aia0.m97967g(md20Var, frameLayout, nativeAdView);
                }
            });
            Drawable drawableMo117782b = md20Var.mo128560f().mo117782b();
            ImageView imageView = (ImageView) frameLayout.findViewById(adc0.f69811A6);
            if (drawableMo117782b != null) {
                C22421c c22421cDuringCreated = act.duringCreated(u2n.m194292s(drawableMo117782b, 25, true));
                Objects.requireNonNull(imageView);
                c22421cDuringCreated.subscribe(psd0.m173597H(new u60(imageView), new v60()));
            } else {
                imageView.setBackgroundColor(Color.parseColor("#FFEDE5"));
            }
        }
        if (md20Var.mo128556b() == null) {
            bnl0.m105525M0(nativeAdView.getBodyView(), false);
        } else {
            bnl0.m105525M0(nativeAdView.getBodyView(), true);
            ((TextView) nativeAdView.getBodyView()).setText(md20Var.mo128556b());
        }
        if (md20Var.mo128557c() == null) {
            bnl0.m105525M0(nativeAdView.getCallToActionView(), false);
        } else {
            bnl0.m105525M0(nativeAdView.getCallToActionView(), true);
            ((TextView) nativeAdView.getCallToActionView()).setText(md20Var.mo128557c());
        }
        if (md20Var.mo128559e() == null) {
            bnl0.m105525M0(nativeAdView.getIconView(), false);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(md20Var.mo128559e().mo123591a());
            bnl0.m105525M0(nativeAdView.getIconView(), true);
        }
        nativeAdView.setNativeAd(md20Var);
        sfj0.m185601h("e_profile_photo_no_ad_button", OMSDialogPositon.p_suggest_user_profile_info_view, new sfj0.C20032a[0]);
        frameLayout.findViewById(adc0.f70657y7).setOnClickListener(new View.OnClickListener() { // from class: l.tha0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174287a.m97987v(act, view);
            }
        });
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.uha0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        viewGroup.removeAllViews();
        viewGroup.addView(frameLayout);
    }
}
