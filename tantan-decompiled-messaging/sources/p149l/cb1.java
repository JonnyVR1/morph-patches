package p149l;

import android.os.Bundle;
import android.util.Pair;
import com.p046p1.mobile.android.media.AudioPlayer;
import com.p046p1.mobile.android.media.C4323a;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class cb1 extends xxl {

    /* JADX INFO: renamed from: c */
    public final nt10 f80092c;

    /* JADX INFO: renamed from: d */
    public C4323a.a f80093d;

    /* JADX INFO: renamed from: l.cb1$a */
    public class C16099a implements C4323a.a {
        public C16099a() {
        }

        @Override // com.p046p1.mobile.android.media.C4323a.a
        /* JADX INFO: renamed from: b */
        public void mo20739b(int i, Bundle bundle) {
            if (i == 0) {
                cb1.this.m105962h(true);
            } else if (i == 1 || i == 2 || i == 3) {
                cb1.this.m105962h(false);
            }
        }

        @Override // com.p046p1.mobile.android.media.C4323a.a
        /* JADX INFO: renamed from: c */
        public void mo20740c(AudioPlayer.State state) {
            int i = C16100b.f80095a[state.ordinal()];
            if (i == 1) {
                cb1.this.m105962h(true);
            } else if (i == 2 || i == 3) {
                cb1.this.m105962h(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.cb1$b */
    public static /* synthetic */ class C16100b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f80095a;

        static {
            int[] iArr = new int[AudioPlayer.State.values().length];
            f80095a = iArr;
            try {
                iArr[AudioPlayer.State.playing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80095a[AudioPlayer.State.stopped.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80095a[AudioPlayer.State.finished.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public cb1(nt10 nt10Var, C22306c<Pair<Boolean, Boolean>> c22306c, f6t f6tVar) {
        super(c22306c, f6tVar);
        this.f80093d = new C16099a();
        this.f80092c = nt10Var;
    }

    @Override // p149l.xxl
    /* JADX INFO: renamed from: b */
    public void mo105960b() {
        C4323a.m20731a().m20737g(this.f80093d);
    }

    @Override // p149l.xxl
    /* JADX INFO: renamed from: f */
    public void mo105961f() {
        C4323a.m20731a().m20736f(this.f80093d);
        if (C4323a.m20731a().m20732b() || C4323a.m20731a().m20733c()) {
            this.f80092c.mo160504a(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m105962h(boolean z) {
        if (m211509d()) {
            return;
        }
        nt10 nt10Var = this.f80092c;
        if (z) {
            nt10Var.mo160504a(true);
        } else {
            nt10Var.mo160504a(nt10Var.mo160800b());
        }
    }
}
