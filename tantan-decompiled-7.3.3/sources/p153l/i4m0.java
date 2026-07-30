package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class i4m0 extends o2e0<zit> {
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, @Nullable bae0.C15954b c15954b) {
        String strM219937g = zitVar.m219937g("userId");
        if (TextUtils.isEmpty(strM219937g)) {
            strM219937g = gae0Var.m213810E2().m168526j0();
        }
        gae0Var.m213811F2().VirtualCompanionEvent.show().mo199273j(new yn5(0, strM219937g));
    }
}
