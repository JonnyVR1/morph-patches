package com.p000p1.mobile.putong.feed.newui.kankan.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.CameraCategory;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p000p1.mobile.putong.feed.newui.kankan.view.C2055a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.d30;
import l.e30;
import l.g30;
import l.j760;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import p007l.jvg;
import p007l.oe3;
import p007l.yb4;
import p007l.ze5;
import p007l.zxb;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2055a extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a */
    public Context f1697a;

    /* JADX INFO: renamed from: f */
    public g30<Integer, CameraSticker, Boolean> f1702f;

    /* JADX INFO: renamed from: g */
    public d30 f1703g;

    /* JADX INFO: renamed from: i */
    public List<Integer> f1705i;

    /* JADX INFO: renamed from: b */
    public int f1698b = xdl0.w(54.0f);

    /* JADX INFO: renamed from: h */
    public Set<String> f1704h = new HashSet();

    /* JADX INFO: renamed from: j */
    public rx.subjects.a<j760<List<CameraSticker>, Integer>> f1706j = rx.subjects.a.b();

    /* JADX INFO: renamed from: c */
    public List<CameraCategory> f1699c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Map<String, List<CameraSticker>> f1700d = new HashMap();

    /* JADX INFO: renamed from: e */
    public Map<Integer, RecyclerView> f1701e = new HashMap();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.a$a */
    public class a extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w f1707a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LinearLayoutManager f1708b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvg f1709c;

        public a(w wVar, LinearLayoutManager linearLayoutManager, jvg jvgVar) {
            this.f1707a = wVar;
            this.f1708b = linearLayoutManager;
            this.f1709c = jvgVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View viewH;
            if (i != 0 || (viewH = this.f1707a.h(this.f1708b)) == null || this.f1709c == null) {
                return;
            }
            int iA = viewH.getLayoutParams().a();
            this.f1709c.f9534f.call(new xaj0(this.f1709c.getItem(iA), Integer.valueOf(iA), Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.a$b */
    public class b implements FeedComicFacePropMenuView.InterfaceC2054f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvg f1711a;

        public b(jvg jvgVar) {
            this.f1711a = jvgVar;
        }

        @Override // com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView.InterfaceC2054f
        /* JADX INFO: renamed from: a */
        public void mo3142a(boolean z, int i) {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView.InterfaceC2054f
        /* JADX INFO: renamed from: b */
        public void mo3143b(List<Integer> list) {
            if (C2055a.this.f1705i != null && C2055a.this.f1705i.size() > 0) {
                C2055a.this.f1705i.removeAll(list);
            }
            C2055a c2055a = C2055a.this;
            c2055a.m3155J(this.f1711a, c2055a.f1705i);
            C2055a.this.m3159O(this.f1711a, list);
            C2055a.this.f1705i = new ArrayList(list);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.a$c */
    public static class c extends RecyclerView.d0 {
        public c(RecyclerView recyclerView) {
            super(recyclerView);
        }
    }

    public C2055a(Context context) {
        this.f1697a = context;
    }

    /* JADX INFO: renamed from: N */
    private void m3149N(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (NullChecker.b(cameraSticker)) {
                CameraSticker cameraSticker2 = yb4.m17102c().m17105d().get(cameraSticker.f680id);
                if (NullChecker.a(cameraSticker2)) {
                    cameraSticker.state = cameraSticker2.state;
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m3151z(Throwable th) {
    }

    /* JADX INFO: renamed from: G */
    public void m3152G(List<CameraSticker> list, String str) {
        if (NullChecker.a(list) && NullChecker.a(str)) {
            for (CameraSticker cameraSticker : list) {
                if (NullChecker.b(cameraSticker)) {
                    cameraSticker.cId = str;
                }
            }
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void m3156K(String str, List<CameraSticker> list, int i) {
        if (list == null) {
            return;
        }
        this.f1700d.put(str, list);
        m3152G(list, str);
        m3149N(list);
        m3165U(list, i);
        this.f1706j.onNext(new j760(list, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: I */
    public RecyclerView m3154I(int i) {
        return this.f1701e.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: J */
    public final void m3155J(jvg jvgVar, List<Integer> list) {
        if (vwb.J(list)) {
            return;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            CameraSticker cameraStickerM11360K = jvgVar.getItem(it.next().intValue());
            if (cameraStickerM11360K != null) {
                this.f1704h.remove(cameraStickerM11360K.f680id);
            }
        }
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i) {
        CameraCategory cameraCategory;
        List<CameraCategory> list = this.f1699c;
        if (list == null || list.size() <= i || (cameraCategory = this.f1699c.get(i)) == null) {
            return;
        }
        m3160P(cameraCategory.f678id, i);
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView recyclerViewM3164T = m3164T();
        this.f1701e.put(Integer.valueOf(i), recyclerViewM3164T);
        return new c(recyclerViewM3164T);
    }

    /* JADX INFO: renamed from: O */
    public final void m3159O(jvg jvgVar, List<Integer> list) {
        if (vwb.J(list)) {
            return;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            CameraSticker cameraStickerM11360K = jvgVar.getItem(it.next().intValue());
            if (cameraStickerM11360K != null && !this.f1704h.contains(cameraStickerM11360K.f680id)) {
                this.f1704h.add(cameraStickerM11360K.f680id);
                zvf0.A("e_camera_video_sticker", "p_camera_video", new j760[]{new j760("sticker_id", cameraStickerM11360K.f680id)});
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m3160P(final String str, final int i) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        FeedModule.f314b.m1438X1(new w9j() { // from class: l.cvg
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }, str).subscribe(mkd0.H(new e30() { // from class: l.dvg
            public final void call(Object obj) {
                this.f7073a.m3156K(str, i, (List) obj);
            }
        }, new e30() { // from class: l.evg
            public final void call(Object obj) {
                C2055a.m3151z((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m3161Q(List<CameraCategory> list) {
        if (list.equals(this.f1699c)) {
            return;
        }
        this.f1699c.clear();
        this.f1699c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: R */
    public void m3162R(d30 d30Var) {
        this.f1703g = d30Var;
    }

    /* JADX INFO: renamed from: S */
    public void m3163S(g30 g30Var) {
        this.f1702f = g30Var;
    }

    /* JADX INFO: renamed from: T */
    public final RecyclerView m3164T() {
        RecyclerView recyclerView = new RecyclerView(this.f1697a);
        recyclerView.setLayoutParams(new RecyclerView.p(-1, -1));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f1697a, 0, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        oe3 oe3Var = new oe3(2, this.f1698b, true);
        zxb zxbVar = new zxb();
        jvg jvgVar = new jvg(this.f1697a);
        jvgVar.m11366T(this.f1702f);
        recyclerView.setAdapter(jvgVar);
        recyclerView.setItemViewCacheSize(0);
        recyclerView.addItemDecoration(oe3Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        zxbVar.b(recyclerView);
        recyclerView.addOnScrollListener(new a(zxbVar, linearLayoutManager, jvgVar));
        ze5.m17319f(recyclerView, new b(jvgVar), true);
        return recyclerView;
    }

    /* JADX INFO: renamed from: U */
    public final void m3165U(List<CameraSticker> list, int i) {
        RecyclerView recyclerView;
        if (!NullChecker.a(list) || (recyclerView = this.f1701e.get(Integer.valueOf(i))) == null) {
            return;
        }
        recyclerView.getAdapter().m11367U(list);
    }

    public int getItemCount() {
        List<CameraCategory> list = this.f1699c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getItemViewType(int i) {
        return i;
    }
}
