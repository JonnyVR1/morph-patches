package com.p000p1.mobile.putong.core.p001ui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import l.td70;
import p028v.VDraweeView;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PickerSelectedItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f536a;

    /* JADX INFO: renamed from: b */
    public VImage f537b;

    public PickerSelectedItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m867a(View view) {
        td70.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m867a(this);
    }

    public PickerSelectedItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PickerSelectedItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
