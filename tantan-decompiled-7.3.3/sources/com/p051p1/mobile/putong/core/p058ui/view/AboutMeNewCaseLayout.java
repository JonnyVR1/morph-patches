package com.p051p1.mobile.putong.core.p058ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.C21230x2;

/* JADX INFO: loaded from: classes12.dex */
public class AboutMeNewCaseLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f37567a;

    /* JADX INFO: renamed from: b */
    public VLinear f37568b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f37569c;

    /* JADX INFO: renamed from: d */
    public VText_Medium f37570d;

    /* JADX INFO: renamed from: e */
    public VText f37571e;

    /* JADX INFO: renamed from: f */
    public TextView f37572f;

    public AboutMeNewCaseLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57290a(View view) {
        C21230x2.m209123a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57290a(this);
    }

    public AboutMeNewCaseLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AboutMeNewCaseLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
