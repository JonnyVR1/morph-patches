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
import l.d5l;
import l.x2c0;
import p009l.k3l;
import p009l.nsl;
import p009l.osl;
import v.VFrame_FlipContainer;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeCardIntlRedesignV1Buttons extends LinearLayoutCompat implements osl {

    /* JADX INFO: renamed from: a */
    public HomeCardIntlRedesignV1Buttons f1640a;

    /* JADX INFO: renamed from: b */
    public VFrame_FlipContainer f1641b;

    /* JADX INFO: renamed from: c */
    public CardOperationButton f1642c;

    /* JADX INFO: renamed from: d */
    public VText f1643d;

    /* JADX INFO: renamed from: e */
    public CardOperationButton f1644e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f1645f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f1646g;

    /* JADX INFO: renamed from: h */
    public VFrame_FlipContainer f1647h;

    /* JADX INFO: renamed from: i */
    public CardOperationButton f1648i;

    /* JADX INFO: renamed from: j */
    public VText f1649j;

    /* JADX INFO: renamed from: k */
    public CardOperationButton f1650k;

    /* JADX INFO: renamed from: l */
    public VFrame_FlipContainer f1651l;

    /* JADX INFO: renamed from: m */
    public CardOperationButton f1652m;

    /* JADX INFO: renamed from: n */
    public VText f1653n;

    /* JADX INFO: renamed from: o */
    public String f1654o;

    /* JADX INFO: renamed from: p */
    public Boolean f1655p;

    public HomeCardIntlRedesignV1Buttons(Context context) {
        super(context);
        this.f1654o = "default";
        this.f1655p = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    private void m2429e() {
        if (NullChecker.a(this.f1655p)) {
            k3l.INSTANCE.m17283a(getContext(), getSuperLikeComboSvga(), this.f1654o, this.f1655p.booleanValue());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2430d(View view) {
        d5l.a(this, view);
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
    public int getDislikePressBg() {
        return x2c0.h4;
    }

    @Override // p009l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyAndSuperLikeLayout() {
        return super.getImmediatelyAndSuperLikeLayout();
    }

    @Override // p009l.osl
    @Nullable
    public View getImmediatelyMatch() {
        return this.f1651l;
    }

    @Override // p009l.osl
    @Nullable
    public nsl getImmediatelyMatchButton() {
        return this.f1652m;
    }

    @Override // p009l.osl
    public int getLikePressBg() {
        return x2c0.v2;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getNormalBg() {
        return super.getNormalBg();
    }

    @Override // p009l.osl
    public int getOperationBtnBg() {
        return x2c0.Z1;
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
        return this.f1646g;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f1647h;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p009l.osl
    public VText getSuperLikeRemaining() {
        return this.f1649j;
    }

    @Override // p009l.osl
    public View getSuperLikeWarpLayout() {
        return this.f1645f;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f1641b;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2430d(this);
    }

    @Override // p009l.osl
    public void setButtonStyleType(String str) {
        this.f1654o = str;
        m2429e();
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ void setSuperLikeBtnGray(boolean z) {
        super.setSuperLikeBtnGray(z);
    }

    @Override // p009l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f1655p = Boolean.valueOf(z);
        m2429e();
    }

    @Override // p009l.osl
    public CardOperationButton getDislikeBtn() {
        return this.f1644e;
    }

    @Override // p009l.osl
    public CardOperationButton getLikeBtn() {
        return this.f1650k;
    }

    @Override // p009l.osl
    public CardOperationButton getSuperLike() {
        return this.f1648i;
    }

    @Override // p009l.osl
    @Nullable
    public CardOperationButton getUndo() {
        return this.f1642c;
    }

    public HomeCardIntlRedesignV1Buttons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1654o = "default";
        this.f1655p = null;
    }

    public HomeCardIntlRedesignV1Buttons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1654o = "default";
        this.f1655p = null;
    }
}
