package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.h8e0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SeeDlgAnimLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public SeeDlgAnimLayout f4944d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4945e;

    /* JADX INFO: renamed from: f */
    public VText f4946f;

    /* JADX INFO: renamed from: g */
    public VText f4947g;

    /* JADX INFO: renamed from: h */
    public VText f4948h;

    /* JADX INFO: renamed from: i */
    public VText f4949i;

    /* JADX INFO: renamed from: j */
    public boolean f4950j;

    /* JADX INFO: renamed from: k */
    public boolean f4951k;

    public SeeDlgAnimLayout(@NonNull Context context) {
        super(context);
        this.f4950j = false;
        this.f4951k = false;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m7649h0(View view) {
        h8e0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7649h0(this);
    }

    public SeeDlgAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4950j = false;
        this.f4951k = false;
    }

    public SeeDlgAnimLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4950j = false;
        this.f4951k = false;
    }
}
