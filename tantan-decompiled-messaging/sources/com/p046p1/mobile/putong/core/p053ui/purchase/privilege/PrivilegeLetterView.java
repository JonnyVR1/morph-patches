package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.pay.R$string;
import p149l.b690;
import p149l.d3c0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeLetterView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f35083a;

    /* JADX INFO: renamed from: b */
    public ImageView f35084b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f35085c;

    /* JADX INFO: renamed from: d */
    public TextView f35086d;

    /* JADX INFO: renamed from: e */
    public TextView f35087e;

    public PrivilegeLetterView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54260a(View view) {
        b690.m100402a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54261b() {
        this.f35083a.setImageResource(zz6.m221004u0() ? d3c0.f83720Q8 : d3c0.f83706P8);
        this.f35086d.setText(R$string.f27212L0);
        this.f35087e.setText(R$string.f27400c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54260a(this);
    }

    public PrivilegeLetterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeLetterView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
