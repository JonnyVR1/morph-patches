package p149l;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class rd1 {

    /* JADX INFO: renamed from: a */
    public static final Api.ClientKey<uer0> f158851a;

    /* JADX INFO: renamed from: b */
    public static final Api.AbstractClientBuilder<uer0, sd1> f158852b;

    /* JADX INFO: renamed from: c */
    @KeepForSdk
    public static final Api<sd1> f158853c;

    /* JADX INFO: renamed from: d */
    @KeepForSdk
    public static final gza0 f158854d;

    static {
        Api.ClientKey<uer0> clientKey = new Api.ClientKey<>();
        f158851a = clientKey;
        wzq0 wzq0Var = new wzq0();
        f158852b = wzq0Var;
        f158853c = new Api<>("Auth.PROXY_API", wzq0Var, clientKey);
        f158854d = new gor0();
    }
}
