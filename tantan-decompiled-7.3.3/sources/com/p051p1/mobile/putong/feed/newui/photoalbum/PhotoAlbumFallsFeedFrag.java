package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p151v.VRecyclerView;
import p153l.bnl0;
import p153l.hdc0;
import p153l.jic0;
import p153l.jyb;
import p153l.k4h;
import p153l.k9c0;
import p153l.l51;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.tec0;
import p153l.y20;
import p153l.yb70;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumFallsFeedFrag extends PutongFrag implements SwipeRefreshLayout.InterfaceC0702j {

    /* JADX INFO: renamed from: G */
    public static int f42045G = k4h.f123888a;

    /* JADX INFO: renamed from: H */
    public static List<Moment> f42046H = new ArrayList();

    /* JADX INFO: renamed from: I */
    public static Links f42047I;

    /* JADX INFO: renamed from: A */
    public VRecyclerView f42048A;

    /* JADX INFO: renamed from: B */
    public CommonEmptyView f42049B;

    /* JADX INFO: renamed from: C */
    public View f42050C;

    /* JADX INFO: renamed from: D */
    public C11433a f42051D;

    /* JADX INFO: renamed from: E */
    public boolean f42052E = true;

    /* JADX INFO: renamed from: F */
    public C11434b f42053F;

    /* JADX INFO: renamed from: z */
    public SwipeRefreshLayout f42054z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag$a */
    public class C11433a extends jic0<Moment> {

        /* JADX INFO: renamed from: c */
        public boolean f42055c = false;

        /* JADX INFO: renamed from: d */
        public Map<String, Integer> f42056d = new HashMap();

        public C11433a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public /* synthetic */ void m64801L(Throwable th) {
            this.f42055c = false;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            return PhotoAlbumFallsFeedFrag.f42046H.size() + 1;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return PhotoAlbumFallsFeedFrag.this.act().inflater().inflate(tec0.f173746r5, viewGroup, false);
            }
            return i == 0 ? PhotoAlbumFallsFeedFrag.this.f42050C : new TextView(PhotoAlbumFallsFeedFrag.this.act());
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, Moment moment, int i, int i2) {
            if (i == 1) {
                ((PhotoAlbumFallsFeedItem) view).m64813f(moment, PhotoAlbumFallsFeedFrag.this.f42048A, i2);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Moment getItem(int i) {
            if (i >= PhotoAlbumFallsFeedFrag.f42046H.size()) {
                return null;
            }
            return PhotoAlbumFallsFeedFrag.f42046H.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m64804I(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
            if (getItemViewType(i) == 0) {
                ((StaggeredGridLayoutManager.C0595c) abstractC0569e0.itemView.getLayoutParams()).m3577i(true);
            }
        }

        /* JADX INFO: renamed from: J */
        public final boolean m64805J(RecyclerView.AbstractC0569e0 abstractC0569e0) {
            ViewGroup.LayoutParams layoutParams = abstractC0569e0.itemView.getLayoutParams();
            return NullChecker.m82487b(layoutParams) && (layoutParams instanceof StaggeredGridLayoutManager.C0595c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: K */
        public final /* synthetic */ void m64806K(pf60 pf60Var) {
            if (NullChecker.m82487b(pf60Var)) {
                PhotoAlbumFallsFeedFrag.f42047I = (Links) pf60Var.f152156a;
                if (NullChecker.m82487b(pf60Var.f152157b)) {
                    PhotoAlbumFallsFeedFrag.f42046H.addAll((Collection) pf60Var.f152157b);
                }
                PhotoAlbumFallsFeedFrag.this.m64796n5();
            }
            this.f42055c = false;
        }

        /* JADX INFO: renamed from: M */
        public void m64807M() {
            if (PhotoAlbumFallsFeedFrag.f42046H.size() <= 0 || !PhotoAlbumFallsFeedFrag.this.m64790c5(PhotoAlbumFallsFeedFrag.f42047I)) {
                PhotoAlbumFallsFeedFrag.this.f42050C.findViewById(hdc0.f108973w1).setVisibility(8);
                PhotoAlbumFallsFeedFrag.this.f42050C.findViewById(hdc0.f108875T1).setVisibility(0);
            } else {
                PhotoAlbumFallsFeedFrag.this.f42050C.findViewById(hdc0.f108973w1).setVisibility(0);
                PhotoAlbumFallsFeedFrag.this.f42050C.findViewById(hdc0.f108875T1).setVisibility(8);
            }
            this.f42056d.clear();
            notifyDataSetChanged();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: e */
        public void mo48510e(int i) {
            if (this.f42055c || !PhotoAlbumFallsFeedFrag.this.m64790c5(PhotoAlbumFallsFeedFrag.f42047I) || PhotoAlbumFallsFeedFrag.f42046H.size() <= 0 || PhotoAlbumFallsFeedFrag.f42046H.size() - i > 10) {
                return;
            }
            this.f42055c = true;
            FeedModule.f39703d.m145692ec(PhotoAlbumFallsFeedFrag.f42047I).subscribe(psd0.m173597H(new y20() { // from class: l.wb70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188209a.m64806K((pf60) obj);
                }
            }, new y20() { // from class: l.xb70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f193134a.m64801L((Throwable) obj);
                }
            }));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (PhotoAlbumFallsFeedFrag.f42046H.size() != 0 || PhotoAlbumFallsFeedFrag.this.m64790c5(PhotoAlbumFallsFeedFrag.f42047I)) {
                return i == PhotoAlbumFallsFeedFrag.f42046H.size() ? 0 : 1;
            }
            return 2;
        }

        @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
            try {
                if (getItemViewType(i) == 1) {
                    ViewGroup.LayoutParams layoutParams = abstractC0569e0.itemView.getLayoutParams();
                    Moment moment = PhotoAlbumFallsFeedFrag.f42046H.get(i);
                    if (NullChecker.m82487b(moment)) {
                        if (NullChecker.m82486a(this.f42056d.get(moment.f56859id))) {
                            layoutParams.height = this.f42056d.get(moment.f56859id).intValue();
                        } else {
                            int iM105592y0 = bnl0.m105592y0() / 2;
                            if (moment.media.isEmpty()) {
                                layoutParams.width = iM105592y0;
                                layoutParams.height = iM105592y0;
                            } else {
                                Picture pictureCover = moment.media.get(0).cover();
                                if (pictureCover == null) {
                                    pictureCover = null;
                                }
                                if (NullChecker.m82487b(pictureCover)) {
                                    Point point = new Point();
                                    point.x = iM105592y0;
                                    Dimension dimension = pictureCover.size;
                                    int i2 = (int) ((iM105592y0 / dimension.width) * dimension.height);
                                    point.y = i2;
                                    layoutParams.width = iM105592y0;
                                    layoutParams.height = i2;
                                }
                            }
                            this.f42056d.put(moment.f56859id, Integer.valueOf(layoutParams.height));
                        }
                        abstractC0569e0.itemView.setLayoutParams(layoutParams);
                    }
                }
                super.onBindViewHolder(abstractC0569e0, i);
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("PhotoAlbumFallFeedFrag unknownException:" + e));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.AbstractC0569e0 abstractC0569e0) {
            super.onViewAttachedToWindow(abstractC0569e0);
            if (m64805J(abstractC0569e0)) {
                m64804I(abstractC0569e0, abstractC0569e0.getLayoutPosition());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag$b */
    public class C11434b extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a */
        public int f42058a;

        public C11434b(int i) {
            this.f42058a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            int i = this.f42058a;
            rect.left = i;
            rect.right = i;
            rect.bottom = i;
            rect.top = i;
        }
    }

    public PhotoAlbumFallsFeedFrag() {
        creates(new y20() { // from class: l.jb70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f119134a.m64784d5((Bundle) obj);
            }
        });
        duringCreated(new pcj() { // from class: l.nb70
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return FeedModule.f39703d.m145706gc();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ob70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145948a.m64785e5((pf60) obj);
            }
        }, new y20() { // from class: l.pb70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151350a.m64786f5((Throwable) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.qb70
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return FeedModule.f39703d.f121363l0;
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.rb70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161996a.m64791g5((Map) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.sb70
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return FeedModule.f39703d.f121371p0;
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.tb70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172838a.m64792h5((Moment) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public /* synthetic */ void m64784d5(Bundle bundle) {
        this.f42048A.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        if (this.f42053F == null) {
            C11434b c11434b = new C11434b(5);
            this.f42053F = c11434b;
            this.f42048A.addItemDecoration(c11434b);
        }
        this.f42048A.setAdapter(this.f42051D);
        this.f42054z.setRefreshing(true);
        this.f42054z.setOnRefreshListener(this);
        this.f42054z.setColorSchemeResources(k9c0.f124516k0, k9c0.f124510h0, k9c0.f124512i0, k9c0.f124514j0);
        f42047I = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e5 */
    public /* synthetic */ void m64785e5(pf60 pf60Var) {
        this.f42054z.setRefreshing(false);
        f42047I = (Links) pf60Var.f152156a;
        f42046H.clear();
        f42046H.addAll((Collection) pf60Var.f152157b);
        m64796n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m64786f5(Throwable th) {
        this.f42054z.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i5 */
    public /* synthetic */ void m64787i5(pf60 pf60Var) {
        this.f42054z.setRefreshing(false);
        f42047I = (Links) pf60Var.f152156a;
        f42046H.clear();
        f42046H.addAll((Collection) pf60Var.f152157b);
        m64796n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public /* synthetic */ void m64788j5(Throwable th) {
        this.f42054z.setRefreshing(false);
    }

    /* JADX INFO: renamed from: b5 */
    public View m64789b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yb70.m215017b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m64790c5(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m64791g5(Map map) {
        ListIterator<Moment> listIterator = f42046H.listIterator();
        while (listIterator.hasNext()) {
            Moment next = listIterator.next();
            if (NullChecker.m82487b(next) && !next.equals(map.get(next.f56859id))) {
                f42046H.set(f42046H.indexOf(next), (Moment) map.get(next.f56859id));
            }
        }
        m64796n5();
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m64792h5(final Moment moment) {
        int iM147476G = jyb.m147476G(f42046H, new qcj() { // from class: l.mb70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Moment moment2 = (Moment) obj;
                return Boolean.valueOf(moment2 != null && moment2.f56859id.equals(moment.f56859id));
            }
        });
        if (iM147476G != -1) {
            f42046H.remove(iM147476G);
            m64796n5();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM64789b5 = m64789b5(layoutInflater, viewGroup);
        viewM64789b5.setBackgroundColor(getResources().getColor(k9c0.f124526p0));
        this.f42050C = act().inflater().inflate(tec0.f173796z, (ViewGroup) null, false);
        this.f42051D = new C11433a();
        return viewM64789b5;
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m64793k5() {
        this.f42048A.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m64794l5(int i) {
        this.f42048A.smoothScrollToPosition(i);
    }

    /* JADX INFO: renamed from: m5 */
    public void m64795m5() {
        SwipeRefreshLayout swipeRefreshLayout = this.f42054z;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(true);
        mo4096p();
        l51.m152887G(new Runnable() { // from class: l.kb70
            @Override // java.lang.Runnable
            public final void run() {
                this.f124756a.m64793k5();
            }
        });
    }

    /* JADX INFO: renamed from: n5 */
    public final void m64796n5() {
        this.f42051D.m64807M();
        if (f42046H.size() != 0 || m64790c5(f42047I)) {
            this.f42049B.setVisibility(8);
        } else {
            this.f42049B.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public void m64797o5(String str) {
        final int i = 0;
        for (int i2 = 0; i2 < f42046H.size(); i2++) {
            if (f42046H.get(i2).f56859id.equals(str)) {
                i = i2;
                break;
            }
        }
        l51.m152887G(new Runnable() { // from class: l.lb70
            @Override // java.lang.Runnable
            public final void run() {
                this.f130784a.m64794l5(i);
            }
        });
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
    /* JADX INFO: renamed from: p */
    public void mo4096p() {
        FeedModule.f39703d.m145706gc().subscribe(psd0.m173597H(new y20() { // from class: l.ub70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178285a.m64787i5((pf60) obj);
            }
        }, new y20() { // from class: l.vb70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183215a.m64788j5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p5 */
    public void m64798p5(boolean z) {
        this.f42052E = z;
    }
}
