package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.d3c0;
import p149l.wb90;
import p149l.xdl0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeUndoView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35113a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f35114b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f35115c;

    /* JADX INFO: renamed from: d */
    public VImage f35116d;

    /* JADX INFO: renamed from: e */
    public VImage f35117e;

    public PrivilegeUndoView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54282a(View view) {
        wb90.m202533a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54283b() {
        this.f35116d.setImageResource(d3c0.f84145v9);
        xdl0.m208344M(this.f35113a, false);
        xdl0.m208344M(this.f35117e, true);
        this.f35117e.setImageResource(zz6.m221004u0() ? d3c0.f83528Cc : d3c0.f83500Ac);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54282a(this);
    }

    public PrivilegeUndoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeUndoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
