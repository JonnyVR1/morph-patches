package com.p051p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.c5m;
import p153l.d9d0;
import p153l.fad0;
import p153l.j9d0;
import p153l.o9d0;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class RightEnterRoomEffectView extends FrameLayout implements c5m {

    /* JADX INFO: renamed from: a */
    public RightEnterRoomEffectView f46890a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f46891b;

    /* JADX INFO: renamed from: c */
    public VText f46892c;

    /* JADX INFO: renamed from: d */
    public VImage f46893d;

    /* JADX INFO: renamed from: e */
    public VImage f46894e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f46895f;

    /* JADX INFO: renamed from: g */
    public VText f46896g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f46897h;

    /* JADX INFO: renamed from: i */
    public VText f46898i;

    /* JADX INFO: renamed from: j */
    public VButton f46899j;

    /* JADX INFO: renamed from: k */
    public d9d0 f46900k;

    /* JADX INFO: renamed from: l */
    public o9d0 f46901l;

    public RightEnterRoomEffectView(Context context) {
        super(context);
        this.f46901l = new o9d0();
    }

    /* JADX INFO: renamed from: b */
    private void m71768b() {
        this.f46898i.setMaxWidth(((bnl0.m105592y0() - qa00.m175859d(30.0f)) / 2) - qa00.m175859d(24.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m71769a(View view) {
        fad0.m124748a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m71770c() {
        this.f46901l.m166710g(this.f46900k);
    }

    /* JADX INFO: renamed from: d */
    public void m71771d() {
        this.f46901l.m166710g(this.f46900k);
    }

    /* JADX INFO: renamed from: e */
    public void m71772e(d9d0 d9d0Var, j9d0 j9d0Var) {
        this.f46900k = d9d0Var;
        this.f46901l.m166718o(d9d0Var, j9d0Var);
    }

    @Override // p153l.c5m
    public /* bridge */ /* synthetic */ CommonMedalView getCommonIconView() {
        return super.getCommonIconView();
    }

    @Override // p153l.c5m
    public VButton getCraftButton() {
        return this.f46899j;
    }

    @Override // p153l.c5m
    public FrameLayout getDescLayout() {
        return this.f46897h;
    }

    @Override // p153l.c5m
    public /* bridge */ /* synthetic */ AnimEffectPlayer getDynamicIcon() {
        return super.getDynamicIcon();
    }

    @Override // p153l.c5m
    public VImage getRightArrowView() {
        return this.f46894e;
    }

    @Override // p153l.c5m
    public ViewGroup getRightContentView() {
        return this.f46891b;
    }

    @Override // p153l.c5m
    public VText getRightDescView() {
        return this.f46898i;
    }

    @Override // p153l.c5m
    public VText getRightDurationView() {
        return this.f46892c;
    }

    @Override // p153l.c5m
    public VDraweeView getRightIconView() {
        return this.f46895f;
    }

    @Override // p153l.c5m
    public VImage getRightLockIconView() {
        return this.f46893d;
    }

    @Override // p153l.c5m
    public VText getRightTitleView() {
        return this.f46896g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71769a(this);
        m71768b();
        this.f46901l.m166708d(this);
    }

    public RightEnterRoomEffectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46901l = new o9d0();
    }

    public RightEnterRoomEffectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46901l = new o9d0();
    }
}
