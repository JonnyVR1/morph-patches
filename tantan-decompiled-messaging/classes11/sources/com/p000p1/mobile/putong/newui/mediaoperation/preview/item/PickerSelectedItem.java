package com.p000p1.mobile.putong.newui.mediaoperation.preview.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import l.qib0;
import l.sd70;
import l.xdl0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class PickerSelectedItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7712a;

    /* JADX INFO: renamed from: b */
    public VImage f7713b;

    public PickerSelectedItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9419a(View view) {
        sd70.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m9420b(String str, boolean z) {
        qib0.G.m0(this.f7712a, str);
        xdl0.M(this.f7713b, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9419a(this);
    }

    public PickerSelectedItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PickerSelectedItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
