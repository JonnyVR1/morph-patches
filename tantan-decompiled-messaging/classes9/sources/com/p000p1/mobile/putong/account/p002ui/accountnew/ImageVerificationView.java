package com.p000p1.mobile.putong.account.p002ui.accountnew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.web.WebViewX;
import p006l.wim;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ImageVerificationView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageVerificationView f418a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f419b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f420c;

    /* JADX INFO: renamed from: d */
    public WebViewX f421d;

    public ImageVerificationView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m384a(View view) {
        wim.m26413a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m384a(this);
    }

    public ImageVerificationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImageVerificationView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
    }
}
