package com.p000p1.mobile.putong.core.newui.home.card.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.l3l;
import p009l.k3l;
import p009l.nsl;
import p009l.osl;
import v.VFrame;
import v.VFrame_FlipContainer;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeCardDefaultButtons extends LinearLayoutCompat implements osl {

    /* JADX INFO: renamed from: a */
    public HomeCardDefaultButtons f1519a;

    /* JADX INFO: renamed from: b */
    public VFrame_FlipContainer f1520b;

    /* JADX INFO: renamed from: c */
    public CardOperationButton f1521c;

    /* JADX INFO: renamed from: d */
    public VText f1522d;

    /* JADX INFO: renamed from: e */
    public CardOperationButton f1523e;

    /* JADX INFO: renamed from: f */
    public CardOperationButton f1524f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f1525g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f1526h;

    /* JADX INFO: renamed from: i */
    public VFrame_FlipContainer f1527i;

    /* JADX INFO: renamed from: j */
    public CardOperationButton f1528j;

    /* JADX INFO: renamed from: k */
    public VText f1529k;

    /* JADX INFO: renamed from: l */
    public VFrame f1530l;

    /* JADX INFO: renamed from: m */
    public CardOperationButton f1531m;

    /* JADX INFO: renamed from: n */
    public String f1532n;

    /* JADX INFO: renamed from: o */
    public Boolean f1533o;

    public HomeCardDefaultButtons(Context context) {
        super(context);
        this.f1532n = "default";
        this.f1533o = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m2365d(View view) {
        l3l.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m2366e() {
        if (NullChecker.a(this.f1533o)) {
            k3l.INSTANCE.m17283a(getContext(), getSuperLikeComboSvga(), this.f1532n, this.f1533o.booleanValue());
        }
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getButtonRadius() {
        return super.getButtonRadius();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Nullable
    public /* bridge */ /* synthetic */ View getSayHiNewLayout() {
        return super.getSayHiNewLayout();
    }

    @Override // p009l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f1526h;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f1527i;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p009l.osl
    public VText getSuperLikeRemaining() {
        return this.f1529k;
    }

    @Override // p009l.osl
    public View getSuperLikeWarpLayout() {
        return this.f1525g;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f1520b;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2365d(this);
    }

    @Override // p009l.osl
    public void setButtonStyleType(String str) {
        this.f1532n = str;
        m2366e();
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ void setSuperLikeBtnGray(boolean z) {
        super.setSuperLikeBtnGray(z);
    }

    @Override // p009l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f1533o = Boolean.valueOf(z);
        m2366e();
    }

    @Override // p009l.osl
    public CardOperationButton getDislikeBtn() {
        return this.f1523e;
    }

    @Override // p009l.osl
    public CardOperationButton getLikeBtn() {
        return this.f1524f;
    }

    @Override // p009l.osl
    public CardOperationButton getSuperLike() {
        return this.f1528j;
    }

    @Override // p009l.osl
    @Nullable
    public CardOperationButton getUndo() {
        return this.f1521c;
    }

    public HomeCardDefaultButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1532n = "default";
        this.f1533o = null;
    }

    public HomeCardDefaultButtons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1532n = "default";
        this.f1533o = null;
    }
}
