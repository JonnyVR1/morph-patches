package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import java.io.IOException;
import p153l.bf80;
import p153l.fyx;
import p153l.oj0;
import p153l.pgj0;
import p153l.zb5;
import p153l.zde;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.i */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1988i {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.i$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo11324a(InterfaceC1988i interfaceC1988i, AbstractC1857c0 abstractC1857c0);
    }

    void addDrmEventListener(Handler handler, InterfaceC1877b interfaceC1877b);

    void addEventListener(Handler handler, InterfaceC1989j interfaceC1989j);

    InterfaceC1976h createPeriod(b bVar, oj0 oj0Var, long j);

    void disable(c cVar);

    void enable(c cVar);

    @Nullable
    default AbstractC1857c0 getInitialTimeline() {
        return null;
    }

    C1944n getMediaItem();

    default boolean isSingleWindow() {
        return true;
    }

    void maybeThrowSourceInfoRefreshError() throws IOException;

    void prepareSource(c cVar, @Nullable pgj0 pgj0Var, bf80 bf80Var);

    void releasePeriod(InterfaceC1976h interfaceC1976h);

    void releaseSource(c cVar);

    void removeDrmEventListener(InterfaceC1877b interfaceC1877b);

    void removeEventListener(InterfaceC1989j interfaceC1989j);

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.i$b */
    public static final class b extends fyx {
        public b(Object obj) {
            super(obj);
        }

        /* JADX INFO: renamed from: c */
        public b m11323c(Object obj) {
            return new b(super.m128141a(obj));
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

        public b(fyx fyxVar) {
            super(fyxVar);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.i$a */
    public interface a {

        /* JADX INFO: renamed from: a */
        public static final a f8684a = InterfaceC1990k.f8690b;

        /* JADX INFO: renamed from: a */
        a mo11010a(zde zdeVar);

        /* JADX INFO: renamed from: b */
        a mo11011b(InterfaceC2072c interfaceC2072c);

        /* JADX INFO: renamed from: c */
        InterfaceC1988i mo11012c(C1944n c1944n);

        /* JADX INFO: renamed from: d */
        default a mo11013d(zb5.InterfaceC21789a interfaceC21789a) {
            return this;
        }
    }
}
