package com.p046p1.mobile.putong.feed.newui.kankan.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0617w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.CameraCategory;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.p046p1.mobile.putong.feed.newui.kankan.view.C11211a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p133rx.subjects.C22392a;
import p149l.d30;
import p149l.e30;
import p149l.g30;
import p149l.j760;
import p149l.jvg;
import p149l.mkd0;
import p149l.oe3;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.yb4;
import p149l.ze5;
import p149l.zvf0;
import p149l.zxb;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.a */
/* JADX INFO: loaded from: classes12.dex */
public class C11211a extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a */
    public Context f40236a;

    /* JADX INFO: renamed from: f */
    public g30<Integer, CameraSticker, Boolean> f40241f;

    /* JADX INFO: renamed from: g */
    public d30 f40242g;

    /* JADX INFO: renamed from: i */
    public List<Integer> f40244i;

    /* JADX INFO: renamed from: b */
    public int f40237b = xdl0.m208407w(54.0f);

    /* JADX INFO: renamed from: h */
    public Set<String> f40243h = new HashSet();

    /* JADX INFO: renamed from: j */
    public C22392a<j760<List<CameraSticker>, Integer>> f40245j = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public List<CameraCategory> f40238c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Map<String, List<CameraSticker>> f40239d = new HashMap();

    /* JADX INFO: renamed from: e */
    public Map<Integer, RecyclerView> f40240e = new HashMap();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.a$a */
    public class a extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0617w f40246a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LinearLayoutManager f40247b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvg f40248c;

        public a(AbstractC0617w abstractC0617w, LinearLayoutManager linearLayoutManager, jvg jvgVar) {
            this.f40246a = abstractC0617w;
            this.f40247b = linearLayoutManager;
            this.f40248c = jvgVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View viewMo3811h;
            if (i != 0 || (viewMo3811h = this.f40246a.mo3811h(this.f40247b)) == null || this.f40248c == null) {
                return;
            }
            int iM3407a = ((RecyclerView.C0578p) viewMo3811h.getLayoutParams()).m3407a();
            this.f40248c.f119934f.call(new xaj0<>(this.f40248c.getItem(iM3407a), Integer.valueOf(iM3407a), Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.a$b */
    public class b implements FeedComicFacePropMenuView.InterfaceC11210f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvg f40250a;

        public b(jvg jvgVar) {
            this.f40250a = jvgVar;
        }

        @Override // com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView.InterfaceC11210f
        /* JADX INFO: renamed from: a */
        public void mo62160a(boolean z, int i) {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView.InterfaceC11210f
        /* JADX INFO: renamed from: b */
        public void mo62161b(List<Integer> list) {
            if (C11211a.this.f40244i != null && C11211a.this.f40244i.size() > 0) {
                C11211a.this.f40244i.removeAll(list);
            }
            C11211a c11211a = C11211a.this;
            c11211a.m62173J(this.f40250a, c11211a.f40244i);
            C11211a.this.m62177O(this.f40250a, list);
            C11211a.this.f40244i = new ArrayList(list);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.kankan.view.a$c */
    public static class c extends RecyclerView.AbstractC0566d0 {
        public c(RecyclerView recyclerView) {
            super(recyclerView);
        }
    }

    public C11211a(Context context) {
        this.f40236a = context;
    }

    /* JADX INFO: renamed from: N */
    private void m62167N(List<CameraSticker> list) {
        for (CameraSticker cameraSticker : list) {
            if (NullChecker.m81304b(cameraSticker)) {
                CameraSticker cameraSticker2 = yb4.m213936c().m213939d().get(cameraSticker.f39219id);
                if (NullChecker.m81303a(cameraSticker2)) {
                    cameraSticker.state = cameraSticker2.state;
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m62169z(Throwable th) {
    }

    /* JADX INFO: renamed from: G */
    public void m62170G(List<CameraSticker> list, String str) {
        if (NullChecker.m81303a(list) && NullChecker.m81303a(str)) {
            for (CameraSticker cameraSticker : list) {
                if (NullChecker.m81304b(cameraSticker)) {
                    cameraSticker.cId = str;
                }
            }
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void m62174K(String str, List<CameraSticker> list, int i) {
        if (list == null) {
            return;
        }
        this.f40239d.put(str, list);
        m62170G(list, str);
        m62167N(list);
        m62183U(list, i);
        this.f40245j.m132487l(new j760<>(list, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: I */
    public RecyclerView m62172I(int i) {
        return this.f40240e.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: J */
    public final void m62173J(jvg jvgVar, List<Integer> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            CameraSticker cameraStickerM143496K = jvgVar.getItem(it.next().intValue());
            if (cameraStickerM143496K != null) {
                this.f40243h.remove(cameraStickerM143496K.f39219id);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i) {
        CameraCategory cameraCategory;
        List<CameraCategory> list = this.f40238c;
        if (list == null || list.size() <= i || (cameraCategory = this.f40238c.get(i)) == null) {
            return;
        }
        m62178P(cameraCategory.f39217id, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView recyclerViewM62182T = m62182T();
        this.f40240e.put(Integer.valueOf(i), recyclerViewM62182T);
        return new c(recyclerViewM62182T);
    }

    /* JADX INFO: renamed from: O */
    public final void m62177O(jvg jvgVar, List<Integer> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            CameraSticker cameraStickerM143496K = jvgVar.getItem(it.next().intValue());
            if (cameraStickerM143496K != null && !this.f40243h.contains(cameraStickerM143496K.f39219id)) {
                this.f40243h.add(cameraStickerM143496K.f39219id);
                zvf0.m220368A("e_camera_video_sticker", "p_camera_video", new j760("sticker_id", cameraStickerM143496K.f39219id));
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m62178P(final String str, final int i) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        FeedModule.f38853b.m60512X1(new w9j() { // from class: l.cvg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }, str).subscribe(mkd0.m154956H(new e30() { // from class: l.dvg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88055a.m62174K(str, i, (List) obj);
            }
        }, new e30() { // from class: l.evg
            @Override // p149l.e30
            public final void call(Object obj) {
                C11211a.m62169z((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public void m62179Q(List<CameraCategory> list) {
        if (list.equals(this.f40238c)) {
            return;
        }
        this.f40238c.clear();
        this.f40238c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: R */
    public void m62180R(d30 d30Var) {
        this.f40242g = d30Var;
    }

    /* JADX INFO: renamed from: S */
    public void m62181S(g30 g30Var) {
        this.f40241f = g30Var;
    }

    /* JADX INFO: renamed from: T */
    public final RecyclerView m62182T() {
        RecyclerView recyclerView = new RecyclerView(this.f40236a);
        recyclerView.setLayoutParams(new RecyclerView.C0578p(-1, -1));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f40236a, 0, false);
        linearLayoutManager.setRecycleChildrenOnDetach(true);
        oe3 oe3Var = new oe3(2, this.f40237b, true);
        zxb zxbVar = new zxb();
        jvg jvgVar = new jvg(this.f40236a);
        jvgVar.m143502T(this.f40241f);
        recyclerView.setAdapter(jvgVar);
        recyclerView.setItemViewCacheSize(0);
        recyclerView.addItemDecoration(oe3Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        zxbVar.mo3857b(recyclerView);
        recyclerView.addOnScrollListener(new a(zxbVar, linearLayoutManager, jvgVar));
        ze5.m218277f(recyclerView, new b(jvgVar), true);
        return recyclerView;
    }

    /* JADX INFO: renamed from: U */
    public final void m62183U(List<CameraSticker> list, int i) {
        RecyclerView recyclerView;
        if (!NullChecker.m81303a(list) || (recyclerView = this.f40240e.get(Integer.valueOf(i))) == null) {
            return;
        }
        ((jvg) recyclerView.getAdapter()).m143503U(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<CameraCategory> list = this.f40238c;
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
