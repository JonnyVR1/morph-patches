package com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2089a;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.view.PostBottomTitleTagsItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p007l.eac0;
import p007l.eqg;
import p007l.l80;
import p007l.o6c0;
import v.VFrame;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostBottomTitleTagsView extends VFrame {

    /* JADX INFO: renamed from: a */
    public Act f2208a;

    /* JADX INFO: renamed from: b */
    public C2089a f2209b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f2210c;

    /* JADX INFO: renamed from: d */
    public C2094c f2211d;

    /* JADX INFO: renamed from: e */
    public boolean f2212e;

    /* JADX INFO: renamed from: f */
    public eqg f2213f;

    /* JADX INFO: renamed from: g */
    public d30 f2214g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTitleTagsView$a */
    public class C2092a extends RecyclerView.n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2215a;

        public C2092a(int i) {
            this.f2215a = i;
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            rect.left = 0;
            rect.right = this.f2215a;
            rect.top = 0;
            rect.bottom = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTitleTagsView$b */
    public class C2093b extends l80<String> {
        public C2093b() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(String str, int i) {
            if (i == 0) {
                return;
            }
            zvf0.A("e_optional_title", "p_moment_post", new j760[]{vwb.Y("little_options", str)});
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(String str, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTitleTagsView$c */
    public class C2094c extends eac0<String> {

        /* JADX INFO: renamed from: d */
        public List<String> f2218d = new ArrayList();

        public C2094c() {
        }

        /* JADX INFO: renamed from: C */
        public int m3978C() {
            if (vwb.J(this.f2218d)) {
                return 0;
            }
            return this.f2218d.size() + 1;
        }

        /* JADX INFO: renamed from: D */
        public View m3979D(ViewGroup viewGroup, int i) {
            return FeedPostBottomTitleTagsView.this.f2208a.inflater().inflate(o6c0.f11321v2, viewGroup, false);
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m3977A(View view, final String str, int i, int i2) {
            final PostBottomTitleTagsItemView postBottomTitleTagsItemView = (PostBottomTitleTagsItemView) view;
            if (i2 == 0) {
                postBottomTitleTagsItemView.m4087d(str);
                postBottomTitleTagsItemView.setOnClickListener(null);
            } else {
                postBottomTitleTagsItemView.m4086c(str, FeedPostBottomTitleTagsView.this.f2213f.m9949d(str));
                xdl0.E0(postBottomTitleTagsItemView, new View.OnClickListener() { // from class: l.ash
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f5839a.m3982I(str, postBottomTitleTagsItemView, view2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return i == 0 ? "可选标题" : this.f2218d.get(i - 1);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m3982I(String str, PostBottomTitleTagsItemView postBottomTitleTagsItemView, View view) {
            boolean zM9949d = FeedPostBottomTitleTagsView.this.f2213f.m9949d(str);
            FeedPostBottomTitleTagsView feedPostBottomTitleTagsView = FeedPostBottomTitleTagsView.this;
            if (zM9949d) {
                feedPostBottomTitleTagsView.f2213f.m9952g(str);
                postBottomTitleTagsItemView.m4085b(false);
            } else {
                feedPostBottomTitleTagsView.f2213f.m9948c(str);
                postBottomTitleTagsItemView.m4085b(true);
                zvf0.u("e_optional_title", "p_moment_post", new j760[]{vwb.Y("little_options", str)});
            }
        }

        /* JADX INFO: renamed from: J */
        public void m3983J(List<String> list) {
            this.f2218d = list;
            notifyDataSetChanged();
        }

        public int getItemViewType(int i) {
            return super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.getItemViewType(i);
        }
    }

    public FeedPostBottomTitleTagsView(Context context) {
        super(context);
        this.f2214g = new d30() { // from class: l.zrh
            public final void call() {
                this.f15848a.m3966B();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m3966B() {
        if (NullChecker.a(this.f2211d)) {
            this.f2211d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m3970C(List<String> list, eqg eqgVar) {
        this.f2213f = eqgVar;
        eqgVar.m9953h(this.f2214g);
        this.f2211d.m3983J(list);
    }

    /* JADX INFO: renamed from: v */
    public final void m3971v() {
        this.f2210c.addItemDecoration(new C2092a(t100.d(4.0f)));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f2208a);
        linearLayoutManager.setOrientation(0);
        this.f2210c.setLayoutManager(linearLayoutManager);
        C2094c c2094c = new C2094c();
        this.f2211d = c2094c;
        c2094c.m9685E(new C2093b());
        this.f2210c.setAdapter(this.f2211d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public void m3972w(Act act, C2089a c2089a) {
        this.f2212e = true;
        this.f2208a = act;
        this.f2209b = c2089a;
        this.f2210c = new VRecyclerView(act);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.f2210c.setLayoutParams(layoutParams);
        this.f2210c.setPadding(t100.d(6.0f), 0, t100.m, 0);
        this.f2210c.setClipToPadding(false);
        addView(this.f2210c);
        m3971v();
    }

    /* JADX INFO: renamed from: z */
    public boolean m3973z() {
        return this.f2212e;
    }

    public FeedPostBottomTitleTagsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2214g = new d30() { // from class: l.zrh
            public final void call() {
                this.f15848a.m3966B();
            }
        };
    }

    public FeedPostBottomTitleTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2214g = new d30() { // from class: l.zrh
            public final void call() {
                this.f15848a.m3966B();
            }
        };
    }
}
