package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class emq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private ymq0 f92233a;

    /* JADX INFO: renamed from: b */
    private Context f92234b;

    /* JADX INFO: renamed from: a */
    public void m117217a(Context context) {
        this.f92234b = context;
    }

    /* JADX INFO: renamed from: b */
    public void m117218b(ymq0 ymq0Var) {
        this.f92233a = ymq0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ymq0 ymq0Var = this.f92233a;
            if (ymq0Var != null) {
                ymq0Var.mo150541a();
            }
            ilq0.m137053z("begin read and send perf / event");
            ymq0 ymq0Var2 = this.f92233a;
            if (ymq0Var2 instanceof mql) {
                gmq0.m127046c(this.f92234b).m127049d("sp_client_report_status", "event_last_upload_time", System.currentTimeMillis());
            } else if (ymq0Var2 instanceof rzl) {
                gmq0.m127046c(this.f92234b).m127049d("sp_client_report_status", "perf_last_upload_time", System.currentTimeMillis());
            }
        } catch (Exception e) {
            ilq0.m137044q(e);
        }
    }
}
