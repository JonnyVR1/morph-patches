package com.p046p1.mobile.putong.core.p053ui.dlg.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.eqh0;
import p149l.q45;
import p149l.qib0;

/* JADX INFO: loaded from: classes10.dex */
public class CityCoverSmallCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverSmallCardView f29025a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f29026b;

    /* JADX INFO: renamed from: c */
    public VText f29027c;

    /* JADX INFO: renamed from: d */
    public VImage f29028d;

    /* JADX INFO: renamed from: e */
    public VText f29029e;

    /* JADX INFO: renamed from: f */
    public VText f29030f;

    public CityCoverSmallCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m45219a(View view) {
        q45.m172925a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m45220b(String str, String str2, String str3) {
        this.f29029e.setTypeface(eqh0.m117752c(3), 1);
        this.f29027c.setTypeface(eqh0.m117752c(3), 1);
        if (!TextUtils.isEmpty(str)) {
            qib0.f154691G.m102331L0(this.f29026b, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f29029e.setText(str2);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.f29030f.setText(str3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45219a(this);
    }

    public CityCoverSmallCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CityCoverSmallCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
