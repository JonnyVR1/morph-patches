package p153l;

import android.os.Bundle;
import android.util.Pair;
import com.p051p1.mobile.android.media.AudioPlayer;
import com.p051p1.mobile.android.media.C4474a;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class jb1 extends q0m {

    /* JADX INFO: renamed from: c */
    public final v120 f119078c;

    /* JADX INFO: renamed from: d */
    public C4474a.a f119079d;

    /* JADX INFO: renamed from: l.jb1$a */
    public class C17910a implements C4474a.a {
        public C17910a() {
        }

        @Override // com.p051p1.mobile.android.media.C4474a.a
        /* JADX INFO: renamed from: b */
        public void mo21738b(int i, Bundle bundle) {
            if (i == 0) {
                jb1.this.m144182h(true);
            } else if (i == 1 || i == 2 || i == 3) {
                jb1.this.m144182h(false);
            }
        }

        @Override // com.p051p1.mobile.android.media.C4474a.a
        /* JADX INFO: renamed from: c */
        public void mo21739c(AudioPlayer.State state) {
            int i = C17911b.f119081a[state.ordinal()];
            if (i == 1) {
                jb1.this.m144182h(true);
            } else if (i == 2 || i == 3) {
                jb1.this.m144182h(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.jb1$b */
    public static /* synthetic */ class C17911b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f119081a;

        static {
            int[] iArr = new int[AudioPlayer.State.values().length];
            f119081a = iArr;
            try {
                iArr[AudioPlayer.State.playing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f119081a[AudioPlayer.State.stopped.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f119081a[AudioPlayer.State.finished.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public jb1(v120 v120Var, C22421c<Pair<Boolean, Boolean>> c22421c, g8t g8tVar) {
        super(c22421c, g8tVar);
        this.f119079d = new C17910a();
        this.f119078c = v120Var;
    }

    @Override // p153l.q0m
    /* JADX INFO: renamed from: b */
    public void mo108622b() {
        C4474a.m21730a().m21736g(this.f119079d);
    }

    @Override // p153l.q0m
    /* JADX INFO: renamed from: f */
    public void mo108623f() {
        C4474a.m21730a().m21735f(this.f119079d);
        if (C4474a.m21730a().m21731b() || C4474a.m21730a().m21732c()) {
            this.f119078c.mo174618a(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m144182h(boolean z) {
        if (m174728d()) {
            return;
        }
        v120 v120Var = this.f119078c;
        if (z) {
            v120Var.mo174618a(true);
        } else {
            v120Var.mo174618a(v120Var.mo174619b());
        }
    }
}
