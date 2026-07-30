package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class qhr0 extends ber0 {
    public qhr0(final ofr0 ofr0Var, int i, long j, long j2) {
        long j3;
        Objects.requireNonNull(ofr0Var);
        ydr0 ydr0Var = new ydr0() { // from class: l.nhr0
            @Override // p153l.ydr0
            public final long zza(long j4) {
                return ofr0Var.m167509b(j4);
            }
        };
        phr0 phr0Var = new phr0(ofr0Var, i, null);
        long jM167508a = ofr0Var.m167508a();
        long j4 = ofr0Var.f147155j;
        int i2 = ofr0Var.f147149d;
        if (i2 > 0) {
            j3 = ((((long) i2) + ((long) ofr0Var.f147148c)) / 2) + 1;
        } else {
            int i3 = ofr0Var.f147146a;
            long j5 = 4096;
            if (i3 == ofr0Var.f147147b && i3 > 0) {
                j5 = i3;
            }
            j3 = 64 + (((j5 * ((long) ofr0Var.f147152g)) * ((long) ofr0Var.f147153h)) / 8);
        }
        super(ydr0Var, phr0Var, jM167508a, 0L, j4, j, j2, j3, Math.max(6, ofr0Var.f147148c));
    }
}
