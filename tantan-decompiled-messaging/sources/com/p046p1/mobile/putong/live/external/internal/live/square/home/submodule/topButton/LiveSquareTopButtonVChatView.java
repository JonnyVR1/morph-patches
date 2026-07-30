package com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.h3c0;
import p149l.l4u;
import p149l.l9s;
import p149l.t100;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareTopButtonVChatView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f45035c;

    public LiveSquareTopButtonVChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: P */
    public final void m69157P(View view) {
        l4u.m148462a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69157P(this);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f45035c.getLayoutParams();
        if (l9s.m149076g().mo30742a().mo165314w()) {
            marginLayoutParams.height = t100.m186890d(36.0f);
            marginLayoutParams.width = t100.m186890d(36.0f);
            marginLayoutParams.rightMargin = t100.m186890d(10.0f);
            this.f45035c.setImageResource(l9s.m149078h() ? h3c0.f105673h0 : h3c0.f105670g0);
            return;
        }
        this.f45035c.setImageResource(h3c0.f105682k0);
        marginLayoutParams.height = t100.m186890d(32.0f);
        marginLayoutParams.width = t100.m186890d(32.0f);
        marginLayoutParams.rightMargin = t100.m186890d(6.0f);
    }

    public LiveSquareTopButtonVChatView(Context context) {
        super(context);
    }

    public LiveSquareTopButtonVChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
