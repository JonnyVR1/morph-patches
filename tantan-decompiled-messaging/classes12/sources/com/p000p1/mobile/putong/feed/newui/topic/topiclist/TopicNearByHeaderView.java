package com.p000p1.mobile.putong.feed.newui.topic.topiclist;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.jxk;
import l.t100;
import l.xdl0;
import p007l.h0j0;
import p007l.l80;
import p007l.zi60;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicNearByHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f4686a;

    /* JADX INFO: renamed from: b */
    public View f4687b;

    /* JADX INFO: renamed from: c */
    public StaggeredGridLayoutManager f4688c;

    /* JADX INFO: renamed from: d */
    public h0j0 f4689d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.topiclist.TopicNearByHeaderView$a */
    public class C2216a extends l80<TopicMoment> {
        public C2216a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(TopicMoment topicMoment, int i) {
            zi60.m17436w().m17446c(topicMoment, OMSDialogPositon.p_nearby);
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(TopicMoment topicMoment, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.topiclist.TopicNearByHeaderView$b */
    public static class C2217b extends RecyclerView.n {

        /* JADX INFO: renamed from: a */
        public int f4691a;

        public C2217b(int i) {
            this.f4691a = i;
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            rect.right = this.f4691a / 2;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.f4691a;
            if (childAdapterPosition > 1) {
                rect.left = i / 2;
            } else {
                rect.left = i;
            }
            int i2 = this.f4691a;
            rect.top = i2 / 2;
            rect.bottom = i2 / 2;
        }
    }

    public TopicNearByHeaderView(@NonNull Act act) {
        super(act);
        m7275b(act);
    }

    /* JADX INFO: renamed from: a */
    public final void m7274a(List<TopicMoment> list) {
        int size = list.size();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f4688c;
        if (size < 2) {
            if (staggeredGridLayoutManager.G() != 1) {
                this.f4688c.W(1);
            }
        } else if (staggeredGridLayoutManager.G() != 2) {
            this.f4688c.W(2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7275b(Act act) {
        if (getPaddingTop() <= 0) {
            setPadding(getPaddingLeft(), 1, getPaddingRight(), getPaddingBottom());
        }
        m7276c(act);
    }

    /* JADX INFO: renamed from: c */
    public final void m7276c(Act act) {
        this.f4686a = new VRecyclerView(act);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        layoutParams.topMargin = t100.d(12.0f);
        layoutParams.bottomMargin = t100.d(18.0f);
        this.f4686a.setLayoutParams(layoutParams);
        this.f4688c = new StaggeredGridLayoutManager(2, 0);
        this.f4686a.addItemDecoration(new C2217b(t100.d(12.0f)));
        this.f4686a.setLayoutManager(this.f4688c);
        h0j0 h0j0Var = new h0j0(act);
        this.f4689d = h0j0Var;
        h0j0Var.m9685E(new C2216a());
        this.f4686a.setAdapter(this.f4689d);
    }

    /* JADX INFO: renamed from: d */
    public final void m7277d() {
        if (this.f4686a.getParent() == null) {
            addView(this.f4686a);
        }
        if (NullChecker.a(this.f4687b) && this.f4687b.getParent() == null) {
            addView(this.f4687b);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7278e(List<TopicMoment> list) {
        if ((this.f4686a.getVisibility() == 0) != (list.size() > 0)) {
            xdl0.M(this.f4686a, list.size() > 0);
            if (NullChecker.a(this.f4687b)) {
                xdl0.M(this.f4687b, list.size() > 0);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m7279f(List<TopicMoment> list) {
        m7277d();
        m7274a(list);
        m7278e(list);
        this.f4689d.m10513J(list);
    }

    public h0j0 getmAdapter() {
        return this.f4689d;
    }

    public VRecyclerView getmRecyclerView() {
        return this.f4686a;
    }

    public void setHeader(View view) {
        jxk jxkVar = new jxk(this.f4689d);
        jxkVar.H(view);
        getmRecyclerView().setAdapter(jxkVar);
    }
}
