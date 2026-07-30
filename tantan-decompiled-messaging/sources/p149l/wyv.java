package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.cryption.EncryptionLevel;
import com.clevertap.android.sdk.cryption.InterfaceC1176c;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class wyv {

    /* JADX INFO: renamed from: a */
    private final CleverTapInstanceConfig f188679a;

    /* JADX INFO: renamed from: b */
    private final Context f188680b;

    /* JADX INFO: renamed from: c */
    private InterfaceC1176c f188681c;

    public wyv(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, InterfaceC1176c interfaceC1176c) {
        this.f188680b = context;
        this.f188679a = cleverTapInstanceConfig;
        this.f188681c = interfaceC1176c;
    }

    /* JADX INFO: renamed from: c */
    private String m206216c() {
        String strM156891k = mxf0.m156891k(this.f188680b, this.f188679a.getAccountId(), Constants.CACHED_GUIDS_KEY, null);
        this.f188679a.log("ON_USER_LOGIN", "getCachedGUIDs:[" + strM156891k + Constants.AES_SUFFIX);
        return strM156891k;
    }

    /* JADX INFO: renamed from: d */
    private int m206217d() {
        int iM156886d = mxf0.m156886d(this.f188680b, this.f188679a.getAccountId(), Constants.CACHED_GUIDS_LENGTH_KEY, 0);
        this.f188679a.log("ON_USER_LOGIN", "Retrieved size of cachedGUIDs: " + iM156886d);
        return iM156886d;
    }

    /* JADX INFO: renamed from: a */
    public void m206218a(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        String str4 = str2 + "_" + str3;
        JSONObject jSONObjectM206221f = m206221f();
        if (jSONObjectM206221f.optString(str4).equals(str)) {
            return;
        }
        try {
            jSONObjectM206221f.put(str4, str);
            m206228m(jSONObjectM206221f.toString(), jSONObjectM206221f.length());
        } catch (Throwable th) {
            this.f188679a.getLogger().verbose(this.f188679a.getAccountId(), "Error caching guid: " + th);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m206219b() {
        boolean z = m206217d() > 1;
        this.f188679a.log("ON_USER_LOGIN", "deviceIsMultiUser:[" + z + Constants.AES_SUFFIX);
        return z;
    }

    /* JADX INFO: renamed from: e */
    public String m206220e() {
        String strM156891k = mxf0.m156891k(this.f188680b, this.f188679a.getAccountId(), Constants.SP_KEY_PROFILE_IDENTITIES, "");
        this.f188679a.log("ON_USER_LOGIN", "getCachedIdentityKeysForAccount:" + strM156891k);
        return strM156891k;
    }

    /* JADX INFO: renamed from: f */
    public JSONObject m206221f() {
        String strM206216c = m206216c();
        if (strM206216c != null) {
            strM206216c = this.f188681c.mo5951d(strM206216c);
        }
        return mv3.m156469h(strM206216c, this.f188679a.getLogger(), this.f188679a.getAccountId());
    }

    /* JADX INFO: renamed from: g */
    public String m206222g(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                String string = m206221f().getString(str + "_" + str2);
                this.f188679a.log("ON_USER_LOGIN", "getGUIDForIdentifier:[Key:" + str + ", value:" + string + Constants.AES_SUFFIX);
                return string;
            } catch (Throwable th) {
                this.f188679a.getLogger().verbose(this.f188679a.getAccountId(), "Error reading guid cache: " + th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m206223h() {
        boolean z = m206217d() == 0;
        this.f188679a.log("ON_USER_LOGIN", "isAnonymousDevice:[" + z + Constants.AES_SUFFIX);
        return z;
    }

    /* JADX INFO: renamed from: i */
    public boolean m206224i() {
        boolean z = m206217d() > 0 && TextUtils.isEmpty(m206220e());
        this.f188679a.log("ON_USER_LOGIN", "isLegacyProfileLoggedIn:" + z);
        return z;
    }

    /* JADX INFO: renamed from: j */
    public void m206225j() {
        try {
            mxf0.m156883A(this.f188680b, this.f188679a.getAccountId(), Constants.CACHED_GUIDS_KEY);
            this.f188679a.log("ON_USER_LOGIN", "removeCachedGUIDs:[]");
        } catch (Throwable th) {
            this.f188679a.getLogger().verbose(this.f188679a.getAccountId(), "Error removing guid cache: " + th);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m206226k(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        JSONObject jSONObjectM206221f = m206221f();
        try {
            Iterator<String> itKeys = jSONObjectM206221f.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.toLowerCase().contains(str2.toLowerCase()) && jSONObjectM206221f.getString(next).equals(str)) {
                    jSONObjectM206221f.remove(next);
                    m206228m(jSONObjectM206221f.toString(), jSONObjectM206221f.length());
                }
            }
        } catch (Throwable th) {
            this.f188679a.getLogger().verbose(this.f188679a.getAccountId(), "Error removing cached key: " + th);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m206227l(String str) {
        mxf0.m156897w(this.f188680b, this.f188679a.getAccountId(), Constants.SP_KEY_PROFILE_IDENTITIES, str);
        this.f188679a.log("ON_USER_LOGIN", "saveIdentityKeysForAccount:" + str);
    }

    /* JADX INFO: renamed from: m */
    public void m206228m(String str, int i) {
        String strMo5950c;
        if (str == null) {
            return;
        }
        if (EncryptionLevel.fromInt(this.f188679a.getEncryptionLevel()) != EncryptionLevel.NONE) {
            strMo5950c = this.f188681c.mo5950c(str);
            if (strMo5950c == null) {
                this.f188681c.mo5949b(false);
            }
        } else {
            strMo5950c = null;
        }
        if (strMo5950c == null) {
            strMo5950c = str;
        }
        mxf0.m156895r(this.f188680b, this.f188679a.getAccountId(), Constants.CACHED_GUIDS_LENGTH_KEY, i);
        this.f188679a.log("ON_USER_LOGIN", "Storing size of cachedGUIDs: " + i);
        if (i == 0) {
            m206225j();
            return;
        }
        mxf0.m156897w(this.f188680b, this.f188679a.getAccountId(), Constants.CACHED_GUIDS_KEY, strMo5950c);
        this.f188679a.log("ON_USER_LOGIN", "setCachedGUIDs:[" + str + Constants.AES_SUFFIX);
    }

    public wyv(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f188680b = context;
        this.f188679a = cleverTapInstanceConfig;
    }
}
