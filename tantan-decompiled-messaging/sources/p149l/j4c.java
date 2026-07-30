package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.upstream.C2047a;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class j4c extends n35 {

    /* JADX INFO: renamed from: j */
    public byte[] f116152j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f116153k;

    public j4c(a5c a5cVar, C2047a c2047a, int i, C1871k c1871k, int i2, @Nullable Object obj, @Nullable byte[] bArr) {
        super(a5cVar, c2047a, i, c1871k, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f116152j = bArr == null ? vck0.f180953f : bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: a */
    public final void mo11377a() throws IOException {
        try {
            this.f136919i.mo11125n(this.f136912b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f116153k) {
                m139642i(i2);
                i = this.f136919i.read(this.f116152j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f116153k) {
                mo139640g(this.f116152j, i2);
            }
        } finally {
            g5c.m124484a(this.f136919i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: c */
    public final void mo11378c() {
        this.f116153k = true;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo139640g(byte[] bArr, int i) throws IOException;

    /* JADX INFO: renamed from: h */
    public byte[] m139641h() {
        return this.f116152j;
    }

    /* JADX INFO: renamed from: i */
    public final void m139642i(int i) {
        byte[] bArr = this.f116152j;
        if (bArr.length < i + 16384) {
            this.f116152j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
