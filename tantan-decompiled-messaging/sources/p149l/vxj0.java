package p149l;

import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;

/* JADX INFO: loaded from: classes4.dex */
public class vxj0 extends kud0<ygt> {
    @Override // p149l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, x1e0.C21019b c21019b) {
        String strM214763g = ygtVar.m214763g("userId");
        String strM214763g2 = ygtVar.m214763g("anchorId");
        if (strM214763g2 == null) {
            strM214763g2 = "";
        }
        if (vdt.m198092b(2)) {
            c2e0Var.m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(1000).userId(strM214763g).setFromIdentity(bqq.m103386a(c2e0Var, strM214763g2, strM214763g, 1000)).setTo(bqq.m103389d(c2e0Var, strM214763g2, strM214763g, 1000)).setSource("live").setScene("live").trackFrom("system_bullet").build());
        } else {
            boolean zM214764h = ygtVar.m214764h(ygtVar.f104770b);
            c2e0Var.m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(1000).userId(strM214763g).setFromIdentity(zM214764h ? bqq.m103387b(c2e0Var, strM214763g2, strM214763g, 1000) : bqq.m103386a(c2e0Var, strM214763g2, strM214763g, 1000)).setTo(zM214764h ? bqq.m103390e(c2e0Var, strM214763g2, strM214763g, 1000) : bqq.m103389d(c2e0Var, strM214763g2, strM214763g, 1000)).setSource("live").setScene("live").trackFrom("system_bullet").build());
        }
    }
}
