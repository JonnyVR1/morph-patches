package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveCallInvite;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class rzp extends i6t<oo2, tzp> {

    /* JADX INFO: renamed from: i */
    public r2s f165562i;

    public rzp(dum dumVar, r2s r2sVar) {
        super(dumVar);
        this.f165562i = r2sVar;
        mo52715C(new tzp());
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ Boolean m183822R3(String str, d3q d3qVar) {
        return d3qVar instanceof hzp ? Boolean.valueOf(TextUtils.equals(((hzp) d3qVar).m137911K().f56859id, str)) : Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m183824c4(vxj0 vxj0Var) {
        m183825e4();
    }

    /* JADX INFO: renamed from: e4 */
    private void m183825e4() {
        ((tzp) this.viewModel).m193693j();
        m183829V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.oo2] */
    /* JADX INFO: renamed from: f4 */
    public void m183826f4(String str) {
        ((tzp) this.viewModel).m193690d();
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(4400).userId(str).setSource("live").setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, str, 4400)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, str, 4400)).setScene("call").trackFrom("liveRoom").build());
    }

    /* JADX INFO: renamed from: T3 */
    public final List<d3q<?>> m183827T3(final wzp wzpVar) {
        return jyb.m147486Q(wzpVar.m208739c(), new qcj() { // from class: l.lzp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f134248a.m183831X3(wzpVar, (BLiveCallInvite) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: U3 */
    public final void m183828U3(final String str) {
        duringCreated(LivingNormalApiProvider.m72483O3(m213810E2().m202191k(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.ozp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149940a.m183832Y3(str, (BLiveCallInvite) obj);
            }
        }, new y20() { // from class: l.pzp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154945a.m183833Z3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: V3 */
    public final void m183829V3() {
        duringCreated(LivingNormalApiProvider.m72501Q3(m213810E2().m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.jzp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123281a.m183834a4((wzp) obj);
            }
        }, new y20() { // from class: l.kzp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129440a.m183835b4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final hzp m183830W3(final String str) {
        d3q d3qVar = (d3q) jyb.m147529r(((tzp) this.viewModel).m193691e(), new qcj() { // from class: l.qzp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rzp.m183822R3(str, (d3q) obj);
            }
        });
        if (d3qVar != null) {
            return (hzp) d3qVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ d3q m183831X3(wzp wzpVar, BLiveCallInvite bLiveCallInvite) {
        return new hzp(bLiveCallInvite, wzpVar.m208738b(bLiveCallInvite.f45192to)).m137913Q(new y20() { // from class: l.mzp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139539a.m183828U3((String) obj);
            }
        }).m137914R(new y20() { // from class: l.nzp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144463a.m183826f4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m183833Z3(Throwable th) {
        this.f165562i.m161644V3(th);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m183835b4(Throwable th) {
        this.f165562i.m161644V3(th);
    }

    /* JADX INFO: renamed from: d4, reason: merged with bridge method [inline-methods] */
    public final void m183834a4(wzp wzpVar) {
        ((tzp) this.viewModel).m193692i(m183827T3(wzpVar));
    }

    /* JADX INFO: renamed from: g4, reason: merged with bridge method [inline-methods] */
    public final void m183832Y3(String str, BLiveCallInvite bLiveCallInvite) {
        hzp hzpVarM183830W3 = m183830W3(str);
        if (hzpVarM183830W3 != null) {
            hzpVarM183830W3.m137915S(bLiveCallInvite);
            ((tzp) this.viewModel).m193694k(hzpVarM183830W3);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().CallEvent.anchorInviteAudience().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.izp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117731a.m183824c4((vxj0) obj);
            }
        }));
    }
}
