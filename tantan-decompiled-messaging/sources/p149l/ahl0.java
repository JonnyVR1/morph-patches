package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.VipFrag;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import java.util.ArrayList;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class ahl0 extends jq2<ihl0> {

    /* JADX INFO: renamed from: b */
    public static final ArrayList<PurchaseType> f69614b = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public final VipFrag f69615a;

    public ahl0(VipFrag vipFrag) {
        super(vipFrag);
        this.f69615a = vipFrag;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m96498l0(Boolean bool) {
    }

    /* JADX INFO: renamed from: o0 */
    public static PurchaseType m96500o0(int i) {
        ArrayList<PurchaseType> arrayList = f69614b;
        if (i >= arrayList.size() || i < 0) {
            return null;
        }
        return arrayList.get(i);
    }

    /* JADX INFO: renamed from: p0 */
    public static int m96501p0(PurchaseType purchaseType) {
        return gkl0.m126655s0(purchaseType);
    }

    /* JADX INFO: renamed from: q0 */
    public static ArrayList<PurchaseType> m96502q0() {
        ArrayList<PurchaseType> arrayList = f69614b;
        if (vwb.m200296J(arrayList)) {
            m96503r0();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m96503r0() {
        ArrayList<PurchaseType> arrayList = f69614b;
        if (vwb.m200296J(arrayList)) {
            if (g6a.m124577z()) {
                arrayList.add(PurchaseType.TYPE_YOUTH_VIP);
            }
            if (g6a.m124562k()) {
                arrayList.add(PurchaseType.TYPE_FEMALE_VIP);
            }
            arrayList.add(PurchaseType.TYPE_GET_VIP);
            arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m96504t0(PurchaseType purchaseType, int i) {
        ArrayList<PurchaseType> arrayList = f69614b;
        return i < arrayList.size() && i >= 0 && arrayList.get(i) == purchaseType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m96505u0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m96508A0();
            CoreModule.f17545c.f19555C0.m210112u4();
            CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            CoreModule.f17545c.f19658k1.m184462A3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m96506x0(roj0 roj0Var) {
        m96508A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ C22306c m96507y0() {
        return act() instanceof VipAct ? ((VipAct) act()).f36980i : C22306c.just("");
    }

    /* JADX INFO: renamed from: A0 */
    public final void m96508A0() {
        if (n3b0.m157742q()) {
            return;
        }
        CoreLikers coreLikers = CoreModule.f17545c.f19687u0;
        coreLikers.m30419V6(null, coreLikers.f19254k0.get().longValue(), 0, "");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        CoreModule.f17545c.f19654j0.m30593K5();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.rgl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159266a.m96505u0((C4319c) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.m31110h9()).subscribe(mkd0.m154955G(new e30() { // from class: l.sgl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164451a.m96506x0((roj0) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.tgl0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f170103a.m96507y0();
            }
        }).filter(new w9j() { // from class: l.ugl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.vgl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181380a.m96511z0((String) obj);
            }
        }));
        m96510s0();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m96509n0() {
        act().startActivity(AccessTokenWebViewAct.m80150Z1(act(), d21.m109703b() ? d21.m109702a() : act().getString(R$string.f19017vs), IntlCountryCodeController.m28126v() ? "https://feedback.tantanapp.com/feedback-mobile?locale=us" : C4728a.m31224M(act().getString(R$string.f18371ao))));
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m96510s0() {
        duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169523o9().map(new gq30()).distinctUntilChanged(), CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.xgl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210047L3());
            }
        }).distinctUntilChanged(), new x9j() { // from class: l.ygl0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return roj0.f160388a;
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.zgl0
            @Override // p149l.e30
            public final void call(Object obj) {
                src0.m185656r().m185667J();
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m96511z0(String str) {
        if (act() instanceof VipAct) {
            ((VipAct) act()).f36980i.onNext("");
        }
        if (str.endsWith("/buy")) {
            String str2 = str.split("/")[0];
            PurchaseType purchaseTypeM145976b = khl0.m145976b(str2);
            if (!"vip".equals(str2)) {
                purchaseTypeM145976b = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            } else if (purchaseTypeM145976b == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                purchaseTypeM145976b = PurchaseType.TYPE_GET_VIP;
            }
            if (vwb.m200296J(zl80.m219252g().m219257d(false))) {
                ((ihl0) this.viewModel).m136224F(purchaseTypeM145976b);
            } else {
                km80.m146459h0(act(), new e30() { // from class: l.wgl0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ahl0.m96498l0((Boolean) obj);
                    }
                }, zl80.m219252g().m219257d(true), "p_promotion,callback_assistant", null);
            }
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
