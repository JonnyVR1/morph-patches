package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFansMyJoin;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMemberLb;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePlayModeAnchorItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class xsp extends x6s<nnn0, rtp> {

    /* JADX INFO: renamed from: j */
    public String f194296j;

    public xsp(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        this.f194296j = "";
        mo51532C(new rtp(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: d4 */
    public void m210819d4() {
        ((rtp) this.viewModel).m180822d();
    }

    /* JADX INFO: renamed from: e4 */
    public void m210820e4(ArrayList<String> arrayList, final d30 d30Var) {
        duringCreated(hrv.m132728K(arrayList)).subscribe(ffw.m121194e(new e30() { // from class: l.msp
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        }, new e30() { // from class: l.osp
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f44101D);
            }
        }));
    }

    /* JADX INFO: renamed from: f4 */
    public String m210821f4() {
        return this.f194296j;
    }

    /* JADX INFO: renamed from: g4 */
    public void m210822g4(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail, String str) {
        if (bLiveVoiceFanBaseDetail.viewType == 3) {
            lsi0.m151593w(R$string.f44226z1);
        } else {
            m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106531v(str, new C21208a(bLiveVoiceFanBaseDetail), 1, "fans_club", "join_club", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans")), m210821f4(), "source_voice_fan_base").m106529t());
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m210823h4(ArrayList<String> arrayList, final d30 d30Var) {
        duringCreated(hrv.m132731N(arrayList)).subscribe(ffw.m121194e(new e30() { // from class: l.vsp
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        }, new e30() { // from class: l.wsp
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f44101D);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public void m210825j4(String str, final d30 d30Var) {
        duringCreated(hrv.m132738U(str)).subscribe(ffw.m121194e(new e30() { // from class: l.psp
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        }, new e30() { // from class: l.qsp
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f44101D);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public void m210826k4(String str, final e30<List<BLiveVoiceMemberLb>> e30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated(hrv.m132724G(this.f194296j, str)).subscribe(ffw.m121194e(e30Var, new e30() { // from class: l.usp
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(vwb.m200324f0(new BLiveVoiceMemberLb[0]));
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void m210827l4(final e30<List<BLiveVoicePlayModeAnchorItem>> e30Var) {
        duringCreated(hrv.m132723F()).subscribe(ffw.m121194e(e30Var, new e30() { // from class: l.tsp
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(vwb.m200324f0(new BLiveVoicePlayModeAnchorItem[0]));
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public void m210828m4(String str, final boolean z) {
        duringCreated(hrv.m132722E(str)).subscribe(ffw.m121193d(new e30() { // from class: l.ssp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166235a.m210824i4(z, (BLiveVoiceFanBaseDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m210829n4(final e30<List<BLiveVoiceFansMyJoin>> e30Var) {
        duringCreated(hrv.m132725H()).subscribe(ffw.m121194e(e30Var, new e30() { // from class: l.nsp
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(vwb.m200324f0(new BLiveVoiceFansMyJoin[0]));
            }
        }));
    }

    /* JADX INFO: renamed from: o4, reason: merged with bridge method [inline-methods] */
    public final void m210824i4(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail, boolean z) {
        if (z && ((rtp) this.viewModel).m180820b()) {
            return;
        }
        int i = bLiveVoiceFanBaseDetail.viewType;
        if (i == 2) {
            ((rtp) this.viewModel).m180824f(bLiveVoiceFanBaseDetail);
            return;
        }
        if (i == 1) {
            ((rtp) this.viewModel).m180827k(bLiveVoiceFanBaseDetail);
        } else if (i == 0 || i == 3) {
            ((rtp) this.viewModel).m180825i(bLiveVoiceFanBaseDetail);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public boolean m210831p4(String str) {
        if (!TextUtils.equals(str, this.f194296j)) {
            ((rtp) this.viewModel).m180822d();
        }
        this.f194296j = str;
        m210828m4(str, false);
        return true;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().FansClubEvent.showVoiceFansClubDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.rsp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160883a.m210831p4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l.xsp$a */
    public class C21208a implements zfv.C21687a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveVoiceFanBaseDetail f194297a;

        public C21208a(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
            this.f194297a = bLiveVoiceFanBaseDetail;
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            ((rtp) xsp.this.viewModel).m180826j(this.f194297a);
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
        }
    }
}
