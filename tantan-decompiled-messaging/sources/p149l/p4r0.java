package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class p4r0 implements v6r0 {

    /* JADX INFO: renamed from: a */
    public final s4r0 f147203a;

    /* JADX INFO: renamed from: b */
    public final long f147204b;

    /* JADX INFO: renamed from: c */
    public final long f147205c;

    /* JADX INFO: renamed from: d */
    public final long f147206d;

    /* JADX INFO: renamed from: e */
    public final long f147207e;

    /* JADX INFO: renamed from: f */
    public final long f147208f;

    public p4r0(s4r0 s4r0Var, long j, long j2, long j3, long j4, long j5, long j6) {
        this.f147203a = s4r0Var;
        this.f147204b = j;
        this.f147205c = j3;
        this.f147206d = j4;
        this.f147207e = j5;
        this.f147208f = j6;
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        w6r0 w6r0Var = new w6r0(j, r4r0.m177828f(this.f147203a.zza(j), 0L, this.f147205c, this.f147206d, this.f147207e, this.f147208f));
        return new t6r0(w6r0Var, w6r0Var);
    }

    /* JADX INFO: renamed from: g */
    public final long m167411g(long j) {
        return this.f147203a.zza(j);
    }

    @Override // p149l.v6r0
    public final long zza() {
        return this.f147204b;
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return true;
    }
}
