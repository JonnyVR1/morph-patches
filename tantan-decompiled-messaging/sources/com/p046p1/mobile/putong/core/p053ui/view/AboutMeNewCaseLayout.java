package com.p046p1.mobile.putong.core.p053ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.C21020x2;

/* JADX INFO: loaded from: classes9.dex */
public class AboutMeNewCaseLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f36719a;

    /* JADX INFO: renamed from: b */
    public VLinear f36720b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f36721c;

    /* JADX INFO: renamed from: d */
    public VText_Medium f36722d;

    /* JADX INFO: renamed from: e */
    public VText f36723e;

    /* JADX INFO: renamed from: f */
    public TextView f36724f;

    public AboutMeNewCaseLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56107a(View view) {
        C21020x2.m206768a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56107a(this);
    }

    public AboutMeNewCaseLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AboutMeNewCaseLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
