package com.p000p1.mobile.putong.core.newui.home.views;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.ui.vip.widget.LetterRemainingSwitcherView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.az50;
import l.bt0;
import l.d30;
import l.j760;
import l.m5l;
import l.t100;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.k3l;
import p009l.nsl;
import p009l.osl;
import v.VFrame;
import v.VFrame_FlipContainer;
import v.VFrame_Shadow;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeCardSuperLikeButtons extends FrameLayout implements osl, Animator.AnimatorListener {

    /* JADX INFO: renamed from: H */
    public static int f2638H = t100.d(80.0f);

    /* JADX INFO: renamed from: A */
    public HashMap<String, j760<String, String>> f2639A;

    /* JADX INFO: renamed from: B */
    public String f2640B;

    /* JADX INFO: renamed from: C */
    public Boolean f2641C;

    /* JADX INFO: renamed from: D */
    public boolean f2642D;

    /* JADX INFO: renamed from: E */
    public d30 f2643E;

    /* JADX INFO: renamed from: F */
    public CoreSuggested.UserInfo f2644F;

    /* JADX INFO: renamed from: G */
    public int f2645G;

    /* JADX INFO: renamed from: a */
    public HomeCardSuperLikeButtons f2646a;

    /* JADX INFO: renamed from: b */
    public VFrame f2647b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f2648c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f2649d;

    /* JADX INFO: renamed from: e */
    public VFrame_FlipContainer f2650e;

    /* JADX INFO: renamed from: f */
    public HomeCardExpandedOperationButton f2651f;

    /* JADX INFO: renamed from: g */
    public VText f2652g;

    /* JADX INFO: renamed from: h */
    public HomeCardExpandedOperationButton f2653h;

    /* JADX INFO: renamed from: i */
    public HomeCardExpandedOperationButton f2654i;

    /* JADX INFO: renamed from: j */
    public VFrame_FlipContainer f2655j;

    /* JADX INFO: renamed from: k */
    public CardOperationButton f2656k;

    /* JADX INFO: renamed from: l */
    public VText f2657l;

    /* JADX INFO: renamed from: m */
    public VFrame f2658m;

    /* JADX INFO: renamed from: n */
    public VImage f2659n;

    /* JADX INFO: renamed from: o */
    public VFrame_Shadow f2660o;

    /* JADX INFO: renamed from: p */
    public VLinear f2661p;

    /* JADX INFO: renamed from: q */
    public VImage f2662q;

    /* JADX INFO: renamed from: r */
    public VText f2663r;

    /* JADX INFO: renamed from: s */
    public VLinear f2664s;

    /* JADX INFO: renamed from: t */
    public LetterRemainingSwitcherView f2665t;

    /* JADX INFO: renamed from: u */
    public VLinear f2666u;

    /* JADX INFO: renamed from: v */
    public CardOperationButton f2667v;

    /* JADX INFO: renamed from: w */
    public CardOperationButton f2668w;

    /* JADX INFO: renamed from: x */
    public CardOperationButton f2669x;

    /* JADX INFO: renamed from: y */
    public VLinear f2670y;

    /* JADX INFO: renamed from: z */
    public HashMap<String, j760<String, String>> f2671z;

    public HomeCardSuperLikeButtons(Context context) {
        super(context);
        this.f2671z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.1
            {
                put("default", j760.a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
                put("oDiamond", j760.a("core_card_expanded_click_like_odiamond_width_60.svga", "core_card_expanded_click_like_odiamond_width_60.svga"));
                put("supremePartner", j760.a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
            }
        };
        this.f2639A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.2
            {
                put("default", j760.a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
                put("oDiamond", j760.a("core_card_expanded_click_superlike_odiamond_width_60.svga", "core_card_expanded_click_superlike_odiamond_width_60.svga"));
                put("supremePartner", j760.a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
            }
        };
        this.f2640B = "default";
        this.f2641C = null;
        this.f2642D = true;
        this.f2645G = -1;
    }

    /* JADX INFO: renamed from: k */
    private void m3165k() {
        xdl0.E0(this.f2668w, new View.OnClickListener() { // from class: l.g5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13313a.m3167n(view);
            }
        });
        xdl0.E0(this.f2660o, new View.OnClickListener() { // from class: l.h5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13870a.m3168o(view);
            }
        });
        xdl0.E0(this.f2670y, new View.OnClickListener() { // from class: l.i5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14402a.m3169p(view);
            }
        });
        xdl0.E0(this.f2664s, new View.OnClickListener() { // from class: l.j5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14943a.m3177q(view);
            }
        });
        xdl0.E0(this.f2669x, new View.OnClickListener() { // from class: l.k5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15417a.m3170r(view);
            }
        });
        xdl0.E0(this.f2667v, new View.OnClickListener() { // from class: l.l5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15954a.m3171s(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    private void m3166l() {
        this.f2669x.setShadowSize(3.0f);
        this.f2668w.setShadowSize(3.0f);
        this.f2667v.setShadowSize(3.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m3167n(View view) {
        m3181y("e_superlikebutton_bottom");
        this.f2651f.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m3168o(View view) {
        m3181y("e_superlikebutton_mid");
        this.f2651f.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m3169p(View view) {
        m3181y("e_odiamond_sayhi_bottom");
        if (NullChecker.a(this.f2643E)) {
            this.f2643E.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m3170r(View view) {
        this.f2653h.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m3171s(View view) {
        this.f2654i.performClick();
    }

    /* JADX INFO: renamed from: t */
    private void m3172t() {
        m3182z();
        m3179w();
        m3175j(true);
    }

    /* JADX INFO: renamed from: u */
    private void m3173u() {
        if (NullChecker.a(this.f2641C)) {
            k3l.INSTANCE.m17283a(getContext(), getSuperLikeComboSvga(), this.f2640B, this.f2641C.booleanValue());
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
        return f2638H;
    }

    @Override // p009l.osl
    @Nullable
    public View getButtonsRightLayout() {
        return this.f2647b;
    }

    @Override // p009l.osl
    public nsl getDislikeBtn() {
        return this.f2654i;
    }

    @Override // p009l.osl
    public int getDislikePressBg() {
        return x2c0.i4;
    }

    public View getFourButtonsLayout() {
        return this.f2666u;
    }

    @Override // p009l.osl
    @Nullable
    public View getImmediatelyAndSuperLikeLayout() {
        return this.f2658m;
    }

    @Override // p009l.osl
    @Nullable
    public View getImmediatelyMatch() {
        return this.f2664s;
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ nsl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    @Override // p009l.osl
    public nsl getLikeBtn() {
        return this.f2653h;
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
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = 0;
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
        return this.f2651f;
    }

    @Override // p009l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f2649d;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f2650e;
    }

    @Override // p009l.osl
    public int getSuperLikePressBg() {
        return x2c0.p3;
    }

    @Override // p009l.osl
    public VText getSuperLikeRemaining() {
        return this.f2652g;
    }

    @Override // p009l.osl
    public View getSuperLikeWarpLayout() {
        return this.f2648c;
    }

    @Override // p009l.osl
    @Nullable
    public nsl getUndo() {
        return this.f2656k;
    }

    @Override // p009l.osl
    @Nullable
    public VFrame_FlipContainer getUndoLayout() {
        return this.f2655j;
    }

    @Override // p009l.osl
    public int getUndoPressBg() {
        return x2c0.i4;
    }

    /* JADX INFO: renamed from: i */
    public final void m3174i(View view) {
        m5l.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public void m3175j(boolean z) {
        xdl0.M(this.f2666u, z);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3176m() {
        if (NullChecker.a(this.f2644F)) {
            az50.a aVar = az50.Companion;
            if ((aVar.k(this.f2644F) && NullChecker.a(this.f2644F.getRenderUser())) || aVar.i(this.f2644F.id)) {
                return true;
            }
        }
        return false;
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
        m3174i(this);
        this.f2646a.setClickable(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(0L);
        layoutTransition.setDuration(0, 150L);
        layoutTransition.setDuration(1, 150L);
        setLayoutTransition(layoutTransition);
        m3172t();
        m3166l();
        m3165k();
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

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m3177q(View view) {
        m3181y("e_odiamond_sayhi_mid");
        if (NullChecker.a(this.f2643E)) {
            this.f2643E.call();
        }
    }

    @Override // p009l.osl
    public void setButtonStyleType(String str) {
        this.f2640B = str;
        m3172t();
        m3173u();
    }

    public void setImmediatelyMatchClickCallBack(d30 d30Var) {
        this.f2643E = d30Var;
    }

    @Override // p009l.osl
    public void setSuperLikeBtnGray(boolean z) {
        xdl0.M(this.f2648c, (z || m3176m()) ? false : true);
        xdl0.M(this.f2653h, z);
        this.f2662q.setAlpha(z ? 0.3f : 1.0f);
        this.f2663r.setAlpha(z ? 0.3f : 1.0f);
        this.f2668w.setIconAlpha(z ? 0.3f : 1.0f);
    }

    @Override // p009l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f2641C = Boolean.valueOf(z);
        m3173u();
    }

    public void setUserInfo(CoreSuggested.UserInfo userInfo) {
        this.f2644F = userInfo;
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

    /* JADX INFO: renamed from: v */
    public final void m3178v(List<String> list) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.f(14));
        Iterator<String> it = list.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(textPaint.measureText(it.next()), fMax);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2665t.getLayoutParams();
        layoutParams.width = ((int) fMax) + t100.d(2.0f);
        this.f2665t.setLayoutParams(layoutParams);
        this.f2665t.i();
        this.f2665t.setTextList(list);
        this.f2665t.setOutTranslateY(0.5f);
        this.f2665t.setAnimateDirection(false);
        this.f2665t.setInOutAnimation(300L);
        this.f2665t.h();
    }

    /* JADX INFO: renamed from: w */
    public final void m3179w() {
        String str;
        this.f2642D = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add("一键配对");
        m3178v(arrayList);
        xdl0.M(this.f2659n, false);
        String str2 = this.f2640B;
        int iHashCode = str2.hashCode();
        if (iHashCode != -796840475) {
            if (iHashCode != -704869329) {
                str = iHashCode == 1544803905 ? "default" : "supremePartner";
            }
            str2.equals(str);
        } else if (str2.equals("oDiamond")) {
            this.f2661p.setBackground(getResources().getDrawable(x2c0.Q2));
            this.f2662q.setImageResource(x2c0.Ih);
            this.f2662q.getLayoutParams().height = t100.d(20.0f);
            this.f2662q.getLayoutParams().width = t100.d(20.0f);
            xdl0.V(this.f2662q, t100.d(2.0f));
            xdl0.V(this.f2663r, t100.d(8.0f));
            this.f2663r.setTextColor(Color.parseColor("#E8CA8A"));
            return;
        }
        this.f2661p.setBackground(getResources().getDrawable(x2c0.Xq));
        this.f2662q.setImageResource(x2c0.Hh);
        this.f2662q.getLayoutParams().height = t100.d(24.0f);
        this.f2662q.getLayoutParams().width = t100.d(24.0f);
        xdl0.V(this.f2662q, t100.d(0.0f));
        xdl0.V(this.f2663r, t100.d(6.0f));
        this.f2663r.setTextColor(Color.parseColor("#ffffff"));
    }

    /* JADX INFO: renamed from: x */
    public void m3180x(boolean z) {
        if (m3176m()) {
            xdl0.M(this.f2647b, false);
            return;
        }
        VFrame vFrame = this.f2647b;
        if (z) {
            xdl0.M(vFrame, true);
        } else {
            vFrame.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3181y(String str) {
        zvf0.r(str, "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: z */
    public final void m3182z() {
        this.f2653h.m2402l((String) this.f2671z.get(this.f2640B).a, (String) this.f2671z.get(this.f2640B).b);
        this.f2651f.m2402l((String) this.f2639A.get(this.f2640B).a, (String) this.f2639A.get(this.f2640B).b);
        m3180x(!m3176m());
    }

    public HomeCardSuperLikeButtons(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2671z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.1
            {
                put("default", j760.a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
                put("oDiamond", j760.a("core_card_expanded_click_like_odiamond_width_60.svga", "core_card_expanded_click_like_odiamond_width_60.svga"));
                put("supremePartner", j760.a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
            }
        };
        this.f2639A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.2
            {
                put("default", j760.a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
                put("oDiamond", j760.a("core_card_expanded_click_superlike_odiamond_width_60.svga", "core_card_expanded_click_superlike_odiamond_width_60.svga"));
                put("supremePartner", j760.a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
            }
        };
        this.f2640B = "default";
        this.f2641C = null;
        this.f2642D = true;
        this.f2645G = -1;
    }

    public HomeCardSuperLikeButtons(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2671z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.1
            {
                put("default", j760.a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
                put("oDiamond", j760.a("core_card_expanded_click_like_odiamond_width_60.svga", "core_card_expanded_click_like_odiamond_width_60.svga"));
                put("supremePartner", j760.a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
            }
        };
        this.f2639A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.2
            {
                put("default", j760.a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
                put("oDiamond", j760.a("core_card_expanded_click_superlike_odiamond_width_60.svga", "core_card_expanded_click_superlike_odiamond_width_60.svga"));
                put("supremePartner", j760.a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
            }
        };
        this.f2640B = "default";
        this.f2641C = null;
        this.f2642D = true;
        this.f2645G = -1;
    }
}
