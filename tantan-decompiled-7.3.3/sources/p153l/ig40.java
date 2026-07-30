package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ig40 extends lb2 {

    /* JADX INFO: renamed from: e */
    public List<PurchaseType> f114734e;

    /* JADX INFO: renamed from: f */
    public y20<Integer> f114735f;

    /* JADX INFO: renamed from: g */
    public List<Privilege> f114736g;

    /* JADX INFO: renamed from: h */
    public String f114737h;

    /* JADX INFO: renamed from: i */
    public int f114738i;

    /* JADX INFO: renamed from: j */
    public a30<PurchaseType, Act, String> f114739j;

    /* JADX INFO: renamed from: k */
    public y20<PurchaseType> f114740k;

    /* JADX INFO: renamed from: m */
    public int f114742m;

    /* JADX INFO: renamed from: n */
    public z20<PurchaseType, View> f114743n;

    /* JADX INFO: renamed from: l */
    public Map<PurchaseType, View> f114741l = new HashMap();

    /* JADX INFO: renamed from: o */
    public boolean f114744o = false;

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m139770A(Boolean bool) {
        this.f114744o = bool.booleanValue();
        if (g6b.m129214d()) {
            m139780v(Boolean.valueOf(this.f114744o));
        }
    }

    /* JADX INFO: renamed from: C */
    public void m139771C(int i) {
        String str;
        if (this.f114741l.size() == 0) {
            return;
        }
        if (getCount() != 2) {
            this.f114737h = this.f114737h;
            ((PurchaseView) this.f114741l.get(this.f114734e.get(i))).setFrom(this.f114737h);
            ((PurchaseView) this.f114741l.get(this.f114734e.get(i))).m54363W();
            return;
        }
        View view = this.f114741l.get(this.f114734e.get(i));
        if (!CoreModule.m30933P().m143405a().mo34510h5()) {
            if (view instanceof PurchaseView) {
                String str2 = this.f114737h;
                this.f114737h = str2;
                PurchaseView purchaseView = (PurchaseView) view;
                purchaseView.setFrom(str2);
                purchaseView.m54363W();
                return;
            }
            return;
        }
        PurchaseType purchaseType = this.f114734e.get(i);
        if (wib0.m206579w(purchaseType)) {
            str = "vip";
        } else {
            str = wib0.m206573q(purchaseType) ? "svip" : null;
        }
        if (!TextUtils.isEmpty(str)) {
            i4g0.m138523u("e_purchase_tab", ((PurchaseView) this.f114741l.get(this.f114734e.get(i))).m54364X(), jyb.m147494Y("tab_type", str));
        }
        PurchaseView purchaseView2 = (PurchaseView) view;
        purchaseView2.m54363W();
        purchaseView2.m54374h0(this.f114744o);
    }

    /* JADX INFO: renamed from: D */
    public void m139772D(z20<PurchaseType, View> z20Var) {
        this.f114743n = z20Var;
    }

    /* JADX INFO: renamed from: E */
    public void m139773E(int i) {
        this.f114738i = i;
    }

    /* JADX INFO: renamed from: F */
    public void m139774F(String str) {
        this.f114737h = str;
    }

    /* JADX INFO: renamed from: G */
    public void m139775G(y20<PurchaseType> y20Var) {
        this.f114740k = y20Var;
    }

    /* JADX INFO: renamed from: H */
    public void m139776H(a30<PurchaseType, Act, String> a30Var) {
        this.f114739j = a30Var;
    }

    /* JADX INFO: renamed from: I */
    public void m139777I(List<PurchaseType> list, List<Privilege> list2, y20<Integer> y20Var) {
        this.f114734e = list;
        this.f114736g = list2;
        this.f114735f = y20Var;
    }

    /* JADX INFO: renamed from: J */
    public void m139778J(int i) {
        this.f114742m = i;
    }

    /* JADX INFO: renamed from: K */
    public void m139779K(int i) {
        if (this.f114741l.size() == 0) {
            return;
        }
        View view = this.f114741l.get(this.f114734e.get(i));
        if (view instanceof PurchaseView) {
            ((PurchaseView) view).m54372f0();
        }
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f114734e.size();
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return obj == view;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: m */
    public void mo44299m(Object obj) {
        final View view = (View) obj;
        if ((view instanceof PurchaseView) && this.f114738i == jyb.m147476G(this.f114734e, new qcj() { // from class: l.gg40
            @Override // p153l.qcj
            public final Object call(Object obj2) {
                return Boolean.valueOf(((PurchaseType) obj2) == ((PurchaseView) view).getPurchaseType());
            }
        })) {
            ((PurchaseView) view).m54363W();
        }
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, final int i) {
        PurchaseType purchaseType;
        PurchaseType purchaseType2;
        PurchaseView purchaseView = (PurchaseView) p9r.m171370a(viewGroup.getContext()).inflate(rec0.f162448H2, viewGroup, false);
        final ArrayList arrayList = new ArrayList();
        if ((CoreModule.m30933P().m143405a().mo34510h5() || CoreModule.m30933P().m143405a().mo34445Xi()) && (purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) == this.f114734e.get(i)) {
            jyb.m147537z(purchaseType.getPrivilegeDataForGP(null), new y20() { // from class: l.dg40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f88256a.m139783y(i, arrayList, (Privilege) obj);
                }
            });
        } else if (CoreModule.m30933P().m143405a().mo180463f() && (purchaseType2 = PurchaseType.TYPE_O_DIAMOND) == this.f114734e.get(i)) {
            final ArrayList<Privilege> privilegeData = purchaseType2.getPrivilegeData(null);
            jyb.m147537z(privilegeData, new y20() { // from class: l.eg40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f93897a.m139784z(i, privilegeData, arrayList, (Privilege) obj);
                }
            });
        }
        new cg40(purchaseView).m109674i(this.f114734e.get(i), this.f114736g.get(i)).m109673h(arrayList).m109669d(this.f114735f).m109672g(this.f114739j).m109671f(this.f114740k).m109667b(new y20() { // from class: l.fg40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98885a.m139770A((Boolean) obj);
            }
        }).m109670e(this.f114737h).m109668c(this.f114743n).m109666a(i != this.f114742m);
        purchaseView.setTag(Integer.valueOf(i));
        viewGroup.addView(purchaseView);
        this.f114741l.put(this.f114734e.get(i), purchaseView);
        return purchaseView;
    }

    /* JADX INFO: renamed from: v */
    public final void m139780v(final Boolean bool) {
        if (NullChecker.m82486a(this.f114734e)) {
            jyb.m147537z(this.f114734e, new y20() { // from class: l.hg40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f109366a.m139782x(bool, (PurchaseType) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public void m139781w(int i) {
        m139779K(i);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m139782x(Boolean bool, PurchaseType purchaseType) {
        if (this.f114741l.get(purchaseType) instanceof PurchaseView) {
            ((PurchaseView) this.f114741l.get(purchaseType)).m54374h0(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m139783y(int i, List list, Privilege privilege) {
        PurchaseType purchaseType = this.f114734e.get(i);
        PurchaseType purchaseType2 = PurchaseType.TYPE_O_DIAMOND;
        if (purchaseType == purchaseType2 && NullChecker.m82486a(this.f114736g) && i < this.f114736g.size() && !purchaseType2.getPrivilegeData(null).contains(this.f114736g.get(i)) && privilege == Privilege.oDiamondSvipExtra) {
            list.add(0, j690.m143621m(this.f114734e.get(i), privilege));
            return;
        }
        if (NullChecker.m82486a(this.f114736g) && i < this.f114736g.size() && privilege == this.f114736g.get(i)) {
            list.add(0, j690.m143621m(this.f114734e.get(i), privilege));
        } else if (NullChecker.m82486a(privilege)) {
            list.add(j690.m143621m(this.f114734e.get(i), privilege));
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m139784z(int i, List list, List list2, Privilege privilege) {
        if (this.f114734e.get(i) == PurchaseType.TYPE_O_DIAMOND && NullChecker.m82486a(this.f114736g) && i < this.f114736g.size() && !list.contains(this.f114736g.get(i)) && privilege == Privilege.oDiamondSvipExtra) {
            list2.add(0, j690.m143621m(this.f114734e.get(i), privilege));
            return;
        }
        if (NullChecker.m82486a(this.f114736g) && i < this.f114736g.size() && privilege == this.f114736g.get(i)) {
            list2.add(0, j690.m143621m(this.f114734e.get(i), privilege));
        } else if (NullChecker.m82486a(privilege)) {
            list2.add(j690.m143621m(this.f114734e.get(i), privilege));
        }
    }
}
