package com.p000p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.text.DecimalFormat;
import l.t100;
import p002l.bwt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveSignInProgressView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RoundImageView f5407a;

    /* JADX INFO: renamed from: b */
    public TextView f5408b;

    /* JADX INFO: renamed from: c */
    public TextView f5409c;

    public LiveSignInProgressView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m6800a(View view) {
        bwt.m10634a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6801b(String str, int i, int i2) {
        this.f5407a.setImageViewWidth(t100.d(Float.parseFloat(new DecimalFormat("0.00").format(i / i2).replace(",", ".")) * 110.0f));
        this.f5408b.setText(str);
        this.f5409c.setText(String.format("%s/%s", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6800a(this);
    }

    public LiveSignInProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
