package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class njt0 {

    /* JADX INFO: renamed from: b */
    public static njt0 f142344b;

    /* JADX INFO: renamed from: a */
    public String f142345a;

    /* JADX INFO: renamed from: a */
    public static njt0 m163465a() {
        if (f142344b == null) {
            f142344b = new njt0();
        }
        return f142344b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX INFO: renamed from: b */
    public final void m163466b(Context context) {
        SharedPreferences.Editor editorPutString;
        d2v0.m113737k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f142345a)) {
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (ClientLibraryUtils.isPackageSide()) {
                editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    editorPutString.apply();
                } else {
                    SharedPreferencesUtils.publishWorldReadableSharedPreferences(context, editorPutString, "admob_user_agent");
                }
            } else if (remoteContext == null) {
                remoteContext = null;
                editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    editorPutString.apply();
                } else {
                    SharedPreferencesUtils.publishWorldReadableSharedPreferences(context, editorPutString, "admob_user_agent");
                }
            }
            this.f142345a = defaultUserAgent;
        }
        d2v0.m113737k("User agent is updated.");
    }
}
