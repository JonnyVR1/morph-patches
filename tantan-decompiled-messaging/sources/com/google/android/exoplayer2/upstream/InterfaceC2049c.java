package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;
import p149l.lrv;
import p149l.nkx;
import p149l.p11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC2049c {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f9514a;

        /* JADX INFO: renamed from: b */
        public final int f9515b;

        /* JADX INFO: renamed from: c */
        public final int f9516c;

        /* JADX INFO: renamed from: d */
        public final int f9517d;

        public a(int i, int i2, int i3, int i4) {
            this.f9514a = i;
            this.f9515b = i2;
            this.f9516c = i3;
            this.f9517d = i4;
        }

        /* JADX INFO: renamed from: a */
        public boolean m12123a(int i) {
            if (i == 1) {
                return this.f9514a - this.f9515b > 1;
            }
            return this.f9516c - this.f9517d > 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f9518a;

        /* JADX INFO: renamed from: b */
        public final long f9519b;

        public b(int i, long j) {
            p11.m167007a(j >= 0);
            this.f9518a = i;
            this.f9519b = j;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.c$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final lrv f9520a;

        /* JADX INFO: renamed from: b */
        public final nkx f9521b;

        /* JADX INFO: renamed from: c */
        public final IOException f9522c;

        /* JADX INFO: renamed from: d */
        public final int f9523d;

        public c(lrv lrvVar, nkx nkxVar, IOException iOException, int i) {
            this.f9520a = lrvVar;
            this.f9521b = nkxVar;
            this.f9522c = iOException;
            this.f9523d = i;
        }
    }

    /* JADX INFO: renamed from: a */
    long mo12118a(c cVar);

    @Nullable
    /* JADX INFO: renamed from: b */
    b mo12119b(a aVar, c cVar);

    /* JADX INFO: renamed from: c */
    default void m12122c(long j) {
    }

    /* JADX INFO: renamed from: d */
    int mo12120d(int i);
}
