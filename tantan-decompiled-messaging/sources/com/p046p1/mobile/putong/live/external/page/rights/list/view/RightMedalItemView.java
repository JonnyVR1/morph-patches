package com.p046p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.j2m;
import p149l.l1d0;
import p149l.t100;
import p149l.u3d0;
import p149l.v3d0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class RightMedalItemView extends FrameLayout implements j2m {

    /* JADX INFO: renamed from: a */
    public RightMedalItemView f46078a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f46079b;

    /* JADX INFO: renamed from: c */
    public VText f46080c;

    /* JADX INFO: renamed from: d */
    public VImage f46081d;

    /* JADX INFO: renamed from: e */
    public VImage f46082e;

    /* JADX INFO: renamed from: f */
    public CommonMedalView f46083f;

    /* JADX INFO: renamed from: g */
    public VText f46084g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f46085h;

    /* JADX INFO: renamed from: i */
    public VText f46086i;

    /* JADX INFO: renamed from: j */
    public VButton f46087j;

    /* JADX INFO: renamed from: k */
    public final l1d0 f46088k;

    /* JADX INFO: renamed from: l */
    public u3d0 f46089l;

    public RightMedalItemView(Context context) {
        super(context);
        this.f46088k = new l1d0();
    }

    /* JADX INFO: renamed from: b */
    private void m70618b() {
        this.f46086i.setMaxWidth(((xdl0.m208412y0() - t100.m186890d(30.0f)) / 2) - t100.m186890d(24.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m70619a(View view) {
        v3d0.m196848a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m70620c() {
        this.f46088k.m148163g(this.f46089l);
    }

    /* JADX INFO: renamed from: d */
    public void m70621d() {
        this.f46088k.m148163g(this.f46089l);
    }

    /* JADX INFO: renamed from: e */
    public void m70622e(u3d0 u3d0Var) {
        this.f46089l = u3d0Var;
        this.f46088k.m148171o(u3d0Var, u3d0Var.f67177i);
    }

    @Override // p149l.j2m
    public CommonMedalView getCommonIconView() {
        return this.f46083f;
    }

    @Override // p149l.j2m
    public VButton getCraftButton() {
        return this.f46087j;
    }

    @Override // p149l.j2m
    public FrameLayout getDescLayout() {
        return this.f46085h;
    }

    @Override // p149l.j2m
    public /* bridge */ /* synthetic */ AnimEffectPlayer getDynamicIcon() {
        return super.getDynamicIcon();
    }

    @Override // p149l.j2m
    public VImage getRightArrowView() {
        return this.f46082e;
    }

    @Override // p149l.j2m
    public ViewGroup getRightContentView() {
        return this.f46079b;
    }

    @Override // p149l.j2m
    public VText getRightDescView() {
        return this.f46086i;
    }

    @Override // p149l.j2m
    public VText getRightDurationView() {
        return this.f46080c;
    }

    @Override // p149l.j2m
    @Nullable
    public VDraweeView getRightIconView() {
        return null;
    }

    @Override // p149l.j2m
    public VImage getRightLockIconView() {
        return this.f46081d;
    }

    @Override // p149l.j2m
    public VText getRightTitleView() {
        return this.f46084g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70619a(this);
        m70618b();
        this.f46088k.m148161d(this);
    }

    public RightMedalItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46088k = new l1d0();
    }

    public RightMedalItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46088k = new l1d0();
    }
}
