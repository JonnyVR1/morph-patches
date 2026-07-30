package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.apibean.FanBaseGroupSummaryBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class cfg extends y8s<oo2, veg> {
    public cfg(dum<? extends oo2> dumVar) {
        super(dumVar);
        mo52715C(new veg(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: X3 */
    public void m109533X3(String str) {
        if (eb20.m120149b()) {
            o1j0.m165649w(R$string.f48382t3);
        } else {
            duringCreated(LivingNormalApiProvider.m72411G3(str, zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.afg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f70908a.m109534Y3((FanBaseGroupSummaryBean) obj);
                }
            }, new y20() { // from class: l.bfg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f76489a.m109535Z3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m109534Y3(FanBaseGroupSummaryBean fanBaseGroupSummaryBean) {
        ((veg) this.viewModel).mo73021p();
        if (fanBaseGroupSummaryBean.getCode() == 50001) {
            o1j0.m165649w(R$string.f48360s3);
        } else if (fanBaseGroupSummaryBean.getCode() == 50002) {
            o1j0.m165649w(R$string.f48448w3);
        } else {
            o1j0.m165649w(R$string.f48250n3);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m109535Z3(Throwable th) {
        ((veg) this.viewModel).mo73021p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165649w(R$string.f48009c3);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ C22421c m109536a4(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m213810E2().m168532l0().f56859id;
        }
        return LivingNormalApiProvider.m72493P4(str);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m109537b4(FanbaseGroupsBean fanbaseGroupsBean) {
        ((veg) this.viewModel).m73017E();
        ((veg) this.viewModel).m201051I(fanbaseGroupsBean);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().FansGroupEvent.showApplyDialog().m199270g()).flatMap(new qcj() { // from class: l.xeg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f193932a.m109536a4((String) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.yeg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199345a.m109537b4((FanbaseGroupsBean) obj);
            }
        }, new y20() { // from class: l.zeg
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }
}
