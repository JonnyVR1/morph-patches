package p149l;

import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class p6j implements axm {
    @Override // p149l.axm
    public exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws IOException {
        stc0 stc0VarRequest = interfaceC15754a.request();
        if (TextUtils.isEmpty(stc0VarRequest.m185881k().m107507A("webApiFlag"))) {
            return interfaceC15754a.mo99454a(rb20.m178552a(stc0VarRequest.m185878h()).m185883b());
        }
        stc0.C20027a c20027aM178552a = rb20.m178552a(stc0VarRequest.m185878h());
        cll cllVarM107537d = stc0VarRequest.m185881k().m107524p().m107550t("webApiFlag").m107537d();
        c20027aM178552a.m185882a("Authorization", ipq.m137568d(cllVarM107537d.toString(), ""));
        return interfaceC15754a.mo99454a(c20027aM178552a.m185900s(cllVarM107537d).m185883b());
    }
}
