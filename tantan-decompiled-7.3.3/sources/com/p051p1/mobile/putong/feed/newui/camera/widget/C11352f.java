package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import p153l.jyb;
import p153l.tec0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.f */
/* JADX INFO: loaded from: classes13.dex */
public class C11352f extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a */
    public Act f40725a;

    /* JADX INFO: renamed from: b */
    public List<b> f40726b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public y20<Boolean> f40727c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.f$a */
    public static class a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public FeedMakeupSeekbarPageView f40728a;

        public a(@NonNull FeedMakeupSeekbarPageView feedMakeupSeekbarPageView) {
            super(feedMakeupSeekbarPageView);
            this.f40728a = feedMakeupSeekbarPageView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public float f40729a;

        /* JADX INFO: renamed from: b */
        public float f40730b;

        /* JADX INFO: renamed from: c */
        public boolean f40731c;

        /* JADX INFO: renamed from: d */
        public boolean f40732d;

        public b(float f, float f2, boolean z, boolean z2) {
            this.f40729a = f;
            this.f40730b = f2;
            this.f40732d = z;
            this.f40731c = z2;
        }
    }

    public C11352f(Act act) {
        this.f40725a = act;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a((FeedMakeupSeekbarPageView) this.f40725a.inflater().inflate(tec0.f173597W, viewGroup, false));
    }

    /* JADX INFO: renamed from: C */
    public void m62993C(y20<Boolean> y20Var) {
        this.f40727c = y20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 5;
    }

    /* JADX INFO: renamed from: y */
    public void m62994y(List<b> list) {
        list.size();
        if (!jyb.m147479J(list)) {
            this.f40726b.clear();
            this.f40726b.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull a aVar, int i) {
        FeedMakeupSeekbarPageView feedMakeupSeekbarPageView = aVar.f40728a;
        feedMakeupSeekbarPageView.setTag(Integer.valueOf(i));
        feedMakeupSeekbarPageView.m62731i();
        b bVar = this.f40726b.get(i);
        if (i == 0) {
            feedMakeupSeekbarPageView.m62736n();
        } else if (i == 1) {
            feedMakeupSeekbarPageView.m62737o(bVar);
        } else if (i == 2) {
            feedMakeupSeekbarPageView.m62740r(bVar);
        } else if (i == 3) {
            feedMakeupSeekbarPageView.m62741s(bVar);
        } else if (i == 4) {
            feedMakeupSeekbarPageView.m62738p(bVar);
        }
        feedMakeupSeekbarPageView.setOnResetItemClick(this.f40727c);
    }
}
