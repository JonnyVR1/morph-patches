package p149l;

import android.content.Context;
import android.os.Handler;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class blq0 extends eiq0 {

    /* JADX INFO: renamed from: d */
    private static Runnable f76206d = new RunnableC15904a();

    /* JADX INFO: renamed from: l.blq0$a */
    public static class RunnableC15904a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            wvq0.m205758b().m151990a().removeCallbacks(this);
            wvq0.m205758b().m151992e(new blq0(wvq0.m205758b().m151990a(), 0L, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, hrq0.m132700i()));
        }
    }

    public blq0(Handler handler, long j, long j2, Context context) {
        super(handler, j, j2);
    }

    /* JADX INFO: renamed from: e */
    public static void m102557e() {
        wvq0.m205758b().m151993f(f76206d, 100L);
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, Object> mapM194561d;
        try {
            mapM194561d = hrq0.m132693b().m194561d();
        } catch (Throwable unused) {
            mapM194561d = null;
        }
        try {
            ewq0.m118487c().m118498f(mapM194561d, plq0.m170250i());
        } catch (Throwable unused2) {
        }
    }
}
