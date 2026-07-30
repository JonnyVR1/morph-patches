package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import p149l.q9t0;
import p149l.wrr0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzdtn extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final wrr0 f10226a;

    public zzdtn(Context context, @NonNull View view, @NonNull wrr0 wrr0Var) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f10226a = wrr0Var;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f10226a.m205290m(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof q9t0)) {
                arrayList.add((q9t0) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((q9t0) arrayList.get(i2)).destroy();
        }
    }
}
