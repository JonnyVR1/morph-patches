package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2047a;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p149l.a5c;
import p149l.d860;
import p149l.l7j0;
import p149l.p11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.e */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1950e implements a5c {

    /* JADX INFO: renamed from: a */
    public final a5c f8458a;

    /* JADX INFO: renamed from: b */
    public final int f8459b;

    /* JADX INFO: renamed from: c */
    public final a f8460c;

    /* JADX INFO: renamed from: d */
    public final byte[] f8461d;

    /* JADX INFO: renamed from: e */
    public int f8462e;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.e$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo11126b(d860 d860Var);
    }

    public C1950e(a5c a5cVar, int i, a aVar) {
        p11.m167007a(i > 0);
        this.f8458a = a5cVar;
        this.f8459b = i;
        this.f8460c = aVar;
        this.f8461d = new byte[1];
        this.f8462e = i;
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Uri mo11121a() {
        return this.f8458a.mo11121a();
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: b */
    public Map<String, List<String>> mo11122b() {
        return this.f8458a.mo11122b();
    }

    @Override // p149l.a5c
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: e */
    public void mo11123e(l7j0 l7j0Var) {
        p11.m167011e(l7j0Var);
        this.f8458a.mo11123e(l7j0Var);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11124j() throws IOException {
        if (this.f8458a.read(this.f8461d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f8461d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int i4 = this.f8458a.read(bArr, i3, i2);
            if (i4 == -1) {
                return false;
            }
            i3 += i4;
            i2 -= i4;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f8460c.mo11126b(new d860(bArr, i));
        }
        return true;
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public long mo11125n(C2047a c2047a) {
        throw new UnsupportedOperationException();
    }

    @Override // p149l.w4c
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f8462e == 0) {
            if (!m11124j()) {
                return -1;
            }
            this.f8462e = this.f8459b;
        }
        int i3 = this.f8458a.read(bArr, i, Math.min(this.f8462e, i2));
        if (i3 != -1) {
            this.f8462e -= i3;
        }
        return i3;
    }
}
