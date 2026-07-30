package com.p046p1.mobile.putong.live.external.page.profile.myroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p149l.aw10;
import p149l.e30;
import p149l.xdl0;
import p149l.zv10;

/* JADX INFO: loaded from: classes13.dex */
public class MyRoomInProfileDoubleView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MyRoomInProfileAudioItemView f45965a;

    /* JADX INFO: renamed from: b */
    public MyRoomInProfileVideoItemView f45966b;

    public MyRoomInProfileDoubleView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m70534c(View view) {
        zv10.m220297a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m70535d(final aw10 aw10Var, final aw10 aw10Var2, boolean z, final e30<aw10> e30Var) {
        this.f45965a.m70531i0(aw10Var);
        this.f45966b.m70548i0(aw10Var2, z);
        xdl0.m208329E0(this.f45965a, new View.OnClickListener() { // from class: l.xv10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(aw10Var);
            }
        });
        xdl0.m208329E0(this.f45966b, new View.OnClickListener() { // from class: l.yv10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(aw10Var2);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70534c(this);
    }

    public MyRoomInProfileDoubleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInProfileDoubleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
