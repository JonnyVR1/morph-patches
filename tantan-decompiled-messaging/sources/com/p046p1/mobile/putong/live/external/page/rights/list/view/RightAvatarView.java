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
import p149l.xdl0;
import p149l.z0d0;

/* JADX INFO: loaded from: classes13.dex */
public class RightAvatarView extends FrameLayout implements j2m {

    /* JADX INFO: renamed from: a */
    public RightAvatarView f46011a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f46012b;

    /* JADX INFO: renamed from: c */
    public VText f46013c;

    /* JADX INFO: renamed from: d */
    public VImage f46014d;

    /* JADX INFO: renamed from: e */
    public VImage f46015e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f46016f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f46017g;

    /* JADX INFO: renamed from: h */
    public VText f46018h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f46019i;

    /* JADX INFO: renamed from: j */
    public VText f46020j;

    /* JADX INFO: renamed from: k */
    public VButton f46021k;

    /* JADX INFO: renamed from: l */
    public a1d0 f46022l;

    /* JADX INFO: renamed from: m */
    public l1d0 f46023m;

    public RightAvatarView(@NonNull Context context) {
        super(context);
        this.f46023m = new l1d0();
    }

    /* JADX INFO: renamed from: a */
    public final void m70567a(View view) {
        z0d0.m216733a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m70568b() {
        this.f46020j.setMaxWidth(((xdl0.m208412y0() - t100.m186890d(30.0f)) / 2) - t100.m186890d(24.0f));
    }

    /* JADX INFO: renamed from: c */
    public void m70569c() {
        this.f46023m.m148163g(this.f46022l);
    }

    /* JADX INFO: renamed from: d */
    public void m70570d() {
        this.f46023m.m148163g(this.f46022l);
    }

    /* JADX INFO: renamed from: e */
    public void m70571e(a1d0 a1d0Var, g1d0 g1d0Var) {
        this.f46022l = a1d0Var;
        this.f46023m.m148171o(a1d0Var, g1d0Var);
    }

    @Override // p149l.j2m
    public /* bridge */ /* synthetic */ CommonMedalView getCommonIconView() {
        return super.getCommonIconView();
    }

    @Override // p149l.j2m
    public VButton getCraftButton() {
        return this.f46021k;
    }

    @Override // p149l.j2m
    public FrameLayout getDescLayout() {
        return this.f46019i;
    }

    @Override // p149l.j2m
    public AnimEffectPlayer getDynamicIcon() {
        return this.f46017g;
    }

    @Override // p149l.j2m
    public VImage getRightArrowView() {
        return this.f46015e;
    }

    @Override // p149l.j2m
    public ViewGroup getRightContentView() {
        return this.f46012b;
    }

    @Override // p149l.j2m
    public VText getRightDescView() {
        return this.f46020j;
    }

    @Override // p149l.j2m
    public VText getRightDurationView() {
        return this.f46013c;
    }

    @Override // p149l.j2m
    public VDraweeView getRightIconView() {
        return this.f46016f;
    }

    @Override // p149l.j2m
    public VImage getRightLockIconView() {
        return this.f46014d;
    }

    @Override // p149l.j2m
    public VText getRightTitleView() {
        return this.f46018h;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70567a(this);
        m70568b();
        this.f46023m.m148161d(this);
    }

    public RightAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46023m = new l1d0();
    }

    public RightAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46023m = new l1d0();
    }
}
