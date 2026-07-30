package p006l;

import android.os.Process;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import l.axm;
import l.exc0;
import l.k850;
import l.stc0;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class d6j0 {

    /* JADX INFO: renamed from: b */
    public static final BlockingQueue<Runnable> f10036b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: a */
    public AtomicInteger f10037a = new AtomicInteger(0);

    /* JADX INFO: renamed from: l.d6j0$a */
    public static class C0628a implements axm {
        public exc0 intercept(axm.a aVar) throws IOException {
            stc0 stc0VarRequest = aVar.request();
            return stc0VarRequest.i() instanceof avc0 ? aVar.a(stc0VarRequest) : aVar.a(stc0VarRequest);
        }
    }

    /* JADX INFO: renamed from: l.d6j0$b */
    public static class C0629b extends Thread {
        public C0629b(@NonNull String str) {
            super(str);
        }

        /* JADX INFO: Infinite loop detected, blocks: 15, insns: 0 */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    try {
                        d6j0.f10036b.take().run();
                    } catch (Throwable th) {
                        CrashHelper.c(new Throwable("TrackManager run:" + th.getMessage(), th));
                    }
                } catch (InterruptedException e) {
                    CrashHelper.c(e);
                }
            }
        }
    }

    public d6j0() {
        m13805b();
    }

    /* JADX INFO: renamed from: a */
    public static k850.b m13804a(k850.b bVar) {
        return bVar.k(new zc20(new dkl())).a(new C0628a());
    }

    /* JADX INFO: renamed from: b */
    public final void m13805b() {
        for (int i = 0; i < 4; i++) {
            new C0629b("TrackDispatcher-" + i).start();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m13806c(Map<String, String> map) {
        uqd0 uqd0Var = mu5.f17252a;
    }

    /* JADX INFO: renamed from: d */
    public void m13807d(Map<String, String> map) {
        uqd0 uqd0Var = mu5.f17252a;
    }

    /* JADX INFO: renamed from: e */
    public void m13808e(Map<String, String> map) {
        uqd0 uqd0Var = mu5.f17252a;
    }
}
