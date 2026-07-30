package com.p046p1.mobile.putong.feed.newui.photoalbum;

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
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p147v.VRecyclerView;
import p149l.b5c0;
import p149l.dac0;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.j760;
import p149l.mkd0;
import p149l.o6c0;
import p149l.s370;
import p149l.v2h;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumFallsFeedFrag extends PutongFrag implements SwipeRefreshLayout.InterfaceC0700j {

    /* JADX INFO: renamed from: G */
    public static int f41197G = v2h.f179548a;

    /* JADX INFO: renamed from: H */
    public static List<Moment> f41198H = new ArrayList();

    /* JADX INFO: renamed from: I */
    public static Links f41199I;

    /* JADX INFO: renamed from: A */
    public VRecyclerView f41200A;

    /* JADX INFO: renamed from: B */
    public CommonEmptyView f41201B;

    /* JADX INFO: renamed from: C */
    public View f41202C;

    /* JADX INFO: renamed from: D */
    public C11270a f41203D;

    /* JADX INFO: renamed from: E */
    public boolean f41204E = true;

    /* JADX INFO: renamed from: F */
    public C11271b f41205F;

    /* JADX INFO: renamed from: z */
    public SwipeRefreshLayout f41206z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag$a */
    public class C11270a extends dac0<Moment> {

        /* JADX INFO: renamed from: c */
        public boolean f41207c = false;

        /* JADX INFO: renamed from: d */
        public Map<String, Integer> f41208d = new HashMap();

        public C11270a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public /* synthetic */ void m63618L(Throwable th) {
            this.f41207c = false;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            return PhotoAlbumFallsFeedFrag.f41198H.size() + 1;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return PhotoAlbumFallsFeedFrag.this.act().inflater().inflate(o6c0.f142277r5, viewGroup, false);
            }
            return i == 0 ? PhotoAlbumFallsFeedFrag.this.f41202C : new TextView(PhotoAlbumFallsFeedFrag.this.act());
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, Moment moment, int i, int i2) {
            if (i == 1) {
                ((PhotoAlbumFallsFeedItem) view).m63630f(moment, PhotoAlbumFallsFeedFrag.this.f41200A, i2);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Moment getItem(int i) {
            if (i >= PhotoAlbumFallsFeedFrag.f41198H.size()) {
                return null;
            }
            return PhotoAlbumFallsFeedFrag.f41198H.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m63621I(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
            if (getItemViewType(i) == 0) {
                ((StaggeredGridLayoutManager.C0593c) abstractC0566d0.itemView.getLayoutParams()).m3576i(true);
            }
        }

        /* JADX INFO: renamed from: J */
        public final boolean m63622J(RecyclerView.AbstractC0566d0 abstractC0566d0) {
            ViewGroup.LayoutParams layoutParams = abstractC0566d0.itemView.getLayoutParams();
            return NullChecker.m81304b(layoutParams) && (layoutParams instanceof StaggeredGridLayoutManager.C0593c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: K */
        public final /* synthetic */ void m63623K(j760 j760Var) {
            if (NullChecker.m81304b(j760Var)) {
                PhotoAlbumFallsFeedFrag.f41199I = (Links) j760Var.f116564a;
                if (NullChecker.m81304b(j760Var.f116565b)) {
                    PhotoAlbumFallsFeedFrag.f41198H.addAll((Collection) j760Var.f116565b);
                }
                PhotoAlbumFallsFeedFrag.this.m63613n5();
            }
            this.f41207c = false;
        }

        /* JADX INFO: renamed from: M */
        public void m63624M() {
            if (PhotoAlbumFallsFeedFrag.f41198H.size() <= 0 || !PhotoAlbumFallsFeedFrag.this.m63607c5(PhotoAlbumFallsFeedFrag.f41199I)) {
                PhotoAlbumFallsFeedFrag.this.f41202C.findViewById(b5c0.f73620w1).setVisibility(8);
                PhotoAlbumFallsFeedFrag.this.f41202C.findViewById(b5c0.f73522T1).setVisibility(0);
            } else {
                PhotoAlbumFallsFeedFrag.this.f41202C.findViewById(b5c0.f73620w1).setVisibility(0);
                PhotoAlbumFallsFeedFrag.this.f41202C.findViewById(b5c0.f73522T1).setVisibility(8);
            }
            this.f41208d.clear();
            notifyDataSetChanged();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: e */
        public void mo47327e(int i) {
            if (this.f41207c || !PhotoAlbumFallsFeedFrag.this.m63607c5(PhotoAlbumFallsFeedFrag.f41199I) || PhotoAlbumFallsFeedFrag.f41198H.size() <= 0 || PhotoAlbumFallsFeedFrag.f41198H.size() - i > 10) {
                return;
            }
            this.f41207c = true;
            FeedModule.f38855d.m209451ec(PhotoAlbumFallsFeedFrag.f41199I).subscribe(mkd0.m154956H(new e30() { // from class: l.q370
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f152385a.m63623K((j760) obj);
                }
            }, new e30() { // from class: l.r370
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f157510a.m63618L((Throwable) obj);
                }
            }));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (PhotoAlbumFallsFeedFrag.f41198H.size() != 0 || PhotoAlbumFallsFeedFrag.this.m63607c5(PhotoAlbumFallsFeedFrag.f41199I)) {
                return i == PhotoAlbumFallsFeedFrag.f41198H.size() ? 0 : 1;
            }
            return 2;
        }

        @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
            try {
                if (getItemViewType(i) == 1) {
                    ViewGroup.LayoutParams layoutParams = abstractC0566d0.itemView.getLayoutParams();
                    Moment moment = PhotoAlbumFallsFeedFrag.f41198H.get(i);
                    if (NullChecker.m81304b(moment)) {
                        if (NullChecker.m81303a(this.f41208d.get(moment.f56011id))) {
                            layoutParams.height = this.f41208d.get(moment.f56011id).intValue();
                        } else {
                            int iM208412y0 = xdl0.m208412y0() / 2;
                            if (moment.media.isEmpty()) {
                                layoutParams.width = iM208412y0;
                                layoutParams.height = iM208412y0;
                            } else {
                                Picture pictureCover = moment.media.get(0).cover();
                                if (pictureCover == null) {
                                    pictureCover = null;
                                }
                                if (NullChecker.m81304b(pictureCover)) {
                                    Point point = new Point();
                                    point.x = iM208412y0;
                                    Dimension dimension = pictureCover.size;
                                    int i2 = (int) ((iM208412y0 / dimension.width) * dimension.height);
                                    point.y = i2;
                                    layoutParams.width = iM208412y0;
                                    layoutParams.height = i2;
                                }
                            }
                            this.f41208d.put(moment.f56011id, Integer.valueOf(layoutParams.height));
                        }
                        abstractC0566d0.itemView.setLayoutParams(layoutParams);
                    }
                }
                super.onBindViewHolder(abstractC0566d0, i);
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("PhotoAlbumFallFeedFrag unknownException:" + e));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.AbstractC0566d0 abstractC0566d0) {
            super.onViewAttachedToWindow(abstractC0566d0);
            if (m63622J(abstractC0566d0)) {
                m63621I(abstractC0566d0, abstractC0566d0.getLayoutPosition());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag$b */
    public class C11271b extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public int f41210a;

        public C11271b(int i) {
            this.f41210a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            int i = this.f41210a;
            rect.left = i;
            rect.right = i;
            rect.bottom = i;
            rect.top = i;
        }
    }

    public PhotoAlbumFallsFeedFrag() {
        creates(new e30() { // from class: l.d370
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83473a.m63601d5((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.h370
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return FeedModule.f38855d.m209465gc();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.i370
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110622a.m63602e5((j760) obj);
            }
        }, new e30() { // from class: l.j370
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116011a.m63603f5((Throwable) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.k370
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return FeedModule.f38855d.f193053l0;
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.l370
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125850a.m63608g5((Map) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.m370
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return FeedModule.f38855d.f193061p0;
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.n370
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136921a.m63609h5((Moment) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public /* synthetic */ void m63601d5(Bundle bundle) {
        this.f41200A.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        if (this.f41205F == null) {
            C11271b c11271b = new C11271b(5);
            this.f41205F = c11271b;
            this.f41200A.addItemDecoration(c11271b);
        }
        this.f41200A.setAdapter(this.f41203D);
        this.f41206z.setRefreshing(true);
        this.f41206z.setOnRefreshListener(this);
        this.f41206z.setColorSchemeResources(e1c0.f88793k0, e1c0.f88787h0, e1c0.f88789i0, e1c0.f88791j0);
        f41199I = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e5 */
    public /* synthetic */ void m63602e5(j760 j760Var) {
        this.f41206z.setRefreshing(false);
        f41199I = (Links) j760Var.f116564a;
        f41198H.clear();
        f41198H.addAll((Collection) j760Var.f116565b);
        m63613n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m63603f5(Throwable th) {
        this.f41206z.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i5 */
    public /* synthetic */ void m63604i5(j760 j760Var) {
        this.f41206z.setRefreshing(false);
        f41199I = (Links) j760Var.f116564a;
        f41198H.clear();
        f41198H.addAll((Collection) j760Var.f116565b);
        m63613n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public /* synthetic */ void m63605j5(Throwable th) {
        this.f41206z.setRefreshing(false);
    }

    /* JADX INFO: renamed from: b5 */
    public View m63606b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s370.m182123b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m63607c5(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m63608g5(Map map) {
        ListIterator<Moment> listIterator = f41198H.listIterator();
        while (listIterator.hasNext()) {
            Moment next = listIterator.next();
            if (NullChecker.m81304b(next) && !next.equals(map.get(next.f56011id))) {
                f41198H.set(f41198H.indexOf(next), (Moment) map.get(next.f56011id));
            }
        }
        m63613n5();
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m63609h5(final Moment moment) {
        int iM200293G = vwb.m200293G(f41198H, new w9j() { // from class: l.g370
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Moment moment2 = (Moment) obj;
                return Boolean.valueOf(moment2 != null && moment2.f56011id.equals(moment.f56011id));
            }
        });
        if (iM200293G != -1) {
            f41198H.remove(iM200293G);
            m63613n5();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM63606b5 = m63606b5(layoutInflater, viewGroup);
        viewM63606b5.setBackgroundColor(getResources().getColor(e1c0.f88803p0));
        this.f41202C = act().inflater().inflate(o6c0.f142327z, (ViewGroup) null, false);
        this.f41203D = new C11270a();
        return viewM63606b5;
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m63610k5() {
        this.f41200A.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m63611l5(int i) {
        this.f41200A.smoothScrollToPosition(i);
    }

    /* JADX INFO: renamed from: m5 */
    public void m63612m5() {
        SwipeRefreshLayout swipeRefreshLayout = this.f41206z;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(true);
        mo4094q();
        e51.m114742G(new Runnable() { // from class: l.e370
            @Override // java.lang.Runnable
            public final void run() {
                this.f88996a.m63610k5();
            }
        });
    }

    /* JADX INFO: renamed from: n5 */
    public final void m63613n5() {
        this.f41203D.m63624M();
        if (f41198H.size() != 0 || m63607c5(f41199I)) {
            this.f41201B.setVisibility(8);
        } else {
            this.f41201B.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public void m63614o5(String str) {
        final int i = 0;
        for (int i2 = 0; i2 < f41198H.size(); i2++) {
            if (f41198H.get(i2).f56011id.equals(str)) {
                i = i2;
                break;
            }
        }
        e51.m114742G(new Runnable() { // from class: l.f370
            @Override // java.lang.Runnable
            public final void run() {
                this.f94248a.m63611l5(i);
            }
        });
    }

    /* JADX INFO: renamed from: p5 */
    public void m63615p5(boolean z) {
        this.f41204E = z;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
    /* JADX INFO: renamed from: q */
    public void mo4094q() {
        FeedModule.f38855d.m209465gc().subscribe(mkd0.m154956H(new e30() { // from class: l.o370
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141627a.m63604i5((j760) obj);
            }
        }, new e30() { // from class: l.p370
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146965a.m63605j5((Throwable) obj);
            }
        }));
    }
}
