package p149l;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yvr0 extends rwr0 {

    /* JADX INFO: renamed from: i */
    public final Map f200287i;

    /* JADX INFO: renamed from: j */
    public final View f200288j;

    /* JADX INFO: renamed from: k */
    public final Context f200289k;

    public yvr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2, Map map, View view, Context context) {
        super(vur0Var, "DNq6U+mZz2ZReiKgjo/VDFnaMNaZiKgTjVzJ4/NswvXzkfhe/AgU2N86qSmmEbDf", "ZzhYXgKMhken/ic2sDR8A53WLOTMzsBN7DfnMjKoyhk=", zpr0Var, i, 85);
        this.f200287i = map;
        this.f200288j = view;
        this.f200289k = context;
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {m216228c(1), m216228c(2)};
        Context contextM200101b = this.f200289k;
        if (contextM200101b == null) {
            contextM200101b = this.f161368b.m200101b();
        }
        long[] jArr2 = (long[]) this.f161372f.invoke(null, jArr, contextM200101b, this.f200288j);
        long j = jArr2[0];
        this.f200287i.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        this.f200287i.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f161371e) {
            this.f161371e.m219793w0(j);
            this.f161371e.m219791v0(j2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m216228c(int i) {
        Map map = this.f200287i;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.f200287i.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }
}
