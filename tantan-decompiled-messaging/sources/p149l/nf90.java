package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class nf90 extends kud0<ygt> {
    @Override // p149l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, x1e0.C21019b c21019b) {
        String strM214763g = ygtVar.m214763g("userId");
        String strM214763g2 = ygtVar.m214763g("from");
        if (TextUtils.isEmpty(strM214763g)) {
            return;
        }
        c2e0Var.m206028F2().JumpProfileEvent.jump().mo172463j(new lqq(strM214763g, strM214763g2));
    }
}
