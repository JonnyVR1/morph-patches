package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VText;
import p153l.mge0;

/* JADX INFO: loaded from: classes12.dex */
public class SeeDlgAnimLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public SeeDlgAnimLayout f36011d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f36012e;

    /* JADX INFO: renamed from: f */
    public VText f36013f;

    /* JADX INFO: renamed from: g */
    public VText f36014g;

    /* JADX INFO: renamed from: h */
    public VText f36015h;

    /* JADX INFO: renamed from: i */
    public VText f36016i;

    /* JADX INFO: renamed from: j */
    public boolean f36017j;

    /* JADX INFO: renamed from: k */
    public boolean f36018k;

    public SeeDlgAnimLayout(@NonNull Context context) {
        super(context);
        this.f36017j = false;
        this.f36018k = false;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m55497h0(View view) {
        mge0.m158210a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55497h0(this);
    }

    public SeeDlgAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36017j = false;
        this.f36018k = false;
    }

    public SeeDlgAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36017j = false;
        this.f36018k = false;
    }
}
