package com.p051p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import p151v.VPager;

/* JADX INFO: loaded from: classes9.dex */
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
