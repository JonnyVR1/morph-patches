package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTasksRule;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;

/* JADX INFO: loaded from: classes4.dex */
public class u9g extends vk2 {
    @Override // p153l.vk2
    /* JADX INFO: renamed from: f */
    public void mo162170f(final ycg ycgVar, final y20<Boolean> y20Var) {
        if (TextUtils.isEmpty(ycgVar.f198504j.rule.giftId)) {
            y20Var.call(Boolean.FALSE);
            return;
        }
        if (ycgVar.f198504j != null) {
            m195097q(ycgVar);
        }
        ycgVar.m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136086w(((hiv) zrv.m221194l(htd0.f111521c)).m135161m(ycgVar.f198504j.rule.giftId), new y20() { // from class: l.r9g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161809a.m195095o(ycgVar, y20Var, (BLiveGivenGiftBrief) obj);
            }
        }, new y20() { // from class: l.s9g
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(Boolean.FALSE);
            }
        }, new y20() { // from class: l.t9g
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(Boolean.FALSE);
            }
        }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.sweetaccompany))));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m195095o(ycg ycgVar, y20 y20Var, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (ycgVar.f198504j != null) {
            m195096p(ycgVar);
        }
        y20Var.call(Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [l.oo2] */
    /* JADX INFO: renamed from: p */
    public final void m195096p(ycg ycgVar) {
        int i = ycgVar.f198506l;
        String strMo78457R2 = ycgVar.mo78457R2();
        String str = ycgVar.f198507m;
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = ycgVar.f198504j.rule;
        qzj.m178784a(i, strMo78457R2, str, bLiveAccommpanyTasksRule.giftId, bLiveAccommpanyTasksRule.giftName, bLiveAccommpanyTasksRule.giftAmount, ycgVar.m213810E2().m168532l0().f56859id, ycgVar.f198505k);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [l.oo2] */
    /* JADX INFO: renamed from: q */
    public final void m195097q(ycg ycgVar) {
        int i = ycgVar.f198506l;
        String strMo78457R2 = ycgVar.mo78457R2();
        String str = ycgVar.f198507m;
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = ycgVar.f198504j.rule;
        qzj.m178785b(i, strMo78457R2, str, bLiveAccommpanyTasksRule.giftId, bLiveAccommpanyTasksRule.giftName, bLiveAccommpanyTasksRule.giftAmount, ycgVar.m213810E2().m168532l0().f56859id, ycgVar.f198505k);
    }
}
