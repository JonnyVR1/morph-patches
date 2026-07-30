package com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.l6u;
import p153l.mbs;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareTopButtonLiveView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f45879a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f45880b;

    /* JADX INFO: renamed from: c */
    public VText f45881c;

    /* JADX INFO: renamed from: d */
    public View f45882d;

    public LiveSquareTopButtonLiveView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70338p(this);
        m70339s();
    }

    /* JADX INFO: renamed from: p */
    public final void m70338p(View view) {
        l6u.m153104a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public final void m70339s() {
        ViewGroup.LayoutParams layoutParams = this.f45880b.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.f45879a.getLayoutParams();
        if (mbs.m157853g().mo31745a().mo192257w()) {
            layoutParams2.height = qa00.m175859d(mbs.m157853g().mo31695I4() ? 32.0f : 36.0f);
            layoutParams2.width = qa00.m175859d(mbs.m157853g().mo31695I4() ? 32.0f : 36.0f);
            layoutParams.width = qa00.m175859d(mbs.m157853g().mo31695I4() ? 32.0f : 36.0f);
            layoutParams.height = qa00.m175859d(mbs.m157853g().mo31695I4() ? 32.0f : 36.0f);
        } else {
            layoutParams2.height = qa00.m175859d(32.0f);
            layoutParams2.width = qa00.m175859d(32.0f);
            layoutParams.width = qa00.m175859d(32.0f);
            layoutParams.height = qa00.m175859d(32.0f);
        }
        this.f45880b.setLayoutParams(layoutParams);
        this.f45879a.setLayoutParams(layoutParams2);
    }

    public LiveSquareTopButtonLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSquareTopButtonLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
