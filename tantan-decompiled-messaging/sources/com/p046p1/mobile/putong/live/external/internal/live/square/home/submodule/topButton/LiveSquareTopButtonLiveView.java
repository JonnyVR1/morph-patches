package com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.k4u;
import p149l.l9s;
import p149l.t100;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareTopButtonLiveView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f45031a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f45032b;

    /* JADX INFO: renamed from: c */
    public VText f45033c;

    /* JADX INFO: renamed from: d */
    public View f45034d;

    public LiveSquareTopButtonLiveView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69155p(this);
        m69156s();
    }

    /* JADX INFO: renamed from: p */
    public final void m69155p(View view) {
        k4u.m144513a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public final void m69156s() {
        ViewGroup.LayoutParams layoutParams = this.f45032b.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.f45031a.getLayoutParams();
        if (l9s.m149076g().mo30742a().mo165314w()) {
            layoutParams2.height = t100.m186890d(l9s.m149076g().mo30692I4() ? 32.0f : 36.0f);
            layoutParams2.width = t100.m186890d(l9s.m149076g().mo30692I4() ? 32.0f : 36.0f);
            layoutParams.width = t100.m186890d(l9s.m149076g().mo30692I4() ? 32.0f : 36.0f);
            layoutParams.height = t100.m186890d(l9s.m149076g().mo30692I4() ? 32.0f : 36.0f);
        } else {
            layoutParams2.height = t100.m186890d(32.0f);
            layoutParams2.width = t100.m186890d(32.0f);
            layoutParams.width = t100.m186890d(32.0f);
            layoutParams.height = t100.m186890d(32.0f);
        }
        this.f45032b.setLayoutParams(layoutParams);
        this.f45031a.setLayoutParams(layoutParams2);
    }

    public LiveSquareTopButtonLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSquareTopButtonLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
