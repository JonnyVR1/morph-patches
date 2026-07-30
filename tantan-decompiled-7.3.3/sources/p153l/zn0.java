package p153l;

import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes11.dex */
public class zn0 implements wzv {

    /* JADX INFO: renamed from: b */
    private static final boolean f205166b;

    /* JADX INFO: renamed from: a */
    private final String f205167a;

    static {
        boolean z;
        try {
            Class.forName("android.util.Log");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f205166b = z;
    }

    public zn0(String str) {
        this.f205167a = str;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m220572c() {
        return f205166b;
    }

    /* JADX INFO: renamed from: d */
    private int m220573d(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue < 800) {
            return iIntValue < 500 ? 2 : 3;
        }
        if (iIntValue < 900) {
            return 4;
        }
        return iIntValue < 1000 ? 5 : 6;
    }

    @Override // p153l.wzv
    /* JADX INFO: renamed from: a */
    public void mo208767a(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(m220573d(level), this.f205167a, str);
        }
    }

    @Override // p153l.wzv
    /* JADX INFO: renamed from: b */
    public void mo208768b(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            Log.println(m220573d(level), this.f205167a, str + SignParameters.NEW_LINE + Log.getStackTraceString(th));
        }
    }
}
