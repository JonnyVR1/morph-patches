package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p000p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l.e30;
import l.g30;
import l.jo0;
import l.mkd0;
import l.n250;
import l.vwb;
import l.xaj0;
import p007l.o6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMakeupPageAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    public Act f1067a;

    /* JADX INFO: renamed from: b */
    public List<MakeUpMenuView.MakeupCategory> f1068b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public List<MakeupItem> f1069c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<MakeupItem> f1070d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<MakeupItem> f1071e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public List<MakeupItem> f1072f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<MakeupItem> f1073g = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter$a */
    public static class C2010a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public FeedBeautyMakeupPageView f1074a;

        public C2010a(@NonNull FeedBeautyMakeupPageView feedBeautyMakeupPageView) {
            super(feedBeautyMakeupPageView);
            this.f1074a = feedBeautyMakeupPageView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter$b */
    public static class C2011b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public FeedMakeupPageView f1075a;

        public C2011b(@NonNull FeedMakeupPageView feedMakeupPageView) {
            super(feedMakeupPageView);
            this.f1075a = feedMakeupPageView;
        }
    }

    public FeedMakeupPageAdapter(Act act) {
        this.f1067a = act;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m2454C(MakeupItem makeupItem, Integer num, Boolean bool) {
        CameraEffectMgr.m2289V().m2336j0(num.intValue());
        CameraEffectMgr.m2289V().m2315X().m2828u(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m2455D(MakeupItem makeupItem, Integer num, Boolean bool) {
        CameraEffectMgr.m2289V().m2328f0(num.intValue());
        CameraEffectMgr.m2289V().m2315X().m2821n(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m2459H(MakeupItem makeupItem, Integer num, Boolean bool) {
        CameraEffectMgr.m2289V().m2330g0(num.intValue());
        CameraEffectMgr.m2289V().m2315X().m2822o(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m2460I(MakeupItem makeupItem, Integer num, Boolean bool) {
        CameraEffectMgr.m2289V().m2334i0(num.intValue());
        CameraEffectMgr.m2289V().m2315X().m2825r(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: J */
    private float m2461J(String str, Map<String, Float> map) {
        Float f;
        return (map == null || (f = map.get(str)) == null) ? CameraEffectMgr.m2286H(str) : f.floatValue();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m2464K(FeedMakeupPageView feedMakeupPageView, List list) {
        List<MakeupItem> listM2346p = CameraEffectMgr.m2289V().m2346p(list);
        this.f1072f = listM2346p;
        feedMakeupPageView.m2483j(listM2346p);
        feedMakeupPageView.m2479f(2);
        feedMakeupPageView.m2487n(3, false, 0);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m2465L(FeedMakeupPageView feedMakeupPageView, xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return;
        }
        for (MakeupItem makeupItem : this.f1070d) {
            makeupItem.all = m2461J(makeupItem.type, ((MakeupItem) xaj0Var.a).beautyParameterMap);
        }
        feedMakeupPageView.m2485l();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m2466M(FeedMakeupPageView feedMakeupPageView, xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return;
        }
        for (MakeupItem makeupItem : this.f1071e) {
            makeupItem.all = m2461J(makeupItem.type, ((MakeupItem) xaj0Var.a).beautyParameterMap);
        }
        feedMakeupPageView.m2485l();
    }

    /* JADX INFO: renamed from: N */
    public void m2467N(List<MakeUpMenuView.MakeupCategory> list) {
        if (!vwb.J(list)) {
            this.f1068b.clear();
            this.f1068b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: O */
    public final void m2468O(final FeedMakeupPageView feedMakeupPageView, String str) {
        FeedModule.f314b.m1425Q2(str).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.kch
            public final void call(Object obj) {
                this.f9675a.m2464K(feedMakeupPageView, (List) obj);
            }
        }, new e30() { // from class: l.lch
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final void m2469P(FeedMakeupPageView feedMakeupPageView) {
        this.f1069c = CameraEffectMgr.m2289V().m2354v();
        feedMakeupPageView.setOnItemClicked(new g30() { // from class: l.ech
            /* JADX INFO: renamed from: a */
            public final void m9810a(Object obj, Object obj2, Object obj3) {
                FeedMakeupPageAdapter.m2455D((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        feedMakeupPageView.m2479f(2);
        feedMakeupPageView.m2483j(this.f1069c);
        feedMakeupPageView.m2487n(0, false, 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m2470Q(final FeedMakeupPageView feedMakeupPageView, int i) {
        this.f1070d = CameraEffectMgr.m2289V().m2335j();
        feedMakeupPageView.setOnItemClicked(new g30() { // from class: l.hch
            /* JADX INFO: renamed from: a */
            public final void m10598a(Object obj, Object obj2, Object obj3) {
                FeedMakeupPageAdapter.m2459H((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        feedMakeupPageView.m2483j(this.f1070d);
        feedMakeupPageView.m2479f(1);
        feedMakeupPageView.m2487n(1, true, 0);
        CameraEffectMgr.m2289V().m2315X().m2819l().i(this.f1067a, new n250() { // from class: l.ich
            public final void onChanged(Object obj) {
                this.f8986a.m2465L(feedMakeupPageView, (xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m2471R(FeedBeautyMakeupPageView feedBeautyMakeupPageView, List<MakeUpMenuView.MakeupCategory> list) {
        feedBeautyMakeupPageView.m2440s(list);
        feedBeautyMakeupPageView.m2432k(2);
        feedBeautyMakeupPageView.m2429B(2);
    }

    /* JADX INFO: renamed from: S */
    public final void m2472S(final FeedMakeupPageView feedMakeupPageView, int i) {
        this.f1071e = CameraEffectMgr.m2289V().m2344o();
        feedMakeupPageView.setOnItemClicked(new g30() { // from class: l.fch
            /* JADX INFO: renamed from: a */
            public final void m10111a(Object obj, Object obj2, Object obj3) {
                FeedMakeupPageAdapter.m2460I((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        feedMakeupPageView.m2483j(this.f1071e);
        feedMakeupPageView.m2479f(1);
        feedMakeupPageView.m2487n(2, true, 1);
        CameraEffectMgr.m2289V().m2315X().m2819l().i(this.f1067a, new n250() { // from class: l.gch
            public final void onChanged(Object obj) {
                this.f8420a.m2466M(feedMakeupPageView, (xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m2473T(FeedMakeupPageView feedMakeupPageView, MakeUpMenuView.MakeupCategory makeupCategory, int i) {
        feedMakeupPageView.setOnItemClicked(new g30() { // from class: l.jch
            /* JADX INFO: renamed from: a */
            public final void m11127a(Object obj, Object obj2, Object obj3) {
                FeedMakeupPageAdapter.m2454C((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        List<MakeupItem> listM2306M = CameraEffectMgr.m2289V().m2306M();
        this.f1072f = listM2306M;
        if (vwb.J(listM2306M)) {
            m2468O(feedMakeupPageView, makeupCategory.f678id);
            return;
        }
        feedMakeupPageView.m2483j(this.f1072f);
        feedMakeupPageView.m2479f(2);
        feedMakeupPageView.m2487n(3, false, 0);
    }

    public int getItemCount() {
        return this.f1068b.size();
    }

    public int getItemViewType(int i) {
        return i == 4 ? 1 : 0;
    }

    public void onBindViewHolder(@NonNull RecyclerView.d0 d0Var, int i) {
        MakeUpMenuView.MakeupCategory makeupCategory = this.f1068b.get(i);
        if (!(d0Var instanceof C2011b)) {
            if (d0Var instanceof C2010a) {
                FeedBeautyMakeupPageView feedBeautyMakeupPageView = ((C2010a) d0Var).f1074a;
                feedBeautyMakeupPageView.setTag(Integer.valueOf(i));
                feedBeautyMakeupPageView.setOnCategoryClicked(new g30() { // from class: l.cch
                    /* JADX INFO: renamed from: a */
                    public final void m9121a(Object obj, Object obj2, Object obj3) {
                        CameraEffectMgr.m2289V().m2315X().m2823p(new xaj0<>((MakeUpMenuView.MakeupCategory) obj, (Integer) obj2, (Boolean) obj3));
                    }
                });
                feedBeautyMakeupPageView.setOnItemClicked(new g30() { // from class: l.dch
                    /* JADX INFO: renamed from: a */
                    public final void m9365a(Object obj, Object obj2, Object obj3) {
                        CameraEffectMgr.m2289V().m2315X().m2824q(new xaj0<>((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3));
                    }
                });
                m2471R(feedBeautyMakeupPageView, makeupCategory.subMenu);
                return;
            }
            return;
        }
        FeedMakeupPageView feedMakeupPageView = ((C2011b) d0Var).f1075a;
        feedMakeupPageView.setTag(Integer.valueOf(i));
        int i2 = makeupCategory.extType;
        if (i2 == 1000) {
            m2469P(feedMakeupPageView);
            return;
        }
        if (i2 == 1001) {
            m2470Q(feedMakeupPageView, i);
        } else if (i2 == 1002) {
            m2472S(feedMakeupPageView, i);
        } else if (i2 == 1003) {
            m2473T(feedMakeupPageView, makeupCategory, i);
        }
    }

    @NonNull
    public RecyclerView.d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Act act = this.f1067a;
        return i == 0 ? new C2011b((FeedMakeupPageView) act.inflater().inflate(o6c0.f11141V, viewGroup, false)) : new C2010a((FeedBeautyMakeupPageView) act.inflater().inflate(o6c0.f11117R, viewGroup, false));
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
            this.f680id = cameraSticker.f680id;
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
            return new MakeupItem(new CameraSticker(), NONE);
        }

        public boolean isLocal() {
            return "local".equals(this.type);
        }

        public boolean isNone() {
            return NONE.equals(this.type);
        }

        public MakeupItem(String str, String str2, int i, int i2, boolean z) {
            this.name = str;
            this.type = str2;
            this.normalImgId = i;
            this.selectedImgId = i2;
            this.hasNeg = z;
            this.all = CameraEffectMgr.m2289V().m2301F(str2);
        }

        public MakeupItem(String str, String str2, int i, int i2, float f) {
            this.name = str;
            this.type = str2;
            this.normalImgId = i;
            this.selectedImgId = i2;
            this.all = f;
        }

        public MakeupItem(CameraSticker cameraSticker, String str) {
            this.f680id = cameraSticker.f680id;
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
