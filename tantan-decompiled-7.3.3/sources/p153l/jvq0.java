package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class jvq0 extends tsq0.AbstractRunnableC20394c {

    /* JADX INFO: renamed from: c */
    private Context f122835c;

    public jvq0(Context context) {
        this.f122835c = context;
    }

    /* JADX INFO: renamed from: b */
    private boolean m147096b() {
        return erq0.m122263f(this.f122835c).m122276d().m198247h();
    }

    @Override // p153l.tsq0.AbstractRunnableC20394c
    /* JADX INFO: renamed from: a */
    public String mo87798a() {
        return "100887";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (m147096b()) {
                erq0.m122263f(this.f122835c).m122285w();
                ouq0.m169406z(this.f122835c.getPackageName() + " perf begin upload");
            }
        } catch (Exception e) {
            ouq0.m169378B("fail to send perf data. " + e);
        }
    }
}
