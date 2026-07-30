package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class vyt0 {

    /* JADX INFO: renamed from: a */
    public final r9u0 f186421a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final lcu0 f186422b;

    public vyt0(r9u0 r9u0Var, @Nullable lcu0 lcu0Var) {
        this.f186421a = r9u0Var;
        this.f186422b = lcu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final r9u0 m204039a() {
        return this.f186421a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final lcu0 m204040b() {
        return this.f186422b;
    }

    /* JADX INFO: renamed from: c */
    public final yfu0 m204041c() {
        lcu0 lcu0Var = this.f186422b;
        return lcu0Var != null ? new yfu0(lcu0Var, oct0.f146738f) : new yfu0(new uyt0(this), oct0.f146738f);
    }
}
