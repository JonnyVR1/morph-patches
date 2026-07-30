package com.p046p1.mobile.putong.core.newui.home.card.operation;

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
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.HashMap;
import p147v.VFrame_FlipContainer;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.bt0;
import p149l.fm4;
import p149l.j760;
import p149l.lsi0;
import p149l.nsl;
import p149l.ogl0;
import p149l.osl;
import p149l.s3l;
import p149l.t100;
import p149l.upa;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.ykf;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardExpandedNewUiButtons extends FrameLayout implements osl, Animator.AnimatorListener, ykf {

    /* JADX INFO: renamed from: w */
    public static final int f22785w = t100.m186890d(80.0f);

    /* JADX INFO: renamed from: a */
    public HomeCardExpandedNewUiButtons f22786a;

    /* JADX INFO: renamed from: b */
    public VRelative f22787b;

    /* JADX INFO: renamed from: c */
    public HomeCardExpandedOperationNewUiButton f22788c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f22789d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f22790e;

    /* JADX INFO: renamed from: f */
    public VFrame_FlipContainer f22791f;

    /* JADX INFO: renamed from: g */
    public HomeCardExpandedOperationNewUiButton f22792g;

    /* JADX INFO: renamed from: h */
    public VText f22793h;

    /* JADX INFO: renamed from: i */
    public HomeCardExpandedOperationNewUiButton f22794i;

    /* JADX INFO: renamed from: j */
    public HomeCardExpandedOperationNewUiButton f22795j;

    /* JADX INFO: renamed from: k */
    public VFrame_FlipContainer f22796k;

    /* JADX INFO: renamed from: l */
    public CardOperationButton f22797l;

    /* JADX INFO: renamed from: m */
    public VText f22798m;

    /* JADX INFO: renamed from: n */
    public VLinear f22799n;

    /* JADX INFO: renamed from: o */
    public String f22800o;

    /* JADX INFO: renamed from: p */
    public String f22801p;

    /* JADX INFO: renamed from: q */
    public Boolean f22802q;

    /* JADX INFO: renamed from: r */
    public Action1<String> f22803r;

    /* JADX INFO: renamed from: s */
    public final HashMap<String, j760<String, String>> f22804s;

    /* JADX INFO: renamed from: t */
    public final HashMap<String, j760<String, String>> f22805t;

    /* JADX INFO: renamed from: u */
    public final HashMap<String, j760<String, String>> f22806u;

    /* JADX INFO: renamed from: v */
    public final HashMap<String, j760<String, String>> f22807v;

    public HomeCardExpandedNewUiButtons(Context context) {
        super(context);
        this.f22800o = "default";
        this.f22801p = "unknown";
        this.f22802q = null;
        this.f22804s = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.1
            {
                put("default", j760.m140076a(fm4.m122149f(), fm4.m122146c()));
                put("oDiamond", j760.m140076a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f22805t = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.2
            {
                put("default", j760.m140076a(fm4.m122148e(), fm4.m122145b()));
                put("oDiamond", j760.m140076a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f22806u = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.3
            {
                put("default", j760.m140076a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", fm4.m122147d()));
                put("oDiamond", j760.m140076a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f22807v = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.4
            {
                put("default", j760.m140076a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", j760.m140076a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }

    /* JADX INFO: renamed from: f */
    private void m38408f() {
        this.f22788c.bringToFront();
        xdl0.m208344M(this.f22788c, ogl0.m164228G());
        xdl0.m208360X(this.f22789d, ogl0.m164228G() ? t100.m186890d(12.0f) : t100.m186890d(20.0f));
        xdl0.m208360X(this.f22794i, ogl0.m164228G() ? t100.m186890d(12.0f) : t100.m186890d(20.0f));
        xdl0.m208360X(this.f22795j, ogl0.m164228G() ? t100.m186890d(12.0f) : t100.m186890d(20.0f));
    }

    /* JADX INFO: renamed from: g */
    private void m38409g() {
        xdl0.m208329E0(this.f22799n, new View.OnClickListener() { // from class: l.q3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152481a.m38410h(view);
            }
        });
        xdl0.m208329E0(this.f22788c, new View.OnClickListener() { // from class: l.r3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157541a.m38411i(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m38410h(View view) {
        if (NullChecker.m81303a(this.f22803r)) {
            if (upa.m194658K1() && CoreModule.f17545c.f19704z2.m30255r3()) {
                lsi0.m151595y("只看认证用户试用期间无法使用一键配对功能");
            } else {
                this.f22803r.call("p_home,odiamond_sayhi");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m38411i(View view) {
        if (upa.m194658K1() && CoreModule.f17545c.f19704z2.m30255r3()) {
            lsi0.m151595y("只看认证用户试用期间无法使用一键配对功能");
        } else if (NullChecker.m81303a(this.f22803r) && xdl0.m208349O0(this.f22788c)) {
            this.f22803r.call("p_home,odiamond_sayhi");
            zvf0.m220396r("e_odiamond_sayhi", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: j */
    private void m38412j() {
        if (TextUtils.equals(this.f22800o, this.f22801p)) {
            return;
        }
        if ("oDiamond".equals(this.f22800o)) {
            this.f22795j.setPlaceHolderPic(x2c0.f190290k7);
            this.f22794i.setPlaceHolderPic(x2c0.f190322l7);
            this.f22792g.setPlaceHolderPic(x2c0.f190386n7);
            this.f22788c.setPlaceHolderPic(x2c0.f190354m7);
        } else {
            boolean zEquals = SummarizedPrivilegesId.supremePartner.equals(this.f22800o);
            HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = this.f22795j;
            if (zEquals) {
                homeCardExpandedOperationNewUiButton.setPlaceHolderPic(x2c0.f190546s7);
                this.f22794i.setPlaceHolderPic(x2c0.f190578t7);
                this.f22792g.setPlaceHolderPic(x2c0.f190610u7);
                this.f22788c.setPlaceHolderPic(x2c0.f190514r7);
            } else {
                homeCardExpandedOperationNewUiButton.setPlaceHolderPic(x2c0.f190217hs);
                this.f22794i.setPlaceHolderPic(x2c0.f190248is);
                this.f22792g.setPlaceHolderPic(x2c0.f190279js);
                this.f22788c.setPlaceHolderPic(x2c0.f190228i7);
            }
        }
        this.f22792g.m38440n(this.f22806u.get(this.f22800o), this.f22800o);
        this.f22788c.m38440n(this.f22807v.get(this.f22800o), this.f22800o);
        this.f22794i.m38440n(this.f22804s.get(this.f22800o), this.f22800o);
        this.f22795j.m38440n(this.f22805t.get(this.f22800o), this.f22800o);
        this.f22801p = this.f22800o;
    }

    /* JADX INFO: renamed from: k */
    private void m38413k() {
        String str;
        if (NullChecker.m81303a(this.f22802q)) {
            String str2 = this.f22800o;
            Boolean bool = this.f22802q;
            if (str2 == "oDiamond") {
                str = bool.booleanValue() ? "https://auto.tancdn.com/v1/raw/d8ca1b08-eb07-467e-9084-f8649aeaa1d814.pdf" : "https://auto.tancdn.com/v1/raw/882ec896-df41-439c-a0af-1e10180e7d8414.pdf";
            } else {
                str = bool.booleanValue() ? "https://auto.tancdn.com/v1/raw/cbbe7076-35a9-49cb-b736-352be2188deb14.svga" : "https://auto.tancdn.com/v1/raw/e5ff8681-8576-476a-a5b7-ecb3b930261414.svga";
            }
            SVGALoader.with(getContext()).from(str).autoPlay(true).repeatCount(-1).into(getSuperLikeComboSvga());
        }
    }

    private void setSwipeAnimEnable(boolean z) {
        HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = this.f22794i;
        if (z) {
            homeCardExpandedOperationNewUiButton.setSwipeEnable(true);
            this.f22795j.setSwipeEnable(true);
        } else {
            homeCardExpandedOperationNewUiButton.setSwipeEnable(false);
            this.f22795j.setSwipeEnable(false);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m38414e(View view) {
        s3l.m182165a(this, view);
    }

    @Override // p149l.osl
    public int getButtonRadius() {
        return t100.m186890d(27.0f);
    }

    @Override // p149l.osl
    public ViewGroup getButtonRootLayout() {
        return this;
    }

    @Override // p149l.osl
    public int getButtonScrolledDistance() {
        return f22785w;
    }

    @Override // p149l.osl
    @Nullable
    public View getButtonsRightLayout() {
        return this.f22787b;
    }

    @Override // p149l.osl
    public nsl getDislikeBtn() {
        return this.f22795j;
    }

    @Override // p149l.osl
    public int getDislikePressBg() {
        return x2c0.f190225i4;
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyAndSuperLikeLayout() {
        return super.getImmediatelyAndSuperLikeLayout();
    }

    @Override // p149l.osl
    @Nullable
    public View getImmediatelyMatch() {
        return this.f22799n;
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ nsl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    public View getImmediatelyMatchTop() {
        return this.f22788c;
    }

    @Override // p149l.osl
    public nsl getLikeBtn() {
        return this.f22794i;
    }

    @Override // p149l.osl
    public int getLikePressBg() {
        return x2c0.f190573t2;
    }

    @Override // p149l.osl
    public int getNormalBg() {
        return x2c0.f189905Y1;
    }

    @Override // p149l.osl
    public int getOperationBtnBg() {
        return x2c0.f189905Y1;
    }

    @Override // p149l.osl
    @Nullable
    public VImage getPinImage() {
        return null;
    }

    public View getPinLikeLayout() {
        return null;
    }

    @Override // p149l.osl
    @Nullable
    public VText getPinText() {
        return null;
    }

    @Override // p149l.osl
    public FrameLayout.LayoutParams getRootBtnLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.gravity = 85;
        return layoutParams;
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getSayHiNewLayout() {
        return super.getSayHiNewLayout();
    }

    @Override // p149l.osl
    public nsl getSuperLike() {
        return this.f22792g;
    }

    @Override // p149l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f22790e;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f22791f;
    }

    @Override // p149l.osl
    public int getSuperLikePressBg() {
        return x2c0.f190446p3;
    }

    @Override // p149l.osl
    public VText getSuperLikeRemaining() {
        return this.f22793h;
    }

    @Override // p149l.osl
    public View getSuperLikeWarpLayout() {
        return this.f22789d;
    }

    @Override // p149l.osl
    @Nullable
    public nsl getUndo() {
        return this.f22797l;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f22796k;
    }

    @Override // p149l.osl
    public int getUndoPressBg() {
        return x2c0.f190225i4;
    }

    /* JADX INFO: renamed from: l */
    public void m38415l() {
        C4345a c4345a = new C4345a(getContext());
        C4348d.m20896l().m20900k("bubble_odiamond_immediate_match_guide");
        c4345a.m20847B(t100.m186890d(2.0f)).m20849D("无需配对，直接开聊").m20870k(getContext().getResources().getColor(w0c0.f183773I)).m20855J(13.0f).m20871l(t100.m186890d(7.0f)).m20874p(75).m20882x(t100.m186890d(-4.0f)).m20873o(C4345a.f15682P, t100.m186890d(20.0f)).m20861b(8000L).m20875q(C4345a.f15683Q | C4345a.f15682P);
        C4348d.m20896l().m20909u(c4345a, this.f22788c, "bubble_odiamond_immediate_match_guide");
    }

    /* JADX INFO: renamed from: m */
    public void m38416m() {
        if (!ogl0.m164228G() || C8456b.m47637q().m47648p() <= 7 || CoreModule.f17545c.f19639e0.f149140A6.get().booleanValue()) {
            return;
        }
        m38415l();
        CoreModule.f17545c.f19639e0.f149140A6.put(Boolean.TRUE);
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
        m38414e(this);
        xdl0.m208368c0(this.f22787b, t100.m186890d(86.0f));
        this.f22786a.setClickable(false);
        this.f22797l.setShadowSize(t100.m186890d(2.0f));
        setSwipeAnimEnable(true);
        this.f22794i.setFlagName("喜欢");
        this.f22795j.setFlagName("不喜欢");
        this.f22792g.setFlagName("超级喜欢");
        this.f22788c.setFlagName("黑金");
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(0L);
        layoutTransition.setDuration(0, 150L);
        layoutTransition.setDuration(1, 150L);
        setLayoutTransition(layoutTransition);
        m38409g();
        m38408f();
        m38412j();
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

    @Override // p149l.osl
    public void setButtonStyleType(String str) {
        this.f22800o = str;
        m38412j();
        m38413k();
        m38416m();
    }

    @Override // p149l.ykf
    public void setImmediateleMatchClickListener(Action1<String> action1) {
        this.f22803r = action1;
    }

    @Override // p149l.osl
    public void setSuperLikeBtnGray(boolean z) {
        HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = this.f22792g;
        if (homeCardExpandedOperationNewUiButton != null) {
            homeCardExpandedOperationNewUiButton.setCoverDrawable(z ? x2c0.f190153fs : 0);
        }
    }

    @Override // p149l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f22802q = Boolean.valueOf(z);
        m38413k();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 0) {
            super.setVisibility(i);
            if (getAlpha() == 1.0f) {
                return;
            }
        }
        Animator animatorM103741n = bt0.m103741n(this, View.ALPHA, getAlpha(), i == 8 ? 0.0f : 1.0f);
        animatorM103741n.setDuration(150L);
        if (i == 8) {
            animatorM103741n.addListener(this);
        }
        animatorM103741n.start();
    }

    public HomeCardExpandedNewUiButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22800o = "default";
        this.f22801p = "unknown";
        this.f22802q = null;
        this.f22804s = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.1
            {
                put("default", j760.m140076a(fm4.m122149f(), fm4.m122146c()));
                put("oDiamond", j760.m140076a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f22805t = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.2
            {
                put("default", j760.m140076a(fm4.m122148e(), fm4.m122145b()));
                put("oDiamond", j760.m140076a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f22806u = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.3
            {
                put("default", j760.m140076a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", fm4.m122147d()));
                put("oDiamond", j760.m140076a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f22807v = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.4
            {
                put("default", j760.m140076a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", j760.m140076a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }

    public HomeCardExpandedNewUiButtons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22800o = "default";
        this.f22801p = "unknown";
        this.f22802q = null;
        this.f22804s = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.1
            {
                put("default", j760.m140076a(fm4.m122149f(), fm4.m122146c()));
                put("oDiamond", j760.m140076a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f22805t = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.2
            {
                put("default", j760.m140076a(fm4.m122148e(), fm4.m122145b()));
                put("oDiamond", j760.m140076a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f22806u = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.3
            {
                put("default", j760.m140076a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", fm4.m122147d()));
                put("oDiamond", j760.m140076a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f22807v = new HashMap<String, j760<String, String>>() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedNewUiButtons.4
            {
                put("default", j760.m140076a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", j760.m140076a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }
}
