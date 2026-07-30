package p002l;

import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vu4 extends kud0<ygt> {
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        String strG = ygtVar.g("content");
        String strG2 = ygtVar.g("chatType");
        String strG3 = ygtVar.g("bulletType");
        c2e0Var.m25548F2().ChatEvent.chatInputClick().j(new wu4(true, strG).m25482b(strG2).m25484d(strG3).m25483c(ygtVar.g("bulletSubType")));
    }
}
