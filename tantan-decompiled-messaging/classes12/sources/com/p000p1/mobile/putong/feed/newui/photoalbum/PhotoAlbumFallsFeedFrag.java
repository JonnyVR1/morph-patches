package com.p000p1.mobile.putong.feed.newui.photoalbum;

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
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import l.dac0;
import l.e30;
import l.e51;
import l.j760;
import l.mkd0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;
import p007l.b5c0;
import p007l.e1c0;
import p007l.o6c0;
import p007l.s370;
import p007l.v2h;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumFallsFeedFrag extends PutongFrag implements SwipeRefreshLayout.j {

    /* JADX INFO: renamed from: G */
    public static int f2658G = v2h.f14028a;

    /* JADX INFO: renamed from: H */
    public static List<Moment> f2659H = new ArrayList();

    /* JADX INFO: renamed from: I */
    public static Links f2660I;

    /* JADX INFO: renamed from: A */
    public VRecyclerView f2661A;

    /* JADX INFO: renamed from: B */
    public CommonEmptyView f2662B;

    /* JADX INFO: renamed from: C */
    public View f2663C;

    /* JADX INFO: renamed from: D */
    public C2114a f2664D;

    /* JADX INFO: renamed from: E */
    public boolean f2665E = true;

    /* JADX INFO: renamed from: F */
    public C2115b f2666F;

    /* JADX INFO: renamed from: z */
    public SwipeRefreshLayout f2667z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag$a */
    public class C2114a extends dac0<Moment> {

        /* JADX INFO: renamed from: c */
        public boolean f2668c = false;

        /* JADX INFO: renamed from: d */
        public Map<String, Integer> f2669d = new HashMap();

        public C2114a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public /* synthetic */ void m4636L(Throwable th) {
            this.f2668c = false;
        }

        /* JADX INFO: renamed from: C */
        public int m4638C() {
            return PhotoAlbumFallsFeedFrag.f2659H.size() + 1;
        }

        /* JADX INFO: renamed from: D */
        public View m4639D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return PhotoAlbumFallsFeedFrag.this.act().inflater().inflate(o6c0.f11296r5, viewGroup, false);
            }
            return i == 0 ? PhotoAlbumFallsFeedFrag.this.f2663C : new TextView(PhotoAlbumFallsFeedFrag.this.act());
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m4637A(View view, Moment moment, int i, int i2) {
            if (i == 1) {
                ((PhotoAlbumFallsFeedItem) view).m4652f(moment, PhotoAlbumFallsFeedFrag.this.f2661A, i2);
            }
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Moment getItem(int i) {
            if (i >= PhotoAlbumFallsFeedFrag.f2659H.size()) {
                return null;
            }
            return PhotoAlbumFallsFeedFrag.f2659H.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m4642I(RecyclerView.d0 d0Var, int i) {
            if (getItemViewType(i) == 0) {
                d0Var.itemView.getLayoutParams().i(true);
            }
        }

        /* JADX INFO: renamed from: J */
        public final boolean m4643J(RecyclerView.d0 d0Var) {
            ViewGroup.LayoutParams layoutParams = d0Var.itemView.getLayoutParams();
            return NullChecker.b(layoutParams) && (layoutParams instanceof StaggeredGridLayoutManager.c);
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ void m4644K(j760 j760Var) {
            if (NullChecker.b(j760Var)) {
                PhotoAlbumFallsFeedFrag.f2660I = (Links) j760Var.a;
                if (NullChecker.b(j760Var.b)) {
                    PhotoAlbumFallsFeedFrag.f2659H.addAll((Collection) j760Var.b);
                }
                PhotoAlbumFallsFeedFrag.this.m4630n5();
            }
            this.f2668c = false;
        }

        /* JADX INFO: renamed from: M */
        public void m4645M() {
            if (PhotoAlbumFallsFeedFrag.f2659H.size() <= 0 || !PhotoAlbumFallsFeedFrag.this.m4624c5(PhotoAlbumFallsFeedFrag.f2660I)) {
                PhotoAlbumFallsFeedFrag.this.f2663C.findViewById(b5c0.f6101w1).setVisibility(8);
                PhotoAlbumFallsFeedFrag.this.f2663C.findViewById(b5c0.f6003T1).setVisibility(0);
            } else {
                PhotoAlbumFallsFeedFrag.this.f2663C.findViewById(b5c0.f6101w1).setVisibility(0);
                PhotoAlbumFallsFeedFrag.this.f2663C.findViewById(b5c0.f6003T1).setVisibility(8);
            }
            this.f2669d.clear();
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: e */
        public void m4646e(int i) {
            if (this.f2668c || !PhotoAlbumFallsFeedFrag.this.m4624c5(PhotoAlbumFallsFeedFrag.f2660I) || PhotoAlbumFallsFeedFrag.f2659H.size() <= 0 || PhotoAlbumFallsFeedFrag.f2659H.size() - i > 10) {
                return;
            }
            this.f2668c = true;
            FeedModule.f316d.m16632ec(PhotoAlbumFallsFeedFrag.f2660I).subscribe(mkd0.H(new e30() { // from class: l.q370
                public final void call(Object obj) {
                    this.f12067a.m4644K((j760) obj);
                }
            }, new e30() { // from class: l.r370
                public final void call(Object obj) {
                    this.f12469a.m4636L((Throwable) obj);
                }
            }));
        }

        public long getItemId(int i) {
            return i;
        }

        public int getItemViewType(int i) {
            if (PhotoAlbumFallsFeedFrag.f2659H.size() != 0 || PhotoAlbumFallsFeedFrag.this.m4624c5(PhotoAlbumFallsFeedFrag.f2660I)) {
                return i == PhotoAlbumFallsFeedFrag.f2659H.size() ? 0 : 1;
            }
            return 2;
        }

        public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
            try {
                if (getItemViewType(i) == 1) {
                    ViewGroup.LayoutParams layoutParams = d0Var.itemView.getLayoutParams();
                    Moment moment = PhotoAlbumFallsFeedFrag.f2659H.get(i);
                    if (NullChecker.b(moment)) {
                        if (NullChecker.a(this.f2669d.get(((DbObject) moment).id))) {
                            layoutParams.height = this.f2669d.get(((DbObject) moment).id).intValue();
                        } else {
                            int iY0 = xdl0.y0() / 2;
                            if (moment.media.isEmpty()) {
                                layoutParams.width = iY0;
                                layoutParams.height = iY0;
                            } else {
                                Picture pictureCover = moment.media.get(0).cover();
                                if (pictureCover == null) {
                                    pictureCover = null;
                                }
                                if (NullChecker.b(pictureCover)) {
                                    Point point = new Point();
                                    point.x = iY0;
                                    Dimension dimension = pictureCover.size;
                                    int i2 = (int) ((iY0 / dimension.width) * dimension.height);
                                    point.y = i2;
                                    layoutParams.width = iY0;
                                    layoutParams.height = i2;
                                }
                            }
                            this.f2669d.put(((DbObject) moment).id, Integer.valueOf(layoutParams.height));
                        }
                        d0Var.itemView.setLayoutParams(layoutParams);
                    }
                }
                super.onBindViewHolder(d0Var, i);
            } catch (Exception e) {
                CrashHelper.c(new Exception("PhotoAlbumFallFeedFrag unknownException:" + e));
            }
        }

        public void onViewAttachedToWindow(RecyclerView.d0 d0Var) {
            super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
            if (m4643J(d0Var)) {
                m4642I(d0Var, d0Var.getLayoutPosition());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag$b */
    public class C2115b extends RecyclerView.n {

        /* JADX INFO: renamed from: a */
        public int f2671a;

        public C2115b(int i) {
            this.f2671a = i;
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int i = this.f2671a;
            rect.left = i;
            rect.right = i;
            rect.bottom = i;
            rect.top = i;
        }
    }

    public PhotoAlbumFallsFeedFrag() {
        creates(new e30() { // from class: l.d370
            public final void call(Object obj) {
                this.f6793a.m4618d5((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.h370
            public final Object call() {
                return FeedModule.f316d.m16646gc();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.i370
            public final void call(Object obj) {
                this.f8883a.m4619e5((j760) obj);
            }
        }, new e30() { // from class: l.j370
            public final void call(Object obj) {
                this.f9208a.m4620f5((Throwable) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.k370
            public final Object call() {
                return FeedModule.f316d.f14988l0;
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.l370
            public final void call(Object obj) {
                this.f9862a.m4625g5((Map) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.m370
            public final Object call() {
                return FeedModule.f316d.f14996p0;
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.n370
            public final void call(Object obj) {
                this.f10636a.m4626h5((Moment) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public /* synthetic */ void m4618d5(Bundle bundle) {
        this.f2661A.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        if (this.f2666F == null) {
            C2115b c2115b = new C2115b(5);
            this.f2666F = c2115b;
            this.f2661A.addItemDecoration(c2115b);
        }
        this.f2661A.setAdapter(this.f2664D);
        this.f2667z.setRefreshing(true);
        this.f2667z.setOnRefreshListener(this);
        this.f2667z.setColorSchemeResources(new int[]{e1c0.f7149k0, e1c0.f7143h0, e1c0.f7145i0, e1c0.f7147j0});
        f2660I = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public /* synthetic */ void m4619e5(j760 j760Var) {
        this.f2667z.setRefreshing(false);
        f2660I = (Links) j760Var.a;
        f2659H.clear();
        f2659H.addAll((Collection) j760Var.b);
        m4630n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m4620f5(Throwable th) {
        this.f2667z.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i5 */
    public /* synthetic */ void m4621i5(j760 j760Var) {
        this.f2667z.setRefreshing(false);
        f2660I = (Links) j760Var.a;
        f2659H.clear();
        f2659H.addAll((Collection) j760Var.b);
        m4630n5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public /* synthetic */ void m4622j5(Throwable th) {
        this.f2667z.setRefreshing(false);
    }

    /* JADX INFO: renamed from: b5 */
    public View m4623b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s370.m14004b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m4624c5(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m4625g5(Map map) {
        ListIterator<Moment> listIterator = f2659H.listIterator();
        while (listIterator.hasNext()) {
            Moment next = listIterator.next();
            if (NullChecker.b(next) && !next.equals(map.get(((DbObject) next).id))) {
                f2659H.set(f2659H.indexOf(next), (Moment) map.get(((DbObject) next).id));
            }
        }
        m4630n5();
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m4626h5(final Moment moment) {
        int iG = vwb.G(f2659H, new w9j() { // from class: l.g370
            public final Object call(Object obj) {
                Moment moment2 = (Moment) obj;
                return Boolean.valueOf(moment2 != null && ((DbObject) moment2).id.equals(((DbObject) moment).id));
            }
        });
        if (iG != -1) {
            f2659H.remove(iG);
            m4630n5();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM4623b5 = m4623b5(layoutInflater, viewGroup);
        viewM4623b5.setBackgroundColor(getResources().getColor(e1c0.f7159p0));
        this.f2663C = act().inflater().inflate(o6c0.f11346z, (ViewGroup) null, false);
        this.f2664D = new C2114a();
        return viewM4623b5;
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m4627k5() {
        this.f2661A.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m4628l5(int i) {
        this.f2661A.smoothScrollToPosition(i);
    }

    /* JADX INFO: renamed from: m5 */
    public void m4629m5() {
        SwipeRefreshLayout swipeRefreshLayout = this.f2667z;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(true);
        m4633q();
        e51.G(new Runnable() { // from class: l.e370
            @Override // java.lang.Runnable
            public final void run() {
                this.f7188a.m4627k5();
            }
        });
    }

    /* JADX INFO: renamed from: n5 */
    public final void m4630n5() {
        this.f2664D.m4645M();
        if (f2659H.size() != 0 || m4624c5(f2660I)) {
            this.f2662B.setVisibility(8);
        } else {
            this.f2662B.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public void m4631o5(String str) {
        final int i = 0;
        for (int i2 = 0; i2 < f2659H.size(); i2++) {
            if (((DbObject) f2659H.get(i2)).id.equals(str)) {
                i = i2;
                break;
            }
        }
        e51.G(new Runnable() { // from class: l.f370
            @Override // java.lang.Runnable
            public final void run() {
                this.f7561a.m4628l5(i);
            }
        });
    }

    /* JADX INFO: renamed from: p5 */
    public void m4632p5(boolean z) {
        this.f2665E = z;
    }

    /* JADX INFO: renamed from: q */
    public void m4633q() {
        FeedModule.f316d.m16646gc().subscribe(mkd0.H(new e30() { // from class: l.o370
            public final void call(Object obj) {
                this.f10990a.m4621i5((j760) obj);
            }
        }, new e30() { // from class: l.p370
            public final void call(Object obj) {
                this.f11681a.m4622j5((Throwable) obj);
            }
        }));
    }
}
