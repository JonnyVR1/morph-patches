package p153l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes6.dex */
public final class j7r0 {

    /* JADX INFO: renamed from: a */
    public static final Api.ClientKey f118705a;

    /* JADX INFO: renamed from: b */
    @ShowFirstParty
    public static final Api.ClientKey f118706b;

    /* JADX INFO: renamed from: c */
    public static final Api.AbstractClientBuilder f118707c;

    /* JADX INFO: renamed from: d */
    public static final Api.AbstractClientBuilder f118708d;

    /* JADX INFO: renamed from: e */
    public static final Scope f118709e;

    /* JADX INFO: renamed from: f */
    public static final Scope f118710f;

    /* JADX INFO: renamed from: g */
    public static final Api f118711g;

    /* JADX INFO: renamed from: h */
    public static final Api f118712h;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f118705a = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f118706b = clientKey2;
        u6r0 u6r0Var = new u6r0();
        f118707c = u6r0Var;
        y6r0 y6r0Var = new y6r0();
        f118708d = y6r0Var;
        f118709e = new Scope("profile");
        f118710f = new Scope("email");
        f118711g = new Api("SignIn.API", u6r0Var, clientKey);
        f118712h = new Api("SignIn.INTERNAL_API", y6r0Var, clientKey2);
    }
}
