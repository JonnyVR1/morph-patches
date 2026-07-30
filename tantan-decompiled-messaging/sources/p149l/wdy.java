package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.ArrayList;
import java.util.List;
import p149l.nnn0;
import p149l.pdy;

/* JADX INFO: loaded from: classes11.dex */
public class wdy<D extends nnn0, VM extends pdy> extends gay<D, VM> {

    /* JADX INFO: renamed from: j */
    public List<BLiveVoiceSettle> f185895j;

    public wdy(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        this.f185895j = new ArrayList();
        mo51532C(vm);
    }

    /* JADX INFO: renamed from: j4 */
    private void m202822j4() {
        duringCreated(LivingNormalApiProvider.m71311P5(m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.udy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175976a.m202828i4((List) obj);
            }
        }, new vud0()));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.gay
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public vay mo115766S3() {
        return new vay("入驻申请", ((pdy) this.viewModel).m168446c(), 2);
    }

    @Override // p149l.gay
    /* JADX INFO: renamed from: T3 */
    public int mo115767T3() {
        return 2;
    }

    @Override // p149l.gay
    /* JADX INFO: renamed from: V3 */
    public void mo115769V3() {
        m202822j4();
    }

    /* JADX INFO: renamed from: d4 */
    public final void m202823d4(final Boolean bool, final String str) {
        hby.m130353a(bool.booleanValue(), m206027E2().mo97490p(), m206027E2().m132146l0().f56011id, m206027E2().m149814k(), "management_host");
        duringCreated(LivingNormalApiProvider.m71246I3(m206027E2().m149818o(), str, bool)).subscribe(ffw.m121194e(new e30() { // from class: l.tdy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169781a.m202824e4(bool, str, (String) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m202824e4(Boolean bool, final String str, String str2) {
        lsi0.m151595y(bool.booleanValue() ? "已同意该申请" : "已拒绝该申请");
        BLiveVoiceSettle bLiveVoiceSettle = (BLiveVoiceSettle) vwb.m200346r(this.f185895j, new w9j() { // from class: l.vdy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceSettle) obj).userId.equals(str));
            }
        });
        int iIndexOf = this.f185895j.indexOf(bLiveVoiceSettle);
        List<BLiveVoiceSettle> listM200318c0 = vwb.m200318c0(this.f185895j, bLiveVoiceSettle);
        this.f185895j = listM200318c0;
        ((pdy) this.viewModel).m168448e(iIndexOf, listM200318c0);
        ((pdy) this.viewModel).m168445b(Boolean.valueOf(this.f185895j.size() < 2));
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m202825f4(BLiveVoiceSettle bLiveVoiceSettle) {
        m125041W3(bLiveVoiceSettle.userId);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m202826g4(BLiveVoiceSettle bLiveVoiceSettle) {
        m202823d4(Boolean.TRUE, bLiveVoiceSettle.userId);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m202827h4(BLiveVoiceSettle bLiveVoiceSettle) {
        m202823d4(Boolean.FALSE, bLiveVoiceSettle.userId);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m202828i4(List list) {
        this.f185895j = list;
        ((pdy) this.viewModel).m168445b(Boolean.valueOf(vwb.m200296J(list)));
        ((pdy) this.viewModel).m168449f(this.f185895j);
    }

    public void init() {
        ((pdy) this.viewModel).m168447d(this, new e30() { // from class: l.qdy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153978a.m202825f4((BLiveVoiceSettle) obj);
            }
        }, new e30() { // from class: l.rdy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159017a.m202826g4((BLiveVoiceSettle) obj);
            }
        }, new e30() { // from class: l.sdy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163919a.m202827h4((BLiveVoiceSettle) obj);
            }
        });
        m202822j4();
    }
}
