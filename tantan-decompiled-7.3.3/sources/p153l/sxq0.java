package p153l;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.lite.CrashType;
import com.apm.lite.nativecrash.NativeImpl;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class sxq0 implements iwq0 {

    /* JADX INFO: renamed from: a */
    private Context f171157a;

    public sxq0(Context context) {
        this.f171157a = context;
    }

    /* JADX INFO: renamed from: b */
    public static int m188483b() {
        return 6;
    }

    @Override // p153l.iwq0
    /* JADX INFO: renamed from: a */
    public void mo118168a(long j, Thread thread, Throwable th, String str, File file, String str2, boolean z) {
        File file2 = new File(j5r0.m143566b(this.f171157a), str);
        frq0.m126955e().m126972g(file2.getName());
        file2.mkdirs();
        r3r0.m179673F(file2);
        gsq0 gsq0VarM147836b = k0r0.m147834d().m147836b(CrashType.JAVA, null, new C20181a(th, d6r0.m114528w(th), j, str2, z, thread, str, file2), true);
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        try {
            gsq0VarM147836b.m132129c("crash_type", "normal");
            gsq0VarM147836b.m132138q("crash_cost", String.valueOf(jCurrentTimeMillis));
            gsq0VarM147836b.m132129c("crash_cost", String.valueOf(jCurrentTimeMillis / 1000));
        } catch (Throwable th2) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th2);
        }
        if (u5r0.m194619c(4)) {
            return;
        }
        u5r0.m194619c(2048);
    }

    @Override // p153l.iwq0
    /* JADX INFO: renamed from: a */
    public boolean mo118169a(Throwable th) {
        return true;
    }

    /* JADX INFO: renamed from: l.sxq0$a */
    public class C20181a implements bwq0.InterfaceC16123a {

        /* JADX INFO: renamed from: a */
        long f171158a = 0;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Throwable f171159b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f171160c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f171161d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f171162e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f171163f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Thread f171164g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f171165h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ File f171166i;

        public C20181a(Throwable th, boolean z, long j, String str, boolean z2, Thread thread, String str2, File file) {
            this.f171159b = th;
            this.f171160c = z;
            this.f171161d = j;
            this.f171162e = str;
            this.f171163f = z2;
            this.f171164g = thread;
            this.f171165h = str2;
            this.f171166i = file;
        }

        @Override // p153l.bwq0.InterfaceC16123a
        /* JADX INFO: renamed from: a */
        public gsq0 mo106755a(int i, gsq0 gsq0Var) {
            this.f171158a = SystemClock.uptimeMillis();
            if (i != 0) {
                if (i == 1) {
                    Thread thread = this.f171164g;
                    gsq0Var.m132136j("crash_thread_name", thread != null ? thread.getName() : "");
                    gsq0Var.m132136j("tid", Integer.valueOf(Process.myTid()));
                    gsq0Var.m132129c("crash_after_crash", b350.m102271c() ? "true" : "false");
                    gsq0Var.m132129c("crash_after_native", NativeImpl.m5173k() ? "true" : "false");
                    frq0.m126955e().m126973i(this.f171164g, this.f171159b, false, gsq0Var);
                    return gsq0Var;
                }
                if (i == 2) {
                    if (this.f171160c) {
                        lrq0.m155640d(sxq0.this.f171157a, gsq0Var.m132125G());
                    }
                    JSONArray jSONArrayM203870b = vxq0.m203870b();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    JSONObject jSONObjectM203871c = vxq0.m203871c(jUptimeMillis);
                    JSONArray jSONArrayM188932a = t1r0.m188932a(100, jUptimeMillis);
                    gsq0Var.m132136j("history_message", jSONArrayM203870b);
                    gsq0Var.m132136j("current_message", jSONObjectM203871c);
                    gsq0Var.m132136j("pending_messages", jSONArrayM188932a);
                    gsq0Var.m132129c("disable_looper_monitor", String.valueOf(nrq0.m164515l()));
                    return gsq0Var;
                }
                if (i == 3) {
                    JSONObject jSONObjectM114523r = d6r0.m114523r(Thread.currentThread().getName());
                    if (jSONObjectM114523r != null) {
                        gsq0Var.m132136j("all_thread_stacks", jSONObjectM114523r);
                    }
                    gsq0Var.m132136j("logcat", h4r0.m133594b(n0r0.m161021h()));
                    return gsq0Var;
                }
                if (i != 4) {
                    if (i == 5) {
                        gsq0Var.m132136j("crash_uuid", this.f171165h);
                        s2r0.m184133a(j5r0.m143558F(n0r0.m161022i()), CrashType.JAVA, "");
                        return gsq0Var;
                    }
                } else if (!this.f171160c) {
                    lrq0.m155640d(sxq0.this.f171157a, gsq0Var.m132125G());
                    return gsq0Var;
                }
            } else {
                gsq0Var.m132136j("data", d6r0.m114507b(this.f171159b));
                gsq0Var.m132136j("isOOM", Boolean.valueOf(this.f171160c));
                gsq0Var.m132136j("isJava", 1);
                gsq0Var.m132136j("crash_time", Long.valueOf(this.f171161d));
                gsq0Var.m132136j("launch_mode", Integer.valueOf(euq0.m122718n()));
                gsq0Var.m132136j("launch_time", Long.valueOf(euq0.m122723s()));
                String str = this.f171162e;
                if (str != null) {
                    gsq0Var.m132136j("crash_md5", str);
                    gsq0Var.m132129c("crash_md5", this.f171162e);
                    boolean z = this.f171163f;
                    if (z) {
                        gsq0Var.m132129c("has_ignore", String.valueOf(z));
                    }
                }
            }
            return gsq0Var;
        }

        @Override // p153l.bwq0.InterfaceC16123a
        /* JADX INFO: renamed from: b */
        public gsq0 mo106757b(int i, gsq0 gsq0Var, boolean z) {
            if (u5r0.m194619c(u5r0.m194620d(i))) {
                return gsq0Var;
            }
            try {
                r3r0.m179687m(new File(this.f171166i, this.f171166i.getName() + "." + i), gsq0Var.m132125G(), false);
                return gsq0Var;
            } catch (IOException e) {
                e.printStackTrace();
                return gsq0Var;
            }
        }

        @Override // p153l.bwq0.InterfaceC16123a
        /* JADX INFO: renamed from: a */
        public void mo106756a(Throwable th) {
        }
    }
}
