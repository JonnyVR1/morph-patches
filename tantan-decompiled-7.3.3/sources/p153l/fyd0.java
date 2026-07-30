package p153l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes5.dex */
public class fyd0 extends wyd0 {
    public fyd0(String str) {
        super(str, null);
    }

    @Override // p153l.wyd0, p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: a */
    public String retrieveValue() {
        return pref().getString(this.f111993id, (String) defaultValue());
    }

    @Override // p153l.wyd0, p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: b */
    public SharedPreferences.Editor saveValue(String str) {
        return pref().edit().putString(this.f111993id, str);
    }

    /* JADX INFO: renamed from: c */
    public String m128082c() {
        String str = get();
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA);
            if (strArrSplit.length == 3) {
                return strArrSplit[2];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public double m128083d() {
        String str = get();
        if (TextUtils.isEmpty(str)) {
            return -1.0d;
        }
        return Double.parseDouble(str.split(Constants.SEPARATOR_COMMA)[0]);
    }

    /* JADX INFO: renamed from: e */
    public double m128084e() {
        String str = get();
        if (TextUtils.isEmpty(str)) {
            return -1.0d;
        }
        return Double.parseDouble(str.split(Constants.SEPARATOR_COMMA)[1]);
    }

    /* JADX INFO: renamed from: f */
    public boolean m128085f() {
        return m128083d() >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && m128084e() >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: g */
    public boolean m128086g(double d, double d2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(d2);
        if (!TextUtils.isEmpty(str)) {
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append(str);
        }
        return put(sb.toString());
    }
}
