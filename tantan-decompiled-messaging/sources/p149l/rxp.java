package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveCallInvite;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class rxp extends h4t<ho2, txp> {

    /* JADX INFO: renamed from: i */
    public q0s f161493i;

    public rxp(bsm bsmVar, q0s q0sVar) {
        super(bsmVar);
        this.f161493i = q0sVar;
        mo51532C(new txp());
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ Boolean m181625R3(String str, d1q d1qVar) {
        return d1qVar instanceof hxp ? Boolean.valueOf(TextUtils.equals(((hxp) d1qVar).m133362K().f56011id, str)) : Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m181627c4(soj0 soj0Var) {
        m181628e4();
    }

    /* JADX INFO: renamed from: e4 */
    private void m181628e4() {
        ((txp) this.viewModel).m190972j();
        m181632V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.ho2] */
    /* JADX INFO: renamed from: f4 */
    public void m181629f4(String str) {
        ((txp) this.viewModel).m190969d();
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(4400).userId(str).setSource("live").setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, str, 4400)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, str, 4400)).setScene("call").trackFrom("liveRoom").build());
    }

    /* JADX INFO: renamed from: T3 */
    public final List<d1q<?>> m181630T3(final wxp wxpVar) {
        return vwb.m200303Q(wxpVar.m206022c(), new w9j() { // from class: l.lxp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f130423a.m181634X3(wxpVar, (BLiveCallInvite) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: U3 */
    public final void m181631U3(final String str) {
        duringCreated(LivingNormalApiProvider.m71300O3(m206027E2().m149814k(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.oxp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146231a.m181635Y3(str, (BLiveCallInvite) obj);
            }
        }, new e30() { // from class: l.pxp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151713a.m181636Z3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: V3 */
    public final void m181632V3() {
        duringCreated(LivingNormalApiProvider.m71318Q3(m206027E2().m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.jxp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120239a.m181637a4((wxp) obj);
            }
        }, new e30() { // from class: l.kxp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125151a.m181638b4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final hxp m181633W3(final String str) {
        d1q d1qVar = (d1q) vwb.m200346r(((txp) this.viewModel).m190970e(), new w9j() { // from class: l.qxp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rxp.m181625R3(str, (d1q) obj);
            }
        });
        if (d1qVar != null) {
            return (hxp) d1qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ d1q m181634X3(wxp wxpVar, BLiveCallInvite bLiveCallInvite) {
        return new hxp(bLiveCallInvite, wxpVar.m206021b(bLiveCallInvite.f44344to)).m133364Q(new e30() { // from class: l.mxp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136192a.m181631U3((String) obj);
            }
        }).m133365R(new e30() { // from class: l.nxp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141038a.m181629f4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m181636Z3(Throwable th) {
        this.f161493i.m162527V3(th);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m181638b4(Throwable th) {
        this.f161493i.m162527V3(th);
    }

    /* JADX INFO: renamed from: d4, reason: merged with bridge method [inline-methods] */
    public final void m181637a4(wxp wxpVar) {
        ((txp) this.viewModel).m190971i(m181630T3(wxpVar));
    }

    /* JADX INFO: renamed from: g4, reason: merged with bridge method [inline-methods] */
    public final void m181635Y3(String str, BLiveCallInvite bLiveCallInvite) {
        hxp hxpVarM181633W3 = m181633W3(str);
        if (hxpVarM181633W3 != null) {
            hxpVarM181633W3.m133366S(bLiveCallInvite);
            ((txp) this.viewModel).m190973k(hxpVarM181633W3);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().CallEvent.anchorInviteAudience().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ixp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115387a.m181627c4((soj0) obj);
            }
        }));
    }
}
