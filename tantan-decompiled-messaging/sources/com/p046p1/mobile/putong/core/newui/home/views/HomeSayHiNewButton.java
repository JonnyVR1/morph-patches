package com.p046p1.mobile.putong.core.newui.home.views;

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
import p147v.VFrame_FlipContainer;
import p147v.VImage;
import p147v.VText;
import p149l.hmb;
import p149l.k3l;
import p149l.nsl;
import p149l.osl;
import p149l.t100;
import p149l.y8l;

/* JADX INFO: loaded from: classes11.dex */
public class HomeSayHiNewButton extends LinearLayout implements osl {

    /* JADX INFO: renamed from: a */
    public HomeSayHiNewButton f23910a;

    /* JADX INFO: renamed from: b */
    public VFrame_FlipContainer f23911b;

    /* JADX INFO: renamed from: c */
    public CardOperationButton f23912c;

    /* JADX INFO: renamed from: d */
    public VText f23913d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f23914e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f23915f;

    /* JADX INFO: renamed from: g */
    public VFrame_FlipContainer f23916g;

    /* JADX INFO: renamed from: h */
    public CardOperationButton f23917h;

    /* JADX INFO: renamed from: i */
    public VText f23918i;

    /* JADX INFO: renamed from: j */
    public CardOperationButton f23919j;

    /* JADX INFO: renamed from: k */
    public CardOperationButton f23920k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f23921l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f23922m;

    /* JADX INFO: renamed from: n */
    public VText f23923n;

    /* JADX INFO: renamed from: o */
    public String f23924o;

    /* JADX INFO: renamed from: p */
    public Boolean f23925p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.HomeSayHiNewButton$a */
    public class C8062a extends ViewOutlineProvider {
        public C8062a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), t100.f167268q);
        }
    }

    public HomeSayHiNewButton(@NonNull Context context) {
        super(context);
        this.f23924o = "default";
        this.f23925p = null;
    }

    /* JADX INFO: renamed from: d */
    private void m39169d() {
        if (hmb.m131714s1()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getSuperLikeWarpLayout().getLayoutParams();
            if (NullChecker.m81303a(layoutParams)) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                getSuperLikeWarpLayout().setLayoutParams(layoutParams);
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getLikeBtn().getLayoutParams();
            if (NullChecker.m81303a(layoutParams2)) {
                layoutParams2.width = 0;
                layoutParams2.weight = 1.0f;
                getLikeBtn().setLayoutParams(layoutParams2);
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getLikeBtn().getLayoutParams();
            if (NullChecker.m81303a(layoutParams3)) {
                layoutParams3.width = 0;
                layoutParams3.weight = 1.0f;
                getDislikeBtn().setLayoutParams(layoutParams3);
            }
            getSuperLikeLayout().setRoundRadius(getButtonRadius());
            if (NullChecker.m81303a(getUndoLayout())) {
                getUndoLayout().setRoundRadius(getButtonRadius());
                return;
            }
            return;
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) getSuperLikeWarpLayout().getLayoutParams();
        if (NullChecker.m81303a(layoutParams4)) {
            layoutParams4.width = t100.m186890d(48.0f);
            layoutParams4.weight = 0.0f;
            getSuperLikeWarpLayout().setLayoutParams(layoutParams4);
        }
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) getLikeBtn().getLayoutParams();
        if (NullChecker.m81303a(layoutParams5)) {
            layoutParams5.width = t100.m186890d(48.0f);
            layoutParams5.weight = 0.0f;
            getLikeBtn().setLayoutParams(layoutParams5);
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) getDislikeBtn().getLayoutParams();
        if (NullChecker.m81303a(layoutParams6)) {
            layoutParams6.width = t100.m186890d(48.0f);
            layoutParams6.weight = 0.0f;
            getDislikeBtn().setLayoutParams(layoutParams6);
        }
        getSuperLikeLayout().setRoundRadius(0.0f);
        if (NullChecker.m81303a(getUndoLayout())) {
            getUndoLayout().setRoundRadius(0.0f);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m39170e() {
        if (NullChecker.m81303a(this.f23925p)) {
            k3l.INSTANCE.m144411a(getContext(), getSuperLikeComboSvga(), this.f23924o, this.f23925p.booleanValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m39171c(View view) {
        y8l.m213409a(this, view);
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getButtonRadius() {
        return super.getButtonRadius();
    }

    @Override // p149l.osl
    public ViewGroup getButtonRootLayout() {
        return this;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getButtonScrolledDistance() {
        return super.getButtonScrolledDistance();
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getButtonsRightLayout() {
        return super.getButtonsRightLayout();
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getDislikePressBg() {
        return super.getDislikePressBg();
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyAndSuperLikeLayout() {
        return super.getImmediatelyAndSuperLikeLayout();
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyMatch() {
        return super.getImmediatelyMatch();
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ nsl getImmediatelyMatchButton() {
        return super.getImmediatelyMatchButton();
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getLikePressBg() {
        return super.getLikePressBg();
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getNormalBg() {
        return super.getNormalBg();
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getOperationBtnBg() {
        return super.getOperationBtnBg();
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
    public /* bridge */ /* synthetic */ FrameLayout.LayoutParams getRootBtnLayoutParams() {
        return super.getRootBtnLayoutParams();
    }

    @Override // p149l.osl
    public View getSayHiNewLayout() {
        return this.f23921l;
    }

    @Override // p149l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f23915f;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f23916g;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p149l.osl
    public VText getSuperLikeRemaining() {
        return this.f23918i;
    }

    @Override // p149l.osl
    public View getSuperLikeWarpLayout() {
        return this.f23914e;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f23911b;
    }

    @Override // p149l.osl
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
        m39171c(this);
        this.f23921l.setOutlineProvider(new C8062a());
        this.f23921l.setClipToOutline(true);
        m39169d();
        this.f23923n.getPaint().setFakeBoldText(true);
    }

    @Override // p149l.osl
    public void setButtonStyleType(String str) {
        this.f23924o = str;
        m39170e();
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ void setSuperLikeBtnGray(boolean z) {
        super.setSuperLikeBtnGray(z);
    }

    @Override // p149l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f23925p = Boolean.valueOf(z);
        m39170e();
    }

    @Override // p149l.osl
    public CardOperationButton getDislikeBtn() {
        return this.f23919j;
    }

    @Override // p149l.osl
    public CardOperationButton getLikeBtn() {
        return this.f23920k;
    }

    @Override // p149l.osl
    public CardOperationButton getSuperLike() {
        return this.f23917h;
    }

    @Override // p149l.osl
    @Nullable
    public CardOperationButton getUndo() {
        return this.f23912c;
    }

    public HomeSayHiNewButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23924o = "default";
        this.f23925p = null;
    }

    public HomeSayHiNewButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23924o = "default";
        this.f23925p = null;
    }
}
