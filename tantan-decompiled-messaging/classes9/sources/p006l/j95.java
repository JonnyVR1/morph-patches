package p006l;

import com.tantanapp.common.network.ApiExcep;
import java.io.IOException;
import l.axm;
import l.exc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class j95 implements axm {

    /* JADX INFO: renamed from: a */
    public static String f15073a = "";

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.network.ApiExcep$ClientExpired */
    public exc0 intercept(axm.a aVar) throws IOException, ApiExcep.ClientExpired {
        exc0 exc0VarA = aVar.a(aVar.request());
        if (!"-1".equals(exc0VarA.u("Putong-Client-Version-Expires-At"))) {
            return exc0VarA;
        }
        f15073a = exc0VarA.u("Putong-Client-Latest-Version-Path");
        throw new ApiExcep.ClientExpired(exc0VarA);
    }
}
