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
import p149l.k3l;
import p149l.lsi0;
import p149l.nsl;
import p149l.o3l;
import p149l.ogl0;
import p149l.osl;
import p149l.t100;
import p149l.upa;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.ykf;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardExpandedButtons extends FrameLayout implements osl, Animator.AnimatorListener, ykf {

    /* JADX INFO: renamed from: C */
    public static int f22756C = t100.m186890d(80.0f);

    /* JADX INFO: renamed from: A */
    public HashMap<String, j760<String, String>> f22757A;

    /* JADX INFO: renamed from: B */
    public HashMap<String, j760<String, String>> f22758B;

    /* JADX INFO: renamed from: a */
    public HomeCardExpandedButtons f22759a;

    /* JADX INFO: renamed from: b */
    public VRelative f22760b;

    /* JADX INFO: renamed from: c */
    public HomeCardExpandedOperationButton f22761c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f22762d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f22763e;

    /* JADX INFO: renamed from: f */
    public VFrame_FlipContainer f22764f;

    /* JADX INFO: renamed from: g */
    public HomeCardExpandedOperationButton f22765g;

    /* JADX INFO: renamed from: h */
    public VText f22766h;

    /* JADX INFO: renamed from: i */
    public HomeCardExpandedOperationButton f22767i;

    /* JADX INFO: renamed from: j */
    public HomeCardExpandedOperationButton f22768j;

    /* JADX INFO: renamed from: k */
    public VFrame_FlipContainer f22769k;

    /* JADX INFO: renamed from: l */
    public CardOperationButton f22770l;

    /* JADX INFO: renamed from: m */
    public VText f22771m;

    /* JADX INFO: renamed from: n */
    public VLinear f22772n;

    /* JADX INFO: renamed from: o */
    public String f22773o;

    /* JADX INFO: renamed from: p */
    public String f22774p;

    /* JADX INFO: renamed from: q */
    public Boolean f22775q;

    /* JADX INFO: renamed from: r */
    public Action1<String> f22776r;

    /* JADX INFO: renamed from: s */
    public final j760<String, String> f22777s;

    /* JADX INFO: renamed from: t */
    public final j760<String, String> f22778t;

    /* JADX INFO: renamed from: u */
    public final j760<String, String> f22779u;

    /* JADX INFO: renamed from: v */
    public final j760<String, String> f22780v;

    /* JADX INFO: renamed from: w */
    public final j760<String, String> f22781w;

    /* JADX INFO: renamed from: x */
    public final j760<String, String> f22782x;

    /* JADX INFO: renamed from: y */
    public HashMap<String, j760<String, String>> f22783y;

    /* JADX INFO: renamed from: z */
    public HashMap<String, j760<String, String>> f22784z;

    public HomeCardExpandedButtons(Context context) {
        super(context);
        this.f22773o = "default";
        this.f22774p = "unknown";
        this.f22775q = null;
        this.f22777s = j760.m140076a(fm4.m122149f(), fm4.m122146c());
        this.f22778t = j760.m140076a(fm4.m122148e(), fm4.m122145b());
        this.f22779u = j760.m140076a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", fm4.m122147d());
        this.f22780v = j760.m140076a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga");
        this.f22781w = j760.m140076a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga");
        this.f22782x = j760.m140076a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga");
        this.f22783y = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.1
            {
                put("default", HomeCardExpandedButtons.this.f22777s);
                put("oDiamond", HomeCardExpandedButtons.this.f22780v);
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f22784z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.2
            {
                put("default", HomeCardExpandedButtons.this.f22778t);
                put("oDiamond", HomeCardExpandedButtons.this.f22781w);
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f22757A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.3
            {
                put("default", HomeCardExpandedButtons.this.f22779u);
                put("oDiamond", HomeCardExpandedButtons.this.f22782x);
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f22758B = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.4
            {
                put("default", j760.m140076a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", j760.m140076a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }

    /* JADX INFO: renamed from: l */
    private void m38397l() {
        this.f22761c.bringToFront();
        xdl0.m208344M(this.f22761c, ogl0.m164228G());
        xdl0.m208360X(this.f22762d, ogl0.m164228G() ? t100.m186890d(12.0f) : t100.m186890d(20.0f));
        xdl0.m208360X(this.f22767i, ogl0.m164228G() ? t100.m186890d(12.0f) : t100.m186890d(20.0f));
        xdl0.m208360X(this.f22768j, ogl0.m164228G() ? t100.m186890d(12.0f) : t100.m186890d(20.0f));
    }

    /* JADX INFO: renamed from: p */
    private void m38398p() {
        if (TextUtils.equals(this.f22773o, this.f22774p)) {
            return;
        }
        if ("oDiamond".equals(this.f22773o)) {
            this.f22768j.setPlaceHolderPic(x2c0.f190290k7);
            this.f22767i.setPlaceHolderPic(x2c0.f190322l7);
            this.f22765g.setPlaceHolderPic(x2c0.f190386n7);
            this.f22761c.setPlaceHolderPic(x2c0.f190354m7);
        } else {
            boolean zEquals = SummarizedPrivilegesId.supremePartner.equals(this.f22773o);
            HomeCardExpandedOperationButton homeCardExpandedOperationButton = this.f22768j;
            if (zEquals) {
                homeCardExpandedOperationButton.setPlaceHolderPic(x2c0.f190546s7);
                this.f22767i.setPlaceHolderPic(x2c0.f190578t7);
                this.f22765g.setPlaceHolderPic(x2c0.f190610u7);
                this.f22761c.setPlaceHolderPic(x2c0.f190514r7);
            } else {
                homeCardExpandedOperationButton.setPlaceHolderPic(x2c0.f190164g7);
                this.f22767i.setPlaceHolderPic(x2c0.f190196h7);
                this.f22765g.setPlaceHolderPic(x2c0.f190258j7);
                this.f22761c.setPlaceHolderPic(x2c0.f190228i7);
            }
        }
        this.f22767i.m38424l(this.f22783y.get(this.f22773o).f116564a, this.f22783y.get(this.f22773o).f116565b);
        this.f22768j.m38424l(this.f22784z.get(this.f22773o).f116564a, this.f22784z.get(this.f22773o).f116565b);
        this.f22765g.m38424l(this.f22757A.get(this.f22773o).f116564a, this.f22757A.get(this.f22773o).f116565b);
        this.f22761c.m38424l(this.f22758B.get(this.f22773o).f116564a, this.f22758B.get(this.f22773o).f116565b);
        this.f22774p = this.f22773o;
    }

    /* JADX INFO: renamed from: q */
    private void m38399q() {
        if (NullChecker.m81303a(this.f22775q)) {
            k3l.INSTANCE.m144411a(getContext(), getSuperLikeComboSvga(), this.f22773o, this.f22775q.booleanValue());
        }
    }

    private void setSwipeAnimEnable(boolean z) {
        HomeCardExpandedOperationButton homeCardExpandedOperationButton = this.f22767i;
        if (z) {
            homeCardExpandedOperationButton.setSwipeEnable(true);
            this.f22768j.setSwipeEnable(true);
        } else {
            homeCardExpandedOperationButton.setSwipeEnable(false);
            this.f22768j.setSwipeEnable(false);
        }
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
        return f22756C;
    }

    @Override // p149l.osl
    @Nullable
    public View getButtonsRightLayout() {
        return this.f22760b;
    }

    @Override // p149l.osl
    public nsl getDislikeBtn() {
        return this.f22768j;
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
        return this.f22772n;
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ nsl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    public View getImmediatelyMatchTop() {
        return this.f22761c;
    }

    @Override // p149l.osl
    public nsl getLikeBtn() {
        return this.f22767i;
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
        return this.f22765g;
    }

    @Override // p149l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f22763e;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f22764f;
    }

    @Override // p149l.osl
    public int getSuperLikePressBg() {
        return x2c0.f190446p3;
    }

    @Override // p149l.osl
    public VText getSuperLikeRemaining() {
        return this.f22766h;
    }

    @Override // p149l.osl
    public View getSuperLikeWarpLayout() {
        return this.f22762d;
    }

    @Override // p149l.osl
    @Nullable
    public nsl getUndo() {
        return this.f22770l;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f22769k;
    }

    @Override // p149l.osl
    public int getUndoPressBg() {
        return x2c0.f190225i4;
    }

    /* JADX INFO: renamed from: k */
    public final void m38400k(View view) {
        o3l.m162438a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final void m38401m() {
        xdl0.m208329E0(this.f22772n, new View.OnClickListener() { // from class: l.m3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131102a.m38402n(view);
            }
        });
        xdl0.m208329E0(this.f22761c, new View.OnClickListener() { // from class: l.n3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137004a.m38403o(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m38402n(View view) {
        if (NullChecker.m81303a(this.f22776r)) {
            if (upa.m194658K1() && CoreModule.f17545c.f19704z2.m30255r3()) {
                lsi0.m151595y("只看认证用户试用期间无法使用一键配对功能");
            } else {
                this.f22776r.call("p_home,odiamond_sayhi");
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m38403o(View view) {
        if (upa.m194658K1() && CoreModule.f17545c.f19704z2.m30255r3()) {
            lsi0.m151595y("只看认证用户试用期间无法使用一键配对功能");
        } else if (NullChecker.m81303a(this.f22776r) && xdl0.m208349O0(this.f22761c)) {
            this.f22776r.call("p_home,odiamond_sayhi");
            zvf0.m220396r("e_odiamond_sayhi", "p_suggest_users_home_view");
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
        m38400k(this);
        xdl0.m208368c0(this.f22760b, t100.m186890d(86.0f));
        this.f22759a.setClickable(false);
        this.f22770l.setShadowSize(t100.m186890d(2.0f));
        setSwipeAnimEnable(true);
        this.f22767i.setShowLog(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(0L);
        layoutTransition.setDuration(0, 150L);
        layoutTransition.setDuration(1, 150L);
        setLayoutTransition(layoutTransition);
        m38401m();
        m38397l();
        m38398p();
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
    public void m38404r() {
        C4345a c4345a = new C4345a(getContext());
        C4348d.m20896l().m20900k("bubble_odiamond_immediate_match_guide");
        c4345a.m20847B(t100.m186890d(2.0f)).m20849D("无需配对，直接开聊").m20870k(getContext().getResources().getColor(w0c0.f183773I)).m20855J(13.0f).m20871l(t100.m186890d(7.0f)).m20874p(75).m20882x(t100.m186890d(-4.0f)).m20873o(C4345a.f15682P, t100.m186890d(20.0f)).m20861b(8000L).m20875q(C4345a.f15683Q | C4345a.f15682P);
        C4348d.m20896l().m20909u(c4345a, this.f22761c, "bubble_odiamond_immediate_match_guide");
    }

    /* JADX INFO: renamed from: s */
    public void m38405s() {
        if (!ogl0.m164228G() || C8456b.m47637q().m47648p() <= 7 || CoreModule.f17545c.f19639e0.f149140A6.get().booleanValue()) {
            return;
        }
        m38404r();
        CoreModule.f17545c.f19639e0.f149140A6.put(Boolean.TRUE);
    }

    @Override // p149l.osl
    public void setButtonStyleType(String str) {
        this.f22773o = str;
        m38398p();
        m38399q();
        m38405s();
    }

    @Override // p149l.ykf
    public void setImmediateleMatchClickListener(Action1<String> action1) {
        this.f22776r = action1;
    }

    @Override // p149l.osl
    public void setSuperLikeBtnGray(boolean z) {
        HomeCardExpandedOperationButton homeCardExpandedOperationButton = this.f22765g;
        if (homeCardExpandedOperationButton != null) {
            homeCardExpandedOperationButton.setCoverDrawable(z ? x2c0.f190482q7 : 0);
        }
    }

    @Override // p149l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f22775q = Boolean.valueOf(z);
        m38399q();
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

    public HomeCardExpandedButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22773o = "default";
        this.f22774p = "unknown";
        this.f22775q = null;
        this.f22777s = j760.m140076a(fm4.m122149f(), fm4.m122146c());
        this.f22778t = j760.m140076a(fm4.m122148e(), fm4.m122145b());
        this.f22779u = j760.m140076a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", fm4.m122147d());
        this.f22780v = j760.m140076a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga");
        this.f22781w = j760.m140076a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga");
        this.f22782x = j760.m140076a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga");
        this.f22783y = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.1
            {
                put("default", HomeCardExpandedButtons.this.f22777s);
                put("oDiamond", HomeCardExpandedButtons.this.f22780v);
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f22784z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.2
            {
                put("default", HomeCardExpandedButtons.this.f22778t);
                put("oDiamond", HomeCardExpandedButtons.this.f22781w);
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f22757A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.3
            {
                put("default", HomeCardExpandedButtons.this.f22779u);
                put("oDiamond", HomeCardExpandedButtons.this.f22782x);
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f22758B = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.4
            {
                put("default", j760.m140076a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", j760.m140076a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }

    public HomeCardExpandedButtons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22773o = "default";
        this.f22774p = "unknown";
        this.f22775q = null;
        this.f22777s = j760.m140076a(fm4.m122149f(), fm4.m122146c());
        this.f22778t = j760.m140076a(fm4.m122148e(), fm4.m122145b());
        this.f22779u = j760.m140076a("https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga", fm4.m122147d());
        this.f22780v = j760.m140076a("https://auto.tancdn.com/v1/raw/78a7050f-3483-4f5c-adb4-63d0a0100f1814.svga", "https://auto.tancdn.com/v1/raw/3b605799-e249-4570-9842-182f749f35c314.svga");
        this.f22781w = j760.m140076a("https://auto.tancdn.com/v1/raw/535b4dd1-a555-4f83-af6b-42737e4595a214.svga", "https://auto.tancdn.com/v1/raw/e2fcaca7-7b82-4a74-af74-dcd3977fe85c14.svga");
        this.f22782x = j760.m140076a("https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga", "https://fe-static.tancdn.com/v1/raw/04c0fb59-e9bc-4068-985f-72428ec5fbb214.svga");
        this.f22783y = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.1
            {
                put("default", HomeCardExpandedButtons.this.f22777s);
                put("oDiamond", HomeCardExpandedButtons.this.f22780v);
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://auto.tancdn.com/v1/raw/015868cb-26a7-43bd-b979-07fef5ee5a9214.svga", "https://auto.tancdn.com/v1/raw/584dba69-3714-4452-8aef-ce20a8204b8214.svga"));
            }
        };
        this.f22784z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.2
            {
                put("default", HomeCardExpandedButtons.this.f22778t);
                put("oDiamond", HomeCardExpandedButtons.this.f22781w);
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://auto.tancdn.com/v1/raw/10994e18-a65e-4997-9661-c34f82602aaa14.svga", "https://auto.tancdn.com/v1/raw/840b5a5b-0e12-46a4-b498-93d6cb621ae414.svga"));
            }
        };
        this.f22757A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.3
            {
                put("default", HomeCardExpandedButtons.this.f22779u);
                put("oDiamond", HomeCardExpandedButtons.this.f22782x);
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga", "https://fe-static.tancdn.com/v1/raw/cc415dc0-2e1e-467a-bd61-2969805d6ae814.svga"));
            }
        };
        this.f22758B = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedButtons.4
            {
                put("default", j760.m140076a("https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga", "https://fe-static.tancdn.com/v1/raw/75bd9a44-17ba-450d-8542-dc91de8b6d3e14.svga"));
                put("oDiamond", j760.m140076a("https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga", "https://fe-static.tancdn.com/v1/raw/45b252c6-e0c5-40fc-aae2-4024074f3de514.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga", "https://fe-static.tancdn.com/v1/raw/61e83fe0-4352-476b-8b77-cc9d0f48153714.svga"));
            }
        };
    }
}
