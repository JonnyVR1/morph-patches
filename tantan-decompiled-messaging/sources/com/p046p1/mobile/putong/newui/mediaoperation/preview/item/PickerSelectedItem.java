package com.p046p1.mobile.putong.newui.mediaoperation.preview.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.qib0;
import p149l.sd70;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class PickerSelectedItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54106a;

    /* JADX INFO: renamed from: b */
    public VImage f54107b;

    public PickerSelectedItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79107a(View view) {
        sd70.m183482a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79108b(String str, boolean z) {
        qib0.f154691G.m102367m0(this.f54106a, str);
        xdl0.m208344M(this.f54107b, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79107a(this);
    }

    public PickerSelectedItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PickerSelectedItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
