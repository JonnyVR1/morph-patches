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
import p153l.d9d0;
import p153l.i9d0;
import p153l.j9d0;
import p153l.o9d0;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class RightChatShadingView extends FrameLayout implements c5m {

    /* JADX INFO: renamed from: a */
    public RightChatShadingView f46872a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f46873b;

    /* JADX INFO: renamed from: c */
    public VText f46874c;

    /* JADX INFO: renamed from: d */
    public VImage f46875d;

    /* JADX INFO: renamed from: e */
    public VImage f46876e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f46877f;

    /* JADX INFO: renamed from: g */
    public VText f46878g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f46879h;

    /* JADX INFO: renamed from: i */
    public VText f46880i;

    /* JADX INFO: renamed from: j */
    public VButton f46881j;

    /* JADX INFO: renamed from: k */
    public d9d0 f46882k;

    /* JADX INFO: renamed from: l */
    public o9d0 f46883l;

    public RightChatShadingView(@NonNull Context context) {
        super(context);
        this.f46883l = new o9d0();
    }

    /* JADX INFO: renamed from: b */
    private void m71755b() {
        this.f46880i.setMaxWidth(bnl0.m105592y0() - qa00.m175859d(44.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m71756a(View view) {
        i9d0.m139093a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m71757c() {
        this.f46883l.m166710g(this.f46882k);
    }

    /* JADX INFO: renamed from: d */
    public void m71758d() {
        this.f46883l.m166710g(this.f46882k);
    }

    /* JADX INFO: renamed from: e */
    public void m71759e(d9d0 d9d0Var, j9d0 j9d0Var) {
        this.f46882k = d9d0Var;
        this.f46883l.m166718o(d9d0Var, j9d0Var);
    }

    @Override // p153l.c5m
    public /* bridge */ /* synthetic */ CommonMedalView getCommonIconView() {
        return super.getCommonIconView();
    }

    @Override // p153l.c5m
    public VButton getCraftButton() {
        return this.f46881j;
    }

    @Override // p153l.c5m
    public FrameLayout getDescLayout() {
        return this.f46879h;
    }

    @Override // p153l.c5m
    public /* bridge */ /* synthetic */ AnimEffectPlayer getDynamicIcon() {
        return super.getDynamicIcon();
    }

    @Override // p153l.c5m
    public VImage getRightArrowView() {
        return this.f46875d;
    }

    @Override // p153l.c5m
    public ViewGroup getRightContentView() {
        return this.f46873b;
    }

    @Override // p153l.c5m
    public VText getRightDescView() {
        return this.f46880i;
    }

    @Override // p153l.c5m
    public VText getRightDurationView() {
        return this.f46874c;
    }

    @Override // p153l.c5m
    public VDraweeView getRightIconView() {
        return this.f46877f;
    }

    @Override // p153l.c5m
    public VImage getRightLockIconView() {
        return this.f46876e;
    }

    @Override // p153l.c5m
    public VText getRightTitleView() {
        return this.f46878g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71756a(this);
        m71755b();
        this.f46883l.m166708d(this);
    }

    public RightChatShadingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46883l = new o9d0();
    }

    public RightChatShadingView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46883l = new o9d0();
    }
}
