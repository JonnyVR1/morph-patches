package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class u5j0 {

    /* JADX INFO: renamed from: a */
    public final int f174719a;

    /* JADX INFO: renamed from: b */
    public final int f174720b;

    /* JADX INFO: renamed from: c */
    public final long f174721c;

    /* JADX INFO: renamed from: d */
    public final long f174722d;

    /* JADX INFO: renamed from: e */
    public final long f174723e;

    /* JADX INFO: renamed from: f */
    public final C1871k f174724f;

    /* JADX INFO: renamed from: g */
    public final int f174725g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final long[] f174726h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final long[] f174727i;

    /* JADX INFO: renamed from: j */
    public final int f174728j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final v5j0[] f174729k;

    public u5j0(int i, int i2, long j, long j2, long j3, C1871k c1871k, int i3, @Nullable v5j0[] v5j0VarArr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f174719a = i;
        this.f174720b = i2;
        this.f174721c = j;
        this.f174722d = j2;
        this.f174723e = j3;
        this.f174724f = c1871k;
        this.f174725g = i3;
        this.f174729k = v5j0VarArr;
        this.f174728j = i4;
        this.f174726h = jArr;
        this.f174727i = jArr2;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public v5j0 m191866a(int i) {
        v5j0[] v5j0VarArr = this.f174729k;
        if (v5j0VarArr == null) {
            return null;
        }
        return v5j0VarArr[i];
    }
}
