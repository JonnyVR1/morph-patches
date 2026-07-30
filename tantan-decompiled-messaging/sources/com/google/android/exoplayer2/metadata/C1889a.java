package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1837d;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.InterfaceC2067y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p149l.a100;
import p149l.e100;
import p149l.j100;
import p149l.ohg0;
import p149l.p11;
import p149l.uyi;
import p149l.vck0;
import p149l.z000;

/* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1889a extends AbstractC1837d implements Handler.Callback {

    /* JADX INFO: renamed from: p */
    public final a100 f7914p;

    /* JADX INFO: renamed from: q */
    public final j100 f7915q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final Handler f7916r;

    /* JADX INFO: renamed from: s */
    public final e100 f7917s;

    /* JADX INFO: renamed from: t */
    public final boolean f7918t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public z000 f7919u;

    /* JADX INFO: renamed from: v */
    public boolean f7920v;

    /* JADX INFO: renamed from: w */
    public boolean f7921w;

    /* JADX INFO: renamed from: x */
    public long f7922x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public Metadata f7923y;

    /* JADX INFO: renamed from: z */
    public long f7924z;

    public C1889a(j100 j100Var, @Nullable Looper looper, a100 a100Var, boolean z) {
        super(5);
        this.f7915q = (j100) p11.m167011e(j100Var);
        this.f7916r = looper == null ? null : vck0.m197894v(looper, this);
        this.f7914p = (a100) p11.m167011e(a100Var);
        this.f7918t = z;
        this.f7917s = new e100();
        this.f7924z = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: L */
    public void mo9636L() {
        this.f7923y = null;
        this.f7919u = null;
        this.f7924z = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: N */
    public void mo9638N(long j, boolean z) {
        this.f7923y = null;
        this.f7920v = false;
        this.f7921w = false;
    }

    @Override // com.google.android.exoplayer2.AbstractC1837d
    /* JADX INFO: renamed from: T */
    public void mo9771T(C1871k[] c1871kArr, long j, long j2) {
        this.f7919u = this.f7914p.mo94502b(c1871kArr[0]);
        Metadata metadata = this.f7923y;
        if (metadata != null) {
            this.f7923y = metadata.m10531c((metadata.presentationTimeUs + this.f7924z) - j2);
        }
        this.f7924z = j2;
    }

    /* JADX INFO: renamed from: X */
    public final void m10539X(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.m10533e(); i++) {
            C1871k c1871kMo10534N = metadata.m10532d(i).mo10534N();
            if (c1871kMo10534N == null || !this.f7914p.mo94501a(c1871kMo10534N)) {
                list.add(metadata.m10532d(i));
            } else {
                z000 z000VarMo94502b = this.f7914p.mo94502b(c1871kMo10534N);
                byte[] bArr = (byte[]) p11.m167011e(metadata.m10532d(i).mo10536v());
                this.f7917s.mo9803i();
                this.f7917s.m9805v(bArr.length);
                ((ByteBuffer) vck0.m197866j(this.f7917s.f7375c)).put(bArr);
                this.f7917s.m9806w();
                Metadata metadataMo214640a = z000VarMo94502b.mo214640a(this.f7917s);
                if (metadataMo214640a != null) {
                    m10539X(metadataMo214640a, list);
                }
            }
        }
    }

    @SideEffectFree
    /* JADX INFO: renamed from: Y */
    public final long m10540Y(long j) {
        p11.m167013g(j != -9223372036854775807L);
        p11.m167013g(this.f7924z != -9223372036854775807L);
        return j - this.f7924z;
    }

    /* JADX INFO: renamed from: Z */
    public final void m10541Z(Metadata metadata) {
        Handler handler = this.f7916r;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            m10542a0(metadata);
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2067y
    /* JADX INFO: renamed from: a */
    public int mo10384a(C1871k c1871k) {
        if (this.f7914p.mo94501a(c1871k)) {
            return InterfaceC2067y.m12212v(c1871k.f7735G == 0 ? 4 : 2);
        }
        return InterfaceC2067y.m12212v(0);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m10542a0(Metadata metadata) {
        this.f7915q.mo10124n(metadata);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: b */
    public boolean mo9653b() {
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m10543b0(long j) {
        boolean z;
        Metadata metadata = this.f7923y;
        if (metadata == null || (!this.f7918t && metadata.presentationTimeUs > m10540Y(j))) {
            z = false;
        } else {
            m10541Z(this.f7923y);
            this.f7923y = null;
            z = true;
        }
        if (this.f7920v && this.f7923y == null) {
            this.f7921w = true;
        }
        return z;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: c */
    public boolean mo9654c() {
        return this.f7921w;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m10544c0() {
        if (this.f7920v || this.f7923y != null) {
            return;
        }
        this.f7917s.mo9803i();
        uyi uyiVarM9765G = m9765G();
        int iM9772U = m9772U(uyiVarM9765G, this.f7917s, 0);
        if (iM9772U != -4) {
            if (iM9772U == -5) {
                this.f7922x = ((C1871k) p11.m167011e(uyiVarM9765G.f178866b)).f7752p;
            }
        } else {
            if (this.f7917s.m154495p()) {
                this.f7920v = true;
                return;
            }
            e100 e100Var = this.f7917s;
            e100Var.f88695i = this.f7922x;
            e100Var.m9806w();
            Metadata metadataMo214640a = ((z000) vck0.m197866j(this.f7919u)).mo214640a(this.f7917s);
            if (metadataMo214640a != null) {
                ArrayList arrayList = new ArrayList(metadataMo214640a.m10533e());
                m10539X(metadataMo214640a, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f7923y = new Metadata(m10540Y(this.f7917s.f7377e), arrayList);
            }
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x, com.google.android.exoplayer2.InterfaceC2067y
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m10542a0((Metadata) message.obj);
            return true;
        }
        ohg0.m164364a();
        return false;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: j */
    public void mo10393j(long j, long j2) {
        boolean zM10543b0 = true;
        while (zM10543b0) {
            m10544c0();
            zM10543b0 = m10543b0(j);
        }
    }

    public C1889a(j100 j100Var, @Nullable Looper looper, a100 a100Var) {
        this(j100Var, looper, a100Var, false);
    }

    public C1889a(j100 j100Var, @Nullable Looper looper) {
        this(j100Var, looper, a100.f67091a);
    }
}
