package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import java.util.ArrayList;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class eql0 extends ar2<mql0> {

    /* JADX INFO: renamed from: b */
    public static final ArrayList<PurchaseType> f95349b = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public final VipFrag f95350a;

    public eql0(VipFrag vipFrag) {
        super(vipFrag);
        this.f95350a = vipFrag;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m121934l0(Boolean bool) {
    }

    /* JADX INFO: renamed from: o0 */
    public static PurchaseType m121936o0(int i) {
        ArrayList<PurchaseType> arrayList = f95349b;
        if (i >= arrayList.size() || i < 0) {
            return null;
        }
        return arrayList.get(i);
    }

    /* JADX INFO: renamed from: p0 */
    public static int m121937p0(PurchaseType purchaseType) {
        return ktl0.m151380s0(purchaseType);
    }

    /* JADX INFO: renamed from: q0 */
    public static ArrayList<PurchaseType> m121938q0() {
        ArrayList<PurchaseType> arrayList = f95349b;
        if (jyb.m147479J(arrayList)) {
            m121939r0();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m121939r0() {
        ArrayList<PurchaseType> arrayList = f95349b;
        if (jyb.m147479J(arrayList)) {
            if (s7a.m184997z()) {
                arrayList.add(PurchaseType.TYPE_YOUTH_VIP);
            }
            if (s7a.m184982k()) {
                arrayList.add(PurchaseType.TYPE_FEMALE_VIP);
            }
            arrayList.add(PurchaseType.TYPE_GET_VIP);
            arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m121940t0(PurchaseType purchaseType, int i) {
        ArrayList<PurchaseType> arrayList = f95349b;
        return i < arrayList.size() && i >= 0 && arrayList.get(i) == purchaseType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m121941u0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m121944A0();
            CoreModule.f18264c.f20297C0.m146425v4();
            CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            CoreModule.f18264c.f20400k1.m121123A3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m121942x0(uxj0 uxj0Var) {
        m121944A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ C22421c m121943y0() {
        return act() instanceof VipAct ? ((VipAct) act()).f37828i : C22421c.just("");
    }

    /* JADX INFO: renamed from: A0 */
    public final void m121944A0() {
        if (rbb0.m180744q()) {
            return;
        }
        CoreLikers coreLikers = CoreModule.f18264c.f20429u0;
        coreLikers.m31429Z6(null, coreLikers.f19996l0.get().longValue(), 0, "");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        CoreModule.f18264c.f20396j0.m31596K5();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.vpl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185269a.m121941u0((C4470c) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.m32113h9()).subscribe(psd0.m173596G(new y20() { // from class: l.wpl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190317a.m121942x0((uxj0) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.xpl0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f195716a.m121943y0();
            }
        }).filter(new qcj() { // from class: l.ypl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.zpl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205478a.m121947z0((String) obj);
            }
        }));
        m121946s0();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m121945n0() {
        act().startActivity(AccessTokenWebViewAct.m81333a2(act(), k21.m147938b() ? k21.m147937a() : act().getString(R$string.f18835Rs), IntlCountryCodeController.m29125v() ? "https://feedback.tantanapp.com/feedback-mobile?locale=us" : C4879a.m32227M(act().getString(R$string.f19811xo))));
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m121946s0() {
        duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116596o9().map(new uy30()).distinctUntilChanged(), CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.bql0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146361M3());
            }
        }).distinctUntilChanged(), new rcj() { // from class: l.cql0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return uxj0.f181467a;
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.dql0
            @Override // p153l.y20
            public final void call(Object obj) {
                xzc0.m213720r().m213731J();
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m121947z0(String str) {
        if (act() instanceof VipAct) {
            ((VipAct) act()).f37828i.onNext("");
        }
        if (str.endsWith("/buy")) {
            String str2 = str.split("/")[0];
            PurchaseType purchaseTypeM168818b = oql0.m168818b(str2);
            if (!"vip".equals(str2)) {
                purchaseTypeM168818b = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            } else if (purchaseTypeM168818b == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                purchaseTypeM168818b = PurchaseType.TYPE_GET_VIP;
            }
            if (jyb.m147479J(du80.m118106g().m118111d(false))) {
                ((mql0) this.viewModel).m159531F(purchaseTypeM168818b);
            } else {
                ou80.m169253h0(act(), new y20() { // from class: l.aql0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        eql0.m121934l0((Boolean) obj);
                    }
                }, du80.m118106g().m118111d(true), "p_promotion,callback_assistant", null);
            }
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
