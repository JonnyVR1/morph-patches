package p009l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;
import l.bsm;
import l.d30;
import l.e30;
import l.ffw;
import l.fhm0;
import l.l3m;
import l.pat;
import l.r8d0;
import l.w9j;
import l.wq2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xho0 extends pat<fhm0> implements l3m {

    /* JADX INFO: renamed from: i */
    public sfo0 f22614i;

    public xho0(bsm bsmVar, sfo0 sfo0Var) {
        super(bsmVar);
        this.f22614i = sfo0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m24900R3(NetworkInfo networkInfo) {
        m24903W3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m24901T3() {
        this.f22614i.m22159m(false);
    }

    /* JADX INFO: renamed from: V3 */
    private void m24902V3() {
        F2().FragProxyEvent.initRoomInfo().p();
    }

    /* JADX INFO: renamed from: W3 */
    private void m24903W3() {
        m24909X3("0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public void m24904Y3(Throwable th) {
        this.f22614i.m22154P0(true, "0");
    }

    /* JADX INFO: renamed from: P3, reason: merged with bridge method [inline-methods] */
    public final void m24908U3(BLiveVoice bLiveVoice, r8d0 r8d0Var) {
        F2().FragProxyEvent.changeRoomData().j(r8d0Var);
        E2().W(((wq2) r8d0Var).c, TextUtils.equals(((BLiveAbsData) bLiveVoice).id, ((wq2) r8d0Var).c.id) ? 0 : 2);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m24906S3() {
        this.f22614i.m22159m(true);
    }

    /* JADX INFO: renamed from: T */
    public void m24907T() {
        super/*l.k4t*/.T();
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.rho0
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(ffw.h(new e30() { // from class: l.sho0
            public final void call(Object obj) {
                this.f20269a.m24900R3((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public void m24909X3(String str) {
        final BLiveVoice bLiveVoiceC = E2().O2().c();
        if (bLiveVoiceC == null) {
            m24902V3();
        } else {
            this.f22614i.m22154P0(false, "0");
            duringCreated(VoiceRoomApiProvider.getLiveInfoForError(bLiveVoiceC, str)).doOnSubscribe(new d30() { // from class: l.tho0
                public final void call() {
                    this.f20701a.m24906S3();
                }
            }).doOnUnsubscribe(new d30() { // from class: l.uho0
                public final void call() {
                    this.f21196a.m24901T3();
                }
            }).subscribe(ffw.e(new e30() { // from class: l.vho0
                public final void call(Object obj) {
                    this.f21586a.m24908U3(bLiveVoiceC, (r8d0) obj);
                }
            }, new e30() { // from class: l.who0
                public final void call(Object obj) {
                    this.f22128a.m24904Y3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m24910t() {
        super/*l.k4t*/.t();
    }
}
