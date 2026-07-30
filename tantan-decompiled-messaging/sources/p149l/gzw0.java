package p149l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gzw0 implements z4x0 {

    /* JADX INFO: renamed from: a */
    public final boolean f105186a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f105187b = new ArrayList(1);

    /* JADX INFO: renamed from: c */
    public int f105188c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public uax0 f105189d;

    public gzw0(boolean z) {
        this.f105186a = z;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: f */
    public final void mo128921f(vjx0 vjx0Var) {
        vjx0Var.getClass();
        if (this.f105187b.contains(vjx0Var)) {
            return;
        }
        this.f105187b.add(vjx0Var);
        this.f105188c++;
    }

    /* JADX INFO: renamed from: j */
    public final void m128922j() {
        uax0 uax0Var = this.f105189d;
        int i = ggw0.f102568a;
        for (int i2 = 0; i2 < this.f105188c; i2++) {
            ((vjx0) this.f105187b.get(i2)).mo115288l(this, uax0Var, this.f105186a);
        }
        this.f105189d = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m128923k(uax0 uax0Var) {
        for (int i = 0; i < this.f105188c; i++) {
            ((vjx0) this.f105187b.get(i)).mo115287k(this, uax0Var, this.f105186a);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m128924l(uax0 uax0Var) {
        this.f105189d = uax0Var;
        for (int i = 0; i < this.f105188c; i++) {
            ((vjx0) this.f105187b.get(i)).mo115286i(this, uax0Var, this.f105186a);
        }
    }

    @Override // p149l.z4x0, p149l.djx0
    public /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    public final void zzg(int i) {
        uax0 uax0Var = this.f105189d;
        int i2 = ggw0.f102568a;
        for (int i3 = 0; i3 < this.f105188c; i3++) {
            ((vjx0) this.f105187b.get(i3)).mo115289n(this, uax0Var, this.f105186a, i);
        }
    }
}
