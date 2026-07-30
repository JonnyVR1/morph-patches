package com.p000p1.mobile.putong.core.p001ui.dlg.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.eqh0;
import l.qib0;
import p003l.q45;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CityCoverSmallCardView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CityCoverSmallCardView f1419a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1420b;

    /* JADX INFO: renamed from: c */
    public VText f1421c;

    /* JADX INFO: renamed from: d */
    public VImage f1422d;

    /* JADX INFO: renamed from: e */
    public VText f1423e;

    /* JADX INFO: renamed from: f */
    public VText f1424f;

    public CityCoverSmallCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m2536a(View view) {
        q45.m8913a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m2537b(String str, String str2, String str3) {
        this.f1423e.setTypeface(eqh0.c(3), 1);
        this.f1421c.setTypeface(eqh0.c(3), 1);
        if (!TextUtils.isEmpty(str)) {
            qib0.G.L0(this.f1420b, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f1423e.setText(str2);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.f1424f.setText(str3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2536a(this);
    }

    public CityCoverSmallCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CityCoverSmallCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
