package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.C1973q;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p149l.d860;
import p149l.e100;
import p149l.m6j0;
import p149l.n35;
import p149l.sj0;
import p149l.uyi;
import p149l.vck0;
import p149l.w4c;
import p149l.y2c;
import p149l.y3f;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1949d implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final sj0 f8441a;

    /* JADX INFO: renamed from: b */
    public final b f8442b;

    /* JADX INFO: renamed from: f */
    public y2c f8446f;

    /* JADX INFO: renamed from: g */
    public long f8447g;

    /* JADX INFO: renamed from: h */
    public boolean f8448h;

    /* JADX INFO: renamed from: i */
    public boolean f8449i;

    /* JADX INFO: renamed from: j */
    public boolean f8450j;

    /* JADX INFO: renamed from: e */
    public final TreeMap<Long, Long> f8445e = new TreeMap<>();

    /* JADX INFO: renamed from: d */
    public final Handler f8444d = vck0.m197898x(this);

    /* JADX INFO: renamed from: c */
    public final y3f f8443c = new y3f();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f8451a;

        /* JADX INFO: renamed from: b */
        public final long f8452b;

        public a(long j, long j2) {
            this.f8451a = j;
            this.f8452b = j2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo11017a(long j);

        /* JADX INFO: renamed from: b */
        void mo11018b();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.d$c */
    public final class c implements m6j0 {

        /* JADX INFO: renamed from: a */
        public final C1973q f8453a;

        /* JADX INFO: renamed from: b */
        public final uyi f8454b = new uyi();

        /* JADX INFO: renamed from: c */
        public final e100 f8455c = new e100();

        /* JADX INFO: renamed from: d */
        public long f8456d = -9223372036854775807L;

        public c(sj0 sj0Var) {
            this.f8453a = C1973q.m11412l(sj0Var);
        }

        @Override // p149l.m6j0
        /* JADX INFO: renamed from: a */
        public void mo11109a(long j, int i, int i2, int i3, @Nullable m6j0.C18401a c18401a) {
            this.f8453a.mo11109a(j, i, i2, i3, c18401a);
            m11118l();
        }

        @Override // p149l.m6j0
        /* JADX INFO: renamed from: b */
        public void mo11110b(C1871k c1871k) {
            this.f8453a.mo11110b(c1871k);
        }

        @Override // p149l.m6j0
        /* JADX INFO: renamed from: c */
        public int mo11111c(w4c w4cVar, int i, boolean z, int i2) throws IOException {
            return this.f8453a.m153239e(w4cVar, i, z);
        }

        @Override // p149l.m6j0
        /* JADX INFO: renamed from: f */
        public void mo11112f(d860 d860Var, int i, int i2) {
            this.f8453a.m153238d(d860Var, i);
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public final e100 m11113g() {
            this.f8455c.mo9803i();
            if (this.f8453a.m11430R(this.f8454b, this.f8455c, 0, false) != -4) {
                return null;
            }
            this.f8455c.m9806w();
            return this.f8455c;
        }

        /* JADX INFO: renamed from: h */
        public boolean m11114h(long j) {
            return C1949d.this.m11101j(j);
        }

        /* JADX INFO: renamed from: i */
        public void m11115i(n35 n35Var) {
            long j = this.f8456d;
            if (j == -9223372036854775807L || n35Var.f136918h > j) {
                this.f8456d = n35Var.f136918h;
            }
            C1949d.this.m11104m(n35Var);
        }

        /* JADX INFO: renamed from: j */
        public boolean m11116j(n35 n35Var) {
            long j = this.f8456d;
            return C1949d.this.m11105n(j != -9223372036854775807L && j < n35Var.f136917g);
        }

        /* JADX INFO: renamed from: k */
        public final void m11117k(long j, long j2) {
            C1949d.this.f8444d.sendMessage(C1949d.this.f8444d.obtainMessage(1, new a(j, j2)));
        }

        /* JADX INFO: renamed from: l */
        public final void m11118l() {
            while (this.f8453a.m11423K(false)) {
                e100 e100VarM11113g = m11113g();
                if (e100VarM11113g != null) {
                    long j = e100VarM11113g.f7377e;
                    Metadata metadataMo214640a = C1949d.this.f8443c.mo214640a(e100VarM11113g);
                    if (metadataMo214640a != null) {
                        EventMessage eventMessage = (EventMessage) metadataMo214640a.m10532d(0);
                        if (C1949d.m11097h(eventMessage.schemeIdUri, eventMessage.value)) {
                            m11119m(j, eventMessage);
                        }
                    }
                }
            }
            this.f8453a.m11454s();
        }

        /* JADX INFO: renamed from: m */
        public final void m11119m(long j, EventMessage eventMessage) {
            long jM11096f = C1949d.m11096f(eventMessage);
            if (jM11096f == -9223372036854775807L) {
                return;
            }
            m11117k(j, jM11096f);
        }

        /* JADX INFO: renamed from: n */
        public void m11120n() {
            this.f8453a.m11431S();
        }
    }

    public C1949d(y2c y2cVar, b bVar, sj0 sj0Var) {
        this.f8446f = y2cVar;
        this.f8442b = bVar;
        this.f8441a = sj0Var;
    }

    /* JADX INFO: renamed from: f */
    public static long m11096f(EventMessage eventMessage) {
        try {
            return vck0.m197820Q0(vck0.m197795E(eventMessage.messageData));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m11097h(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Map.Entry<Long, Long> m11098e(long j) {
        return this.f8445e.ceilingEntry(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: g */
    public final void m11099g(long j, long j2) {
        Long l2 = this.f8445e.get(Long.valueOf(j2));
        if (l2 == null) {
            this.f8445e.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l2.longValue() > j) {
            this.f8445e.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f8450j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        m11099g(aVar.f8451a, aVar.f8452b);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m11100i() {
        if (this.f8448h) {
            this.f8449i = true;
            this.f8448h = false;
            this.f8442b.mo11018b();
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m11101j(long j) {
        y2c y2cVar = this.f8446f;
        boolean z = false;
        if (!y2cVar.f195510d) {
            return false;
        }
        if (this.f8449i) {
            return true;
        }
        Map.Entry<Long, Long> entryM11098e = m11098e(y2cVar.f195514h);
        if (entryM11098e != null && entryM11098e.getValue().longValue() < j) {
            this.f8447g = entryM11098e.getKey().longValue();
            m11103l();
            z = true;
        }
        if (z) {
            m11100i();
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public c m11102k() {
        return new c(this.f8441a);
    }

    /* JADX INFO: renamed from: l */
    public final void m11103l() {
        this.f8442b.mo11017a(this.f8447g);
    }

    /* JADX INFO: renamed from: m */
    public void m11104m(n35 n35Var) {
        this.f8448h = true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m11105n(boolean z) {
        if (!this.f8446f.f195510d) {
            return false;
        }
        if (this.f8449i) {
            return true;
        }
        if (!z) {
            return false;
        }
        m11100i();
        return true;
    }

    /* JADX INFO: renamed from: o */
    public void m11106o() {
        this.f8450j = true;
        this.f8444d.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: p */
    public final void m11107p() {
        Iterator<Map.Entry<Long, Long>> it = this.f8445e.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f8446f.f195514h) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m11108q(y2c y2cVar) {
        this.f8449i = false;
        this.f8447g = -9223372036854775807L;
        this.f8446f = y2cVar;
        m11107p();
    }
}
