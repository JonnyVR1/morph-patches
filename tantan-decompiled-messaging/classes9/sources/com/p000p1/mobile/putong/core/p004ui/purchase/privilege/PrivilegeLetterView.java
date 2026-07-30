package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.pay.R;
import l.b690;
import l.d3c0;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeLetterView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f4864a;

    /* JADX INFO: renamed from: b */
    public ImageView f4865b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f4866c;

    /* JADX INFO: renamed from: d */
    public TextView f4867d;

    /* JADX INFO: renamed from: e */
    public TextView f4868e;

    public PrivilegeLetterView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7595a(View view) {
        b690.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7596b() {
        this.f4864a.setImageResource(zz6.u0() ? d3c0.Q8 : d3c0.P8);
        this.f4867d.setText(R.string.L0);
        this.f4868e.setText(R.string.c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7595a(this);
    }

    public PrivilegeLetterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeLetterView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
