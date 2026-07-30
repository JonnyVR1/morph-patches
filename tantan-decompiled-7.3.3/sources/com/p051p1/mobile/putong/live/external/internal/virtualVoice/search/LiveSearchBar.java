package com.p051p1.mobile.putong.live.external.internal.virtualVoice.search;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import p151v.VSearchBar;
import p153l.bnl0;
import p153l.ldc0;
import p153l.nbc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSearchBar extends VSearchBar {
    public LiveSearchBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i */
    public void m71043i() {
        getCancelText().setTypeface(Typeface.DEFAULT_BOLD);
        getEditText().setBackgroundResource(nbc0.f141193r);
        setLeftImageRes(nbc0.f141204u1);
        setRightImageRes(nbc0.f141201t1);
        View viewFindViewById = findViewById(ldc0.f131602t0);
        if (viewFindViewById != null) {
            bnl0.m105507D0(qa00.m175859d(24.0f), viewFindViewById);
            bnl0.m105505C0(viewFindViewById, qa00.m175859d(24.0f));
        }
        setEditTextColor(Color.parseColor("#99FFFFFF"));
        setEditTextHintColor(Color.parseColor("#33FFFFFF"));
        setCancelTextColor(Color.parseColor("#66FFFFFF"));
    }

    public LiveSearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LiveSearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
