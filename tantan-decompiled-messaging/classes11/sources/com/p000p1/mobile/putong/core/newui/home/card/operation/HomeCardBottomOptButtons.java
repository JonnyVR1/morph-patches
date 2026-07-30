package com.p000p1.mobile.putong.core.newui.home.card.operation;

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
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.card.operation.view.HomeButtonHookLayout;
import com.p000p1.mobile.putong.core.newui.home.card.operation.view.UndoTestLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.HashMap;
import l.co5;
import l.j3l;
import l.j760;
import l.q89;
import l.t100;
import l.xdl0;
import l.xma;
import l.zvf0;
import p009l.nsl;
import p009l.osl;
import p009l.ykf;
import v.VFrame;
import v.VFrame_FlipContainer;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeCardBottomOptButtons extends FrameLayout implements osl, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, ykf {

    /* JADX INFO: renamed from: R */
    public static final int f1456R = t100.d(80.0f);

    /* JADX INFO: renamed from: S */
    public static final int f1457S = t100.d(130.0f);

    /* JADX INFO: renamed from: T */
    public static final int f1458T = t100.d(50.0f);

    /* JADX INFO: renamed from: U */
    public static final int f1459U = t100.d(72.0f);

    /* JADX INFO: renamed from: V */
    public static final int f1460V = t100.d(64.0f);

    /* JADX INFO: renamed from: W */
    public static final int f1461W = t100.d(84.0f);

    /* JADX INFO: renamed from: A */
    public Action1<String> f1462A;

    /* JADX INFO: renamed from: B */
    public Action1<User> f1463B;

    /* JADX INFO: renamed from: C */
    public User f1464C;

    /* JADX INFO: renamed from: D */
    public boolean f1465D;

    /* JADX INFO: renamed from: E */
    public C0139b f1466E;

    /* JADX INFO: renamed from: F */
    public C0139b f1467F;

    /* JADX INFO: renamed from: G */
    public C0139b f1468G;

    /* JADX INFO: renamed from: H */
    public C0139b f1469H;

    /* JADX INFO: renamed from: I */
    public C0139b f1470I;

    /* JADX INFO: renamed from: J */
    public ValueAnimator f1471J;

    /* JADX INFO: renamed from: K */
    public float f1472K;

    /* JADX INFO: renamed from: L */
    public boolean f1473L;

    /* JADX INFO: renamed from: M */
    public int f1474M;

    /* JADX INFO: renamed from: N */
    public C0140c f1475N;

    /* JADX INFO: renamed from: O */
    public float f1476O;

    /* JADX INFO: renamed from: P */
    public float f1477P;

    /* JADX INFO: renamed from: Q */
    public float f1478Q;

    /* JADX INFO: renamed from: a */
    public HomeCardBottomOptButtons f1479a;

    /* JADX INFO: renamed from: b */
    public VFrame f1480b;

    /* JADX INFO: renamed from: c */
    public HomeButtonHookLayout f1481c;

    /* JADX INFO: renamed from: d */
    public UndoTestLayout f1482d;

    /* JADX INFO: renamed from: e */
    public HomeCardExpandedOptButton f1483e;

    /* JADX INFO: renamed from: f */
    public VText f1484f;

    /* JADX INFO: renamed from: g */
    public HomeCardExpandedOptButton f1485g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f1486h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f1487i;

    /* JADX INFO: renamed from: j */
    public VFrame_FlipContainer f1488j;

    /* JADX INFO: renamed from: k */
    public HomeCardExpandedOptButton f1489k;

    /* JADX INFO: renamed from: l */
    public VText f1490l;

    /* JADX INFO: renamed from: m */
    public HomeCardExpandedOptButton f1491m;

    /* JADX INFO: renamed from: n */
    public HomeCardExpandedOptButton f1492n;

    /* JADX INFO: renamed from: o */
    public HomeCardExpandedOptButton f1493o;

    /* JADX INFO: renamed from: p */
    public VLinear f1494p;

    /* JADX INFO: renamed from: q */
    public final HashMap<String, j760<String, String>> f1495q;

    /* JADX INFO: renamed from: r */
    public final HashMap<String, j760<String, String>> f1496r;

    /* JADX INFO: renamed from: s */
    public final HashMap<String, j760<String, String>> f1497s;

    /* JADX INFO: renamed from: t */
    public final HashMap<String, j760<String, String>> f1498t;

    /* JADX INFO: renamed from: u */
    public HashMap<String, j760<String, String>> f1499u;

    /* JADX INFO: renamed from: v */
    public HashMap<String, j760<String, String>> f1500v;

    /* JADX INFO: renamed from: w */
    public String f1501w;

    /* JADX INFO: renamed from: x */
    public String f1502x;

    /* JADX INFO: renamed from: y */
    public Boolean f1503y;

    /* JADX INFO: renamed from: z */
    public TimeInterpolator f1504z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons$a */
    public class C0138a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f1505a;

        public C0138a(boolean z) {
            this.f1505a = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
            HomeCardBottomOptButtons.this.f1473L = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            HomeCardBottomOptButtons.this.f1473L = false;
            HomeCardBottomOptButtons.this.mo2349b(this.f1505a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons$b */
    public static class C0139b {

        /* JADX INFO: renamed from: a */
        public C0140c f1507a;

        /* JADX INFO: renamed from: b */
        public C0140c f1508b;

        /* JADX INFO: renamed from: c */
        public C0140c f1509c;

        /* JADX INFO: renamed from: d */
        public C0140c f1510d;

        /* JADX INFO: renamed from: e */
        public C0140c f1511e;

        /* JADX INFO: renamed from: f */
        public C0140c f1512f;

        public C0139b(boolean z) {
            if (z) {
                this.f1507a = new C0140c();
                this.f1508b = new C0140c();
                this.f1510d = new C0140c();
                this.f1509c = new C0140c();
                this.f1511e = new C0140c();
                this.f1512f = new C0140c();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m2360a(C0139b c0139b) {
            this.f1507a.m2362a(c0139b.f1507a);
            this.f1508b.m2362a(c0139b.f1508b);
            this.f1510d.m2362a(c0139b.f1510d);
            this.f1509c.m2362a(c0139b.f1509c);
            this.f1511e.m2362a(c0139b.f1511e);
            this.f1512f.m2362a(c0139b.f1512f);
        }

        /* JADX INFO: renamed from: b */
        public boolean m2361b(C0139b c0139b) {
            return c0139b.f1507a.m2363b(this.f1507a) && c0139b.f1508b.m2363b(this.f1508b) && c0139b.f1510d.m2363b(this.f1510d) && c0139b.f1509c.m2363b(this.f1509c) && c0139b.f1511e.m2363b(this.f1511e) && c0139b.f1512f.m2363b(this.f1512f);
        }
    }

    public HomeCardBottomOptButtons(@NonNull Context context) {
        super(context);
        this.f1495q = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.1
            {
                put("default", j760.a("new_card_expand_undo.svga", "new_card_expand_undo.svga"));
            }
        };
        this.f1496r = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.2
            {
                put("default", j760.a("new_card_expand_like.svga", "new_card_expand_like.svga"));
            }
        };
        this.f1497s = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.3
            {
                put("default", j760.a("new_card_expand_dislike.svga", "new_card_expand_dislike.svga"));
            }
        };
        this.f1498t = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.4
            {
                put("default", j760.a("new_card_expand_superlike.svga", "new_card_expand_superlike.svga"));
            }
        };
        this.f1499u = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.5
            {
                put("default", j760.a("new_card_expand_match.svga", "new_card_expand_match.svga"));
            }
        };
        this.f1500v = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.6
            {
                put("default", j760.a("new_card_expand_compliment.svga", "new_card_expand_compliment.svga"));
            }
        };
        this.f1501w = "default";
        this.f1502x = "unknown";
        this.f1503y = null;
        this.f1504z = new DecelerateInterpolator();
        this.f1465D = false;
        this.f1472K = 0.0f;
        this.f1473L = false;
        this.f1474M = -1;
        this.f1475N = new C0140c();
        this.f1476O = t100.d(20.0f);
        this.f1477P = 0.0f;
        this.f1478Q = t100.d(10.0f);
    }

    private int getComplimentStock() {
        return xma.m3();
    }

    /* JADX INFO: renamed from: j */
    private void m2342j() {
        xdl0.E0(this.f1494p, new View.OnClickListener() { // from class: l.f3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12762a.m2343k(view);
            }
        });
        xdl0.E0(this.f1492n, new View.OnClickListener() { // from class: l.g3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13300a.m2344l(view);
            }
        });
        xdl0.E0(this.f1493o, new View.OnClickListener() { // from class: l.h3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13851a.m2345m(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m2343k(View view) {
        zvf0.r("e_intl_instantmatch_btn", "p_suggest_user_profile_info_view");
        if (NullChecker.a(this.f1462A)) {
            this.f1462A.call("p_suggest_user_profile_info_view,e_intl_instantmatch_btn,click");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m2344l(View view) {
        zvf0.r("e_intl_instantmatch_btn", "p_suggest_users_home_view");
        if (NullChecker.a(this.f1462A)) {
            this.f1462A.call("p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m2345m(View view) {
        zvf0.r("e_compliment_home_card", "p_suggest_users_home_view");
        if (NullChecker.a(this.f1463B) && NullChecker.a(this.f1464C)) {
            this.f1463B.call(this.f1464C);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m2346p() {
        if (NullChecker.a(this.f1503y)) {
            SVGALoader.with(getContext()).from(this.f1503y.booleanValue() ? "https://auto.tancdn.com/v1/raw/02f79ff2-ea08-4696-9df5-d227b6fa4f2d12.pdf" : "https://auto.tancdn.com/v1/raw/9a957b00-c134-4bf0-8dfd-1cdff0f4ec7513.pdf").autoPlay(true).repeatCount(-1).into(getSuperLikeComboSvga());
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m2347r(User user) {
        q89 q89Var;
        if (xma.C3()) {
            return false;
        }
        if (!xma.e4() && xma.m3() == 0) {
            return false;
        }
        try {
            c cVar = CoreModule.c;
            return cVar == null || (q89Var = cVar.p0) == null || q89Var.S <= q89Var.T;
        } catch (Exception e) {
            CrashHelper.c(e);
            return true;
        }
    }

    private void setSwipeAnimEnable(boolean z) {
        HomeCardExpandedOptButton homeCardExpandedOptButton = this.f1491m;
        if (z) {
            homeCardExpandedOptButton.setSwipeEnable(true);
            this.f1485g.setSwipeEnable(true);
            this.f1489k.setSwipeEnable(true);
        } else {
            homeCardExpandedOptButton.setSwipeEnable(false);
            this.f1485g.setSwipeEnable(false);
            this.f1489k.setSwipeEnable(false);
        }
    }

    @Override // p009l.osl
    /* JADX INFO: renamed from: a */
    public void mo2348a(boolean z, User user, CoreSuggested.UserInfo userInfo) {
        ValueAnimator valueAnimator = this.f1471J;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f1471J.cancel();
        }
        this.f1473L = true;
        if (z) {
            this.f1471J = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f1469H.m2360a(this.f1470I);
        } else {
            this.f1471J = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f1468G.m2360a(this.f1470I);
        }
        this.f1471J.setInterpolator(this.f1504z);
        m2356s(z);
        xdl0.M0(this.f1480b, z);
    }

    @Override // p009l.osl
    /* JADX INFO: renamed from: b */
    public void mo2349b(boolean z) {
        if (z) {
            return;
        }
        if (!this.f1470I.m2361b(this.f1466E)) {
            this.f1466E.m2360a(this.f1470I);
            m2355q(this.f1470I);
        }
        xdl0.M0(this.f1480b, false);
        if (NullChecker.a(this.f1464C)) {
            m2358u(this.f1464C);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2350g(View view) {
        j3l.a(this, view);
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getButtonRadius() {
        return super.getButtonRadius();
    }

    @Override // p009l.osl
    public ViewGroup getButtonRootLayout() {
        return this;
    }

    @Override // p009l.osl
    public int getButtonScrolledDistance() {
        return f1456R;
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getButtonsRightLayout() {
        return super.getButtonsRightLayout();
    }

    @Override // p009l.osl
    public nsl getDislikeBtn() {
        return this.f1485g;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getDislikePressBg() {
        return super.getDislikePressBg();
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyAndSuperLikeLayout() {
        return super.getImmediatelyAndSuperLikeLayout();
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyMatch() {
        return super.getImmediatelyMatch();
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ nsl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    public View getImmediatelyMatchTop() {
        return this.f1494p;
    }

    @Override // p009l.osl
    public nsl getLikeBtn() {
        return this.f1491m;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getLikePressBg() {
        return super.getLikePressBg();
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getNormalBg() {
        return super.getNormalBg();
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getOperationBtnBg() {
        return super.getOperationBtnBg();
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ VImage getPinImage() {
        return super.getPinImage();
    }

    @Nullable
    public View getPinLikeLayout() {
        return null;
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ VText getPinText() {
        return super.getPinText();
    }

    @Override // p009l.osl
    public FrameLayout.LayoutParams getRootBtnLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, t100.d(198.0f));
        layoutParams.gravity = 81;
        return layoutParams;
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getSayHiNewLayout() {
        return super.getSayHiNewLayout();
    }

    @Override // p009l.osl
    public nsl getSuperLike() {
        return this.f1489k;
    }

    @Override // p009l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f1487i;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f1488j;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p009l.osl
    public VText getSuperLikeRemaining() {
        return this.f1490l;
    }

    @Override // p009l.osl
    public View getSuperLikeWarpLayout() {
        return this.f1486h;
    }

    @Override // p009l.osl
    @Nullable
    public nsl getUndo() {
        return this.f1483e;
    }

    @Override // p009l.osl
    @Nullable
    public VFrame_FlipContainer getUndoLayout() {
        return this.f1482d;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    /* JADX INFO: renamed from: h */
    public final C0140c m2351h(C0140c c0140c, C0140c c0140c2, float f) {
        C0140c c0140c3 = this.f1475N;
        int i = c0140c.f1513a;
        int i2 = i + ((int) ((c0140c2.f1513a - i) * f));
        int i3 = c0140c.f1514b;
        int i4 = i3 + ((int) ((c0140c2.f1514b - i3) * f));
        float f2 = c0140c.f1515c;
        float f3 = f2 + ((c0140c2.f1515c - f2) * f);
        float f4 = c0140c.f1516d;
        float f5 = f4 + ((c0140c2.f1516d - f4) * f);
        float f6 = c0140c.f1517e;
        float f7 = f6 + ((c0140c2.f1517e - f6) * f);
        float f8 = c0140c.f1518f;
        c0140c3.m2364c(i2, i4, f3, f5, f7, f8 + ((c0140c2.f1518f - f8) * f));
        return this.f1475N;
    }

    /* JADX INFO: renamed from: i */
    public final void m2352i() {
        C0139b c0139b = new C0139b(false);
        this.f1466E = c0139b;
        int i = f1460V;
        c0139b.f1507a = new C0140c(i, i, 1.0f, -t100.d(140.0f), t100.d(7.0f));
        C0139b c0139b2 = this.f1466E;
        int i2 = f1461W;
        c0139b2.f1508b = new C0140c(i2, i2, 1.0f, -t100.d(69.0f), 0.0f);
        this.f1466E.f1509c = new C0140c(i, i, 1.0f, t100.d(0.0f), t100.d(7.0f));
        this.f1466E.f1510d = new C0140c(i2, i2, 1.0f, t100.d(69.0f), 0.0f);
        this.f1466E.f1511e = new C0140c(i, i, 1.0f, t100.d(140.0f), t100.d(7.0f));
        this.f1466E.f1512f = new C0140c(i, i, 0.0f, t100.d(140.0f), t100.d(7.0f));
        int iY0 = xdl0.y0();
        int i3 = f1459U;
        int i4 = f1457S;
        float f = ((iY0 - (i3 * 3)) - i4) / 2.0f;
        this.f1476O = f;
        if (f < t100.i) {
            float f2 = t100.e;
            this.f1477P = f2;
            this.f1476O = (((iY0 - (i3 * 3)) - i4) + (f2 * 3.0f)) / 2.0f;
        }
        C0139b c0139b3 = new C0139b(false);
        this.f1467F = c0139b3;
        c0139b3.f1507a = new C0140c(i3, i3, 0.0f, -t100.d(120.0f), t100.d(62.0f));
        float f3 = (-iY0) / 2.0f;
        this.f1467F.f1508b = new C0140c(i3, i3, 1.0f, (((i3 * 0.5f) + f3) + this.f1476O) - this.f1478Q, t100.d(62.0f));
        this.f1467F.f1509c = new C0140c(i3, i3, 1.0f, ((((i3 * 1.5f) + f3) + this.f1476O) - this.f1478Q) - this.f1477P, t100.d(62.0f));
        this.f1467F.f1510d = new C0140c(i3, i3, 1.0f, ((((i3 * 2.5f) + f3) + this.f1476O) - this.f1478Q) - (this.f1477P * 2.0f), t100.d(62.0f));
        this.f1467F.f1511e = new C0140c(i3, i3, 0.0f, t100.d(120.0f), t100.d(62.0f));
        this.f1467F.f1512f = new C0140c(i4, f1458T, 1.0f, (((f3 + (i3 * 3.0f)) + this.f1476O) + (i4 / 2.0f)) - (this.f1477P * 3.0f), t100.d(73.0f));
        this.f1468G = new C0139b(true);
        this.f1469H = new C0139b(true);
        this.f1470I = new C0139b(true);
        this.f1466E.m2360a(this.f1468G);
        this.f1467F.m2360a(this.f1469H);
        this.f1468G.m2360a(this.f1470I);
    }

    /* JADX INFO: renamed from: n */
    public final void m2353n(float f) {
        m2357t(this.f1482d, m2351h(this.f1468G.f1507a, this.f1469H.f1507a, f));
        m2357t(this.f1485g, m2351h(this.f1468G.f1508b, this.f1469H.f1508b, f));
        m2357t(this.f1491m, m2351h(this.f1468G.f1510d, this.f1469H.f1510d, f));
        m2357t(this.f1486h, m2351h(this.f1468G.f1509c, this.f1469H.f1509c, f));
        C0140c c0140cM2351h = m2351h(this.f1468G.f1511e, this.f1469H.f1511e, f);
        m2357t(this.f1492n, c0140cM2351h);
        m2357t(this.f1493o, c0140cM2351h);
        m2357t(this.f1494p, m2351h(this.f1468G.f1512f, this.f1469H.f1512f, f));
    }

    /* JADX INFO: renamed from: o */
    public final void m2354o() {
        this.f1483e.m2428l((String) this.f1495q.get(this.f1501w).a, (String) this.f1495q.get(this.f1501w).b);
        this.f1491m.m2428l((String) this.f1496r.get(this.f1501w).a, (String) this.f1496r.get(this.f1501w).b);
        this.f1485g.m2428l((String) this.f1497s.get(this.f1501w).a, (String) this.f1497s.get(this.f1501w).b);
        this.f1489k.m2428l((String) this.f1498t.get(this.f1501w).a, (String) this.f1498t.get(this.f1501w).b);
        this.f1492n.m2428l((String) this.f1499u.get(this.f1501w).a, (String) this.f1499u.get(this.f1501w).b);
        this.f1493o.m2428l((String) this.f1500v.get(this.f1501w).a, (String) this.f1500v.get(this.f1501w).b);
        this.f1502x = this.f1501w;
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
        this.f1472K = fFloatValue;
        m2353n(fFloatValue);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2350g(this);
        m2352i();
        this.f1479a.setClickable(false);
        setSwipeAnimEnable(true);
        m2354o();
        m2342j();
        m2353n(0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.f1474M != size) {
            this.f1474M = size;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m2355q(C0139b c0139b) {
        m2357t(this.f1482d, c0139b.f1507a);
        m2357t(this.f1485g, c0139b.f1508b);
        m2357t(this.f1491m, c0139b.f1510d);
        m2357t(this.f1486h, c0139b.f1509c);
        m2357t(this.f1492n, c0139b.f1511e);
        m2357t(this.f1493o, c0139b.f1511e);
        m2357t(this.f1494p, c0139b.f1512f);
    }

    /* JADX INFO: renamed from: s */
    public final void m2356s(boolean z) {
        this.f1471J.setDuration(ExpandedCardStyleHelper.f1185h);
        this.f1471J.addUpdateListener(this);
        this.f1471J.addListener(new C0138a(z));
        this.f1471J.start();
    }

    @Override // p009l.osl
    public void setButtonStyleType(String str) {
        this.f1501w = str;
        m2354o();
        m2346p();
    }

    public void setComplimentClickListener(Action1<User> action1) {
        this.f1463B = action1;
    }

    @Override // p009l.ykf
    public void setImmediateleMatchClickListener(Action1<String> action1) {
        this.f1462A = action1;
    }

    @Override // p009l.osl
    public void setSuperLikeBtnGray(boolean z) {
        this.f1465D = z;
    }

    @Override // p009l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f1503y = Boolean.valueOf(z);
        m2346p();
    }

    /* JADX INFO: renamed from: t */
    public final void m2357t(View view, C0140c c0140c) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = c0140c.f1513a;
        marginLayoutParams.height = c0140c.f1514b;
        view.setLayoutParams(marginLayoutParams);
        view.setAlpha(c0140c.f1515c);
        view.setTranslationX(c0140c.f1516d);
        view.setTranslationY(c0140c.f1517e);
        view.setScaleX(c0140c.f1518f);
        view.setScaleY(c0140c.f1518f);
        if (view != this.f1492n && view != this.f1493o) {
            if (c0140c.f1515c == 0.0f) {
                xdl0.M(view, false);
                return;
            } else {
                xdl0.M(view, true);
                return;
            }
        }
        if (c0140c.f1515c == 0.0f) {
            xdl0.M(view, false);
        } else if (NullChecker.a(this.f1464C)) {
            m2358u(this.f1464C);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m2358u(User user) {
        m2359v(user, "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: v */
    public void m2359v(User user, String str) {
        this.f1464C = user;
        if (!m2347r(user)) {
            xdl0.M(this.f1492n, true);
            xdl0.M(this.f1493o, false);
            return;
        }
        String strA = co5.a("home_card_compliment_btn");
        if (!TextUtils.isEmpty(strA)) {
            co5.f(str, strA);
        }
        xdl0.M(this.f1493o, true);
        xdl0.M(this.f1492n, false);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons$c */
    public static class C0140c {

        /* JADX INFO: renamed from: a */
        public int f1513a;

        /* JADX INFO: renamed from: b */
        public int f1514b;

        /* JADX INFO: renamed from: c */
        public float f1515c;

        /* JADX INFO: renamed from: d */
        public float f1516d;

        /* JADX INFO: renamed from: e */
        public float f1517e;

        /* JADX INFO: renamed from: f */
        public float f1518f;

        public C0140c(int i, int i2, float f, float f2, float f3) {
            this.f1513a = i;
            this.f1514b = i2;
            this.f1516d = f2;
            this.f1515c = f;
            this.f1517e = f3;
            this.f1518f = 1.0f;
        }

        /* JADX INFO: renamed from: a */
        public void m2362a(C0140c c0140c) {
            c0140c.f1513a = this.f1513a;
            c0140c.f1514b = this.f1514b;
            c0140c.f1515c = this.f1515c;
            c0140c.f1516d = this.f1516d;
            c0140c.f1517e = this.f1517e;
            c0140c.f1518f = this.f1518f;
        }

        /* JADX INFO: renamed from: b */
        public boolean m2363b(C0140c c0140c) {
            return c0140c.f1514b == this.f1514b && c0140c.f1513a == this.f1513a && c0140c.f1515c == this.f1515c && c0140c.f1516d == this.f1516d && c0140c.f1518f == this.f1518f && c0140c.f1517e == this.f1517e;
        }

        /* JADX INFO: renamed from: c */
        public void m2364c(int i, int i2, float f, float f2, float f3, float f4) {
            this.f1513a = i;
            this.f1514b = i2;
            this.f1515c = f;
            this.f1516d = f2;
            this.f1517e = f3;
            this.f1518f = f4;
        }

        public C0140c() {
            this.f1518f = 1.0f;
        }
    }

    public HomeCardBottomOptButtons(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1495q = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.1
            {
                put("default", j760.a("new_card_expand_undo.svga", "new_card_expand_undo.svga"));
            }
        };
        this.f1496r = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.2
            {
                put("default", j760.a("new_card_expand_like.svga", "new_card_expand_like.svga"));
            }
        };
        this.f1497s = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.3
            {
                put("default", j760.a("new_card_expand_dislike.svga", "new_card_expand_dislike.svga"));
            }
        };
        this.f1498t = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.4
            {
                put("default", j760.a("new_card_expand_superlike.svga", "new_card_expand_superlike.svga"));
            }
        };
        this.f1499u = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.5
            {
                put("default", j760.a("new_card_expand_match.svga", "new_card_expand_match.svga"));
            }
        };
        this.f1500v = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.6
            {
                put("default", j760.a("new_card_expand_compliment.svga", "new_card_expand_compliment.svga"));
            }
        };
        this.f1501w = "default";
        this.f1502x = "unknown";
        this.f1503y = null;
        this.f1504z = new DecelerateInterpolator();
        this.f1465D = false;
        this.f1472K = 0.0f;
        this.f1473L = false;
        this.f1474M = -1;
        this.f1475N = new C0140c();
        this.f1476O = t100.d(20.0f);
        this.f1477P = 0.0f;
        this.f1478Q = t100.d(10.0f);
    }

    public HomeCardBottomOptButtons(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1495q = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.1
            {
                put("default", j760.a("new_card_expand_undo.svga", "new_card_expand_undo.svga"));
            }
        };
        this.f1496r = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.2
            {
                put("default", j760.a("new_card_expand_like.svga", "new_card_expand_like.svga"));
            }
        };
        this.f1497s = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.3
            {
                put("default", j760.a("new_card_expand_dislike.svga", "new_card_expand_dislike.svga"));
            }
        };
        this.f1498t = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.4
            {
                put("default", j760.a("new_card_expand_superlike.svga", "new_card_expand_superlike.svga"));
            }
        };
        this.f1499u = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.5
            {
                put("default", j760.a("new_card_expand_match.svga", "new_card_expand_match.svga"));
            }
        };
        this.f1500v = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons.6
            {
                put("default", j760.a("new_card_expand_compliment.svga", "new_card_expand_compliment.svga"));
            }
        };
        this.f1501w = "default";
        this.f1502x = "unknown";
        this.f1503y = null;
        this.f1504z = new DecelerateInterpolator();
        this.f1465D = false;
        this.f1472K = 0.0f;
        this.f1473L = false;
        this.f1474M = -1;
        this.f1475N = new C0140c();
        this.f1476O = t100.d(20.0f);
        this.f1477P = 0.0f;
        this.f1478Q = t100.d(10.0f);
    }
}
