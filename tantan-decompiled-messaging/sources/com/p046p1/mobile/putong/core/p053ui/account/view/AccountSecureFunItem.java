package com.p046p1.mobile.putong.core.p053ui.account.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p149l.C16271cy;

/* JADX INFO: loaded from: classes9.dex */
public class AccountSecureFunItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText_Medium f28262a;

    /* JADX INFO: renamed from: b */
    public VText_Medium f28263b;

    /* JADX INFO: renamed from: c */
    public View f28264c;

    public AccountSecureFunItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m44197a(View view) {
        C16271cy.m109121a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44197a(this);
    }

    public AccountSecureFunItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountSecureFunItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
