package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.ValidationError;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class tw5 implements mfm {

    /* JADX INFO: renamed from: a */
    private pfm f176373a;

    /* JADX INFO: renamed from: b */
    private final u0w f176374b;

    /* JADX INFO: renamed from: c */
    private final CleverTapInstanceConfig f176375c;

    /* JADX INFO: renamed from: d */
    private final u0l0 f176376d;

    public tw5(CleverTapInstanceConfig cleverTapInstanceConfig, u0w u0wVar, u0l0 u0l0Var) {
        this.f176375c = cleverTapInstanceConfig;
        this.f176374b = u0wVar;
        this.f176376d = u0l0Var;
        m193344d();
    }

    /* JADX INFO: renamed from: c */
    private void m193343c(pfm pfmVar, pfm pfmVar2) {
        if (!pfmVar.m172138f() || !pfmVar2.m172138f() || pfmVar.equals(pfmVar2)) {
            this.f176375c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoNo error found while comparing [Pref:" + pfmVar + "], [Config:" + pfmVar2 + Constants.AES_SUFFIX);
            return;
        }
        this.f176376d.m193845c(t0l0.m188803a(ValidationError.PROFILE_IDENTIFIERS_MISMATCH, new String[0]));
        this.f176375c.log("ON_USER_LOGIN", "ConfigurableIdentityRepopushing error due to mismatch [Pref:" + pfmVar + "], [Config:" + pfmVar2 + Constants.AES_SUFFIX);
    }

    @Override // p153l.mfm
    /* JADX INFO: renamed from: a */
    public pfm mo157932a() {
        return this.f176373a;
    }

    @Override // p153l.mfm
    /* JADX INFO: renamed from: b */
    public boolean mo157933b(@NonNull String str) {
        boolean zM172137a = this.f176373a.m172137a(str);
        this.f176375c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoisIdentity [Key: " + str + " , Value: " + zM172137a + Constants.AES_SUFFIX);
        return zM172137a;
    }

    /* JADX INFO: renamed from: d */
    public void m193344d() {
        pfm pfmVarM172133b = pfm.m172133b(this.f176374b.m193876e());
        this.f176375c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoPrefIdentitySet [" + pfmVarM172133b + Constants.AES_SUFFIX);
        pfm pfmVarM172134c = pfm.m172134c(this.f176375c.getIdentityKeys());
        this.f176375c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoConfigIdentitySet [" + pfmVarM172134c + Constants.AES_SUFFIX);
        m193343c(pfmVarM172133b, pfmVarM172134c);
        if (pfmVarM172133b.m172138f()) {
            this.f176373a = pfmVarM172133b;
            this.f176375c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoIdentity Set activated from Pref[" + this.f176373a + Constants.AES_SUFFIX);
        } else if (pfmVarM172134c.m172138f()) {
            this.f176373a = pfmVarM172134c;
            this.f176375c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoIdentity Set activated from Config[" + this.f176373a + Constants.AES_SUFFIX);
        } else {
            this.f176373a = pfm.m172135d();
            this.f176375c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoIdentity Set activated from Default[" + this.f176373a + Constants.AES_SUFFIX);
        }
        if (pfmVarM172133b.m172138f()) {
            return;
        }
        String string = this.f176373a.toString();
        this.f176374b.m193883l(string);
        this.f176375c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoSaving Identity Keys in Pref[" + string + Constants.AES_SUFFIX);
    }
}
