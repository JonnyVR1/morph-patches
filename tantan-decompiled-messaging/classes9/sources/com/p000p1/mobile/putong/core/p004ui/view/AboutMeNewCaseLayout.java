package com.p000p1.mobile.putong.core.p004ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.VText_Medium;
import l.x2;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AboutMeNewCaseLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f6500a;

    /* JADX INFO: renamed from: b */
    public VLinear f6501b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f6502c;

    /* JADX INFO: renamed from: d */
    public VText_Medium f6503d;

    /* JADX INFO: renamed from: e */
    public VText f6504e;

    /* JADX INFO: renamed from: f */
    public TextView f6505f;

    public AboutMeNewCaseLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9532a(View view) {
        x2.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9532a(this);
    }

    public AboutMeNewCaseLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AboutMeNewCaseLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
