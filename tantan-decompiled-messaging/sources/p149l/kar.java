package p149l;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public class kar implements wcm {

    /* JADX INFO: renamed from: a */
    private zcm f122143a;

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f122144b;

    public kar(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f122144b = cleverTapInstanceConfig;
        m145176c();
    }

    /* JADX INFO: renamed from: c */
    private void m145176c() {
        this.f122143a = zcm.m218069d();
        this.f122144b.log("ON_USER_LOGIN", "LegacyIdentityRepo Setting the default IdentitySet[" + this.f122143a + Constants.AES_SUFFIX);
    }

    @Override // p149l.wcm
    /* JADX INFO: renamed from: a */
    public zcm mo145177a() {
        return this.f122143a;
    }

    @Override // p149l.wcm
    /* JADX INFO: renamed from: b */
    public boolean mo145178b(@NonNull String str) {
        boolean zM218071a = this.f122143a.m218071a(str);
        this.f122144b.log("ON_USER_LOGIN", "isIdentity [Key: " + str + " , Value: " + zM218071a + Constants.AES_SUFFIX);
        return zM218071a;
    }
}
