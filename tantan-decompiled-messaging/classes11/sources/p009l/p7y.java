package p009l;

import android.content.Context;
import android.content.Intent;
import com.tantanapp.common.utils.CrashHelper;
import l.bne0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class p7y extends sw2 {
    @Override // p009l.szl
    /* JADX INFO: renamed from: a */
    public boolean mo15948a(Context context) {
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.setClassName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity");
            intent.putExtra("packageName", context.getPackageName());
            intent.setFlags(268435456);
            if (bne0.h(context, intent)) {
                context.startActivity(intent);
                return true;
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        return rqi.m21777c(context);
    }

    @Override // p009l.szl
    public boolean isSupported() {
        return true;
    }
}
