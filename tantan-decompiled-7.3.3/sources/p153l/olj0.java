package p153l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class olj0 implements mdg0 {

    /* JADX INFO: renamed from: a */
    public final klj0 f147841a;

    /* JADX INFO: renamed from: b */
    public final long[] f147842b;

    /* JADX INFO: renamed from: c */
    public final Map<String, nlj0> f147843c;

    /* JADX INFO: renamed from: d */
    public final Map<String, llj0> f147844d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f147845e;

    public olj0(klj0 klj0Var, Map<String, nlj0> map, Map<String, llj0> map2, Map<String, String> map3) {
        this.f147841a = klj0Var;
        this.f147844d = map2;
        this.f147845e = map3;
        this.f147843c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f147842b = klj0Var.m150380j();
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: a */
    public long mo95502a(int i) {
        return this.f147842b[i];
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: b */
    public int mo95503b() {
        return this.f147842b.length;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: f */
    public int mo95504f(long j) {
        int iM105129e = bmk0.m105129e(this.f147842b, j, false, false);
        if (iM105129e < this.f147842b.length) {
            return iM105129e;
        }
        return -1;
    }

    @Override // p153l.mdg0
    /* JADX INFO: renamed from: g */
    public List<myb> mo95505g(long j) {
        return this.f147841a.m150378h(j, this.f147843c, this.f147844d, this.f147845e);
    }
}
