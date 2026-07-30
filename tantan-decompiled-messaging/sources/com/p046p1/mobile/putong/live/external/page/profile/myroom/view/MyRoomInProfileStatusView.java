package com.p046p1.mobile.putong.live.external.page.profile.myroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p149l.ax10;

/* JADX INFO: loaded from: classes13.dex */
public class MyRoomInProfileStatusView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f45988a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f45989b;

    public MyRoomInProfileStatusView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m70546a(View view) {
        ax10.m99350a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70546a(this);
    }

    public MyRoomInProfileStatusView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInProfileStatusView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
