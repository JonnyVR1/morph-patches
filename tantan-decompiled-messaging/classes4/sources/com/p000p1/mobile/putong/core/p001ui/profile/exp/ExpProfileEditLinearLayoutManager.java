package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileEditLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.ExpProfileEditLinearLayoutManager$a */
    public class C0056a extends n {
        public C0056a(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 50.0f / displayMetrics.densityDpi;
        }

        public int getVerticalSnapPreference() {
            return -1;
        }
    }

    public ExpProfileEditLinearLayoutManager(Context context) {
        super(context);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        C0056a c0056a = new C0056a(recyclerView.getContext());
        c0056a.setTargetPosition(i);
        startSmoothScroll(c0056a);
    }
}
