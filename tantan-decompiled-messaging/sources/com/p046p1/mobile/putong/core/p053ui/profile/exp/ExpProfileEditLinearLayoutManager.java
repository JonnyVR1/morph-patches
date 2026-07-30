package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0608n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileEditLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ExpProfileEditLinearLayoutManager$a */
    public class C8631a extends C0608n {
        public C8631a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0608n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 50.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0608n
        public int getVerticalSnapPreference() {
            return -1;
        }
    }

    public ExpProfileEditLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0588z c0588z, int i) {
        C8631a c8631a = new C8631a(recyclerView.getContext());
        c8631a.setTargetPosition(i);
        startSmoothScroll(c8631a);
    }
}
