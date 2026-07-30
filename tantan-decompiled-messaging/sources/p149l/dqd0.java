package p149l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes5.dex */
public class dqd0 extends uqd0 {
    public dqd0(String str) {
        super(str, null);
    }

    @Override // p149l.uqd0, p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: a */
    public String retrieveValue() {
        return pref().getString(this.f98687id, (String) defaultValue());
    }

    @Override // p149l.uqd0, p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: b */
    public SharedPreferences.Editor saveValue(String str) {
        return pref().edit().putString(this.f98687id, str);
    }

    /* JADX INFO: renamed from: c */
    public String m113002c() {
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
    public double m113003d() {
        String str = get();
        if (TextUtils.isEmpty(str)) {
            return -1.0d;
        }
        return Double.parseDouble(str.split(Constants.SEPARATOR_COMMA)[0]);
    }

    /* JADX INFO: renamed from: e */
    public double m113004e() {
        String str = get();
        if (TextUtils.isEmpty(str)) {
            return -1.0d;
        }
        return Double.parseDouble(str.split(Constants.SEPARATOR_COMMA)[1]);
    }

    /* JADX INFO: renamed from: f */
    public boolean m113005f() {
        return m113003d() >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && m113004e() >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: g */
    public boolean m113006g(double d, double d2, String str) {
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
