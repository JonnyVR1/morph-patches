package p149l;

import android.content.Context;
import android.graphics.Color;
import com.idv.identity.platform.api.IdentityPlatform;
import com.idv.identity.platform.log.RecordService;

/* JADX INFO: loaded from: classes7.dex */
public class vwc0 {
    /* JADX INFO: renamed from: a */
    public static int m200355a(Context context, int i) {
        if (context == null) {
            return i;
        }
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public static int m200356b(int i) {
        Context contextM200357c = m200357c();
        if (contextM200357c != null) {
            return contextM200357c.getResources().getColor(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    private static Context m200357c() {
        return IdentityPlatform.getInstance().getCtx();
    }

    /* JADX INFO: renamed from: d */
    public static int m200358d(String str, int i) {
        if (str != null) {
            try {
                return Color.parseColor(str);
            } catch (Throwable th) {
                RecordService.getInstance().recordException(th);
            }
        }
        return m200356b(i);
    }

    /* JADX INFO: renamed from: e */
    public static String[] m200359e(int i) {
        Context contextM200357c = m200357c();
        return contextM200357c != null ? contextM200357c.getResources().getStringArray(i) : new String[0];
    }
}
