package p149l;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public class p7y extends sw2 {
    @Override // p149l.szl
    /* JADX INFO: renamed from: a */
    public boolean mo132806a(Context context) {
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.setClassName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity");
            intent.putExtra(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, context.getPackageName());
            intent.setFlags(268435456);
            if (bne0.m102779h(context, intent)) {
                context.startActivity(intent);
                return true;
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        return rqi.m180452c(context);
    }

    @Override // p149l.szl
    public boolean isSupported() {
        return true;
    }
}
