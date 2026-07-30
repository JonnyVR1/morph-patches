package p149l;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes7.dex */
public class nll {

    /* JADX INFO: renamed from: e */
    private static nll f139561e;

    /* JADX INFO: renamed from: f */
    private static Application f139562f;

    /* JADX INFO: renamed from: a */
    private Handler f139563a;

    /* JADX INFO: renamed from: b */
    private k850.C17954b f139564b;

    /* JADX INFO: renamed from: c */
    private long f139565c = -1;

    /* JADX INFO: renamed from: d */
    private k850 f139566d = null;

    /* JADX INFO: renamed from: l.nll$a */
    public class C18731a implements HostnameVerifier {
        public C18731a() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    private nll() {
        k850.C17954b c17954b = new k850.C17954b();
        this.f139564b = c17954b;
        c17954b.m144894o(new C18731a());
        k850.C17954b c17954b2 = this.f139564b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c17954b2.m144885f(Constants.ONE_MIN_IN_MILLIS, timeUnit);
        this.f139564b.m144899t(Constants.ONE_MIN_IN_MILLIS, timeUnit);
        this.f139564b.m144903x(Constants.ONE_MIN_IN_MILLIS, timeUnit);
        this.f139563a = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public static Context m160065a() {
        Application application = f139562f;
        if (application != null) {
            return application;
        }
        qkq0.m175383a("请先在全局Application中调用 OkHttpUtils.init() 初始化！");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static nll m160066b() {
        if (f139561e == null) {
            synchronized (nll.class) {
                try {
                    if (f139561e == null) {
                        f139561e = new nll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f139561e;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public k850 m160067c() {
        if (this.f139566d == null) {
            this.f139566d = this.f139564b.m144882c();
        }
        return this.f139566d;
    }
}
