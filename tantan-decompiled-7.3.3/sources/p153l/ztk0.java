package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ztk0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public final fuk0 f206016i;

    /* JADX INFO: renamed from: j */
    public final hrk0.C17565b f206017j;

    /* JADX INFO: renamed from: k */
    public r1n0 f206018k;

    /* JADX INFO: renamed from: l */
    public z20<Integer, Object> f206019l;

    /* JADX INFO: renamed from: m */
    public vmp0 f206020m;

    /* JADX INFO: renamed from: n */
    public boolean f206021n;

    public ztk0(dum dumVar) {
        super(dumVar);
        this.f206019l = new qtk0(this);
        this.f206017j = new hrk0.C17565b();
        this.f206020m = (vmp0) m153103z2(new vmp0(dumVar));
        this.f206016i = (fuk0) m153103z2(new fuk0(dumVar, this));
        m153103z2(new a1n0(dumVar, this));
        m153103z2(new kym0(dumVar, this));
    }

    /* JADX INFO: renamed from: O3 */
    public void m221546O3(ezm0 ezm0Var) {
        r1n0 r1n0Var = this.f206018k;
        if (r1n0Var != null) {
            r1n0Var.m179428J3(ezm0Var);
        }
        this.f206017j.m136890b(ezm0Var);
    }

    /* JADX INFO: renamed from: P3 */
    public void m221547P3(BLiveVoiceCall bLiveVoiceCall) {
        r1n0 r1n0Var = this.f206018k;
        if (r1n0Var != null) {
            r1n0Var.m179429K3(bLiveVoiceCall);
        }
        this.f206017j.m136891c(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: R3 */
    public z20<Integer, Object> m221548R3() {
        return this.f206019l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public String mo169115S3() {
        return ((rwn0) m213810E2()).m202194o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((h0m) m138856F3(new z310(3400))).mo133184c(new qtk0(this));
        ((rwn0) m213810E2()).m183399H2(this.f206017j);
        m113231o2(((rwn0) m213810E2()).m183424Z2(), false).subscribe(dhw.m115825d(new y20() { // from class: l.rtk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164823a.mo169116T3((BLiveVoiceCall) obj);
            }
        }));
        duringCreated(m213811F2().VoiceCallEvent.leaveVoiceEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.stk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170587a.m221550Y3((bzm0) obj);
            }
        }));
        f5y.m124260a(act(), f5y.f97353a);
    }

    /* JADX INFO: renamed from: T3 */
    public abstract void mo169116T3(BLiveVoiceCall bLiveVoiceCall);

    /* JADX INFO: renamed from: U3 */
    public void mo197623U3(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: V3 */
    public abstract void mo169117V3();

    /* JADX INFO: renamed from: X3, reason: merged with bridge method [inline-methods] */
    public void m221552a4(BLiveVoiceCall bLiveVoiceCall) {
        this.f206016i.m127511M3(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m221550Y3(bzm0 bzm0Var) {
        m221553b4(bzm0Var, bzm0Var.f79153g);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m221551Z3(List list) {
        m221556f4((BLiveVoiceCall) list.get(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public void m221553b4(bzm0 bzm0Var, String str) {
        BLiveVoiceCall bLiveVoiceCall = bzm0Var.f79151e;
        if (bLiveVoiceCall == null || TextUtils.isEmpty(bLiveVoiceCall.f45333id) || guk0.m132327f(bLiveVoiceCall)) {
            return;
        }
        if (wft.m206159b(3) || !((rwn0) m213810E2()).m183429e3()) {
            duringCreated(VCallApiProvider.hangUpVoiceCall(bLiveVoiceCall.f45333id, m213815L2(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.vtk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f185730a.m221551Z3((List) obj);
                }
            }, new wnt()));
        }
    }

    /* JADX INFO: renamed from: c4 */
    public abstract void mo169119c4(BLiveVoiceCall bLiveVoiceCall);

    /* JADX INFO: renamed from: d4 */
    public void m221554d4(Integer num, Object obj) {
        if (1 != num.intValue()) {
            StringBuilder sb = new StringBuilder("onEngineCallback ");
            sb.append(at2.m100018b(num.intValue()));
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(obj == null ? "" : obj.toString());
            nsh0.m164608j("[voice][call]", sb.toString());
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            BLiveCallVolume bLiveCallVolume = (BLiveCallVolume) obj;
            m221562n4(bLiveCallVolume);
            this.f206020m.m201767M3(bLiveCallVolume);
        } else {
            if (iIntValue == 2) {
                m221558h4(String.valueOf(obj), new y20() { // from class: l.wtk0
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        this.f190792a.m221563p4((BLiveRtcToken) obj2);
                    }
                });
                return;
            }
            if (iIntValue != 3) {
                if (iIntValue != 4) {
                    return;
                }
                this.f206021n = true;
                mo169117V3();
                return;
            }
            this.f206016i.m127516S3(String.valueOf(obj));
            mo169118W3(String.valueOf(obj));
            m213811F2().VoiceCallEvent.enterRtcCallback().m199277p();
            this.f206021n = false;
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m221555e4(final BLiveVoiceCall bLiveVoiceCall) {
        nsh0.m164608j("[voice][call]", "rejoinRtcRoom");
        if (this.f206021n) {
            nsh0.m164608j("[voice][call]", "rejoinRtcRoom because push error");
            ((xzl) m138856F3(new r410(9000))).mo170523c0(new x20() { // from class: l.xtk0
                @Override // p153l.x20
                public final void call() {
                    this.f196231a.m221552a4(bLiveVoiceCall);
                }
            });
            if (mo169121k4()) {
                return;
            }
            m221552a4(bLiveVoiceCall);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m221556f4(BLiveVoiceCall bLiveVoiceCall) {
        r1n0 r1n0Var = this.f206018k;
        if (r1n0Var != null) {
            r1n0Var.m179431N3(bLiveVoiceCall);
        }
        this.f206017j.m136892d(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public void m221557g4() {
        BLiveVoice bLiveVoiceMo183435j = ((rwn0) m213810E2()).mo183435j();
        duringCreated(VCallApiProvider.getRoomMembers(((rwn0) m213810E2()).m202194o(), ((rwn0) m213810E2()).mo168489W0(), ((rwn0) m213810E2()).m202191k(), (bLiveVoiceMo183435j == null || bLiveVoiceMo183435j.isIncomerArea()) ? false : true, ((rwn0) m213810E2()).mo183435j().callNumbers)).subscribe(dhw.m115826e(new y20() { // from class: l.ttk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176080a.m221559i4((ado0) obj);
            }
        }, new utk0(this)));
    }

    /* JADX INFO: renamed from: h4 */
    public void m221558h4(String str, y20<BLiveRtcToken> y20Var) {
        if (TextUtils.isEmpty(mo169115S3())) {
            return;
        }
        m113231o2(VCallApiProvider.requestSdkToken(mo169115S3(), str), false).doOnError(new y20() { // from class: l.ytk0
            @Override // p153l.y20
            public final void call(Object obj) {
                fhw.m125605a("[voice][call]", ((Throwable) obj).toString());
            }
        }).subscribe(dhw.m115829h(y20Var));
    }

    /* JADX INFO: renamed from: i4 */
    public void m221559i4(ado0 ado0Var) {
        m221560l4(ado0Var);
        BLiveVoiceCall bLiveVoiceCallM97107C = ado0Var.m97107C(zrv.f205799a.m207631D0());
        if (bLiveVoiceCallM97107C != null) {
            m221552a4(bLiveVoiceCallM97107C);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public abstract void mo169120j4(BLiveRtcToken bLiveRtcToken);

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo169121k4();

    /* JADX INFO: renamed from: l4 */
    public void m221560l4(ado0 ado0Var) {
        r1n0 r1n0Var = this.f206018k;
        if (r1n0Var != null) {
            r1n0Var.m179434R3(ado0Var);
        }
        this.f206017j.m136893e(ado0Var);
    }

    /* JADX INFO: renamed from: m4 */
    public void m221561m4(BLiveVoiceCall bLiveVoiceCall) {
        r1n0 r1n0Var = this.f206018k;
        if (r1n0Var != null) {
            r1n0Var.m179433P3(bLiveVoiceCall);
        }
        this.f206017j.m136894f(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        if (((rwn0) m213810E2()).m168495Y0()) {
            return;
        }
        f5y.m124261b(act());
    }

    /* JADX INFO: renamed from: n4 */
    public void m221562n4(BLiveCallVolume bLiveCallVolume) {
        m213811F2().CallEvent.memberVolume().mo199273j(bLiveCallVolume);
    }

    /* JADX INFO: renamed from: o4 */
    public void mo169122o4(BLiveVoiceCall bLiveVoiceCall) {
        nsh0.m164608j("[voice][call]", "updateRtcInfo");
    }

    /* JADX INFO: renamed from: p4 */
    public final void m221563p4(BLiveRtcToken bLiveRtcToken) {
        fhw.m125605a("[voice][call]", "callCoreModule updateRtcToken");
        ((xzl) m138856F3(new r410(9000))).mo170538o(bLiveRtcToken.channelKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (!((rwn0) m213810E2()).mo183435j().isIncomerArea()) {
            ((rwn0) m213810E2()).m183411P2().m136879r().m97129Y(true);
        }
        m221557g4();
    }

    /* JADX INFO: renamed from: W3 */
    public void mo169118W3(String str) {
    }
}
