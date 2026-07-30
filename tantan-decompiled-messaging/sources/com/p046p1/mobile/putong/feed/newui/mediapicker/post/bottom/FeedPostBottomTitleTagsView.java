package com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11245a;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.view.PostBottomTitleTagsItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p147v.VRecyclerView;
import p149l.d30;
import p149l.eac0;
import p149l.eqg;
import p149l.l80;
import p149l.o6c0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostBottomTitleTagsView extends VFrame {

    /* JADX INFO: renamed from: a */
    public Act f40747a;

    /* JADX INFO: renamed from: b */
    public C11245a f40748b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f40749c;

    /* JADX INFO: renamed from: d */
    public C11250c f40750d;

    /* JADX INFO: renamed from: e */
    public boolean f40751e;

    /* JADX INFO: renamed from: f */
    public eqg f40752f;

    /* JADX INFO: renamed from: g */
    public d30 f40753g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTitleTagsView$a */
    public class C11248a extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f40754a;

        public C11248a(int i) {
            this.f40754a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            rect.left = 0;
            rect.right = this.f40754a;
            rect.top = 0;
            rect.bottom = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTitleTagsView$b */
    public class C11249b extends l80<String> {
        public C11249b() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(String str, int i) {
            if (i == 0) {
                return;
            }
            zvf0.m220368A("e_optional_title", "p_moment_post", vwb.m200311Y("little_options", str));
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(String str, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomTitleTagsView$c */
    public class C11250c extends eac0<String> {

        /* JADX INFO: renamed from: d */
        public List<String> f40757d = new ArrayList();

        public C11250c() {
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            if (vwb.m200296J(this.f40757d)) {
                return 0;
            }
            return this.f40757d.size() + 1;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return FeedPostBottomTitleTagsView.this.f40747a.inflater().inflate(o6c0.f142302v2, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final String str, int i, int i2) {
            final PostBottomTitleTagsItemView postBottomTitleTagsItemView = (PostBottomTitleTagsItemView) view;
            if (i2 == 0) {
                postBottomTitleTagsItemView.m63071d(str);
                postBottomTitleTagsItemView.setOnClickListener(null);
            } else {
                postBottomTitleTagsItemView.m63070c(str, FeedPostBottomTitleTagsView.this.f40752f.m117742d(str));
                xdl0.m208329E0(postBottomTitleTagsItemView, new View.OnClickListener() { // from class: l.ash
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f71452a.m62966I(str, postBottomTitleTagsItemView, view2);
                    }
                });
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return i == 0 ? "可选标题" : this.f40757d.get(i - 1);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m62966I(String str, PostBottomTitleTagsItemView postBottomTitleTagsItemView, View view) {
            boolean zM117742d = FeedPostBottomTitleTagsView.this.f40752f.m117742d(str);
            FeedPostBottomTitleTagsView feedPostBottomTitleTagsView = FeedPostBottomTitleTagsView.this;
            if (zM117742d) {
                feedPostBottomTitleTagsView.f40752f.m117745g(str);
                postBottomTitleTagsItemView.m63069b(false);
            } else {
                feedPostBottomTitleTagsView.f40752f.m117741c(str);
                postBottomTitleTagsItemView.m63069b(true);
                zvf0.m220399u("e_optional_title", "p_moment_post", vwb.m200311Y("little_options", str));
            }
        }

        /* JADX INFO: renamed from: J */
        public void m62967J(List<String> list) {
            this.f40757d = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return super.getItemViewType(i);
        }
    }

    public FeedPostBottomTitleTagsView(Context context) {
        super(context);
        this.f40753g = new d30() { // from class: l.zrh
            @Override // p149l.d30
            public final void call() {
                this.f204514a.m62953B();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m62953B() {
        if (NullChecker.m81303a(this.f40750d)) {
            this.f40750d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m62957C(List<String> list, eqg eqgVar) {
        this.f40752f = eqgVar;
        eqgVar.m117746h(this.f40753g);
        this.f40750d.m62967J(list);
    }

    /* JADX INFO: renamed from: v */
    public final void m62958v() {
        this.f40749c.addItemDecoration(new C11248a(t100.m186890d(4.0f)));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f40747a);
        linearLayoutManager.setOrientation(0);
        this.f40749c.setLayoutManager(linearLayoutManager);
        C11250c c11250c = new C11250c();
        this.f40750d = c11250c;
        c11250c.m115416E(new C11249b());
        this.f40749c.setAdapter(this.f40750d);
    }

    /* JADX INFO: renamed from: w */
    public void m62959w(Act act, C11245a c11245a) {
        this.f40751e = true;
        this.f40747a = act;
        this.f40748b = c11245a;
        this.f40749c = new VRecyclerView(act);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        this.f40749c.setLayoutParams(layoutParams);
        this.f40749c.setPadding(t100.m186890d(6.0f), 0, t100.f167264m, 0);
        this.f40749c.setClipToPadding(false);
        addView(this.f40749c);
        m62958v();
    }

    /* JADX INFO: renamed from: z */
    public boolean m62960z() {
        return this.f40751e;
    }

    public FeedPostBottomTitleTagsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40753g = new d30() { // from class: l.zrh
            @Override // p149l.d30
            public final void call() {
                this.f204514a.m62953B();
            }
        };
    }

    public FeedPostBottomTitleTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40753g = new d30() { // from class: l.zrh
            @Override // p149l.d30
            public final void call() {
                this.f204514a.m62953B();
            }
        };
    }
}
