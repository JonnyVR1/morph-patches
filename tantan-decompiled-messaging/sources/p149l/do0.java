package p149l;

import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes13.dex */
public class do0 implements zxv {

    /* JADX INFO: renamed from: b */
    private static final boolean f87119b;

    /* JADX INFO: renamed from: a */
    private final String f87120a;

    static {
        boolean z;
        try {
            Class.forName("android.util.Log");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f87119b = z;
    }

    public do0(String str) {
        this.f87120a = str;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m112697c() {
        return f87119b;
    }

    /* JADX INFO: renamed from: d */
    private int m112698d(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue < 800) {
            return iIntValue < 500 ? 2 : 3;
        }
        if (iIntValue < 900) {
            return 4;
        }
        return iIntValue < 1000 ? 5 : 6;
    }

    @Override // p149l.zxv
    /* JADX INFO: renamed from: a */
    public void mo112699a(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(m112698d(level), this.f87120a, str);
        }
    }

    @Override // p149l.zxv
    /* JADX INFO: renamed from: b */
    public void mo112700b(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            Log.println(m112698d(level), this.f87120a, str + SignParameters.NEW_LINE + Log.getStackTraceString(th));
        }
    }
}
