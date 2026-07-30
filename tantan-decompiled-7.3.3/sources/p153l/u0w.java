package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.cryption.EncryptionLevel;
import com.clevertap.android.sdk.cryption.InterfaceC1199c;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class u0w {

    /* JADX INFO: renamed from: a */
    private final CleverTapInstanceConfig f176945a;

    /* JADX INFO: renamed from: b */
    private final Context f176946b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1199c f176947c;

    public u0w(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, InterfaceC1199c interfaceC1199c) {
        this.f176946b = context;
        this.f176945a = cleverTapInstanceConfig;
        this.f176947c = interfaceC1199c;
    }

    /* JADX INFO: renamed from: c */
    private String m193872c() {
        String strM199857k = v5g0.m199857k(this.f176946b, this.f176945a.getAccountId(), Constants.CACHED_GUIDS_KEY, null);
        this.f176945a.log("ON_USER_LOGIN", "getCachedGUIDs:[" + strM199857k + Constants.AES_SUFFIX);
        return strM199857k;
    }

    /* JADX INFO: renamed from: d */
    private int m193873d() {
        int iM199852d = v5g0.m199852d(this.f176946b, this.f176945a.getAccountId(), Constants.CACHED_GUIDS_LENGTH_KEY, 0);
        this.f176945a.log("ON_USER_LOGIN", "Retrieved size of cachedGUIDs: " + iM199852d);
        return iM199852d;
    }

    /* JADX INFO: renamed from: a */
    public void m193874a(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        String str4 = str2 + "_" + str3;
        JSONObject jSONObjectM193877f = m193877f();
        if (jSONObjectM193877f.optString(str4).equals(str)) {
            return;
        }
        try {
            jSONObjectM193877f.put(str4, str);
            m193884m(jSONObjectM193877f.toString(), jSONObjectM193877f.length());
        } catch (Throwable th) {
            this.f176945a.getLogger().verbose(this.f176945a.getAccountId(), "Error caching guid: " + th);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m193875b() {
        boolean z = m193873d() > 1;
        this.f176945a.log("ON_USER_LOGIN", "deviceIsMultiUser:[" + z + Constants.AES_SUFFIX);
        return z;
    }

    /* JADX INFO: renamed from: e */
    public String m193876e() {
        String strM199857k = v5g0.m199857k(this.f176946b, this.f176945a.getAccountId(), Constants.SP_KEY_PROFILE_IDENTITIES, "");
        this.f176945a.log("ON_USER_LOGIN", "getCachedIdentityKeysForAccount:" + strM199857k);
        return strM199857k;
    }

    /* JADX INFO: renamed from: f */
    public JSONObject m193877f() {
        String strM193872c = m193872c();
        if (strM193872c != null) {
            strM193872c = this.f176947c.mo6005d(strM193872c);
        }
        return lw3.m156027h(strM193872c, this.f176945a.getLogger(), this.f176945a.getAccountId());
    }

    /* JADX INFO: renamed from: g */
    public String m193878g(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                String string = m193877f().getString(str + "_" + str2);
                this.f176945a.log("ON_USER_LOGIN", "getGUIDForIdentifier:[Key:" + str + ", value:" + string + Constants.AES_SUFFIX);
                return string;
            } catch (Throwable th) {
                this.f176945a.getLogger().verbose(this.f176945a.getAccountId(), "Error reading guid cache: " + th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m193879h() {
        boolean z = m193873d() == 0;
        this.f176945a.log("ON_USER_LOGIN", "isAnonymousDevice:[" + z + Constants.AES_SUFFIX);
        return z;
    }

    /* JADX INFO: renamed from: i */
    public boolean m193880i() {
        boolean z = m193873d() > 0 && TextUtils.isEmpty(m193876e());
        this.f176945a.log("ON_USER_LOGIN", "isLegacyProfileLoggedIn:" + z);
        return z;
    }

    /* JADX INFO: renamed from: j */
    public void m193881j() {
        try {
            v5g0.m199849A(this.f176946b, this.f176945a.getAccountId(), Constants.CACHED_GUIDS_KEY);
            this.f176945a.log("ON_USER_LOGIN", "removeCachedGUIDs:[]");
        } catch (Throwable th) {
            this.f176945a.getLogger().verbose(this.f176945a.getAccountId(), "Error removing guid cache: " + th);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m193882k(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        JSONObject jSONObjectM193877f = m193877f();
        try {
            Iterator<String> itKeys = jSONObjectM193877f.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.toLowerCase().contains(str2.toLowerCase()) && jSONObjectM193877f.getString(next).equals(str)) {
                    jSONObjectM193877f.remove(next);
                    m193884m(jSONObjectM193877f.toString(), jSONObjectM193877f.length());
                }
            }
        } catch (Throwable th) {
            this.f176945a.getLogger().verbose(this.f176945a.getAccountId(), "Error removing cached key: " + th);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m193883l(String str) {
        v5g0.m199863w(this.f176946b, this.f176945a.getAccountId(), Constants.SP_KEY_PROFILE_IDENTITIES, str);
        this.f176945a.log("ON_USER_LOGIN", "saveIdentityKeysForAccount:" + str);
    }

    /* JADX INFO: renamed from: m */
    public void m193884m(String str, int i) {
        String strMo6004c;
        if (str == null) {
            return;
        }
        if (EncryptionLevel.fromInt(this.f176945a.getEncryptionLevel()) != EncryptionLevel.NONE) {
            strMo6004c = this.f176947c.mo6004c(str);
            if (strMo6004c == null) {
                this.f176947c.mo6003b(false);
            }
        } else {
            strMo6004c = null;
        }
        if (strMo6004c == null) {
            strMo6004c = str;
        }
        v5g0.m199861r(this.f176946b, this.f176945a.getAccountId(), Constants.CACHED_GUIDS_LENGTH_KEY, i);
        this.f176945a.log("ON_USER_LOGIN", "Storing size of cachedGUIDs: " + i);
        if (i == 0) {
            m193881j();
            return;
        }
        v5g0.m199863w(this.f176946b, this.f176945a.getAccountId(), Constants.CACHED_GUIDS_KEY, strMo6004c);
        this.f176945a.log("ON_USER_LOGIN", "setCachedGUIDs:[" + str + Constants.AES_SUFFIX);
    }

    public u0w(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f176946b = context;
        this.f176945a = cleverTapInstanceConfig;
    }
}
