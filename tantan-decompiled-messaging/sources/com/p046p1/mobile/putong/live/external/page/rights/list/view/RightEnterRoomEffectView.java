package com.p046p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.a1d0;
import p149l.c2d0;
import p149l.g1d0;
import p149l.j2m;
import p149l.l1d0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class RightEnterRoomEffectView extends FrameLayout implements j2m {

    /* JADX INFO: renamed from: a */
    public RightEnterRoomEffectView f46042a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f46043b;

    /* JADX INFO: renamed from: c */
    public VText f46044c;

    /* JADX INFO: renamed from: d */
    public VImage f46045d;

    /* JADX INFO: renamed from: e */
    public VImage f46046e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f46047f;

    /* JADX INFO: renamed from: g */
    public VText f46048g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f46049h;

    /* JADX INFO: renamed from: i */
    public VText f46050i;

    /* JADX INFO: renamed from: j */
    public VButton f46051j;

    /* JADX INFO: renamed from: k */
    public a1d0 f46052k;

    /* JADX INFO: renamed from: l */
    public l1d0 f46053l;

    public RightEnterRoomEffectView(Context context) {
        super(context);
        this.f46053l = new l1d0();
    }

    /* JADX INFO: renamed from: b */
    private void m70585b() {
        this.f46050i.setMaxWidth(((xdl0.m208412y0() - t100.m186890d(30.0f)) / 2) - t100.m186890d(24.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m70586a(View view) {
        c2d0.m104906a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m70587c() {
        this.f46053l.m148163g(this.f46052k);
    }

    /* JADX INFO: renamed from: d */
    public void m70588d() {
        this.f46053l.m148163g(this.f46052k);
    }

    /* JADX INFO: renamed from: e */
    public void m70589e(a1d0 a1d0Var, g1d0 g1d0Var) {
        this.f46052k = a1d0Var;
        this.f46053l.m148171o(a1d0Var, g1d0Var);
    }

    @Override // p149l.j2m
    public /* bridge */ /* synthetic */ CommonMedalView getCommonIconView() {
        return super.getCommonIconView();
    }

    @Override // p149l.j2m
    public VButton getCraftButton() {
        return this.f46051j;
    }

    @Override // p149l.j2m
    public FrameLayout getDescLayout() {
        return this.f46049h;
    }

    @Override // p149l.j2m
    public /* bridge */ /* synthetic */ AnimEffectPlayer getDynamicIcon() {
        return super.getDynamicIcon();
    }

    @Override // p149l.j2m
    public VImage getRightArrowView() {
        return this.f46046e;
    }

    @Override // p149l.j2m
    public ViewGroup getRightContentView() {
        return this.f46043b;
    }

    @Override // p149l.j2m
    public VText getRightDescView() {
        return this.f46050i;
    }

    @Override // p149l.j2m
    public VText getRightDurationView() {
        return this.f46044c;
    }

    @Override // p149l.j2m
    public VDraweeView getRightIconView() {
        return this.f46047f;
    }

    @Override // p149l.j2m
    public VImage getRightLockIconView() {
        return this.f46045d;
    }

    @Override // p149l.j2m
    public VText getRightTitleView() {
        return this.f46048g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70586a(this);
        m70585b();
        this.f46053l.m148161d(this);
    }

    public RightEnterRoomEffectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46053l = new l1d0();
    }

    public RightEnterRoomEffectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46053l = new l1d0();
    }
}
