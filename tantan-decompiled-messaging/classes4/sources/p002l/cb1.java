package p002l;

import android.os.Bundle;
import android.util.Pair;
import com.p1.mobile.android.media.AudioPlayer;
import com.p1.mobile.android.media.a;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cb1 extends xxl {

    /* JADX INFO: renamed from: c */
    public final nt10 f8572c;

    /* JADX INFO: renamed from: d */
    public a.a f8573d;

    /* JADX INFO: renamed from: l.cb1$a */
    public class C0510a implements a.a {
        public C0510a() {
        }

        /* JADX INFO: renamed from: b */
        public void m10926b(int i, Bundle bundle) {
            if (i == 0) {
                cb1.this.m10925h(true);
            } else if (i == 1 || i == 2 || i == 3) {
                cb1.this.m10925h(false);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m10927c(AudioPlayer.State state) {
            int i = C0511b.f8575a[state.ordinal()];
            if (i == 1) {
                cb1.this.m10925h(true);
            } else if (i == 2 || i == 3) {
                cb1.this.m10925h(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.cb1$b */
    public static /* synthetic */ class C0511b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8575a;

        static {
            int[] iArr = new int[AudioPlayer.State.values().length];
            f8575a = iArr;
            try {
                iArr[AudioPlayer.State.playing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8575a[AudioPlayer.State.stopped.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8575a[AudioPlayer.State.finished.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public cb1(nt10 nt10Var, c<Pair<Boolean, Boolean>> cVar, f6t f6tVar) {
        super(cVar, f6tVar);
        this.f8573d = new C0510a();
        this.f8572c = nt10Var;
    }

    @Override // p002l.xxl
    /* JADX INFO: renamed from: b */
    public void mo10923b() {
        a.a().g(this.f8573d);
    }

    @Override // p002l.xxl
    /* JADX INFO: renamed from: f */
    public void mo10924f() {
        a.a().f(this.f8573d);
        if (a.a().b() || a.a().c()) {
            this.f8572c.mo18909a(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10925h(boolean z) {
        if (m26173d()) {
            return;
        }
        nt10 nt10Var = this.f8572c;
        if (z) {
            nt10Var.mo18909a(true);
        } else {
            nt10Var.mo18909a(nt10Var.mo18978b());
        }
    }
}
