package com.p046p1.mobile.putong.live.external.page.profile.myroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bw10;

/* JADX INFO: loaded from: classes13.dex */
public class MyRoomInProfileItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f45967d;

    /* JADX INFO: renamed from: e */
    public MyRoomInProfileStatusView f45968e;

    /* JADX INFO: renamed from: f */
    public VText f45969f;

    /* JADX INFO: renamed from: g */
    public VText f45970g;

    public MyRoomInProfileItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m70536h0(View view) {
        bw10.m104125a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70536h0(this);
    }

    public MyRoomInProfileItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInProfileItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
