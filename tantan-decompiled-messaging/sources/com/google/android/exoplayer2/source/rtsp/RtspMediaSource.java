package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.source.AbstractC1934a;
import com.google.android.exoplayer2.source.InterfaceC1953h;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.android.exoplayer2.source.InterfaceC1967k;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import java.io.IOException;
import javax.net.SocketFactory;
import p149l.cif0;
import p149l.h0j;
import p149l.l7j0;
import p149l.n8f;
import p149l.p11;
import p149l.pid0;
import p149l.sj0;
import p149l.vce;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class RtspMediaSource extends AbstractC1934a {

    /* JADX INFO: renamed from: a */
    public final C1921n f8799a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1977a.a f8800b;

    /* JADX INFO: renamed from: c */
    public final String f8801c;

    /* JADX INFO: renamed from: d */
    public final Uri f8802d;

    /* JADX INFO: renamed from: e */
    public final SocketFactory f8803e;

    /* JADX INFO: renamed from: f */
    public final boolean f8804f;

    /* JADX INFO: renamed from: h */
    public boolean f8806h;

    /* JADX INFO: renamed from: i */
    public boolean f8807i;

    /* JADX INFO: renamed from: g */
    public long f8805g = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public boolean f8808j = true;

    public static final class RtspUdpUnsupportedTransportException extends RtspPlaybackException {
        public RtspUdpUnsupportedTransportException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.RtspMediaSource$a */
    public class C1975a implements C1982f.c {
        public C1975a() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C1982f.c
        /* JADX INFO: renamed from: a */
        public void mo11471a() {
            RtspMediaSource.this.f8806h = false;
            RtspMediaSource.this.m11467g();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C1982f.c
        /* JADX INFO: renamed from: b */
        public void mo11472b(pid0 pid0Var) {
            RtspMediaSource.this.f8805g = vck0.m197806J0(pid0Var.m169594a());
            RtspMediaSource.this.f8806h = !pid0Var.m169595c();
            RtspMediaSource.this.f8807i = pid0Var.m169595c();
            RtspMediaSource.this.f8808j = false;
            RtspMediaSource.this.m11467g();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.RtspMediaSource$b */
    public class C1976b extends h0j {
        public C1976b(AbstractC1834c0 abstractC1834c0) {
            super(abstractC1834c0);
        }

        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: k */
        public AbstractC1834c0.b mo9399k(int i, AbstractC1834c0.b bVar, boolean z) {
            super.mo9399k(i, bVar, z);
            bVar.f7305f = true;
            return bVar;
        }

        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: s */
        public AbstractC1834c0.d mo9403s(int i, AbstractC1834c0.d dVar, long j) {
            super.mo9403s(i, dVar, j);
            dVar.f7339l = true;
            return dVar;
        }
    }

    static {
        n8f.m158492a("goog.exo.rtsp");
    }

    @VisibleForTesting
    public RtspMediaSource(C1921n c1921n, InterfaceC1977a.a aVar, String str, SocketFactory socketFactory, boolean z) {
        this.f8799a = c1921n;
        this.f8800b = aVar;
        this.f8801c = str;
        this.f8802d = ((C1921n.h) p11.m167011e(c1921n.f7960b)).f8057a;
        this.f8803e = socketFactory;
        this.f8804f = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m11467g() {
        AbstractC1834c0 cif0Var = new cif0(this.f8805g, this.f8806h, false, this.f8807i, null, this.f8799a);
        if (this.f8808j) {
            cif0Var = new C1976b(cif0Var);
        }
        refreshSourceInfo(cif0Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public InterfaceC1953h createPeriod(InterfaceC1965i.b bVar, sj0 sj0Var, long j) {
        return new C1982f(sj0Var, this.f8800b, this.f8802d, new C1975a(), this.f8801c, this.f8803e, this.f8804f);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public C1921n getMediaItem() {
        return this.f8799a;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    public void prepareSourceInternal(@Nullable l7j0 l7j0Var) {
        m11467g();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void releasePeriod(InterfaceC1953h interfaceC1953h) {
        ((C1982f) interfaceC1953h).m11603V();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1934a
    public void releaseSourceInternal() {
    }

    public static class RtspPlaybackException extends IOException {
        public RtspPlaybackException(String str) {
            super(str);
        }

        public RtspPlaybackException(Throwable th) {
            super(th);
        }

        public RtspPlaybackException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static final class Factory implements InterfaceC1967k {

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ int f8809h = 0;

        /* JADX INFO: renamed from: c */
        public long f8810c = 8000;

        /* JADX INFO: renamed from: d */
        public String f8811d = "ExoPlayerLib/2.19.1";

        /* JADX INFO: renamed from: e */
        public SocketFactory f8812e = SocketFactory.getDefault();

        /* JADX INFO: renamed from: f */
        public boolean f8813f;

        /* JADX INFO: renamed from: g */
        public boolean f8814g;

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public RtspMediaSource mo10958c(C1921n c1921n) {
            p11.m167011e(c1921n.f7960b);
            boolean z = this.f8813f;
            long j = this.f8810c;
            return new RtspMediaSource(c1921n, z ? new C1987k(j) : new C1989m(j), this.f8811d, this.f8812e, this.f8814g);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo10957b(InterfaceC2049c interfaceC2049c) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1965i.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory mo10956a(vce vceVar) {
            return this;
        }
    }
}
