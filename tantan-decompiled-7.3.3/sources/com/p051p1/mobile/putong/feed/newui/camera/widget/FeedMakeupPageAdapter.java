package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p051p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p153l.a30;
import p153l.bkj0;
import p153l.cb50;
import p153l.fo0;
import p153l.jyb;
import p153l.psd0;
import p153l.tec0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMakeupPageAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    public Act f40454a;

    /* JADX INFO: renamed from: b */
    public List<MakeUpMenuView.MakeupCategory> f40455b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public List<MakeupItem> f40456c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<MakeupItem> f40457d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<MakeupItem> f40458e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public List<MakeupItem> f40459f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<MakeupItem> f40460g = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter$a */
    public static class C11329a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public FeedBeautyMakeupPageView f40461a;

        public C11329a(@NonNull FeedBeautyMakeupPageView feedBeautyMakeupPageView) {
            super(feedBeautyMakeupPageView);
            this.f40461a = feedBeautyMakeupPageView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter$b */
    public static class C11330b extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public FeedMakeupPageView f40462a;

        public C11330b(@NonNull FeedMakeupPageView feedMakeupPageView) {
            super(feedMakeupPageView);
            this.f40462a = feedMakeupPageView;
        }
    }

    public FeedMakeupPageAdapter(Act act) {
        this.f40454a = act;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m62686C(MakeupItem makeupItem, Integer num, Boolean bool) {
        CameraEffectMgr.m62524V().m62571j0(num.intValue());
        CameraEffectMgr.m62524V().m62550X().m63044u(new bkj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m62687D(MakeupItem makeupItem, Integer num, Boolean bool) {
        CameraEffectMgr.m62524V().m62563f0(num.intValue());
        CameraEffectMgr.m62524V().m62550X().m63037n(new bkj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m62691H(MakeupItem makeupItem, Integer num, Boolean bool) {
        CameraEffectMgr.m62524V().m62565g0(num.intValue());
        CameraEffectMgr.m62524V().m62550X().m63038o(new bkj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m62692I(MakeupItem makeupItem, Integer num, Boolean bool) {
        CameraEffectMgr.m62524V().m62569i0(num.intValue());
        CameraEffectMgr.m62524V().m62550X().m63041r(new bkj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: J */
    private float m62693J(String str, Map<String, Float> map) {
        Float f;
        return (map == null || (f = map.get(str)) == null) ? CameraEffectMgr.m62521H(str) : f.floatValue();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m62696K(FeedMakeupPageView feedMakeupPageView, List list) {
        List<MakeupItem> listM62581p = CameraEffectMgr.m62524V().m62581p(list);
        this.f40459f = listM62581p;
        feedMakeupPageView.m62715j(listM62581p);
        feedMakeupPageView.m62711f(2);
        feedMakeupPageView.m62719n(3, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m62697L(FeedMakeupPageView feedMakeupPageView, bkj0 bkj0Var) {
        if (bkj0Var == null) {
            return;
        }
        for (MakeupItem makeupItem : this.f40457d) {
            makeupItem.all = m62693J(makeupItem.type, ((MakeupItem) bkj0Var.f77081a).beautyParameterMap);
        }
        feedMakeupPageView.m62717l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m62698M(FeedMakeupPageView feedMakeupPageView, bkj0 bkj0Var) {
        if (bkj0Var == null) {
            return;
        }
        for (MakeupItem makeupItem : this.f40458e) {
            makeupItem.all = m62693J(makeupItem.type, ((MakeupItem) bkj0Var.f77081a).beautyParameterMap);
        }
        feedMakeupPageView.m62717l();
    }

    /* JADX INFO: renamed from: N */
    public void m62699N(List<MakeUpMenuView.MakeupCategory> list) {
        if (!jyb.m147479J(list)) {
            this.f40455b.clear();
            this.f40455b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: O */
    public final void m62700O(final FeedMakeupPageView feedMakeupPageView, String str) {
        FeedModule.f39701b.m61683Q2(str).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.zdh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203877a.m62696K(feedMakeupPageView, (List) obj);
            }
        }, new y20() { // from class: l.aeh
            @Override // p153l.y20
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final void m62701P(FeedMakeupPageView feedMakeupPageView) {
        this.f40456c = CameraEffectMgr.m62524V().m62589v();
        feedMakeupPageView.setOnItemClicked(new a30() { // from class: l.tdh
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                FeedMakeupPageAdapter.m62687D((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        feedMakeupPageView.m62711f(2);
        feedMakeupPageView.m62715j(this.f40456c);
        feedMakeupPageView.m62719n(0, false, 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m62702Q(final FeedMakeupPageView feedMakeupPageView, int i) {
        this.f40457d = CameraEffectMgr.m62524V().m62570j();
        feedMakeupPageView.setOnItemClicked(new a30() { // from class: l.wdh
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                FeedMakeupPageAdapter.m62691H((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        feedMakeupPageView.m62715j(this.f40457d);
        feedMakeupPageView.m62711f(1);
        feedMakeupPageView.m62719n(1, true, 0);
        CameraEffectMgr.m62524V().m62550X().m63035l().m2984i(this.f40454a, new cb50() { // from class: l.xdh
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f193591a.m62697L(feedMakeupPageView, (bkj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m62703R(FeedBeautyMakeupPageView feedBeautyMakeupPageView, List<MakeUpMenuView.MakeupCategory> list) {
        feedBeautyMakeupPageView.m62672s(list);
        feedBeautyMakeupPageView.m62664k(2);
        feedBeautyMakeupPageView.m62661B(2);
    }

    /* JADX INFO: renamed from: S */
    public final void m62704S(final FeedMakeupPageView feedMakeupPageView, int i) {
        this.f40458e = CameraEffectMgr.m62524V().m62579o();
        feedMakeupPageView.setOnItemClicked(new a30() { // from class: l.udh
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                FeedMakeupPageAdapter.m62692I((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        feedMakeupPageView.m62715j(this.f40458e);
        feedMakeupPageView.m62711f(1);
        feedMakeupPageView.m62719n(2, true, 1);
        CameraEffectMgr.m62524V().m62550X().m63035l().m2984i(this.f40454a, new cb50() { // from class: l.vdh
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f183594a.m62698M(feedMakeupPageView, (bkj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m62705T(FeedMakeupPageView feedMakeupPageView, MakeUpMenuView.MakeupCategory makeupCategory, int i) {
        feedMakeupPageView.setOnItemClicked(new a30() { // from class: l.ydh
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                FeedMakeupPageAdapter.m62686C((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        List<MakeupItem> listM62541M = CameraEffectMgr.m62524V().m62541M();
        this.f40459f = listM62541M;
        if (jyb.m147479J(listM62541M)) {
            m62700O(feedMakeupPageView, makeupCategory.f40065id);
            return;
        }
        feedMakeupPageView.m62715j(this.f40459f);
        feedMakeupPageView.m62711f(2);
        feedMakeupPageView.m62719n(3, false, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f40455b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 4 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        MakeUpMenuView.MakeupCategory makeupCategory = this.f40455b.get(i);
        if (!(abstractC0569e0 instanceof C11330b)) {
            if (abstractC0569e0 instanceof C11329a) {
                FeedBeautyMakeupPageView feedBeautyMakeupPageView = ((C11329a) abstractC0569e0).f40461a;
                feedBeautyMakeupPageView.setTag(Integer.valueOf(i));
                feedBeautyMakeupPageView.setOnCategoryClicked(new a30() { // from class: l.rdh
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        CameraEffectMgr.m62524V().m62550X().m63039p(new bkj0<>((MakeUpMenuView.MakeupCategory) obj, (Integer) obj2, (Boolean) obj3));
                    }
                });
                feedBeautyMakeupPageView.setOnItemClicked(new a30() { // from class: l.sdh
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        CameraEffectMgr.m62524V().m62550X().m63040q(new bkj0<>((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3));
                    }
                });
                m62703R(feedBeautyMakeupPageView, makeupCategory.subMenu);
                return;
            }
            return;
        }
        FeedMakeupPageView feedMakeupPageView = ((C11330b) abstractC0569e0).f40462a;
        feedMakeupPageView.setTag(Integer.valueOf(i));
        int i2 = makeupCategory.extType;
        if (i2 == 1000) {
            m62701P(feedMakeupPageView);
            return;
        }
        if (i2 == 1001) {
            m62702Q(feedMakeupPageView, i);
        } else if (i2 == 1002) {
            m62704S(feedMakeupPageView, i);
        } else if (i2 == 1003) {
            m62705T(feedMakeupPageView, makeupCategory, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.AbstractC0569e0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Act act = this.f40454a;
        return i == 0 ? new C11330b((FeedMakeupPageView) act.inflater().inflate(tec0.f173591V, viewGroup, false)) : new C11329a((FeedBeautyMakeupPageView) act.inflater().inflate(tec0.f173567R, viewGroup, false));
    }

    public static class MakeupItem extends CameraSticker {
        public static final String BACK = "back";
        public static final String LOCAL = "local";
        public static final String NONE = "none";
        public float all;
        public Map<String, Float> beautyParameterMap;
        public boolean hasNeg;
        public float lut;
        public int normalImgId;
        public int selectedImgId;
        public String type;

        public MakeupItem(CameraSticker cameraSticker, String str, float f) {
            this.f40067id = cameraSticker.f40067id;
            this.name = cameraSticker.name;
            this.icon = cameraSticker.icon;
            this.resource = cameraSticker.resource;
            this.resourceMD5 = cameraSticker.resourceMD5;
            this.minVersion = cameraSticker.minVersion;
            this.category = cameraSticker.category;
            this.modelFilePath = cameraSticker.modelFilePath;
            this.hasModelFile = cameraSticker.hasModelFile;
            this.state = cameraSticker.state;
            this.type = str;
            this.all = f;
        }

        public static MakeupItem none() {
            return new MakeupItem(new CameraSticker(), "none");
        }

        public boolean isLocal() {
            return "local".equals(this.type);
        }

        public boolean isNone() {
            return "none".equals(this.type);
        }

        public MakeupItem(String str, String str2, int i, int i2, boolean z) {
            this.name = str;
            this.type = str2;
            this.normalImgId = i;
            this.selectedImgId = i2;
            this.hasNeg = z;
            this.all = CameraEffectMgr.m62524V().m62536F(str2);
        }

        public MakeupItem(String str, String str2, int i, int i2, float f) {
            this.name = str;
            this.type = str2;
            this.normalImgId = i;
            this.selectedImgId = i2;
            this.all = f;
        }

        public MakeupItem(CameraSticker cameraSticker, String str) {
            this.f40067id = cameraSticker.f40067id;
            this.name = cameraSticker.name;
            this.icon = cameraSticker.icon;
            this.resource = cameraSticker.resource;
            this.resourceMD5 = cameraSticker.resourceMD5;
            this.minVersion = cameraSticker.minVersion;
            this.category = cameraSticker.category;
            this.modelFilePath = cameraSticker.modelFilePath;
            this.hasModelFile = cameraSticker.hasModelFile;
            this.state = cameraSticker.state;
            this.type = str;
        }

        public MakeupItem(String str, String str2, Map<String, Float> map, int i, int i2) {
            this.name = str;
            this.type = str2;
            this.normalImgId = i;
            this.selectedImgId = i2;
            this.beautyParameterMap = map;
        }
    }
}
