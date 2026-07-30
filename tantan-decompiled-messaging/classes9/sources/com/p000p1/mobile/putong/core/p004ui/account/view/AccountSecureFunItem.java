package com.p000p1.mobile.putong.core.p004ui.account.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.VText_Medium;
import l.cy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountSecureFunItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText_Medium f4329a;

    /* JADX INFO: renamed from: b */
    public VText_Medium f4330b;

    /* JADX INFO: renamed from: c */
    public View f4331c;

    public AccountSecureFunItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7145a(View view) {
        cy.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7145a(this);
    }

    public AccountSecureFunItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountSecureFunItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
