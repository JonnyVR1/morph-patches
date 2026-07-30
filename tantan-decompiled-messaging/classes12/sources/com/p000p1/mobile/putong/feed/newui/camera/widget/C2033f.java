package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.vwb;
import p007l.o6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.f */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2033f extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a */
    public Act f1338a;

    /* JADX INFO: renamed from: b */
    public List<b> f1339b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public e30<Boolean> f1340c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.f$a */
    public static class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public FeedMakeupSeekbarPageView f1341a;

        public a(@NonNull FeedMakeupSeekbarPageView feedMakeupSeekbarPageView) {
            super(feedMakeupSeekbarPageView);
            this.f1341a = feedMakeupSeekbarPageView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public float f1342a;

        /* JADX INFO: renamed from: b */
        public float f1343b;

        /* JADX INFO: renamed from: c */
        public boolean f1344c;

        /* JADX INFO: renamed from: d */
        public boolean f1345d;

        public b(float f, float f2, boolean z, boolean z2) {
            this.f1342a = f;
            this.f1343b = f2;
            this.f1345d = z;
            this.f1344c = z2;
        }
    }

    public C2033f(Act act) {
        this.f1338a = act;
    }

    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a((FeedMakeupSeekbarPageView) this.f1338a.inflater().inflate(o6c0.f11147W, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m2774C(e30<Boolean> e30Var) {
        this.f1340c = e30Var;
    }

    public int getItemCount() {
        return 5;
    }

    /* JADX INFO: renamed from: y */
    public void m2775y(List<b> list) {
        list.size();
        if (!vwb.J(list)) {
            this.f1339b.clear();
            this.f1339b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull a aVar, int i) {
        FeedMakeupSeekbarPageView feedMakeupSeekbarPageView = aVar.f1341a;
        feedMakeupSeekbarPageView.setTag(Integer.valueOf(i));
        feedMakeupSeekbarPageView.m2499i();
        b bVar = this.f1339b.get(i);
        if (i == 0) {
            feedMakeupSeekbarPageView.m2504n();
        } else if (i == 1) {
            feedMakeupSeekbarPageView.m2505o(bVar);
        } else if (i == 2) {
            feedMakeupSeekbarPageView.m2508r(bVar);
        } else if (i == 3) {
            feedMakeupSeekbarPageView.m2509s(bVar);
        } else if (i == 4) {
            feedMakeupSeekbarPageView.m2506p(bVar);
        }
        feedMakeupSeekbarPageView.setOnResetItemClick(this.f1340c);
    }
}
