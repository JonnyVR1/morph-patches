package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0610n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileEditLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ExpProfileEditLinearLayoutManager$a */
    public class C8794a extends C0610n {
        public C8794a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0610n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 50.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0610n
        public int getVerticalSnapPreference() {
            return -1;
        }
    }

    public ExpProfileEditLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0, int i) {
        C8794a c8794a = new C8794a(recyclerView.getContext());
        c8794a.setTargetPosition(i);
        startSmoothScroll(c8794a);
    }
}
