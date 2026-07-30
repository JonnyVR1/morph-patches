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
import p149l.f1d0;
import p149l.g1d0;
import p149l.j2m;
import p149l.l1d0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class RightChatShadingView extends FrameLayout implements j2m {

    /* JADX INFO: renamed from: a */
    public RightChatShadingView f46024a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f46025b;

    /* JADX INFO: renamed from: c */
    public VText f46026c;

    /* JADX INFO: renamed from: d */
    public VImage f46027d;

    /* JADX INFO: renamed from: e */
    public VImage f46028e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f46029f;

    /* JADX INFO: renamed from: g */
    public VText f46030g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f46031h;

    /* JADX INFO: renamed from: i */
    public VText f46032i;

    /* JADX INFO: renamed from: j */
    public VButton f46033j;

    /* JADX INFO: renamed from: k */
    public a1d0 f46034k;

    /* JADX INFO: renamed from: l */
    public l1d0 f46035l;

    public RightChatShadingView(@NonNull Context context) {
        super(context);
        this.f46035l = new l1d0();
    }

    /* JADX INFO: renamed from: b */
    private void m70572b() {
        this.f46032i.setMaxWidth(xdl0.m208412y0() - t100.m186890d(44.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m70573a(View view) {
        f1d0.m119109a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m70574c() {
        this.f46035l.m148163g(this.f46034k);
    }

    /* JADX INFO: renamed from: d */
    public void m70575d() {
        this.f46035l.m148163g(this.f46034k);
    }

    /* JADX INFO: renamed from: e */
    public void m70576e(a1d0 a1d0Var, g1d0 g1d0Var) {
        this.f46034k = a1d0Var;
        this.f46035l.m148171o(a1d0Var, g1d0Var);
    }

    @Override // p149l.j2m
    public /* bridge */ /* synthetic */ CommonMedalView getCommonIconView() {
        return super.getCommonIconView();
    }

    @Override // p149l.j2m
    public VButton getCraftButton() {
        return this.f46033j;
    }

    @Override // p149l.j2m
    public FrameLayout getDescLayout() {
        return this.f46031h;
    }

    @Override // p149l.j2m
    public /* bridge */ /* synthetic */ AnimEffectPlayer getDynamicIcon() {
        return super.getDynamicIcon();
    }

    @Override // p149l.j2m
    public VImage getRightArrowView() {
        return this.f46027d;
    }

    @Override // p149l.j2m
    public ViewGroup getRightContentView() {
        return this.f46025b;
    }

    @Override // p149l.j2m
    public VText getRightDescView() {
        return this.f46032i;
    }

    @Override // p149l.j2m
    public VText getRightDurationView() {
        return this.f46026c;
    }

    @Override // p149l.j2m
    public VDraweeView getRightIconView() {
        return this.f46029f;
    }

    @Override // p149l.j2m
    public VImage getRightLockIconView() {
        return this.f46028e;
    }

    @Override // p149l.j2m
    public VText getRightTitleView() {
        return this.f46030g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70573a(this);
        m70572b();
        this.f46035l.m148161d(this);
    }

    public RightChatShadingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46035l = new l1d0();
    }

    public RightChatShadingView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46035l = new l1d0();
    }
}
