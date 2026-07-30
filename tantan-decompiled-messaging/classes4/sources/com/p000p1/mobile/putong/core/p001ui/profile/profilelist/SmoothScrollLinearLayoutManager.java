package com.p000p1.mobile.putong.core.p001ui.profile.profilelist;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SmoothScrollLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.SmoothScrollLinearLayoutManager$a */
    public class C0130a extends n {
        public C0130a(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 150.0f / displayMetrics.densityDpi;
        }
    }

    public SmoothScrollLinearLayoutManager(Context context) {
        super(context);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        startSmoothScroll(new C0130a(recyclerView.getContext()));
    }
}
