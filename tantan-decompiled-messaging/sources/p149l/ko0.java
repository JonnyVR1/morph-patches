package p149l;

import android.annotation.TargetApi;
import android.os.SystemClock;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ko0 {

    /* JADX INFO: renamed from: l.ko0$a */
    @TargetApi(16)
    public static class C18051a extends yqf0 {

        /* JADX INFO: renamed from: b */
        public final Choreographer f123941b;

        /* JADX INFO: renamed from: c */
        public final Choreographer.FrameCallback f123942c = new a();

        /* JADX INFO: renamed from: d */
        public boolean f123943d;

        /* JADX INFO: renamed from: e */
        public long f123944e;

        /* JADX INFO: renamed from: l.ko0$a$a */
        public class a implements Choreographer.FrameCallback {
            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                if (!C18051a.this.f123943d || C18051a.this.f199549a == null) {
                    return;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                C18051a c18051a = C18051a.this;
                c18051a.f199549a.m108325f(jUptimeMillis - c18051a.f123944e);
                C18051a.this.f123944e = jUptimeMillis;
                C18051a.this.f123941b.postFrameCallback(C18051a.this.f123942c);
            }
        }

        public C18051a(Choreographer choreographer) {
            this.f123941b = choreographer;
        }

        /* JADX INFO: renamed from: i */
        public static C18051a m146662i() {
            return new C18051a(Choreographer.getInstance());
        }

        @Override // p149l.yqf0
        /* JADX INFO: renamed from: b */
        public void mo146663b() {
            if (this.f123943d) {
                return;
            }
            this.f123943d = true;
            this.f123944e = SystemClock.uptimeMillis();
            this.f123941b.removeFrameCallback(this.f123942c);
            this.f123941b.postFrameCallback(this.f123942c);
        }

        @Override // p149l.yqf0
        /* JADX INFO: renamed from: c */
        public void mo146664c() {
            this.f123943d = false;
            this.f123941b.removeFrameCallback(this.f123942c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static yqf0 m146656a() {
        return C18051a.m146662i();
    }
}
