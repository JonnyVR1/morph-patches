package p002l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import l.um5;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class evl0 extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, @Nullable x1e0.C0892b c0892b) {
        String strG = ygtVar.g("userId");
        if (TextUtils.isEmpty(strG)) {
            strG = c2e0Var.m25547E2().m14576j0();
        }
        c2e0Var.m25548F2().VirtualCompanionEvent.show().j(new um5(0, strG));
    }
}
