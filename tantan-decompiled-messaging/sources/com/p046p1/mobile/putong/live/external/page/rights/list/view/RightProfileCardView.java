package com.p046p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.a1d0;
import p149l.g1d0;
import p149l.j2m;
import p149l.l1d0;
import p149l.t100;
import p149l.t4d0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class RightProfileCardView extends FrameLayout implements j2m {

    /* JADX INFO: renamed from: a */
    public RightProfileCardView f46108a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f46109b;

    /* JADX INFO: renamed from: c */
    public VText f46110c;

    /* JADX INFO: renamed from: d */
    public VImage f46111d;

    /* JADX INFO: renamed from: e */
    public VImage f46112e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f46113f;

    /* JADX INFO: renamed from: g */
    public VText f46114g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f46115h;

    /* JADX INFO: renamed from: i */
    public VText f46116i;

    /* JADX INFO: renamed from: j */
    public VButton f46117j;

    /* JADX INFO: renamed from: k */
    public a1d0 f46118k;

    /* JADX INFO: renamed from: l */
    public l1d0 f46119l;

    public RightProfileCardView(@NonNull Context context) {
        super(context);
        this.f46119l = new l1d0();
    }

    /* JADX INFO: renamed from: b */
    private void m70642b() {
        this.f46116i.setMaxWidth(xdl0.m208412y0() - t100.m186890d(44.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m70643a(View view) {
        t4d0.m187177a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m70644c() {
        this.f46119l.m148163g(this.f46118k);
    }

    /* JADX INFO: renamed from: d */
    public void m70645d() {
        this.f46119l.m148163g(this.f46118k);
    }

    /* JADX INFO: renamed from: e */
    public void m70646e(a1d0 a1d0Var, g1d0 g1d0Var) {
        this.f46118k = a1d0Var;
        this.f46119l.m148171o(a1d0Var, g1d0Var);
    }

    @Override // p149l.j2m
    public /* bridge */ /* synthetic */ CommonMedalView getCommonIconView() {
        return super.getCommonIconView();
    }

    @Override // p149l.j2m
    public VButton getCraftButton() {
        return this.f46117j;
    }

    @Override // p149l.j2m
    public FrameLayout getDescLayout() {
        return this.f46115h;
    }

    @Override // p149l.j2m
    public /* bridge */ /* synthetic */ AnimEffectPlayer getDynamicIcon() {
        return super.getDynamicIcon();
    }

    @Override // p149l.j2m
    public VImage getRightArrowView() {
        return this.f46111d;
    }

    @Override // p149l.j2m
    public ViewGroup getRightContentView() {
        return this.f46109b;
    }

    @Override // p149l.j2m
    public VText getRightDescView() {
        return this.f46116i;
    }

    @Override // p149l.j2m
    public VText getRightDurationView() {
        return this.f46110c;
    }

    @Override // p149l.j2m
    public VDraweeView getRightIconView() {
        return this.f46113f;
    }

    @Override // p149l.j2m
    public VImage getRightLockIconView() {
        return this.f46112e;
    }

    @Override // p149l.j2m
    public VText getRightTitleView() {
        return this.f46114g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70643a(this);
        m70642b();
        this.f46119l.m148161d(this);
    }

    public RightProfileCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46119l = new l1d0();
    }

    public RightProfileCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46119l = new l1d0();
    }
}
