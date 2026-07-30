package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableMap;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qhd0 implements xhd0 {

    /* JADX INFO: renamed from: a */
    public final whd0 f154453a;

    /* JADX INFO: renamed from: b */
    public final int f154454b;

    /* JADX INFO: renamed from: c */
    public m6j0 f154455c;

    /* JADX INFO: renamed from: d */
    public long f154456d;

    /* JADX INFO: renamed from: e */
    public int f154457e;

    /* JADX INFO: renamed from: f */
    public int f154458f;

    /* JADX INFO: renamed from: g */
    public long f154459g;

    /* JADX INFO: renamed from: h */
    public long f154460h;

    public qhd0(whd0 whd0Var) {
        this.f154453a = whd0Var;
        try {
            this.f154454b = m174527e(whd0Var.f186386d);
            this.f154456d = -9223372036854775807L;
            this.f154457e = -1;
            this.f154458f = 0;
            this.f154459g = 0L;
            this.f154460h = -9223372036854775807L;
        } catch (ParserException e) {
            fg3.m121203a(e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m174527e(ImmutableMap<String, String> immutableMap) throws ParserException {
        String str = immutableMap.get(Constants.KEY_CONFIG);
        int i = 0;
        i = 0;
        if (str != null && str.length() % 2 == 0) {
            c860 c860Var = new c860(vck0.m197807K(str));
            int iM105664h = c860Var.m105664h(1);
            if (iM105664h != 0) {
                throw ParserException.createForMalformedDataOfUnknownType("unsupported audio mux version: " + iM105664h, null);
            }
            p11.m167008b(c860Var.m105664h(1) == 1, "Only supports allStreamsSameTimeFraming.");
            int iM105664h2 = c860Var.m105664h(6);
            p11.m167008b(c860Var.m105664h(4) == 0, "Only suppors one program.");
            p11.m167008b(c860Var.m105664h(3) == 0, "Only suppors one layer.");
            i = iM105664h2;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: f */
    private void m174528f() {
        ((m6j0) p11.m167011e(this.f154455c)).mo11109a(this.f154460h, 1, this.f154458f, 0, null);
        this.f154458f = 0;
        this.f154460h = -9223372036854775807L;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: a */
    public void mo102003a(long j, long j2) {
        this.f154456d = j;
        this.f154458f = 0;
        this.f154459g = j2;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: b */
    public void mo102004b(d860 d860Var, long j, int i, boolean z) {
        p11.m167015i(this.f154455c);
        int iM188881b = thd0.m188881b(this.f154457e);
        if (this.f154458f > 0 && iM188881b < i) {
            m174528f();
        }
        for (int i2 = 0; i2 < this.f154454b; i2++) {
            int i3 = 0;
            while (d860Var.m110300f() < d860Var.m110301g()) {
                int iM110279H = d860Var.m110279H();
                i3 += iM110279H;
                if (iM110279H != 255) {
                    break;
                }
            }
            this.f154455c.m153238d(d860Var, i3);
            this.f154458f += i3;
        }
        this.f154460h = zhd0.m218790a(this.f154459g, j, this.f154456d, this.f154453a.f186384b);
        if (z) {
            m174528f();
        }
        this.f154457e = i;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: c */
    public void mo102005c(long j, int i) {
        p11.m167013g(this.f154456d == -9223372036854775807L);
        this.f154456d = j;
    }

    @Override // p149l.xhd0
    /* JADX INFO: renamed from: d */
    public void mo102006d(uqf uqfVar, int i) {
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(i, 2);
        this.f154455c = m6j0VarMo11362b;
        ((m6j0) vck0.m197866j(m6j0VarMo11362b)).mo11110b(this.f154453a.f186385c);
    }
}
