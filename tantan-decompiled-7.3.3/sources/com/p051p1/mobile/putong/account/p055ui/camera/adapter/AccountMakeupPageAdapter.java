package com.p051p1.mobile.putong.account.p055ui.camera.adapter;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.data.CameraSticker;
import com.p051p1.mobile.putong.account.p055ui.accountai.SignUpAiAct;
import com.p051p1.mobile.putong.account.p055ui.camera.AccountCameraEffectMgr;
import com.p051p1.mobile.putong.account.p055ui.camera.adapter.AccountMakeupPageAdapter;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountBeautyMakeupPageView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeUpMenuView;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeupPageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p153l.a30;
import p153l.bkj0;
import p153l.cb50;
import p153l.fo0;
import p153l.hec0;
import p153l.jyb;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMakeupPageAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    public Act f17399a;

    /* JADX INFO: renamed from: b */
    public List<AccountMakeUpMenuView.MakeupCategory> f17400b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public List<MakeupItem> f17401c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<MakeupItem> f17402d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<MakeupItem> f17403e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public List<MakeupItem> f17404f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<MakeupItem> f17405g = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.AccountMakeupPageAdapter$a */
    public static class C4799a extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public AccountBeautyMakeupPageView f17406a;

        public C4799a(@NonNull AccountBeautyMakeupPageView accountBeautyMakeupPageView) {
            super(accountBeautyMakeupPageView);
            this.f17406a = accountBeautyMakeupPageView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.AccountMakeupPageAdapter$b */
    public static class C4800b extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public AccountMakeupPageView f17407a;

        public C4800b(@NonNull AccountMakeupPageView accountMakeupPageView) {
            super(accountMakeupPageView);
            this.f17407a = accountMakeupPageView;
        }
    }

    public AccountMakeupPageAdapter(Act act) {
        this.f17399a = act;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m29798D(MakeupItem makeupItem, Integer num, Boolean bool) {
        AccountCameraEffectMgr.m29697V().m29742i0(num.intValue());
        AccountCameraEffectMgr.m29697V().m29723X().m29782r(new bkj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m29799E(MakeupItem makeupItem, Integer num, Boolean bool) {
        AccountCameraEffectMgr.m29697V().m29738g0(num.intValue());
        AccountCameraEffectMgr.m29697V().m29723X().m29779o(new bkj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m29800F(MakeupItem makeupItem, Integer num, Boolean bool) {
        AccountCameraEffectMgr.m29697V().m29744j0(num.intValue());
        AccountCameraEffectMgr.m29697V().m29723X().m29785u(new bkj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m29803I(MakeupItem makeupItem, Integer num, Boolean bool) {
        AccountCameraEffectMgr.m29697V().m29736f0(num.intValue());
        AccountCameraEffectMgr.m29697V().m29723X().m29778n(new bkj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: J */
    public final float m29806J(String str, Map<String, Float> map) {
        Float f;
        return (map == null || (f = map.get(str)) == null) ? AccountCameraEffectMgr.m29694H(str) : f.floatValue();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m29807K(AccountMakeupPageView accountMakeupPageView, List list) {
        List<MakeupItem> listM29754p = AccountCameraEffectMgr.m29697V().m29754p(list);
        this.f17404f = listM29754p;
        accountMakeupPageView.m30070j(listM29754p);
        accountMakeupPageView.m30066f(2);
        accountMakeupPageView.m30074n(3, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m29808L(AccountMakeupPageView accountMakeupPageView, bkj0 bkj0Var) {
        if (bkj0Var == null) {
            return;
        }
        for (MakeupItem makeupItem : this.f17402d) {
            makeupItem.all = m29806J(makeupItem.type, ((MakeupItem) bkj0Var.f77081a).beautyParameterMap);
        }
        accountMakeupPageView.m30072l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m29809M(AccountMakeupPageView accountMakeupPageView, bkj0 bkj0Var) {
        if (bkj0Var == null) {
            return;
        }
        for (MakeupItem makeupItem : this.f17403e) {
            makeupItem.all = m29806J(makeupItem.type, ((MakeupItem) bkj0Var.f77081a).beautyParameterMap);
        }
        accountMakeupPageView.m30072l();
    }

    /* JADX INFO: renamed from: N */
    public void m29810N(List<AccountMakeUpMenuView.MakeupCategory> list) {
        if (!jyb.m147479J(list)) {
            this.f17400b.clear();
            this.f17400b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: O */
    public final void m29811O(final AccountMakeupPageView accountMakeupPageView, String str) {
        SignUpAiAct.f17074c.m154186M(str).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.es
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95550a.m29807K(accountMakeupPageView, (List) obj);
            }
        }, new y20() { // from class: l.fs
            @Override // p153l.y20
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final void m29812P(AccountMakeupPageView accountMakeupPageView) {
        this.f17401c = AccountCameraEffectMgr.m29697V().m29762v();
        accountMakeupPageView.setOnItemClicked(new a30() { // from class: l.bs
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                AccountMakeupPageAdapter.m29803I((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        accountMakeupPageView.m30066f(2);
        accountMakeupPageView.m30070j(this.f17401c);
        accountMakeupPageView.m30074n(0, false, 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m29813Q(final AccountMakeupPageView accountMakeupPageView, int i) {
        this.f17402d = AccountCameraEffectMgr.m29697V().m29743j();
        accountMakeupPageView.setOnItemClicked(new a30() { // from class: l.zr
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                AccountMakeupPageAdapter.m29799E((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        accountMakeupPageView.m30070j(this.f17402d);
        accountMakeupPageView.m30066f(1);
        accountMakeupPageView.m30074n(1, true, 0);
        AccountCameraEffectMgr.m29697V().m29723X().m29776l().m2984i(this.f17399a, new cb50() { // from class: l.as
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f73016a.m29808L(accountMakeupPageView, (bkj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m29814R(AccountBeautyMakeupPageView accountBeautyMakeupPageView, List<AccountMakeUpMenuView.MakeupCategory> list) {
        accountBeautyMakeupPageView.m29896s(list);
        accountBeautyMakeupPageView.m29888k(2);
        accountBeautyMakeupPageView.m29885B(2);
    }

    /* JADX INFO: renamed from: S */
    public final void m29815S(final AccountMakeupPageView accountMakeupPageView, int i) {
        this.f17403e = AccountCameraEffectMgr.m29697V().m29752o();
        accountMakeupPageView.setOnItemClicked(new a30() { // from class: l.cs
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                AccountMakeupPageAdapter.m29798D((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        accountMakeupPageView.m30070j(this.f17403e);
        accountMakeupPageView.m30066f(1);
        accountMakeupPageView.m30074n(2, true, 1);
        AccountCameraEffectMgr.m29697V().m29723X().m29776l().m2984i(this.f17399a, new cb50() { // from class: l.ds
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f90446a.m29809M(accountMakeupPageView, (bkj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m29816T(AccountMakeupPageView accountMakeupPageView, AccountMakeUpMenuView.MakeupCategory makeupCategory, int i) {
        accountMakeupPageView.setOnItemClicked(new a30() { // from class: l.yr
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                AccountMakeupPageAdapter.m29800F((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        List<MakeupItem> listM29714M = AccountCameraEffectMgr.m29697V().m29714M();
        this.f17404f = listM29714M;
        if (jyb.m147479J(listM29714M)) {
            m29811O(accountMakeupPageView, makeupCategory.f17061id);
            return;
        }
        accountMakeupPageView.m30070j(this.f17404f);
        accountMakeupPageView.m30066f(2);
        accountMakeupPageView.m30074n(3, false, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f17400b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 4 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        AccountMakeUpMenuView.MakeupCategory makeupCategory = this.f17400b.get(i);
        if (!(abstractC0569e0 instanceof C4800b)) {
            if (abstractC0569e0 instanceof C4799a) {
                AccountBeautyMakeupPageView accountBeautyMakeupPageView = ((C4799a) abstractC0569e0).f17406a;
                accountBeautyMakeupPageView.setTag(Integer.valueOf(i));
                accountBeautyMakeupPageView.setOnCategoryClicked(new a30() { // from class: l.wr
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        AccountCameraEffectMgr.m29697V().m29723X().m29780p(new bkj0<>((AccountMakeUpMenuView.MakeupCategory) obj, (Integer) obj2, (Boolean) obj3));
                    }
                });
                accountBeautyMakeupPageView.setOnItemClicked(new a30() { // from class: l.xr
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        AccountCameraEffectMgr.m29697V().m29723X().m29781q(new bkj0<>((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3));
                    }
                });
                m29814R(accountBeautyMakeupPageView, makeupCategory.subMenu);
                return;
            }
            return;
        }
        AccountMakeupPageView accountMakeupPageView = ((C4800b) abstractC0569e0).f17407a;
        accountMakeupPageView.setTag(Integer.valueOf(i));
        int i2 = makeupCategory.extType;
        if (i2 == 1000) {
            m29812P(accountMakeupPageView);
            return;
        }
        if (i2 == 1001) {
            m29813Q(accountMakeupPageView, i);
        } else if (i2 == 1002) {
            m29815S(accountMakeupPageView, i);
        } else if (i2 == 1003) {
            m29816T(accountMakeupPageView, makeupCategory, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.AbstractC0569e0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Act act = this.f17399a;
        return i == 0 ? new C4800b((AccountMakeupPageView) act.inflater().inflate(hec0.f109111g, viewGroup, false)) : new C4799a((AccountBeautyMakeupPageView) act.inflater().inflate(hec0.f109103c, viewGroup, false));
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
            this.f17063id = cameraSticker.f17063id;
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
            this.all = AccountCameraEffectMgr.m29697V().m29709F(str2);
        }

        public MakeupItem(String str, String str2, int i, int i2, float f) {
            this.name = str;
            this.type = str2;
            this.normalImgId = i;
            this.selectedImgId = i2;
            this.all = f;
        }

        public MakeupItem(CameraSticker cameraSticker, String str) {
            this.f17063id = cameraSticker.f17063id;
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
