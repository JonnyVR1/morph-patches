package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import java.io.IOException;
import p149l.ipx;
import p149l.l7j0;
import p149l.sj0;
import p149l.v680;
import p149l.vce;
import p149l.za5;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.i */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1965i {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.i$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo11270a(InterfaceC1965i interfaceC1965i, AbstractC1834c0 abstractC1834c0);
    }

    void addDrmEventListener(Handler handler, InterfaceC1854b interfaceC1854b);

    void addEventListener(Handler handler, InterfaceC1966j interfaceC1966j);

    InterfaceC1953h createPeriod(b bVar, sj0 sj0Var, long j);

    void disable(c cVar);

    void enable(c cVar);

    @Nullable
    default AbstractC1834c0 getInitialTimeline() {
        return null;
    }

    C1921n getMediaItem();

    default boolean isSingleWindow() {
        return true;
    }

    void maybeThrowSourceInfoRefreshError() throws IOException;

    void prepareSource(c cVar, @Nullable l7j0 l7j0Var, v680 v680Var);

    void releasePeriod(InterfaceC1953h interfaceC1953h);

    void releaseSource(c cVar);

    void removeDrmEventListener(InterfaceC1854b interfaceC1854b);

    void removeEventListener(InterfaceC1966j interfaceC1966j);

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.i$b */
    public static final class b extends ipx {
        public b(Object obj) {
            super(obj);
        }

        /* JADX INFO: renamed from: c */
        public b m11269c(Object obj) {
            return new b(super.m137606a(obj));
        }

        public b(Object obj, long j) {
            super(obj, j);
        }

        public b(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public b(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public b(ipx ipxVar) {
            super(ipxVar);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.i$a */
    public interface a {

        /* JADX INFO: renamed from: a */
        public static final a f8647a = InterfaceC1967k.f8653b;

        /* JADX INFO: renamed from: a */
        a mo10956a(vce vceVar);

        /* JADX INFO: renamed from: b */
        a mo10957b(InterfaceC2049c interfaceC2049c);

        /* JADX INFO: renamed from: c */
        InterfaceC1965i mo10958c(C1921n c1921n);

        /* JADX INFO: renamed from: d */
        default a mo10959d(za5.InterfaceC21651a interfaceC21651a) {
            return this;
        }
    }
}
