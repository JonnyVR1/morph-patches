package com.p046p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.text.DecimalFormat;
import p149l.bwt;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class LiveSignInProgressView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RoundImageView f49365a;

    /* JADX INFO: renamed from: b */
    public TextView f49366b;

    /* JADX INFO: renamed from: c */
    public TextView f49367c;

    public LiveSignInProgressView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m73265a(View view) {
        bwt.m104251a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73266b(String str, int i, int i2) {
        this.f49365a.setImageViewWidth(t100.m186890d(Float.parseFloat(new DecimalFormat("0.00").format(i / i2).replace(Constants.SEPARATOR_COMMA, ".")) * 110.0f));
        this.f49366b.setText(str);
        this.f49367c.setText(String.format("%s/%s", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73265a(this);
    }

    public LiveSignInProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
