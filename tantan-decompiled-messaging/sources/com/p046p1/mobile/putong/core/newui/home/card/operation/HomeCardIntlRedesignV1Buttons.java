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
import p147v.VFrame_FlipContainer;
import p147v.VImage;
import p147v.VText;
import p149l.d5l;
import p149l.k3l;
import p149l.nsl;
import p149l.osl;
import p149l.x2c0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardIntlRedesignV1Buttons extends LinearLayoutCompat implements osl {

    /* JADX INFO: renamed from: a */
    public HomeCardIntlRedesignV1Buttons f22862a;

    /* JADX INFO: renamed from: b */
    public VFrame_FlipContainer f22863b;

    /* JADX INFO: renamed from: c */
    public CardOperationButton f22864c;

    /* JADX INFO: renamed from: d */
    public VText f22865d;

    /* JADX INFO: renamed from: e */
    public CardOperationButton f22866e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f22867f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f22868g;

    /* JADX INFO: renamed from: h */
    public VFrame_FlipContainer f22869h;

    /* JADX INFO: renamed from: i */
    public CardOperationButton f22870i;

    /* JADX INFO: renamed from: j */
    public VText f22871j;

    /* JADX INFO: renamed from: k */
    public CardOperationButton f22872k;

    /* JADX INFO: renamed from: l */
    public VFrame_FlipContainer f22873l;

    /* JADX INFO: renamed from: m */
    public CardOperationButton f22874m;

    /* JADX INFO: renamed from: n */
    public VText f22875n;

    /* JADX INFO: renamed from: o */
    public String f22876o;

    /* JADX INFO: renamed from: p */
    public Boolean f22877p;

    public HomeCardIntlRedesignV1Buttons(Context context) {
        super(context);
        this.f22876o = "default";
        this.f22877p = null;
    }

    /* JADX INFO: renamed from: e */
    private void m38451e() {
        if (NullChecker.m81303a(this.f22877p)) {
            k3l.INSTANCE.m144411a(getContext(), getSuperLikeComboSvga(), this.f22876o, this.f22877p.booleanValue());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m38452d(View view) {
        d5l.m110062a(this, view);
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
    public int getDislikePressBg() {
        return x2c0.f190193h4;
    }

    @Override // p149l.osl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyAndSuperLikeLayout() {
        return super.getImmediatelyAndSuperLikeLayout();
    }

    @Override // p149l.osl
    @Nullable
    public View getImmediatelyMatch() {
        return this.f22873l;
    }

    @Override // p149l.osl
    @Nullable
    public nsl getImmediatelyMatchButton() {
        return this.f22874m;
    }

    @Override // p149l.osl
    public int getLikePressBg() {
        return x2c0.f190637v2;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getNormalBg() {
        return super.getNormalBg();
    }

    @Override // p149l.osl
    public int getOperationBtnBg() {
        return x2c0.f189936Z1;
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
        return this.f22868g;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f22869h;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p149l.osl
    public VText getSuperLikeRemaining() {
        return this.f22871j;
    }

    @Override // p149l.osl
    public View getSuperLikeWarpLayout() {
        return this.f22867f;
    }

    @Override // p149l.osl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f22863b;
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38452d(this);
    }

    @Override // p149l.osl
    public void setButtonStyleType(String str) {
        this.f22876o = str;
        m38451e();
    }

    @Override // p149l.osl
    public /* bridge */ /* synthetic */ void setSuperLikeBtnGray(boolean z) {
        super.setSuperLikeBtnGray(z);
    }

    @Override // p149l.osl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f22877p = Boolean.valueOf(z);
        m38451e();
    }

    @Override // p149l.osl
    public CardOperationButton getDislikeBtn() {
        return this.f22866e;
    }

    @Override // p149l.osl
    public CardOperationButton getLikeBtn() {
        return this.f22872k;
    }

    @Override // p149l.osl
    public CardOperationButton getSuperLike() {
        return this.f22870i;
    }

    @Override // p149l.osl
    @Nullable
    public CardOperationButton getUndo() {
        return this.f22864c;
    }

    public HomeCardIntlRedesignV1Buttons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22876o = "default";
        this.f22877p = null;
    }

    public HomeCardIntlRedesignV1Buttons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22876o = "default";
        this.f22877p = null;
    }
}
