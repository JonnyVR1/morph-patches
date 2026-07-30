package com.p046p1.mobile.putong.account.p050ui.camera.adapter;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.data.CameraSticker;
import com.p046p1.mobile.putong.account.p050ui.accountai.SignUpAiAct;
import com.p046p1.mobile.putong.account.p050ui.camera.AccountCameraEffectMgr;
import com.p046p1.mobile.putong.account.p050ui.camera.adapter.AccountMakeupPageAdapter;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountBeautyMakeupPageView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeUpMenuView;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeupPageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p149l.c6c0;
import p149l.e30;
import p149l.g30;
import p149l.jo0;
import p149l.mkd0;
import p149l.n250;
import p149l.vwb;
import p149l.xaj0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMakeupPageAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    public Act f16680a;

    /* JADX INFO: renamed from: b */
    public List<AccountMakeUpMenuView.MakeupCategory> f16681b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public List<MakeupItem> f16682c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<MakeupItem> f16683d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<MakeupItem> f16684e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public List<MakeupItem> f16685f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<MakeupItem> f16686g = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.AccountMakeupPageAdapter$a */
    public static class C4648a extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public AccountBeautyMakeupPageView f16687a;

        public C4648a(@NonNull AccountBeautyMakeupPageView accountBeautyMakeupPageView) {
            super(accountBeautyMakeupPageView);
            this.f16687a = accountBeautyMakeupPageView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.AccountMakeupPageAdapter$b */
    public static class C4649b extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public AccountMakeupPageView f16688a;

        public C4649b(@NonNull AccountMakeupPageView accountMakeupPageView) {
            super(accountMakeupPageView);
            this.f16688a = accountMakeupPageView;
        }
    }

    public AccountMakeupPageAdapter(Act act) {
        this.f16680a = act;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m28799D(MakeupItem makeupItem, Integer num, Boolean bool) {
        AccountCameraEffectMgr.m28698V().m28743i0(num.intValue());
        AccountCameraEffectMgr.m28698V().m28724X().m28783r(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m28800E(MakeupItem makeupItem, Integer num, Boolean bool) {
        AccountCameraEffectMgr.m28698V().m28739g0(num.intValue());
        AccountCameraEffectMgr.m28698V().m28724X().m28780o(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m28801F(MakeupItem makeupItem, Integer num, Boolean bool) {
        AccountCameraEffectMgr.m28698V().m28745j0(num.intValue());
        AccountCameraEffectMgr.m28698V().m28724X().m28786u(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m28804I(MakeupItem makeupItem, Integer num, Boolean bool) {
        AccountCameraEffectMgr.m28698V().m28737f0(num.intValue());
        AccountCameraEffectMgr.m28698V().m28724X().m28779n(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: J */
    public final float m28807J(String str, Map<String, Float> map) {
        Float f;
        return (map == null || (f = map.get(str)) == null) ? AccountCameraEffectMgr.m28695H(str) : f.floatValue();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m28808K(AccountMakeupPageView accountMakeupPageView, List list) {
        List<MakeupItem> listM28755p = AccountCameraEffectMgr.m28698V().m28755p(list);
        this.f16685f = listM28755p;
        accountMakeupPageView.m29071j(listM28755p);
        accountMakeupPageView.m29067f(2);
        accountMakeupPageView.m29075n(3, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m28809L(AccountMakeupPageView accountMakeupPageView, xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return;
        }
        for (MakeupItem makeupItem : this.f16683d) {
            makeupItem.all = m28807J(makeupItem.type, ((MakeupItem) xaj0Var.f191751a).beautyParameterMap);
        }
        accountMakeupPageView.m29073l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m28810M(AccountMakeupPageView accountMakeupPageView, xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return;
        }
        for (MakeupItem makeupItem : this.f16684e) {
            makeupItem.all = m28807J(makeupItem.type, ((MakeupItem) xaj0Var.f191751a).beautyParameterMap);
        }
        accountMakeupPageView.m29073l();
    }

    /* JADX INFO: renamed from: N */
    public void m28811N(List<AccountMakeUpMenuView.MakeupCategory> list) {
        if (!vwb.m200296J(list)) {
            this.f16681b.clear();
            this.f16681b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: O */
    public final void m28812O(final AccountMakeupPageView accountMakeupPageView, String str) {
        SignUpAiAct.f16355c.m174493M(str).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.ks
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124406a.m28808K(accountMakeupPageView, (List) obj);
            }
        }, new e30() { // from class: l.ls
            @Override // p149l.e30
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final void m28813P(AccountMakeupPageView accountMakeupPageView) {
        this.f16682c = AccountCameraEffectMgr.m28698V().m28763v();
        accountMakeupPageView.setOnItemClicked(new g30() { // from class: l.hs
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                AccountMakeupPageAdapter.m28804I((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        accountMakeupPageView.m29067f(2);
        accountMakeupPageView.m29071j(this.f16682c);
        accountMakeupPageView.m29075n(0, false, 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m28814Q(final AccountMakeupPageView accountMakeupPageView, int i) {
        this.f16683d = AccountCameraEffectMgr.m28698V().m28744j();
        accountMakeupPageView.setOnItemClicked(new g30() { // from class: l.fs
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                AccountMakeupPageAdapter.m28800E((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        accountMakeupPageView.m29071j(this.f16683d);
        accountMakeupPageView.m29067f(1);
        accountMakeupPageView.m29075n(1, true, 0);
        AccountCameraEffectMgr.m28698V().m28724X().m28777l().m2983i(this.f16680a, new n250() { // from class: l.gs
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f104129a.m28809L(accountMakeupPageView, (xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m28815R(AccountBeautyMakeupPageView accountBeautyMakeupPageView, List<AccountMakeUpMenuView.MakeupCategory> list) {
        accountBeautyMakeupPageView.m28897s(list);
        accountBeautyMakeupPageView.m28889k(2);
        accountBeautyMakeupPageView.m28886B(2);
    }

    /* JADX INFO: renamed from: S */
    public final void m28816S(final AccountMakeupPageView accountMakeupPageView, int i) {
        this.f16684e = AccountCameraEffectMgr.m28698V().m28753o();
        accountMakeupPageView.setOnItemClicked(new g30() { // from class: l.is
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                AccountMakeupPageAdapter.m28799D((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        accountMakeupPageView.m29071j(this.f16684e);
        accountMakeupPageView.m29067f(1);
        accountMakeupPageView.m29075n(2, true, 1);
        AccountCameraEffectMgr.m28698V().m28724X().m28777l().m2983i(this.f16680a, new n250() { // from class: l.js
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f119466a.m28810M(accountMakeupPageView, (xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m28817T(AccountMakeupPageView accountMakeupPageView, AccountMakeUpMenuView.MakeupCategory makeupCategory, int i) {
        accountMakeupPageView.setOnItemClicked(new g30() { // from class: l.es
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                AccountMakeupPageAdapter.m28801F((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        List<MakeupItem> listM28715M = AccountCameraEffectMgr.m28698V().m28715M();
        this.f16685f = listM28715M;
        if (vwb.m200296J(listM28715M)) {
            m28812O(accountMakeupPageView, makeupCategory.f16342id);
            return;
        }
        accountMakeupPageView.m29071j(this.f16685f);
        accountMakeupPageView.m29067f(2);
        accountMakeupPageView.m29075n(3, false, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f16681b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 4 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        AccountMakeUpMenuView.MakeupCategory makeupCategory = this.f16681b.get(i);
        if (!(abstractC0566d0 instanceof C4649b)) {
            if (abstractC0566d0 instanceof C4648a) {
                AccountBeautyMakeupPageView accountBeautyMakeupPageView = ((C4648a) abstractC0566d0).f16687a;
                accountBeautyMakeupPageView.setTag(Integer.valueOf(i));
                accountBeautyMakeupPageView.setOnCategoryClicked(new g30() { // from class: l.cs
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        AccountCameraEffectMgr.m28698V().m28724X().m28781p(new xaj0<>((AccountMakeUpMenuView.MakeupCategory) obj, (Integer) obj2, (Boolean) obj3));
                    }
                });
                accountBeautyMakeupPageView.setOnItemClicked(new g30() { // from class: l.ds
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        AccountCameraEffectMgr.m28698V().m28724X().m28782q(new xaj0<>((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3));
                    }
                });
                m28815R(accountBeautyMakeupPageView, makeupCategory.subMenu);
                return;
            }
            return;
        }
        AccountMakeupPageView accountMakeupPageView = ((C4649b) abstractC0566d0).f16688a;
        accountMakeupPageView.setTag(Integer.valueOf(i));
        int i2 = makeupCategory.extType;
        if (i2 == 1000) {
            m28813P(accountMakeupPageView);
            return;
        }
        if (i2 == 1001) {
            m28814Q(accountMakeupPageView, i);
        } else if (i2 == 1002) {
            m28816S(accountMakeupPageView, i);
        } else if (i2 == 1003) {
            m28817T(accountMakeupPageView, makeupCategory, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.AbstractC0566d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Act act = this.f16680a;
        return i == 0 ? new C4649b((AccountMakeupPageView) act.inflater().inflate(c6c0.f79499g, viewGroup, false)) : new C4648a((AccountBeautyMakeupPageView) act.inflater().inflate(c6c0.f79491c, viewGroup, false));
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
            this.f16344id = cameraSticker.f16344id;
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
            this.all = AccountCameraEffectMgr.m28698V().m28710F(str2);
        }

        public MakeupItem(String str, String str2, int i, int i2, float f) {
            this.name = str;
            this.type = str2;
            this.normalImgId = i;
            this.selectedImgId = i2;
            this.all = f;
        }

        public MakeupItem(CameraSticker cameraSticker, String str) {
            this.f16344id = cameraSticker.f16344id;
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
