package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame_FlipContainer;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.k3l;
import p149l.nsl;
import p149l.osl;
import p149l.x8l;

/* JADX INFO: loaded from: classes11.dex */
public class HomePlatinumButton extends LinearLayout implements osl {

    /* JADX INFO: renamed from: a */
    public HomePlatinumButton f23894a;

    /* JADX INFO: renamed from: b */
    public VFrame_FlipContainer f23895b;

    /* JADX INFO: renamed from: c */
    public CardOperationButton f23896c;

    /* JADX INFO: renamed from: d */
    public VText f23897d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f23898e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f23899f;

    /* JADX INFO: renamed from: g */
    public VFrame_FlipContainer f23900g;

    /* JADX INFO: renamed from: h */
    public CardOperationButton f23901h;

    /* JADX INFO: renamed from: i */
    public VText f23902i;

    /* JADX INFO: renamed from: j */
    public CardOperationButton f23903j;

    /* JADX INFO: renamed from: k */
    public CardOperationButton f23904k;

    /* JADX INFO: renamed from: l */
    public VLinear f23905l;

    /* JADX INFO: renamed from: m */
    public VImage f23906m;

    /* JADX INFO: renamed from: n */
    public VText f23907n;

    /* JADX INFO: renamed from: o */
    public String f23908o;

    /* JADX INFO: renamed from: p */
    public Boolean f23909p;

    public HomePlatinumButton(@NonNull Context context) {
        super(context);
        this.f23908o = "default";
        this.f23909p = null;
    }

    /* JADX INFO: renamed from: d */
    private void m39167d() {
        if (NullChecker.m81303a(this.f23909p)) {
            k3l.INSTANCE.m144411a(getContext(), getSuperLikeComboSvga(), this.f23908o, this.f23909p.booleanValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m39168c(View view) {
        x8l.m207421a(this, view);
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
    public VImage getPinImage() {
        return this.f23906m;
    }

    @Nullable
    public View getPinLikeLayout() {
        return this.f23905l;
    }

    @Override // p149l.osl
    @Nullable
    public VText getPinText() {
        return this.f23907n;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ FrameLayout.LayoutParams getRootBtnLayoutParams() {
        return super.getRootBtnLayoutParams();
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getSayHiNewLayout() {
        return super.getSayHiNewLayout();
    }

    @Override // p149l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f23899f;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f23900g;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p149l.osl
    public VText getSuperLikeRemaining() {
        return this.f23902i;
    }

    @Override // p149l.osl
    public View getSuperLikeWarpLayout() {
        return this.f23898e;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f23895b;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39168c(this);
    }

    @Override // p149l.osl
    public void setButtonStyleType(String str) {
        this.f23908o = str;
        m39167d();
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ void setSuperLikeBtnGray(boolean z) {
        super.setSuperLikeBtnGray(z);
    }

    @Override // p149l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f23909p = Boolean.valueOf(z);
        m39167d();
    }

    @Override // p149l.osl
    public CardOperationButton getDislikeBtn() {
        return this.f23903j;
    }

    @Override // p149l.osl
    public CardOperationButton getLikeBtn() {
        return this.f23904k;
    }

    @Override // p149l.osl
    public CardOperationButton getSuperLike() {
        return this.f23901h;
    }

    @Override // p149l.osl
    @Nullable
    public CardOperationButton getUndo() {
        return this.f23896c;
    }

    public HomePlatinumButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23908o = "default";
        this.f23909p = null;
    }

    public HomePlatinumButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23908o = "default";
        this.f23909p = null;
    }
}
