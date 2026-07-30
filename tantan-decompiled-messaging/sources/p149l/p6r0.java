package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class p6r0 {

    /* JADX INFO: renamed from: a */
    public int f147429a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f147430b;

    /* JADX INFO: renamed from: c */
    public int f147431c;

    /* JADX INFO: renamed from: d */
    public int f147432d;

    /* JADX INFO: renamed from: e */
    public int f147433e;

    /* JADX INFO: renamed from: f */
    public int f147434f;

    /* JADX INFO: renamed from: g */
    public int f147435g;

    /* JADX INFO: renamed from: a */
    public final boolean m167689a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!q6r0.m173171m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i6 = i4 - 1;
        this.f147429a = i2;
        this.f147430b = q6r0.f152947a[3 - i3];
        int i7 = q6r0.f152948b[i5];
        this.f147432d = i7;
        if (i2 == 2) {
            i7 /= 2;
            this.f147432d = i7;
        } else if (i2 == 0) {
            i7 /= 4;
            this.f147432d = i7;
        }
        int i8 = (i >>> 9) & 1;
        this.f147435g = q6r0.m173170l(i2, i3);
        if (i3 == 3) {
            int i9 = i2 == 3 ? q6r0.f152949c[i6] : q6r0.f152950d[i6];
            this.f147434f = i9;
            this.f147431c = (((i9 * 12) / i7) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? q6r0.f152951e[i6] : q6r0.f152952f[i6];
                this.f147434f = i10;
                this.f147431c = ((i10 * 144) / i7) + i8;
            } else {
                int i11 = q6r0.f152953g[i6];
                this.f147434f = i11;
                this.f147431c = (((i3 == 1 ? 72 : 144) * i11) / i7) + i8;
            }
        }
        this.f147433e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
