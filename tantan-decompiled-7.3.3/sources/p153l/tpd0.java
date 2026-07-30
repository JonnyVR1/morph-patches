package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableMap;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class tpd0 implements aqd0 {

    /* JADX INFO: renamed from: a */
    public final zpd0 f175585a;

    /* JADX INFO: renamed from: b */
    public final int f175586b;

    /* JADX INFO: renamed from: c */
    public qfj0 f175587c;

    /* JADX INFO: renamed from: d */
    public long f175588d;

    /* JADX INFO: renamed from: e */
    public int f175589e;

    /* JADX INFO: renamed from: f */
    public int f175590f;

    /* JADX INFO: renamed from: g */
    public long f175591g;

    /* JADX INFO: renamed from: h */
    public long f175592h;

    public tpd0(zpd0 zpd0Var) {
        this.f175585a = zpd0Var;
        try {
            this.f175586b = m192126e(zpd0Var.f205456d);
            this.f175588d = -9223372036854775807L;
            this.f175589e = -1;
            this.f175590f = 0;
            this.f175591g = 0L;
            this.f175592h = -9223372036854775807L;
        } catch (ParserException e) {
            tg3.m191013a(e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m192126e(ImmutableMap<String, String> immutableMap) throws ParserException {
        String str = immutableMap.get(Constants.KEY_CONFIG);
        int i = 0;
        i = 0;
        if (str != null && str.length() % 2 == 0) {
            hg60 hg60Var = new hg60(bmk0.m105085K(str));
            int iM134905h = hg60Var.m134905h(1);
            if (iM134905h != 0) {
                throw ParserException.createForMalformedDataOfUnknownType("unsupported audio mux version: " + iM134905h, null);
            }
            w11.m204366b(hg60Var.m134905h(1) == 1, "Only supports allStreamsSameTimeFraming.");
            int iM134905h2 = hg60Var.m134905h(6);
            w11.m204366b(hg60Var.m134905h(4) == 0, "Only suppors one program.");
            w11.m204366b(hg60Var.m134905h(3) == 0, "Only suppors one layer.");
            i = iM134905h2;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: f */
    private void m192127f() {
        ((qfj0) w11.m204369e(this.f175587c)).mo11163a(this.f175592h, 1, this.f175590f, 0, null);
        this.f175590f = 0;
        this.f175592h = -9223372036854775807L;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: a */
    public void mo99454a(long j, long j2) {
        this.f175588d = j;
        this.f175590f = 0;
        this.f175591g = j2;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: b */
    public void mo99455b(ig60 ig60Var, long j, int i, boolean z) {
        w11.m204373i(this.f175587c);
        int iM207434b = wpd0.m207434b(this.f175589e);
        if (this.f175590f > 0 && iM207434b < i) {
            m192127f();
        }
        for (int i2 = 0; i2 < this.f175586b; i2++) {
            int i3 = 0;
            while (ig60Var.m139816f() < ig60Var.m139817g()) {
                int iM139795H = ig60Var.m139795H();
                i3 += iM139795H;
                if (iM139795H != 255) {
                    break;
                }
            }
            this.f175587c.m176370d(ig60Var, i3);
            this.f175590f += i3;
        }
        this.f175592h = cqd0.m111889a(this.f175591g, j, this.f175588d, this.f175585a.f205454b);
        if (z) {
            m192127f();
        }
        this.f175589e = i;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: c */
    public void mo99456c(long j, int i) {
        w11.m204371g(this.f175588d == -9223372036854775807L);
        this.f175588d = j;
    }

    @Override // p153l.aqd0
    /* JADX INFO: renamed from: d */
    public void mo99457d(bsf bsfVar, int i) {
        qfj0 qfj0VarMo11416b = bsfVar.mo11416b(i, 2);
        this.f175587c = qfj0VarMo11416b;
        ((qfj0) bmk0.m105144j(qfj0VarMo11416b)).mo11164b(this.f175585a.f205455c);
    }
}
