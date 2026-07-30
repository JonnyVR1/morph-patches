package com.p051p1.mobile.putong.live.external.page.profile.myroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.i520;

/* JADX INFO: loaded from: classes9.dex */
public class MyRoomInProfileStatusView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f46836a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f46837b;

    public MyRoomInProfileStatusView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m71729a(View view) {
        i520.m138636a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71729a(this);
    }

    public MyRoomInProfileStatusView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInProfileStatusView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
