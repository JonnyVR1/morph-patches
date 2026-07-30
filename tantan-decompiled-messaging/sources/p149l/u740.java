package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class u740 extends eb2 {

    /* JADX INFO: renamed from: e */
    public List<PurchaseType> f174918e;

    /* JADX INFO: renamed from: f */
    public e30<Integer> f174919f;

    /* JADX INFO: renamed from: g */
    public List<Privilege> f174920g;

    /* JADX INFO: renamed from: h */
    public String f174921h;

    /* JADX INFO: renamed from: i */
    public int f174922i;

    /* JADX INFO: renamed from: j */
    public g30<PurchaseType, Act, String> f174923j;

    /* JADX INFO: renamed from: k */
    public e30<PurchaseType> f174924k;

    /* JADX INFO: renamed from: m */
    public int f174926m;

    /* JADX INFO: renamed from: n */
    public f30<PurchaseType, View> f174927n;

    /* JADX INFO: renamed from: l */
    public Map<PurchaseType, View> f174925l = new HashMap();

    /* JADX INFO: renamed from: o */
    public boolean f174928o = false;

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m192079A(Boolean bool) {
        this.f174928o = bool.booleanValue();
        if (t4b.m187163d()) {
            m192089v(Boolean.valueOf(this.f174928o));
        }
    }

    /* JADX INFO: renamed from: C */
    public void m192080C(int i) {
        String str;
        if (this.f174925l.size() == 0) {
            return;
        }
        if (getCount() != 2) {
            this.f174921h = this.f174921h;
            ((PurchaseView) this.f174925l.get(this.f174918e.get(i))).setFrom(this.f174921h);
            ((PurchaseView) this.f174925l.get(this.f174918e.get(i))).m53180W();
            return;
        }
        View view = this.f174925l.get(this.f174918e.get(i));
        if (!CoreModule.m29935P().m94651a().mo33507h5()) {
            if (view instanceof PurchaseView) {
                String str2 = this.f174921h;
                this.f174921h = str2;
                PurchaseView purchaseView = (PurchaseView) view;
                purchaseView.setFrom(str2);
                purchaseView.m53180W();
                return;
            }
            return;
        }
        PurchaseType purchaseType = this.f174918e.get(i);
        if (sab0.m182905w(purchaseType)) {
            str = "vip";
        } else {
            str = sab0.m182899q(purchaseType) ? "svip" : null;
        }
        if (!TextUtils.isEmpty(str)) {
            zvf0.m220399u("e_purchase_tab", ((PurchaseView) this.f174925l.get(this.f174918e.get(i))).m53181X(), vwb.m200311Y("tab_type", str));
        }
        PurchaseView purchaseView2 = (PurchaseView) view;
        purchaseView2.m53180W();
        purchaseView2.m53191h0(this.f174928o);
    }

    /* JADX INFO: renamed from: D */
    public void m192081D(f30<PurchaseType, View> f30Var) {
        this.f174927n = f30Var;
    }

    /* JADX INFO: renamed from: E */
    public void m192082E(int i) {
        this.f174922i = i;
    }

    /* JADX INFO: renamed from: F */
    public void m192083F(String str) {
        this.f174921h = str;
    }

    /* JADX INFO: renamed from: G */
    public void m192084G(e30<PurchaseType> e30Var) {
        this.f174924k = e30Var;
    }

    /* JADX INFO: renamed from: H */
    public void m192085H(g30<PurchaseType, Act, String> g30Var) {
        this.f174923j = g30Var;
    }

    /* JADX INFO: renamed from: I */
    public void m192086I(List<PurchaseType> list, List<Privilege> list2, e30<Integer> e30Var) {
        this.f174918e = list;
        this.f174920g = list2;
        this.f174919f = e30Var;
    }

    /* JADX INFO: renamed from: J */
    public void m192087J(int i) {
        this.f174926m = i;
    }

    /* JADX INFO: renamed from: K */
    public void m192088K(int i) {
        if (this.f174925l.size() == 0) {
            return;
        }
        View view = this.f174925l.get(this.f174918e.get(i));
        if (view instanceof PurchaseView) {
            ((PurchaseView) view).m53189f0();
        }
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f174918e.size();
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return obj == view;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: m */
    public void mo43284m(Object obj) {
        final View view = (View) obj;
        if ((view instanceof PurchaseView) && this.f174922i == vwb.m200293G(this.f174918e, new w9j() { // from class: l.s740
            @Override // p149l.w9j
            public final Object call(Object obj2) {
                return Boolean.valueOf(((PurchaseType) obj2) == ((PurchaseView) view).getPurchaseType());
            }
        })) {
            ((PurchaseView) view).m53180W();
        }
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, final int i) {
        PurchaseType purchaseType;
        PurchaseType purchaseType2;
        PurchaseView purchaseView = (PurchaseView) o7r.m163037a(viewGroup.getContext()).inflate(m6c0.f131488H2, viewGroup, false);
        final ArrayList arrayList = new ArrayList();
        if ((CoreModule.m29935P().m94651a().mo33507h5() || CoreModule.m29935P().m94651a().mo33442Xi()) && (purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) == this.f174918e.get(i)) {
            vwb.m200354z(purchaseType.getPrivilegeDataForGP(null), new e30() { // from class: l.p740
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f147475a.m192092y(i, arrayList, (Privilege) obj);
                }
            });
        } else if (CoreModule.m29935P().m94651a().mo158371f() && (purchaseType2 = PurchaseType.TYPE_O_DIAMOND) == this.f174918e.get(i)) {
            final ArrayList<Privilege> privilegeData = purchaseType2.getPrivilegeData(null);
            vwb.m200354z(privilegeData, new e30() { // from class: l.q740
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f152981a.m192093z(i, privilegeData, arrayList, (Privilege) obj);
                }
            });
        }
        new o740(purchaseView).m162971i(this.f174918e.get(i), this.f174920g.get(i)).m162970h(arrayList).m162966d(this.f174919f).m162969g(this.f174923j).m162968f(this.f174924k).m162964b(new e30() { // from class: l.r740
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158009a.m192079A((Boolean) obj);
            }
        }).m162967e(this.f174921h).m162965c(this.f174927n).m162963a(i != this.f174926m);
        purchaseView.setTag(Integer.valueOf(i));
        viewGroup.addView(purchaseView);
        this.f174925l.put(this.f174918e.get(i), purchaseView);
        return purchaseView;
    }

    /* JADX INFO: renamed from: v */
    public final void m192089v(final Boolean bool) {
        if (NullChecker.m81303a(this.f174918e)) {
            vwb.m200354z(this.f174918e, new e30() { // from class: l.t740
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f168659a.m192091x(bool, (PurchaseType) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public void m192090w(int i) {
        m192088K(i);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m192091x(Boolean bool, PurchaseType purchaseType) {
        if (this.f174925l.get(purchaseType) instanceof PurchaseView) {
            ((PurchaseView) this.f174925l.get(purchaseType)).m53191h0(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m192092y(int i, List list, Privilege privilege) {
        PurchaseType purchaseType = this.f174918e.get(i);
        PurchaseType purchaseType2 = PurchaseType.TYPE_O_DIAMOND;
        if (purchaseType == purchaseType2 && NullChecker.m81303a(this.f174920g) && i < this.f174920g.size() && !purchaseType2.getPrivilegeData(null).contains(this.f174920g.get(i)) && privilege == Privilege.oDiamondSvipExtra) {
            list.add(0, fy80.m123717m(this.f174918e.get(i), privilege));
            return;
        }
        if (NullChecker.m81303a(this.f174920g) && i < this.f174920g.size() && privilege == this.f174920g.get(i)) {
            list.add(0, fy80.m123717m(this.f174918e.get(i), privilege));
        } else if (NullChecker.m81303a(privilege)) {
            list.add(fy80.m123717m(this.f174918e.get(i), privilege));
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m192093z(int i, List list, List list2, Privilege privilege) {
        if (this.f174918e.get(i) == PurchaseType.TYPE_O_DIAMOND && NullChecker.m81303a(this.f174920g) && i < this.f174920g.size() && !list.contains(this.f174920g.get(i)) && privilege == Privilege.oDiamondSvipExtra) {
            list2.add(0, fy80.m123717m(this.f174918e.get(i), privilege));
            return;
        }
        if (NullChecker.m81303a(this.f174920g) && i < this.f174920g.size() && privilege == this.f174920g.get(i)) {
            list2.add(0, fy80.m123717m(this.f174918e.get(i), privilege));
        } else if (NullChecker.m81303a(privilege)) {
            list2.add(fy80.m123717m(this.f174918e.get(i), privilege));
        }
    }
}
