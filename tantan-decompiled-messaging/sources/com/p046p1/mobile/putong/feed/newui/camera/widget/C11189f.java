package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import p149l.e30;
import p149l.o6c0;
import p149l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.f */
/* JADX INFO: loaded from: classes12.dex */
public class C11189f extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a */
    public Act f39877a;

    /* JADX INFO: renamed from: b */
    public List<b> f39878b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public e30<Boolean> f39879c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.f$a */
    public static class a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public FeedMakeupSeekbarPageView f39880a;

        public a(@NonNull FeedMakeupSeekbarPageView feedMakeupSeekbarPageView) {
            super(feedMakeupSeekbarPageView);
            this.f39880a = feedMakeupSeekbarPageView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public float f39881a;

        /* JADX INFO: renamed from: b */
        public float f39882b;

        /* JADX INFO: renamed from: c */
        public boolean f39883c;

        /* JADX INFO: renamed from: d */
        public boolean f39884d;

        public b(float f, float f2, boolean z, boolean z2) {
            this.f39881a = f;
            this.f39882b = f2;
            this.f39884d = z;
            this.f39883c = z2;
        }
    }

    public C11189f(Act act) {
        this.f39877a = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a((FeedMakeupSeekbarPageView) this.f39877a.inflater().inflate(o6c0.f142128W, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m61810C(e30<Boolean> e30Var) {
        this.f39879c = e30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 5;
    }

    /* JADX INFO: renamed from: y */
    public void m61811y(List<b> list) {
        list.size();
        if (!vwb.m200296J(list)) {
            this.f39878b.clear();
            this.f39878b.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull a aVar, int i) {
        FeedMakeupSeekbarPageView feedMakeupSeekbarPageView = aVar.f39880a;
        feedMakeupSeekbarPageView.setTag(Integer.valueOf(i));
        feedMakeupSeekbarPageView.m61547i();
        b bVar = this.f39878b.get(i);
        if (i == 0) {
            feedMakeupSeekbarPageView.m61552n();
        } else if (i == 1) {
            feedMakeupSeekbarPageView.m61553o(bVar);
        } else if (i == 2) {
            feedMakeupSeekbarPageView.m61556r(bVar);
        } else if (i == 3) {
            feedMakeupSeekbarPageView.m61557s(bVar);
        } else if (i == 4) {
            feedMakeupSeekbarPageView.m61554p(bVar);
        }
        feedMakeupSeekbarPageView.setOnResetItemClick(this.f39879c);
    }
}
