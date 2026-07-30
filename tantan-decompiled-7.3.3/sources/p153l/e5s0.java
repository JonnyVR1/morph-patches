package p153l;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class e5s0 extends x5s0 {

    /* JADX INFO: renamed from: i */
    public final Map f92234i;

    /* JADX INFO: renamed from: j */
    public final View f92235j;

    /* JADX INFO: renamed from: k */
    public final Context f92236k;

    public e5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2, Map map, View view, Context context) {
        super(b4s0Var, "DNq6U+mZz2ZReiKgjo/VDFnaMNaZiKgTjVzJ4/NswvXzkfhe/AgU2N86qSmmEbDf", "ZzhYXgKMhken/ic2sDR8A53WLOTMzsBN7DfnMjKoyhk=", fzr0Var, i, 85);
        this.f92234i = map;
        this.f92235j = view;
        this.f92236k = context;
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {m119552c(1), m119552c(2)};
        Context contextM102517b = this.f92236k;
        if (contextM102517b == null) {
            contextM102517b = this.f192519b.m102517b();
        }
        long[] jArr2 = (long[]) this.f192523f.invoke(null, jArr, contextM102517b, this.f92235j);
        long j = jArr2[0];
        this.f92234i.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        this.f92234i.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f192522e) {
            this.f192522e.m128328w0(j);
            this.f192522e.m128326v0(j2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m119552c(int i) {
        Map map = this.f92234i;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.f92234i.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }
}
