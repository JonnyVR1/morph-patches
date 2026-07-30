package com.idv.identity.ocr.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p153l.azb;
import p153l.y9c0;

/* JADX INFO: loaded from: classes7.dex */
public class OcrContentTitleView extends TextView {
    public OcrContentTitleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19127a(context);
        setTextDirection(5);
    }

    /* JADX INFO: renamed from: a */
    private void m19127a(Context context) {
        setTextDirection(5);
        setTextAlignment(2);
        setTextColor(azb.f74128d.getOcrResultInfoTitleColor(y9c0.f198077b));
    }

    public OcrContentTitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m19127a(context);
    }

    public OcrContentTitleView(Context context) {
        super(context);
        m19127a(context);
    }
}
