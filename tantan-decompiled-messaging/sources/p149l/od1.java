package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes6.dex */
public final class od1 {

    /* JADX INFO: renamed from: a */
    public static final Api.ClientKey<zhy0> f143141a;

    /* JADX INFO: renamed from: b */
    public static final Api.ClientKey<n9x0> f143142b;

    /* JADX INFO: renamed from: c */
    public static final Api.AbstractClientBuilder<zhy0, C18894a> f143143c;

    /* JADX INFO: renamed from: d */
    public static final Api.AbstractClientBuilder<n9x0, GoogleSignInOptions> f143144d;

    /* JADX INFO: renamed from: e */
    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static final Api<sd1> f143145e;

    /* JADX INFO: renamed from: f */
    public static final Api<C18894a> f143146f;

    /* JADX INFO: renamed from: g */
    public static final Api<GoogleSignInOptions> f143147g;

    /* JADX INFO: renamed from: h */
    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static final gza0 f143148h;

    /* JADX INFO: renamed from: i */
    public static final ytb f143149i;

    /* JADX INFO: renamed from: j */
    public static final o4k f143150j;

    static {
        Api.ClientKey<zhy0> clientKey = new Api.ClientKey<>();
        f143141a = clientKey;
        Api.ClientKey<n9x0> clientKey2 = new Api.ClientKey<>();
        f143142b = clientKey2;
        jxs0 jxs0Var = new jxs0();
        f143143c = jxs0Var;
        wvt0 wvt0Var = new wvt0();
        f143144d = wvt0Var;
        f143145e = rd1.f158853c;
        f143146f = new Api<>("Auth.CREDENTIALS_API", jxs0Var, clientKey);
        f143147g = new Api<>("Auth.GOOGLE_SIGN_IN_API", wvt0Var, clientKey2);
        f143148h = rd1.f158854d;
        f143149i = new mpx0();
        f143150j = new btu0();
    }

    /* JADX INFO: renamed from: l.od1$a */
    @Deprecated
    public static class C18894a implements Api.ApiOptions.Optional {

        /* JADX INFO: renamed from: d */
        public static final C18894a f143151d = new a().mo98961b();

        /* JADX INFO: renamed from: a */
        public final String f143152a;

        /* JADX INFO: renamed from: b */
        public final boolean f143153b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final String f143154c;

        public C18894a(a aVar) {
            this.f143152a = aVar.f143155a;
            this.f143153b = aVar.f143156b.booleanValue();
            this.f143154c = aVar.f143157c;
        }

        /* JADX INFO: renamed from: a */
        public final Bundle m163645a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.f143152a);
            bundle.putBoolean("force_save_dialog", this.f143153b);
            bundle.putString("log_session_id", this.f143154c);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C18894a)) {
                return false;
            }
            C18894a c18894a = (C18894a) obj;
            return Objects.equal(this.f143152a, c18894a.f143152a) && this.f143153b == c18894a.f143153b && Objects.equal(this.f143154c, c18894a.f143154c);
        }

        public int hashCode() {
            return Objects.hashCode(this.f143152a, Boolean.valueOf(this.f143153b), this.f143154c);
        }

        /* JADX INFO: renamed from: l.od1$a$a */
        @Deprecated
        public static class a {

            /* JADX INFO: renamed from: a */
            public String f143155a;

            /* JADX INFO: renamed from: b */
            public Boolean f143156b;

            /* JADX INFO: renamed from: c */
            @Nullable
            public String f143157c;

            @ShowFirstParty
            public a(C18894a c18894a) {
                this.f143156b = Boolean.FALSE;
                this.f143155a = c18894a.f143152a;
                this.f143156b = Boolean.valueOf(c18894a.f143153b);
                this.f143157c = c18894a.f143154c;
            }

            @ShowFirstParty
            /* JADX INFO: renamed from: a */
            public a mo98960a(String str) {
                this.f143157c = str;
                return this;
            }

            @ShowFirstParty
            /* JADX INFO: renamed from: b */
            public C18894a mo98961b() {
                return new C18894a(this);
            }

            public a() {
                this.f143156b = Boolean.FALSE;
            }
        }
    }
}
