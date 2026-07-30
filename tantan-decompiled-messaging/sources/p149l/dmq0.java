package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class dmq0 extends njq0.AbstractRunnableC18717c {

    /* JADX INFO: renamed from: c */
    private Context f86982c;

    public dmq0(Context context) {
        this.f86982c = context;
    }

    /* JADX INFO: renamed from: b */
    private boolean m112520b() {
        return zhq0.m218833f(this.f86982c).m218846d().m176524h();
    }

    @Override // p149l.njq0.AbstractRunnableC18717c
    /* JADX INFO: renamed from: a */
    public String mo86627a() {
        return "100887";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (m112520b()) {
                zhq0.m218833f(this.f86982c).m218855w();
                ilq0.m137053z(this.f86982c.getPackageName() + " perf begin upload");
            }
        } catch (Exception e) {
            ilq0.m137025B("fail to send perf data. " + e);
        }
    }
}
