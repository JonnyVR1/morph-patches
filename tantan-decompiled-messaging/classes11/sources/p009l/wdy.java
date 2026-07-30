package p009l;

import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.lsi0;
import l.nnn0;
import l.vud0;
import l.vwb;
import l.w9j;
import p009l.pdy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wdy<D extends nnn0, VM extends pdy> extends gay<D, VM> {

    /* JADX INFO: renamed from: j */
    public List<BLiveVoiceSettle> f22064j;

    public wdy(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        this.f22064j = new ArrayList();
        C(vm);
    }

    /* JADX INFO: renamed from: j4 */
    private void m24131j4() {
        duringCreated(LivingNormalApiProvider.P5(E2().o())).subscribe(ffw.e(new e30() { // from class: l.udy
            public final void call(Object obj) {
                this.f21093a.m24138i4((List) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: P3 */
    public void m24132P3() {
        super.P3();
        init();
    }

    @Override // p009l.gay
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public vay mo13819S3() {
        return new vay("入驻申请", ((pdy) ((bwr) this).viewModel).m20180c(), 2);
    }

    @Override // p009l.gay
    /* JADX INFO: renamed from: T3 */
    public int mo13820T3() {
        return 2;
    }

    @Override // p009l.gay
    /* JADX INFO: renamed from: V3 */
    public void mo13822V3() {
        m24131j4();
    }

    /* JADX INFO: renamed from: d4 */
    public final void m24133d4(final Boolean bool, final String str) {
        hby.m15515a(bool.booleanValue(), E2().p(), ((DbObject) E2().l0()).id, E2().k(), "management_host");
        duringCreated(LivingNormalApiProvider.I3(E2().o(), str, bool)).subscribe(ffw.e(new e30() { // from class: l.tdy
            public final void call(Object obj) {
                this.f20629a.m24134e4(bool, str, (String) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m24134e4(Boolean bool, final String str, String str2) {
        lsi0.y(bool.booleanValue() ? "已同意该申请" : "已拒绝该申请");
        BLiveVoiceSettle bLiveVoiceSettle = (BLiveVoiceSettle) vwb.r(this.f22064j, new w9j() { // from class: l.vdy
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceSettle) obj).userId.equals(str));
            }
        });
        int iIndexOf = this.f22064j.indexOf(bLiveVoiceSettle);
        List<BLiveVoiceSettle> listC0 = vwb.c0(this.f22064j, bLiveVoiceSettle);
        this.f22064j = listC0;
        ((pdy) ((bwr) this).viewModel).m20182e(iIndexOf, listC0);
        ((pdy) ((bwr) this).viewModel).m20179b(Boolean.valueOf(this.f22064j.size() < 2));
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m24135f4(BLiveVoiceSettle bLiveVoiceSettle) {
        m14852W3(bLiveVoiceSettle.userId);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m24136g4(BLiveVoiceSettle bLiveVoiceSettle) {
        m24133d4(Boolean.TRUE, bLiveVoiceSettle.userId);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m24137h4(BLiveVoiceSettle bLiveVoiceSettle) {
        m24133d4(Boolean.FALSE, bLiveVoiceSettle.userId);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m24138i4(List list) {
        this.f22064j = list;
        ((pdy) ((bwr) this).viewModel).m20179b(Boolean.valueOf(vwb.J(list)));
        ((pdy) ((bwr) this).viewModel).m20183f(this.f22064j);
    }

    public void init() {
        ((pdy) ((bwr) this).viewModel).m20181d(this, new e30() { // from class: l.qdy
            public final void call(Object obj) {
                this.f19167a.m24135f4((BLiveVoiceSettle) obj);
            }
        }, new e30() { // from class: l.rdy
            public final void call(Object obj) {
                this.f19781a.m24136g4((BLiveVoiceSettle) obj);
            }
        }, new e30() { // from class: l.sdy
            public final void call(Object obj) {
                this.f20207a.m24137h4((BLiveVoiceSettle) obj);
            }
        });
        m24131j4();
    }
}
