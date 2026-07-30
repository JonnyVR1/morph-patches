package com.p051p1.mobile.putong.feed.newui.topic.topiclist;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VRecyclerView;
import p153l.bnl0;
import p153l.er60;
import p153l.h80;
import p153l.l9j0;
import p153l.qa00;
import p153l.zzk;

/* JADX INFO: loaded from: classes13.dex */
public class TopicNearByHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f44073a;

    /* JADX INFO: renamed from: b */
    public View f44074b;

    /* JADX INFO: renamed from: c */
    public StaggeredGridLayoutManager f44075c;

    /* JADX INFO: renamed from: d */
    public l9j0 f44076d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.topiclist.TopicNearByHeaderView$a */
    public class C11535a extends h80<TopicMoment> {
        public C11535a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(TopicMoment topicMoment, int i) {
            er60.m122104w().m122114c(topicMoment, OMSDialogPositon.p_nearby);
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(TopicMoment topicMoment, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.topic.topiclist.TopicNearByHeaderView$b */
    public static class C11536b extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a */
        public int f44078a;

        public C11536b(int i) {
            this.f44078a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            rect.right = this.f44078a / 2;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.f44078a;
            if (childAdapterPosition > 1) {
                rect.left = i / 2;
            } else {
                rect.left = i;
            }
            int i2 = this.f44078a;
            rect.top = i2 / 2;
            rect.bottom = i2 / 2;
        }
    }

    public TopicNearByHeaderView(@NonNull Act act) {
        super(act);
        m67306b(act);
    }

    /* JADX INFO: renamed from: a */
    public final void m67305a(List<TopicMoment> list) {
        int size = list.size();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f44075c;
        if (size < 2) {
            if (staggeredGridLayoutManager.m3501G() != 1) {
                this.f44075c.m3516W(1);
            }
        } else if (staggeredGridLayoutManager.m3501G() != 2) {
            this.f44075c.m3516W(2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m67306b(Act act) {
        if (getPaddingTop() <= 0) {
            setPadding(getPaddingLeft(), 1, getPaddingRight(), getPaddingBottom());
        }
        m67307c(act);
    }

    /* JADX INFO: renamed from: c */
    public final void m67307c(Act act) {
        this.f44073a = new VRecyclerView(act);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        layoutParams.topMargin = qa00.m175859d(12.0f);
        layoutParams.bottomMargin = qa00.m175859d(18.0f);
        this.f44073a.setLayoutParams(layoutParams);
        this.f44075c = new StaggeredGridLayoutManager(2, 0);
        this.f44073a.addItemDecoration(new C11536b(qa00.m175859d(12.0f)));
        this.f44073a.setLayoutManager(this.f44075c);
        l9j0 l9j0Var = new l9j0(act);
        this.f44076d = l9j0Var;
        l9j0Var.m149868E(new C11535a());
        this.f44073a.setAdapter(this.f44076d);
    }

    /* JADX INFO: renamed from: d */
    public final void m67308d() {
        if (this.f44073a.getParent() == null) {
            addView(this.f44073a);
        }
        if (NullChecker.m82486a(this.f44074b) && this.f44074b.getParent() == null) {
            addView(this.f44074b);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m67309e(List<TopicMoment> list) {
        if ((this.f44073a.getVisibility() == 0) != (list.size() > 0)) {
            bnl0.m105524M(this.f44073a, list.size() > 0);
            if (NullChecker.m82486a(this.f44074b)) {
                bnl0.m105524M(this.f44074b, list.size() > 0);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m67310f(List<TopicMoment> list) {
        m67308d();
        m67305a(list);
        m67309e(list);
        this.f44076d.m153434J(list);
    }

    public l9j0 getmAdapter() {
        return this.f44076d;
    }

    public VRecyclerView getmRecyclerView() {
        return this.f44073a;
    }

    public void setHeader(View view) {
        zzk zzkVar = new zzk(this.f44076d);
        zzkVar.m222265H(view);
        getmRecyclerView().setAdapter(zzkVar);
    }
}
