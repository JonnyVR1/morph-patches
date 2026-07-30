package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.apibean.FanBaseGroupSummaryBean;
import com.p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.e30;
import l.ffw;
import l.lsi0;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class odg extends x6s<ho2, hdg> {
    public odg(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        C(new hdg(bsmVar.f8332a, this));
    }

    /* JADX INFO: renamed from: X3 */
    public void m19422X3(String str) {
        if (w220.m24291b()) {
            lsi0.w(R$string.f3576t3);
        } else {
            duringCreated(LivingNormalApiProvider.m4594G3(str, ypv.a.D0())).subscribe(ffw.e(new e30() { // from class: l.mdg
                public final void call(Object obj) {
                    this.f15351a.m19423Y3((FanBaseGroupSummaryBean) obj);
                }
            }, new e30() { // from class: l.ndg
                public final void call(Object obj) {
                    this.f15962a.m19424Z3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m19423Y3(FanBaseGroupSummaryBean fanBaseGroupSummaryBean) {
        ((hdg) ((bwr) this).viewModel).mo5216p();
        if (fanBaseGroupSummaryBean.getCode() == 50001) {
            lsi0.w(R$string.f3554s3);
        } else if (fanBaseGroupSummaryBean.getCode() == 50002) {
            lsi0.w(R$string.f3642w3);
        } else {
            lsi0.w(R$string.f3444n3);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m19424Z3(Throwable th) {
        ((hdg) ((bwr) this).viewModel).mo5216p();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.y(coreService.metaMessage);
                return;
            }
        }
        lsi0.w(R$string.f3203c3);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ c m19425a4(String str) {
        if (TextUtils.isEmpty(str)) {
            str = ((DbObject) m25547E2().m14582l0()).id;
        }
        return LivingNormalApiProvider.m4676P4(str);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m19426b4(FanbaseGroupsBean fanbaseGroupsBean) {
        ((hdg) ((bwr) this).viewModel).m5211E();
        ((hdg) ((bwr) this).viewModel).m14341I(fanbaseGroupsBean);
    }

    /* JADX INFO: renamed from: t */
    public void m19427t() {
        super.t();
        duringCreated((c) m25548F2().FansGroupEvent.showApplyDialog().g()).flatMap(new w9j() { // from class: l.jdg
            public final Object call(Object obj) {
                return this.f13700a.m19425a4((String) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.kdg
            public final void call(Object obj) {
                this.f14289a.m19426b4((FanbaseGroupsBean) obj);
            }
        }, new e30() { // from class: l.ldg
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }
}
