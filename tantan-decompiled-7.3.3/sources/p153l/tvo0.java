package p153l;

import com.p051p1.mobile.putong.live.livingroom.voice.intl.player.VoiceIncomeAreaStateView;

/* JADX INFO: loaded from: classes10.dex */
public class tvo0 extends qct<jqm0> {

    /* JADX INFO: renamed from: i */
    public final VoiceIncomeAreaStateView f176273i;

    public tvo0(dum<jqm0> dumVar, VoiceIncomeAreaStateView voiceIncomeAreaStateView) {
        super(dumVar);
        this.f176273i = voiceIncomeAreaStateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public void m192815K3(jsv jsvVar) {
        this.f176273i.m79524Q(((jqm0) m213810E2()).mo183435j().isMainLandArea());
        bnl0.m105524M(this.f176273i, jsvVar.m146875a() == 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((jqm0) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.svo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170863a.m192815K3((jsv) obj);
            }
        }));
    }
}
