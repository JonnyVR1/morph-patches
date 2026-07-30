package com.p046p1.mobile.putong.core.p053ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.pgl0;

/* JADX INFO: loaded from: classes9.dex */
public class VipConvItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f36981a;

    /* JADX INFO: renamed from: b */
    public VImage f36982b;

    /* JADX INFO: renamed from: c */
    public VText f36983c;

    /* JADX INFO: renamed from: d */
    public VText f36984d;

    /* JADX INFO: renamed from: e */
    public VText f36985e;

    public VipConvItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56245a(View view) {
        pgl0.m168758a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56245a(this);
        this.f36985e.setSingleLine(false);
        this.f36985e.setMaxLines(2);
    }

    public VipConvItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VipConvItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
