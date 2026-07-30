package com.p046p1.mobile.putong.feed.newui.topic.topiclist;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VRecyclerView;
import p149l.h0j0;
import p149l.jxk;
import p149l.l80;
import p149l.t100;
import p149l.xdl0;
import p149l.zi60;

/* JADX INFO: loaded from: classes12.dex */
public class TopicNearByHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f43225a;

    /* JADX INFO: renamed from: b */
    public View f43226b;

    /* JADX INFO: renamed from: c */
    public StaggeredGridLayoutManager f43227c;

    /* JADX INFO: renamed from: d */
    public h0j0 f43228d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.topiclist.TopicNearByHeaderView$a */
    public class C11372a extends l80<TopicMoment> {
        public C11372a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(TopicMoment topicMoment, int i) {
            zi60.m218961w().m218971c(topicMoment, OMSDialogPositon.p_nearby);
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(TopicMoment topicMoment, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.topiclist.TopicNearByHeaderView$b */
    public static class C11373b extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public int f43230a;

        public C11373b(int i) {
            this.f43230a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            rect.right = this.f43230a / 2;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.f43230a;
            if (childAdapterPosition > 1) {
                rect.left = i / 2;
            } else {
                rect.left = i;
            }
            int i2 = this.f43230a;
            rect.top = i2 / 2;
            rect.bottom = i2 / 2;
        }
    }

    public TopicNearByHeaderView(@NonNull Act act) {
        super(act);
        m66123b(act);
    }

    /* JADX INFO: renamed from: a */
    public final void m66122a(List<TopicMoment> list) {
        int size = list.size();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f43227c;
        if (size < 2) {
            if (staggeredGridLayoutManager.m3500G() != 1) {
                this.f43227c.m3515W(1);
            }
        } else if (staggeredGridLayoutManager.m3500G() != 2) {
            this.f43227c.m3515W(2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m66123b(Act act) {
        if (getPaddingTop() <= 0) {
            setPadding(getPaddingLeft(), 1, getPaddingRight(), getPaddingBottom());
        }
        m66124c(act);
    }

    /* JADX INFO: renamed from: c */
    public final void m66124c(Act act) {
        this.f43225a = new VRecyclerView(act);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        layoutParams.topMargin = t100.m186890d(12.0f);
        layoutParams.bottomMargin = t100.m186890d(18.0f);
        this.f43225a.setLayoutParams(layoutParams);
        this.f43227c = new StaggeredGridLayoutManager(2, 0);
        this.f43225a.addItemDecoration(new C11373b(t100.m186890d(12.0f)));
        this.f43225a.setLayoutManager(this.f43227c);
        h0j0 h0j0Var = new h0j0(act);
        this.f43228d = h0j0Var;
        h0j0Var.m115416E(new C11372a());
        this.f43225a.setAdapter(this.f43228d);
    }

    /* JADX INFO: renamed from: d */
    public final void m66125d() {
        if (this.f43225a.getParent() == null) {
            addView(this.f43225a);
        }
        if (NullChecker.m81303a(this.f43226b) && this.f43226b.getParent() == null) {
            addView(this.f43226b);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m66126e(List<TopicMoment> list) {
        if ((this.f43225a.getVisibility() == 0) != (list.size() > 0)) {
            xdl0.m208344M(this.f43225a, list.size() > 0);
            if (NullChecker.m81303a(this.f43226b)) {
                xdl0.m208344M(this.f43226b, list.size() > 0);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m66127f(List<TopicMoment> list) {
        m66125d();
        m66122a(list);
        m66126e(list);
        this.f43228d.m128963J(list);
    }

    public h0j0 getmAdapter() {
        return this.f43228d;
    }

    public VRecyclerView getmRecyclerView() {
        return this.f43225a;
    }

    public void setHeader(View view) {
        jxk jxkVar = new jxk(this.f43228d);
        jxkVar.m143815H(view);
        getmRecyclerView().setAdapter(jxkVar);
    }
}
