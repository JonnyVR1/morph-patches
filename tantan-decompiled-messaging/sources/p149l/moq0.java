package p149l;

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
public class moq0 implements cnq0 {

    /* JADX INFO: renamed from: a */
    private Context f134938a;

    public moq0(Context context) {
        this.f134938a = context;
    }

    /* JADX INFO: renamed from: b */
    public static int m155704b() {
        return 6;
    }

    @Override // p149l.cnq0
    /* JADX INFO: renamed from: a */
    public void mo107823a(long j, Thread thread, Throwable th, String str, File file, String str2, boolean z) {
        File file2 = new File(dwq0.m113914b(this.f134938a), str);
        aiq0.m96898e().m96915g(file2.getName());
        file2.mkdirs();
        luq0.m151785F(file2);
        bjq0 bjq0VarM117873b = erq0.m117871d().m117873b(CrashType.JAVA, null, new C18520a(th, xwq0.m211380w(th), j, str2, z, thread, str, file2), true);
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        try {
            bjq0VarM117873b.m102210c("crash_type", "normal");
            bjq0VarM117873b.m102219q("crash_cost", String.valueOf(jCurrentTimeMillis));
            bjq0VarM117873b.m102210c("crash_cost", String.valueOf(jCurrentTimeMillis / 1000));
        } catch (Throwable th2) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th2);
        }
        if (owq0.m166427c(4)) {
            return;
        }
        owq0.m166427c(2048);
    }

    @Override // p149l.cnq0
    /* JADX INFO: renamed from: a */
    public boolean mo107824a(Throwable th) {
        return true;
    }

    /* JADX INFO: renamed from: l.moq0$a */
    public class C18520a implements vmq0.InterfaceC20665a {

        /* JADX INFO: renamed from: a */
        long f134939a = 0;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Throwable f134940b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f134941c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f134942d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f134943e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f134944f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Thread f134945g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f134946h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ File f134947i;

        public C18520a(Throwable th, boolean z, long j, String str, boolean z2, Thread thread, String str2, File file) {
            this.f134940b = th;
            this.f134941c = z;
            this.f134942d = j;
            this.f134943e = str;
            this.f134944f = z2;
            this.f134945g = thread;
            this.f134946h = str2;
            this.f134947i = file;
        }

        @Override // p149l.vmq0.InterfaceC20665a
        /* JADX INFO: renamed from: a */
        public bjq0 mo155706a(int i, bjq0 bjq0Var) {
            this.f134939a = SystemClock.uptimeMillis();
            if (i != 0) {
                if (i == 1) {
                    Thread thread = this.f134945g;
                    bjq0Var.m102217j("crash_thread_name", thread != null ? thread.getName() : "");
                    bjq0Var.m102217j("tid", Integer.valueOf(Process.myTid()));
                    bjq0Var.m102210c("crash_after_crash", mu40.m156374c() ? "true" : "false");
                    bjq0Var.m102210c("crash_after_native", NativeImpl.m5163k() ? "true" : "false");
                    aiq0.m96898e().m96916i(this.f134945g, this.f134940b, false, bjq0Var);
                    return bjq0Var;
                }
                if (i == 2) {
                    if (this.f134941c) {
                        giq0.m126389d(moq0.this.f134938a, bjq0Var.m102206G());
                    }
                    JSONArray jSONArrayM170635b = poq0.m170635b();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    JSONObject jSONObjectM170636c = poq0.m170636c(jUptimeMillis);
                    JSONArray jSONArrayM160791a = nsq0.m160791a(100, jUptimeMillis);
                    bjq0Var.m102217j("history_message", jSONArrayM170635b);
                    bjq0Var.m102217j("current_message", jSONObjectM170636c);
                    bjq0Var.m102217j("pending_messages", jSONArrayM160791a);
                    bjq0Var.m102210c("disable_looper_monitor", String.valueOf(iiq0.m136437l()));
                    return bjq0Var;
                }
                if (i == 3) {
                    JSONObject jSONObjectM211375r = xwq0.m211375r(Thread.currentThread().getName());
                    if (jSONObjectM211375r != null) {
                        bjq0Var.m102217j("all_thread_stacks", jSONObjectM211375r);
                    }
                    bjq0Var.m102217j("logcat", bvq0.m104074b(hrq0.m132699h()));
                    return bjq0Var;
                }
                if (i != 4) {
                    if (i == 5) {
                        bjq0Var.m102217j("crash_uuid", this.f134946h);
                        mtq0.m156349a(dwq0.m113906F(hrq0.m132700i()), CrashType.JAVA, "");
                        return bjq0Var;
                    }
                } else if (!this.f134941c) {
                    giq0.m126389d(moq0.this.f134938a, bjq0Var.m102206G());
                    return bjq0Var;
                }
            } else {
                bjq0Var.m102217j("data", xwq0.m211359b(this.f134940b));
                bjq0Var.m102217j("isOOM", Boolean.valueOf(this.f134941c));
                bjq0Var.m102217j("isJava", 1);
                bjq0Var.m102217j("crash_time", Long.valueOf(this.f134942d));
                bjq0Var.m102217j("launch_mode", Integer.valueOf(ykq0.m215191n()));
                bjq0Var.m102217j("launch_time", Long.valueOf(ykq0.m215196s()));
                String str = this.f134943e;
                if (str != null) {
                    bjq0Var.m102217j("crash_md5", str);
                    bjq0Var.m102210c("crash_md5", this.f134943e);
                    boolean z = this.f134944f;
                    if (z) {
                        bjq0Var.m102210c("has_ignore", String.valueOf(z));
                    }
                }
            }
            return bjq0Var;
        }

        @Override // p149l.vmq0.InterfaceC20665a
        /* JADX INFO: renamed from: b */
        public bjq0 mo155708b(int i, bjq0 bjq0Var, boolean z) {
            if (owq0.m166427c(owq0.m166428d(i))) {
                return bjq0Var;
            }
            try {
                luq0.m151799m(new File(this.f134947i, this.f134947i.getName() + "." + i), bjq0Var.m102206G(), false);
                return bjq0Var;
            } catch (IOException e) {
                e.printStackTrace();
                return bjq0Var;
            }
        }

        @Override // p149l.vmq0.InterfaceC20665a
        /* JADX INFO: renamed from: a */
        public void mo155707a(Throwable th) {
        }
    }
}
