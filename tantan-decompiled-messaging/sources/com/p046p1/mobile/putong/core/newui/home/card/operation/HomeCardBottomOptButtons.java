package com.p046p1.mobile.putong.core.newui.home.card.operation;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.card.operation.view.HomeButtonHookLayout;
import com.p046p1.mobile.putong.core.newui.home.card.operation.view.UndoTestLayout;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.HashMap;
import p147v.VFrame;
import p147v.VFrame_FlipContainer;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.co5;
import p149l.j3l;
import p149l.j760;
import p149l.nsl;
import p149l.osl;
import p149l.q89;
import p149l.t100;
import p149l.xdl0;
import p149l.xma;
import p149l.ykf;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardBottomOptButtons extends FrameLayout implements osl, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, ykf {

    /* JADX INFO: renamed from: R */
    public static final int f22678R = t100.m186890d(80.0f);

    /* JADX INFO: renamed from: S */
    public static final int f22679S = t100.m186890d(130.0f);

    /* JADX INFO: renamed from: T */
    public static final int f22680T = t100.m186890d(50.0f);

    /* JADX INFO: renamed from: U */
    public static final int f22681U = t100.m186890d(72.0f);

    /* JADX INFO: renamed from: V */
    public static final int f22682V = t100.m186890d(64.0f);

    /* JADX INFO: renamed from: W */
    public static final int f22683W = t100.m186890d(84.0f);

    /* JADX INFO: renamed from: A */
    public Action1<String> f22684A;

    /* JADX INFO: renamed from: B */
    public Action1<User> f22685B;

    /* JADX INFO: renamed from: C */
    public User f22686C;

    /* JADX INFO: renamed from: D */
    public boolean f22687D;

    /* JADX INFO: renamed from: E */
    public C7975b f22688E;

    /* JADX INFO: renamed from: F */
    public C7975b f22689F;

    /* JADX INFO: renamed from: G */
    public C7975b f22690G;

    /* JADX INFO: renamed from: H */
    public C7975b f22691H;

    /* JADX INFO: renamed from: I */
    public C7975b f22692I;

    /* JADX INFO: renamed from: J */
    public ValueAnimator f22693J;

    /* JADX INFO: renamed from: K */
    public float f22694K;

    /* JADX INFO: renamed from: L */
    public boolean f22695L;

    /* JADX INFO: renamed from: M */
    public int f22696M;

    /* JADX INFO: renamed from: N */
    public C7976c f22697N;

    /* JADX INFO: renamed from: O */
    public float f22698O;

    /* JADX INFO: renamed from: P */
    public float f22699P;

    /* JADX INFO: renamed from: Q */
    public float f22700Q;

    /* JADX INFO: renamed from: a */
    public HomeCardBottomOptButtons f22701a;

    /* JADX INFO: renamed from: b */
    public VFrame f22702b;

    /* JADX INFO: renamed from: c */
    public HomeButtonHookLayout f22703c;

    /* JADX INFO: renamed from: d */
    public UndoTestLayout f22704d;

    /* JADX INFO: renamed from: e */
    public HomeCardExpandedOptButton f22705e;

    /* JADX INFO: renamed from: f */
    public VText f22706f;

    /* JADX INFO: renamed from: g */
    public HomeCardExpandedOptButton f22707g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f22708h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f22709i;

    /* JADX INFO: renamed from: j */
    public VFrame_FlipContainer f22710j;

    /* JADX INFO: renamed from: k */
    public HomeCardExpandedOptButton f22711k;

    /* JADX INFO: renamed from: l */
    public VText f22712l;

    /* JADX INFO: renamed from: m */
    public HomeCardExpandedOptButton f22713m;

    /* JADX INFO: renamed from: n */
    public HomeCardExpandedOptButton f22714n;

    /* JADX INFO: renamed from: o */
    public HomeCardExpandedOptButton f22715o;

    /* JADX INFO: renamed from: p */
    public VLinear f22716p;

    /* JADX INFO: renamed from: q */
    public final HashMap<String, j760<String, String>> f22717q;

    /* JADX INFO: renamed from: r */
    public final HashMap<String, j760<String, String>> f22718r;

    /* JADX INFO: renamed from: s */
    public final HashMap<String, j760<String, String>> f22719s;

    /* JADX INFO: renamed from: t */
    public final HashMap<String, j760<String, String>> f22720t;

    /* JADX INFO: renamed from: u */
    public HashMap<String, j760<String, String>> f22721u;

    /* JADX INFO: renamed from: v */
    public HashMap<String, j760<String, String>> f22722v;

    /* JADX INFO: renamed from: w */
    public String f22723w;

    /* JADX INFO: renamed from: x */
    public String f22724x;

    /* JADX INFO: renamed from: y */
    public Boolean f22725y;

    /* JADX INFO: renamed from: z */
    public TimeInterpolator f22726z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons$a */
    public class C7974a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f22727a;

        public C7974a(boolean z) {
            this.f22727a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
            HomeCardBottomOptButtons.this.f22695L = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            HomeCardBottomOptButtons.this.f22695L = false;
            HomeCardBottomOptButtons.this.mo38371b(this.f22727a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons$b */
    public static class C7975b {

        /* JADX INFO: renamed from: a */
        public C7976c f22729a;

        /* JADX INFO: renamed from: b */
        public C7976c f22730b;

        /* JADX INFO: renamed from: c */
        public C7976c f22731c;

        /* JADX INFO: renamed from: d */
        public C7976c f22732d;

        /* JADX INFO: renamed from: e */
        public C7976c f22733e;

        /* JADX INFO: renamed from: f */
        public C7976c f22734f;

        public C7975b(boolean z) {
            if (z) {
                this.f22729a = new C7976c();
                this.f22730b = new C7976c();
                this.f22732d = new C7976c();
                this.f22731c = new C7976c();
                this.f22733e = new C7976c();
                this.f22734f = new C7976c();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m38382a(C7975b c7975b) {
            this.f22729a.m38384a(c7975b.f22729a);
            this.f22730b.m38384a(c7975b.f22730b);
            this.f22732d.m38384a(c7975b.f22732d);
            this.f22731c.m38384a(c7975b.f22731c);
            this.f22733e.m38384a(c7975b.f22733e);
            this.f22734f.m38384a(c7975b.f22734f);
        }

        /* JADX INFO: renamed from: b */
        public boolean m38383b(C7975b c7975b) {
            return c7975b.f22729a.m38385b(this.f22729a) && c7975b.f22730b.m38385b(this.f22730b) && c7975b.f22732d.m38385b(this.f22732d) && c7975b.f22731c.m38385b(this.f22731c) && c7975b.f22733e.m38385b(this.f22733e) && c7975b.f22734f.m38385b(this.f22734f);
        }
    }

    public HomeCardBottomOptButtons(@NonNull Context context) {
        super(context);
        this.f22717q = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.1
            {
                put("default", j760.m140076a("new_card_expand_undo.svga", "new_card_expand_undo.svga"));
            }
        };
        this.f22718r = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.2
            {
                put("default", j760.m140076a("new_card_expand_like.svga", "new_card_expand_like.svga"));
            }
        };
        this.f22719s = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.3
            {
                put("default", j760.m140076a("new_card_expand_dislike.svga", "new_card_expand_dislike.svga"));
            }
        };
        this.f22720t = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.4
            {
                put("default", j760.m140076a("new_card_expand_superlike.svga", "new_card_expand_superlike.svga"));
            }
        };
        this.f22721u = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.5
            {
                put("default", j760.m140076a("new_card_expand_match.svga", "new_card_expand_match.svga"));
            }
        };
        this.f22722v = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.6
            {
                put("default", j760.m140076a("new_card_expand_compliment.svga", "new_card_expand_compliment.svga"));
            }
        };
        this.f22723w = "default";
        this.f22724x = "unknown";
        this.f22725y = null;
        this.f22726z = new DecelerateInterpolator();
        this.f22687D = false;
        this.f22694K = 0.0f;
        this.f22695L = false;
        this.f22696M = -1;
        this.f22697N = new C7976c();
        this.f22698O = t100.m186890d(20.0f);
        this.f22699P = 0.0f;
        this.f22700Q = t100.m186890d(10.0f);
    }

    private int getComplimentStock() {
        return xma.m210086m3();
    }

    /* JADX INFO: renamed from: j */
    private void m38364j() {
        xdl0.m208329E0(this.f22716p, new View.OnClickListener() { // from class: l.f3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94696a.m38365k(view);
            }
        });
        xdl0.m208329E0(this.f22714n, new View.OnClickListener() { // from class: l.g3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100482a.m38366l(view);
            }
        });
        xdl0.m208329E0(this.f22715o, new View.OnClickListener() { // from class: l.h3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105748a.m38367m(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m38365k(View view) {
        zvf0.m220396r("e_intl_instantmatch_btn", OMSDialogPositon.p_suggest_user_profile_info_view);
        if (NullChecker.m81303a(this.f22684A)) {
            this.f22684A.call("p_suggest_user_profile_info_view,e_intl_instantmatch_btn,click");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m38366l(View view) {
        zvf0.m220396r("e_intl_instantmatch_btn", "p_suggest_users_home_view");
        if (NullChecker.m81303a(this.f22684A)) {
            this.f22684A.call("p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m38367m(View view) {
        zvf0.m220396r("e_compliment_home_card", "p_suggest_users_home_view");
        if (NullChecker.m81303a(this.f22685B) && NullChecker.m81303a(this.f22686C)) {
            this.f22685B.call(this.f22686C);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m38368p() {
        if (NullChecker.m81303a(this.f22725y)) {
            SVGALoader.with(getContext()).from(this.f22725y.booleanValue() ? "https://auto.tancdn.com/v1/raw/02f79ff2-ea08-4696-9df5-d227b6fa4f2d12.pdf" : "https://auto.tancdn.com/v1/raw/9a957b00-c134-4bf0-8dfd-1cdff0f4ec7513.pdf").autoPlay(true).repeatCount(-1).into(getSuperLikeComboSvga());
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m38369r(User user) {
        q89 q89Var;
        if (xma.m210040C3()) {
            return false;
        }
        if (!xma.m210071e4() && xma.m210086m3() == 0) {
            return false;
        }
        try {
            C4732c c4732c = CoreModule.f17545c;
            return c4732c == null || (q89Var = c4732c.f19672p0) == null || q89Var.f153141S <= q89Var.f153142T;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return true;
        }
    }

    private void setSwipeAnimEnable(boolean z) {
        HomeCardExpandedOptButton homeCardExpandedOptButton = this.f22713m;
        if (z) {
            homeCardExpandedOptButton.setSwipeEnable(true);
            this.f22707g.setSwipeEnable(true);
            this.f22711k.setSwipeEnable(true);
        } else {
            homeCardExpandedOptButton.setSwipeEnable(false);
            this.f22707g.setSwipeEnable(false);
            this.f22711k.setSwipeEnable(false);
        }
    }

    @Override // p149l.osl
    /* JADX INFO: renamed from: a */
    public void mo38370a(boolean z, User user, CoreSuggested.UserInfo userInfo) {
        ValueAnimator valueAnimator = this.f22693J;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f22693J.cancel();
        }
        this.f22695L = true;
        if (z) {
            this.f22693J = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f22691H.m38382a(this.f22692I);
        } else {
            this.f22693J = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f22690G.m38382a(this.f22692I);
        }
        this.f22693J.setInterpolator(this.f22726z);
        m38378s(z);
        xdl0.m208345M0(this.f22702b, z);
    }

    @Override // p149l.osl
    /* JADX INFO: renamed from: b */
    public void mo38371b(boolean z) {
        if (z) {
            return;
        }
        if (!this.f22692I.m38383b(this.f22688E)) {
            this.f22688E.m38382a(this.f22692I);
            m38377q(this.f22692I);
        }
        xdl0.m208345M0(this.f22702b, false);
        if (NullChecker.m81303a(this.f22686C)) {
            m38380u(this.f22686C);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m38372g(View view) {
        j3l.m139578a(this, view);
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getButtonRadius() {
        return super.getButtonRadius();
    }

    @Override // p149l.osl
    public ViewGroup getButtonRootLayout() {
        return this;
    }

    @Override // p149l.osl
    public int getButtonScrolledDistance() {
        return f22678R;
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getButtonsRightLayout() {
        return super.getButtonsRightLayout();
    }

    @Override // p149l.osl
    public nsl getDislikeBtn() {
        return this.f22707g;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getDislikePressBg() {
        return super.getDislikePressBg();
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyAndSuperLikeLayout() {
        return super.getImmediatelyAndSuperLikeLayout();
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyMatch() {
        return super.getImmediatelyMatch();
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ nsl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    public View getImmediatelyMatchTop() {
        return this.f22716p;
    }

    @Override // p149l.osl
    public nsl getLikeBtn() {
        return this.f22713m;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getLikePressBg() {
        return super.getLikePressBg();
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getNormalBg() {
        return super.getNormalBg();
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getOperationBtnBg() {
        return super.getOperationBtnBg();
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ VImage getPinImage() {
        return super.getPinImage();
    }

    @Nullable
    public View getPinLikeLayout() {
        return null;
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ VText getPinText() {
        return super.getPinText();
    }

    @Override // p149l.osl
    public FrameLayout.LayoutParams getRootBtnLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, t100.m186890d(198.0f));
        layoutParams.gravity = 81;
        return layoutParams;
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getSayHiNewLayout() {
        return super.getSayHiNewLayout();
    }

    @Override // p149l.osl
    public nsl getSuperLike() {
        return this.f22711k;
    }

    @Override // p149l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f22709i;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f22710j;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p149l.osl
    public VText getSuperLikeRemaining() {
        return this.f22712l;
    }

    @Override // p149l.osl
    public View getSuperLikeWarpLayout() {
        return this.f22708h;
    }

    @Override // p149l.osl
    @Nullable
    public nsl getUndo() {
        return this.f22705e;
    }

    @Override // p149l.osl
    @Nullable
    public VFrame_FlipContainer getUndoLayout() {
        return this.f22704d;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    /* JADX INFO: renamed from: h */
    public final C7976c m38373h(C7976c c7976c, C7976c c7976c2, float f) {
        C7976c c7976c3 = this.f22697N;
        int i = c7976c.f22735a;
        int i2 = i + ((int) ((c7976c2.f22735a - i) * f));
        int i3 = c7976c.f22736b;
        int i4 = i3 + ((int) ((c7976c2.f22736b - i3) * f));
        float f2 = c7976c.f22737c;
        float f3 = f2 + ((c7976c2.f22737c - f2) * f);
        float f4 = c7976c.f22738d;
        float f5 = f4 + ((c7976c2.f22738d - f4) * f);
        float f6 = c7976c.f22739e;
        float f7 = f6 + ((c7976c2.f22739e - f6) * f);
        float f8 = c7976c.f22740f;
        c7976c3.m38386c(i2, i4, f3, f5, f7, f8 + ((c7976c2.f22740f - f8) * f));
        return this.f22697N;
    }

    /* JADX INFO: renamed from: i */
    public final void m38374i() {
        C7975b c7975b = new C7975b(false);
        this.f22688E = c7975b;
        int i = f22682V;
        c7975b.f22729a = new C7976c(i, i, 1.0f, -t100.m186890d(140.0f), t100.m186890d(7.0f));
        C7975b c7975b2 = this.f22688E;
        int i2 = f22683W;
        c7975b2.f22730b = new C7976c(i2, i2, 1.0f, -t100.m186890d(69.0f), 0.0f);
        this.f22688E.f22731c = new C7976c(i, i, 1.0f, t100.m186890d(0.0f), t100.m186890d(7.0f));
        this.f22688E.f22732d = new C7976c(i2, i2, 1.0f, t100.m186890d(69.0f), 0.0f);
        this.f22688E.f22733e = new C7976c(i, i, 1.0f, t100.m186890d(140.0f), t100.m186890d(7.0f));
        this.f22688E.f22734f = new C7976c(i, i, 0.0f, t100.m186890d(140.0f), t100.m186890d(7.0f));
        int iM208412y0 = xdl0.m208412y0();
        int i3 = f22681U;
        int i4 = f22679S;
        float f = ((iM208412y0 - (i3 * 3)) - i4) / 2.0f;
        this.f22698O = f;
        if (f < t100.f167260i) {
            float f2 = t100.f167256e;
            this.f22699P = f2;
            this.f22698O = (((iM208412y0 - (i3 * 3)) - i4) + (f2 * 3.0f)) / 2.0f;
        }
        C7975b c7975b3 = new C7975b(false);
        this.f22689F = c7975b3;
        c7975b3.f22729a = new C7976c(i3, i3, 0.0f, -t100.m186890d(120.0f), t100.m186890d(62.0f));
        float f3 = (-iM208412y0) / 2.0f;
        this.f22689F.f22730b = new C7976c(i3, i3, 1.0f, (((i3 * 0.5f) + f3) + this.f22698O) - this.f22700Q, t100.m186890d(62.0f));
        this.f22689F.f22731c = new C7976c(i3, i3, 1.0f, ((((i3 * 1.5f) + f3) + this.f22698O) - this.f22700Q) - this.f22699P, t100.m186890d(62.0f));
        this.f22689F.f22732d = new C7976c(i3, i3, 1.0f, ((((i3 * 2.5f) + f3) + this.f22698O) - this.f22700Q) - (this.f22699P * 2.0f), t100.m186890d(62.0f));
        this.f22689F.f22733e = new C7976c(i3, i3, 0.0f, t100.m186890d(120.0f), t100.m186890d(62.0f));
        this.f22689F.f22734f = new C7976c(i4, f22680T, 1.0f, (((f3 + (i3 * 3.0f)) + this.f22698O) + (i4 / 2.0f)) - (this.f22699P * 3.0f), t100.m186890d(73.0f));
        this.f22690G = new C7975b(true);
        this.f22691H = new C7975b(true);
        this.f22692I = new C7975b(true);
        this.f22688E.m38382a(this.f22690G);
        this.f22689F.m38382a(this.f22691H);
        this.f22690G.m38382a(this.f22692I);
    }

    /* JADX INFO: renamed from: n */
    public final void m38375n(float f) {
        m38379t(this.f22704d, m38373h(this.f22690G.f22729a, this.f22691H.f22729a, f));
        m38379t(this.f22707g, m38373h(this.f22690G.f22730b, this.f22691H.f22730b, f));
        m38379t(this.f22713m, m38373h(this.f22690G.f22732d, this.f22691H.f22732d, f));
        m38379t(this.f22708h, m38373h(this.f22690G.f22731c, this.f22691H.f22731c, f));
        C7976c c7976cM38373h = m38373h(this.f22690G.f22733e, this.f22691H.f22733e, f);
        m38379t(this.f22714n, c7976cM38373h);
        m38379t(this.f22715o, c7976cM38373h);
        m38379t(this.f22716p, m38373h(this.f22690G.f22734f, this.f22691H.f22734f, f));
    }

    /* JADX INFO: renamed from: o */
    public final void m38376o() {
        this.f22705e.m38450l(this.f22717q.get(this.f22723w).f116564a, this.f22717q.get(this.f22723w).f116565b);
        this.f22713m.m38450l(this.f22718r.get(this.f22723w).f116564a, this.f22718r.get(this.f22723w).f116565b);
        this.f22707g.m38450l(this.f22719s.get(this.f22723w).f116564a, this.f22719s.get(this.f22723w).f116565b);
        this.f22711k.m38450l(this.f22720t.get(this.f22723w).f116564a, this.f22720t.get(this.f22723w).f116565b);
        this.f22714n.m38450l(this.f22721u.get(this.f22723w).f116564a, this.f22721u.get(this.f22723w).f116565b);
        this.f22715o.m38450l(this.f22722v.get(this.f22723w).f116564a, this.f22722v.get(this.f22723w).f116565b);
        this.f22724x = this.f22723w;
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
        this.f22694K = fFloatValue;
        m38375n(fFloatValue);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38372g(this);
        m38374i();
        this.f22701a.setClickable(false);
        setSwipeAnimEnable(true);
        m38376o();
        m38364j();
        m38375n(0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.f22696M != size) {
            this.f22696M = size;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m38377q(C7975b c7975b) {
        m38379t(this.f22704d, c7975b.f22729a);
        m38379t(this.f22707g, c7975b.f22730b);
        m38379t(this.f22713m, c7975b.f22732d);
        m38379t(this.f22708h, c7975b.f22731c);
        m38379t(this.f22714n, c7975b.f22733e);
        m38379t(this.f22715o, c7975b.f22733e);
        m38379t(this.f22716p, c7975b.f22734f);
    }

    /* JADX INFO: renamed from: s */
    public final void m38378s(boolean z) {
        this.f22693J.setDuration(ExpandedCardStyleHelper.f22407h);
        this.f22693J.addUpdateListener(this);
        this.f22693J.addListener(new C7974a(z));
        this.f22693J.start();
    }

    @Override // p149l.osl
    public void setButtonStyleType(String str) {
        this.f22723w = str;
        m38376o();
        m38368p();
    }

    public void setComplimentClickListener(Action1<User> action1) {
        this.f22685B = action1;
    }

    @Override // p149l.ykf
    public void setImmediateleMatchClickListener(Action1<String> action1) {
        this.f22684A = action1;
    }

    @Override // p149l.osl
    public void setSuperLikeBtnGray(boolean z) {
        this.f22687D = z;
    }

    @Override // p149l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f22725y = Boolean.valueOf(z);
        m38368p();
    }

    /* JADX INFO: renamed from: t */
    public final void m38379t(View view, C7976c c7976c) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = c7976c.f22735a;
        marginLayoutParams.height = c7976c.f22736b;
        view.setLayoutParams(marginLayoutParams);
        view.setAlpha(c7976c.f22737c);
        view.setTranslationX(c7976c.f22738d);
        view.setTranslationY(c7976c.f22739e);
        view.setScaleX(c7976c.f22740f);
        view.setScaleY(c7976c.f22740f);
        if (view != this.f22714n && view != this.f22715o) {
            if (c7976c.f22737c == 0.0f) {
                xdl0.m208344M(view, false);
                return;
            } else {
                xdl0.m208344M(view, true);
                return;
            }
        }
        if (c7976c.f22737c == 0.0f) {
            xdl0.m208344M(view, false);
        } else if (NullChecker.m81303a(this.f22686C)) {
            m38380u(this.f22686C);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m38380u(User user) {
        m38381v(user, "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: v */
    public void m38381v(User user, String str) {
        this.f22686C = user;
        if (!m38369r(user)) {
            xdl0.m208344M(this.f22714n, true);
            xdl0.m208344M(this.f22715o, false);
            return;
        }
        String strM107929a = co5.m107929a("home_card_compliment_btn");
        if (!TextUtils.isEmpty(strM107929a)) {
            co5.m107934f(str, strM107929a);
        }
        xdl0.m208344M(this.f22715o, true);
        xdl0.m208344M(this.f22714n, false);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons$c */
    public static class C7976c {

        /* JADX INFO: renamed from: a */
        public int f22735a;

        /* JADX INFO: renamed from: b */
        public int f22736b;

        /* JADX INFO: renamed from: c */
        public float f22737c;

        /* JADX INFO: renamed from: d */
        public float f22738d;

        /* JADX INFO: renamed from: e */
        public float f22739e;

        /* JADX INFO: renamed from: f */
        public float f22740f;

        public C7976c(int i, int i2, float f, float f2, float f3) {
            this.f22735a = i;
            this.f22736b = i2;
            this.f22738d = f2;
            this.f22737c = f;
            this.f22739e = f3;
            this.f22740f = 1.0f;
        }

        /* JADX INFO: renamed from: a */
        public void m38384a(C7976c c7976c) {
            c7976c.f22735a = this.f22735a;
            c7976c.f22736b = this.f22736b;
            c7976c.f22737c = this.f22737c;
            c7976c.f22738d = this.f22738d;
            c7976c.f22739e = this.f22739e;
            c7976c.f22740f = this.f22740f;
        }

        /* JADX INFO: renamed from: b */
        public boolean m38385b(C7976c c7976c) {
            return c7976c.f22736b == this.f22736b && c7976c.f22735a == this.f22735a && c7976c.f22737c == this.f22737c && c7976c.f22738d == this.f22738d && c7976c.f22740f == this.f22740f && c7976c.f22739e == this.f22739e;
        }

        /* JADX INFO: renamed from: c */
        public void m38386c(int i, int i2, float f, float f2, float f3, float f4) {
            this.f22735a = i;
            this.f22736b = i2;
            this.f22737c = f;
            this.f22738d = f2;
            this.f22739e = f3;
            this.f22740f = f4;
        }

        public C7976c() {
            this.f22740f = 1.0f;
        }
    }

    public HomeCardBottomOptButtons(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22717q = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.1
            {
                put("default", j760.m140076a("new_card_expand_undo.svga", "new_card_expand_undo.svga"));
            }
        };
        this.f22718r = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.2
            {
                put("default", j760.m140076a("new_card_expand_like.svga", "new_card_expand_like.svga"));
            }
        };
        this.f22719s = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.3
            {
                put("default", j760.m140076a("new_card_expand_dislike.svga", "new_card_expand_dislike.svga"));
            }
        };
        this.f22720t = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.4
            {
                put("default", j760.m140076a("new_card_expand_superlike.svga", "new_card_expand_superlike.svga"));
            }
        };
        this.f22721u = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.5
            {
                put("default", j760.m140076a("new_card_expand_match.svga", "new_card_expand_match.svga"));
            }
        };
        this.f22722v = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.6
            {
                put("default", j760.m140076a("new_card_expand_compliment.svga", "new_card_expand_compliment.svga"));
            }
        };
        this.f22723w = "default";
        this.f22724x = "unknown";
        this.f22725y = null;
        this.f22726z = new DecelerateInterpolator();
        this.f22687D = false;
        this.f22694K = 0.0f;
        this.f22695L = false;
        this.f22696M = -1;
        this.f22697N = new C7976c();
        this.f22698O = t100.m186890d(20.0f);
        this.f22699P = 0.0f;
        this.f22700Q = t100.m186890d(10.0f);
    }

    public HomeCardBottomOptButtons(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22717q = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.1
            {
                put("default", j760.m140076a("new_card_expand_undo.svga", "new_card_expand_undo.svga"));
            }
        };
        this.f22718r = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.2
            {
                put("default", j760.m140076a("new_card_expand_like.svga", "new_card_expand_like.svga"));
            }
        };
        this.f22719s = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.3
            {
                put("default", j760.m140076a("new_card_expand_dislike.svga", "new_card_expand_dislike.svga"));
            }
        };
        this.f22720t = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.4
            {
                put("default", j760.m140076a("new_card_expand_superlike.svga", "new_card_expand_superlike.svga"));
            }
        };
        this.f22721u = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.5
            {
                put("default", j760.m140076a("new_card_expand_match.svga", "new_card_expand_match.svga"));
            }
        };
        this.f22722v = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.6
            {
                put("default", j760.m140076a("new_card_expand_compliment.svga", "new_card_expand_compliment.svga"));
            }
        };
        this.f22723w = "default";
        this.f22724x = "unknown";
        this.f22725y = null;
        this.f22726z = new DecelerateInterpolator();
        this.f22687D = false;
        this.f22694K = 0.0f;
        this.f22695L = false;
        this.f22696M = -1;
        this.f22697N = new C7976c();
        this.f22698O = t100.m186890d(20.0f);
        this.f22699P = 0.0f;
        this.f22700Q = t100.m186890d(10.0f);
    }
}
