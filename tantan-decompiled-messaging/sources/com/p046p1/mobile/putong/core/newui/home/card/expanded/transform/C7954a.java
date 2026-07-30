package com.p046p1.mobile.putong.core.newui.home.card.expanded.transform;

import android.animation.Animator;
import android.content.Context;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p149l.a950;
import p149l.bt0;
import p149l.e30;
import p149l.f6c0;
import p149l.qib0;
import p149l.rzb0;
import p149l.s7m;
import p149l.t100;
import p149l.wn90;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.transform.a */
/* JADX INFO: loaded from: classes11.dex */
public class C7954a implements s7m<a950> {

    /* JADX INFO: renamed from: a */
    public OldInfoTransOpLayout f22465a;

    /* JADX INFO: renamed from: b */
    public View f22466b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f22467c;

    /* JADX INFO: renamed from: d */
    public VImage f22468d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f22469e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f22470f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f22471g;

    /* JADX INFO: renamed from: h */
    public UserProfileExpandedLayout f22472h;

    /* JADX INFO: renamed from: i */
    public VLinear f22473i;

    /* JADX INFO: renamed from: j */
    public VText_Bold f22474j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f22475k;

    /* JADX INFO: renamed from: l */
    public VFrame f22476l;

    /* JADX INFO: renamed from: m */
    public View f22477m;

    /* JADX INFO: renamed from: n */
    public VImage f22478n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f22479o;

    /* JADX INFO: renamed from: p */
    public Act f22480p;

    /* JADX INFO: renamed from: q */
    public a950 f22481q;

    /* JADX INFO: renamed from: r */
    public int f22482r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.transform.a$a */
    public class a implements OldInfoTransOpLayout.InterfaceC7953a {
        public a() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.transform.OldInfoTransOpLayout.InterfaceC7953a
        /* JADX INFO: renamed from: a */
        public void mo38182a() {
            C7954a.this.m38184C();
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.card.expanded.transform.OldInfoTransOpLayout.InterfaceC7953a
        /* JADX INFO: renamed from: b */
        public void mo38183b(int i) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.transform.a$b */
    public static class b {
        /* JADX INFO: renamed from: b */
        public static void m38217b(C7954a c7954a, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            c7954a.f22465a = (OldInfoTransOpLayout) viewGroup.getChildAt(0);
            c7954a.f22466b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            c7954a.f22467c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            c7954a.f22468d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
            c7954a.f22469e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
            c7954a.f22470f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(4);
            c7954a.f22471g = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(6);
            c7954a.f22472h = (UserProfileExpandedLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            c7954a.f22473i = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
            c7954a.f22474j = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
            c7954a.f22475k = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
            c7954a.f22476l = (VFrame) viewGroup.getChildAt(1);
            c7954a.f22477m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            c7954a.f22478n = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            c7954a.f22479o = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m38218c(C7954a c7954a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f95860k8, viewGroup, false);
            m38217b(c7954a, viewInflate);
            return viewInflate;
        }
    }

    public C7954a(Act act) {
        this.f22480p = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m38184C() {
        PathInterpolator pathInterpolator = new PathInterpolator(0.7f, 0.0f, 0.3f, 1.0f);
        UserProfileExpandedLayout userProfileExpandedLayout = this.f22472h;
        Property property = View.ALPHA;
        Animator animatorM103741n = bt0.m103741n(userProfileExpandedLayout, property, userProfileExpandedLayout.getAlpha(), 1.0f);
        View view = this.f22477m;
        Animator animatorM103741n2 = bt0.m103741n(view, property, view.getAlpha(), 1.0f);
        animatorM103741n2.setStartDelay(300L);
        VText_Bold vText_Bold = this.f22479o;
        Animator animatorM103741n3 = bt0.m103741n(vText_Bold, property, vText_Bold.getAlpha(), 1.0f);
        animatorM103741n3.setStartDelay(300L);
        this.f22473i.setAlpha(0.0f);
        xdl0.m208344M(this.f22473i, true);
        Animator animatorM103741n4 = bt0.m103741n(this.f22473i, property, 0.0f, 1.0f);
        animatorM103741n4.setStartDelay(300L);
        UserProfileExpandedLayout userProfileExpandedLayout2 = this.f22472h;
        Property property2 = View.TRANSLATION_Y;
        Animator animatorM103741n5 = bt0.m103741n(userProfileExpandedLayout2, property2, userProfileExpandedLayout2.getTranslationY(), 0.0f);
        animatorM103741n5.setDuration(1000L);
        animatorM103741n5.setInterpolator(pathInterpolator);
        FrameLayout frameLayout = this.f22467c;
        Animator animatorM103741n6 = bt0.m103741n(frameLayout, property2, frameLayout.getTranslationY(), -this.f22467c.getHeight());
        animatorM103741n6.setDuration(1000L);
        animatorM103741n6.setInterpolator(pathInterpolator);
        Animator animatorM103741n7 = bt0.m103741n(this.f22467c, property, 1.0f, 0.0f);
        animatorM103741n7.setDuration(1000L);
        bt0.m103753z(animatorM103741n, animatorM103741n2, animatorM103741n3, animatorM103741n4, animatorM103741n5, animatorM103741n7, animatorM103741n6).setDuration(700L).start();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(a950 a950Var) {
        this.f22481q = a950Var;
    }

    /* JADX INFO: renamed from: B */
    public void m38206B() {
        this.f22481q.m95404s0();
        getAct().m66873d2();
        getAct().overridePendingTransition(0, rzb0.f161636h);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f22480p;
    }

    /* JADX INFO: renamed from: E */
    public final void m38207E() {
        xdl0.m208329E0(this.f22475k, new View.OnClickListener() { // from class: l.b950
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74200a.m38208F(view);
            }
        });
        xdl0.m208329E0(this.f22474j, new View.OnClickListener() { // from class: l.c950
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79863a.m38209G(view);
            }
        });
        xdl0.m208329E0(this.f22478n, new View.OnClickListener() { // from class: l.d950
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84935a.m38210H(view);
            }
        });
        this.f22472h.m38020b1(t100.m186890d(8.0f), t100.m186890d(10.0f), t100.m186890d(8.0f), t100.m186890d(78.0f));
        xdl0.m208360X(this.f22466b, t100.m186890d(44.0f) + xdl0.m208331F0());
        xdl0.m208353Q0(this.f22465a, new e30() { // from class: l.e950
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89923a.m38211I((int[]) obj);
            }
        });
        this.f22465a.setTransListener(new a());
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m38208F(View view) {
        zvf0.m220396r("e_confrim_new_profile", getAct().pageId());
        m38206B();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m38209G(View view) {
        if (wn90.m204607V()) {
            return;
        }
        zvf0.m220396r("e_edit_new_profile", getAct().pageId());
        getAct().startActivity(ProfileAct.m50738p2(getContext(), CoreModule.m29931H().userId(), "old_info_trans_new", false, true));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m38210H(View view) {
        m38206B();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m38211I(int[] iArr) {
        this.f22472h.setAlpha(1.0f);
        int iM186890d = ((iArr[1] - t100.m186890d(44.0f)) - xdl0.m208331F0()) - t100.m186890d(40.0f);
        this.f22482r = iM186890d;
        this.f22472h.setTranslationY(iM186890d);
    }

    /* JADX INFO: renamed from: J */
    public void m38212J(User user, List<CoreMomentInfo> list) {
        this.f22465a.setInterceptMove(false);
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = user.f56011id;
        userInfo.coreMomentInfoList = list;
        userInfo.renderFrom = CardInfoRenderFrom.OLD_TRANS_PROFILE;
        this.f22472h.mo36852T(user, userInfo, 0);
        this.f22472h.setAlpha(0.0f);
        bt0.m103741n(this.f22472h, View.ALPHA, 0.0f, 1.0f).setDuration(150L).start();
    }

    /* JADX INFO: renamed from: K */
    public void m38213K(User user) {
        this.f22465a.setInterceptMove(false);
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = user.f56011id;
        userInfo.renderFrom = CardInfoRenderFrom.OLD_TRANS_PROFILE;
        this.f22472h.mo36852T(user, userInfo, 0);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM38215z = m38215z(layoutInflater, viewGroup);
        m38207E();
        return viewM38215z;
    }

    /* JADX INFO: renamed from: r */
    public void m38214r() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        xdl0.m208360X(this.f22476l, xdl0.m208331F0());
        xdl0.m208360X(this.f22472h, xdl0.m208331F0() + t100.m186890d(44.0f));
        qib0.f154691G.m102331L0(this.f22470f, userM169520na.m60124fp().profileSmall().formatted());
        SVGALoader.with(getAct()).from("old_info_trans_anim.svga").autoPlay(true).into(this.f22469e);
        SVGALoader.with(getAct()).from("https://auto.tancdn.com/v1/raw/e36623b2-bc84-4ac5-8f07-6237ffde6ac114.svga").autoPlay(true).into(this.f22471g);
    }

    /* JADX INFO: renamed from: z */
    public View m38215z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b.m38218c(this, layoutInflater, viewGroup);
    }
}
