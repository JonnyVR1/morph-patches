package com.p000p1.mobile.putong.core.newui.home.card.expanded.transform;

import android.animation.Animator;
import android.content.Context;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.bt0;
import l.e30;
import l.f6c0;
import l.qib0;
import l.rzb0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.zvf0;
import p009l.a950;
import p009l.wn90;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.transform.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0118a implements s7m<a950> {

    /* JADX INFO: renamed from: a */
    public OldInfoTransOpLayout f1243a;

    /* JADX INFO: renamed from: b */
    public View f1244b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f1245c;

    /* JADX INFO: renamed from: d */
    public VImage f1246d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f1247e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f1248f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f1249g;

    /* JADX INFO: renamed from: h */
    public UserProfileExpandedLayout f1250h;

    /* JADX INFO: renamed from: i */
    public VLinear f1251i;

    /* JADX INFO: renamed from: j */
    public VText_Bold f1252j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f1253k;

    /* JADX INFO: renamed from: l */
    public VFrame f1254l;

    /* JADX INFO: renamed from: m */
    public View f1255m;

    /* JADX INFO: renamed from: n */
    public VImage f1256n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f1257o;

    /* JADX INFO: renamed from: p */
    public Act f1258p;

    /* JADX INFO: renamed from: q */
    public a950 f1259q;

    /* JADX INFO: renamed from: r */
    public int f1260r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.transform.a$a */
    public class a implements OldInfoTransOpLayout.InterfaceC0117a {
        public a() {
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.transform.OldInfoTransOpLayout.InterfaceC0117a
        /* JADX INFO: renamed from: a */
        public void mo2158a() {
            C0118a.this.m2160C();
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.transform.OldInfoTransOpLayout.InterfaceC0117a
        /* JADX INFO: renamed from: b */
        public void mo2159b(int i) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.transform.a$b */
    public static class b {
        /* JADX INFO: renamed from: b */
        public static void m2195b(C0118a c0118a, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            c0118a.f1243a = (OldInfoTransOpLayout) viewGroup.getChildAt(0);
            c0118a.f1244b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            c0118a.f1245c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            c0118a.f1246d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
            c0118a.f1247e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
            c0118a.f1248f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(4);
            c0118a.f1249g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(6);
            c0118a.f1250h = (UserProfileExpandedLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            c0118a.f1251i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
            c0118a.f1252j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
            c0118a.f1253k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
            c0118a.f1254l = viewGroup.getChildAt(1);
            c0118a.f1255m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            c0118a.f1256n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            c0118a.f1257o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m2196c(C0118a c0118a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.k8, viewGroup, false);
            m2195b(c0118a, viewInflate);
            return viewInflate;
        }
    }

    public C0118a(Act act) {
        this.f1258p = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m2160C() {
        PathInterpolator pathInterpolator = new PathInterpolator(0.7f, 0.0f, 0.3f, 1.0f);
        UserProfileExpandedLayout userProfileExpandedLayout = this.f1250h;
        Property property = View.ALPHA;
        Animator animatorN = bt0.n(userProfileExpandedLayout, property, new float[]{userProfileExpandedLayout.getAlpha(), 1.0f});
        View view = this.f1255m;
        Animator animatorN2 = bt0.n(view, property, new float[]{view.getAlpha(), 1.0f});
        animatorN2.setStartDelay(300L);
        VText_Bold vText_Bold = this.f1257o;
        Animator animatorN3 = bt0.n(vText_Bold, property, new float[]{vText_Bold.getAlpha(), 1.0f});
        animatorN3.setStartDelay(300L);
        this.f1251i.setAlpha(0.0f);
        xdl0.M(this.f1251i, true);
        Animator animatorN4 = bt0.n(this.f1251i, property, new float[]{0.0f, 1.0f});
        animatorN4.setStartDelay(300L);
        UserProfileExpandedLayout userProfileExpandedLayout2 = this.f1250h;
        Property property2 = View.TRANSLATION_Y;
        Animator animatorN5 = bt0.n(userProfileExpandedLayout2, property2, new float[]{userProfileExpandedLayout2.getTranslationY(), 0.0f});
        animatorN5.setDuration(1000L);
        animatorN5.setInterpolator(pathInterpolator);
        FrameLayout frameLayout = this.f1245c;
        Animator animatorN6 = bt0.n(frameLayout, property2, new float[]{frameLayout.getTranslationY(), -this.f1245c.getHeight()});
        animatorN6.setDuration(1000L);
        animatorN6.setInterpolator(pathInterpolator);
        Animator animatorN7 = bt0.n(this.f1245c, property, new float[]{1.0f, 0.0f});
        animatorN7.setDuration(1000L);
        bt0.z(new Animator[]{animatorN, animatorN2, animatorN3, animatorN4, animatorN5, animatorN7, animatorN6}).setDuration(700L).start();
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void m2191i1(a950 a950Var) {
        this.f1259q = a950Var;
    }

    /* JADX INFO: renamed from: B */
    public void m2182B() {
        this.f1259q.m11289s0();
        act().finish();
        act().overridePendingTransition(0, rzb0.h);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m2183C0() {
        return this.f1258p;
    }

    /* JADX INFO: renamed from: E */
    public final void m2184E() {
        xdl0.E0(this.f1253k, new View.OnClickListener() { // from class: l.b950
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9968a.m2185F(view);
            }
        });
        xdl0.E0(this.f1252j, new View.OnClickListener() { // from class: l.c950
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10471a.m2186G(view);
            }
        });
        xdl0.E0(this.f1256n, new View.OnClickListener() { // from class: l.d950
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11677a.m2187H(view);
            }
        });
        this.f1250h.m1994b1(t100.d(8.0f), t100.d(10.0f), t100.d(8.0f), t100.d(78.0f));
        xdl0.X(this.f1244b, t100.d(44.0f) + xdl0.F0());
        xdl0.Q0(this.f1243a, new e30() { // from class: l.e950
            public final void call(Object obj) {
                this.f12456a.m2188I((int[]) obj);
            }
        });
        this.f1243a.setTransListener(new a());
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m2185F(View view) {
        zvf0.r("e_confrim_new_profile", act().pageId());
        m2182B();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m2186G(View view) {
        if (wn90.m24344V()) {
            return;
        }
        zvf0.r("e_edit_new_profile", act().pageId());
        act().startActivity(ProfileAct.p2(m2183C0(), CoreModule.H().userId(), "old_info_trans_new", false, true));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m2187H(View view) {
        m2182B();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m2188I(int[] iArr) {
        this.f1250h.setAlpha(1.0f);
        int iD = ((iArr[1] - t100.d(44.0f)) - xdl0.F0()) - t100.d(40.0f);
        this.f1260r = iD;
        this.f1250h.setTranslationY(iD);
    }

    /* JADX INFO: renamed from: J */
    public void m2189J(User user, List<CoreMomentInfo> list) {
        this.f1243a.setInterceptMove(false);
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = ((DbObject) user).id;
        userInfo.coreMomentInfoList = list;
        userInfo.renderFrom = CardInfoRenderFrom.OLD_TRANS_PROFILE;
        this.f1250h.mo810T(user, userInfo, 0);
        this.f1250h.setAlpha(0.0f);
        bt0.n(this.f1250h, View.ALPHA, new float[]{0.0f, 1.0f}).setDuration(150L).start();
    }

    /* JADX INFO: renamed from: K */
    public void m2190K(User user) {
        this.f1243a.setInterceptMove(false);
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = ((DbObject) user).id;
        userInfo.renderFrom = CardInfoRenderFrom.OLD_TRANS_PROFILE;
        this.f1250h.mo810T(user, userInfo, 0);
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM2193z = m2193z(layoutInflater, viewGroup);
        m2184E();
        return viewM2193z;
    }

    /* JADX INFO: renamed from: r */
    public void m2192r() {
        User userNa = CoreModule.c.e0.na();
        xdl0.X(this.f1254l, xdl0.F0());
        xdl0.X(this.f1250h, xdl0.F0() + t100.d(44.0f));
        qib0.G.L0(this.f1248f, userNa.fp().profileSmall().formatted());
        SVGALoader.with(act()).from("old_info_trans_anim.svga").autoPlay(true).into(this.f1247e);
        SVGALoader.with(act()).from("https://auto.tancdn.com/v1/raw/e36623b2-bc84-4ac5-8f07-6237ffde6ac114.svga").autoPlay(true).into(this.f1249g);
    }

    /* JADX INFO: renamed from: z */
    public View m2193z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b.m2196c(this, layoutInflater, viewGroup);
    }
}
