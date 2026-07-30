package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFanBaseDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFansMyJoin;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMemberLb;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePlayModeAnchorItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class xup extends y8s<rwn0, rvp> {

    /* JADX INFO: renamed from: j */
    public String f196302j;

    public xup(dum<? extends rwn0> dumVar) {
        super(dumVar);
        this.f196302j = "";
        mo52715C(new rvp(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: d4 */
    public void m213172d4() {
        ((rvp) this.viewModel).m183299d();
    }

    /* JADX INFO: renamed from: e4 */
    public void m213173e4(ArrayList<String> arrayList, final x20 x20Var) {
        duringCreated(itv.m142087K(arrayList)).subscribe(dhw.m115826e(new y20() { // from class: l.mup
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        }, new y20() { // from class: l.oup
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f44949D);
            }
        }));
    }

    /* JADX INFO: renamed from: f4 */
    public String m213174f4() {
        return this.f196302j;
    }

    /* JADX INFO: renamed from: g4 */
    public void m213175g4(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail, String str) {
        if (bLiveVoiceFanBaseDetail.viewType == 3) {
            o1j0.m165649w(R$string.f45074z1);
        } else {
            m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136085v(str, new C21450a(bLiveVoiceFanBaseDetail), 1, "fans_club", "join_club", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans")), m213174f4(), "source_voice_fan_base").m136083t());
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m213176h4(ArrayList<String> arrayList, final x20 x20Var) {
        duringCreated(itv.m142090N(arrayList)).subscribe(dhw.m115826e(new y20() { // from class: l.vup
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        }, new y20() { // from class: l.wup
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f44949D);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public void m213178j4(String str, final x20 x20Var) {
        duringCreated(itv.m142097U(str)).subscribe(dhw.m115826e(new y20() { // from class: l.pup
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        }, new y20() { // from class: l.qup
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f44949D);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public void m213179k4(String str, final y20<List<BLiveVoiceMemberLb>> y20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated(itv.m142083G(this.f196302j, str)).subscribe(dhw.m115826e(y20Var, new y20() { // from class: l.uup
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(jyb.m147507f0(new BLiveVoiceMemberLb[0]));
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void m213180l4(final y20<List<BLiveVoicePlayModeAnchorItem>> y20Var) {
        duringCreated(itv.m142082F()).subscribe(dhw.m115826e(y20Var, new y20() { // from class: l.tup
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(jyb.m147507f0(new BLiveVoicePlayModeAnchorItem[0]));
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public void m213181m4(String str, final boolean z) {
        duringCreated(itv.m142081E(str)).subscribe(dhw.m115825d(new y20() { // from class: l.sup
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170705a.m213177i4(z, (BLiveVoiceFanBaseDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m213182n4(final y20<List<BLiveVoiceFansMyJoin>> y20Var) {
        duringCreated(itv.m142084H()).subscribe(dhw.m115826e(y20Var, new y20() { // from class: l.nup
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(jyb.m147507f0(new BLiveVoiceFansMyJoin[0]));
            }
        }));
    }

    /* JADX INFO: renamed from: o4, reason: merged with bridge method [inline-methods] */
    public final void m213177i4(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail, boolean z) {
        if (z && ((rvp) this.viewModel).m183297b()) {
            return;
        }
        int i = bLiveVoiceFanBaseDetail.viewType;
        if (i == 2) {
            ((rvp) this.viewModel).m183301f(bLiveVoiceFanBaseDetail);
            return;
        }
        if (i == 1) {
            ((rvp) this.viewModel).m183304k(bLiveVoiceFanBaseDetail);
        } else if (i == 0 || i == 3) {
            ((rvp) this.viewModel).m183302i(bLiveVoiceFanBaseDetail);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public boolean m213184p4(String str) {
        if (!TextUtils.equals(str, this.f196302j)) {
            ((rvp) this.viewModel).m183299d();
        }
        this.f196302j = str;
        m213181m4(str, false);
        return true;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().FansClubEvent.showVoiceFansClubDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.rup
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164929a.m213184p4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l.xup$a */
    public class C21450a implements aiv.C15716a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveVoiceFanBaseDetail f196303a;

        public C21450a(BLiveVoiceFanBaseDetail bLiveVoiceFanBaseDetail) {
            this.f196303a = bLiveVoiceFanBaseDetail;
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            ((rvp) xup.this.viewModel).m183303j(this.f196303a);
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
        }
    }
}
