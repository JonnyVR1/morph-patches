package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.hmb;
import l.t100;
import l.y8l;
import p009l.k3l;
import p009l.nsl;
import p009l.osl;
import v.VFrame_FlipContainer;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeSayHiNewButton extends LinearLayout implements osl {

    /* JADX INFO: renamed from: a */
    public HomeSayHiNewButton f2688a;

    /* JADX INFO: renamed from: b */
    public VFrame_FlipContainer f2689b;

    /* JADX INFO: renamed from: c */
    public CardOperationButton f2690c;

    /* JADX INFO: renamed from: d */
    public VText f2691d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f2692e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f2693f;

    /* JADX INFO: renamed from: g */
    public VFrame_FlipContainer f2694g;

    /* JADX INFO: renamed from: h */
    public CardOperationButton f2695h;

    /* JADX INFO: renamed from: i */
    public VText f2696i;

    /* JADX INFO: renamed from: j */
    public CardOperationButton f2697j;

    /* JADX INFO: renamed from: k */
    public CardOperationButton f2698k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f2699l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f2700m;

    /* JADX INFO: renamed from: n */
    public VText f2701n;

    /* JADX INFO: renamed from: o */
    public String f2702o;

    /* JADX INFO: renamed from: p */
    public Boolean f2703p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.HomeSayHiNewButton$a */
    public class C0226a extends ViewOutlineProvider {
        public C0226a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), t100.q);
        }
    }

    public HomeSayHiNewButton(@NonNull Context context) {
        super(context);
        this.f2702o = "default";
        this.f2703p = null;
    }

    /* JADX INFO: renamed from: d */
    private void m3185d() {
        if (hmb.s1()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getSuperLikeWarpLayout().getLayoutParams();
            if (NullChecker.a(layoutParams)) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                getSuperLikeWarpLayout().setLayoutParams(layoutParams);
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getLikeBtn().getLayoutParams();
            if (NullChecker.a(layoutParams2)) {
                layoutParams2.width = 0;
                layoutParams2.weight = 1.0f;
                getLikeBtn().setLayoutParams(layoutParams2);
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getLikeBtn().getLayoutParams();
            if (NullChecker.a(layoutParams3)) {
                layoutParams3.width = 0;
                layoutParams3.weight = 1.0f;
                getDislikeBtn().setLayoutParams(layoutParams3);
            }
            getSuperLikeLayout().setRoundRadius(getButtonRadius());
            if (NullChecker.a(getUndoLayout())) {
                getUndoLayout().setRoundRadius(getButtonRadius());
                return;
            }
            return;
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) getSuperLikeWarpLayout().getLayoutParams();
        if (NullChecker.a(layoutParams4)) {
            layoutParams4.width = t100.d(48.0f);
            layoutParams4.weight = 0.0f;
            getSuperLikeWarpLayout().setLayoutParams(layoutParams4);
        }
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) getLikeBtn().getLayoutParams();
        if (NullChecker.a(layoutParams5)) {
            layoutParams5.width = t100.d(48.0f);
            layoutParams5.weight = 0.0f;
            getLikeBtn().setLayoutParams(layoutParams5);
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) getDislikeBtn().getLayoutParams();
        if (NullChecker.a(layoutParams6)) {
            layoutParams6.width = t100.d(48.0f);
            layoutParams6.weight = 0.0f;
            getDislikeBtn().setLayoutParams(layoutParams6);
        }
        getSuperLikeLayout().setRoundRadius(0.0f);
        if (NullChecker.a(getUndoLayout())) {
            getUndoLayout().setRoundRadius(0.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m3186e() {
        if (NullChecker.a(this.f2703p)) {
            k3l.INSTANCE.m17283a(getContext(), getSuperLikeComboSvga(), this.f2702o, this.f2703p.booleanValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3187c(View view) {
        y8l.a(this, view);
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
    public /* bridge */ /* synthetic */ int getButtonScrolledDistance() {
        return super.getButtonScrolledDistance();
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getButtonsRightLayout() {
        return super.getButtonsRightLayout();
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
    public /* bridge */ /* synthetic */ FrameLayout.LayoutParams getRootBtnLayoutParams() {
        return super.getRootBtnLayoutParams();
    }

    @Override // p009l.osl
    public View getSayHiNewLayout() {
        return this.f2699l;
    }

    @Override // p009l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f2693f;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f2694g;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p009l.osl
    public VText getSuperLikeRemaining() {
        return this.f2696i;
    }

    @Override // p009l.osl
    public View getSuperLikeWarpLayout() {
        return this.f2692e;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f2689b;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3187c(this);
        this.f2699l.setOutlineProvider(new C0226a());
        this.f2699l.setClipToOutline(true);
        m3185d();
        this.f2701n.getPaint().setFakeBoldText(true);
    }

    @Override // p009l.osl
    public void setButtonStyleType(String str) {
        this.f2702o = str;
        m3186e();
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ void setSuperLikeBtnGray(boolean z) {
        super.setSuperLikeBtnGray(z);
    }

    @Override // p009l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f2703p = Boolean.valueOf(z);
        m3186e();
    }

    @Override // p009l.osl
    public CardOperationButton getDislikeBtn() {
        return this.f2697j;
    }

    @Override // p009l.osl
    public CardOperationButton getLikeBtn() {
        return this.f2698k;
    }

    @Override // p009l.osl
    public CardOperationButton getSuperLike() {
        return this.f2695h;
    }

    @Override // p009l.osl
    @Nullable
    public CardOperationButton getUndo() {
        return this.f2690c;
    }

    public HomeSayHiNewButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2702o = "default";
        this.f2703p = null;
    }

    public HomeSayHiNewButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2702o = "default";
        this.f2703p = null;
    }
}
