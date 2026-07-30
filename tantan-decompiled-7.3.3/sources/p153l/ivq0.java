package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class ivq0 extends tsq0.AbstractRunnableC20394c {

    /* JADX INFO: renamed from: c */
    private Context f117109c;

    public ivq0(Context context) {
        this.f117109c = context;
    }

    /* JADX INFO: renamed from: b */
    private boolean m142354b() {
        return erq0.m122263f(this.f117109c).m122276d().m198246g();
    }

    @Override // p153l.tsq0.AbstractRunnableC20394c
    /* JADX INFO: renamed from: a */
    public String mo87798a() {
        return "100886";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (m142354b()) {
                ouq0.m169406z(this.f117109c.getPackageName() + " begin upload event");
                erq0.m122263f(this.f117109c).m122284s();
            }
        } catch (Exception e) {
            ouq0.m169397q(e);
        }
    }
}
