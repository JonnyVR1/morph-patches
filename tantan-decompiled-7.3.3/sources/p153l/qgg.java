package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupCountBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.page.fansgroup.C12732a;

/* JADX INFO: loaded from: classes9.dex */
public class qgg extends ar2<C12732a> {
    public qgg(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m176463j0(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165621C(R$string.f45771r);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m176471r0();
    }

    /* JADX INFO: renamed from: k0 */
    public void m176464k0() {
        duringCreated(sfg.m185588c(mbs.m157870o0())).subscribe(dhw.m115826e(new y20() { // from class: l.ogg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147255a.m176466m0((BaseLiveBean) obj);
            }
        }, new y20() { // from class: l.pgg
            @Override // p153l.y20
            public final void call(Object obj) {
                qgg.m176463j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public void m176465l0() {
        duringCreated(sfg.m185589d(mbs.m157870o0())).subscribe(dhw.m115826e(new y20() { // from class: l.mgg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136735a.m176467n0((FanbaseGroupCountBean) obj);
            }
        }, new y20() { // from class: l.ngg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141814a.m176468o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m176466m0(BaseLiveBean baseLiveBean) {
        o1j0.m165649w(R$string.f45775t);
        m176471r0();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m176467n0(FanbaseGroupCountBean fanbaseGroupCountBean) {
        ((C12732a) this.viewModel).m71692f(fanbaseGroupCountBean.getCount() >= 100 ? "99+" : String.valueOf(fanbaseGroupCountBean.getCount()));
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m176468o0(Throwable th) {
        ((C12732a) this.viewModel).m71692f("0");
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m176469p0(FanbaseGroupsBean fanbaseGroupsBean) {
        ((C12732a) this.viewModel).m71691e(fanbaseGroupsBean);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m176470q0(Throwable th) {
        ((C12732a) this.viewModel).m71691e(null);
    }

    /* JADX INFO: renamed from: r0 */
    public void m176471r0() {
        duringCreated(sfg.m185590e(mbs.m157870o0())).subscribe(dhw.m115826e(new y20() { // from class: l.kgg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126600a.m176469p0((FanbaseGroupsBean) obj);
            }
        }, new y20() { // from class: l.lgg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131960a.m176470q0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
