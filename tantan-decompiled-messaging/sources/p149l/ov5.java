package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.ValidationError;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ov5 implements wcm {

    /* JADX INFO: renamed from: a */
    private zcm f145764a;

    /* JADX INFO: renamed from: b */
    private final wyv f145765b;

    /* JADX INFO: renamed from: c */
    private final CleverTapInstanceConfig f145766c;

    /* JADX INFO: renamed from: d */
    private final ork0 f145767d;

    public ov5(CleverTapInstanceConfig cleverTapInstanceConfig, wyv wyvVar, ork0 ork0Var) {
        this.f145766c = cleverTapInstanceConfig;
        this.f145765b = wyvVar;
        this.f145767d = ork0Var;
        m166154d();
    }

    /* JADX INFO: renamed from: c */
    private void m166153c(zcm zcmVar, zcm zcmVar2) {
        if (!zcmVar.m218072f() || !zcmVar2.m218072f() || zcmVar.equals(zcmVar2)) {
            this.f145766c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoNo error found while comparing [Pref:" + zcmVar + "], [Config:" + zcmVar2 + Constants.AES_SUFFIX);
            return;
        }
        this.f145767d.m165676c(nrk0.m160744a(ValidationError.PROFILE_IDENTIFIERS_MISMATCH, new String[0]));
        this.f145766c.log("ON_USER_LOGIN", "ConfigurableIdentityRepopushing error due to mismatch [Pref:" + zcmVar + "], [Config:" + zcmVar2 + Constants.AES_SUFFIX);
    }

    @Override // p149l.wcm
    /* JADX INFO: renamed from: a */
    public zcm mo145177a() {
        return this.f145764a;
    }

    @Override // p149l.wcm
    /* JADX INFO: renamed from: b */
    public boolean mo145178b(@NonNull String str) {
        boolean zM218071a = this.f145764a.m218071a(str);
        this.f145766c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoisIdentity [Key: " + str + " , Value: " + zM218071a + Constants.AES_SUFFIX);
        return zM218071a;
    }

    /* JADX INFO: renamed from: d */
    public void m166154d() {
        zcm zcmVarM218067b = zcm.m218067b(this.f145765b.m206220e());
        this.f145766c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoPrefIdentitySet [" + zcmVarM218067b + Constants.AES_SUFFIX);
        zcm zcmVarM218068c = zcm.m218068c(this.f145766c.getIdentityKeys());
        this.f145766c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoConfigIdentitySet [" + zcmVarM218068c + Constants.AES_SUFFIX);
        m166153c(zcmVarM218067b, zcmVarM218068c);
        if (zcmVarM218067b.m218072f()) {
            this.f145764a = zcmVarM218067b;
            this.f145766c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoIdentity Set activated from Pref[" + this.f145764a + Constants.AES_SUFFIX);
        } else if (zcmVarM218068c.m218072f()) {
            this.f145764a = zcmVarM218068c;
            this.f145766c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoIdentity Set activated from Config[" + this.f145764a + Constants.AES_SUFFIX);
        } else {
            this.f145764a = zcm.m218069d();
            this.f145766c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoIdentity Set activated from Default[" + this.f145764a + Constants.AES_SUFFIX);
        }
        if (zcmVarM218067b.m218072f()) {
            return;
        }
        String string = this.f145764a.toString();
        this.f145765b.m206227l(string);
        this.f145766c.log("ON_USER_LOGIN", "ConfigurableIdentityRepoSaving Identity Keys in Pref[" + string + Constants.AES_SUFFIX);
    }
}
