package p002l;

import android.text.TextUtils;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nf90 extends kud0<ygt> {
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        String strG = ygtVar.g("userId");
        String strG2 = ygtVar.g("from");
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        c2e0Var.m25548F2().JumpProfileEvent.jump().j(new lqq(strG, strG2));
    }
}
