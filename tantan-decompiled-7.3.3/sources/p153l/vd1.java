package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes6.dex */
public final class vd1 {

    /* JADX INFO: renamed from: a */
    public static final Api.ClientKey<fry0> f183509a;

    /* JADX INFO: renamed from: b */
    public static final Api.ClientKey<tix0> f183510b;

    /* JADX INFO: renamed from: c */
    public static final Api.AbstractClientBuilder<fry0, C20811a> f183511c;

    /* JADX INFO: renamed from: d */
    public static final Api.AbstractClientBuilder<tix0, GoogleSignInOptions> f183512d;

    /* JADX INFO: renamed from: e */
    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static final Api<zd1> f183513e;

    /* JADX INFO: renamed from: f */
    public static final Api<C20811a> f183514f;

    /* JADX INFO: renamed from: g */
    public static final Api<GoogleSignInOptions> f183515g;

    /* JADX INFO: renamed from: h */
    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static final k7b0 f183516h;

    /* JADX INFO: renamed from: i */
    public static final mvb f183517i;

    /* JADX INFO: renamed from: j */
    public static final g7k f183518j;

    static {
        Api.ClientKey<fry0> clientKey = new Api.ClientKey<>();
        f183509a = clientKey;
        Api.ClientKey<tix0> clientKey2 = new Api.ClientKey<>();
        f183510b = clientKey2;
        p6t0 p6t0Var = new p6t0();
        f183511c = p6t0Var;
        c5u0 c5u0Var = new c5u0();
        f183512d = c5u0Var;
        f183513e = yd1.f198565c;
        f183514f = new Api<>("Auth.CREDENTIALS_API", p6t0Var, clientKey);
        f183515g = new Api<>("Auth.GOOGLE_SIGN_IN_API", c5u0Var, clientKey2);
        f183516h = yd1.f198566d;
        f183517i = new syx0();
        f183518j = new h2v0();
    }

    /* JADX INFO: renamed from: l.vd1$a */
    @Deprecated
    public static class C20811a implements Api.ApiOptions.Optional {

        /* JADX INFO: renamed from: d */
        public static final C20811a f183519d = new a().mo169428b();

        /* JADX INFO: renamed from: a */
        public final String f183520a;

        /* JADX INFO: renamed from: b */
        public final boolean f183521b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final String f183522c;

        public C20811a(a aVar) {
            this.f183520a = aVar.f183523a;
            this.f183521b = aVar.f183524b.booleanValue();
            this.f183522c = aVar.f183525c;
        }

        /* JADX INFO: renamed from: a */
        public final Bundle m200906a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.f183520a);
            bundle.putBoolean("force_save_dialog", this.f183521b);
            bundle.putString("log_session_id", this.f183522c);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C20811a)) {
                return false;
            }
            C20811a c20811a = (C20811a) obj;
            return Objects.equal(this.f183520a, c20811a.f183520a) && this.f183521b == c20811a.f183521b && Objects.equal(this.f183522c, c20811a.f183522c);
        }

        public int hashCode() {
            return Objects.hashCode(this.f183520a, Boolean.valueOf(this.f183521b), this.f183522c);
        }

        /* JADX INFO: renamed from: l.vd1$a$a */
        @Deprecated
        public static class a {

            /* JADX INFO: renamed from: a */
            public String f183523a;

            /* JADX INFO: renamed from: b */
            public Boolean f183524b;

            /* JADX INFO: renamed from: c */
            @Nullable
            public String f183525c;

            @ShowFirstParty
            public a(C20811a c20811a) {
                this.f183524b = Boolean.FALSE;
                this.f183523a = c20811a.f183520a;
                this.f183524b = Boolean.valueOf(c20811a.f183521b);
                this.f183525c = c20811a.f183522c;
            }

            @ShowFirstParty
            /* JADX INFO: renamed from: a */
            public a mo169427a(String str) {
                this.f183525c = str;
                return this;
            }

            @ShowFirstParty
            /* JADX INFO: renamed from: b */
            public C20811a mo169428b() {
                return new C20811a(this);
            }

            public a() {
                this.f183524b = Boolean.FALSE;
            }
        }
    }
}
