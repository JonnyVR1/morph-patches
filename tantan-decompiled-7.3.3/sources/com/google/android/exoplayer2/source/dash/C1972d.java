package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.C1996q;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p153l.ba00;
import p153l.bmk0;
import p153l.c5f;
import p153l.e6c;
import p153l.h4c;
import p153l.ig60;
import p153l.o45;
import p153l.oj0;
import p153l.p1j;
import p153l.qfj0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1972d implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final oj0 f8478a;

    /* JADX INFO: renamed from: b */
    public final b f8479b;

    /* JADX INFO: renamed from: f */
    public h4c f8483f;

    /* JADX INFO: renamed from: g */
    public long f8484g;

    /* JADX INFO: renamed from: h */
    public boolean f8485h;

    /* JADX INFO: renamed from: i */
    public boolean f8486i;

    /* JADX INFO: renamed from: j */
    public boolean f8487j;

    /* JADX INFO: renamed from: e */
    public final TreeMap<Long, Long> f8482e = new TreeMap<>();

    /* JADX INFO: renamed from: d */
    public final Handler f8481d = bmk0.m105176x(this);

    /* JADX INFO: renamed from: c */
    public final c5f f8480c = new c5f();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f8488a;

        /* JADX INFO: renamed from: b */
        public final long f8489b;

        public a(long j, long j2) {
            this.f8488a = j;
            this.f8489b = j2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.d$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo11071a(long j);

        /* JADX INFO: renamed from: b */
        void mo11072b();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.d$c */
    public final class c implements qfj0 {

        /* JADX INFO: renamed from: a */
        public final C1996q f8490a;

        /* JADX INFO: renamed from: b */
        public final p1j f8491b = new p1j();

        /* JADX INFO: renamed from: c */
        public final ba00 f8492c = new ba00();

        /* JADX INFO: renamed from: d */
        public long f8493d = -9223372036854775807L;

        public c(oj0 oj0Var) {
            this.f8490a = C1996q.m11466l(oj0Var);
        }

        @Override // p153l.qfj0
        /* JADX INFO: renamed from: a */
        public void mo11163a(long j, int i, int i2, int i3, @Nullable qfj0.C19562a c19562a) {
            this.f8490a.mo11163a(j, i, i2, i3, c19562a);
            m11172l();
        }

        @Override // p153l.qfj0
        /* JADX INFO: renamed from: b */
        public void mo11164b(C1894k c1894k) {
            this.f8490a.mo11164b(c1894k);
        }

        @Override // p153l.qfj0
        /* JADX INFO: renamed from: c */
        public int mo11165c(e6c e6cVar, int i, boolean z, int i2) throws IOException {
            return this.f8490a.m176371e(e6cVar, i, z);
        }

        @Override // p153l.qfj0
        /* JADX INFO: renamed from: f */
        public void mo11166f(ig60 ig60Var, int i, int i2) {
            this.f8490a.m176370d(ig60Var, i);
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public final ba00 m11167g() {
            this.f8492c.mo9857i();
            if (this.f8490a.m11484R(this.f8491b, this.f8492c, 0, false) != -4) {
                return null;
            }
            this.f8492c.m9860w();
            return this.f8492c;
        }

        /* JADX INFO: renamed from: h */
        public boolean m11168h(long j) {
            return C1972d.this.m11155j(j);
        }

        /* JADX INFO: renamed from: i */
        public void m11169i(o45 o45Var) {
            long j = this.f8493d;
            if (j == -9223372036854775807L || o45Var.f144933h > j) {
                this.f8493d = o45Var.f144933h;
            }
            C1972d.this.m11158m(o45Var);
        }

        /* JADX INFO: renamed from: j */
        public boolean m11170j(o45 o45Var) {
            long j = this.f8493d;
            return C1972d.this.m11159n(j != -9223372036854775807L && j < o45Var.f144932g);
        }

        /* JADX INFO: renamed from: k */
        public final void m11171k(long j, long j2) {
            C1972d.this.f8481d.sendMessage(C1972d.this.f8481d.obtainMessage(1, new a(j, j2)));
        }

        /* JADX INFO: renamed from: l */
        public final void m11172l() {
            while (this.f8490a.m11477K(false)) {
                ba00 ba00VarM11167g = m11167g();
                if (ba00VarM11167g != null) {
                    long j = ba00VarM11167g.f7414e;
                    Metadata metadataMo131256a = C1972d.this.f8480c.mo131256a(ba00VarM11167g);
                    if (metadataMo131256a != null) {
                        EventMessage eventMessage = (EventMessage) metadataMo131256a.m10586d(0);
                        if (C1972d.m11151h(eventMessage.schemeIdUri, eventMessage.value)) {
                            m11173m(j, eventMessage);
                        }
                    }
                }
            }
            this.f8490a.m11508s();
        }

        /* JADX INFO: renamed from: m */
        public final void m11173m(long j, EventMessage eventMessage) {
            long jM11150f = C1972d.m11150f(eventMessage);
            if (jM11150f == -9223372036854775807L) {
                return;
            }
            m11171k(j, jM11150f);
        }

        /* JADX INFO: renamed from: n */
        public void m11174n() {
            this.f8490a.m11485S();
        }
    }

    public C1972d(h4c h4cVar, b bVar, oj0 oj0Var) {
        this.f8483f = h4cVar;
        this.f8479b = bVar;
        this.f8478a = oj0Var;
    }

    /* JADX INFO: renamed from: f */
    public static long m11150f(EventMessage eventMessage) {
        try {
            return bmk0.m105098Q0(bmk0.m105073E(eventMessage.messageData));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m11151h(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Map.Entry<Long, Long> m11152e(long j) {
        return this.f8482e.ceilingEntry(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: g */
    public final void m11153g(long j, long j2) {
        Long l2 = this.f8482e.get(Long.valueOf(j2));
        if (l2 == null) {
            this.f8482e.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l2.longValue() > j) {
            this.f8482e.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f8487j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        m11153g(aVar.f8488a, aVar.f8489b);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m11154i() {
        if (this.f8485h) {
            this.f8486i = true;
            this.f8485h = false;
            this.f8479b.mo11072b();
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m11155j(long j) {
        h4c h4cVar = this.f8483f;
        boolean z = false;
        if (!h4cVar.f107779d) {
            return false;
        }
        if (this.f8486i) {
            return true;
        }
        Map.Entry<Long, Long> entryM11152e = m11152e(h4cVar.f107783h);
        if (entryM11152e != null && entryM11152e.getValue().longValue() < j) {
            this.f8484g = entryM11152e.getKey().longValue();
            m11157l();
            z = true;
        }
        if (z) {
            m11154i();
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    public c m11156k() {
        return new c(this.f8478a);
    }

    /* JADX INFO: renamed from: l */
    public final void m11157l() {
        this.f8479b.mo11071a(this.f8484g);
    }

    /* JADX INFO: renamed from: m */
    public void m11158m(o45 o45Var) {
        this.f8485h = true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m11159n(boolean z) {
        if (!this.f8483f.f107779d) {
            return false;
        }
        if (this.f8486i) {
            return true;
        }
        if (!z) {
            return false;
        }
        m11154i();
        return true;
    }

    /* JADX INFO: renamed from: o */
    public void m11160o() {
        this.f8487j = true;
        this.f8481d.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: p */
    public final void m11161p() {
        Iterator<Map.Entry<Long, Long>> it = this.f8482e.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f8483f.f107783h) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m11162q(h4c h4cVar) {
        this.f8486i = false;
        this.f8484g = -9223372036854775807L;
        this.f8483f = h4cVar;
        m11161p();
    }
}
