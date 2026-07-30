package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.source.AbstractC1957a;
import com.google.android.exoplayer2.source.InterfaceC1976h;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.android.exoplayer2.source.InterfaceC1990k;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import java.io.IOException;
import javax.net.SocketFactory;
import p153l.bmk0;
import p153l.c3j;
import p153l.lqf0;
import p153l.oj0;
import p153l.pgj0;
import p153l.sqd0;
import p153l.t9f;
import p153l.w11;
import p153l.zde;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class RtspMediaSource extends AbstractC1957a {

    /* JADX INFO: renamed from: a */
    public final C1944n f8836a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2000a.a f8837b;

    /* JADX INFO: renamed from: c */
    public final String f8838c;

    /* JADX INFO: renamed from: d */
    public final Uri f8839d;

    /* JADX INFO: renamed from: e */
    public final SocketFactory f8840e;

    /* JADX INFO: renamed from: f */
    public final boolean f8841f;

    /* JADX INFO: renamed from: h */
    public boolean f8843h;

    /* JADX INFO: renamed from: i */
    public boolean f8844i;

    /* JADX INFO: renamed from: g */
    public long f8842g = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public boolean f8845j = true;

    public static final class RtspUdpUnsupportedTransportException extends RtspPlaybackException {
        public RtspUdpUnsupportedTransportException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.RtspMediaSource$a */
    public class C1998a implements C2005f.c {
        public C1998a() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C2005f.c
        /* JADX INFO: renamed from: a */
        public void mo11525a() {
            RtspMediaSource.this.f8843h = false;
            RtspMediaSource.this.m11521g();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C2005f.c
        /* JADX INFO: renamed from: b */
        public void mo11526b(sqd0 sqd0Var) {
            RtspMediaSource.this.f8842g = bmk0.m105084J0(sqd0Var.m187515a());
            RtspMediaSource.this.f8843h = !sqd0Var.m187516c();
            RtspMediaSource.this.f8844i = sqd0Var.m187516c();
            RtspMediaSource.this.f8845j = false;
            RtspMediaSource.this.m11521g();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.RtspMediaSource$b */
    public class C1999b extends c3j {
        public C1999b(AbstractC1857c0 abstractC1857c0) {
            super(abstractC1857c0);
        }

        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: k */
        public AbstractC1857c0.b mo9453k(int i, AbstractC1857c0.b bVar, boolean z) {
            super.mo9453k(i, bVar, z);
            bVar.f7342f = true;
            return bVar;
        }

        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: s */
        public AbstractC1857c0.d mo9457s(int i, AbstractC1857c0.d dVar, long j) {
            super.mo9457s(i, dVar, j);
            dVar.f7376l = true;
            return dVar;
        }
    }

    static {
        t9f.m189752a("goog.exo.rtsp");
    }

    @VisibleForTesting
    public RtspMediaSource(C1944n c1944n, InterfaceC2000a.a aVar, String str, SocketFactory socketFactory, boolean z) {
        this.f8836a = c1944n;
        this.f8837b = aVar;
        this.f8838c = str;
        this.f8839d = ((C1944n.h) w11.m204369e(c1944n.f7997b)).f8094a;
        this.f8840e = socketFactory;
        this.f8841f = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m11521g() {
        AbstractC1857c0 lqf0Var = new lqf0(this.f8842g, this.f8843h, false, this.f8844i, null, this.f8836a);
        if (this.f8845j) {
            lqf0Var = new C1999b(lqf0Var);
        }
        refreshSourceInfo(lqf0Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public InterfaceC1976h createPeriod(InterfaceC1988i.b bVar, oj0 oj0Var, long j) {
        return new C2005f(oj0Var, this.f8837b, this.f8839d, new C1998a(), this.f8838c, this.f8840e, this.f8841f);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public C1944n getMediaItem() {
        return this.f8836a;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
    public void prepareSourceInternal(@Nullable pgj0 pgj0Var) {
        m11521g();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void releasePeriod(InterfaceC1976h interfaceC1976h) {
        ((C2005f) interfaceC1976h).m11657V();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1957a
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

    public static final class Factory implements InterfaceC1990k {

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ int f8846h = 0;

        /* JADX INFO: renamed from: c */
        public long f8847c = 8000;

        /* JADX INFO: renamed from: d */
        public String f8848d = "ExoPlayerLib/2.19.1";

        /* JADX INFO: renamed from: e */
        public SocketFactory f8849e = SocketFactory.getDefault();

        /* JADX INFO: renamed from: f */
        public boolean f8850f;

        /* JADX INFO: renamed from: g */
        public boolean f8851g;

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public RtspMediaSource mo11012c(C1944n c1944n) {
            w11.m204369e(c1944n.f7997b);
            boolean z = this.f8850f;
            long j = this.f8847c;
            return new RtspMediaSource(c1944n, z ? new C2010k(j) : new C2012m(j), this.f8848d, this.f8849e, this.f8851g);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo11011b(InterfaceC2072c interfaceC2072c) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC1988i.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory mo11010a(zde zdeVar) {
            return this;
        }
    }
}
