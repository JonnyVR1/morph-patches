package com.p046p1.mobile.putong.core.newui.home.views;

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
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterRemainingSwitcherView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p147v.VFrame;
import p147v.VFrame_FlipContainer;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.az50;
import p149l.bt0;
import p149l.d30;
import p149l.j760;
import p149l.k3l;
import p149l.m5l;
import p149l.nsl;
import p149l.osl;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardSuperLikeButtons extends FrameLayout implements osl, Animator.AnimatorListener {

    /* JADX INFO: renamed from: H */
    public static int f23860H = t100.m186890d(80.0f);

    /* JADX INFO: renamed from: A */
    public HashMap<String, j760<String, String>> f23861A;

    /* JADX INFO: renamed from: B */
    public String f23862B;

    /* JADX INFO: renamed from: C */
    public Boolean f23863C;

    /* JADX INFO: renamed from: D */
    public boolean f23864D;

    /* JADX INFO: renamed from: E */
    public d30 f23865E;

    /* JADX INFO: renamed from: F */
    public CoreSuggested.UserInfo f23866F;

    /* JADX INFO: renamed from: G */
    public int f23867G;

    /* JADX INFO: renamed from: a */
    public HomeCardSuperLikeButtons f23868a;

    /* JADX INFO: renamed from: b */
    public VFrame f23869b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f23870c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f23871d;

    /* JADX INFO: renamed from: e */
    public VFrame_FlipContainer f23872e;

    /* JADX INFO: renamed from: f */
    public HomeCardExpandedOperationButton f23873f;

    /* JADX INFO: renamed from: g */
    public VText f23874g;

    /* JADX INFO: renamed from: h */
    public HomeCardExpandedOperationButton f23875h;

    /* JADX INFO: renamed from: i */
    public HomeCardExpandedOperationButton f23876i;

    /* JADX INFO: renamed from: j */
    public VFrame_FlipContainer f23877j;

    /* JADX INFO: renamed from: k */
    public CardOperationButton f23878k;

    /* JADX INFO: renamed from: l */
    public VText f23879l;

    /* JADX INFO: renamed from: m */
    public VFrame f23880m;

    /* JADX INFO: renamed from: n */
    public VImage f23881n;

    /* JADX INFO: renamed from: o */
    public VFrame_Shadow f23882o;

    /* JADX INFO: renamed from: p */
    public VLinear f23883p;

    /* JADX INFO: renamed from: q */
    public VImage f23884q;

    /* JADX INFO: renamed from: r */
    public VText f23885r;

    /* JADX INFO: renamed from: s */
    public VLinear f23886s;

    /* JADX INFO: renamed from: t */
    public LetterRemainingSwitcherView f23887t;

    /* JADX INFO: renamed from: u */
    public VLinear f23888u;

    /* JADX INFO: renamed from: v */
    public CardOperationButton f23889v;

    /* JADX INFO: renamed from: w */
    public CardOperationButton f23890w;

    /* JADX INFO: renamed from: x */
    public CardOperationButton f23891x;

    /* JADX INFO: renamed from: y */
    public VLinear f23892y;

    /* JADX INFO: renamed from: z */
    public HashMap<String, j760<String, String>> f23893z;

    public HomeCardSuperLikeButtons(Context context) {
        super(context);
        this.f23893z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.1
            {
                put("default", j760.m140076a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
                put("oDiamond", j760.m140076a("core_card_expanded_click_like_odiamond_width_60.svga", "core_card_expanded_click_like_odiamond_width_60.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
            }
        };
        this.f23861A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.2
            {
                put("default", j760.m140076a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
                put("oDiamond", j760.m140076a("core_card_expanded_click_superlike_odiamond_width_60.svga", "core_card_expanded_click_superlike_odiamond_width_60.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
            }
        };
        this.f23862B = "default";
        this.f23863C = null;
        this.f23864D = true;
        this.f23867G = -1;
    }

    /* JADX INFO: renamed from: k */
    private void m39149k() {
        xdl0.m208329E0(this.f23890w, new View.OnClickListener() { // from class: l.g5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101170a.m39151n(view);
            }
        });
        xdl0.m208329E0(this.f23882o, new View.OnClickListener() { // from class: l.h5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105955a.m39152o(view);
            }
        });
        xdl0.m208329E0(this.f23892y, new View.OnClickListener() { // from class: l.i5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111597a.m39153p(view);
            }
        });
        xdl0.m208329E0(this.f23886s, new View.OnClickListener() { // from class: l.j5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116328a.m39161q(view);
            }
        });
        xdl0.m208329E0(this.f23891x, new View.OnClickListener() { // from class: l.k5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121210a.m39154r(view);
            }
        });
        xdl0.m208329E0(this.f23889v, new View.OnClickListener() { // from class: l.l5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126186a.m39155s(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    private void m39150l() {
        this.f23891x.setShadowSize(3.0f);
        this.f23890w.setShadowSize(3.0f);
        this.f23889v.setShadowSize(3.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m39151n(View view) {
        m39165y("e_superlikebutton_bottom");
        this.f23873f.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m39152o(View view) {
        m39165y("e_superlikebutton_mid");
        this.f23873f.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m39153p(View view) {
        m39165y("e_odiamond_sayhi_bottom");
        if (NullChecker.m81303a(this.f23865E)) {
            this.f23865E.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m39154r(View view) {
        this.f23875h.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m39155s(View view) {
        this.f23876i.performClick();
    }

    /* JADX INFO: renamed from: t */
    private void m39156t() {
        m39166z();
        m39163w();
        m39159j(true);
    }

    /* JADX INFO: renamed from: u */
    private void m39157u() {
        if (NullChecker.m81303a(this.f23863C)) {
            k3l.INSTANCE.m144411a(getContext(), getSuperLikeComboSvga(), this.f23862B, this.f23863C.booleanValue());
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
        return f23860H;
    }

    @Override // p149l.osl
    @Nullable
    public View getButtonsRightLayout() {
        return this.f23869b;
    }

    @Override // p149l.osl
    public nsl getDislikeBtn() {
        return this.f23876i;
    }

    @Override // p149l.osl
    public int getDislikePressBg() {
        return x2c0.f190225i4;
    }

    public View getFourButtonsLayout() {
        return this.f23888u;
    }

    @Override // p149l.osl
    @Nullable
    public View getImmediatelyAndSuperLikeLayout() {
        return this.f23880m;
    }

    @Override // p149l.osl
    @Nullable
    public View getImmediatelyMatch() {
        return this.f23886s;
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ nsl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    @Override // p149l.osl
    public nsl getLikeBtn() {
        return this.f23875h;
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
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = 0;
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
        return this.f23873f;
    }

    @Override // p149l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f23871d;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f23872e;
    }

    @Override // p149l.osl
    public int getSuperLikePressBg() {
        return x2c0.f190446p3;
    }

    @Override // p149l.osl
    public VText getSuperLikeRemaining() {
        return this.f23874g;
    }

    @Override // p149l.osl
    public View getSuperLikeWarpLayout() {
        return this.f23870c;
    }

    @Override // p149l.osl
    @Nullable
    public nsl getUndo() {
        return this.f23878k;
    }

    @Override // p149l.osl
    @Nullable
    public VFrame_FlipContainer getUndoLayout() {
        return this.f23877j;
    }

    @Override // p149l.osl
    public int getUndoPressBg() {
        return x2c0.f190225i4;
    }

    /* JADX INFO: renamed from: i */
    public final void m39158i(View view) {
        m5l.m153141a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public void m39159j(boolean z) {
        xdl0.m208344M(this.f23888u, z);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m39160m() {
        if (NullChecker.m81303a(this.f23866F)) {
            az50.Companion companion = az50.INSTANCE;
            if ((companion.m99631k(this.f23866F) && NullChecker.m81303a(this.f23866F.getRenderUser())) || companion.m99629i(this.f23866F.f19472id)) {
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
        m39158i(this);
        this.f23868a.setClickable(false);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(0L);
        layoutTransition.setDuration(0, 150L);
        layoutTransition.setDuration(1, 150L);
        setLayoutTransition(layoutTransition);
        m39156t();
        m39150l();
        m39149k();
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
    public final /* synthetic */ void m39161q(View view) {
        m39165y("e_odiamond_sayhi_mid");
        if (NullChecker.m81303a(this.f23865E)) {
            this.f23865E.call();
        }
    }

    @Override // p149l.osl
    public void setButtonStyleType(String str) {
        this.f23862B = str;
        m39156t();
        m39157u();
    }

    public void setImmediatelyMatchClickCallBack(d30 d30Var) {
        this.f23865E = d30Var;
    }

    @Override // p149l.osl
    public void setSuperLikeBtnGray(boolean z) {
        xdl0.m208344M(this.f23870c, (z || m39160m()) ? false : true);
        xdl0.m208344M(this.f23875h, z);
        this.f23884q.setAlpha(z ? 0.3f : 1.0f);
        this.f23885r.setAlpha(z ? 0.3f : 1.0f);
        this.f23890w.setIconAlpha(z ? 0.3f : 1.0f);
    }

    @Override // p149l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f23863C = Boolean.valueOf(z);
        m39157u();
    }

    public void setUserInfo(CoreSuggested.UserInfo userInfo) {
        this.f23866F = userInfo;
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

    /* JADX INFO: renamed from: v */
    public final void m39162v(List<String> list) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.m186892f(14));
        Iterator<String> it = list.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(textPaint.measureText(it.next()), fMax);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f23887t.getLayoutParams();
        layoutParams.width = ((int) fMax) + t100.m186890d(2.0f);
        this.f23887t.setLayoutParams(layoutParams);
        this.f23887t.m57726i();
        this.f23887t.setTextList(list);
        this.f23887t.setOutTranslateY(0.5f);
        this.f23887t.setAnimateDirection(false);
        this.f23887t.setInOutAnimation(300L);
        this.f23887t.m57725h();
    }

    /* JADX INFO: renamed from: w */
    public final void m39163w() {
        String str;
        this.f23864D = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add("一键配对");
        m39162v(arrayList);
        xdl0.m208344M(this.f23881n, false);
        String str2 = this.f23862B;
        int iHashCode = str2.hashCode();
        if (iHashCode != -796840475) {
            if (iHashCode == -704869329) {
                str = SummarizedPrivilegesId.supremePartner;
            } else if (iHashCode == 1544803905) {
                str = "default";
            }
            str2.equals(str);
        } else if (str2.equals("oDiamond")) {
            this.f23883p.setBackground(getResources().getDrawable(x2c0.f189658Q2));
            this.f23884q.setImageResource(x2c0.f189425Ih);
            this.f23884q.getLayoutParams().height = t100.m186890d(20.0f);
            this.f23884q.getLayoutParams().width = t100.m186890d(20.0f);
            xdl0.m208358V(this.f23884q, t100.m186890d(2.0f));
            xdl0.m208358V(this.f23885r, t100.m186890d(8.0f));
            this.f23885r.setTextColor(Color.parseColor("#E8CA8A"));
            return;
        }
        this.f23883p.setBackground(getResources().getDrawable(x2c0.f189899Xq));
        this.f23884q.setImageResource(x2c0.f189394Hh);
        this.f23884q.getLayoutParams().height = t100.m186890d(24.0f);
        this.f23884q.getLayoutParams().width = t100.m186890d(24.0f);
        xdl0.m208358V(this.f23884q, t100.m186890d(0.0f));
        xdl0.m208358V(this.f23885r, t100.m186890d(6.0f));
        this.f23885r.setTextColor(Color.parseColor("#ffffff"));
    }

    /* JADX INFO: renamed from: x */
    public void m39164x(boolean z) {
        if (m39160m()) {
            xdl0.m208344M(this.f23869b, false);
            return;
        }
        VFrame vFrame = this.f23869b;
        if (z) {
            xdl0.m208344M(vFrame, true);
        } else {
            vFrame.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m39165y(String str) {
        zvf0.m220396r(str, "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: z */
    public final void m39166z() {
        this.f23875h.m38424l(this.f23893z.get(this.f23862B).f116564a, this.f23893z.get(this.f23862B).f116565b);
        this.f23873f.m38424l(this.f23861A.get(this.f23862B).f116564a, this.f23861A.get(this.f23862B).f116565b);
        m39164x(!m39160m());
    }

    public HomeCardSuperLikeButtons(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23893z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.1
            {
                put("default", j760.m140076a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
                put("oDiamond", j760.m140076a("core_card_expanded_click_like_odiamond_width_60.svga", "core_card_expanded_click_like_odiamond_width_60.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
            }
        };
        this.f23861A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.2
            {
                put("default", j760.m140076a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
                put("oDiamond", j760.m140076a("core_card_expanded_click_superlike_odiamond_width_60.svga", "core_card_expanded_click_superlike_odiamond_width_60.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
            }
        };
        this.f23862B = "default";
        this.f23863C = null;
        this.f23864D = true;
        this.f23867G = -1;
    }

    public HomeCardSuperLikeButtons(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23893z = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.1
            {
                put("default", j760.m140076a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
                put("oDiamond", j760.m140076a("core_card_expanded_click_like_odiamond_width_60.svga", "core_card_expanded_click_like_odiamond_width_60.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("core_card_expanded_click_like_width_60.svga", "core_card_expanded_click_like_width_60.svga"));
            }
        };
        this.f23861A = new HashMap() { // from class: com.p1.mobile.putong.core.newui.home.views.HomeCardSuperLikeButtons.2
            {
                put("default", j760.m140076a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
                put("oDiamond", j760.m140076a("core_card_expanded_click_superlike_odiamond_width_60.svga", "core_card_expanded_click_superlike_odiamond_width_60.svga"));
                put(SummarizedPrivilegesId.supremePartner, j760.m140076a("core_card_expanded_click_superlike_width_60.svga", "core_card_expanded_click_superlike_width_60.svga"));
            }
        };
        this.f23862B = "default";
        this.f23863C = null;
        this.f23864D = true;
        this.f23867G = -1;
    }
}
