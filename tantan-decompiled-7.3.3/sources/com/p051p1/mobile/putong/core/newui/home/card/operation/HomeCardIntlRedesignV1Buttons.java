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
import p151v.VFrame_FlipContainer;
import p151v.VImage;
import p151v.VText;
import p153l.a6l;
import p153l.avl;
import p153l.bvl;
import p153l.dbc0;
import p153l.t7l;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardIntlRedesignV1Buttons extends LinearLayoutCompat implements bvl {

    /* JADX INFO: renamed from: a */
    public HomeCardIntlRedesignV1Buttons f23604a;

    /* JADX INFO: renamed from: b */
    public VFrame_FlipContainer f23605b;

    /* JADX INFO: renamed from: c */
    public CardOperationButton f23606c;

    /* JADX INFO: renamed from: d */
    public VText f23607d;

    /* JADX INFO: renamed from: e */
    public CardOperationButton f23608e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f23609f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f23610g;

    /* JADX INFO: renamed from: h */
    public VFrame_FlipContainer f23611h;

    /* JADX INFO: renamed from: i */
    public CardOperationButton f23612i;

    /* JADX INFO: renamed from: j */
    public VText f23613j;

    /* JADX INFO: renamed from: k */
    public CardOperationButton f23614k;

    /* JADX INFO: renamed from: l */
    public VFrame_FlipContainer f23615l;

    /* JADX INFO: renamed from: m */
    public CardOperationButton f23616m;

    /* JADX INFO: renamed from: n */
    public VText f23617n;

    /* JADX INFO: renamed from: o */
    public String f23618o;

    /* JADX INFO: renamed from: p */
    public Boolean f23619p;

    public HomeCardIntlRedesignV1Buttons(Context context) {
        super(context);
        this.f23618o = "default";
        this.f23619p = null;
    }

    /* JADX INFO: renamed from: e */
    private void m39454e() {
        if (NullChecker.m82486a(this.f23619p)) {
            a6l.INSTANCE.m96339a(getContext(), getSuperLikeComboSvga(), this.f23618o, this.f23619p.booleanValue());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m39455d(View view) {
        t7l.m189623a(this, view);
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
    public int getDislikePressBg() {
        return dbc0.f87076i4;
    }

    @Override // p153l.bvl
    @Nullable
    public /* bridge */ /* synthetic */ View getImmediatelyAndSuperLikeLayout() {
        return super.getImmediatelyAndSuperLikeLayout();
    }

    @Override // p153l.bvl
    @Nullable
    public View getImmediatelyMatch() {
        return this.f23615l;
    }

    @Override // p153l.bvl
    @Nullable
    public avl getImmediatelyMatchButton() {
        return this.f23616m;
    }

    @Override // p153l.bvl
    public int getLikePressBg() {
        return dbc0.f87532w2;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getNormalBg() {
        return super.getNormalBg();
    }

    @Override // p153l.bvl
    public int getOperationBtnBg() {
        return dbc0.f86811a2;
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
        return this.f23610g;
    }

    @Override // p153l.bvl
    public VFrame_FlipContainer getSuperLikeLayout() {
        return this.f23611h;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getSuperLikePressBg() {
        return super.getSuperLikePressBg();
    }

    @Override // p153l.bvl
    public VText getSuperLikeRemaining() {
        return this.f23613j;
    }

    @Override // p153l.bvl
    public View getSuperLikeWarpLayout() {
        return this.f23609f;
    }

    @Override // p153l.bvl
    public VFrame_FlipContainer getUndoLayout() {
        return this.f23605b;
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ int getUndoPressBg() {
        return super.getUndoPressBg();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39455d(this);
    }

    @Override // p153l.bvl
    public void setButtonStyleType(String str) {
        this.f23618o = str;
        m39454e();
    }

    @Override // p153l.bvl
    public /* bridge */ /* synthetic */ void setSuperLikeBtnGray(boolean z) {
        super.setSuperLikeBtnGray(z);
    }

    @Override // p153l.bvl
    public void setSuperLikeComboIsSlowly(boolean z) {
        this.f23619p = Boolean.valueOf(z);
        m39454e();
    }

    @Override // p153l.bvl
    public CardOperationButton getDislikeBtn() {
        return this.f23608e;
    }

    @Override // p153l.bvl
    public CardOperationButton getLikeBtn() {
        return this.f23614k;
    }

    @Override // p153l.bvl
    public CardOperationButton getSuperLike() {
        return this.f23612i;
    }

    @Override // p153l.bvl
    @Nullable
    public CardOperationButton getUndo() {
        return this.f23606c;
    }

    public HomeCardIntlRedesignV1Buttons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23618o = "default";
        this.f23619p = null;
    }

    public HomeCardIntlRedesignV1Buttons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23618o = "default";
        this.f23619p = null;
    }
}
