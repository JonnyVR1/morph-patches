package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class rn90 extends o2e0<zit> {
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        String strM219937g = zitVar.m219937g("userId");
        String strM219937g2 = zitVar.m219937g("from");
        if (TextUtils.isEmpty(strM219937g)) {
            return;
        }
        gae0Var.m213811F2().JumpProfileEvent.jump().mo199273j(new msq(strM219937g, strM219937g2));
    }
}
