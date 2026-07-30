package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.upstream.C2070a;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class r5c extends o45 {

    /* JADX INFO: renamed from: j */
    public byte[] f161335j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f161336k;

    public r5c(g6c g6cVar, C2070a c2070a, int i, C1894k c1894k, int i2, @Nullable Object obj, @Nullable byte[] bArr) {
        super(g6cVar, c2070a, i, c1894k, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f161335j = bArr == null ? bmk0.f77318f : bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: a */
    public final void mo11431a() throws IOException {
        try {
            this.f144934i.mo11179n(this.f144927b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f161336k) {
                m179851i(i2);
                i = this.f144934i.read(this.f161335j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f161336k) {
                mo124155g(this.f161335j, i2);
            }
        } finally {
            m6c.m157209a(this.f144934i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: c */
    public final void mo11432c() {
        this.f161336k = true;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo124155g(byte[] bArr, int i) throws IOException;

    /* JADX INFO: renamed from: h */
    public byte[] m179850h() {
        return this.f161335j;
    }

    /* JADX INFO: renamed from: i */
    public final void m179851i(int i) {
        byte[] bArr = this.f161335j;
        if (bArr.length < i + 16384) {
            this.f161335j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
