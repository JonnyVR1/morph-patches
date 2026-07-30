package com.p051p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.c5m;
import p153l.o9d0;
import p153l.qa00;
import p153l.xbd0;
import p153l.ybd0;

/* JADX INFO: loaded from: classes9.dex */
public class RightMedalItemView extends FrameLayout implements c5m {

    /* JADX INFO: renamed from: a */
    public RightMedalItemView f46926a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f46927b;

    /* JADX INFO: renamed from: c */
    public VText f46928c;

    /* JADX INFO: renamed from: d */
    public VImage f46929d;

    /* JADX INFO: renamed from: e */
    public VImage f46930e;

    /* JADX INFO: renamed from: f */
    public CommonMedalView f46931f;

    /* JADX INFO: renamed from: g */
    public VText f46932g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f46933h;

    /* JADX INFO: renamed from: i */
    public VText f46934i;

    /* JADX INFO: renamed from: j */
    public VButton f46935j;

    /* JADX INFO: renamed from: k */
    public final o9d0 f46936k;

    /* JADX INFO: renamed from: l */
    public xbd0 f46937l;

    public RightMedalItemView(Context context) {
        super(context);
        this.f46936k = new o9d0();
    }

    /* JADX INFO: renamed from: b */
    private void m71801b() {
        this.f46934i.setMaxWidth(((bnl0.m105592y0() - qa00.m175859d(30.0f)) / 2) - qa00.m175859d(24.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m71802a(View view) {
        ybd0.m215018a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m71803c() {
        this.f46936k.m166710g(this.f46937l);
    }

    /* JADX INFO: renamed from: d */
    public void m71804d() {
        this.f46936k.m166710g(this.f46937l);
    }

    /* JADX INFO: renamed from: e */
    public void m71805e(xbd0 xbd0Var) {
        this.f46937l = xbd0Var;
        this.f46936k.m166718o(xbd0Var, xbd0Var.f85764i);
    }

    @Override // p153l.c5m
    public CommonMedalView getCommonIconView() {
        return this.f46931f;
    }

    @Override // p153l.c5m
    public VButton getCraftButton() {
        return this.f46935j;
    }

    @Override // p153l.c5m
    public FrameLayout getDescLayout() {
        return this.f46933h;
    }

    @Override // p153l.c5m
    public /* bridge */ /* synthetic */ AnimEffectPlayer getDynamicIcon() {
        return super.getDynamicIcon();
    }

    @Override // p153l.c5m
    public VImage getRightArrowView() {
        return this.f46930e;
    }

    @Override // p153l.c5m
    public ViewGroup getRightContentView() {
        return this.f46927b;
    }

    @Override // p153l.c5m
    public VText getRightDescView() {
        return this.f46934i;
    }

    @Override // p153l.c5m
    public VText getRightDurationView() {
        return this.f46928c;
    }

    @Override // p153l.c5m
    @Nullable
    public VDraweeView getRightIconView() {
        return null;
    }

    @Override // p153l.c5m
    public VImage getRightLockIconView() {
        return this.f46929d;
    }

    @Override // p153l.c5m
    public VText getRightTitleView() {
        return this.f46932g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71802a(this);
        m71801b();
        this.f46936k.m166708d(this);
    }

    public RightMedalItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46936k = new o9d0();
    }

    public RightMedalItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46936k = new o9d0();
    }
}
