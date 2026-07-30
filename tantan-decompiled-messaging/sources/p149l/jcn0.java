package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import com.p046p1.mobile.putong.live.livingroom.voice.grabhat.view.VoiceGrabHatFloatViewMode;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class jcn0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public BLiveVoiceGrabHatGame f117339i;

    public jcn0(bsm<? extends nnn0> bsmVar, VoiceGrabHatFloatViewMode voiceGrabHatFloatViewMode) {
        super(bsmVar);
        m144512z2(new i6k(bsmVar));
        m144512z2(new t5k(bsmVar, this));
        m144512z2(new e6k(bsmVar, voiceGrabHatFloatViewMode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public final C22306c<BLiveVoiceGrabHatGame> m140985L3() {
        return acn0.m95826h(((nnn0) m206027E2()).m149814k());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ BLiveVoiceGrabHatGame m140986M3(f6k f6kVar) {
        return this.f117339i;
    }

    /* JADX INFO: renamed from: N3 */
    public void m140987N3(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        if (bLiveVoiceGrabHatGame != null && !TextUtils.isEmpty(bLiveVoiceGrabHatGame.toast)) {
            lsi0.m151595y(bLiveVoiceGrabHatGame.toast);
        }
        m140988O3(bLiveVoiceGrabHatGame);
        if (this.f117339i == null && bLiveVoiceGrabHatGame == null) {
            return;
        }
        m206028F2().VoiceGrabHatEvent.gameInfo().mo172463j(bLiveVoiceGrabHatGame);
        this.f117339i = bLiveVoiceGrabHatGame;
    }

    /* JADX INFO: renamed from: O3 */
    public final void m140988O3(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame2 = this.f117339i;
        if (bLiveVoiceGrabHatGame2 == null || bLiveVoiceGrabHatGame == null || !TextUtils.equals(bLiveVoiceGrabHatGame.f44500id, bLiveVoiceGrabHatGame2.f44500id) || !TextUtils.equals(this.f117339i.status, bLiveVoiceGrabHatGame.status)) {
            if (bLiveVoiceGrabHatGame == null && this.f117339i == null) {
                return;
            }
            boolean zM101094c = bcn0.m101094c(bLiveVoiceGrabHatGame);
            StringBuilder sb = new StringBuilder("postGameState:");
            sb.append(bLiveVoiceGrabHatGame == null ? "null" : bLiveVoiceGrabHatGame.status);
            hfw.m130790a("grabHat", sb.toString());
            m206028F2().VoiceGrabHatEvent.openGrabHatGame().mo172463j(Boolean.valueOf(zM101094c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m140985L3()).subscribe(ffw.m121197h(new e30() { // from class: l.gcn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102042a.m140987N3((BLiveVoiceGrabHatGame) obj);
            }
        }));
        m129294C3(new v9j() { // from class: l.hcn0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f107078a.m140985L3();
            }
        }, new e30() { // from class: l.gcn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102042a.m140987N3((BLiveVoiceGrabHatGame) obj);
            }
        });
        m129295D3(10, new v9j() { // from class: l.hcn0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f107078a.m140985L3();
            }
        }, new e30() { // from class: l.gcn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102042a.m140987N3((BLiveVoiceGrabHatGame) obj);
            }
        });
        m129301d3(f6k.class, new w9j() { // from class: l.icn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112472a.m140986M3((f6k) obj);
            }
        });
        duringCreated(((nnn0) m206027E2()).m132160q1().m189122m()).subscribe(ffw.m121197h(new e30() { // from class: l.gcn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102042a.m140987N3((BLiveVoiceGrabHatGame) obj);
            }
        }));
    }
}
