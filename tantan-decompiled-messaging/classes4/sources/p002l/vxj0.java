package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import l.gwr;
import l.vdt;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vxj0 extends kud0<ygt> {
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        String strG = ygtVar.g("userId");
        String strG2 = ygtVar.g("anchorId");
        if (strG2 == null) {
            strG2 = "";
        }
        if (vdt.b(2)) {
            c2e0Var.m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(1000).userId(strG).setFromIdentity(bqq.m10554a(c2e0Var, strG2, strG, 1000)).setTo(bqq.m10557d(c2e0Var, strG2, strG, 1000)).setSource("live").setScene("live").trackFrom("system_bullet").build());
        } else {
            boolean zH = ygtVar.h(((gwr) ygtVar).b);
            c2e0Var.m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(1000).userId(strG).setFromIdentity(zH ? bqq.m10555b(c2e0Var, strG2, strG, 1000) : bqq.m10554a(c2e0Var, strG2, strG, 1000)).setTo(zH ? bqq.m10558e(c2e0Var, strG2, strG, 1000) : bqq.m10557d(c2e0Var, strG2, strG, 1000)).setSource("live").setScene("live").trackFrom("system_bullet").build());
        }
    }
}
