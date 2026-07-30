package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.d3c0;
import l.wb90;
import l.xdl0;
import l.zz6;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeUndoView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4894a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4895b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4896c;

    /* JADX INFO: renamed from: d */
    public VImage f4897d;

    /* JADX INFO: renamed from: e */
    public VImage f4898e;

    public PrivilegeUndoView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7617a(View view) {
        wb90.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7618b() {
        this.f4897d.setImageResource(d3c0.v9);
        xdl0.M(this.f4894a, false);
        xdl0.M(this.f4898e, true);
        this.f4898e.setImageResource(zz6.u0() ? d3c0.Cc : d3c0.Ac);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7617a(this);
    }

    public PrivilegeUndoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeUndoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
