package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTasksRule;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;

/* JADX INFO: loaded from: classes4.dex */
public class g8g extends nk2 {
    @Override // p149l.nk2
    /* JADX INFO: renamed from: f */
    public void mo105792f(final kbg kbgVar, final e30<Boolean> e30Var) {
        if (TextUtils.isEmpty(kbgVar.f122235j.rule.giftId)) {
            e30Var.call(Boolean.FALSE);
            return;
        }
        if (kbgVar.f122235j != null) {
            m124755q(kbgVar);
        }
        kbgVar.m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106532w(((ggv) ypv.m215673l(fld0.f98148c)).m126027m(kbgVar.f122235j.rule.giftId), new e30() { // from class: l.d8g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84866a.m124753o(kbgVar, e30Var, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.e8g
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }, new e30() { // from class: l.f8g
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.sweetaccompany))));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m124753o(kbg kbgVar, e30 e30Var, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (kbgVar.f122235j != null) {
            m124754p(kbgVar);
        }
        e30Var.call(Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [l.ho2] */
    /* JADX INFO: renamed from: p */
    public final void m124754p(kbg kbgVar) {
        int i = kbgVar.f122237l;
        String strMo77274R2 = kbgVar.mo77274R2();
        String str = kbgVar.f122238m;
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = kbgVar.f122235j.rule;
        axj.m99427a(i, strMo77274R2, str, bLiveAccommpanyTasksRule.giftId, bLiveAccommpanyTasksRule.giftName, bLiveAccommpanyTasksRule.giftAmount, kbgVar.m206027E2().m132146l0().f56011id, kbgVar.f122236k);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [l.ho2] */
    /* JADX INFO: renamed from: q */
    public final void m124755q(kbg kbgVar) {
        int i = kbgVar.f122237l;
        String strMo77274R2 = kbgVar.mo77274R2();
        String str = kbgVar.f122238m;
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = kbgVar.f122235j.rule;
        axj.m99428b(i, strMo77274R2, str, bLiveAccommpanyTasksRule.giftId, bLiveAccommpanyTasksRule.giftName, bLiveAccommpanyTasksRule.giftAmount, kbgVar.m206027E2().m132146l0().f56011id, kbgVar.f122236k);
    }
}
