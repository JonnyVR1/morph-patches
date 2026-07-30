package com.p051p1.mobile.putong.live.external.page.profile.myroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VText;
import p153l.j420;

/* JADX INFO: loaded from: classes9.dex */
public class MyRoomInProfileItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f46815d;

    /* JADX INFO: renamed from: e */
    public MyRoomInProfileStatusView f46816e;

    /* JADX INFO: renamed from: f */
    public VText f46817f;

    /* JADX INFO: renamed from: g */
    public VText f46818g;

    public MyRoomInProfileItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m71719h0(View view) {
        j420.m143399a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71719h0(this);
    }

    public MyRoomInProfileItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInProfileItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
