package com.p046p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import p147v.VPager;

/* JADX INFO: loaded from: classes13.dex */
public class NoSaveStateViewPager extends VPager {
    public NoSaveStateViewPager(Context context) {
        super(context);
        setSaveFromParentEnabled(false);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return View.BaseSavedState.EMPTY_STATE;
    }

    public NoSaveStateViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSaveFromParentEnabled(false);
    }
}
