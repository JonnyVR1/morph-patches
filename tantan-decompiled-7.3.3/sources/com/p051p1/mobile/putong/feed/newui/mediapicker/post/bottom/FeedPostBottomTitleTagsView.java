package com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11408a;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.view.PostBottomTitleTagsItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p151v.VRecyclerView;
import p153l.bnl0;
import p153l.h80;
import p153l.i4g0;
import p153l.jyb;
import p153l.kic0;
import p153l.qa00;
import p153l.tec0;
import p153l.trg;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostBottomTitleTagsView extends VFrame {

    /* JADX INFO: renamed from: a */
    public Act f41595a;

    /* JADX INFO: renamed from: b */
    public C11408a f41596b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f41597c;

    /* JADX INFO: renamed from: d */
    public C11413c f41598d;

    /* JADX INFO: renamed from: e */
    public boolean f41599e;

    /* JADX INFO: renamed from: f */
    public trg f41600f;

    /* JADX INFO: renamed from: g */
    public x20 f41601g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTitleTagsView$a */
    public class C11411a extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f41602a;

        public C11411a(int i) {
            this.f41602a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            rect.left = 0;
            rect.right = this.f41602a;
            rect.top = 0;
            rect.bottom = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTitleTagsView$b */
    public class C11412b extends h80<String> {
        public C11412b() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(String str, int i) {
            if (i == 0) {
                return;
            }
            i4g0.m138492A("e_optional_title", "p_moment_post", jyb.m147494Y("little_options", str));
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(String str, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTitleTagsView$c */
    public class C11413c extends kic0<String> {

        /* JADX INFO: renamed from: d */
        public List<String> f41605d = new ArrayList();

        public C11413c() {
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            if (jyb.m147479J(this.f41605d)) {
                return 0;
            }
            return this.f41605d.size() + 1;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return FeedPostBottomTitleTagsView.this.f41595a.inflater().inflate(tec0.f173771v2, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final String str, int i, int i2) {
            final PostBottomTitleTagsItemView postBottomTitleTagsItemView = (PostBottomTitleTagsItemView) view;
            if (i2 == 0) {
                postBottomTitleTagsItemView.m64254d(str);
                postBottomTitleTagsItemView.setOnClickListener(null);
            } else {
                postBottomTitleTagsItemView.m64253c(str, FeedPostBottomTitleTagsView.this.f41600f.m192484d(str));
                bnl0.m105509E0(postBottomTitleTagsItemView, new View.OnClickListener() { // from class: l.pth
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f154074a.m64149I(str, postBottomTitleTagsItemView, view2);
                    }
                });
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return i == 0 ? "可选标题" : this.f41605d.get(i - 1);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m64149I(String str, PostBottomTitleTagsItemView postBottomTitleTagsItemView, View view) {
            boolean zM192484d = FeedPostBottomTitleTagsView.this.f41600f.m192484d(str);
            FeedPostBottomTitleTagsView feedPostBottomTitleTagsView = FeedPostBottomTitleTagsView.this;
            if (zM192484d) {
                feedPostBottomTitleTagsView.f41600f.m192487g(str);
                postBottomTitleTagsItemView.m64252b(false);
            } else {
                feedPostBottomTitleTagsView.f41600f.m192483c(str);
                postBottomTitleTagsItemView.m64252b(true);
                i4g0.m138523u("e_optional_title", "p_moment_post", jyb.m147494Y("little_options", str));
            }
        }

        /* JADX INFO: renamed from: J */
        public void m64150J(List<String> list) {
            this.f41605d = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return super.getItemViewType(i);
        }
    }

    public FeedPostBottomTitleTagsView(Context context) {
        super(context);
        this.f41601g = new x20() { // from class: l.oth
            @Override // p153l.x20
            public final void call() {
                this.f148958a.m64136B();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m64136B() {
        if (NullChecker.m82486a(this.f41598d)) {
            this.f41598d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m64140C(List<String> list, trg trgVar) {
        this.f41600f = trgVar;
        trgVar.m192488h(this.f41601g);
        this.f41598d.m64150J(list);
    }

    /* JADX INFO: renamed from: v */
    public final void m64141v() {
        this.f41597c.addItemDecoration(new C11411a(qa00.m175859d(4.0f)));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f41595a);
        linearLayoutManager.setOrientation(0);
        this.f41597c.setLayoutManager(linearLayoutManager);
        C11413c c11413c = new C11413c();
        this.f41598d = c11413c;
        c11413c.m149868E(new C11412b());
        this.f41597c.setAdapter(this.f41598d);
    }

    /* JADX INFO: renamed from: w */
    public void m64142w(Act act, C11408a c11408a) {
        this.f41599e = true;
        this.f41595a = act;
        this.f41596b = c11408a;
        this.f41597c = new VRecyclerView(act);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.f41597c.setLayoutParams(layoutParams);
        this.f41597c.setPadding(qa00.m175859d(6.0f), 0, qa00.f156326m, 0);
        this.f41597c.setClipToPadding(false);
        addView(this.f41597c);
        m64141v();
    }

    /* JADX INFO: renamed from: z */
    public boolean m64143z() {
        return this.f41599e;
    }

    public FeedPostBottomTitleTagsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41601g = new x20() { // from class: l.oth
            @Override // p153l.x20
            public final void call() {
                this.f148958a.m64136B();
            }
        };
    }

    public FeedPostBottomTitleTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41601g = new x20() { // from class: l.oth
            @Override // p153l.x20
            public final void call() {
                this.f148958a.m64136B();
            }
        };
    }
}
