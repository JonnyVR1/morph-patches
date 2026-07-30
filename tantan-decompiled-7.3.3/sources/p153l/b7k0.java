package p153l;

import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;

/* JADX INFO: loaded from: classes4.dex */
public class b7k0 extends o2e0<zit> {
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        String strM219937g = zitVar.m219937g("userId");
        String strM219937g2 = zitVar.m219937g("anchorId");
        if (strM219937g2 == null) {
            strM219937g2 = "";
        }
        if (wft.m206159b(2)) {
            gae0Var.m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(1000).userId(strM219937g).setFromIdentity(csq.m112227a(gae0Var, strM219937g2, strM219937g, 1000)).setTo(csq.m112230d(gae0Var, strM219937g2, strM219937g, 1000)).setSource("live").setScene("live").trackFrom("system_bullet").build());
        } else {
            boolean zM219938h = zitVar.m219938h(zitVar.f112155b);
            gae0Var.m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(1000).userId(strM219937g).setFromIdentity(zM219938h ? csq.m112228b(gae0Var, strM219937g2, strM219937g, 1000) : csq.m112227a(gae0Var, strM219937g2, strM219937g, 1000)).setTo(zM219938h ? csq.m112231e(gae0Var, strM219937g2, strM219937g, 1000) : csq.m112230d(gae0Var, strM219937g2, strM219937g, 1000)).setSource("live").setScene("live").trackFrom("system_bullet").build());
        }
    }
}
