package com.idv.identity.ocr.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p149l.mxb;
import p149l.r1c0;

/* JADX INFO: loaded from: classes7.dex */
public class OcrContentTitleView extends TextView {
    public OcrContentTitleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18050a(context);
        setTextDirection(5);
    }

    /* JADX INFO: renamed from: a */
    private void m18050a(Context context) {
        setTextDirection(5);
        setTextAlignment(2);
        setTextColor(mxb.f136154d.getOcrResultInfoTitleColor(r1c0.f157262b));
    }

    public OcrContentTitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m18050a(context);
    }

    public OcrContentTitleView(Context context) {
        super(context);
        m18050a(context);
    }
}
