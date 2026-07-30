package p153l;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class yd1 {

    /* JADX INFO: renamed from: a */
    public static final Api.ClientKey<aor0> f198563a;

    /* JADX INFO: renamed from: b */
    public static final Api.AbstractClientBuilder<aor0, zd1> f198564b;

    /* JADX INFO: renamed from: c */
    @KeepForSdk
    public static final Api<zd1> f198565c;

    /* JADX INFO: renamed from: d */
    @KeepForSdk
    public static final k7b0 f198566d;

    static {
        Api.ClientKey<aor0> clientKey = new Api.ClientKey<>();
        f198563a = clientKey;
        c9r0 c9r0Var = new c9r0();
        f198564b = c9r0Var;
        f198565c = new Api<>("Auth.PROXY_API", c9r0Var, clientKey);
        f198566d = new mxr0();
    }
}
