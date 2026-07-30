package com.p051p1.mobile.putong.core.newui.home.card.expanded.transform;

import android.animation.Animator;
import android.content.Context;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p153l.aw90;
import p153l.bnl0;
import p153l.gt0;
import p153l.hh50;
import p153l.i4g0;
import p153l.iam;
import p153l.kec0;
import p153l.qa00;
import p153l.uqb0;
import p153l.x7c0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.transform.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8105a implements iam<hh50> {

    /* JADX INFO: renamed from: a */
    public OldInfoTransOpLayout f23207a;

    /* JADX INFO: renamed from: b */
    public View f23208b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f23209c;

    /* JADX INFO: renamed from: d */
    public VImage f23210d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f23211e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f23212f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f23213g;

    /* JADX INFO: renamed from: h */
    public UserProfileExpandedLayout f23214h;

    /* JADX INFO: renamed from: i */
    public VLinear f23215i;

    /* JADX INFO: renamed from: j */
    public VText_Bold f23216j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f23217k;

    /* JADX INFO: renamed from: l */
    public VFrame f23218l;

    /* JADX INFO: renamed from: m */
    public View f23219m;

    /* JADX INFO: renamed from: n */
    public VImage f23220n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f23221o;

    /* JADX INFO: renamed from: p */
    public Act f23222p;

    /* JADX INFO: renamed from: q */
    public hh50 f23223q;

    /* JADX INFO: renamed from: r */
    public int f23224r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.transform.a$a */
    public class a implements OldInfoTransOpLayout.InterfaceC8104a {
        public a() {
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.transform.OldInfoTransOpLayout.InterfaceC8104a
        /* JADX INFO: renamed from: a */
        public void mo39185a() {
            C8105a.this.m39187C();
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.card.expanded.transform.OldInfoTransOpLayout.InterfaceC8104a
        /* JADX INFO: renamed from: b */
        public void mo39186b(int i) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.expanded.transform.a$b */
    public static class b {
        /* JADX INFO: renamed from: b */
        public static void m39220b(C8105a c8105a, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            c8105a.f23207a = (OldInfoTransOpLayout) viewGroup.getChildAt(0);
            c8105a.f23208b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            c8105a.f23209c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            c8105a.f23210d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
            c8105a.f23211e = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
            c8105a.f23212f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(4);
            c8105a.f23213g = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(6);
            c8105a.f23214h = (UserProfileExpandedLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            c8105a.f23215i = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
            c8105a.f23216j = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
            c8105a.f23217k = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
            c8105a.f23218l = (VFrame) viewGroup.getChildAt(1);
            c8105a.f23219m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            c8105a.f23220n = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            c8105a.f23221o = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m39221c(C8105a c8105a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(kec0.f126033r8, viewGroup, false);
            m39220b(c8105a, viewInflate);
            return viewInflate;
        }
    }

    public C8105a(Act act) {
        this.f23222p = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m39187C() {
        PathInterpolator pathInterpolator = new PathInterpolator(0.7f, 0.0f, 0.3f, 1.0f);
        UserProfileExpandedLayout userProfileExpandedLayout = this.f23214h;
        Property property = View.ALPHA;
        Animator animatorM132168n = gt0.m132168n(userProfileExpandedLayout, property, userProfileExpandedLayout.getAlpha(), 1.0f);
        View view = this.f23219m;
        Animator animatorM132168n2 = gt0.m132168n(view, property, view.getAlpha(), 1.0f);
        animatorM132168n2.setStartDelay(300L);
        VText_Bold vText_Bold = this.f23221o;
        Animator animatorM132168n3 = gt0.m132168n(vText_Bold, property, vText_Bold.getAlpha(), 1.0f);
        animatorM132168n3.setStartDelay(300L);
        this.f23215i.setAlpha(0.0f);
        bnl0.m105524M(this.f23215i, true);
        Animator animatorM132168n4 = gt0.m132168n(this.f23215i, property, 0.0f, 1.0f);
        animatorM132168n4.setStartDelay(300L);
        UserProfileExpandedLayout userProfileExpandedLayout2 = this.f23214h;
        Property property2 = View.TRANSLATION_Y;
        Animator animatorM132168n5 = gt0.m132168n(userProfileExpandedLayout2, property2, userProfileExpandedLayout2.getTranslationY(), 0.0f);
        animatorM132168n5.setDuration(1000L);
        animatorM132168n5.setInterpolator(pathInterpolator);
        FrameLayout frameLayout = this.f23209c;
        Animator animatorM132168n6 = gt0.m132168n(frameLayout, property2, frameLayout.getTranslationY(), -this.f23209c.getHeight());
        animatorM132168n6.setDuration(1000L);
        animatorM132168n6.setInterpolator(pathInterpolator);
        Animator animatorM132168n7 = gt0.m132168n(this.f23209c, property, 1.0f, 0.0f);
        animatorM132168n7.setDuration(1000L);
        gt0.m132180z(animatorM132168n, animatorM132168n2, animatorM132168n3, animatorM132168n4, animatorM132168n5, animatorM132168n7, animatorM132168n6).setDuration(700L).start();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(hh50 hh50Var) {
        this.f23223q = hh50Var;
    }

    /* JADX INFO: renamed from: B */
    public void m39209B() {
        this.f23223q.m135028s0();
        getAct().m68056e2();
        getAct().overridePendingTransition(0, x7c0.f192693h);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f23222p;
    }

    /* JADX INFO: renamed from: E */
    public final void m39210E() {
        bnl0.m105509E0(this.f23217k, new View.OnClickListener() { // from class: l.ih50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114871a.m39211F(view);
            }
        });
        bnl0.m105509E0(this.f23216j, new View.OnClickListener() { // from class: l.jh50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120822a.m39212G(view);
            }
        });
        bnl0.m105509E0(this.f23220n, new View.OnClickListener() { // from class: l.kh50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126696a.m39213H(view);
            }
        });
        this.f23214h.m39023b1(qa00.m175859d(8.0f), qa00.m175859d(10.0f), qa00.m175859d(8.0f), qa00.m175859d(78.0f));
        bnl0.m105540X(this.f23208b, qa00.m175859d(44.0f) + bnl0.m105511F0());
        bnl0.m105533Q0(this.f23207a, new y20() { // from class: l.lh50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132071a.m39214I((int[]) obj);
            }
        });
        this.f23207a.setTransListener(new a());
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m39211F(View view) {
        i4g0.m138520r("e_confrim_new_profile", getAct().pageId());
        m39209B();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m39212G(View view) {
        if (aw90.m100567V()) {
            return;
        }
        i4g0.m138520r("e_edit_new_profile", getAct().pageId());
        getAct().startActivity(ProfileAct.m51922q2(getContext(), CoreModule.m30929H().userId(), "old_info_trans_new", false, true));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m39213H(View view) {
        m39209B();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m39214I(int[] iArr) {
        this.f23214h.setAlpha(1.0f);
        int iM175859d = ((iArr[1] - qa00.m175859d(44.0f)) - bnl0.m105511F0()) - qa00.m175859d(40.0f);
        this.f23224r = iM175859d;
        this.f23214h.setTranslationY(iM175859d);
    }

    /* JADX INFO: renamed from: J */
    public void m39215J(User user, List<CoreMomentInfo> list) {
        this.f23207a.setInterceptMove(false);
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = user.f56859id;
        userInfo.coreMomentInfoList = list;
        userInfo.renderFrom = CardInfoRenderFrom.OLD_TRANS_PROFILE;
        this.f23214h.mo37855T(user, userInfo, 0);
        this.f23214h.setAlpha(0.0f);
        gt0.m132168n(this.f23214h, View.ALPHA, 0.0f, 1.0f).setDuration(150L).start();
    }

    /* JADX INFO: renamed from: K */
    public void m39216K(User user) {
        this.f23207a.setInterceptMove(false);
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = user.f56859id;
        userInfo.renderFrom = CardInfoRenderFrom.OLD_TRANS_PROFILE;
        this.f23214h.mo37855T(user, userInfo, 0);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM39218z = m39218z(layoutInflater, viewGroup);
        m39210E();
        return viewM39218z;
    }

    /* JADX INFO: renamed from: r */
    public void m39217r() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        bnl0.m105540X(this.f23218l, bnl0.m105511F0());
        bnl0.m105540X(this.f23214h, bnl0.m105511F0() + qa00.m175859d(44.0f));
        uqb0.f180374G.m127115L0(this.f23212f, userM116593na.m61308fp().profileSmall().formatted());
        SVGALoader.with(getAct()).from("old_info_trans_anim.svga").autoPlay(true).into(this.f23211e);
        SVGALoader.with(getAct()).from("https://auto.tancdn.com/v1/raw/e36623b2-bc84-4ac5-8f07-6237ffde6ac114.svga").autoPlay(true).into(this.f23213g);
    }

    /* JADX INFO: renamed from: z */
    public View m39218z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b.m39221c(this, layoutInflater, viewGroup);
    }
}
