package com.p051p1.mobile.putong.core.newui.home.views;

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
import p151v.VFrame_FlipContainer;
import p151v.VImage;
import p151v.VText;
import p153l.a6l;
import p153l.avl;
import p153l.bvl;
import p153l.obl;
import p153l.qa00;
import p153l.vnb;

/* JADX INFO: loaded from: classes11.dex */
public class HomeSayHiNewButton extends LinearLayout implements bvl {

    /* JADX INFO: renamed from: a */
    public HomeSayHiNewButton f24652a;

    /* JADX INFO: renamed from: b */
    public VFrame_FlipContainer f24653b;

    /* JADX INFO: renamed from: c */
    public CardOperationButton f24654c;

    /* JADX INFO: renamed from: d */
    public VText f24655d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f24656e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f24657f;

    /* JADX INFO: renamed from: g */
    public VFrame_FlipContainer f24658g;

    /* JADX INFO: renamed from: h */
    public CardOperationButton f24659h;

    /* JADX INFO: renamed from: i */
    public VText f24660i;

    /* JADX INFO: renamed from: j */
    public CardOperationButton f24661j;

    /* JADX INFO: renamed from: k */
    public CardOperationButton f24662k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f24663l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f24664m;

    /* JADX INFO: renamed from: n */
    public VText f24665n;

    /* JADX INFO: renamed from: o */
    public String f24666o;

    /* JADX INFO: renamed from: p */
    public Boolean f24667p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.HomeSayHiNewButton$a */
    public class C8213a extends ViewOutlineProvider {
        public C8213a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), qa00.f156330q);
        }
    }

    public HomeSayHiNewButton(@NonNull Context context) {
        super(context);
        this.f24666o = "default";
        this.f24667p = null;
    }

    /* JADX INFO: renamed from: d */
    private void m40172d() {
        if (vnb.m201959s1()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getSuperLikeWarpLayout().getLayoutParams();
            if (NullChecker.m82486a(layoutParams)) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                getSuperLikeWarpLayout().setLayoutParams(layoutParams);
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getLikeBtn().getLayoutParams();
            if (NullChecker.m82486a(layoutParams2)) {
                layoutParams2.width = 0;
                layoutParams2.weight = 1.0f;
                getLikeBtn().setLayoutParams(layoutParams2);
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getLikeBtn().getLayoutParams();
            if (NullChecker.m82486a(layoutParams3)) {
                layoutParams3.width = 0;
                layoutParams3.weight = 1.0f;
                getDislikeBtn().setLayoutParams(layoutParams3);
            }
            getSuperLikeLayout().setRoundRadius(getButtonRadius());
            if (NullChecker.m82486a(getUndoLayout())) {
                getUndoLayout().setRoundRadius(getButtonRadius());
                return;
            }
            return;
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) getSuperLikeWarpLayout().getLayoutParams();
        if (NullChecker.m82486a(layoutParams4)) {
            layoutParams4.width = qa00.m175859d(48.0f);
            layoutParams4.weight = 0.0f;
            getSuperLikeWarpLayout().setLayoutParams(layoutParams4);
        }
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) getLikeBtn().getLayoutParams();
        if (NullChecker.m82486a(layoutParams5)) {
            layoutParams5.width = qa00.m175859d(48.0f);
            layoutParams5.weight = 0.0f;
            getLikeBtn().setLayoutParams(layoutParams5);
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) getDislikeBtn().getLayoutParams();
        if (NullChecker.m82486a(layoutParams6)) {
            layoutParams6.width = qa00.m175859d(48.0f);
            layoutParams6.weight = 0.0f;
            getDislikeBtn().setLayoutParams(layoutParams6);
        }
        getSuperLikeLayout().setRoundRadius(0.0f);
        if (NullChecker.m82486a(getUndoLayout())) {
            getUndoLayout().setRoundRadius(0.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m40173e() {
        if (NullChecker.m82486a(this.f24667p)) {
            a6l.INSTANCE.m96339a(getContext(), getSuperLikeComboSvga(), this.f24666o, this.f24667p.booleanValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m40174c(View view) {
        obl.m167032a(this, view);
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getButtonRadius() {
        return super.getButtonRadius();
    }

    @Override // p153l.bvl
    public ViewGroup getButtonRootLayout() {
        return this;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getButtonScrolledDistance() {
        return super.getButtonScrolledDistance();
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ View getButtonsRightLayout() {
        return super.getButtonsRightLayout();
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getDislikePressBg() {
        return super.getDislikePressBg();
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyAndSuperLikeLayout() {
        return super.getImmediatelyAndSuperLikeLayout();
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyMatch() {
        return super.getImmediatelyMatch();
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ avl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getLikePressBg() {
        return super.getLikePressBg();
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getNormalBg() {
        return super.getNormalBg();
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getOperationBtnBg() {
        return super.getOperationBtnBg();
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
    public /* bridge */ /* synthetic */ FrameLayout.LayoutParams getRootBtnLayoutParams() {
        return super.getRootBtnLayoutParams();
    }

    @Override // p153l.bvl
    public View getSayHiNewLayout() {
        return this.f24663l;
    }

    @Override // p153l.bvl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f24657f;
    }

    @Override // p153l.bvl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f24658g;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p153l.bvl
    public VText getSuperLikeRemaining() {
        return this.f24660i;
    }

    @Override // p153l.bvl
    public View getSuperLikeWarpLayout() {
        return this.f24656e;
    }

    @Override // p153l.bvl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f24653b;
    }

    @Override // p153l.bvl
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
        m40174c(this);
        this.f24663l.setOutlineProvider(new C8213a());
        this.f24663l.setClipToOutline(true);
        m40172d();
        this.f24665n.getPaint().setFakeBoldText(true);
    }

    @Override // p153l.bvl
    public void setButtonStyleType(String str) {
        this.f24666o = str;
        m40173e();
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ void setSuperLikeBtnGray(boolean z) {
        super.setSuperLikeBtnGray(z);
    }

    @Override // p153l.bvl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f24667p = Boolean.valueOf(z);
        m40173e();
    }

    @Override // p153l.bvl
    public CardOperationButton getDislikeBtn() {
        return this.f24661j;
    }

    @Override // p153l.bvl
    public CardOperationButton getLikeBtn() {
        return this.f24662k;
    }

    @Override // p153l.bvl
    public CardOperationButton getSuperLike() {
        return this.f24659h;
    }

    @Override // p153l.bvl
    @Nullable
    public CardOperationButton getUndo() {
        return this.f24654c;
    }

    public HomeSayHiNewButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24666o = "default";
        this.f24667p = null;
    }

    public HomeSayHiNewButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24666o = "default";
        this.f24667p = null;
    }
}
