package com.p051p1.mobile.putong.newui.mediaoperation.preview.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.uqb0;
import p153l.yl70;

/* JADX INFO: loaded from: classes10.dex */
public class PickerSelectedItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54954a;

    /* JADX INFO: renamed from: b */
    public VImage f54955b;

    public PickerSelectedItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m80290a(View view) {
        yl70.m216564a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m80291b(String str, boolean z) {
        uqb0.f180374G.m127150m0(this.f54954a, str);
        bnl0.m105524M(this.f54955b, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m80290a(this);
    }

    public PickerSelectedItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PickerSelectedItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
