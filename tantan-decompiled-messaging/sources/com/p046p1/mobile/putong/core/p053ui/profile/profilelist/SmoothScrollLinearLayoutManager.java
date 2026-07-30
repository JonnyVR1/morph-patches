package com.p046p1.mobile.putong.core.p053ui.profile.profilelist;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0608n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class SmoothScrollLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.SmoothScrollLinearLayoutManager$a */
    public class C8705a extends C0608n {
        public C8705a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0608n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 150.0f / displayMetrics.densityDpi;
        }
    }

    public SmoothScrollLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0588z c0588z, int i) {
        startSmoothScroll(new C8705a(recyclerView.getContext()));
    }
}
