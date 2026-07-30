package p153l;

import android.os.Process;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public class hfj0 {

    /* JADX INFO: renamed from: b */
    public static final BlockingQueue<Runnable> f109308b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: a */
    public AtomicInteger f109309a = new AtomicInteger(0);

    /* JADX INFO: renamed from: l.hfj0$a */
    public static class C17447a implements azm {
        @Override // p153l.azm
        public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
            x1d0 x1d0VarRequest = interfaceC15867a.request();
            return x1d0VarRequest.m209024i() instanceof d3d0 ? interfaceC15867a.mo101076a(x1d0VarRequest) : interfaceC15867a.mo101076a(x1d0VarRequest);
        }
    }

    /* JADX INFO: renamed from: l.hfj0$b */
    public static class C17448b extends Thread {
        public C17448b(@NonNull String str) {
            super(str);
        }

        /* JADX INFO: Infinite loop detected, blocks: 15, insns: 0 */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    try {
                        hfj0.f109308b.take().run();
                    } catch (Throwable th) {
                        CrashHelper.m82479c(new Throwable("TrackManager run:" + th.getMessage(), th));
                    }
                } catch (InterruptedException e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
    }

    public hfj0() {
        m134808b();
    }

    /* JADX INFO: renamed from: a */
    public static rg50.C19837b m134807a(rg50.C19837b c19837b) {
        return c19837b.m181373k(new jl20(new rml())).m181363a(new C17447a());
    }

    /* JADX INFO: renamed from: b */
    public final void m134808b() {
        for (int i = 0; i < 4; i++) {
            new C17448b("TrackDispatcher-" + i).start();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m134809c(Map<String, String> map) {
        wyd0 wyd0Var = qv5.f159697a;
    }

    /* JADX INFO: renamed from: d */
    public void m134810d(Map<String, String> map) {
        wyd0 wyd0Var = qv5.f159697a;
    }

    /* JADX INFO: renamed from: e */
    public void m134811e(Map<String, String> map) {
        wyd0 wyd0Var = qv5.f159697a;
    }
}
