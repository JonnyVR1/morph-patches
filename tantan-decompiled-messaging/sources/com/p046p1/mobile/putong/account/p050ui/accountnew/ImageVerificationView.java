package com.p046p1.mobile.putong.account.p050ui.accountnew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.web.WebViewX;
import p149l.wim;

/* JADX INFO: loaded from: classes9.dex */
public class ImageVerificationView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageVerificationView f16429a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f16430b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f16431c;

    /* JADX INFO: renamed from: d */
    public WebViewX f16432d;

    public ImageVerificationView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m28488a(View view) {
        wim.m203341a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m28488a(this);
    }

    public ImageVerificationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImageVerificationView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
    }
}
