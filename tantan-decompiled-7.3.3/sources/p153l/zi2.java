package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2070a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class zi2 implements g6c {

    /* JADX INFO: renamed from: a */
    public final boolean f204489a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<pgj0> f204490b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c */
    public int f204491c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C2070a f204492d;

    public zi2(boolean z) {
        this.f204489a = z;
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: e */
    public final void mo11177e(pgj0 pgj0Var) {
        w11.m204369e(pgj0Var);
        if (this.f204490b.contains(pgj0Var)) {
            return;
        }
        this.f204490b.add(pgj0Var);
        this.f204491c++;
    }

    /* JADX INFO: renamed from: q */
    public final void m219718q(int i) {
        C2070a c2070a = (C2070a) bmk0.m105144j(this.f204492d);
        for (int i2 = 0; i2 < this.f204491c; i2++) {
            this.f204490b.get(i2).mo172252i(this, c2070a, this.f204489a, i);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m219719r() {
        C2070a c2070a = (C2070a) bmk0.m105144j(this.f204492d);
        for (int i = 0; i < this.f204491c; i++) {
            this.f204490b.get(i).mo172251f(this, c2070a, this.f204489a);
        }
        this.f204492d = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m219720s(C2070a c2070a) {
        for (int i = 0; i < this.f204491c; i++) {
            this.f204490b.get(i).mo172250b(this, c2070a, this.f204489a);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m219721t(C2070a c2070a) {
        this.f204492d = c2070a;
        for (int i = 0; i < this.f204491c; i++) {
            this.f204490b.get(i).mo172249a(this, c2070a, this.f204489a);
        }
    }
}
