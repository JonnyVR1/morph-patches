package com.p051p1.mobile.putong.core.p058ui.account.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p153l.C20949vx;

/* JADX INFO: loaded from: classes9.dex */
public class AccountSecureFunItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText_Medium f29110a;

    /* JADX INFO: renamed from: b */
    public VText_Medium f29111b;

    /* JADX INFO: renamed from: c */
    public View f29112c;

    public AccountSecureFunItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m45380a(View view) {
        C20949vx.m203823a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45380a(this);
    }

    public AccountSecureFunItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountSecureFunItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
