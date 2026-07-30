package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p149l.iwb;
import p149l.mg3;
import p149l.n8f;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class DecoderInputBuffer extends mg3 {

    /* JADX INFO: renamed from: b */
    public final iwb f7374b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ByteBuffer f7375c;

    /* JADX INFO: renamed from: d */
    public boolean f7376d;

    /* JADX INFO: renamed from: e */
    public long f7377e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public ByteBuffer f7378f;

    /* JADX INFO: renamed from: g */
    public final int f7379g;

    /* JADX INFO: renamed from: h */
    public final int f7380h;

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.currentCapacity = i;
            this.requiredCapacity = i2;
        }
    }

    static {
        n8f.m158492a("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i, int i2) {
        this.f7374b = new iwb();
        this.f7379g = i;
        this.f7380h = i2;
    }

    /* JADX INFO: renamed from: y */
    public static DecoderInputBuffer m9802y() {
        return new DecoderInputBuffer(0);
    }

    @Override // p149l.mg3
    /* JADX INFO: renamed from: i */
    public void mo9803i() {
        super.mo9803i();
        ByteBuffer byteBuffer = this.f7375c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f7378f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f7376d = false;
    }

    /* JADX INFO: renamed from: u */
    public final ByteBuffer m9804u(int i) {
        int i2 = this.f7379g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f7375c;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @EnsuresNonNull({"data"})
    /* JADX INFO: renamed from: v */
    public void m9805v(int i) {
        int i2 = i + this.f7380h;
        ByteBuffer byteBuffer = this.f7375c;
        if (byteBuffer == null) {
            this.f7375c = m9804u(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f7375c = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM9804u = m9804u(i3);
        byteBufferM9804u.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM9804u.put(byteBuffer);
        }
        this.f7375c = byteBufferM9804u;
    }

    /* JADX INFO: renamed from: w */
    public final void m9806w() {
        ByteBuffer byteBuffer = this.f7375c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f7378f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m9807x() {
        return m154492m(1073741824);
    }

    @EnsuresNonNull({"supplementalData"})
    /* JADX INFO: renamed from: z */
    public void m9808z(int i) {
        ByteBuffer byteBuffer = this.f7378f;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f7378f = ByteBuffer.allocate(i);
        } else {
            this.f7378f.clear();
        }
    }

    public DecoderInputBuffer(int i) {
        this(i, 0);
    }
}
