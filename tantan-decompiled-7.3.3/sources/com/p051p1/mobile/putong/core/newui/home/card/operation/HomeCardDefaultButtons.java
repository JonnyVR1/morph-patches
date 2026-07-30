package com.p051p1.mobile.putong.core.newui.home.card.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VFrame_FlipContainer;
import p151v.VImage;
import p151v.VText;
import p153l.a6l;
import p153l.avl;
import p153l.b6l;
import p153l.bvl;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardDefaultButtons extends LinearLayoutCompat implements bvl {

    /* JADX INFO: renamed from: a */
    public HomeCardDefaultButtons f23483a;

    /* JADX INFO: renamed from: b */
    public VFrame_FlipContainer f23484b;

    /* JADX INFO: renamed from: c */
    public CardOperationButton f23485c;

    /* JADX INFO: renamed from: d */
    public VText f23486d;

    /* JADX INFO: renamed from: e */
    public CardOperationButton f23487e;

    /* JADX INFO: renamed from: f */
    public CardOperationButton f23488f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f23489g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f23490h;

    /* JADX INFO: renamed from: i */
    public VFrame_FlipContainer f23491i;

    /* JADX INFO: renamed from: j */
    public CardOperationButton f23492j;

    /* JADX INFO: renamed from: k */
    public VText f23493k;

    /* JADX INFO: renamed from: l */
    public VFrame f23494l;

    /* JADX INFO: renamed from: m */
    public CardOperationButton f23495m;

    /* JADX INFO: renamed from: n */
    public String f23496n;

    /* JADX INFO: renamed from: o */
    public Boolean f23497o;

    public HomeCardDefaultButtons(Context context) {
        super(context);
        this.f23496n = "default";
        this.f23497o = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m39390d(View view) {
        b6l.m102769a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m39391e() {
        if (NullChecker.m82486a(this.f23497o)) {
            a6l.INSTANCE.m96339a(getContext(), getSuperLikeComboSvga(), this.f23496n, this.f23497o.booleanValue());
        }
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
    @Nullable
    public /* bridge */ /* synthetic */ View getSayHiNewLayout() {
        return super.getSayHiNewLayout();
    }

    @Override // p153l.bvl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f23490h;
    }

    @Override // p153l.bvl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f23491i;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p153l.bvl
    public VText getSuperLikeRemaining() {
        return this.f23493k;
    }

    @Override // p153l.bvl
    public View getSuperLikeWarpLayout() {
        return this.f23489g;
    }

    @Override // p153l.bvl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f23484b;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39390d(this);
    }

    @Override // p153l.bvl
    public void setButtonStyleType(String str) {
        this.f23496n = str;
        m39391e();
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ void setSuperLikeBtnGray(boolean z) {
        super.setSuperLikeBtnGray(z);
    }

    @Override // p153l.bvl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f23497o = Boolean.valueOf(z);
        m39391e();
    }

    @Override // p153l.bvl
    public CardOperationButton getDislikeBtn() {
        return this.f23487e;
    }

    @Override // p153l.bvl
    public CardOperationButton getLikeBtn() {
        return this.f23488f;
    }

    @Override // p153l.bvl
    public CardOperationButton getSuperLike() {
        return this.f23492j;
    }

    @Override // p153l.bvl
    @Nullable
    public CardOperationButton getUndo() {
        return this.f23485c;
    }

    public HomeCardDefaultButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23496n = "default";
        this.f23497o = null;
    }

    public HomeCardDefaultButtons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23496n = "default";
        this.f23497o = null;
    }
}
