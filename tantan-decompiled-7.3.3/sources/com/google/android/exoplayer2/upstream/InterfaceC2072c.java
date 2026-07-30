package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;
import p153l.ktx;
import p153l.mtv;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC2072c {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f9551a;

        /* JADX INFO: renamed from: b */
        public final int f9552b;

        /* JADX INFO: renamed from: c */
        public final int f9553c;

        /* JADX INFO: renamed from: d */
        public final int f9554d;

        public a(int i, int i2, int i3, int i4) {
            this.f9551a = i;
            this.f9552b = i2;
            this.f9553c = i3;
            this.f9554d = i4;
        }

        /* JADX INFO: renamed from: a */
        public boolean m12177a(int i) {
            if (i == 1) {
                return this.f9551a - this.f9552b > 1;
            }
            return this.f9553c - this.f9554d > 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f9555a;

        /* JADX INFO: renamed from: b */
        public final long f9556b;

        public b(int i, long j) {
            w11.m204365a(j >= 0);
            this.f9555a = i;
            this.f9556b = j;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.c$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final mtv f9557a;

        /* JADX INFO: renamed from: b */
        public final ktx f9558b;

        /* JADX INFO: renamed from: c */
        public final IOException f9559c;

        /* JADX INFO: renamed from: d */
        public final int f9560d;

        public c(mtv mtvVar, ktx ktxVar, IOException iOException, int i) {
            this.f9557a = mtvVar;
            this.f9558b = ktxVar;
            this.f9559c = iOException;
            this.f9560d = i;
        }
    }

    /* JADX INFO: renamed from: a */
    long mo12172a(c cVar);

    @Nullable
    /* JADX INFO: renamed from: b */
    b mo12173b(a aVar, c cVar);

    /* JADX INFO: renamed from: c */
    default void m12176c(long j) {
    }

    /* JADX INFO: renamed from: d */
    int mo12174d(int i);
}
