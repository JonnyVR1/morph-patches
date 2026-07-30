package com.p000p1.mobile.putong.core.p004ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.pgl0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipConvItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6762a;

    /* JADX INFO: renamed from: b */
    public VImage f6763b;

    /* JADX INFO: renamed from: c */
    public VText f6764c;

    /* JADX INFO: renamed from: d */
    public VText f6765d;

    /* JADX INFO: renamed from: e */
    public VText f6766e;

    public VipConvItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9679a(View view) {
        pgl0.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9679a(this);
        this.f6766e.setSingleLine(false);
        this.f6766e.setMaxLines(2);
    }

    public VipConvItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VipConvItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
