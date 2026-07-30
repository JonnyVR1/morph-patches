package com.p051p1.mobile.putong.core.newui.home.views;

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
import p151v.VFrame_FlipContainer;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.a6l;
import p153l.avl;
import p153l.bvl;
import p153l.nbl;

/* JADX INFO: loaded from: classes11.dex */
public class HomePlatinumButton extends LinearLayout implements bvl {

    /* JADX INFO: renamed from: a */
    public HomePlatinumButton f24636a;

    /* JADX INFO: renamed from: b */
    public VFrame_FlipContainer f24637b;

    /* JADX INFO: renamed from: c */
    public CardOperationButton f24638c;

    /* JADX INFO: renamed from: d */
    public VText f24639d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f24640e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f24641f;

    /* JADX INFO: renamed from: g */
    public VFrame_FlipContainer f24642g;

    /* JADX INFO: renamed from: h */
    public CardOperationButton f24643h;

    /* JADX INFO: renamed from: i */
    public VText f24644i;

    /* JADX INFO: renamed from: j */
    public CardOperationButton f24645j;

    /* JADX INFO: renamed from: k */
    public CardOperationButton f24646k;

    /* JADX INFO: renamed from: l */
    public VLinear f24647l;

    /* JADX INFO: renamed from: m */
    public VImage f24648m;

    /* JADX INFO: renamed from: n */
    public VText f24649n;

    /* JADX INFO: renamed from: o */
    public String f24650o;

    /* JADX INFO: renamed from: p */
    public Boolean f24651p;

    public HomePlatinumButton(@NonNull Context context) {
        super(context);
        this.f24650o = "default";
        this.f24651p = null;
    }

    /* JADX INFO: renamed from: d */
    private void m40170d() {
        if (NullChecker.m82486a(this.f24651p)) {
            a6l.INSTANCE.m96339a(getContext(), getSuperLikeComboSvga(), this.f24650o, this.f24651p.booleanValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m40171c(View view) {
        nbl.m162171a(this, view);
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
    public VImage getPinImage() {
        return this.f24648m;
    }

    @Nullable
    public View getPinLikeLayout() {
        return this.f24647l;
    }

    @Override // p153l.bvl
    @Nullable
    public VText getPinText() {
        return this.f24649n;
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
        return this.f24641f;
    }

    @Override // p153l.bvl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f24642g;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p153l.bvl
    public VText getSuperLikeRemaining() {
        return this.f24644i;
    }

    @Override // p153l.bvl
    public View getSuperLikeWarpLayout() {
        return this.f24640e;
    }

    @Override // p153l.bvl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f24637b;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40171c(this);
    }

    @Override // p153l.bvl
    public void setButtonStyleType(String str) {
        this.f24650o = str;
        m40170d();
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ void setSuperLikeBtnGray(boolean z) {
        super.setSuperLikeBtnGray(z);
    }

    @Override // p153l.bvl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f24651p = Boolean.valueOf(z);
        m40170d();
    }

    @Override // p153l.bvl
    public CardOperationButton getDislikeBtn() {
        return this.f24645j;
    }

    @Override // p153l.bvl
    public CardOperationButton getLikeBtn() {
        return this.f24646k;
    }

    @Override // p153l.bvl
    public CardOperationButton getSuperLike() {
        return this.f24643h;
    }

    @Override // p153l.bvl
    @Nullable
    public CardOperationButton getUndo() {
        return this.f24638c;
    }

    public HomePlatinumButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24650o = "default";
        this.f24651p = null;
    }

    public HomePlatinumButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24650o = "default";
        this.f24651p = null;
    }
}
