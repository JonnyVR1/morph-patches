package com.p046p1.mobile.putong.core.newui.home.card.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VFrame_FlipContainer;
import p147v.VImage;
import p147v.VText;
import p149l.k3l;
import p149l.l3l;
import p149l.nsl;
import p149l.osl;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardDefaultButtons extends LinearLayoutCompat implements osl {

    /* JADX INFO: renamed from: a */
    public HomeCardDefaultButtons f22741a;

    /* JADX INFO: renamed from: b */
    public VFrame_FlipContainer f22742b;

    /* JADX INFO: renamed from: c */
    public CardOperationButton f22743c;

    /* JADX INFO: renamed from: d */
    public VText f22744d;

    /* JADX INFO: renamed from: e */
    public CardOperationButton f22745e;

    /* JADX INFO: renamed from: f */
    public CardOperationButton f22746f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f22747g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f22748h;

    /* JADX INFO: renamed from: i */
    public VFrame_FlipContainer f22749i;

    /* JADX INFO: renamed from: j */
    public CardOperationButton f22750j;

    /* JADX INFO: renamed from: k */
    public VText f22751k;

    /* JADX INFO: renamed from: l */
    public VFrame f22752l;

    /* JADX INFO: renamed from: m */
    public CardOperationButton f22753m;

    /* JADX INFO: renamed from: n */
    public String f22754n;

    /* JADX INFO: renamed from: o */
    public Boolean f22755o;

    public HomeCardDefaultButtons(Context context) {
        super(context);
        this.f22754n = "default";
        this.f22755o = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m38387d(View view) {
        l3l.m148402a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m38388e() {
        if (NullChecker.m81303a(this.f22755o)) {
            k3l.INSTANCE.m144411a(getContext(), getSuperLikeComboSvga(), this.f22754n, this.f22755o.booleanValue());
        }
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
    @Nullable
    public /* bridge */ /* synthetic */ View getSayHiNewLayout() {
        return super.getSayHiNewLayout();
    }

    @Override // p149l.osl
    public SVGAnimationView getSuperLikeComboSvga() {
        return this.f22748h;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f22749i;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p149l.osl
    public VText getSuperLikeRemaining() {
        return this.f22751k;
    }

    @Override // p149l.osl
    public View getSuperLikeWarpLayout() {
        return this.f22747g;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f22742b;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38387d(this);
    }

    @Override // p149l.osl
    public void setButtonStyleType(String str) {
        this.f22754n = str;
        m38388e();
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ void setSuperLikeBtnGray(boolean z) {
        super.setSuperLikeBtnGray(z);
    }

    @Override // p149l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f22755o = Boolean.valueOf(z);
        m38388e();
    }

    @Override // p149l.osl
    public CardOperationButton getDislikeBtn() {
        return this.f22745e;
    }

    @Override // p149l.osl
    public CardOperationButton getLikeBtn() {
        return this.f22746f;
    }

    @Override // p149l.osl
    public CardOperationButton getSuperLike() {
        return this.f22750j;
    }

    @Override // p149l.osl
    @Nullable
    public CardOperationButton getUndo() {
        return this.f22743c;
    }

    public HomeCardDefaultButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22754n = "default";
        this.f22755o = null;
    }

    public HomeCardDefaultButtons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22754n = "default";
        this.f22755o = null;
    }
}
