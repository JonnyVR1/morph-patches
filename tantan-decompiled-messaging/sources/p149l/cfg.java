package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupCountBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.page.fansgroup.C12569a;

/* JADX INFO: loaded from: classes13.dex */
public class cfg extends jq2<C12569a> {
    public cfg(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m106541j0(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151565C(R$string.f44923r);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m106549r0();
    }

    /* JADX INFO: renamed from: k0 */
    public void m106542k0() {
        duringCreated(eeg.m115966c(l9s.m149093o0())).subscribe(ffw.m121194e(new e30() { // from class: l.afg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69171a.m106544m0((BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.bfg
            @Override // p149l.e30
            public final void call(Object obj) {
                cfg.m106541j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public void m106543l0() {
        duringCreated(eeg.m115967d(l9s.m149093o0())).subscribe(ffw.m121194e(new e30() { // from class: l.yeg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197685a.m106545n0((FanbaseGroupCountBean) obj);
            }
        }, new e30() { // from class: l.zeg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202814a.m106546o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m106544m0(BaseLiveBean baseLiveBean) {
        lsi0.m151593w(R$string.f44927t);
        m106549r0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m106545n0(FanbaseGroupCountBean fanbaseGroupCountBean) {
        ((C12569a) this.viewModel).m70509f(fanbaseGroupCountBean.getCount() >= 100 ? "99+" : String.valueOf(fanbaseGroupCountBean.getCount()));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m106546o0(Throwable th) {
        ((C12569a) this.viewModel).m70509f("0");
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m106547p0(FanbaseGroupsBean fanbaseGroupsBean) {
        ((C12569a) this.viewModel).m70508e(fanbaseGroupsBean);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m106548q0(Throwable th) {
        ((C12569a) this.viewModel).m70508e(null);
    }

    /* JADX INFO: renamed from: r0 */
    public void m106549r0() {
        duringCreated(eeg.m115968e(l9s.m149093o0())).subscribe(ffw.m121194e(new e30() { // from class: l.weg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185938a.m106547p0((FanbaseGroupsBean) obj);
            }
        }, new e30() { // from class: l.xeg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192598a.m106548q0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
