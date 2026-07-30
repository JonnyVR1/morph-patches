package com.p051p1.mobile.putong.feed.newui.kankan.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0619w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.feed.newui.kankan.view.C11374a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p137rx.subjects.C22507a;
import p153l.a30;
import p153l.bkj0;
import p153l.bnl0;
import p153l.df3;
import p153l.i4g0;
import p153l.jyb;
import p153l.nzb;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.x20;
import p153l.xc4;
import p153l.y20;
import p153l.ywg;
import p153l.zf5;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11374a extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a */
    public Context f41084a;

    /* JADX INFO: renamed from: f */
    public a30<Integer, CameraSticker, Boolean> f41089f;

    /* JADX INFO: renamed from: g */
    public x20 f41090g;

    /* JADX INFO: renamed from: i */
    public List<Integer> f41092i;

    /* JADX INFO: renamed from: b */
    public int f41085b = bnl0.m105587w(54.0f);

    /* JADX INFO: renamed from: h */
    public Set<String> f41091h = new HashSet();

    /* JADX INFO: renamed from: j */
    public C22507a<pf60<List<CameraSticker>, Integer>> f41093j = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public List<CameraCategory> f41086c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Map<String, List<CameraSticker>> f41087d = new HashMap();

    /* JADX INFO: renamed from: e */
    public Map<Integer, RecyclerView> f41088e = new HashMap();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.a$a */
    public class a extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0619w f41094a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LinearLayoutManager f41095b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ywg f41096c;

        public a(AbstractC0619w abstractC0619w, LinearLayoutManager linearLayoutManager, ywg ywgVar) {
            this.f41094a = abstractC0619w;
            this.f41095b = linearLayoutManager;
            this.f41096c = ywgVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View viewMo3812h;
            if (i != 0 || (viewMo3812h = this.f41094a.mo3812h(this.f41095b)) == null || this.f41096c == null) {
                return;
            }
            int iM3416a = ((RecyclerView.C0580p) viewMo3812h.getLayoutParams()).m3416a();
            this.f41096c.f201831f.call(new bkj0<>(this.f41096c.getItem(iM3416a), Integer.valueOf(iM3416a), Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.a$b */
    public class b implements FeedComicFacePropMenuView.InterfaceC11373f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ywg f41098a;

        public b(ywg ywgVar) {
            this.f41098a = ywgVar;
        }

        @Override // com.p051p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView.InterfaceC11373f
        /* JADX INFO: renamed from: a */
        public void mo63343a(boolean z, int i) {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView.InterfaceC11373f
        /* JADX INFO: renamed from: b */
        public void mo63344b(List<Integer> list) {
            if (C11374a.this.f41092i != null && C11374a.this.f41092i.size() > 0) {
                C11374a.this.f41092i.removeAll(list);
            }
            C11374a c11374a = C11374a.this;
            c11374a.m63356J(this.f41098a, c11374a.f41092i);
            C11374a.this.m63360O(this.f41098a, list);
            C11374a.this.f41092i = new ArrayList(list);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.a$c */
    public static class c extends RecyclerView.AbstractC0569e0 {
        public c(RecyclerView recyclerView) {
            super(recyclerView);
        }
    }

    public C11374a(Context context) {
        this.f41084a = context;
    }

    /* JADX INFO: renamed from: N */
    private void m63350N(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (NullChecker.m82487b(cameraSticker)) {
                CameraSticker cameraSticker2 = xc4.m210114c().m210117d().get(cameraSticker.f40067id);
                if (NullChecker.m82486a(cameraSticker2)) {
                    cameraSticker.state = cameraSticker2.state;
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m63352z(Throwable th) {
    }

    /* JADX INFO: renamed from: G */
    public void m63353G(List<CameraSticker> list, String str) {
        if (NullChecker.m82486a(list) && NullChecker.m82486a(str)) {
            for (CameraSticker cameraSticker : list) {
                if (NullChecker.m82487b(cameraSticker)) {
                    cameraSticker.cId = str;
                }
            }
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void m63357K(String str, List<CameraSticker> list, int i) {
        if (list == null) {
            return;
        }
        this.f41087d.put(str, list);
        m63353G(list, str);
        m63350N(list);
        m63366U(list, i);
        this.f41093j.m137019l(new pf60<>(list, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: I */
    public RecyclerView m63355I(int i) {
        return this.f41088e.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: J */
    public final void m63356J(ywg ywgVar, List<Integer> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            CameraSticker cameraStickerM217603K = ywgVar.getItem(it.next().intValue());
            if (cameraStickerM217603K != null) {
                this.f41091h.remove(cameraStickerM217603K.f40067id);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i) {
        CameraCategory cameraCategory;
        List<CameraCategory> list = this.f41086c;
        if (list == null || list.size() <= i || (cameraCategory = this.f41086c.get(i)) == null) {
            return;
        }
        m63361P(cameraCategory.f40065id, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView recyclerViewM63365T = m63365T();
        this.f41088e.put(Integer.valueOf(i), recyclerViewM63365T);
        return new c(recyclerViewM63365T);
    }

    /* JADX INFO: renamed from: O */
    public final void m63360O(ywg ywgVar, List<Integer> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            CameraSticker cameraStickerM217603K = ywgVar.getItem(it.next().intValue());
            if (cameraStickerM217603K != null && !this.f41091h.contains(cameraStickerM217603K.f40067id)) {
                this.f41091h.add(cameraStickerM217603K.f40067id);
                i4g0.m138492A("e_camera_video_sticker", "p_camera_video", new pf60("sticker_id", cameraStickerM217603K.f40067id));
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m63361P(final String str, final int i) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        FeedModule.f39701b.m61696X1(new qcj() { // from class: l.rwg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }, str).subscribe(psd0.m173597H(new y20() { // from class: l.swg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170959a.m63357K(str, i, (List) obj);
            }
        }, new y20() { // from class: l.twg
            @Override // p153l.y20
            public final void call(Object obj) {
                C11374a.m63352z((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m63362Q(List<CameraCategory> list) {
        if (list.equals(this.f41086c)) {
            return;
        }
        this.f41086c.clear();
        this.f41086c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: R */
    public void m63363R(x20 x20Var) {
        this.f41090g = x20Var;
    }

    /* JADX INFO: renamed from: S */
    public void m63364S(a30 a30Var) {
        this.f41089f = a30Var;
    }

    /* JADX INFO: renamed from: T */
    public final RecyclerView m63365T() {
        RecyclerView recyclerView = new RecyclerView(this.f41084a);
        recyclerView.setLayoutParams(new RecyclerView.C0580p(-1, -1));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f41084a, 0, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        df3 df3Var = new df3(2, this.f41085b, true);
        nzb nzbVar = new nzb();
        ywg ywgVar = new ywg(this.f41084a);
        ywgVar.m217609T(this.f41089f);
        recyclerView.setAdapter(ywgVar);
        recyclerView.setItemViewCacheSize(0);
        recyclerView.addItemDecoration(df3Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        nzbVar.mo3858b(recyclerView);
        recyclerView.addOnScrollListener(new a(nzbVar, linearLayoutManager, ywgVar));
        zf5.m219527f(recyclerView, new b(ywgVar), true);
        return recyclerView;
    }

    /* JADX INFO: renamed from: U */
    public final void m63366U(List<CameraSticker> list, int i) {
        RecyclerView recyclerView;
        if (!NullChecker.m82486a(list) || (recyclerView = this.f41088e.get(Integer.valueOf(i))) == null) {
            return;
        }
        ((ywg) recyclerView.getAdapter()).m217610U(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<CameraCategory> list = this.f41086c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }
}
