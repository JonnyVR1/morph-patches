package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.apibean.FanBaseGroupSummaryBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class odg extends x6s<ho2, hdg> {
    public odg(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        mo51532C(new hdg(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: X3 */
    public void m163661X3(String str) {
        if (w220.m201015b()) {
            lsi0.m151593w(R$string.f47534t3);
        } else {
            duringCreated(LivingNormalApiProvider.m71228G3(str, ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.mdg
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f133236a.m163662Y3((FanBaseGroupSummaryBean) obj);
                }
            }, new e30() { // from class: l.ndg
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138283a.m163663Z3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m163662Y3(FanBaseGroupSummaryBean fanBaseGroupSummaryBean) {
        ((hdg) this.viewModel).mo71838p();
        if (fanBaseGroupSummaryBean.getCode() == 50001) {
            lsi0.m151593w(R$string.f47512s3);
        } else if (fanBaseGroupSummaryBean.getCode() == 50002) {
            lsi0.m151593w(R$string.f47600w3);
        } else {
            lsi0.m151593w(R$string.f47402n3);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m163663Z3(Throwable th) {
        ((hdg) this.viewModel).mo71838p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151593w(R$string.f47161c3);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ C22306c m163664a4(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m206027E2().m132146l0().f56011id;
        }
        return LivingNormalApiProvider.m71310P4(str);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m163665b4(FanbaseGroupsBean fanbaseGroupsBean) {
        ((hdg) this.viewModel).m71834E();
        ((hdg) this.viewModel).m130589I(fanbaseGroupsBean);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().FansGroupEvent.showApplyDialog().m172460g()).flatMap(new w9j() { // from class: l.jdg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f117383a.m163664a4((String) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.kdg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122557a.m163665b4((FanbaseGroupsBean) obj);
            }
        }, new e30() { // from class: l.ldg
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }
}
