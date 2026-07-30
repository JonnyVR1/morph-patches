package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class evl0 extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    @Override // p149l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, @Nullable x1e0.C21019b c21019b) {
        String strM214763g = ygtVar.m214763g("userId");
        if (TextUtils.isEmpty(strM214763g)) {
            strM214763g = c2e0Var.m206027E2().m132140j0();
        }
        c2e0Var.m206028F2().VirtualCompanionEvent.show().mo172463j(new um5(0, strM214763g));
    }
}
