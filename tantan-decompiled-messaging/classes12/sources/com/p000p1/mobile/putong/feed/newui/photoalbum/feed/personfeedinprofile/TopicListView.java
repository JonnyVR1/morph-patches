package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import l.t100;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicListView extends VFrame {

    /* JADX INFO: renamed from: a */
    public C2142b f3211a;

    /* JADX INFO: renamed from: b */
    public C2143c f3212b;

    public TopicListView(Context context) {
        super(context);
        m5587p(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private void m5587p(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setItemAnimator((RecyclerView.l) null);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setPadding(0, 0, t100.d(10.0f), 0);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        addView(recyclerView);
        C2143c c2143c = new C2143c(context, this.f3211a);
        this.f3212b = c2143c;
        recyclerView.setAdapter(c2143c);
    }

    /* JADX INFO: renamed from: s */
    public void m5588s(C2142b c2142b) {
        this.f3212b.m5628J(c2142b);
    }

    public TopicListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5587p(context);
    }

    public TopicListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5587p(context);
    }
}
