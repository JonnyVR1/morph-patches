package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasksRule;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.fld0;
import l.ggv;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g8g extends nk2 {
    @Override // p002l.nk2
    /* JADX INFO: renamed from: f */
    public void mo10899f(final kbg kbgVar, final e30<Boolean> e30Var) {
        if (TextUtils.isEmpty(kbgVar.f14271j.rule.giftId)) {
            e30Var.call(Boolean.FALSE);
            return;
        }
        if (kbgVar.f14271j != null) {
            m13657q(kbgVar);
        }
        kbgVar.m25548F2().SendGiftEventGroup.sendGift().j(new cfe0.C0512a().m10985w(((ggv) ypv.l(fld0.c)).m(kbgVar.f14271j.rule.giftId), new e30() { // from class: l.d8g
            public final void call(Object obj) {
                this.f9112a.m13655o(kbgVar, e30Var, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.e8g
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }, new e30() { // from class: l.f8g
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("sweetaccompany"))));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m13655o(kbg kbgVar, e30 e30Var, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (kbgVar.f14271j != null) {
            m13656p(kbgVar);
        }
        e30Var.call(Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [l.ho2] */
    /* JADX INFO: renamed from: p */
    public final void m13656p(kbg kbgVar) {
        int i = kbgVar.f14273l;
        String strMo21430R2 = kbgVar.mo21430R2();
        String str = kbgVar.f14274m;
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = kbgVar.f14271j.rule;
        axj.m10087a(i, strMo21430R2, str, bLiveAccommpanyTasksRule.giftId, bLiveAccommpanyTasksRule.giftName, bLiveAccommpanyTasksRule.giftAmount, ((DbObject) kbgVar.m25547E2().m14582l0()).id, kbgVar.f14272k);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [l.ho2] */
    /* JADX INFO: renamed from: q */
    public final void m13657q(kbg kbgVar) {
        int i = kbgVar.f14273l;
        String strMo21430R2 = kbgVar.mo21430R2();
        String str = kbgVar.f14274m;
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = kbgVar.f14271j.rule;
        axj.m10088b(i, strMo21430R2, str, bLiveAccommpanyTasksRule.giftId, bLiveAccommpanyTasksRule.giftName, bLiveAccommpanyTasksRule.giftAmount, ((DbObject) kbgVar.m25547E2().m14582l0()).id, kbgVar.f14272k);
    }
}
