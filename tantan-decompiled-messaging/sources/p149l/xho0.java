package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes11.dex */
public class xho0 extends pat<fhm0> implements l3m {

    /* JADX INFO: renamed from: i */
    public sfo0 f192900i;

    public xho0(bsm bsmVar, sfo0 sfo0Var) {
        super(bsmVar);
        this.f192900i = sfo0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m208809R3(NetworkInfo networkInfo) {
        m208812W3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m208810T3() {
        this.f192900i.m183993m(false);
    }

    /* JADX INFO: renamed from: V3 */
    private void m208811V3() {
        m206028F2().FragProxyEvent.initRoomInfo().m172467p();
    }

    /* JADX INFO: renamed from: W3 */
    private void m208812W3() {
        m208817X3("0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public void m208813Y3(Throwable th) {
        this.f192900i.m183989P0(true, "0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3, reason: merged with bridge method [inline-methods] */
    public final void m208816U3(BLiveVoice bLiveVoice, r8d0 r8d0Var) {
        m206028F2().FragProxyEvent.changeRoomData().mo172463j(r8d0Var);
        ((fhm0) m206027E2()).m132102W(r8d0Var.f187610c, TextUtils.equals(bLiveVoice.f44323id, r8d0Var.f187610c.f44323id) ? 0 : 2);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m208815S3() {
        this.f192900i.m183993m(true);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.rho0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.sho0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164620a.m208809R3((NetworkInfo) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public void m208817X3(String str) {
        final BLiveVoice bLiveVoiceMo165470l = ((fhm0) m206027E2()).m160247O2().mo165470l();
        if (bLiveVoiceMo165470l == null) {
            m208811V3();
        } else {
            this.f192900i.m183989P0(false, "0");
            duringCreated(VoiceRoomApiProvider.getLiveInfoForError(bLiveVoiceMo165470l, str)).doOnSubscribe(new d30() { // from class: l.tho0
                @Override // p149l.d30
                public final void call() {
                    this.f170268a.m208815S3();
                }
            }).doOnUnsubscribe(new d30() { // from class: l.uho0
                @Override // p149l.d30
                public final void call() {
                    this.f176583a.m208810T3();
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.vho0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181520a.m208816U3(bLiveVoiceMo165470l, (r8d0) obj);
                }
            }, new e30() { // from class: l.who0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f186458a.m208813Y3((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
    }
}
