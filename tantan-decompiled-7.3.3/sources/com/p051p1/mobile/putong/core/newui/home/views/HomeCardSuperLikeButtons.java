package com.p051p1.mobile.putong.core.newui.home.views;

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
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterRemainingSwitcherView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p151v.VFrame;
import p151v.VFrame_FlipContainer;
import p151v.VFrame_Shadow;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.a6l;
import p153l.avl;
import p153l.bnl0;
import p153l.bvl;
import p153l.c8l;
import p153l.dbc0;
import p153l.f760;
import p153l.gt0;
import p153l.i4g0;
import p153l.pf60;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardSuperLikeButtons extends FrameLayout implements bvl, Animator.AnimatorListener {

    /* JADX INFO: renamed from: H */
    public static int f24602H = qa00.m175859d(80.0f);

    /* JADX INFO: renamed from: A */
    public HashMap<String, pf60<String, String>> f24603A;

    /* JADX INFO: renamed from: B */
    public String f24604B;

    /* JADX INFO: renamed from: C */
    public Boolean f24605C;

    /* JADX INFO: renamed from: D */
    public boolean f24606D;

    /* JADX INFO: renamed from: E */
    public x20 f24607E;

    /* JADX INFO: renamed from: F */
    public CoreSuggested.UserInfo f24608F;

    /* JADX INFO: renamed from: G */
    public int f24609G;

    /* JADX INFO: renamed from: a */
    public HomeCardSuperLikeButtons f24610a;

    /* JADX INFO: renamed from: b */
    public VFrame f24611b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f24612c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f24613d;

    /* JADX INFO: renamed from: e */
    public VFrame_FlipContainer f24614e;

    /* JADX INFO: renamed from: f */
    public HomeCardExpandedOperationButton f24615f;

    /* JADX INFO: renamed from: g */
    public VText f24616g;

    /* JADX INFO: renamed from: h */
    public HomeCardExpandedOperationButton f24617h;

    /* JADX INFO: renamed from: i */
    public HomeCardExpandedOperationButton f24618i;

    /* JADX INFO: renamed from: j */
    public VFrame_FlipContainer f24619j;

    /* JADX INFO: renamed from: k */
    public CardOperationButton f24620k;

    /* JADX INFO: renamed from: l */
    public VText f24621l;

    /* JADX INFO: renamed from: m */
    public VFrame f24622m;

    /* JADX INFO: renamed from: n */
    public VImage f24623n;

    /* JADX INFO: renamed from: o */
    public VFrame_Shadow f24624o;

    /* JADX INFO: renamed from: p */
    public VLinear f24625p;

    /* JADX INFO: renamed from: q */
    public VImage f24626q;

    /* JADX INFO: renamed from: r */
    public VText f24627r;

    /* JADX INFO: renamed from: s */
    public VLinear f24628s;

    /* JADX INFO: renamed from: t */
    public LetterRemainingSwitcherView f24629t;

    /* JADX INFO: renamed from: u */
    public VLinear f24630u;

    /* JADX INFO: renamed from: v */
    public CardOperationButton f24631v;

    /* JADX INFO: renamed from: w */
    public CardOperationButton f24632w;

    /* JADX INFO: renamed from: x */
    public CardOperationButton f24633x;

    /* JADX INFO: renamed from: y */
    public VLinear f24634y;

    /* JADX INFO: renamed from: z */
    public HashMap<String, pf60<String, String>> f24635z;

    public HomeCardSuperLikeButtons(Context context) {
        super(context);
        this.f24635z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.1
            {
                put("default", pf60.m172085a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
                put("oDiamond", pf60.m172085a("core_card_expanded_click_like_odiamond_width_60.svga", "core_card_expanded_click_like_odiamond_width_60.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
            }
        };
        this.f24603A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.2
            {
                put("default", pf60.m172085a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
                put("oDiamond", pf60.m172085a("core_card_expanded_click_superlike_odiamond_width_60.svga", "core_card_expanded_click_superlike_odiamond_width_60.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
            }
        };
        this.f24604B = "default";
        this.f24605C = null;
        this.f24606D = true;
        this.f24609G = -1;
    }

    /* JADX INFO: renamed from: k */
    private void m40152k() {
        bnl0.m105509E0(this.f24632w, new View.OnClickListener() { // from class: l.w7l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187768a.m40154n(view);
            }
        });
        bnl0.m105509E0(this.f24624o, new View.OnClickListener() { // from class: l.x7l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192732a.m40155o(view);
            }
        });
        bnl0.m105509E0(this.f24634y, new View.OnClickListener() { // from class: l.y7l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197787a.m40156p(view);
            }
        });
        bnl0.m105509E0(this.f24628s, new View.OnClickListener() { // from class: l.z7l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203254a.m40164q(view);
            }
        });
        bnl0.m105509E0(this.f24633x, new View.OnClickListener() { // from class: l.a8l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68931a.m40157r(view);
            }
        });
        bnl0.m105509E0(this.f24631v, new View.OnClickListener() { // from class: l.b8l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75441a.m40158s(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    private void m40153l() {
        this.f24633x.setShadowSize(3.0f);
        this.f24632w.setShadowSize(3.0f);
        this.f24631v.setShadowSize(3.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m40154n(View view) {
        m40168y("e_superlikebutton_bottom");
        this.f24615f.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m40155o(View view) {
        m40168y("e_superlikebutton_mid");
        this.f24615f.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m40156p(View view) {
        m40168y("e_odiamond_sayhi_bottom");
        if (NullChecker.m82486a(this.f24607E)) {
            this.f24607E.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m40157r(View view) {
        this.f24617h.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m40158s(View view) {
        this.f24618i.performClick();
    }

    /* JADX INFO: renamed from: t */
    private void m40159t() {
        m40169z();
        m40166w();
        m40162j(true);
    }

    /* JADX INFO: renamed from: u */
    private void m40160u() {
        if (NullChecker.m82486a(this.f24605C)) {
            a6l.INSTANCE.m96339a(getContext(), getSuperLikeComboSvga(), this.f24604B, this.f24605C.booleanValue());
        }
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
        return f24602H;
    }

    @Override // p153l.bvl
    @Nullable
    public View getButtonsRightLayout() {
        return this.f24611b;
    }

    @Override // p153l.bvl
    public avl getDislikeBtn() {
        return this.f24618i;
    }

    @Override // p153l.bvl
    public int getDislikePressBg() {
        return dbc0.f87107j4;
    }

    public View getFourButtonsLayout() {
        return this.f24630u;
    }

    @Override // p153l.bvl
    @Nullable
    public View getImmediatelyAndSuperLikeLayout() {
        return this.f24622m;
    }

    @Override // p153l.bvl
    @Nullable
    public View getImmediatelyMatch() {
        return this.f24628s;
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ avl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    @Override // p153l.bvl
    public avl getLikeBtn() {
        return this.f24617h;
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
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = 0;
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
        return this.f24615f;
    }

    @Override // p153l.bvl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f24613d;
    }

    @Override // p153l.bvl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f24614e;
    }

    @Override // p153l.bvl
    public int getSuperLikePressBg() {
        return dbc0.f87337q3;
    }

    @Override // p153l.bvl
    public VText getSuperLikeRemaining() {
        return this.f24616g;
    }

    @Override // p153l.bvl
    public View getSuperLikeWarpLayout() {
        return this.f24612c;
    }

    @Override // p153l.bvl
    @Nullable
    public avl getUndo() {
        return this.f24620k;
    }

    @Override // p153l.bvl
    @Nullable
    public VFrame_FlipContainer getUndoLayout() {
        return this.f24619j;
    }

    @Override // p153l.bvl
    public int getUndoPressBg() {
        return dbc0.f87107j4;
    }

    /* JADX INFO: renamed from: i */
    public final void m40161i(View view) {
        c8l.m108366a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public void m40162j(boolean z) {
        bnl0.m105524M(this.f24630u, z);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m40163m() {
        if (NullChecker.m82486a(this.f24608F)) {
            f760.Companion companion = f760.INSTANCE;
            if ((companion.m124364k(this.f24608F) && NullChecker.m82486a(this.f24608F.getRenderUser())) || companion.m124362i(this.f24608F.f20214id)) {
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
        m40161i(this);
        this.f24610a.setClickable(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(0L);
        layoutTransition.setDuration(0, 150L);
        layoutTransition.setDuration(1, 150L);
        setLayoutTransition(layoutTransition);
        m40159t();
        m40153l();
        m40152k();
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
    public final /* synthetic */ void m40164q(View view) {
        m40168y("e_odiamond_sayhi_mid");
        if (NullChecker.m82486a(this.f24607E)) {
            this.f24607E.call();
        }
    }

    @Override // p153l.bvl
    public void setButtonStyleType(String str) {
        this.f24604B = str;
        m40159t();
        m40160u();
    }

    public void setImmediatelyMatchClickCallBack(x20 x20Var) {
        this.f24607E = x20Var;
    }

    @Override // p153l.bvl
    public void setSuperLikeBtnGray(boolean z) {
        bnl0.m105524M(this.f24612c, (z || m40163m()) ? false : true);
        bnl0.m105524M(this.f24617h, z);
        this.f24626q.setAlpha(z ? 0.3f : 1.0f);
        this.f24627r.setAlpha(z ? 0.3f : 1.0f);
        this.f24632w.setIconAlpha(z ? 0.3f : 1.0f);
    }

    @Override // p153l.bvl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f24605C = Boolean.valueOf(z);
        m40160u();
    }

    public void setUserInfo(CoreSuggested.UserInfo userInfo) {
        this.f24608F = userInfo;
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

    /* JADX INFO: renamed from: v */
    public final void m40165v(List<String> list) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175861f(14));
        Iterator<String> it = list.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(textPaint.measureText(it.next()), fMax);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f24629t.getLayoutParams();
        layoutParams.width = ((int) fMax) + qa00.m175859d(2.0f);
        this.f24629t.setLayoutParams(layoutParams);
        this.f24629t.m58909i();
        this.f24629t.setTextList(list);
        this.f24629t.setOutTranslateY(0.5f);
        this.f24629t.setAnimateDirection(false);
        this.f24629t.setInOutAnimation(300L);
        this.f24629t.m58908h();
    }

    /* JADX INFO: renamed from: w */
    public final void m40166w() {
        String str;
        this.f24606D = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add("一键配对");
        m40165v(arrayList);
        bnl0.m105524M(this.f24623n, false);
        String str2 = this.f24604B;
        int iHashCode = str2.hashCode();
        if (iHashCode != -796840475) {
            if (iHashCode == -704869329) {
                str = SummarizedPrivilegesId.supremePartner;
            } else if (iHashCode == 1544803905) {
                str = "default";
            }
            str2.equals(str);
        } else if (str2.equals("oDiamond")) {
            this.f24625p.setBackground(getResources().getDrawable(dbc0.f86523R2));
            this.f24626q.setImageResource(dbc0.f87548wi);
            this.f24626q.getLayoutParams().height = qa00.m175859d(20.0f);
            this.f24626q.getLayoutParams().width = qa00.m175859d(20.0f);
            bnl0.m105538V(this.f24626q, qa00.m175859d(2.0f));
            bnl0.m105538V(this.f24627r, qa00.m175859d(8.0f));
            this.f24627r.setTextColor(Color.parseColor("#E8CA8A"));
            return;
        }
        this.f24625p.setBackground(getResources().getDrawable(dbc0.f86356Lr));
        this.f24626q.setImageResource(dbc0.f87516vi);
        this.f24626q.getLayoutParams().height = qa00.m175859d(24.0f);
        this.f24626q.getLayoutParams().width = qa00.m175859d(24.0f);
        bnl0.m105538V(this.f24626q, qa00.m175859d(0.0f));
        bnl0.m105538V(this.f24627r, qa00.m175859d(6.0f));
        this.f24627r.setTextColor(Color.parseColor("#ffffff"));
    }

    /* JADX INFO: renamed from: x */
    public void m40167x(boolean z) {
        if (m40163m()) {
            bnl0.m105524M(this.f24611b, false);
            return;
        }
        VFrame vFrame = this.f24611b;
        if (z) {
            bnl0.m105524M(vFrame, true);
        } else {
            vFrame.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m40168y(String str) {
        i4g0.m138520r(str, "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: z */
    public final void m40169z() {
        this.f24617h.m39427l(this.f24635z.get(this.f24604B).f152156a, this.f24635z.get(this.f24604B).f152157b);
        this.f24615f.m39427l(this.f24603A.get(this.f24604B).f152156a, this.f24603A.get(this.f24604B).f152157b);
        m40167x(!m40163m());
    }

    public HomeCardSuperLikeButtons(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24635z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.1
            {
                put("default", pf60.m172085a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
                put("oDiamond", pf60.m172085a("core_card_expanded_click_like_odiamond_width_60.svga", "core_card_expanded_click_like_odiamond_width_60.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
            }
        };
        this.f24603A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.2
            {
                put("default", pf60.m172085a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
                put("oDiamond", pf60.m172085a("core_card_expanded_click_superlike_odiamond_width_60.svga", "core_card_expanded_click_superlike_odiamond_width_60.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
            }
        };
        this.f24604B = "default";
        this.f24605C = null;
        this.f24606D = true;
        this.f24609G = -1;
    }

    public HomeCardSuperLikeButtons(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24635z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.1
            {
                put("default", pf60.m172085a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
                put("oDiamond", pf60.m172085a("core_card_expanded_click_like_odiamond_width_60.svga", "core_card_expanded_click_like_odiamond_width_60.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
            }
        };
        this.f24603A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.2
            {
                put("default", pf60.m172085a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
                put("oDiamond", pf60.m172085a("core_card_expanded_click_superlike_odiamond_width_60.svga", "core_card_expanded_click_superlike_odiamond_width_60.svga"));
                put(SummarizedPrivilegesId.supremePartner, pf60.m172085a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
            }
        };
        this.f24604B = "default";
        this.f24605C = null;
        this.f24606D = true;
        this.f24609G = -1;
    }
}
