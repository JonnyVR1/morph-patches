package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class mpm0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public final HashMap<String, c4g0> f135072i;

    public mpm0(bsm bsmVar) {
        super(bsmVar);
        this.f135072i = new HashMap<>();
    }

    /* JADX INFO: renamed from: U3 */
    private void m155827U3(String str) {
        gkh0.m126627j("[voice][call]", "CallAnchorControlModule stop call timer id = " + str);
        mkd0.m154992z(this.f135072i.remove(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ Boolean m155828N3(BLiveVoiceCall bLiveVoiceCall, Long l2) {
        return Boolean.valueOf(((nnn0) m206027E2()).m160249P2().m102061j(bLiveVoiceCall.f44485id) == null);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m155829O3(BLiveVoiceCall bLiveVoiceCall, Long l2) {
        m155830P3(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m155830P3(BLiveVoiceCall bLiveVoiceCall) {
        lsi0.m151595y(this.f188513f.getString(R$string.f46712H1, bLiveVoiceCall.userName));
        m155832S3(bLiveVoiceCall);
        m155827U3(bLiveVoiceCall.f44485id);
    }

    /* JADX INFO: renamed from: R3 */
    public void m155831R3(final cmn0 cmn0Var) {
        if (!cmn0Var.m107683k(13)) {
            if (cmn0Var.m107683k(6)) {
                m155827U3(cmn0Var.m107678f());
            }
        } else {
            String str = (String) vwb.m200346r(this.f135072i.keySet(), new w9j() { // from class: l.lpm0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(cmn0Var.m107678f(), (String) obj));
                }
            });
            if (TextUtils.isEmpty(str)) {
                return;
            }
            m155827U3(str);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m155832S3(BLiveVoiceCall bLiveVoiceCall) {
        m206028F2().VoiceCallEvent.removeWaitCallEvent().mo172463j(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final void m155833T3(final BLiveVoiceCall bLiveVoiceCall) {
        this.f135072i.put(bLiveVoiceCall.f44485id, m129299H3(((nnn0) m206027E2()).m132135h2(30, TimeUnit.SECONDS)).take(1).filter(new w9j() { // from class: l.jpm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f119212a.m155828N3(bLiveVoiceCall, (Long) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.kpm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124174a.m155829O3(bLiveVoiceCall, (Long) obj);
            }
        }, new z2k())));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f135072i.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189155x0()).subscribe(new e30() { // from class: l.hpm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108948a.m155831R3((cmn0) obj);
            }
        });
        duringCreated(m206028F2().VoiceCallEvent.callAgreedEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ipm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114330a.m155833T3((BLiveVoiceCall) obj);
            }
        }));
    }
}
