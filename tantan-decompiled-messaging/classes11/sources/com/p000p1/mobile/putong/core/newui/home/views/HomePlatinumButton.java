package com.p000p1.mobile.putong.core.newui.home.views;

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
import l.x8l;
import p009l.k3l;
import p009l.nsl;
import p009l.osl;
import v.VFrame_FlipContainer;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomePlatinumButton extends LinearLayout implements osl {

    /* JADX INFO: renamed from: a */
    public HomePlatinumButton f2672a;

    /* JADX INFO: renamed from: b */
    public VFrame_FlipContainer f2673b;

    /* JADX INFO: renamed from: c */
    public CardOperationButton f2674c;

    /* JADX INFO: renamed from: d */
    public VText f2675d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f2676e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f2677f;

    /* JADX INFO: renamed from: g */
    public VFrame_FlipContainer f2678g;

    /* JADX INFO: renamed from: h */
    public CardOperationButton f2679h;

    /* JADX INFO: renamed from: i */
    public VText f2680i;

    /* JADX INFO: renamed from: j */
    public CardOperationButton f2681j;

    /* JADX INFO: renamed from: k */
    public CardOperationButton f2682k;

    /* JADX INFO: renamed from: l */
    public VLinear f2683l;

    /* JADX INFO: renamed from: m */
    public VImage f2684m;

    /* JADX INFO: renamed from: n */
    public VText f2685n;

    /* JADX INFO: renamed from: o */
    public String f2686o;

    /* JADX INFO: renamed from: p */
    public Boolean f2687p;

    public HomePlatinumButton(@NonNull Context context) {
        super(context);
        this.f2686o = "default";
        this.f2687p = null;
    }

    /* JADX INFO: renamed from: d */
    private void m3183d() {
        if (NullChecker.a(this.f2687p)) {
            k3l.INSTANCE.m17283a(getContext(), getSuperLikeComboSvga(), this.f2686o, this.f2687p.booleanValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3184c(View view) {
        x8l.a(this, view);
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
    public VImage getPinImage() {
        return this.f2684m;
    }

    @Nullable
    public View getPinLikeLayout() {
        return this.f2683l;
    }

    @Override // p009l.osl
    @Nullable
    public VText getPinText() {
        return this.f2685n;
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
        return this.f2677f;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f2678g;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p009l.osl
    public VText getSuperLikeRemaining() {
        return this.f2680i;
    }

    @Override // p009l.osl
    public View getSuperLikeWarpLayout() {
        return this.f2676e;
    }

    @Override // p009l.osl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f2673b;
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3184c(this);
    }

    @Override // p009l.osl
    public void setButtonStyleType(String str) {
        this.f2686o = str;
        m3183d();
    }

    @Override // p009l.osl
    public /* bridge */ /* synthetic */ void setSuperLikeBtnGray(boolean z) {
        super.setSuperLikeBtnGray(z);
    }

    @Override // p009l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f2687p = Boolean.valueOf(z);
        m3183d();
    }

    @Override // p009l.osl
    public CardOperationButton getDislikeBtn() {
        return this.f2681j;
    }

    @Override // p009l.osl
    public CardOperationButton getLikeBtn() {
        return this.f2682k;
    }

    @Override // p009l.osl
    public CardOperationButton getSuperLike() {
        return this.f2679h;
    }

    @Override // p009l.osl
    @Nullable
    public CardOperationButton getUndo() {
        return this.f2674c;
    }

    public HomePlatinumButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2686o = "default";
        this.f2687p = null;
    }

    public HomePlatinumButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2686o = "default";
        this.f2687p = null;
    }
}
