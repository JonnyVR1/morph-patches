package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class yej0 {

    /* JADX INFO: renamed from: a */
    public final int f199366a;

    /* JADX INFO: renamed from: b */
    public final int f199367b;

    /* JADX INFO: renamed from: c */
    public final long f199368c;

    /* JADX INFO: renamed from: d */
    public final long f199369d;

    /* JADX INFO: renamed from: e */
    public final long f199370e;

    /* JADX INFO: renamed from: f */
    public final C1894k f199371f;

    /* JADX INFO: renamed from: g */
    public final int f199372g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final long[] f199373h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final long[] f199374i;

    /* JADX INFO: renamed from: j */
    public final int f199375j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final zej0[] f199376k;

    public yej0(int i, int i2, long j, long j2, long j3, C1894k c1894k, int i3, @Nullable zej0[] zej0VarArr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f199366a = i;
        this.f199367b = i2;
        this.f199368c = j;
        this.f199369d = j2;
        this.f199370e = j3;
        this.f199371f = c1894k;
        this.f199372g = i3;
        this.f199376k = zej0VarArr;
        this.f199375j = i4;
        this.f199373h = jArr;
        this.f199374i = jArr2;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public zej0 m215416a(int i) {
        zej0[] zej0VarArr = this.f199376k;
        if (zej0VarArr == null) {
            return null;
        }
        return zej0VarArr[i];
    }
}
