package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.intl.player.VoiceIncomeAreaStateView;
import l.bsm;
import l.e30;
import l.ffw;
import l.fhm0;
import l.iqv;
import l.pat;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pmo0 extends pat<fhm0> {

    /* JADX INFO: renamed from: i */
    public final VoiceIncomeAreaStateView f18790i;

    public pmo0(bsm<fhm0> bsmVar, VoiceIncomeAreaStateView voiceIncomeAreaStateView) {
        super(bsmVar);
        this.f18790i = voiceIncomeAreaStateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public void m20513K3(iqv iqvVar) {
        this.f18790i.m8538Q(E2().V2().isMainLandArea());
        xdl0.M(this.f18790i, iqvVar.a() == 4);
    }

    /* JADX INFO: renamed from: t */
    public void m20514t() {
        super/*l.k4t*/.t();
        duringCreated(E2().l()).subscribe(ffw.d(new e30() { // from class: l.omo0
            public final void call(Object obj) {
                this.f18178a.m20513K3((iqv) obj);
            }
        }));
    }
}
