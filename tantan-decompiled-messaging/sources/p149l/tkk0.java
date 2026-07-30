package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class tkk0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public final zkk0 f170892i;

    /* JADX INFO: renamed from: j */
    public final bik0.C15868b f170893j;

    /* JADX INFO: renamed from: k */
    public nsm0 f170894k;

    /* JADX INFO: renamed from: l */
    public f30<Integer, Object> f170895l;

    /* JADX INFO: renamed from: m */
    public rdp0 f170896m;

    /* JADX INFO: renamed from: n */
    public boolean f170897n;

    public tkk0(bsm bsmVar) {
        super(bsmVar);
        this.f170895l = new kkk0(this);
        this.f170893j = new bik0.C15868b();
        this.f170896m = (rdp0) m144512z2(new rdp0(bsmVar));
        this.f170892i = (zkk0) m144512z2(new zkk0(bsmVar, this));
        m144512z2(new wrm0(bsmVar, this));
        m144512z2(new gpm0(bsmVar, this));
    }

    /* JADX INFO: renamed from: O3 */
    public void m189505O3(aqm0 aqm0Var) {
        nsm0 nsm0Var = this.f170894k;
        if (nsm0Var != null) {
            nsm0Var.m160784J3(aqm0Var);
        }
        this.f170893j.m102080b(aqm0Var);
    }

    /* JADX INFO: renamed from: P3 */
    public void m189506P3(BLiveVoiceCall bLiveVoiceCall) {
        nsm0 nsm0Var = this.f170894k;
        if (nsm0Var != null) {
            nsm0Var.m160785K3(bLiveVoiceCall);
        }
        this.f170893j.m102081c(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: R3 */
    public f30<Integer, Object> m189507R3() {
        return this.f170895l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public String mo136822S3() {
        return ((nnn0) m206027E2()).m149818o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((oxl) m129297F3(new rv00(3400))).mo133473c(new kkk0(this));
        ((nnn0) m206027E2()).m160237H2(this.f170893j);
        m104250o2(((nnn0) m206027E2()).m160262Z2(), false).subscribe(ffw.m121193d(new e30() { // from class: l.lkk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128591a.mo136823T3((BLiveVoiceCall) obj);
            }
        }));
        duringCreated(m206028F2().VoiceCallEvent.leaveVoiceEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.mkk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134333a.m189509Y3((xpm0) obj);
            }
        }));
        iwx.m138781a(act(), iwx.f115314a);
    }

    /* JADX INFO: renamed from: T3 */
    public abstract void mo136823T3(BLiveVoiceCall bLiveVoiceCall);

    /* JADX INFO: renamed from: U3 */
    public void mo164536U3(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: V3 */
    public abstract void mo136824V3();

    /* JADX INFO: renamed from: X3, reason: merged with bridge method [inline-methods] */
    public void m189511a4(BLiveVoiceCall bLiveVoiceCall) {
        this.f170892i.m219185M3(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m189509Y3(xpm0 xpm0Var) {
        m189512b4(xpm0Var, xpm0Var.f193943g);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m189510Z3(List list) {
        m189515f4((BLiveVoiceCall) list.get(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public void m189512b4(xpm0 xpm0Var, String str) {
        BLiveVoiceCall bLiveVoiceCall = xpm0Var.f193941e;
        if (bLiveVoiceCall == null || TextUtils.isEmpty(bLiveVoiceCall.f44485id) || alk0.m97307f(bLiveVoiceCall)) {
            return;
        }
        if (vdt.m198092b(3) || !((nnn0) m206027E2()).m160267e3()) {
            duringCreated(VCallApiProvider.hangUpVoiceCall(bLiveVoiceCall.f44485id, m206032L2(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.pkk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150008a.m189510Z3((List) obj);
                }
            }, new ult()));
        }
    }

    /* JADX INFO: renamed from: c4 */
    public abstract void mo136826c4(BLiveVoiceCall bLiveVoiceCall);

    /* JADX INFO: renamed from: d4 */
    public void m189513d4(Integer num, Object obj) {
        if (1 != num.intValue()) {
            StringBuilder sb = new StringBuilder("onEngineCallback ");
            sb.append(ks2.m147035b(num.intValue()));
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(obj == null ? "" : obj.toString());
            gkh0.m126627j("[voice][call]", sb.toString());
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            BLiveCallVolume bLiveCallVolume = (BLiveCallVolume) obj;
            m189521n4(bLiveCallVolume);
            this.f170896m.m178999M3(bLiveCallVolume);
        } else {
            if (iIntValue == 2) {
                m189517h4(String.valueOf(obj), new e30() { // from class: l.qkk0
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        this.f155145a.m189522p4((BLiveRtcToken) obj2);
                    }
                });
                return;
            }
            if (iIntValue != 3) {
                if (iIntValue != 4) {
                    return;
                }
                this.f170897n = true;
                mo136824V3();
                return;
            }
            this.f170892i.m219190S3(String.valueOf(obj));
            mo136825W3(String.valueOf(obj));
            m206028F2().VoiceCallEvent.enterRtcCallback().m172467p();
            this.f170897n = false;
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m189514e4(final BLiveVoiceCall bLiveVoiceCall) {
        gkh0.m126627j("[voice][call]", "rejoinRtcRoom");
        if (this.f170897n) {
            gkh0.m126627j("[voice][call]", "rejoinRtcRoom because push error");
            ((exl) m129297F3(new jw00(9000))).mo118677c0(new d30() { // from class: l.rkk0
                @Override // p149l.d30
                public final void call() {
                    this.f159870a.m189511a4(bLiveVoiceCall);
                }
            });
            if (mo136828k4()) {
                return;
            }
            m189511a4(bLiveVoiceCall);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m189515f4(BLiveVoiceCall bLiveVoiceCall) {
        nsm0 nsm0Var = this.f170894k;
        if (nsm0Var != null) {
            nsm0Var.m160787N3(bLiveVoiceCall);
        }
        this.f170893j.m102082d(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public void m189516g4() {
        BLiveVoice bLiveVoiceMo149813j = ((nnn0) m206027E2()).mo149813j();
        duringCreated(VCallApiProvider.getRoomMembers(((nnn0) m206027E2()).m149818o(), ((nnn0) m206027E2()).mo132103W0(), ((nnn0) m206027E2()).m149814k(), (bLiveVoiceMo149813j == null || bLiveVoiceMo149813j.isIncomerArea()) ? false : true, ((nnn0) m206027E2()).mo149813j().callNumbers)).subscribe(ffw.m121194e(new e30() { // from class: l.nkk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139441a.m189518i4((w3o0) obj);
            }
        }, new okk0(this)));
    }

    /* JADX INFO: renamed from: h4 */
    public void m189517h4(String str, e30<BLiveRtcToken> e30Var) {
        if (TextUtils.isEmpty(mo136822S3())) {
            return;
        }
        m104250o2(VCallApiProvider.requestSdkToken(mo136822S3(), str), false).doOnError(new e30() { // from class: l.skk0
            @Override // p149l.e30
            public final void call(Object obj) {
                hfw.m130790a("[voice][call]", ((Throwable) obj).toString());
            }
        }).subscribe(ffw.m121197h(e30Var));
    }

    /* JADX INFO: renamed from: i4 */
    public void m189518i4(w3o0 w3o0Var) {
        m189519l4(w3o0Var);
        BLiveVoiceCall bLiveVoiceCallM201350C = w3o0Var.m201350C(ypv.f199493a.m199309D0());
        if (bLiveVoiceCallM201350C != null) {
            m189511a4(bLiveVoiceCallM201350C);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public abstract void mo136827j4(BLiveRtcToken bLiveRtcToken);

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo136828k4();

    /* JADX INFO: renamed from: l4 */
    public void m189519l4(w3o0 w3o0Var) {
        nsm0 nsm0Var = this.f170894k;
        if (nsm0Var != null) {
            nsm0Var.m160790R3(w3o0Var);
        }
        this.f170893j.m102083e(w3o0Var);
    }

    /* JADX INFO: renamed from: m4 */
    public void m189520m4(BLiveVoiceCall bLiveVoiceCall) {
        nsm0 nsm0Var = this.f170894k;
        if (nsm0Var != null) {
            nsm0Var.m160789P3(bLiveVoiceCall);
        }
        this.f170893j.m102084f(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        if (((nnn0) m206027E2()).m132109Y0()) {
            return;
        }
        iwx.m138782b(act());
    }

    /* JADX INFO: renamed from: n4 */
    public void m189521n4(BLiveCallVolume bLiveCallVolume) {
        m206028F2().CallEvent.memberVolume().mo172463j(bLiveCallVolume);
    }

    /* JADX INFO: renamed from: o4 */
    public void mo136829o4(BLiveVoiceCall bLiveVoiceCall) {
        gkh0.m126627j("[voice][call]", "updateRtcInfo");
    }

    /* JADX INFO: renamed from: p4 */
    public final void m189522p4(BLiveRtcToken bLiveRtcToken) {
        hfw.m130790a("[voice][call]", "callCoreModule updateRtcToken");
        ((exl) m129297F3(new jw00(9000))).mo118680o(bLiveRtcToken.channelKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (!((nnn0) m206027E2()).mo149813j().isIncomerArea()) {
            ((nnn0) m206027E2()).m160249P2().m102069r().m201372Y(true);
        }
        m189516g4();
    }

    /* JADX INFO: renamed from: W3 */
    public void mo136825W3(String str) {
    }
}
