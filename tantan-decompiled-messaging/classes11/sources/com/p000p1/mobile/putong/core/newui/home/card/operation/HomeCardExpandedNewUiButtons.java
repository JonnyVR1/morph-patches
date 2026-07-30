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
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.HashMap;
import l.bt0;
import l.j760;
import l.lsi0;
import l.ogl0;
import l.s3l;
import l.t100;
import l.upa;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.fm4;
import p009l.nsl;
import p009l.osl;
import p009l.ykf;
import v.VFrame_FlipContainer;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeCardExpandedNewUiButtons extends FrameLayout implements osl, Animator.AnimatorListener, ykf {

    /* JADX INFO: renamed from: w */
    public static final int f1563w = t100.d(80.0f);

    /* JADX INFO: renamed from: a */
    public HomeCardExpandedNewUiButtons f1564a;

    /* JADX INFO: renamed from: b */
    public VRelative f1565b;

    /* JADX INFO: renamed from: c */
    public HomeCardExpandedOperationNewUiButton f1566c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f1567d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f1568e;

    /* JADX INFO: renamed from: f */
    public VFrame_FlipContainer f1569f;

    /* JADX INFO: renamed from: g */
    public HomeCardExpandedOperationNewUiButton f1570g;

    /* JADX INFO: renamed from: h */
    public VText f1571h;

    /* JADX INFO: renamed from: i */
    public HomeCardExpandedOperationNewUiButton f1572i;

    /* JADX INFO: renamed from: j */
    public HomeCardExpandedOperationNewUiButton f1573j;

    /* JADX INFO: renamed from: k */
    public VFrame_FlipContainer f1574k;

    /* JADX INFO: renamed from: l */
    public CardOperationButton f1575l;

    /* JADX INFO: renamed from: m */
    public VText f1576m;

    /* JADX INFO: renamed from: n */
    public VLinear f1577n;

    /* JADX INFO: renamed from: o */
    public String f1578o;

    /* JADX INFO: renamed from: p */
    public String f1579p;

    /* JADX INFO: renamed from: q */
    public Boolean f1580q;

    /* JADX INFO: renamed from: r */
    public Action1<String> f1581r;

    /* JADX INFO: renamed from: s */
    public final HashMap<String, j760<String, String>> f1582s;

    /* JADX INFO: renamed from: t */
    public final HashMap<String, j760<String, String>> f1583t;

    /* JADX INFO: renamed from: u */
    public final HashMap<String, j760<String, String>> f1584u;

    /* JADX INFO: renamed from: v */
    public final HashMap<String, j760<String, String>> f1585v;

    public HomeCardExpandedNewUiButtons(Context context) {
        super(context);
        this.f1578o = "default";
        this.f1579p = "unknown";
        this.f1580q = null;
        this.f1582s = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.1
            {
                put("default", j760.a(fm4.m14508f(), fm4.m14505c()));
                put("oDiamond", j760.a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga"));
                put("supremePartner", j760.a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f1583t = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.2
            {
                put("default", j760.a(fm4.m14507e(), fm4.m14504b()));
                put("oDiamond", j760.a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga"));
                put("supremePartner", j760.a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f1584u = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.3
            {
                put("default", j760.a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", fm4.m14506d()));
                put("oDiamond", j760.a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga"));
                put("supremePartner", j760.a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f1585v = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.4
            {
                put("default", j760.a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", j760.a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put("supremePartner", j760.a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }

    /* JADX INFO: renamed from: f */
    private void m2386f() {
        this.f1566c.bringToFront();
        xdl0.M(this.f1566c, ogl0.G());
        xdl0.X(this.f1567d, ogl0.G() ? t100.d(12.0f) : t100.d(20.0f));
        xdl0.X(this.f1572i, ogl0.G() ? t100.d(12.0f) : t100.d(20.0f));
        xdl0.X(this.f1573j, ogl0.G() ? t100.d(12.0f) : t100.d(20.0f));
    }

    /* JADX INFO: renamed from: g */
    private void m2387g() {
        xdl0.E0(this.f1577n, new View.OnClickListener() { // from class: l.q3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19004a.m2388h(view);
            }
        });
        xdl0.E0(this.f1566c, new View.OnClickListener() { // from class: l.r3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19622a.m2389i(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m2388h(View view) {
        if (NullChecker.a(this.f1581r)) {
            if (upa.K1() && CoreModule.c.z2.r3()) {
                lsi0.y("只看认证用户试用期间无法使用一键配对功能");
            } else {
                this.f1581r.call("p_home,odiamond_sayhi");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m2389i(View view) {
        if (upa.K1() && CoreModule.c.z2.r3()) {
            lsi0.y("只看认证用户试用期间无法使用一键配对功能");
        } else if (NullChecker.a(this.f1581r) && xdl0.O0(this.f1566c)) {
            this.f1581r.call("p_home,odiamond_sayhi");
            zvf0.r("e_odiamond_sayhi", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: j */
    private void m2390j() {
        if (TextUtils.equals(this.f1578o, this.f1579p)) {
            return;
        }
        if ("oDiamond".equals(this.f1578o)) {
            this.f1573j.setPlaceHolderPic(x2c0.k7);
            this.f1572i.setPlaceHolderPic(x2c0.l7);
            this.f1570g.setPlaceHolderPic(x2c0.n7);
            this.f1566c.setPlaceHolderPic(x2c0.m7);
        } else {
            boolean zEquals = "supremePartner".equals(this.f1578o);
            HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = this.f1573j;
            if (zEquals) {
                homeCardExpandedOperationNewUiButton.setPlaceHolderPic(x2c0.s7);
                this.f1572i.setPlaceHolderPic(x2c0.t7);
                this.f1570g.setPlaceHolderPic(x2c0.u7);
                this.f1566c.setPlaceHolderPic(x2c0.r7);
            } else {
                homeCardExpandedOperationNewUiButton.setPlaceHolderPic(x2c0.hs);
                this.f1572i.setPlaceHolderPic(x2c0.is);
                this.f1570g.setPlaceHolderPic(x2c0.js);
                this.f1566c.setPlaceHolderPic(x2c0.i7);
            }
        }
        this.f1570g.m2418n(this.f1584u.get(this.f1578o), this.f1578o);
        this.f1566c.m2418n(this.f1585v.get(this.f1578o), this.f1578o);
        this.f1572i.m2418n(this.f1582s.get(this.f1578o), this.f1578o);
        this.f1573j.m2418n(this.f1583t.get(this.f1578o), this.f1578o);
        this.f1579p = this.f1578o;
    }

    /* JADX INFO: renamed from: k */
    private void m2391k() {
        String str;
        if (NullChecker.a(this.f1580q)) {
            String str2 = this.f1578o;
            Boolean bool = this.f1580q;
            if (str2 == "oDiamond") {
                str = bool.booleanValue() ? "https://auto.tancdn.com/v1/raw/d8ca1b08-eb07-467e-9084-f8649aeaa1d814.pdf" : "https://auto.tancdn.com/v1/raw/882ec896-df41-439c-a0af-1e10180e7d8414.pdf";
            } else {
                str = bool.booleanValue() ? "https://auto.tancdn.com/v1/raw/cbbe7076-35a9-49cb-b736-352be2188deb14.svga" : "https://auto.tancdn.com/v1/raw/e5ff8681-8576-476a-a5b7-ecb3b930261414.svga";
            }
            SVGALoader.with(getContext()).from(str).autoPlay(true).repeatCount(-1).into(getSuperLikeComboSvga());
        }
    }

    private void setSwipeAnimEnable(boolean z) {
        HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = this.f1572i;
        if (z) {
            homeCardExpandedOperationNewUiButton.setSwipeEnable(true);
            this.f1573j.setSwipeEnable(true);
        } else {
            homeCardExpandedOperationNewUiButton.setSwipeEnable(false);
            this.f1573j.setSwipeEnable(false);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2392e(View view) {
        s3l.a(this, view);
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
        return f1563w;
    }

    @Override // p009l.osl
    @Nullable
    public View getButtonsRightLayout() {
        return this.f1565b;
    }

    @Override // p009l.osl
    public nsl getDislikeBtn() {
        return this.f1573j;
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
        return this.f1577n;
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ nsl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    public View getImmediatelyMatchTop() {
        return this.f1566c;
    }

    @Override // p009l.osl
    public nsl getLikeBtn() {
        return this.f1572i;
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
        return this.f1570g;
    }

    @Override // p009l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f1568e;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f1569f;
    }

    @Override // p009l.osl
    public int getSuperLikePressBg() {
        return x2c0.p3;
    }

    @Override // p009l.osl
    public VText getSuperLikeRemaining() {
        return this.f1571h;
    }

    @Override // p009l.osl
    public View getSuperLikeWarpLayout() {
        return this.f1567d;
    }

    @Override // p009l.osl
    @Nullable
    public nsl getUndo() {
        return this.f1575l;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f1574k;
    }

    @Override // p009l.osl
    public int getUndoPressBg() {
        return x2c0.i4;
    }

    /* JADX INFO: renamed from: l */
    public void m2393l() {
        a aVar = new a(getContext());
        d.l().k("bubble_odiamond_immediate_match_guide");
        aVar.B(t100.d(2.0f)).D("无需配对，直接开聊").k(new int[]{getContext().getResources().getColor(w0c0.I)}).J(13.0f).l(t100.d(7.0f)).p(75).x(t100.d(-4.0f)).o(a.P, t100.d(20.0f)).b(8000L).q(a.Q | a.P);
        d.l().u(aVar, this.f1566c, "bubble_odiamond_immediate_match_guide");
    }

    /* JADX INFO: renamed from: m */
    public void m2394m() {
        if (!ogl0.G() || b.q().p() <= 7 || ((Boolean) CoreModule.c.e0.A6.get()).booleanValue()) {
            return;
        }
        m2393l();
        CoreModule.c.e0.A6.put(Boolean.TRUE);
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
        m2392e(this);
        xdl0.c0(this.f1565b, t100.d(86.0f));
        this.f1564a.setClickable(false);
        this.f1575l.setShadowSize(t100.d(2.0f));
        setSwipeAnimEnable(true);
        this.f1572i.setFlagName("喜欢");
        this.f1573j.setFlagName("不喜欢");
        this.f1570g.setFlagName("超级喜欢");
        this.f1566c.setFlagName("黑金");
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(0L);
        layoutTransition.setDuration(0, 150L);
        layoutTransition.setDuration(1, 150L);
        setLayoutTransition(layoutTransition);
        m2387g();
        m2386f();
        m2390j();
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

    @Override // p009l.osl
    public void setButtonStyleType(String str) {
        this.f1578o = str;
        m2390j();
        m2391k();
        m2394m();
    }

    @Override // p009l.ykf
    public void setImmediateleMatchClickListener(Action1<String> action1) {
        this.f1581r = action1;
    }

    @Override // p009l.osl
    public void setSuperLikeBtnGray(boolean z) {
        HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = this.f1570g;
        if (homeCardExpandedOperationNewUiButton != null) {
            homeCardExpandedOperationNewUiButton.setCoverDrawable(z ? x2c0.fs : 0);
        }
    }

    @Override // p009l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f1580q = Boolean.valueOf(z);
        m2391k();
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

    public HomeCardExpandedNewUiButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1578o = "default";
        this.f1579p = "unknown";
        this.f1580q = null;
        this.f1582s = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.1
            {
                put("default", j760.a(fm4.m14508f(), fm4.m14505c()));
                put("oDiamond", j760.a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga"));
                put("supremePartner", j760.a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f1583t = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.2
            {
                put("default", j760.a(fm4.m14507e(), fm4.m14504b()));
                put("oDiamond", j760.a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga"));
                put("supremePartner", j760.a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f1584u = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.3
            {
                put("default", j760.a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", fm4.m14506d()));
                put("oDiamond", j760.a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga"));
                put("supremePartner", j760.a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f1585v = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.4
            {
                put("default", j760.a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", j760.a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put("supremePartner", j760.a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }

    public HomeCardExpandedNewUiButtons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1578o = "default";
        this.f1579p = "unknown";
        this.f1580q = null;
        this.f1582s = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.1
            {
                put("default", j760.a(fm4.m14508f(), fm4.m14505c()));
                put("oDiamond", j760.a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga"));
                put("supremePartner", j760.a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f1583t = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.2
            {
                put("default", j760.a(fm4.m14507e(), fm4.m14504b()));
                put("oDiamond", j760.a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga"));
                put("supremePartner", j760.a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f1584u = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.3
            {
                put("default", j760.a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", fm4.m14506d()));
                put("oDiamond", j760.a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga"));
                put("supremePartner", j760.a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f1585v = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.4
            {
                put("default", j760.a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", j760.a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put("supremePartner", j760.a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }
}
