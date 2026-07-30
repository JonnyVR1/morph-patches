package com.p051p1.mobile.putong.core.newui.home.card.operation;

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
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.HashMap;
import p151v.VFrame_FlipContainer;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.avl;
import p153l.bnl0;
import p153l.bvl;
import p153l.c9c0;
import p153l.dbc0;
import p153l.emf;
import p153l.en4;
import p153l.gra;
import p153l.gt0;
import p153l.i4g0;
import p153l.i6l;
import p153l.o1j0;
import p153l.pf60;
import p153l.qa00;
import p153l.spl0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardExpandedNewUiButtons extends FrameLayout implements bvl, Animator.AnimatorListener, emf {

    /* JADX INFO: renamed from: w */
    public static final int f23527w = qa00.m175859d(80.0f);

    /* JADX INFO: renamed from: a */
    public HomeCardExpandedNewUiButtons f23528a;

    /* JADX INFO: renamed from: b */
    public VRelative f23529b;

    /* JADX INFO: renamed from: c */
    public HomeCardExpandedOperationNewUiButton f23530c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f23531d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f23532e;

    /* JADX INFO: renamed from: f */
    public VFrame_FlipContainer f23533f;

    /* JADX INFO: renamed from: g */
    public HomeCardExpandedOperationNewUiButton f23534g;

    /* JADX INFO: renamed from: h */
    public VText f23535h;

    /* JADX INFO: renamed from: i */
    public HomeCardExpandedOperationNewUiButton f23536i;

    /* JADX INFO: renamed from: j */
    public HomeCardExpandedOperationNewUiButton f23537j;

    /* JADX INFO: renamed from: k */
    public VFrame_FlipContainer f23538k;

    /* JADX INFO: renamed from: l */
    public CardOperationButton f23539l;

    /* JADX INFO: renamed from: m */
    public VText f23540m;

    /* JADX INFO: renamed from: n */
    public VLinear f23541n;

    /* JADX INFO: renamed from: o */
    public String f23542o;

    /* JADX INFO: renamed from: p */
    public String f23543p;

    /* JADX INFO: renamed from: q */
    public Boolean f23544q;

    /* JADX INFO: renamed from: r */
    public Action1<String> f23545r;

    /* JADX INFO: renamed from: s */
    public final HashMap<String, pf60<String, String>> f23546s;

    /* JADX INFO: renamed from: t */
    public final HashMap<String, pf60<String, String>> f23547t;

    /* JADX INFO: renamed from: u */
    public final HashMap<String, pf60<String, String>> f23548u;

    /* JADX INFO: renamed from: v */
    public final HashMap<String, pf60<String, String>> f23549v;

    public HomeCardExpandedNewUiButtons(Context context) {
        super(context);
        this.f23542o = "default";
        this.f23543p = "unknown";
        this.f23544q = null;
        this.f23546s = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.1
            {
                put("default", pf60.m172085a(en4.m121424f(), en4.m121421c()));
                put("oDiamond", pf60.m172085a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f23547t = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.2
            {
                put("default", pf60.m172085a(en4.m121423e(), en4.m121420b()));
                put("oDiamond", pf60.m172085a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f23548u = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.3
            {
                put("default", pf60.m172085a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", en4.m121422d()));
                put("oDiamond", pf60.m172085a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f23549v = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.4
            {
                put("default", pf60.m172085a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", pf60.m172085a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }

    /* JADX INFO: renamed from: f */
    private void m39411f() {
        this.f23530c.bringToFront();
        bnl0.m105524M(this.f23530c, spl0.m187355G());
        bnl0.m105540X(this.f23531d, spl0.m187355G() ? qa00.m175859d(12.0f) : qa00.m175859d(20.0f));
        bnl0.m105540X(this.f23536i, spl0.m187355G() ? qa00.m175859d(12.0f) : qa00.m175859d(20.0f));
        bnl0.m105540X(this.f23537j, spl0.m187355G() ? qa00.m175859d(12.0f) : qa00.m175859d(20.0f));
    }

    /* JADX INFO: renamed from: g */
    private void m39412g() {
        bnl0.m105509E0(this.f23541n, new View.OnClickListener() { // from class: l.g6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102466a.m39413h(view);
            }
        });
        bnl0.m105509E0(this.f23530c, new View.OnClickListener() { // from class: l.h6l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108036a.m39414i(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m39413h(View view) {
        if (NullChecker.m82486a(this.f23545r)) {
            if (gra.m131589K1() && CoreModule.f18264c.f20446z2.m31253r3()) {
                o1j0.m165651y("只看认证用户试用期间无法使用一键配对功能");
            } else {
                this.f23545r.call("p_home,odiamond_sayhi");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m39414i(View view) {
        if (gra.m131589K1() && CoreModule.f18264c.f20446z2.m31253r3()) {
            o1j0.m165651y("只看认证用户试用期间无法使用一键配对功能");
        } else if (NullChecker.m82486a(this.f23545r) && bnl0.m105529O0(this.f23530c)) {
            this.f23545r.call("p_home,odiamond_sayhi");
            i4g0.m138520r("e_odiamond_sayhi", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: j */
    private void m39415j() {
        if (TextUtils.equals(this.f23542o, this.f23543p)) {
            return;
        }
        if ("oDiamond".equals(this.f23542o)) {
            this.f23537j.setPlaceHolderPic(dbc0.f87176l7);
            this.f23536i.setPlaceHolderPic(dbc0.f87209m7);
            this.f23534g.setPlaceHolderPic(dbc0.f87275o7);
            this.f23530c.setPlaceHolderPic(dbc0.f87242n7);
        } else {
            boolean zEquals = SummarizedPrivilegesId.supremePartner.equals(this.f23542o);
            HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = this.f23537j;
            if (zEquals) {
                homeCardExpandedOperationNewUiButton.setPlaceHolderPic(dbc0.f87440t7);
                this.f23536i.setPlaceHolderPic(dbc0.f87473u7);
                this.f23534g.setPlaceHolderPic(dbc0.f87505v7);
                this.f23530c.setPlaceHolderPic(dbc0.f87407s7);
            } else {
                homeCardExpandedOperationNewUiButton.setPlaceHolderPic(dbc0.f86677Vs);
                this.f23536i.setPlaceHolderPic(dbc0.f86709Ws);
                this.f23534g.setPlaceHolderPic(dbc0.f86741Xs);
                this.f23530c.setPlaceHolderPic(dbc0.f87110j7);
            }
        }
        this.f23534g.m39443n(this.f23548u.get(this.f23542o), this.f23542o);
        this.f23530c.m39443n(this.f23549v.get(this.f23542o), this.f23542o);
        this.f23536i.m39443n(this.f23546s.get(this.f23542o), this.f23542o);
        this.f23537j.m39443n(this.f23547t.get(this.f23542o), this.f23542o);
        this.f23543p = this.f23542o;
    }

    /* JADX INFO: renamed from: k */
    private void m39416k() {
        String str;
        if (NullChecker.m82486a(this.f23544q)) {
            String str2 = this.f23542o;
            Boolean bool = this.f23544q;
            if (str2 == "oDiamond") {
                str = bool.booleanValue() ? "https://auto.tancdn.com/v1/raw/d8ca1b08-eb07-467e-9084-f8649aeaa1d814.pdf" : "https://auto.tancdn.com/v1/raw/882ec896-df41-439c-a0af-1e10180e7d8414.pdf";
            } else {
                str = bool.booleanValue() ? "https://auto.tancdn.com/v1/raw/cbbe7076-35a9-49cb-b736-352be2188deb14.svga" : "https://auto.tancdn.com/v1/raw/e5ff8681-8576-476a-a5b7-ecb3b930261414.svga";
            }
            SVGALoader.with(getContext()).from(str).autoPlay(true).repeatCount(-1).into(getSuperLikeComboSvga());
        }
    }

    private void setSwipeAnimEnable(boolean z) {
        HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = this.f23536i;
        if (z) {
            homeCardExpandedOperationNewUiButton.setSwipeEnable(true);
            this.f23537j.setSwipeEnable(true);
        } else {
            homeCardExpandedOperationNewUiButton.setSwipeEnable(false);
            this.f23537j.setSwipeEnable(false);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m39417e(View view) {
        i6l.m138827a(this, view);
    }

    @Override // p153l.bvl
    public int getButtonRadius() {
        return qa00.m175859d(27.0f);
    }

    @Override // p153l.bvl
    public ViewGroup getButtonRootLayout() {
        return this;
    }

    @Override // p153l.bvl
    public int getButtonScrolledDistance() {
        return f23527w;
    }

    @Override // p153l.bvl
    @Nullable
    public View getButtonsRightLayout() {
        return this.f23529b;
    }

    @Override // p153l.bvl
    public avl getDislikeBtn() {
        return this.f23537j;
    }

    @Override // p153l.bvl
    public int getDislikePressBg() {
        return dbc0.f87107j4;
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyAndSuperLikeLayout() {
        return super.getImmediatelyAndSuperLikeLayout();
    }

    @Override // p153l.bvl
    @Nullable
    public View getImmediatelyMatch() {
        return this.f23541n;
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ avl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    public View getImmediatelyMatchTop() {
        return this.f23530c;
    }

    @Override // p153l.bvl
    public avl getLikeBtn() {
        return this.f23536i;
    }

    @Override // p153l.bvl
    public int getLikePressBg() {
        return dbc0.f87468u2;
    }

    @Override // p153l.bvl
    public int getNormalBg() {
        return dbc0.f86778Z1;
    }

    @Override // p153l.bvl
    public int getOperationBtnBg() {
        return dbc0.f86778Z1;
    }

    @Override // p153l.bvl
    @Nullable
    public VImage getPinImage() {
        return null;
    }

    public View getPinLikeLayout() {
        return null;
    }

    @Override // p153l.bvl
    @Nullable
    public VText getPinText() {
        return null;
    }

    @Override // p153l.bvl
    public FrameLayout.LayoutParams getRootBtnLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.gravity = 85;
        return layoutParams;
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ View getSayHiNewLayout() {
        return super.getSayHiNewLayout();
    }

    @Override // p153l.bvl
    public avl getSuperLike() {
        return this.f23534g;
    }

    @Override // p153l.bvl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f23532e;
    }

    @Override // p153l.bvl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f23533f;
    }

    @Override // p153l.bvl
    public int getSuperLikePressBg() {
        return dbc0.f87337q3;
    }

    @Override // p153l.bvl
    public VText getSuperLikeRemaining() {
        return this.f23535h;
    }

    @Override // p153l.bvl
    public View getSuperLikeWarpLayout() {
        return this.f23531d;
    }

    @Override // p153l.bvl
    @Nullable
    public avl getUndo() {
        return this.f23539l;
    }

    @Override // p153l.bvl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f23538k;
    }

    @Override // p153l.bvl
    public int getUndoPressBg() {
        return dbc0.f87107j4;
    }

    /* JADX INFO: renamed from: l */
    public void m39418l() {
        C4496a c4496a = new C4496a(getContext());
        C4499d.m21895l().m21899k("bubble_odiamond_immediate_match_guide");
        c4496a.m21846B(qa00.m175859d(2.0f)).m21848D("无需配对，直接开聊").m21869k(getContext().getResources().getColor(c9c0.f80342I)).m21854J(13.0f).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21881x(qa00.m175859d(-4.0f)).m21872o(C4496a.f16401P, qa00.m175859d(20.0f)).m21860b(8000L).m21874q(C4496a.f16402Q | C4496a.f16401P);
        C4499d.m21895l().m21908u(c4496a, this.f23530c, "bubble_odiamond_immediate_match_guide");
    }

    /* JADX INFO: renamed from: m */
    public void m39419m() {
        if (!spl0.m187355G() || C8619b.m48820q().m48831p() <= 7 || CoreModule.f18264c.f20381e0.f88997A6.get().booleanValue()) {
            return;
        }
        m39418l();
        CoreModule.f18264c.f20381e0.f88997A6.put(Boolean.TRUE);
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
        m39417e(this);
        bnl0.m105548c0(this.f23529b, qa00.m175859d(86.0f));
        this.f23528a.setClickable(false);
        this.f23539l.setShadowSize(qa00.m175859d(2.0f));
        setSwipeAnimEnable(true);
        this.f23536i.setFlagName("喜欢");
        this.f23537j.setFlagName("不喜欢");
        this.f23534g.setFlagName("超级喜欢");
        this.f23530c.setFlagName("黑金");
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(0L);
        layoutTransition.setDuration(0, 150L);
        layoutTransition.setDuration(1, 150L);
        setLayoutTransition(layoutTransition);
        m39412g();
        m39411f();
        m39415j();
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

    @Override // p153l.bvl
    public void setButtonStyleType(String str) {
        this.f23542o = str;
        m39415j();
        m39416k();
        m39419m();
    }

    @Override // p153l.emf
    public void setImmediateleMatchClickListener(Action1<String> action1) {
        this.f23545r = action1;
    }

    @Override // p153l.bvl
    public void setSuperLikeBtnGray(boolean z) {
        HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = this.f23534g;
        if (homeCardExpandedOperationNewUiButton != null) {
            homeCardExpandedOperationNewUiButton.setCoverDrawable(z ? dbc0.f86613Ts : 0);
        }
    }

    @Override // p153l.bvl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f23544q = Boolean.valueOf(z);
        m39416k();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 0) {
            super.setVisibility(i);
            if (getAlpha() == 1.0f) {
                return;
            }
        }
        Animator animatorM132168n = gt0.m132168n(this, View.ALPHA, getAlpha(), i == 8 ? 0.0f : 1.0f);
        animatorM132168n.setDuration(150L);
        if (i == 8) {
            animatorM132168n.addListener(this);
        }
        animatorM132168n.start();
    }

    public HomeCardExpandedNewUiButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23542o = "default";
        this.f23543p = "unknown";
        this.f23544q = null;
        this.f23546s = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.1
            {
                put("default", pf60.m172085a(en4.m121424f(), en4.m121421c()));
                put("oDiamond", pf60.m172085a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f23547t = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.2
            {
                put("default", pf60.m172085a(en4.m121423e(), en4.m121420b()));
                put("oDiamond", pf60.m172085a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f23548u = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.3
            {
                put("default", pf60.m172085a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", en4.m121422d()));
                put("oDiamond", pf60.m172085a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f23549v = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.4
            {
                put("default", pf60.m172085a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", pf60.m172085a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }

    public HomeCardExpandedNewUiButtons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23542o = "default";
        this.f23543p = "unknown";
        this.f23544q = null;
        this.f23546s = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.1
            {
                put("default", pf60.m172085a(en4.m121424f(), en4.m121421c()));
                put("oDiamond", pf60.m172085a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f23547t = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.2
            {
                put("default", pf60.m172085a(en4.m121423e(), en4.m121420b()));
                put("oDiamond", pf60.m172085a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f23548u = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.3
            {
                put("default", pf60.m172085a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", en4.m121422d()));
                put("oDiamond", pf60.m172085a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f23549v = new HashMap<String, pf60<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.4
            {
                put("default", pf60.m172085a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", pf60.m172085a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }
}
