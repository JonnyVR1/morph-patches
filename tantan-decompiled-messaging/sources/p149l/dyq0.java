package p149l;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes6.dex */
public final class dyq0 {

    /* JADX INFO: renamed from: a */
    public static final Api.ClientKey f88416a;

    /* JADX INFO: renamed from: b */
    @ShowFirstParty
    public static final Api.ClientKey f88417b;

    /* JADX INFO: renamed from: c */
    public static final Api.AbstractClientBuilder f88418c;

    /* JADX INFO: renamed from: d */
    public static final Api.AbstractClientBuilder f88419d;

    /* JADX INFO: renamed from: e */
    public static final Scope f88420e;

    /* JADX INFO: renamed from: f */
    public static final Scope f88421f;

    /* JADX INFO: renamed from: g */
    public static final Api f88422g;

    /* JADX INFO: renamed from: h */
    public static final Api f88423h;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f88416a = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f88417b = clientKey2;
        oxq0 oxq0Var = new oxq0();
        f88418c = oxq0Var;
        sxq0 sxq0Var = new sxq0();
        f88419d = sxq0Var;
        f88420e = new Scope("profile");
        f88421f = new Scope("email");
        f88422g = new Api("SignIn.API", oxq0Var, clientKey);
        f88423h = new Api("SignIn.INTERNAL_API", sxq0Var, clientKey2);
    }
}
