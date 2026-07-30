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
public class xkq0 implements cnq0 {

    /* JADX INFO: renamed from: a */
    private Context f193335a;

    public xkq0(Context context) {
        this.f193335a = context;
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m209823c(long j, Thread thread, Throwable th, String str, File file, String str2, boolean z) {
        File file2 = new File(dwq0.m113914b(this.f193335a), str);
        aiq0.m96898e().m96915g(file2.getName());
        file2.mkdirs();
        luq0.m151785F(file2);
        bjq0 bjq0VarM117873b = erq0.m117871d().m117873b(CrashType.LAUNCH, null, new C21167a(th, xwq0.m211380w(th), j, str2, z, thread, str, file2), true);
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
        if (mu40.m156375d() || owq0.m166427c(2048)) {
        }
    }

    @Override // p149l.cnq0
    /* JADX INFO: renamed from: a */
    public void mo107823a(long j, Thread thread, Throwable th, String str, File file, String str2, boolean z) {
        m209823c(j, thread, th, str, file, str2, z);
    }

    @Override // p149l.cnq0
    /* JADX INFO: renamed from: a */
    public boolean mo107824a(Throwable th) {
        return true;
    }

    /* JADX INFO: renamed from: l.xkq0$a */
    public class C21167a implements vmq0.InterfaceC20665a {

        /* JADX INFO: renamed from: a */
        long f193336a = 0;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Throwable f193337b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f193338c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f193339d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f193340e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ boolean f193341f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Thread f193342g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f193343h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ File f193344i;

        public C21167a(Throwable th, boolean z, long j, String str, boolean z2, Thread thread, String str2, File file) {
            this.f193337b = th;
            this.f193338c = z;
            this.f193339d = j;
            this.f193340e = str;
            this.f193341f = z2;
            this.f193342g = thread;
            this.f193343h = str2;
            this.f193344i = file;
        }

        @Override // p149l.vmq0.InterfaceC20665a
        /* JADX INFO: renamed from: a */
        public bjq0 mo155706a(int i, bjq0 bjq0Var) {
            this.f193336a = SystemClock.uptimeMillis();
            if (i != 0) {
                if (i == 1) {
                    bjq0Var.m102217j("timestamp", Long.valueOf(this.f193339d));
                    bjq0Var.m102217j("main_process", Boolean.valueOf(giq0.m126395j(xkq0.this.f193335a)));
                    bjq0Var.m102217j("crash_type", CrashType.JAVA);
                    Thread thread = this.f193342g;
                    bjq0Var.m102217j("crash_thread_name", thread != null ? thread.getName() : "");
                    bjq0Var.m102217j("tid", Integer.valueOf(Process.myTid()));
                    bjq0Var.m102210c("crash_after_crash", mu40.m156374c() ? "true" : "false");
                    bjq0Var.m102210c("crash_after_native", NativeImpl.m5163k() ? "true" : "false");
                    aiq0.m96898e().m96916i(this.f193342g, this.f193337b, true, bjq0Var);
                    return bjq0Var;
                }
                if (i == 2) {
                    if (this.f193338c) {
                        giq0.m126389d(xkq0.this.f193335a, bjq0Var.m102206G());
                    }
                    bjq0Var.m102217j("launch_did", ciq0.m107095a(xkq0.this.f193335a));
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
                        bjq0Var.m102217j("crash_uuid", this.f193343h);
                        mtq0.m156349a(dwq0.m113906F(hrq0.m132700i()), CrashType.LAUNCH, "");
                        return bjq0Var;
                    }
                } else if (!this.f193338c) {
                    giq0.m126389d(xkq0.this.f193335a, bjq0Var.m102206G());
                    return bjq0Var;
                }
            } else {
                bjq0Var.m102217j("stack", xwq0.m211359b(this.f193337b));
                bjq0Var.m102217j("event_type", "start_crash");
                bjq0Var.m102217j("isOOM", Boolean.valueOf(this.f193338c));
                bjq0Var.m102217j("crash_time", Long.valueOf(this.f193339d));
                bjq0Var.m102217j("launch_mode", Integer.valueOf(ykq0.m215191n()));
                bjq0Var.m102217j("launch_time", Long.valueOf(ykq0.m215196s()));
                String str = this.f193340e;
                if (str != null) {
                    bjq0Var.m102217j("crash_md5", str);
                    bjq0Var.m102210c("crash_md5", this.f193340e);
                    boolean z = this.f193341f;
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
                luq0.m151799m(new File(this.f193344i, this.f193344i.getName() + "." + i), bjq0Var.m102206G(), false);
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
