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
import p153l.j9d0;
import p153l.o9d0;
import p153l.qa00;
import p153l.wcd0;

/* JADX INFO: loaded from: classes9.dex */
public class RightProfileCardView extends FrameLayout implements c5m {

    /* JADX INFO: renamed from: a */
    public RightProfileCardView f46956a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f46957b;

    /* JADX INFO: renamed from: c */
    public VText f46958c;

    /* JADX INFO: renamed from: d */
    public VImage f46959d;

    /* JADX INFO: renamed from: e */
    public VImage f46960e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f46961f;

    /* JADX INFO: renamed from: g */
    public VText f46962g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f46963h;

    /* JADX INFO: renamed from: i */
    public VText f46964i;

    /* JADX INFO: renamed from: j */
    public VButton f46965j;

    /* JADX INFO: renamed from: k */
    public d9d0 f46966k;

    /* JADX INFO: renamed from: l */
    public o9d0 f46967l;

    public RightProfileCardView(@NonNull Context context) {
        super(context);
        this.f46967l = new o9d0();
    }

    /* JADX INFO: renamed from: b */
    private void m71825b() {
        this.f46964i.setMaxWidth(bnl0.m105592y0() - qa00.m175859d(44.0f));
    }

    /* JADX INFO: renamed from: a */
    public final void m71826a(View view) {
        wcd0.m205796a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m71827c() {
        this.f46967l.m166710g(this.f46966k);
    }

    /* JADX INFO: renamed from: d */
    public void m71828d() {
        this.f46967l.m166710g(this.f46966k);
    }

    /* JADX INFO: renamed from: e */
    public void m71829e(d9d0 d9d0Var, j9d0 j9d0Var) {
        this.f46966k = d9d0Var;
        this.f46967l.m166718o(d9d0Var, j9d0Var);
    }

    @Override // p153l.c5m
    public /* bridge */ /* synthetic */ CommonMedalView getCommonIconView() {
        return super.getCommonIconView();
    }

    @Override // p153l.c5m
    public VButton getCraftButton() {
        return this.f46965j;
    }

    @Override // p153l.c5m
    public FrameLayout getDescLayout() {
        return this.f46963h;
    }

    @Override // p153l.c5m
    public /* bridge */ /* synthetic */ AnimEffectPlayer getDynamicIcon() {
        return super.getDynamicIcon();
    }

    @Override // p153l.c5m
    public VImage getRightArrowView() {
        return this.f46959d;
    }

    @Override // p153l.c5m
    public ViewGroup getRightContentView() {
        return this.f46957b;
    }

    @Override // p153l.c5m
    public VText getRightDescView() {
        return this.f46964i;
    }

    @Override // p153l.c5m
    public VText getRightDurationView() {
        return this.f46958c;
    }

    @Override // p153l.c5m
    public VDraweeView getRightIconView() {
        return this.f46961f;
    }

    @Override // p153l.c5m
    public VImage getRightLockIconView() {
        return this.f46960e;
    }

    @Override // p153l.c5m
    public VText getRightTitleView() {
        return this.f46962g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71826a(this);
        m71825b();
        this.f46967l.m166708d(this);
    }

    public RightProfileCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46967l = new o9d0();
    }

    public RightProfileCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46967l = new o9d0();
    }
}
