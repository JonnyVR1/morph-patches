package p149l;

import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.network.ApiExcep;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class j95 implements axm {

    /* JADX INFO: renamed from: a */
    public static String f116861a = "";

    @Override // p149l.axm
    public exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws IOException {
        exc0 exc0VarMo99454a = interfaceC15754a.mo99454a(interfaceC15754a.request());
        if (!User.ID_TEAM_ACCOUNT.equals(exc0VarMo99454a.m118611u("Putong-Client-Version-Expires-At"))) {
            return exc0VarMo99454a;
        }
        f116861a = exc0VarMo99454a.m118611u("Putong-Client-Latest-Version-Path");
        throw new ApiExcep.ClientExpired(exc0VarMo99454a);
    }
}
