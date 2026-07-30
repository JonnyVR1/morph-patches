package p153l;

import android.content.Context;
import android.os.Handler;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class huq0 extends jrq0 {

    /* JADX INFO: renamed from: d */
    private static Runnable f111691d = new RunnableC17580a();

    /* JADX INFO: renamed from: l.huq0$a */
    public static class RunnableC17580a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            c5r0.m108080b().m179943a().removeCallbacks(this);
            c5r0.m108080b().m179945e(new huq0(c5r0.m108080b().m179943a(), 0L, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, n0r0.m161022i()));
        }
    }

    public huq0(Handler handler, long j, long j2, Context context) {
        super(handler, j, j2);
    }

    /* JADX INFO: renamed from: e */
    public static void m137252e() {
        c5r0.m108080b().m179946f(f111691d, 100L);
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, Object> mapM100918d;
        try {
            mapM100918d = n0r0.m161015b().m100918d();
        } catch (Throwable unused) {
            mapM100918d = null;
        }
        try {
            k5r0.m148477c().m148488f(mapM100918d, vuq0.m202885i());
        } catch (Throwable unused2) {
        }
    }
}
