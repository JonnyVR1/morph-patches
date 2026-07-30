package com.p051p1.mobile.putong.live.external.page.profile.myroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p153l.bnl0;
import p153l.h420;
import p153l.i420;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class MyRoomInProfileDoubleView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MyRoomInProfileAudioItemView f46813a;

    /* JADX INFO: renamed from: b */
    public MyRoomInProfileVideoItemView f46814b;

    public MyRoomInProfileDoubleView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m71717c(View view) {
        h420.m133539a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m71718d(final i420 i420Var, final i420 i420Var2, boolean z, final y20<i420> y20Var) {
        this.f46813a.m71714i0(i420Var);
        this.f46814b.m71731i0(i420Var2, z);
        bnl0.m105509E0(this.f46813a, new View.OnClickListener() { // from class: l.f420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(i420Var);
            }
        });
        bnl0.m105509E0(this.f46814b, new View.OnClickListener() { // from class: l.g420
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(i420Var2);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71717c(this);
    }

    public MyRoomInProfileDoubleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInProfileDoubleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
