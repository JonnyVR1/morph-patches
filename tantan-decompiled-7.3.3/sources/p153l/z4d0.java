package p153l;

import android.content.Context;
import android.graphics.Color;
import com.idv.identity.platform.api.IdentityPlatform;
import com.idv.identity.platform.log.RecordService;

/* JADX INFO: loaded from: classes7.dex */
public class z4d0 {
    /* JADX INFO: renamed from: a */
    public static int m218573a(Context context, int i) {
        if (context == null) {
            return i;
        }
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public static int m218574b(int i) {
        Context contextM218575c = m218575c();
        if (contextM218575c != null) {
            return contextM218575c.getResources().getColor(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    private static Context m218575c() {
        return IdentityPlatform.getInstance().getCtx();
    }

    /* JADX INFO: renamed from: d */
    public static int m218576d(String str, int i) {
        if (str != null) {
            try {
                return Color.parseColor(str);
            } catch (Throwable th) {
                RecordService.getInstance().recordException(th);
            }
        }
        return m218574b(i);
    }

    /* JADX INFO: renamed from: e */
    public static String[] m218577e(int i) {
        Context contextM218575c = m218575c();
        return contextM218575c != null ? contextM218575c.getResources().getStringArray(i) : new String[0];
    }
}
