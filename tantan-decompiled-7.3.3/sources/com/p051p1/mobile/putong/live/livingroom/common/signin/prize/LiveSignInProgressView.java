package com.p051p1.mobile.putong.live.livingroom.common.signin.prize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.text.DecimalFormat;
import p153l.cyt;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class LiveSignInProgressView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RoundImageView f50213a;

    /* JADX INFO: renamed from: b */
    public TextView f50214b;

    /* JADX INFO: renamed from: c */
    public TextView f50215c;

    public LiveSignInProgressView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m74448a(View view) {
        cyt.m113248a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74449b(String str, int i, int i2) {
        this.f50213a.setImageViewWidth(qa00.m175859d(Float.parseFloat(new DecimalFormat("0.00").format(i / i2).replace(Constants.SEPARATOR_COMMA, ".")) * 110.0f));
        this.f50214b.setText(str);
        this.f50215c.setText(String.format("%s/%s", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74448a(this);
    }

    public LiveSignInProgressView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
