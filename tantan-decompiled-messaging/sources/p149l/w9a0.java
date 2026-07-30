package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class w9a0 {

    /* JADX INFO: renamed from: d */
    public static final String f185321d = "w9a0";

    /* JADX INFO: renamed from: e */
    public static w9a0 f185322e;

    /* JADX INFO: renamed from: a */
    public boolean f185323a;

    /* JADX INFO: renamed from: b */
    public String f185324b = "";

    /* JADX INFO: renamed from: c */
    public e520 f185325c;

    /* JADX INFO: renamed from: l.w9a0$a */
    public class C20836a extends h70 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f185326a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f185327b;

        public C20836a(z3g0 z3g0Var, boolean z) {
            this.f185326a = z3g0Var;
            this.f185327b = z;
        }

        @Override // p149l.h70
        public void onAdClicked() {
            super.onAdClicked();
            if (this.f185327b) {
                o6j0.m162859c("e_clone_profile_photo_ads", "p_suggest_users_home_view", new o6j0.C18854a[0]);
            }
        }

        @Override // p149l.h70
        /* JADX INFO: renamed from: x */
        public void mo29990x(@NonNull irv irvVar) {
            super.mo29990x(irvVar);
            hfw.m130790a(w9a0.f185321d, "admob onAdFailedToLoad = ca-app-pub-6567608331519569/1891609663errorCode:" + irvVar);
            this.f185326a.m132487l(new Pair(null, "ca-app-pub-6567608331519569/1891609663"));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m202275b(Act act, z3g0 z3g0Var) {
        if (!NullChecker.m81303a(act) || act.isFinishing()) {
            z3g0Var.m132487l(new Pair(null, "ca-app-pub-6567608331519569/1891609663"));
        } else {
            z3g0Var.m132487l(new Pair(new j70.C17709a(act, "ca-app-pub-6567608331519569/1891609663"), "ca-app-pub-6567608331519569/1891609663"));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m202280g(e520 e520Var, FrameLayout frameLayout, NativeAdView nativeAdView) {
        float fMo120411c = e520Var.mo98608f().mo120411c();
        xdl0.m208325C0(nativeAdView.getMediaView(), (int) (nativeAdView.getMediaView().getWidth() / fMo120411c));
        if (fMo120411c >= 1.7f) {
            xdl0.m208357U(frameLayout.findViewById(u4c0.f174371n), t100.m186890d(36.0f));
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.findViewById(u4c0.f174371n).getLayoutParams();
        layoutParams.gravity = 81;
        frameLayout.findViewById(u4c0.f174371n).setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: m */
    public static w9a0 m202285m() {
        if (f185322e == null) {
            synchronized (w9a0.class) {
                try {
                    if (f185322e == null) {
                        f185322e = new w9a0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f185322e;
    }

    /* JADX INFO: renamed from: A */
    public void m202286A(ViewGroup viewGroup, Act act, d30 d30Var) {
        if (NullChecker.m81303a(this.f185325c)) {
            m202304z(viewGroup, act, d30Var, this.f185325c);
        } else {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m202287B(String str) {
        this.f185324b = str;
    }

    /* JADX INFO: renamed from: C */
    public final void m202288C(final TextView textView, final TextView textView2, final TextView textView3, final Act act) {
        textView.post(new Runnable() { // from class: l.t9a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f169001a.m202301w(act, textView, textView3, textView2);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m202289D(boolean z) {
        if (z) {
            m202291l();
        }
        this.f185323a = z;
    }

    /* JADX INFO: renamed from: E */
    public void m202290E(Act act, boolean z) {
        o6j0.m162859c(z ? "e_profile_photo_no_ad_button" : "e_profile_info_no_ad_button", OMSDialogPositon.p_suggest_user_profile_info_view, new o6j0.C18854a[0]);
        if (!CoreModule.f17545c.f19654j0.m30574B4()) {
            CoreModule.m29935P().m94651a().mo33521i6(act, z ? "p_suggest_user_profile_info_view,e_profile_photo_no_ad_button,click" : "p_suggest_user_profile_info_view,e_profile_info_no_ad_button,click", Privilege.intl_no_ad);
            return;
        }
        Intent intentM80165a2 = WebViewAct.m80165a2(act, CoreModule.f17545c.f19654j0.m30576C4().titleText, CoreModule.f17545c.f19654j0.m30576C4().promotionUrl, true);
        intentM80165a2.putExtra("hideNavigationBar", true);
        act.startActivity(intentM80165a2);
    }

    /* JADX INFO: renamed from: l */
    public final void m202291l() {
        int iIntValue = CoreModule.f17545c.f19639e0.f149287V1.get().intValue();
        if (iIntValue > 0) {
            CoreModule.f17545c.f19639e0.f149287V1.put(Integer.valueOf(iIntValue - 1));
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m202292n() {
        return CoreModule.f17545c.f19639e0.f149287V1.get().intValue();
    }

    /* JADX INFO: renamed from: o */
    public boolean m202293o() {
        return this.f185323a;
    }

    /* JADX INFO: renamed from: p */
    public boolean m202294p(User user) {
        return NullChecker.m81303a(user) && m202295q() && TEnum.equals(user.gender, "female");
    }

    /* JADX INFO: renamed from: q */
    public boolean m202295q() {
        Settings settings;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 != null && (settings = userM169527p9.settings) != null && !vwb.m200296J(settings.settingGroups)) {
            LookingFor lookingFor = settings.getSettingGroup().search.lookingForGender;
            if (qqi0.m175940h(mqi0.m155944o(), (long) userM169527p9.createdTime, u59.f174668h) && TEnum.equals(userM169527p9.gender, "male") && !TEnum.equals(lookingFor, "male") && !vdj.m198003e() && u59.m191842n() && m202292n() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m202296r(Act act, Pair pair, boolean z, final z3g0 z3g0Var) {
        if (!NullChecker.m81303a(act) || act.isFinishing() || !NullChecker.m81303a(pair.first)) {
            z3g0Var.m132487l(new Pair(null, "ca-app-pub-6567608331519569/1891609663"));
            return;
        }
        ((j70.C17709a) pair.first).m140068b(new e520.InterfaceC16544c() { // from class: l.v9a0
            @Override // p149l.e520.InterfaceC16544c
            /* JADX INFO: renamed from: a */
            public final void mo95151a(e520 e520Var) {
                z3g0Var.m132487l(new Pair(e520Var, "ca-app-pub-6567608331519569/1891609663"));
            }
        });
        ((j70.C17709a) pair.first).m140070d(new i520.C17483a().m134466h(new g6l0.C17012a().m124604b(true).m124603a()).m134459a());
        j70 j70VarM140067a = ((j70.C17709a) pair.first).m140069c(new C20836a(z3g0Var, z)).m140067a();
        w70.C20817a c20817a = new w70.C20817a();
        if (TextUtils.isEmpty(this.f185324b)) {
            c20817a.m191886e(u0n.m191349g(false));
        } else {
            c20817a.m191885d(this.f185324b);
        }
        j70VarM140067a.m140064a(c20817a.m201999i());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C22306c m202297s(final Act act, final boolean z, final Pair pair) {
        return C22306c.create(new C22306c.a() { // from class: l.u9a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175205a.m202296r(act, pair, z, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Boolean m202298t(Pair pair) {
        e520 e520Var = (e520) pair.first;
        this.f185325c = e520Var;
        return Boolean.valueOf(e520Var != null);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Boolean m202299u(Throwable th) {
        this.f185325c = null;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m202300v(Act act, View view) {
        m202290E(act, true);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m202301w(Act act, TextView textView, TextView textView2, TextView textView3) {
        if (!NullChecker.m81303a(act) || act.isFinishing()) {
            return;
        }
        if (hmb.m131716u1(textView.getTextSize()) > 18) {
            textView.setVisibility(8);
            textView2.setVisibility(0);
        }
        if (xdl0.m208349O0(textView) && textView.getWidth() + textView3.getWidth() + t100.m186890d(96.0f) > xdl0.m208412y0()) {
            textView.setTextSize(hmb.m131716u1(textView.getTextSize()) - 1);
            m202288C(textView, textView3, textView2, act);
        } else {
            if (!xdl0.m208349O0(textView2) || textView2.getWidth() + textView3.getWidth() + t100.m186890d(96.0f) <= xdl0.m208412y0()) {
                return;
            }
            textView2.setTextSize(hmb.m131716u1(textView2.getTextSize()) - 1);
            m202288C(textView, textView3, textView2, act);
        }
    }

    /* JADX INFO: renamed from: x */
    public final C22306c<Pair<e520, String>> m202302x(final Act act, final boolean z) {
        return C22306c.create(new C22306c.a() { // from class: l.r9a0
            @Override // p149l.e30
            public final void call(Object obj) {
                w9a0.m202275b(act, (z3g0) obj);
            }
        }).observeOn(jo0.m142408a()).flatMap(new w9j() { // from class: l.s9a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f163161a.m202297s(act, z, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public C22306c<Boolean> m202303y(Act act, boolean z) {
        if (r70.m178118g().m178119f()) {
            return !m202295q() ? C22306c.just(Boolean.FALSE) : m202302x(act, z).map(new w9j() { // from class: l.m9a0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f132688a.m202298t((Pair) obj);
                }
            }).onErrorReturn(new w9j() { // from class: l.n9a0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f137730a.m202299u((Throwable) obj);
                }
            });
        }
        return C22306c.just(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: z */
    public final void m202304z(ViewGroup viewGroup, final Act act, final d30 d30Var, final e520 e520Var) {
        final FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f95302C3, (ViewGroup) null);
        final NativeAdView nativeAdView = (NativeAdView) frameLayout.findViewById(u4c0.f173895K8);
        View viewFindViewById = frameLayout.findViewById(u4c0.f174303j);
        nativeAdView.setMediaView((MediaView) frameLayout.findViewById(u4c0.f174371n));
        nativeAdView.setHeadlineView(frameLayout.findViewById(u4c0.f174191c5));
        nativeAdView.setBodyView(frameLayout.findViewById(u4c0.f174253g));
        nativeAdView.setCallToActionView(frameLayout.findViewById(u4c0.f174270h));
        nativeAdView.setIconView(frameLayout.findViewById(u4c0.f173954O));
        ((TextView) nativeAdView.getHeadlineView()).setText(e520Var.mo98606d());
        TextView textView = (TextView) frameLayout.findViewById(u4c0.f174208d5);
        textView.setText(e520Var.mo98606d());
        m202288C((TextView) frameLayout.findViewById(u4c0.f174191c5), (TextView) frameLayout.findViewById(u4c0.f174270h), textView, act);
        if (NullChecker.m81303a(e520Var.mo98608f())) {
            nativeAdView.getMediaView().setMediaContent(e520Var.mo98608f());
            nativeAdView.getMediaView().post(new Runnable() { // from class: l.o9a0
                @Override // java.lang.Runnable
                public final void run() {
                    w9a0.m202280g(e520Var, frameLayout, nativeAdView);
                }
            });
            Drawable drawableMo120410b = e520Var.mo98608f().mo120410b();
            ImageView imageView = (ImageView) frameLayout.findViewById(u4c0.f174565y6);
            if (drawableMo120410b != null) {
                C22306c c22306cDuringCreated = act.duringCreated(u0n.m191360s(drawableMo120410b, 25, true));
                Objects.requireNonNull(imageView);
                c22306cDuringCreated.subscribe(mkd0.m154956H(new y60(imageView), new z60()));
            } else {
                imageView.setBackgroundColor(Color.parseColor("#FFEDE5"));
            }
        }
        if (e520Var.mo98604b() == null) {
            xdl0.m208345M0(nativeAdView.getBodyView(), false);
        } else {
            xdl0.m208345M0(nativeAdView.getBodyView(), true);
            ((TextView) nativeAdView.getBodyView()).setText(e520Var.mo98604b());
        }
        if (e520Var.mo98605c() == null) {
            xdl0.m208345M0(nativeAdView.getCallToActionView(), false);
        } else {
            xdl0.m208345M0(nativeAdView.getCallToActionView(), true);
            ((TextView) nativeAdView.getCallToActionView()).setText(e520Var.mo98605c());
        }
        if (e520Var.mo98607e() == null) {
            xdl0.m208345M0(nativeAdView.getIconView(), false);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(e520Var.mo98607e().mo114778a());
            xdl0.m208345M0(nativeAdView.getIconView(), true);
        }
        nativeAdView.setNativeAd(e520Var);
        o6j0.m162864h("e_profile_photo_no_ad_button", OMSDialogPositon.p_suggest_user_profile_info_view, new o6j0.C18854a[0]);
        frameLayout.findViewById(u4c0.f174532w7).setOnClickListener(new View.OnClickListener() { // from class: l.p9a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147688a.m202300v(act, view);
            }
        });
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.q9a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        viewGroup.removeAllViews();
        viewGroup.addView(frameLayout);
    }
}
