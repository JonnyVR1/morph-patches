package p153l;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public class mcr implements mfm {

    /* JADX INFO: renamed from: a */
    private pfm f135840a;

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f135841b;

    public mcr(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f135841b = cleverTapInstanceConfig;
        m157931c();
    }

    /* JADX INFO: renamed from: c */
    private void m157931c() {
        this.f135840a = pfm.m172135d();
        this.f135841b.log("ON_USER_LOGIN", "LegacyIdentityRepo Setting the default IdentitySet[" + this.f135840a + Constants.AES_SUFFIX);
    }

    @Override // p153l.mfm
    /* JADX INFO: renamed from: a */
    public pfm mo157932a() {
        return this.f135840a;
    }

    @Override // p153l.mfm
    /* JADX INFO: renamed from: b */
    public boolean mo157933b(@NonNull String str) {
        boolean zM172137a = this.f135840a.m172137a(str);
        this.f135841b.log("ON_USER_LOGIN", "isIdentity [Key: " + str + " , Value: " + zM172137a + Constants.AES_SUFFIX);
        return zM172137a;
    }
}
