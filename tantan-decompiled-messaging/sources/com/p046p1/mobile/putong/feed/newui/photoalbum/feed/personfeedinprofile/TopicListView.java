package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VFrame;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class TopicListView extends VFrame {

    /* JADX INFO: renamed from: a */
    public C11298b f41750a;

    /* JADX INFO: renamed from: b */
    public C11299c f41751b;

    public TopicListView(Context context) {
        super(context);
        m64496p(context);
    }

    /* JADX INFO: renamed from: p */
    private void m64496p(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setPadding(0, 0, t100.m186890d(10.0f), 0);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        addView(recyclerView);
        C11299c c11299c = new C11299c(context, this.f41750a);
        this.f41751b = c11299c;
        recyclerView.setAdapter(c11299c);
    }

    /* JADX INFO: renamed from: s */
    public void m64497s(C11298b c11298b) {
        this.f41751b.m64534J(c11298b);
    }

    public TopicListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m64496p(context);
    }

    public TopicListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m64496p(context);
    }
}
