package com.p000p1.mobile.putong.account.p002ui.camera.adapter;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.account.p002ui.accountai.SignUpAiAct;
import com.p000p1.mobile.putong.account.p002ui.camera.AccountCameraEffectMgr;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountBeautyMakeupPageView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeupPageView;
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
import p006l.c6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountMakeupPageAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    public Act f669a;

    /* JADX INFO: renamed from: b */
    public List<AccountMakeUpMenuView.MakeupCategory> f670b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public List<MakeupItem> f671c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<MakeupItem> f672d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<MakeupItem> f673e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public List<MakeupItem> f674f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<MakeupItem> f675g = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.AccountMakeupPageAdapter$a */
    public static class C0074a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public AccountBeautyMakeupPageView f676a;

        public C0074a(@NonNull AccountBeautyMakeupPageView accountBeautyMakeupPageView) {
            super(accountBeautyMakeupPageView);
            this.f676a = accountBeautyMakeupPageView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.adapter.AccountMakeupPageAdapter$b */
    public static class C0075b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public AccountMakeupPageView f677a;

        public C0075b(@NonNull AccountMakeupPageView accountMakeupPageView) {
            super(accountMakeupPageView);
            this.f677a = accountMakeupPageView;
        }
    }

    public AccountMakeupPageAdapter(Act act) {
        this.f669a = act;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m699D(MakeupItem makeupItem, Integer num, Boolean bool) {
        AccountCameraEffectMgr.m597V().m642i0(num.intValue());
        AccountCameraEffectMgr.m597V().m623X().m682r(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m700E(MakeupItem makeupItem, Integer num, Boolean bool) {
        AccountCameraEffectMgr.m597V().m638g0(num.intValue());
        AccountCameraEffectMgr.m597V().m623X().m679o(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m701F(MakeupItem makeupItem, Integer num, Boolean bool) {
        AccountCameraEffectMgr.m597V().m644j0(num.intValue());
        AccountCameraEffectMgr.m597V().m623X().m685u(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m704I(MakeupItem makeupItem, Integer num, Boolean bool) {
        AccountCameraEffectMgr.m597V().m636f0(num.intValue());
        AccountCameraEffectMgr.m597V().m623X().m678n(new xaj0<>(makeupItem, num, bool));
    }

    /* JADX INFO: renamed from: J */
    public final float m707J(String str, Map<String, Float> map) {
        Float f;
        return (map == null || (f = map.get(str)) == null) ? AccountCameraEffectMgr.m594H(str) : f.floatValue();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m708K(AccountMakeupPageView accountMakeupPageView, List list) {
        List<MakeupItem> listM654p = AccountCameraEffectMgr.m597V().m654p(list);
        this.f674f = listM654p;
        accountMakeupPageView.m977j(listM654p);
        accountMakeupPageView.m973f(2);
        accountMakeupPageView.m981n(3, false, 0);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m709L(AccountMakeupPageView accountMakeupPageView, xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return;
        }
        for (MakeupItem makeupItem : this.f672d) {
            makeupItem.all = m707J(makeupItem.type, ((MakeupItem) xaj0Var.a).beautyParameterMap);
        }
        accountMakeupPageView.m979l();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m710M(AccountMakeupPageView accountMakeupPageView, xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return;
        }
        for (MakeupItem makeupItem : this.f673e) {
            makeupItem.all = m707J(makeupItem.type, ((MakeupItem) xaj0Var.a).beautyParameterMap);
        }
        accountMakeupPageView.m979l();
    }

    /* JADX INFO: renamed from: N */
    public void m711N(List<AccountMakeUpMenuView.MakeupCategory> list) {
        if (!vwb.J(list)) {
            this.f670b.clear();
            this.f670b.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: O */
    public final void m712O(final AccountMakeupPageView accountMakeupPageView, String str) {
        SignUpAiAct.f344c.m22077M(str).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.ks
            public final void call(Object obj) {
                this.f15974a.m708K(accountMakeupPageView, (List) obj);
            }
        }, new e30() { // from class: l.ls
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final void m713P(AccountMakeupPageView accountMakeupPageView) {
        this.f671c = AccountCameraEffectMgr.m597V().m662v();
        accountMakeupPageView.setOnItemClicked(new g30() { // from class: l.hs
            /* JADX INFO: renamed from: a */
            public final void m16312a(Object obj, Object obj2, Object obj3) {
                AccountMakeupPageAdapter.m704I((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        accountMakeupPageView.m973f(2);
        accountMakeupPageView.m977j(this.f671c);
        accountMakeupPageView.m981n(0, false, 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m714Q(final AccountMakeupPageView accountMakeupPageView, int i) {
        this.f672d = AccountCameraEffectMgr.m597V().m643j();
        accountMakeupPageView.setOnItemClicked(new g30() { // from class: l.fs
            /* JADX INFO: renamed from: a */
            public final void m15459a(Object obj, Object obj2, Object obj3) {
                AccountMakeupPageAdapter.m700E((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        accountMakeupPageView.m977j(this.f672d);
        accountMakeupPageView.m973f(1);
        accountMakeupPageView.m981n(1, true, 0);
        AccountCameraEffectMgr.m597V().m623X().m676l().i(this.f669a, new n250() { // from class: l.gs
            public final void onChanged(Object obj) {
                this.f13464a.m709L(accountMakeupPageView, (xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m715R(AccountBeautyMakeupPageView accountBeautyMakeupPageView, List<AccountMakeUpMenuView.MakeupCategory> list) {
        accountBeautyMakeupPageView.m803s(list);
        accountBeautyMakeupPageView.m795k(2);
        accountBeautyMakeupPageView.m792B(2);
    }

    /* JADX INFO: renamed from: S */
    public final void m716S(final AccountMakeupPageView accountMakeupPageView, int i) {
        this.f673e = AccountCameraEffectMgr.m597V().m652o();
        accountMakeupPageView.setOnItemClicked(new g30() { // from class: l.is
            /* JADX INFO: renamed from: a */
            public final void m16953a(Object obj, Object obj2, Object obj3) {
                AccountMakeupPageAdapter.m699D((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        accountMakeupPageView.m977j(this.f673e);
        accountMakeupPageView.m973f(1);
        accountMakeupPageView.m981n(2, true, 1);
        AccountCameraEffectMgr.m597V().m623X().m676l().i(this.f669a, new n250() { // from class: l.js
            public final void onChanged(Object obj) {
                this.f15367a.m710M(accountMakeupPageView, (xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m717T(AccountMakeupPageView accountMakeupPageView, AccountMakeUpMenuView.MakeupCategory makeupCategory, int i) {
        accountMakeupPageView.setOnItemClicked(new g30() { // from class: l.es
            /* JADX INFO: renamed from: a */
            public final void m14807a(Object obj, Object obj2, Object obj3) {
                AccountMakeupPageAdapter.m701F((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        List<MakeupItem> listM614M = AccountCameraEffectMgr.m597V().m614M();
        this.f674f = listM614M;
        if (vwb.J(listM614M)) {
            m712O(accountMakeupPageView, makeupCategory.f331id);
            return;
        }
        accountMakeupPageView.m977j(this.f674f);
        accountMakeupPageView.m973f(2);
        accountMakeupPageView.m981n(3, false, 0);
    }

    public int getItemCount() {
        return this.f670b.size();
    }

    public int getItemViewType(int i) {
        return i == 4 ? 1 : 0;
    }

    public void onBindViewHolder(@NonNull RecyclerView.d0 d0Var, int i) {
        AccountMakeUpMenuView.MakeupCategory makeupCategory = this.f670b.get(i);
        if (!(d0Var instanceof C0075b)) {
            if (d0Var instanceof C0074a) {
                AccountBeautyMakeupPageView accountBeautyMakeupPageView = ((C0074a) d0Var).f676a;
                accountBeautyMakeupPageView.setTag(Integer.valueOf(i));
                accountBeautyMakeupPageView.setOnCategoryClicked(new g30() { // from class: l.cs
                    /* JADX INFO: renamed from: a */
                    public final void m13618a(Object obj, Object obj2, Object obj3) {
                        AccountCameraEffectMgr.m597V().m623X().m680p(new xaj0<>((AccountMakeUpMenuView.MakeupCategory) obj, (Integer) obj2, (Boolean) obj3));
                    }
                });
                accountBeautyMakeupPageView.setOnItemClicked(new g30() { // from class: l.ds
                    /* JADX INFO: renamed from: a */
                    public final void m14188a(Object obj, Object obj2, Object obj3) {
                        AccountCameraEffectMgr.m597V().m623X().m681q(new xaj0<>((AccountMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3));
                    }
                });
                m715R(accountBeautyMakeupPageView, makeupCategory.subMenu);
                return;
            }
            return;
        }
        AccountMakeupPageView accountMakeupPageView = ((C0075b) d0Var).f677a;
        accountMakeupPageView.setTag(Integer.valueOf(i));
        int i2 = makeupCategory.extType;
        if (i2 == 1000) {
            m713P(accountMakeupPageView);
            return;
        }
        if (i2 == 1001) {
            m714Q(accountMakeupPageView, i);
        } else if (i2 == 1002) {
            m716S(accountMakeupPageView, i);
        } else if (i2 == 1003) {
            m717T(accountMakeupPageView, makeupCategory, i);
        }
    }

    @NonNull
    public RecyclerView.d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Act act = this.f669a;
        return i == 0 ? new C0075b((AccountMakeupPageView) act.inflater().inflate(c6c0.f9429g, viewGroup, false)) : new C0074a((AccountBeautyMakeupPageView) act.inflater().inflate(c6c0.f9421c, viewGroup, false));
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
            this.f333id = cameraSticker.f333id;
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
            return LOCAL.equals(this.type);
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
            this.all = AccountCameraEffectMgr.m597V().m609F(str2);
        }

        public MakeupItem(String str, String str2, int i, int i2, float f) {
            this.name = str;
            this.type = str2;
            this.normalImgId = i;
            this.selectedImgId = i2;
            this.all = f;
        }

        public MakeupItem(CameraSticker cameraSticker, String str) {
            this.f333id = cameraSticker.f333id;
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
