package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p153l.ah3;
import p153l.t9f;
import p153l.wxb;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class DecoderInputBuffer extends ah3 {

    /* JADX INFO: renamed from: b */
    public final wxb f7411b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ByteBuffer f7412c;

    /* JADX INFO: renamed from: d */
    public boolean f7413d;

    /* JADX INFO: renamed from: e */
    public long f7414e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public ByteBuffer f7415f;

    /* JADX INFO: renamed from: g */
    public final int f7416g;

    /* JADX INFO: renamed from: h */
    public final int f7417h;

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
        t9f.m189752a("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i, int i2) {
        this.f7411b = new wxb();
        this.f7416g = i;
        this.f7417h = i2;
    }

    /* JADX INFO: renamed from: y */
    public static DecoderInputBuffer m9856y() {
        return new DecoderInputBuffer(0);
    }

    @Override // p153l.ah3
    /* JADX INFO: renamed from: i */
    public void mo9857i() {
        super.mo9857i();
        ByteBuffer byteBuffer = this.f7412c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f7415f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f7413d = false;
    }

    /* JADX INFO: renamed from: u */
    public final ByteBuffer m9858u(int i) {
        int i2 = this.f7416g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f7412c;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @EnsuresNonNull({"data"})
    /* JADX INFO: renamed from: v */
    public void m9859v(int i) {
        int i2 = i + this.f7417h;
        ByteBuffer byteBuffer = this.f7412c;
        if (byteBuffer == null) {
            this.f7412c = m9858u(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f7412c = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM9858u = m9858u(i3);
        byteBufferM9858u.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM9858u.put(byteBuffer);
        }
        this.f7412c = byteBufferM9858u;
    }

    /* JADX INFO: renamed from: w */
    public final void m9860w() {
        ByteBuffer byteBuffer = this.f7412c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f7415f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m9861x() {
        return m97776m(1073741824);
    }

    @EnsuresNonNull({"supplementalData"})
    /* JADX INFO: renamed from: z */
    public void m9862z(int i) {
        ByteBuffer byteBuffer = this.f7415f;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f7415f = ByteBuffer.allocate(i);
        } else {
            this.f7415f.clear();
        }
    }

    public DecoderInputBuffer(int i) {
        this(i, 0);
    }
}
