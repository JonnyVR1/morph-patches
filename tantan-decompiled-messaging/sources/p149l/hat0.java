package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class hat0 {

    /* JADX INFO: renamed from: b */
    public static hat0 f106836b;

    /* JADX INFO: renamed from: a */
    public String f106837a;

    /* JADX INFO: renamed from: a */
    public static hat0 m130199a() {
        if (f106836b == null) {
            f106836b = new hat0();
        }
        return f106836b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX INFO: renamed from: b */
    public final void m130200b(Context context) {
        SharedPreferences.Editor editorPutString;
        xsu0.m210834k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f106837a)) {
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
            this.f106837a = defaultUserAgent;
        }
        xsu0.m210834k("User agent is updated.");
    }
}
