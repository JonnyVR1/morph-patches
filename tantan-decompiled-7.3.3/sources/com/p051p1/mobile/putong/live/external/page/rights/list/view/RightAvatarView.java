package com.p051p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
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
import p153l.c9d0;
import p153l.d9d0;
import p153l.j9d0;
import p153l.o9d0;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class RightAvatarView extends FrameLayout implements c5m {

    /* JADX INFO: renamed from: a */
    public RightAvatarView f46859a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f46860b;

    /* JADX INFO: renamed from: c */
    public VText f46861c;

    /* JADX INFO: renamed from: d */
    public VImage f46862d;

    /* JADX INFO: renamed from: e */
    public VImage f46863e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f46864f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f46865g;

    /* JADX INFO: renamed from: h */
    public VText f46866h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f46867i;

    /* JADX INFO: renamed from: j */
    public VText f46868j;

    /* JADX INFO: renamed from: k */
    public VButton f46869k;

    /* JADX INFO: renamed from: l */
    public d9d0 f46870l;

    /* JADX INFO: renamed from: m */
    public o9d0 f46871m;

    public RightAvatarView(@NonNull Context context) {
        super(context);
        this.f46871m = new o9d0();
    }

    /* JADX INFO: renamed from: a */
    public final void m71750a(View view) {
        c9d0.m108439a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m71751b() {
        this.f46868j.setMaxWidth(((bnl0.m105592y0() - qa00.m175859d(30.0f)) / 2) - qa00.m175859d(24.0f));
    }

    /* JADX INFO: renamed from: c */
    public void m71752c() {
        this.f46871m.m166710g(this.f46870l);
    }

    /* JADX INFO: renamed from: d */
    public void m71753d() {
        this.f46871m.m166710g(this.f46870l);
    }

    /* JADX INFO: renamed from: e */
    public void m71754e(d9d0 d9d0Var, j9d0 j9d0Var) {
        this.f46870l = d9d0Var;
        this.f46871m.m166718o(d9d0Var, j9d0Var);
    }

    @Override // p153l.c5m
    public /* bridge */ /* synthetic */ CommonMedalView getCommonIconView() {
        return super.getCommonIconView();
    }

    @Override // p153l.c5m
    public VButton getCraftButton() {
        return this.f46869k;
    }

    @Override // p153l.c5m
    public FrameLayout getDescLayout() {
        return this.f46867i;
    }

    @Override // p153l.c5m
    public AnimEffectPlayer getDynamicIcon() {
        return this.f46865g;
    }

    @Override // p153l.c5m
    public VImage getRightArrowView() {
        return this.f46863e;
    }

    @Override // p153l.c5m
    public ViewGroup getRightContentView() {
        return this.f46860b;
    }

    @Override // p153l.c5m
    public VText getRightDescView() {
        return this.f46868j;
    }

    @Override // p153l.c5m
    public VText getRightDurationView() {
        return this.f46861c;
    }

    @Override // p153l.c5m
    public VDraweeView getRightIconView() {
        return this.f46864f;
    }

    @Override // p153l.c5m
    public VImage getRightLockIconView() {
        return this.f46862d;
    }

    @Override // p153l.c5m
    public VText getRightTitleView() {
        return this.f46866h;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71750a(this);
        m71751b();
        this.f46871m.m166708d(this);
    }

    public RightAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46871m = new o9d0();
    }

    public RightAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46871m = new o9d0();
    }
}
