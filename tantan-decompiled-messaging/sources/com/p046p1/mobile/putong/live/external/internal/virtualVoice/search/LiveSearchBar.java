package com.p046p1.mobile.putong.live.external.internal.virtualVoice.search;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import p147v.VSearchBar;
import p149l.f5c0;
import p149l.h3c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSearchBar extends VSearchBar {
    public LiveSearchBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i */
    public void m69860i() {
        getCancelText().setTypeface(Typeface.DEFAULT_BOLD);
        getEditText().setBackgroundResource(h3c0.f105702r);
        setLeftImageRes(h3c0.f105713u1);
        setRightImageRes(h3c0.f105710t1);
        View viewFindViewById = findViewById(f5c0.f95145t0);
        if (viewFindViewById != null) {
            xdl0.m208327D0(t100.m186890d(24.0f), viewFindViewById);
            xdl0.m208325C0(viewFindViewById, t100.m186890d(24.0f));
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
