package com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.m6u;
import p153l.mbs;
import p153l.nbc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareTopButtonVChatView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f45883c;

    public LiveSquareTopButtonVChatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: P */
    public final void m70340P(View view) {
        m6u.m157266a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70340P(this);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f45883c.getLayoutParams();
        if (mbs.m157853g().mo31745a().mo192257w()) {
            marginLayoutParams.height = qa00.m175859d(36.0f);
            marginLayoutParams.width = qa00.m175859d(36.0f);
            marginLayoutParams.rightMargin = qa00.m175859d(10.0f);
            this.f45883c.setImageResource(mbs.m157855h() ? nbc0.f141164h0 : nbc0.f141161g0);
            return;
        }
        this.f45883c.setImageResource(nbc0.f141173k0);
        marginLayoutParams.height = qa00.m175859d(32.0f);
        marginLayoutParams.width = qa00.m175859d(32.0f);
        marginLayoutParams.rightMargin = qa00.m175859d(6.0f);
    }

    public LiveSquareTopButtonVChatView(Context context) {
        super(context);
    }

    public LiveSquareTopButtonVChatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
