package p149l;

import android.os.Process;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public class d6j0 {

    /* JADX INFO: renamed from: b */
    public static final BlockingQueue<Runnable> f84629b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: a */
    public AtomicInteger f84630a = new AtomicInteger(0);

    /* JADX INFO: renamed from: l.d6j0$a */
    public static class C16306a implements axm {
        @Override // p149l.axm
        public exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws IOException {
            stc0 stc0VarRequest = interfaceC15754a.request();
            return stc0VarRequest.m185879i() instanceof avc0 ? interfaceC15754a.mo99454a(stc0VarRequest) : interfaceC15754a.mo99454a(stc0VarRequest);
        }
    }

    /* JADX INFO: renamed from: l.d6j0$b */
    public static class C16307b extends Thread {
        public C16307b(@NonNull String str) {
            super(str);
        }

        /* JADX INFO: Infinite loop detected, blocks: 15, insns: 0 */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    try {
                        d6j0.f84629b.take().run();
                    } catch (Throwable th) {
                        CrashHelper.m81296c(new Throwable("TrackManager run:" + th.getMessage(), th));
                    }
                } catch (InterruptedException e) {
                    CrashHelper.m81296c(e);
                }
            }
        }
    }

    public d6j0() {
        m110169b();
    }

    /* JADX INFO: renamed from: a */
    public static k850.C17954b m110168a(k850.C17954b c17954b) {
        return c17954b.m144890k(new zc20(new dkl())).m144880a(new C16306a());
    }

    /* JADX INFO: renamed from: b */
    public final void m110169b() {
        for (int i = 0; i < 4; i++) {
            new C16307b("TrackDispatcher-" + i).start();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m110170c(Map<String, String> map) {
        uqd0 uqd0Var = mu5.f135733a;
    }

    /* JADX INFO: renamed from: d */
    public void m110171d(Map<String, String> map) {
        uqd0 uqd0Var = mu5.f135733a;
    }

    /* JADX INFO: renamed from: e */
    public void m110172e(Map<String, String> map) {
        uqd0 uqd0Var = mu5.f135733a;
    }
}
