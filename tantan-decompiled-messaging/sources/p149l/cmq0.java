package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class cmq0 extends njq0.AbstractRunnableC18717c {

    /* JADX INFO: renamed from: c */
    private Context f81599c;

    public cmq0(Context context) {
        this.f81599c = context;
    }

    /* JADX INFO: renamed from: b */
    private boolean m107693b() {
        return zhq0.m218833f(this.f81599c).m218846d().m176523g();
    }

    @Override // p149l.njq0.AbstractRunnableC18717c
    /* JADX INFO: renamed from: a */
    public String mo86627a() {
        return "100886";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (m107693b()) {
                ilq0.m137053z(this.f81599c.getPackageName() + " begin upload event");
                zhq0.m218833f(this.f81599c).m218854s();
            }
        } catch (Exception e) {
            ilq0.m137044q(e);
        }
    }
}
