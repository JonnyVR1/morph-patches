package com.p046p1.mobile.putong.core.p053ui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.td70;

/* JADX INFO: loaded from: classes3.dex */
public class PickerSelectedItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f30645a;

    /* JADX INFO: renamed from: b */
    public VImage f30646b;

    public PickerSelectedItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m47803a(View view) {
        td70.m188066a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47803a(this);
    }

    public PickerSelectedItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PickerSelectedItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
