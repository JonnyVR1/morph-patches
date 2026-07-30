package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1860d;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.InterfaceC2090y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p153l.ba00;
import p153l.bmk0;
import p153l.ga00;
import p153l.p1j;
import p153l.w11;
import p153l.w900;
import p153l.wpg0;
import p153l.x900;

/* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1912a extends AbstractC1860d implements Handler.Callback {

    /* JADX INFO: renamed from: p */
    public final x900 f7951p;

    /* JADX INFO: renamed from: q */
    public final ga00 f7952q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final Handler f7953r;

    /* JADX INFO: renamed from: s */
    public final ba00 f7954s;

    /* JADX INFO: renamed from: t */
    public final boolean f7955t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public w900 f7956u;

    /* JADX INFO: renamed from: v */
    public boolean f7957v;

    /* JADX INFO: renamed from: w */
    public boolean f7958w;

    /* JADX INFO: renamed from: x */
    public long f7959x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public Metadata f7960y;

    /* JADX INFO: renamed from: z */
    public long f7961z;

    public C1912a(ga00 ga00Var, @Nullable Looper looper, x900 x900Var, boolean z) {
        super(5);
        this.f7952q = (ga00) w11.m204369e(ga00Var);
        this.f7953r = looper == null ? null : bmk0.m105172v(looper, this);
        this.f7951p = (x900) w11.m204369e(x900Var);
        this.f7955t = z;
        this.f7954s = new ba00();
        this.f7961z = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: L */
    public void mo9690L() {
        this.f7960y = null;
        this.f7956u = null;
        this.f7961z = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: N */
    public void mo9692N(long j, boolean z) {
        this.f7960y = null;
        this.f7957v = false;
        this.f7958w = false;
    }

    @Override // com.google.android.exoplayer2.AbstractC1860d
    /* JADX INFO: renamed from: T */
    public void mo9825T(C1894k[] c1894kArr, long j, long j2) {
        this.f7956u = this.f7951p.mo209761b(c1894kArr[0]);
        Metadata metadata = this.f7960y;
        if (metadata != null) {
            this.f7960y = metadata.m10585c((metadata.presentationTimeUs + this.f7961z) - j2);
        }
        this.f7961z = j2;
    }

    /* JADX INFO: renamed from: X */
    public final void m10593X(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.m10587e(); i++) {
            C1894k c1894kMo10588N = metadata.m10586d(i).mo10588N();
            if (c1894kMo10588N == null || !this.f7951p.mo209760a(c1894kMo10588N)) {
                list.add(metadata.m10586d(i));
            } else {
                w900 w900VarMo209761b = this.f7951p.mo209761b(c1894kMo10588N);
                byte[] bArr = (byte[]) w11.m204369e(metadata.m10586d(i).mo10590v());
                this.f7954s.mo9857i();
                this.f7954s.m9859v(bArr.length);
                ((ByteBuffer) bmk0.m105144j(this.f7954s.f7412c)).put(bArr);
                this.f7954s.m9860w();
                Metadata metadataMo131256a = w900VarMo209761b.mo131256a(this.f7954s);
                if (metadataMo131256a != null) {
                    m10593X(metadataMo131256a, list);
                }
            }
        }
    }

    @SideEffectFree
    /* JADX INFO: renamed from: Y */
    public final long m10594Y(long j) {
        w11.m204371g(j != -9223372036854775807L);
        w11.m204371g(this.f7961z != -9223372036854775807L);
        return j - this.f7961z;
    }

    /* JADX INFO: renamed from: Z */
    public final void m10595Z(Metadata metadata) {
        Handler handler = this.f7953r;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            m10596a0(metadata);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2090y
    /* JADX INFO: renamed from: a */
    public int mo10438a(C1894k c1894k) {
        if (this.f7951p.mo209760a(c1894k)) {
            return InterfaceC2090y.m12266v(c1894k.f7772G == 0 ? 4 : 2);
        }
        return InterfaceC2090y.m12266v(0);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m10596a0(Metadata metadata) {
        this.f7952q.mo10178n(metadata);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: b */
    public boolean mo9707b() {
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m10597b0(long j) {
        boolean z;
        Metadata metadata = this.f7960y;
        if (metadata == null || (!this.f7955t && metadata.presentationTimeUs > m10594Y(j))) {
            z = false;
        } else {
            m10595Z(this.f7960y);
            this.f7960y = null;
            z = true;
        }
        if (this.f7957v && this.f7960y == null) {
            this.f7958w = true;
        }
        return z;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: c */
    public boolean mo9708c() {
        return this.f7958w;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m10598c0() {
        if (this.f7957v || this.f7960y != null) {
            return;
        }
        this.f7954s.mo9857i();
        p1j p1jVarM9819G = m9819G();
        int iM9826U = m9826U(p1jVarM9819G, this.f7954s, 0);
        if (iM9826U != -4) {
            if (iM9826U == -5) {
                this.f7959x = ((C1894k) w11.m204369e(p1jVarM9819G.f150174b)).f7789p;
            }
        } else {
            if (this.f7954s.m97779p()) {
                this.f7957v = true;
                return;
            }
            ba00 ba00Var = this.f7954s;
            ba00Var.f75635i = this.f7959x;
            ba00Var.m9860w();
            Metadata metadataMo131256a = ((w900) bmk0.m105144j(this.f7956u)).mo131256a(this.f7954s);
            if (metadataMo131256a != null) {
                ArrayList arrayList = new ArrayList(metadataMo131256a.m10587e());
                m10593X(metadataMo131256a, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f7960y = new Metadata(m10594Y(this.f7954s.f7414e), arrayList);
            }
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x, com.google.android.exoplayer2.InterfaceC2090y
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m10596a0((Metadata) message.obj);
            return true;
        }
        wpg0.m207458a();
        return false;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: j */
    public void mo10447j(long j, long j2) {
        boolean zM10597b0 = true;
        while (zM10597b0) {
            m10598c0();
            zM10597b0 = m10597b0(j);
        }
    }

    public C1912a(ga00 ga00Var, @Nullable Looper looper, x900 x900Var) {
        this(ga00Var, looper, x900Var, false);
    }

    public C1912a(ga00 ga00Var, @Nullable Looper looper) {
        this(ga00Var, looper, x900.f192890a);
    }
}
