package com.p051p1.mobile.putong.core.newui.home.card.operation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.card.operation.view.HomeButtonHookLayout;
import com.p051p1.mobile.putong.core.newui.home.card.operation.view.UndoTestLayout;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.HashMap;
import p151v.VFrame;
import p151v.VFrame_FlipContainer;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.avl;
import p153l.bnl0;
import p153l.bvl;
import p153l.emf;
import p153l.gp5;
import p153l.i4g0;
import p153l.joa;
import p153l.pf60;
import p153l.qa00;
import p153l.z5l;
import p153l.z99;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardBottomOptButtons extends FrameLayout implements bvl, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, emf {

    /* JADX INFO: renamed from: R */
    public static final int f23420R = qa00.m175859d(80.0f);

    /* JADX INFO: renamed from: S */
    public static final int f23421S = qa00.m175859d(130.0f);

    /* JADX INFO: renamed from: T */
    public static final int f23422T = qa00.m175859d(50.0f);

    /* JADX INFO: renamed from: U */
    public static final int f23423U = qa00.m175859d(72.0f);

    /* JADX INFO: renamed from: V */
    public static final int f23424V = qa00.m175859d(64.0f);

    /* JADX INFO: renamed from: W */
    public static final int f23425W = qa00.m175859d(84.0f);

    /* JADX INFO: renamed from: A */
    public Action1<String> f23426A;

    /* JADX INFO: renamed from: B */
    public Action1<User> f23427B;

    /* JADX INFO: renamed from: C */
    public User f23428C;

    /* JADX INFO: renamed from: D */
    public boolean f23429D;

    /* JADX INFO: renamed from: E */
    public C8126b f23430E;

    /* JADX INFO: renamed from: F */
    public C8126b f23431F;

    /* JADX INFO: renamed from: G */
    public C8126b f23432G;

    /* JADX INFO: renamed from: H */
    public C8126b f23433H;

    /* JADX INFO: renamed from: I */
    public C8126b f23434I;

    /* JADX INFO: renamed from: J */
    public ValueAnimator f23435J;

    /* JADX INFO: renamed from: K */
    public float f23436K;

    /* JADX INFO: renamed from: L */
    public boolean f23437L;

    /* JADX INFO: renamed from: M */
    public int f23438M;

    /* JADX INFO: renamed from: N */
    public C8127c f23439N;

    /* JADX INFO: renamed from: O */
    public float f23440O;

    /* JADX INFO: renamed from: P */
    public float f23441P;

    /* JADX INFO: renamed from: Q */
    public float f23442Q;

    /* JADX INFO: renamed from: a */
    public HomeCardBottomOptButtons f23443a;

    /* JADX INFO: renamed from: b */
    public VFrame f23444b;

    /* JADX INFO: renamed from: c */
    public HomeButtonHookLayout f23445c;

    /* JADX INFO: renamed from: d */
    public UndoTestLayout f23446d;

    /* JADX INFO: renamed from: e */
    public HomeCardExpandedOptButton f23447e;

    /* JADX INFO: renamed from: f */
    public VText f23448f;

    /* JADX INFO: renamed from: g */
    public HomeCardExpandedOptButton f23449g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f23450h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f23451i;

    /* JADX INFO: renamed from: j */
    public VFrame_FlipContainer f23452j;

    /* JADX INFO: renamed from: k */
    public HomeCardExpandedOptButton f23453k;

    /* JADX INFO: renamed from: l */
    public VText f23454l;

    /* JADX INFO: renamed from: m */
    public HomeCardExpandedOptButton f23455m;

    /* JADX INFO: renamed from: n */
    public HomeCardExpandedOptButton f23456n;

    /* JADX INFO: renamed from: o */
    public HomeCardExpandedOptButton f23457o;

    /* JADX INFO: renamed from: p */
    public VLinear f23458p;

    /* JADX INFO: renamed from: q */
    public final HashMap<String, pf60<String, String>> f23459q;

    /* JADX INFO: renamed from: r */
    public final HashMap<String, pf60<String, String>> f23460r;

    /* JADX INFO: renamed from: s */
    public final HashMap<String, pf60<String, String>> f23461s;

    /* JADX INFO: renamed from: t */
    public final HashMap<String, pf60<String, String>> f23462t;

    /* JADX INFO: renamed from: u */
    public HashMap<String, pf60<String, String>> f23463u;

    /* JADX INFO: renamed from: v */
    public HashMap<String, pf60<String, String>> f23464v;

    /* JADX INFO: renamed from: w */
    public String f23465w;

    /* JADX INFO: renamed from: x */
    public String f23466x;

    /* JADX INFO: renamed from: y */
    public Boolean f23467y;

    /* JADX INFO: renamed from: z */
    public TimeInterpolator f23468z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons$a */
    public class C8125a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f23469a;

        public C8125a(boolean z) {
            this.f23469a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
            HomeCardBottomOptButtons.this.f23437L = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            HomeCardBottomOptButtons.this.f23437L = false;
            HomeCardBottomOptButtons.this.mo39374b(this.f23469a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons$b */
    public static class C8126b {

        /* JADX INFO: renamed from: a */
        public C8127c f23471a;

        /* JADX INFO: renamed from: b */
        public C8127c f23472b;

        /* JADX INFO: renamed from: c */
        public C8127c f23473c;

        /* JADX INFO: renamed from: d */
        public C8127c f23474d;

        /* JADX INFO: renamed from: e */
        public C8127c f23475e;

        /* JADX INFO: renamed from: f */
        public C8127c f23476f;

        public C8126b(boolean z) {
            if (z) {
                this.f23471a = new C8127c();
                this.f23472b = new C8127c();
                this.f23474d = new C8127c();
                this.f23473c = new C8127c();
                this.f23475e = new C8127c();
                this.f23476f = new C8127c();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m39385a(C8126b c8126b) {
            this.f23471a.m39387a(c8126b.f23471a);
            this.f23472b.m39387a(c8126b.f23472b);
            this.f23474d.m39387a(c8126b.f23474d);
            this.f23473c.m39387a(c8126b.f23473c);
            this.f23475e.m39387a(c8126b.f23475e);
            this.f23476f.m39387a(c8126b.f23476f);
        }

        /* JADX INFO: renamed from: b */
        public boolean m39386b(C8126b c8126b) {
            return c8126b.f23471a.m39388b(this.f23471a) && c8126b.f23472b.m39388b(this.f23472b) && c8126b.f23474d.m39388b(this.f23474d) && c8126b.f23473c.m39388b(this.f23473c) && c8126b.f23475e.m39388b(this.f23475e) && c8126b.f23476f.m39388b(this.f23476f);
        }
    }

    public HomeCardBottomOptButtons(@NonNull Context context) {
        super(context);
        this.f23459q = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.1
            {
                put("default", pf60.m172085a("new_card_expand_undo.svga", "new_card_expand_undo.svga"));
            }
        };
        this.f23460r = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.2
            {
                put("default", pf60.m172085a("new_card_expand_like.svga", "new_card_expand_like.svga"));
            }
        };
        this.f23461s = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.3
            {
                put("default", pf60.m172085a("new_card_expand_dislike.svga", "new_card_expand_dislike.svga"));
            }
        };
        this.f23462t = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.4
            {
                put("default", pf60.m172085a("new_card_expand_superlike.svga", "new_card_expand_superlike.svga"));
            }
        };
        this.f23463u = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.5
            {
                put("default", pf60.m172085a("new_card_expand_match.svga", "new_card_expand_match.svga"));
            }
        };
        this.f23464v = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.6
            {
                put("default", pf60.m172085a("new_card_expand_compliment.svga", "new_card_expand_compliment.svga"));
            }
        };
        this.f23465w = "default";
        this.f23466x = "unknown";
        this.f23467y = null;
        this.f23468z = new DecelerateInterpolator();
        this.f23429D = false;
        this.f23436K = 0.0f;
        this.f23437L = false;
        this.f23438M = -1;
        this.f23439N = new C8127c();
        this.f23440O = qa00.m175859d(20.0f);
        this.f23441P = 0.0f;
        this.f23442Q = qa00.m175859d(10.0f);
    }

    private int getComplimentStock() {
        return joa.m146399m3();
    }

    /* JADX INFO: renamed from: j */
    private void m39367j() {
        bnl0.m105509E0(this.f23458p, new View.OnClickListener() { // from class: l.v5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182554a.m39368k(view);
            }
        });
        bnl0.m105509E0(this.f23456n, new View.OnClickListener() { // from class: l.w5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187535a.m39369l(view);
            }
        });
        bnl0.m105509E0(this.f23457o, new View.OnClickListener() { // from class: l.x5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192501a.m39370m(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m39368k(View view) {
        i4g0.m138520r("e_intl_instantmatch_btn", OMSDialogPositon.p_suggest_user_profile_info_view);
        if (NullChecker.m82486a(this.f23426A)) {
            this.f23426A.call("p_suggest_user_profile_info_view,e_intl_instantmatch_btn,click");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m39369l(View view) {
        i4g0.m138520r("e_intl_instantmatch_btn", "p_suggest_users_home_view");
        if (NullChecker.m82486a(this.f23426A)) {
            this.f23426A.call("p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m39370m(View view) {
        i4g0.m138520r("e_compliment_home_card", "p_suggest_users_home_view");
        if (NullChecker.m82486a(this.f23427B) && NullChecker.m82486a(this.f23428C)) {
            this.f23427B.call(this.f23428C);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m39371p() {
        if (NullChecker.m82486a(this.f23467y)) {
            SVGALoader.with(getContext()).from(this.f23467y.booleanValue() ? "https://auto.tancdn.com/v1/raw/02f79ff2-ea08-4696-9df5-d227b6fa4f2d12.pdf" : "https://auto.tancdn.com/v1/raw/9a957b00-c134-4bf0-8dfd-1cdff0f4ec7513.pdf").autoPlay(true).repeatCount(-1).into(getSuperLikeComboSvga());
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m39372r(User user) {
        z99 z99Var;
        if (joa.m146354D3()) {
            return false;
        }
        if (!joa.m146386f4() && joa.m146399m3() == 0) {
            return false;
        }
        try {
            C4883c c4883c = CoreModule.f18264c;
            return c4883c == null || (z99Var = c4883c.f20414p0) == null || z99Var.f203452S <= z99Var.f203453T;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return true;
        }
    }

    private void setSwipeAnimEnable(boolean z) {
        HomeCardExpandedOptButton homeCardExpandedOptButton = this.f23455m;
        if (z) {
            homeCardExpandedOptButton.setSwipeEnable(true);
            this.f23449g.setSwipeEnable(true);
            this.f23453k.setSwipeEnable(true);
        } else {
            homeCardExpandedOptButton.setSwipeEnable(false);
            this.f23449g.setSwipeEnable(false);
            this.f23453k.setSwipeEnable(false);
        }
    }

    @Override // p153l.bvl
    /* JADX INFO: renamed from: a */
    public void mo39373a(boolean z, User user, CoreSuggested.UserInfo userInfo) {
        ValueAnimator valueAnimator = this.f23435J;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23435J.cancel();
        }
        this.f23437L = true;
        if (z) {
            this.f23435J = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f23433H.m39385a(this.f23434I);
        } else {
            this.f23435J = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f23432G.m39385a(this.f23434I);
        }
        this.f23435J.setInterpolator(this.f23468z);
        m39381s(z);
        bnl0.m105525M0(this.f23444b, z);
    }

    @Override // p153l.bvl
    /* JADX INFO: renamed from: b */
    public void mo39374b(boolean z) {
        if (z) {
            return;
        }
        if (!this.f23434I.m39386b(this.f23430E)) {
            this.f23430E.m39385a(this.f23434I);
            m39380q(this.f23434I);
        }
        bnl0.m105525M0(this.f23444b, false);
        if (NullChecker.m82486a(this.f23428C)) {
            m39383u(this.f23428C);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m39375g(View view) {
        z5l.m218708a(this, view);
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getButtonRadius() {
        return super.getButtonRadius();
    }

    @Override // p153l.bvl
    public ViewGroup getButtonRootLayout() {
        return this;
    }

    @Override // p153l.bvl
    public int getButtonScrolledDistance() {
        return f23420R;
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ View getButtonsRightLayout() {
        return super.getButtonsRightLayout();
    }

    @Override // p153l.bvl
    public avl getDislikeBtn() {
        return this.f23449g;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getDislikePressBg() {
        return super.getDislikePressBg();
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyAndSuperLikeLayout() {
        return super.getImmediatelyAndSuperLikeLayout();
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyMatch() {
        return super.getImmediatelyMatch();
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ avl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    public View getImmediatelyMatchTop() {
        return this.f23458p;
    }

    @Override // p153l.bvl
    public avl getLikeBtn() {
        return this.f23455m;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getLikePressBg() {
        return super.getLikePressBg();
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getNormalBg() {
        return super.getNormalBg();
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getOperationBtnBg() {
        return super.getOperationBtnBg();
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ VImage getPinImage() {
        return super.getPinImage();
    }

    @Nullable
    public View getPinLikeLayout() {
        return null;
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ VText getPinText() {
        return super.getPinText();
    }

    @Override // p153l.bvl
    public FrameLayout.LayoutParams getRootBtnLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, qa00.m175859d(198.0f));
        layoutParams.gravity = 81;
        return layoutParams;
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ View getSayHiNewLayout() {
        return super.getSayHiNewLayout();
    }

    @Override // p153l.bvl
    public avl getSuperLike() {
        return this.f23453k;
    }

    @Override // p153l.bvl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f23451i;
    }

    @Override // p153l.bvl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f23452j;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p153l.bvl
    public VText getSuperLikeRemaining() {
        return this.f23454l;
    }

    @Override // p153l.bvl
    public View getSuperLikeWarpLayout() {
        return this.f23450h;
    }

    @Override // p153l.bvl
    @Nullable
    public avl getUndo() {
        return this.f23447e;
    }

    @Override // p153l.bvl
    @Nullable
    public VFrame_FlipContainer getUndoLayout() {
        return this.f23446d;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    /* JADX INFO: renamed from: h */
    public final C8127c m39376h(C8127c c8127c, C8127c c8127c2, float f) {
        C8127c c8127c3 = this.f23439N;
        int i = c8127c.f23477a;
        int i2 = i + ((int) ((c8127c2.f23477a - i) * f));
        int i3 = c8127c.f23478b;
        int i4 = i3 + ((int) ((c8127c2.f23478b - i3) * f));
        float f2 = c8127c.f23479c;
        float f3 = f2 + ((c8127c2.f23479c - f2) * f);
        float f4 = c8127c.f23480d;
        float f5 = f4 + ((c8127c2.f23480d - f4) * f);
        float f6 = c8127c.f23481e;
        float f7 = f6 + ((c8127c2.f23481e - f6) * f);
        float f8 = c8127c.f23482f;
        c8127c3.m39389c(i2, i4, f3, f5, f7, f8 + ((c8127c2.f23482f - f8) * f));
        return this.f23439N;
    }

    /* JADX INFO: renamed from: i */
    public final void m39377i() {
        C8126b c8126b = new C8126b(false);
        this.f23430E = c8126b;
        int i = f23424V;
        c8126b.f23471a = new C8127c(i, i, 1.0f, -qa00.m175859d(140.0f), qa00.m175859d(7.0f));
        C8126b c8126b2 = this.f23430E;
        int i2 = f23425W;
        c8126b2.f23472b = new C8127c(i2, i2, 1.0f, -qa00.m175859d(69.0f), 0.0f);
        this.f23430E.f23473c = new C8127c(i, i, 1.0f, qa00.m175859d(0.0f), qa00.m175859d(7.0f));
        this.f23430E.f23474d = new C8127c(i2, i2, 1.0f, qa00.m175859d(69.0f), 0.0f);
        this.f23430E.f23475e = new C8127c(i, i, 1.0f, qa00.m175859d(140.0f), qa00.m175859d(7.0f));
        this.f23430E.f23476f = new C8127c(i, i, 0.0f, qa00.m175859d(140.0f), qa00.m175859d(7.0f));
        int iM105592y0 = bnl0.m105592y0();
        int i3 = f23423U;
        int i4 = f23421S;
        float f = ((iM105592y0 - (i3 * 3)) - i4) / 2.0f;
        this.f23440O = f;
        if (f < qa00.f156322i) {
            float f2 = qa00.f156318e;
            this.f23441P = f2;
            this.f23440O = (((iM105592y0 - (i3 * 3)) - i4) + (f2 * 3.0f)) / 2.0f;
        }
        C8126b c8126b3 = new C8126b(false);
        this.f23431F = c8126b3;
        c8126b3.f23471a = new C8127c(i3, i3, 0.0f, -qa00.m175859d(120.0f), qa00.m175859d(62.0f));
        float f3 = (-iM105592y0) / 2.0f;
        this.f23431F.f23472b = new C8127c(i3, i3, 1.0f, (((i3 * 0.5f) + f3) + this.f23440O) - this.f23442Q, qa00.m175859d(62.0f));
        this.f23431F.f23473c = new C8127c(i3, i3, 1.0f, ((((i3 * 1.5f) + f3) + this.f23440O) - this.f23442Q) - this.f23441P, qa00.m175859d(62.0f));
        this.f23431F.f23474d = new C8127c(i3, i3, 1.0f, ((((i3 * 2.5f) + f3) + this.f23440O) - this.f23442Q) - (this.f23441P * 2.0f), qa00.m175859d(62.0f));
        this.f23431F.f23475e = new C8127c(i3, i3, 0.0f, qa00.m175859d(120.0f), qa00.m175859d(62.0f));
        this.f23431F.f23476f = new C8127c(i4, f23422T, 1.0f, (((f3 + (i3 * 3.0f)) + this.f23440O) + (i4 / 2.0f)) - (this.f23441P * 3.0f), qa00.m175859d(73.0f));
        this.f23432G = new C8126b(true);
        this.f23433H = new C8126b(true);
        this.f23434I = new C8126b(true);
        this.f23430E.m39385a(this.f23432G);
        this.f23431F.m39385a(this.f23433H);
        this.f23432G.m39385a(this.f23434I);
    }

    /* JADX INFO: renamed from: n */
    public final void m39378n(float f) {
        m39382t(this.f23446d, m39376h(this.f23432G.f23471a, this.f23433H.f23471a, f));
        m39382t(this.f23449g, m39376h(this.f23432G.f23472b, this.f23433H.f23472b, f));
        m39382t(this.f23455m, m39376h(this.f23432G.f23474d, this.f23433H.f23474d, f));
        m39382t(this.f23450h, m39376h(this.f23432G.f23473c, this.f23433H.f23473c, f));
        C8127c c8127cM39376h = m39376h(this.f23432G.f23475e, this.f23433H.f23475e, f);
        m39382t(this.f23456n, c8127cM39376h);
        m39382t(this.f23457o, c8127cM39376h);
        m39382t(this.f23458p, m39376h(this.f23432G.f23476f, this.f23433H.f23476f, f));
    }

    /* JADX INFO: renamed from: o */
    public final void m39379o() {
        this.f23447e.m39453l(this.f23459q.get(this.f23465w).f152156a, this.f23459q.get(this.f23465w).f152157b);
        this.f23455m.m39453l(this.f23460r.get(this.f23465w).f152156a, this.f23460r.get(this.f23465w).f152157b);
        this.f23449g.m39453l(this.f23461s.get(this.f23465w).f152156a, this.f23461s.get(this.f23465w).f152157b);
        this.f23453k.m39453l(this.f23462t.get(this.f23465w).f152156a, this.f23462t.get(this.f23465w).f152157b);
        this.f23456n.m39453l(this.f23463u.get(this.f23465w).f152156a, this.f23463u.get(this.f23465w).f152157b);
        this.f23457o.m39453l(this.f23464v.get(this.f23465w).f152156a, this.f23464v.get(this.f23465w).f152157b);
        this.f23466x = this.f23465w;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NonNull Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NonNull Animator animator) {
        super.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@NonNull Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@NonNull Animator animator) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f23436K = fFloatValue;
        m39378n(fFloatValue);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39375g(this);
        m39377i();
        this.f23443a.setClickable(false);
        setSwipeAnimEnable(true);
        m39379o();
        m39367j();
        m39378n(0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.f23438M != size) {
            this.f23438M = size;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m39380q(C8126b c8126b) {
        m39382t(this.f23446d, c8126b.f23471a);
        m39382t(this.f23449g, c8126b.f23472b);
        m39382t(this.f23455m, c8126b.f23474d);
        m39382t(this.f23450h, c8126b.f23473c);
        m39382t(this.f23456n, c8126b.f23475e);
        m39382t(this.f23457o, c8126b.f23475e);
        m39382t(this.f23458p, c8126b.f23476f);
    }

    /* JADX INFO: renamed from: s */
    public final void m39381s(boolean z) {
        this.f23435J.setDuration(ExpandedCardStyleHelper.f23149h);
        this.f23435J.addUpdateListener(this);
        this.f23435J.addListener(new C8125a(z));
        this.f23435J.start();
    }

    @Override // p153l.bvl
    public void setButtonStyleType(String str) {
        this.f23465w = str;
        m39379o();
        m39371p();
    }

    public void setComplimentClickListener(Action1<User> action1) {
        this.f23427B = action1;
    }

    @Override // p153l.emf
    public void setImmediateleMatchClickListener(Action1<String> action1) {
        this.f23426A = action1;
    }

    @Override // p153l.bvl
    public void setSuperLikeBtnGray(boolean z) {
        this.f23429D = z;
    }

    @Override // p153l.bvl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f23467y = Boolean.valueOf(z);
        m39371p();
    }

    /* JADX INFO: renamed from: t */
    public final void m39382t(View view, C8127c c8127c) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = c8127c.f23477a;
        marginLayoutParams.height = c8127c.f23478b;
        view.setLayoutParams(marginLayoutParams);
        view.setAlpha(c8127c.f23479c);
        view.setTranslationX(c8127c.f23480d);
        view.setTranslationY(c8127c.f23481e);
        view.setScaleX(c8127c.f23482f);
        view.setScaleY(c8127c.f23482f);
        if (view != this.f23456n && view != this.f23457o) {
            if (c8127c.f23479c == 0.0f) {
                bnl0.m105524M(view, false);
                return;
            } else {
                bnl0.m105524M(view, true);
                return;
            }
        }
        if (c8127c.f23479c == 0.0f) {
            bnl0.m105524M(view, false);
        } else if (NullChecker.m82486a(this.f23428C)) {
            m39383u(this.f23428C);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m39383u(User user) {
        m39384v(user, "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: v */
    public void m39384v(User user, String str) {
        this.f23428C = user;
        if (!m39372r(user)) {
            bnl0.m105524M(this.f23456n, true);
            bnl0.m105524M(this.f23457o, false);
            return;
        }
        String strM131227a = gp5.m131227a("home_card_compliment_btn");
        if (!TextUtils.isEmpty(strM131227a)) {
            gp5.m131232f(str, strM131227a);
        }
        bnl0.m105524M(this.f23457o, true);
        bnl0.m105524M(this.f23456n, false);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons$c */
    public static class C8127c {

        /* JADX INFO: renamed from: a */
        public int f23477a;

        /* JADX INFO: renamed from: b */
        public int f23478b;

        /* JADX INFO: renamed from: c */
        public float f23479c;

        /* JADX INFO: renamed from: d */
        public float f23480d;

        /* JADX INFO: renamed from: e */
        public float f23481e;

        /* JADX INFO: renamed from: f */
        public float f23482f;

        public C8127c(int i, int i2, float f, float f2, float f3) {
            this.f23477a = i;
            this.f23478b = i2;
            this.f23480d = f2;
            this.f23479c = f;
            this.f23481e = f3;
            this.f23482f = 1.0f;
        }

        /* JADX INFO: renamed from: a */
        public void m39387a(C8127c c8127c) {
            c8127c.f23477a = this.f23477a;
            c8127c.f23478b = this.f23478b;
            c8127c.f23479c = this.f23479c;
            c8127c.f23480d = this.f23480d;
            c8127c.f23481e = this.f23481e;
            c8127c.f23482f = this.f23482f;
        }

        /* JADX INFO: renamed from: b */
        public boolean m39388b(C8127c c8127c) {
            return c8127c.f23478b == this.f23478b && c8127c.f23477a == this.f23477a && c8127c.f23479c == this.f23479c && c8127c.f23480d == this.f23480d && c8127c.f23482f == this.f23482f && c8127c.f23481e == this.f23481e;
        }

        /* JADX INFO: renamed from: c */
        public void m39389c(int i, int i2, float f, float f2, float f3, float f4) {
            this.f23477a = i;
            this.f23478b = i2;
            this.f23479c = f;
            this.f23480d = f2;
            this.f23481e = f3;
            this.f23482f = f4;
        }

        public C8127c() {
            this.f23482f = 1.0f;
        }
    }

    public HomeCardBottomOptButtons(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23459q = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.1
            {
                put("default", pf60.m172085a("new_card_expand_undo.svga", "new_card_expand_undo.svga"));
            }
        };
        this.f23460r = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.2
            {
                put("default", pf60.m172085a("new_card_expand_like.svga", "new_card_expand_like.svga"));
            }
        };
        this.f23461s = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.3
            {
                put("default", pf60.m172085a("new_card_expand_dislike.svga", "new_card_expand_dislike.svga"));
            }
        };
        this.f23462t = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.4
            {
                put("default", pf60.m172085a("new_card_expand_superlike.svga", "new_card_expand_superlike.svga"));
            }
        };
        this.f23463u = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.5
            {
                put("default", pf60.m172085a("new_card_expand_match.svga", "new_card_expand_match.svga"));
            }
        };
        this.f23464v = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.6
            {
                put("default", pf60.m172085a("new_card_expand_compliment.svga", "new_card_expand_compliment.svga"));
            }
        };
        this.f23465w = "default";
        this.f23466x = "unknown";
        this.f23467y = null;
        this.f23468z = new DecelerateInterpolator();
        this.f23429D = false;
        this.f23436K = 0.0f;
        this.f23437L = false;
        this.f23438M = -1;
        this.f23439N = new C8127c();
        this.f23440O = qa00.m175859d(20.0f);
        this.f23441P = 0.0f;
        this.f23442Q = qa00.m175859d(10.0f);
    }

    public HomeCardBottomOptButtons(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23459q = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.1
            {
                put("default", pf60.m172085a("new_card_expand_undo.svga", "new_card_expand_undo.svga"));
            }
        };
        this.f23460r = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.2
            {
                put("default", pf60.m172085a("new_card_expand_like.svga", "new_card_expand_like.svga"));
            }
        };
        this.f23461s = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.3
            {
                put("default", pf60.m172085a("new_card_expand_dislike.svga", "new_card_expand_dislike.svga"));
            }
        };
        this.f23462t = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.4
            {
                put("default", pf60.m172085a("new_card_expand_superlike.svga", "new_card_expand_superlike.svga"));
            }
        };
        this.f23463u = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.5
            {
                put("default", pf60.m172085a("new_card_expand_match.svga", "new_card_expand_match.svga"));
            }
        };
        this.f23464v = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.6
            {
                put("default", pf60.m172085a("new_card_expand_compliment.svga", "new_card_expand_compliment.svga"));
            }
        };
        this.f23465w = "default";
        this.f23466x = "unknown";
        this.f23467y = null;
        this.f23468z = new DecelerateInterpolator();
        this.f23429D = false;
        this.f23436K = 0.0f;
        this.f23437L = false;
        this.f23438M = -1;
        this.f23439N = new C8127c();
        this.f23440O = qa00.m175859d(20.0f);
        this.f23441P = 0.0f;
        this.f23442Q = qa00.m175859d(10.0f);
    }
}
