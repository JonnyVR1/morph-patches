package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import p153l.c1s0;
import p153l.wit0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzdtn extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final c1s0 f10263a;

    public zzdtn(Context context, @NonNull View view, @NonNull c1s0 c1s0Var) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f10263a = c1s0Var;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f10263a.m107650m(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof wit0)) {
                arrayList.add((wit0) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((wit0) arrayList.get(i2)).destroy();
        }
    }
}
