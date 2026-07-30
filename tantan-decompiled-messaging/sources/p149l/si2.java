package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2047a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class si2 implements a5c {

    /* JADX INFO: renamed from: a */
    public final boolean f164667a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<l7j0> f164668b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c */
    public int f164669c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C2047a f164670d;

    public si2(boolean z) {
        this.f164667a = z;
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: e */
    public final void mo11123e(l7j0 l7j0Var) {
        p11.m167011e(l7j0Var);
        if (this.f164668b.contains(l7j0Var)) {
            return;
        }
        this.f164668b.add(l7j0Var);
        this.f164669c++;
    }

    /* JADX INFO: renamed from: q */
    public final void m184310q(int i) {
        C2047a c2047a = (C2047a) vck0.m197866j(this.f164670d);
        for (int i2 = 0; i2 < this.f164669c; i2++) {
            this.f164668b.get(i2).mo142061i(this, c2047a, this.f164667a, i);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m184311r() {
        C2047a c2047a = (C2047a) vck0.m197866j(this.f164670d);
        for (int i = 0; i < this.f164669c; i++) {
            this.f164668b.get(i).mo142060f(this, c2047a, this.f164667a);
        }
        this.f164670d = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m184312s(C2047a c2047a) {
        for (int i = 0; i < this.f164669c; i++) {
            this.f164668b.get(i).mo142059b(this, c2047a, this.f164667a);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m184313t(C2047a c2047a) {
        this.f164670d = c2047a;
        for (int i = 0; i < this.f164669c; i++) {
            this.f164668b.get(i).mo142058a(this, c2047a, this.f164667a);
        }
    }
}
