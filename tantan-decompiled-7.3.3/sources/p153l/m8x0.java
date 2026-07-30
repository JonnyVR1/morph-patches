package p153l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m8x0 implements fex0 {

    /* JADX INFO: renamed from: a */
    public final boolean f135302a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f135303b = new ArrayList(1);

    /* JADX INFO: renamed from: c */
    public int f135304c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public akx0 f135305d;

    public m8x0(boolean z) {
        this.f135302a = z;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: f */
    public final void mo101236f(btx0 btx0Var) {
        btx0Var.getClass();
        if (this.f135303b.contains(btx0Var)) {
            return;
        }
        this.f135303b.add(btx0Var);
        this.f135304c++;
    }

    /* JADX INFO: renamed from: j */
    public final void m157521j() {
        akx0 akx0Var = this.f135305d;
        int i = mpw0.f137957a;
        for (int i2 = 0; i2 < this.f135304c; i2++) {
            ((btx0) this.f135303b.get(i2)).mo106412l(this, akx0Var, this.f135302a);
        }
        this.f135305d = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m157522k(akx0 akx0Var) {
        for (int i = 0; i < this.f135304c; i++) {
            ((btx0) this.f135303b.get(i)).mo106411k(this, akx0Var, this.f135302a);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m157523l(akx0 akx0Var) {
        this.f135305d = akx0Var;
        for (int i = 0; i < this.f135304c; i++) {
            ((btx0) this.f135303b.get(i)).mo106410i(this, akx0Var, this.f135302a);
        }
    }

    @Override // p153l.fex0, p153l.jsx0
    public /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    public final void zzg(int i) {
        akx0 akx0Var = this.f135305d;
        int i2 = mpw0.f137957a;
        for (int i3 = 0; i3 < this.f135304c; i3++) {
            ((btx0) this.f135303b.get(i3)).mo106413n(this, akx0Var, this.f135302a, i);
        }
    }
}
