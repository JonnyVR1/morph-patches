package com.p051p1.mobile.putong.account.p055ui.accountnew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.web.WebViewX;
import p153l.zkm;

/* JADX INFO: loaded from: classes9.dex */
public class ImageVerificationView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageVerificationView f17148a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f17149b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f17150c;

    /* JADX INFO: renamed from: d */
    public WebViewX f17151d;

    public ImageVerificationView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m29487a(View view) {
        zkm.m220117a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29487a(this);
    }

    public ImageVerificationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImageVerificationView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
    }
}
