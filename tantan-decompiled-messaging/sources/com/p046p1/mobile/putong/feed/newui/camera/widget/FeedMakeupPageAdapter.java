package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.p046p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p046p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p149l.e30;
import p149l.g30;
import p149l.jo0;
import p149l.mkd0;
import p149l.n250;
import p149l.o6c0;
import p149l.vwb;
import p149l.xaj0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMakeupPageAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    public Act f39606a;

    /* JADX INFO: renamed from: b */
    public List<MakeUpMenuView.MakeupCategory> f39607b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public List<MakeupItem> f39608c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<MakeupItem> f39609d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<MakeupItem> f39610e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public List<MakeupItem> f39611f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<MakeupItem> f39612g = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter$a */
    public static class C11166a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public FeedBeautyMakeupPageView f39613a;

        public C11166a(@NonNull FeedBeautyMakeupPageView feedBeautyMakeupPageView) {
            super(feedBeautyMakeupPageView);
            this.f39613a = feedBeautyMakeupPageView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter$b */
    public static class C11167b extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public FeedMakeupPageView f39614a;

        public C11167b(@NonNull FeedMakeupPageView feedMakeupPageView) {
            super(feedMakeupPageView);
            this.f39614a = feedMakeupPageView;
        }
    }

    public FeedMakeupPageAdapter(Act act) {
        this.f39606a = act;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m61502C(MakeupItem makeupItem, Integer num, Boolean bool) {
        CameraEffectMgr.m61340V().m61387j0(num.intValue());
        CameraEffectMgr.m61340V().m61366X().m61861u(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m61503D(MakeupItem makeupItem, Integer num, Boolean bool) {
        CameraEffectMgr.m61340V().m61379f0(num.intValue());
        CameraEffectMgr.m61340V().m61366X().m61854n(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m61507H(MakeupItem makeupItem, Integer num, Boolean bool) {
        CameraEffectMgr.m61340V().m61381g0(num.intValue());
        CameraEffectMgr.m61340V().m61366X().m61855o(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m61508I(MakeupItem makeupItem, Integer num, Boolean bool) {
        CameraEffectMgr.m61340V().m61385i0(num.intValue());
        CameraEffectMgr.m61340V().m61366X().m61858r(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: J */
    private float m61509J(String str, Map<String, Float> map) {
        Float f;
        return (map == null || (f = map.get(str)) == null) ? CameraEffectMgr.m61337H(str) : f.floatValue();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m61512K(FeedMakeupPageView feedMakeupPageView, List list) {
        List<MakeupItem> listM61397p = CameraEffectMgr.m61340V().m61397p(list);
        this.f39611f = listM61397p;
        feedMakeupPageView.m61531j(listM61397p);
        feedMakeupPageView.m61527f(2);
        feedMakeupPageView.m61535n(3, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m61513L(FeedMakeupPageView feedMakeupPageView, xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return;
        }
        for (MakeupItem makeupItem : this.f39609d) {
            makeupItem.all = m61509J(makeupItem.type, ((MakeupItem) xaj0Var.f191751a).beautyParameterMap);
        }
        feedMakeupPageView.m61533l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m61514M(FeedMakeupPageView feedMakeupPageView, xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return;
        }
        for (MakeupItem makeupItem : this.f39610e) {
            makeupItem.all = m61509J(makeupItem.type, ((MakeupItem) xaj0Var.f191751a).beautyParameterMap);
        }
        feedMakeupPageView.m61533l();
    }

    /* JADX INFO: renamed from: N */
    public void m61515N(List<MakeUpMenuView.MakeupCategory> list) {
        if (!vwb.m200296J(list)) {
            this.f39607b.clear();
            this.f39607b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: O */
    public final void m61516O(final FeedMakeupPageView feedMakeupPageView, String str) {
        FeedModule.f38853b.m60499Q2(str).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.kch
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122383a.m61512K(feedMakeupPageView, (List) obj);
            }
        }, new e30() { // from class: l.lch
            @Override // p149l.e30
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final void m61517P(FeedMakeupPageView feedMakeupPageView) {
        this.f39608c = CameraEffectMgr.m61340V().m61405v();
        feedMakeupPageView.setOnItemClicked(new g30() { // from class: l.ech
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                FeedMakeupPageAdapter.m61503D((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        feedMakeupPageView.m61527f(2);
        feedMakeupPageView.m61531j(this.f39608c);
        feedMakeupPageView.m61535n(0, false, 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m61518Q(final FeedMakeupPageView feedMakeupPageView, int i) {
        this.f39609d = CameraEffectMgr.m61340V().m61386j();
        feedMakeupPageView.setOnItemClicked(new g30() { // from class: l.hch
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                FeedMakeupPageAdapter.m61507H((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        feedMakeupPageView.m61531j(this.f39609d);
        feedMakeupPageView.m61527f(1);
        feedMakeupPageView.m61535n(1, true, 0);
        CameraEffectMgr.m61340V().m61366X().m61852l().m2983i(this.f39606a, new n250() { // from class: l.ich
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f112463a.m61513L(feedMakeupPageView, (xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m61519R(FeedBeautyMakeupPageView feedBeautyMakeupPageView, List<MakeUpMenuView.MakeupCategory> list) {
        feedBeautyMakeupPageView.m61488s(list);
        feedBeautyMakeupPageView.m61480k(2);
        feedBeautyMakeupPageView.m61477B(2);
    }

    /* JADX INFO: renamed from: S */
    public final void m61520S(final FeedMakeupPageView feedMakeupPageView, int i) {
        this.f39610e = CameraEffectMgr.m61340V().m61395o();
        feedMakeupPageView.setOnItemClicked(new g30() { // from class: l.fch
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                FeedMakeupPageAdapter.m61508I((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        feedMakeupPageView.m61531j(this.f39610e);
        feedMakeupPageView.m61527f(1);
        feedMakeupPageView.m61535n(2, true, 1);
        CameraEffectMgr.m61340V().m61366X().m61852l().m2983i(this.f39606a, new n250() { // from class: l.gch
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f102012a.m61514M(feedMakeupPageView, (xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m61521T(FeedMakeupPageView feedMakeupPageView, MakeUpMenuView.MakeupCategory makeupCategory, int i) {
        feedMakeupPageView.setOnItemClicked(new g30() { // from class: l.jch
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                FeedMakeupPageAdapter.m61502C((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        List<MakeupItem> listM61357M = CameraEffectMgr.m61340V().m61357M();
        this.f39611f = listM61357M;
        if (vwb.m200296J(listM61357M)) {
            m61516O(feedMakeupPageView, makeupCategory.f39217id);
            return;
        }
        feedMakeupPageView.m61531j(this.f39611f);
        feedMakeupPageView.m61527f(2);
        feedMakeupPageView.m61535n(3, false, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f39607b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 4 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        MakeUpMenuView.MakeupCategory makeupCategory = this.f39607b.get(i);
        if (!(abstractC0566d0 instanceof C11167b)) {
            if (abstractC0566d0 instanceof C11166a) {
                FeedBeautyMakeupPageView feedBeautyMakeupPageView = ((C11166a) abstractC0566d0).f39613a;
                feedBeautyMakeupPageView.setTag(Integer.valueOf(i));
                feedBeautyMakeupPageView.setOnCategoryClicked(new g30() { // from class: l.cch
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        CameraEffectMgr.m61340V().m61366X().m61856p(new xaj0<>((MakeUpMenuView.MakeupCategory) obj, (Integer) obj2, (Boolean) obj3));
                    }
                });
                feedBeautyMakeupPageView.setOnItemClicked(new g30() { // from class: l.dch
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        CameraEffectMgr.m61340V().m61366X().m61857q(new xaj0<>((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3));
                    }
                });
                m61519R(feedBeautyMakeupPageView, makeupCategory.subMenu);
                return;
            }
            return;
        }
        FeedMakeupPageView feedMakeupPageView = ((C11167b) abstractC0566d0).f39614a;
        feedMakeupPageView.setTag(Integer.valueOf(i));
        int i2 = makeupCategory.extType;
        if (i2 == 1000) {
            m61517P(feedMakeupPageView);
            return;
        }
        if (i2 == 1001) {
            m61518Q(feedMakeupPageView, i);
        } else if (i2 == 1002) {
            m61520S(feedMakeupPageView, i);
        } else if (i2 == 1003) {
            m61521T(feedMakeupPageView, makeupCategory, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.AbstractC0566d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Act act = this.f39606a;
        return i == 0 ? new C11167b((FeedMakeupPageView) act.inflater().inflate(o6c0.f142122V, viewGroup, false)) : new C11166a((FeedBeautyMakeupPageView) act.inflater().inflate(o6c0.f142098R, viewGroup, false));
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
            this.f39219id = cameraSticker.f39219id;
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
            this.all = CameraEffectMgr.m61340V().m61352F(str2);
        }

        public MakeupItem(String str, String str2, int i, int i2, float f) {
            this.name = str;
            this.type = str2;
            this.normalImgId = i;
            this.selectedImgId = i2;
            this.all = f;
        }

        public MakeupItem(CameraSticker cameraSticker, String str) {
            this.f39219id = cameraSticker.f39219id;
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
