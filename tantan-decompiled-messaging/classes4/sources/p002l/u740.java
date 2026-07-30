package p002l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.purchase.PurchaseView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Gender;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e30;
import l.eb2;
import l.f30;
import l.fy80;
import l.g30;
import l.j760;
import l.m6c0;
import l.o7r;
import l.sab0;
import l.t4b;
import l.vwb;
import l.w9j;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u740 extends eb2 {

    /* JADX INFO: renamed from: e */
    public List<PurchaseType> f20513e;

    /* JADX INFO: renamed from: f */
    public e30<Integer> f20514f;

    /* JADX INFO: renamed from: g */
    public List<Privilege> f20515g;

    /* JADX INFO: renamed from: h */
    public String f20516h;

    /* JADX INFO: renamed from: i */
    public int f20517i;

    /* JADX INFO: renamed from: j */
    public g30<PurchaseType, Act, String> f20518j;

    /* JADX INFO: renamed from: k */
    public e30<PurchaseType> f20519k;

    /* JADX INFO: renamed from: m */
    public int f20521m;

    /* JADX INFO: renamed from: n */
    public f30<PurchaseType, View> f20522n;

    /* JADX INFO: renamed from: l */
    public Map<PurchaseType, View> f20520l = new HashMap();

    /* JADX INFO: renamed from: o */
    public boolean f20523o = false;

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m23307A(Boolean bool) {
        this.f20523o = bool.booleanValue();
        if (t4b.d()) {
            m23320v(Boolean.valueOf(this.f20523o));
        }
    }

    /* JADX INFO: renamed from: C */
    public void m23308C(int i) {
        String str;
        if (this.f20520l.size() == 0) {
            return;
        }
        if (getCount() != 2) {
            this.f20516h = this.f20516h;
            ((PurchaseView) this.f20520l.get(this.f20513e.get(i))).setFrom(this.f20516h);
            ((PurchaseView) this.f20520l.get(this.f20513e.get(i))).m3746W();
            return;
        }
        Object obj = (View) this.f20520l.get(this.f20513e.get(i));
        if (!CoreModule.P().a().h5()) {
            if (obj instanceof PurchaseView) {
                String str2 = this.f20516h;
                this.f20516h = str2;
                PurchaseView purchaseView = (PurchaseView) obj;
                purchaseView.setFrom(str2);
                purchaseView.m3746W();
                return;
            }
            return;
        }
        PurchaseType purchaseType = this.f20513e.get(i);
        if (sab0.w(purchaseType)) {
            str = "vip";
        } else {
            str = sab0.q(purchaseType) ? "svip" : null;
        }
        if (!TextUtils.isEmpty(str)) {
            zvf0.u("e_purchase_tab", ((PurchaseView) ((View) this.f20520l.get(this.f20513e.get(i)))).m3747X(), new j760[]{vwb.Y("tab_type", str)});
        }
        PurchaseView purchaseView2 = (PurchaseView) obj;
        purchaseView2.m3746W();
        purchaseView2.m3757h0(this.f20523o);
    }

    /* JADX INFO: renamed from: D */
    public void m23309D(f30<PurchaseType, View> f30Var) {
        this.f20522n = f30Var;
    }

    /* JADX INFO: renamed from: E */
    public void m23310E(int i) {
        this.f20517i = i;
    }

    /* JADX INFO: renamed from: F */
    public void m23311F(String str) {
        this.f20516h = str;
    }

    /* JADX INFO: renamed from: G */
    public void m23312G(e30<PurchaseType> e30Var) {
        this.f20519k = e30Var;
    }

    /* JADX INFO: renamed from: H */
    public void m23313H(g30<PurchaseType, Act, String> g30Var) {
        this.f20518j = g30Var;
    }

    /* JADX INFO: renamed from: I */
    public void m23314I(List<PurchaseType> list, List<Privilege> list2, e30<Integer> e30Var) {
        this.f20513e = list;
        this.f20515g = list2;
        this.f20514f = e30Var;
    }

    /* JADX INFO: renamed from: J */
    public void m23315J(int i) {
        this.f20521m = i;
    }

    /* JADX INFO: renamed from: K */
    public void m23316K(int i) {
        if (this.f20520l.size() == 0) {
            return;
        }
        Object obj = (View) this.f20520l.get(this.f20513e.get(i));
        if (obj instanceof PurchaseView) {
            ((PurchaseView) obj).m3755f0();
        }
    }

    public int getCount() {
        return this.f20513e.size();
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return obj == view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public void m23317m(Object obj) {
        final View view = (View) obj;
        if ((view instanceof PurchaseView) && this.f20517i == vwb.G(this.f20513e, new w9j() { // from class: l.s740
            public final Object call(Object obj2) {
                return Boolean.valueOf(((PurchaseType) obj2) == ((PurchaseView) view).getPurchaseType());
            }
        })) {
            ((PurchaseView) view).m3746W();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m23318o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.purchase.PurchaseView, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public Object m23319p(ViewGroup viewGroup, final int i) {
        PurchaseType purchaseType;
        PurchaseType purchaseType2;
        ?? r0 = (PurchaseView) o7r.a(viewGroup.getContext()).inflate(m6c0.H2, viewGroup, false);
        final ArrayList arrayList = new ArrayList();
        if ((CoreModule.P().a().h5() || CoreModule.P().a().Xi()) && (purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) == this.f20513e.get(i)) {
            vwb.z(purchaseType.getPrivilegeDataForGP((Gender) null), new e30() { // from class: l.p740
                public final void call(Object obj) {
                    this.f17029a.m23323y(i, arrayList, (Privilege) obj);
                }
            });
        } else if (CoreModule.P().a().f() && (purchaseType2 = PurchaseType.TYPE_O_DIAMOND) == this.f20513e.get(i)) {
            final ArrayList privilegeData = purchaseType2.getPrivilegeData((Gender) null);
            vwb.z(privilegeData, new e30() { // from class: l.q740
                public final void call(Object obj) {
                    this.f17829a.m23324z(i, privilegeData, arrayList, (Privilege) obj);
                }
            });
        }
        new o740(r0).m19267i(this.f20513e.get(i), this.f20515g.get(i)).m19266h(arrayList).m19262d(this.f20514f).m19265g(this.f20518j).m19264f(this.f20519k).m19260b(new e30() { // from class: l.r740
            public final void call(Object obj) {
                this.f18405a.m23307A((Boolean) obj);
            }
        }).m19263e(this.f20516h).m19261c(this.f20522n).m19259a(i != this.f20521m);
        r0.setTag(Integer.valueOf(i));
        viewGroup.addView(r0);
        this.f20520l.put(this.f20513e.get(i), (View) r0);
        return r0;
    }

    /* JADX INFO: renamed from: v */
    public final void m23320v(final Boolean bool) {
        if (NullChecker.a(this.f20513e)) {
            vwb.z(this.f20513e, new e30() { // from class: l.t740
                public final void call(Object obj) {
                    this.f20115a.m23322x(bool, (PurchaseType) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public void m23321w(int i) {
        m23316K(i);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m23322x(Boolean bool, PurchaseType purchaseType) {
        if (this.f20520l.get(purchaseType) instanceof PurchaseView) {
            ((PurchaseView) this.f20520l.get(purchaseType)).m3757h0(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m23323y(int i, List list, Privilege privilege) {
        PurchaseType purchaseType = this.f20513e.get(i);
        PurchaseType purchaseType2 = PurchaseType.TYPE_O_DIAMOND;
        if (purchaseType == purchaseType2 && NullChecker.a(this.f20515g) && i < this.f20515g.size() && !purchaseType2.getPrivilegeData((Gender) null).contains(this.f20515g.get(i)) && privilege == Privilege.oDiamondSvipExtra) {
            list.add(0, fy80.m(this.f20513e.get(i), privilege));
            return;
        }
        if (NullChecker.a(this.f20515g) && i < this.f20515g.size() && privilege == this.f20515g.get(i)) {
            list.add(0, fy80.m(this.f20513e.get(i), privilege));
        } else if (NullChecker.a(privilege)) {
            list.add(fy80.m(this.f20513e.get(i), privilege));
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m23324z(int i, List list, List list2, Privilege privilege) {
        if (this.f20513e.get(i) == PurchaseType.TYPE_O_DIAMOND && NullChecker.a(this.f20515g) && i < this.f20515g.size() && !list.contains(this.f20515g.get(i)) && privilege == Privilege.oDiamondSvipExtra) {
            list2.add(0, fy80.m(this.f20513e.get(i), privilege));
            return;
        }
        if (NullChecker.a(this.f20515g) && i < this.f20515g.size() && privilege == this.f20515g.get(i)) {
            list2.add(0, fy80.m(this.f20513e.get(i), privilege));
        } else if (NullChecker.a(privilege)) {
            list2.add(fy80.m(this.f20513e.get(i), privilege));
        }
    }
}
