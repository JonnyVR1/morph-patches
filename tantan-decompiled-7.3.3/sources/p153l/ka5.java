package p153l;

import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.network.ApiExcep;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class ka5 implements azm {

    /* JADX INFO: renamed from: a */
    public static String f124624a = "";

    @Override // p153l.azm
    public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
        i5d0 i5d0VarMo101076a = interfaceC15867a.mo101076a(interfaceC15867a.request());
        if (!User.ID_TEAM_ACCOUNT.equals(i5d0VarMo101076a.m138675u("Putong-Client-Version-Expires-At"))) {
            return i5d0VarMo101076a;
        }
        f124624a = i5d0VarMo101076a.m138675u("Putong-Client-Latest-Version-Path");
        throw new ApiExcep.ClientExpired(i5d0VarMo101076a);
    }
}
