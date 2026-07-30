package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VFrame;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class TopicListView extends VFrame {

    /* JADX INFO: renamed from: a */
    public C11461b f42598a;

    /* JADX INFO: renamed from: b */
    public C11462c f42599b;

    public TopicListView(Context context) {
        super(context);
        m65679p(context);
    }

    /* JADX INFO: renamed from: p */
    private void m65679p(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setPadding(0, 0, qa00.m175859d(10.0f), 0);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        addView(recyclerView);
        C11462c c11462c = new C11462c(context, this.f42598a);
        this.f42599b = c11462c;
        recyclerView.setAdapter(c11462c);
    }

    /* JADX INFO: renamed from: s */
    public void m65680s(C11461b c11461b) {
        this.f42599b.m65717J(c11461b);
    }

    public TopicListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65679p(context);
    }

    public TopicListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65679p(context);
    }
}
