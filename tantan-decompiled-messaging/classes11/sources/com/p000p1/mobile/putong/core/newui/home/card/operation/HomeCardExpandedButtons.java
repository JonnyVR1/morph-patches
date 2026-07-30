package com.p000p1.mobile.putong.core.newui.home.card.operation;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.match.b;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.HashMap;
import l.bt0;
import l.j760;
import l.lsi0;
import l.o3l;
import l.ogl0;
import l.t100;
import l.upa;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.fm4;
import p009l.k3l;
import p009l.nsl;
import p009l.osl;
import p009l.ykf;
import v.VFrame_FlipContainer;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeCardExpandedButtons extends FrameLayout implements osl, Animator.AnimatorListener, ykf {

    /* JADX INFO: renamed from: C */
    public static int f1534C = t100.d(80.0f);

    /* JADX INFO: renamed from: A */
    public HashMap<String, j760<String, String>> f1535A;

    /* JADX INFO: renamed from: B */
    public HashMap<String, j760<String, String>> f1536B;

    /* JADX INFO: renamed from: a */
    public HomeCardExpandedButtons f1537a;

    /* JADX INFO: renamed from: b */
    public VRelative f1538b;

    /* JADX INFO: renamed from: c */
    public HomeCardExpandedOperationButton f1539c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f1540d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f1541e;

    /* JADX INFO: renamed from: f */
    public VFrame_FlipContainer f1542f;

    /* JADX INFO: renamed from: g */
    public HomeCardExpandedOperationButton f1543g;

    /* JADX INFO: renamed from: h */
    public VText f1544h;

    /* JADX INFO: renamed from: i */
    public HomeCardExpandedOperationButton f1545i;

    /* JADX INFO: renamed from: j */
    public HomeCardExpandedOperationButton f1546j;

    /* JADX INFO: renamed from: k */
    public VFrame_FlipContainer f1547k;

    /* JADX INFO: renamed from: l */
    public CardOperationButton f1548l;

    /* JADX INFO: renamed from: m */
    public VText f1549m;

    /* JADX INFO: renamed from: n */
    public VLinear f1550n;

    /* JADX INFO: renamed from: o */
    public String f1551o;

    /* JADX INFO: renamed from: p */
    public String f1552p;

    /* JADX INFO: renamed from: q */
    public Boolean f1553q;

    /* JADX INFO: renamed from: r */
    public Action1<String> f1554r;

    /* JADX INFO: renamed from: s */
    public final j760<String, String> f1555s;

    /* JADX INFO: renamed from: t */
    public final j760<String, String> f1556t;

    /* JADX INFO: renamed from: u */
    public final j760<String, String> f1557u;

    /* JADX INFO: renamed from: v */
    public final j760<String, String> f1558v;

    /* JADX INFO: renamed from: w */
    public final j760<String, String> f1559w;

    /* JADX INFO: renamed from: x */
    public final j760<String, String> f1560x;

    /* JADX INFO: renamed from: y */
    public HashMap<String, j760<String, String>> f1561y;

    /* JADX INFO: renamed from: z */
    public HashMap<String, j760<String, String>> f1562z;

    public HomeCardExpandedButtons(Context context) {
        super(context);
        this.f1551o = "default";
        this.f1552p = "unknown";
        this.f1553q = null;
        this.f1555s = j760.a(fm4.m14508f(), fm4.m14505c());
        this.f1556t = j760.a(fm4.m14507e(), fm4.m14504b());
        this.f1557u = j760.a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", fm4.m14506d());
        this.f1558v = j760.a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga");
        this.f1559w = j760.a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga");
        this.f1560x = j760.a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga");
        this.f1561y = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.1
            {
                put("default", HomeCardExpandedButtons.this.f1555s);
                put("oDiamond", HomeCardExpandedButtons.this.f1558v);
                put("supremePartner", j760.a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f1562z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.2
            {
                put("default", HomeCardExpandedButtons.this.f1556t);
                put("oDiamond", HomeCardExpandedButtons.this.f1559w);
                put("supremePartner", j760.a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f1535A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.3
            {
                put("default", HomeCardExpandedButtons.this.f1557u);
                put("oDiamond", HomeCardExpandedButtons.this.f1560x);
                put("supremePartner", j760.a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f1536B = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.4
            {
                put("default", j760.a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", j760.a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put("supremePartner", j760.a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }

    /* JADX INFO: renamed from: l */
    private void m2375l() {
        this.f1539c.bringToFront();
        xdl0.M(this.f1539c, ogl0.G());
        xdl0.X(this.f1540d, ogl0.G() ? t100.d(12.0f) : t100.d(20.0f));
        xdl0.X(this.f1545i, ogl0.G() ? t100.d(12.0f) : t100.d(20.0f));
        xdl0.X(this.f1546j, ogl0.G() ? t100.d(12.0f) : t100.d(20.0f));
    }

    /* JADX INFO: renamed from: p */
    private void m2376p() {
        if (TextUtils.equals(this.f1551o, this.f1552p)) {
            return;
        }
        if ("oDiamond".equals(this.f1551o)) {
            this.f1546j.setPlaceHolderPic(x2c0.k7);
            this.f1545i.setPlaceHolderPic(x2c0.l7);
            this.f1543g.setPlaceHolderPic(x2c0.n7);
            this.f1539c.setPlaceHolderPic(x2c0.m7);
        } else {
            boolean zEquals = "supremePartner".equals(this.f1551o);
            HomeCardExpandedOperationButton homeCardExpandedOperationButton = this.f1546j;
            if (zEquals) {
                homeCardExpandedOperationButton.setPlaceHolderPic(x2c0.s7);
                this.f1545i.setPlaceHolderPic(x2c0.t7);
                this.f1543g.setPlaceHolderPic(x2c0.u7);
                this.f1539c.setPlaceHolderPic(x2c0.r7);
            } else {
                homeCardExpandedOperationButton.setPlaceHolderPic(x2c0.g7);
                this.f1545i.setPlaceHolderPic(x2c0.h7);
                this.f1543g.setPlaceHolderPic(x2c0.j7);
                this.f1539c.setPlaceHolderPic(x2c0.i7);
            }
        }
        this.f1545i.m2402l((String) this.f1561y.get(this.f1551o).a, (String) this.f1561y.get(this.f1551o).b);
        this.f1546j.m2402l((String) this.f1562z.get(this.f1551o).a, (String) this.f1562z.get(this.f1551o).b);
        this.f1543g.m2402l((String) this.f1535A.get(this.f1551o).a, (String) this.f1535A.get(this.f1551o).b);
        this.f1539c.m2402l((String) this.f1536B.get(this.f1551o).a, (String) this.f1536B.get(this.f1551o).b);
        this.f1552p = this.f1551o;
    }

    /* JADX INFO: renamed from: q */
    private void m2377q() {
        if (NullChecker.a(this.f1553q)) {
            k3l.INSTANCE.m17283a(getContext(), getSuperLikeComboSvga(), this.f1551o, this.f1553q.booleanValue());
        }
    }

    private void setSwipeAnimEnable(boolean z) {
        HomeCardExpandedOperationButton homeCardExpandedOperationButton = this.f1545i;
        if (z) {
            homeCardExpandedOperationButton.setSwipeEnable(true);
            this.f1546j.setSwipeEnable(true);
        } else {
            homeCardExpandedOperationButton.setSwipeEnable(false);
            this.f1546j.setSwipeEnable(false);
        }
    }

    @Override // p009l.osl
    public int getButtonRadius() {
        return t100.d(27.0f);
    }

    @Override // p009l.osl
    public ViewGroup getButtonRootLayout() {
        return this;
    }

    @Override // p009l.osl
    public int getButtonScrolledDistance() {
        return f1534C;
    }

    @Override // p009l.osl
    @Nullable
    public View getButtonsRightLayout() {
        return this.f1538b;
    }

    @Override // p009l.osl
    public nsl getDislikeBtn() {
        return this.f1546j;
    }

    @Override // p009l.osl
    public int getDislikePressBg() {
        return x2c0.i4;
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyAndSuperLikeLayout() {
        return super.getImmediatelyAndSuperLikeLayout();
    }

    @Override // p009l.osl
    @Nullable
    public View getImmediatelyMatch() {
        return this.f1550n;
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ nsl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    public View getImmediatelyMatchTop() {
        return this.f1539c;
    }

    @Override // p009l.osl
    public nsl getLikeBtn() {
        return this.f1545i;
    }

    @Override // p009l.osl
    public int getLikePressBg() {
        return x2c0.t2;
    }

    @Override // p009l.osl
    public int getNormalBg() {
        return x2c0.Y1;
    }

    @Override // p009l.osl
    public int getOperationBtnBg() {
        return x2c0.Y1;
    }

    @Override // p009l.osl
    @Nullable
    public VImage getPinImage() {
        return null;
    }

    public View getPinLikeLayout() {
        return null;
    }

    @Override // p009l.osl
    @Nullable
    public VText getPinText() {
        return null;
    }

    @Override // p009l.osl
    public FrameLayout.LayoutParams getRootBtnLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.gravity = 85;
        return layoutParams;
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getSayHiNewLayout() {
        return super.getSayHiNewLayout();
    }

    @Override // p009l.osl
    public nsl getSuperLike() {
        return this.f1543g;
    }

    @Override // p009l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f1541e;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f1542f;
    }

    @Override // p009l.osl
    public int getSuperLikePressBg() {
        return x2c0.p3;
    }

    @Override // p009l.osl
    public VText getSuperLikeRemaining() {
        return this.f1544h;
    }

    @Override // p009l.osl
    public View getSuperLikeWarpLayout() {
        return this.f1540d;
    }

    @Override // p009l.osl
    @Nullable
    public nsl getUndo() {
        return this.f1548l;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f1547k;
    }

    @Override // p009l.osl
    public int getUndoPressBg() {
        return x2c0.i4;
    }

    /* JADX INFO: renamed from: k */
    public final void m2378k(View view) {
        o3l.a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final void m2379m() {
        xdl0.E0(this.f1550n, new View.OnClickListener() { // from class: l.m3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16493a.m2380n(view);
            }
        });
        xdl0.E0(this.f1539c, new View.OnClickListener() { // from class: l.n3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17221a.m2381o(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m2380n(View view) {
        if (NullChecker.a(this.f1554r)) {
            if (upa.K1() && CoreModule.c.z2.r3()) {
                lsi0.y("只看认证用户试用期间无法使用一键配对功能");
            } else {
                this.f1554r.call("p_home,odiamond_sayhi");
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m2381o(View view) {
        if (upa.K1() && CoreModule.c.z2.r3()) {
            lsi0.y("只看认证用户试用期间无法使用一键配对功能");
        } else if (NullChecker.a(this.f1554r) && xdl0.O0(this.f1539c)) {
            this.f1554r.call("p_home,odiamond_sayhi");
            zvf0.r("e_odiamond_sayhi", "p_suggest_users_home_view");
        }
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

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2378k(this);
        xdl0.c0(this.f1538b, t100.d(86.0f));
        this.f1537a.setClickable(false);
        this.f1548l.setShadowSize(t100.d(2.0f));
        setSwipeAnimEnable(true);
        this.f1545i.setShowLog(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(0L);
        layoutTransition.setDuration(0, 150L);
        layoutTransition.setDuration(1, 150L);
        setLayoutTransition(layoutTransition);
        m2379m();
        m2375l();
        m2376p();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() != 1.0f) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public void m2382r() {
        a aVar = new a(getContext());
        d.l().k("bubble_odiamond_immediate_match_guide");
        aVar.B(t100.d(2.0f)).D("无需配对，直接开聊").k(new int[]{getContext().getResources().getColor(w0c0.I)}).J(13.0f).l(t100.d(7.0f)).p(75).x(t100.d(-4.0f)).o(a.P, t100.d(20.0f)).b(8000L).q(a.Q | a.P);
        d.l().u(aVar, this.f1539c, "bubble_odiamond_immediate_match_guide");
    }

    /* JADX INFO: renamed from: s */
    public void m2383s() {
        if (!ogl0.G() || b.q().p() <= 7 || ((Boolean) CoreModule.c.e0.A6.get()).booleanValue()) {
            return;
        }
        m2382r();
        CoreModule.c.e0.A6.put(Boolean.TRUE);
    }

    @Override // p009l.osl
    public void setButtonStyleType(String str) {
        this.f1551o = str;
        m2376p();
        m2377q();
        m2383s();
    }

    @Override // p009l.ykf
    public void setImmediateleMatchClickListener(Action1<String> action1) {
        this.f1554r = action1;
    }

    @Override // p009l.osl
    public void setSuperLikeBtnGray(boolean z) {
        HomeCardExpandedOperationButton homeCardExpandedOperationButton = this.f1543g;
        if (homeCardExpandedOperationButton != null) {
            homeCardExpandedOperationButton.setCoverDrawable(z ? x2c0.q7 : 0);
        }
    }

    @Override // p009l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f1553q = Boolean.valueOf(z);
        m2377q();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 0) {
            super.setVisibility(i);
            if (getAlpha() == 1.0f) {
                return;
            }
        }
        Animator animatorN = bt0.n(this, View.ALPHA, new float[]{getAlpha(), i == 8 ? 0.0f : 1.0f});
        animatorN.setDuration(150L);
        if (i == 8) {
            animatorN.addListener(this);
        }
        animatorN.start();
    }

    public HomeCardExpandedButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1551o = "default";
        this.f1552p = "unknown";
        this.f1553q = null;
        this.f1555s = j760.a(fm4.m14508f(), fm4.m14505c());
        this.f1556t = j760.a(fm4.m14507e(), fm4.m14504b());
        this.f1557u = j760.a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", fm4.m14506d());
        this.f1558v = j760.a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga");
        this.f1559w = j760.a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga");
        this.f1560x = j760.a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga");
        this.f1561y = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.1
            {
                put("default", HomeCardExpandedButtons.this.f1555s);
                put("oDiamond", HomeCardExpandedButtons.this.f1558v);
                put("supremePartner", j760.a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f1562z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.2
            {
                put("default", HomeCardExpandedButtons.this.f1556t);
                put("oDiamond", HomeCardExpandedButtons.this.f1559w);
                put("supremePartner", j760.a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f1535A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.3
            {
                put("default", HomeCardExpandedButtons.this.f1557u);
                put("oDiamond", HomeCardExpandedButtons.this.f1560x);
                put("supremePartner", j760.a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f1536B = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.4
            {
                put("default", j760.a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", j760.a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put("supremePartner", j760.a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }

    public HomeCardExpandedButtons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1551o = "default";
        this.f1552p = "unknown";
        this.f1553q = null;
        this.f1555s = j760.a(fm4.m14508f(), fm4.m14505c());
        this.f1556t = j760.a(fm4.m14507e(), fm4.m14504b());
        this.f1557u = j760.a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", fm4.m14506d());
        this.f1558v = j760.a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga");
        this.f1559w = j760.a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga");
        this.f1560x = j760.a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga");
        this.f1561y = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.1
            {
                put("default", HomeCardExpandedButtons.this.f1555s);
                put("oDiamond", HomeCardExpandedButtons.this.f1558v);
                put("supremePartner", j760.a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f1562z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.2
            {
                put("default", HomeCardExpandedButtons.this.f1556t);
                put("oDiamond", HomeCardExpandedButtons.this.f1559w);
                put("supremePartner", j760.a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f1535A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.3
            {
                put("default", HomeCardExpandedButtons.this.f1557u);
                put("oDiamond", HomeCardExpandedButtons.this.f1560x);
                put("supremePartner", j760.a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f1536B = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.4
            {
                put("default", j760.a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", j760.a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put("supremePartner", j760.a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }
}
