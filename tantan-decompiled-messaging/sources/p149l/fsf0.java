package p149l;

import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSkinConfig;

/* JADX INFO: loaded from: classes13.dex */
public class fsf0 extends cts<jsf0> {
    public fsf0(mcr mcrVar, mss mssVar, jsf0 jsf0Var) {
        super(mcrVar, mssVar);
        mo51532C(jsf0Var);
        if (getAct() instanceof PutongAct) {
            ((PutongAct) getAct()).setTransparentStatusBar();
        }
    }

    @Override // p149l.lss
    /* JADX INFO: renamed from: M2 */
    public void mo122936M2() {
        super.mo122936M2();
        m104250o2(s2u.m182077i(), false).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.zrf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(s9s.f163228b.m195818d7());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.asf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71421a.m122937V2((Boolean) obj);
            }
        }));
        m104250o2(s9s.f163228b.m121231l(false), false).filter(new w9j() { // from class: l.bsf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveSettings bLiveSettings = (BLiveSettings) obj;
                return Boolean.valueOf((bLiveSettings == null || bLiveSettings.liveSkinConfig == null) ? false : true);
            }
        }).map(new w9j() { // from class: l.csf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveSettings) obj).liveSkinConfig;
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.dsf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87763a.m122938W2((BLiveSkinConfig) obj);
            }
        }));
        duringCreated(m151642F2().LiveHomePageEvent.tabSelected().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.esf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93007a.m122939X2((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m122937V2(Boolean bool) {
        ((jsf0) this.viewModel).m143038k(bool.booleanValue());
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m122938W2(BLiveSkinConfig bLiveSkinConfig) {
        ((jsf0) this.viewModel).m143041n(bLiveSkinConfig);
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m122939X2(String str) {
        ((jsf0) this.viewModel).m143039l("fakeLiveSquare".equals(str));
    }
}
