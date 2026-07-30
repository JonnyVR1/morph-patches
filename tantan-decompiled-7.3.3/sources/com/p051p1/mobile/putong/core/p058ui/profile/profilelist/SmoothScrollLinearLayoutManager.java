package com.p051p1.mobile.putong.core.p058ui.profile.profilelist;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0610n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class SmoothScrollLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.SmoothScrollLinearLayoutManager$a */
    public class C8868a extends C0610n {
        public C8868a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0610n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 150.0f / displayMetrics.densityDpi;
        }
    }

    public SmoothScrollLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0, int i) {
        startSmoothScroll(new C8868a(recyclerView.getContext()));
    }
}
