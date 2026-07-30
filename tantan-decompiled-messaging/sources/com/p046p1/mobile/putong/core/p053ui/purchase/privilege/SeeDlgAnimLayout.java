package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VText;
import p149l.h8e0;

/* JADX INFO: loaded from: classes9.dex */
public class SeeDlgAnimLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public SeeDlgAnimLayout f35163d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f35164e;

    /* JADX INFO: renamed from: f */
    public VText f35165f;

    /* JADX INFO: renamed from: g */
    public VText f35166g;

    /* JADX INFO: renamed from: h */
    public VText f35167h;

    /* JADX INFO: renamed from: i */
    public VText f35168i;

    /* JADX INFO: renamed from: j */
    public boolean f35169j;

    /* JADX INFO: renamed from: k */
    public boolean f35170k;

    public SeeDlgAnimLayout(@NonNull Context context) {
        super(context);
        this.f35169j = false;
        this.f35170k = false;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m54314h0(View view) {
        h8e0.m129882a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54314h0(this);
    }

    public SeeDlgAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35169j = false;
        this.f35170k = false;
    }

    public SeeDlgAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35169j = false;
        this.f35170k = false;
    }
}
