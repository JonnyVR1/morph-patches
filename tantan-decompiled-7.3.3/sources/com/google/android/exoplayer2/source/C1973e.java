package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2070a;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p153l.g6c;
import p153l.ig60;
import p153l.pgj0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.e */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1973e implements g6c {

    /* JADX INFO: renamed from: a */
    public final g6c f8495a;

    /* JADX INFO: renamed from: b */
    public final int f8496b;

    /* JADX INFO: renamed from: c */
    public final a f8497c;

    /* JADX INFO: renamed from: d */
    public final byte[] f8498d;

    /* JADX INFO: renamed from: e */
    public int f8499e;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.e$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo11180b(ig60 ig60Var);
    }

    public C1973e(g6c g6cVar, int i, a aVar) {
        w11.m204365a(i > 0);
        this.f8495a = g6cVar;
        this.f8496b = i;
        this.f8497c = aVar;
        this.f8498d = new byte[1];
        this.f8499e = i;
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: a */
    public Map<String, List<String>> mo11175a() {
        return this.f8495a.mo11175a();
    }

    @Override // p153l.g6c
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public Uri mo11176d() {
        return this.f8495a.mo11176d();
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: e */
    public void mo11177e(pgj0 pgj0Var) {
        w11.m204369e(pgj0Var);
        this.f8495a.mo11177e(pgj0Var);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11178j() throws IOException {
        if (this.f8495a.read(this.f8498d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f8498d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int i4 = this.f8495a.read(bArr, i3, i2);
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
            this.f8497c.mo11180b(new ig60(bArr, i));
        }
        return true;
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public long mo11179n(C2070a c2070a) {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.e6c
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f8499e == 0) {
            if (!m11178j()) {
                return -1;
            }
            this.f8499e = this.f8496b;
        }
        int i3 = this.f8495a.read(bArr, i, Math.min(this.f8499e, i2));
        if (i3 != -1) {
            this.f8499e -= i3;
        }
        return i3;
    }
}
