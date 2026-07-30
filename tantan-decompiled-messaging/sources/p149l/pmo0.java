package p149l;

import com.p046p1.mobile.putong.live.livingroom.voice.intl.player.VoiceIncomeAreaStateView;

/* JADX INFO: loaded from: classes11.dex */
public class pmo0 extends pat<fhm0> {

    /* JADX INFO: renamed from: i */
    public final VoiceIncomeAreaStateView f150246i;

    public pmo0(bsm<fhm0> bsmVar, VoiceIncomeAreaStateView voiceIncomeAreaStateView) {
        super(bsmVar);
        this.f150246i = voiceIncomeAreaStateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public void m170346K3(iqv iqvVar) {
        this.f150246i.m78341Q(((fhm0) m206027E2()).mo149813j().isMainLandArea());
        xdl0.m208344M(this.f150246i, iqvVar.m137794a() == 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((fhm0) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.omo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144676a.m170346K3((iqv) obj);
            }
        }));
    }
}
