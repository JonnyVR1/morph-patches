package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class kvq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private ewq0 f128984a;

    /* JADX INFO: renamed from: b */
    private Context f128985b;

    /* JADX INFO: renamed from: a */
    public void m151675a(Context context) {
        this.f128985b = context;
    }

    /* JADX INFO: renamed from: b */
    public void m151676b(ewq0 ewq0Var) {
        this.f128984a = ewq0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ewq0 ewq0Var = this.f128984a;
            if (ewq0Var != null) {
                ewq0Var.mo122959a();
            }
            ouq0.m169406z("begin read and send perf / event");
            ewq0 ewq0Var2 = this.f128984a;
            if (ewq0Var2 instanceof ysl) {
                mvq0.m160316c(this.f128985b).m160319d("sp_client_report_status", "event_last_upload_time", System.currentTimeMillis());
            } else if (ewq0Var2 instanceof l2m) {
                mvq0.m160316c(this.f128985b).m160319d("sp_client_report_status", "perf_last_upload_time", System.currentTimeMillis());
            }
        } catch (Exception e) {
            ouq0.m169397q(e);
        }
    }
}
