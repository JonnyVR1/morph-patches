package p153l;

import android.annotation.TargetApi;
import android.os.SystemClock;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class go0 {

    /* JADX INFO: renamed from: l.go0$a */
    @TargetApi(16)
    public static class C17264a extends hzf0 {

        /* JADX INFO: renamed from: b */
        public final Choreographer f105176b;

        /* JADX INFO: renamed from: c */
        public final Choreographer.FrameCallback f105177c = new a();

        /* JADX INFO: renamed from: d */
        public boolean f105178d;

        /* JADX INFO: renamed from: e */
        public long f105179e;

        /* JADX INFO: renamed from: l.go0$a$a */
        public class a implements Choreographer.FrameCallback {
            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                if (!C17264a.this.f105178d || C17264a.this.f112242a == null) {
                    return;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                C17264a c17264a = C17264a.this;
                c17264a.f112242a.m187588f(jUptimeMillis - c17264a.f105179e);
                C17264a.this.f105179e = jUptimeMillis;
                C17264a.this.f105176b.postFrameCallback(C17264a.this.f105177c);
            }
        }

        public C17264a(Choreographer choreographer) {
            this.f105176b = choreographer;
        }

        /* JADX INFO: renamed from: i */
        public static C17264a m131018i() {
            return new C17264a(Choreographer.getInstance());
        }

        @Override // p153l.hzf0
        /* JADX INFO: renamed from: b */
        public void mo131019b() {
            if (this.f105178d) {
                return;
            }
            this.f105178d = true;
            this.f105179e = SystemClock.uptimeMillis();
            this.f105176b.removeFrameCallback(this.f105177c);
            this.f105176b.postFrameCallback(this.f105177c);
        }

        @Override // p153l.hzf0
        /* JADX INFO: renamed from: c */
        public void mo131020c() {
            this.f105178d = false;
            this.f105176b.removeFrameCallback(this.f105177c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static hzf0 m131012a() {
        return C17264a.m131018i();
    }
}
