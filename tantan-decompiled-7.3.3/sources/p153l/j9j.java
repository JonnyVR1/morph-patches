package p153l;

import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class j9j implements azm {
    @Override // p153l.azm
    public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
        x1d0 x1d0VarRequest = interfaceC15867a.request();
        if (TextUtils.isEmpty(x1d0VarRequest.m209026k().m182271A("webApiFlag"))) {
            return interfaceC15867a.mo101076a(ak20.m98541a(x1d0VarRequest.m209023h()).m209028b());
        }
        x1d0.C21228a c21228aM98541a = ak20.m98541a(x1d0VarRequest.m209023h());
        rnl rnlVarM182301d = x1d0VarRequest.m209026k().m182288p().m182314t("webApiFlag").m182301d();
        c21228aM98541a.m209027a("Authorization", irq.m141843d(rnlVarM182301d.toString(), ""));
        return interfaceC15867a.mo101076a(c21228aM98541a.m209045s(rnlVarM182301d).m209028b());
    }
}
