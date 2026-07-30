package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.core.p004ui.vip.VipAct;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.VipFrag;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import java.util.ArrayList;
import l.d21;
import l.e30;
import l.gq30;
import l.jq2;
import l.km80;
import l.mkd0;
import l.n3b0;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x9j;
import l.zl80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ahl0 extends jq2<ihl0> {

    /* JADX INFO: renamed from: b */
    public static final ArrayList<PurchaseType> f8264b = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public final VipFrag f8265a;

    public ahl0(VipFrag vipFrag) {
        super(vipFrag);
        this.f8265a = vipFrag;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m11836l0(Boolean bool) {
    }

    /* JADX INFO: renamed from: o0 */
    public static PurchaseType m11838o0(int i) {
        ArrayList<PurchaseType> arrayList = f8264b;
        if (i >= arrayList.size() || i < 0) {
            return null;
        }
        return arrayList.get(i);
    }

    /* JADX INFO: renamed from: p0 */
    public static int m11839p0(PurchaseType purchaseType) {
        return gkl0.m15837s0(purchaseType);
    }

    /* JADX INFO: renamed from: q0 */
    public static ArrayList<PurchaseType> m11840q0() {
        ArrayList<PurchaseType> arrayList = f8264b;
        if (vwb.J(arrayList)) {
            m11841r0();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m11841r0() {
        ArrayList<PurchaseType> arrayList = f8264b;
        if (vwb.J(arrayList)) {
            if (g6a.m15603z()) {
                arrayList.add(PurchaseType.TYPE_YOUTH_VIP);
            }
            if (g6a.m15588k()) {
                arrayList.add(PurchaseType.TYPE_FEMALE_VIP);
            }
            arrayList.add(PurchaseType.TYPE_GET_VIP);
            arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m11842t0(PurchaseType purchaseType, int i) {
        ArrayList<PurchaseType> arrayList = f8264b;
        return i < arrayList.size() && i >= 0 && arrayList.get(i) == purchaseType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m11843u0(c cVar) {
        if (cVar == c.i) {
            m11846A0();
            CoreModule.f1534c.f3544C0.m27420u4();
            CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
            CoreModule.f1534c.f3647k1.m23842A3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m11844x0(roj0 roj0Var) {
        m11846A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ rx.c m11845y0() {
        return act() instanceof VipAct ? ((VipAct) act()).f6761i : rx.c.just("");
    }

    /* JADX INFO: renamed from: A0 */
    public final void m11846A0() {
        if (n3b0.q()) {
            return;
        }
        CoreLikers coreLikers = CoreModule.f1534c.f3676u0;
        coreLikers.m2347V6(null, ((Long) coreLikers.f3243k0.get()).longValue(), 0, "");
    }

    /* JADX INFO: renamed from: Z */
    public void m11847Z() {
        super.Z();
        CoreModule.f1534c.f3643j0.m2521K5();
    }

    /* JADX INFO: renamed from: a0 */
    public void m11848a0() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.rgl0
            public final void call(Object obj) {
                this.f20545a.m11843u0((c) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3652m0.m3040h9()).subscribe(mkd0.G(new e30() { // from class: l.sgl0
            public final void call(Object obj) {
                this.f21301a.m11844x0((roj0) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.tgl0
            public final Object call() {
                return this.f22101a.m11845y0();
            }
        }).filter(new w9j() { // from class: l.ugl0
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.vgl0
            public final void call(Object obj) {
                this.f24314a.m11851z0((String) obj);
            }
        }));
        m11850s0();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m11849n0() {
        act().startActivity(AccessTokenWebViewAct.Z1(act(), d21.b() ? d21.a() : act().getString(R$string.f3006vs), IntlCountryCodeController.m21v() ? "https://feedback.tantanapp.com/feedback-mobile?locale=us" : C0154a.m3154M(act().getString(R$string.f2360ao))));
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m11850s0() {
        duringCreated(rx.c.combineLatest(CoreModule.f1534c.f3628e0.m21486o9().map(new gq30()).distinctUntilChanged(), CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.xgl0
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m27355L3());
            }
        }).distinctUntilChanged(), new x9j() { // from class: l.ygl0
            public final Object call(Object obj, Object obj2) {
                return roj0.a;
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.zgl0
            public final void call(Object obj) {
                src0.m24159r().m24170J();
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m11851z0(String str) {
        if (act() instanceof VipAct) {
            ((VipAct) act()).f6761i.onNext("");
        }
        if (str.endsWith("/buy")) {
            String str2 = str.split("/")[0];
            PurchaseType purchaseTypeM18124b = khl0.m18124b(str2);
            if (!"vip".equals(str2)) {
                purchaseTypeM18124b = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            } else if (purchaseTypeM18124b == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                purchaseTypeM18124b = PurchaseType.TYPE_GET_VIP;
            }
            if (vwb.J(zl80.g().d(false))) {
                ((ihl0) ((jq2) this).viewModel).m16672F(purchaseTypeM18124b);
            } else {
                km80.h0(act(), new e30() { // from class: l.wgl0
                    public final void call(Object obj) {
                        ahl0.m11836l0((Boolean) obj);
                    }
                }, zl80.g().d(true), "p_promotion,callback_assistant", (Object) null);
            }
        }
    }

    public void destroy() {
    }
}
