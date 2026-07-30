package p153l;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class g6f extends InputStream {

    /* JADX INFO: renamed from: c */
    @GuardedBy("POOL")
    private static final Queue<g6f> f102433c = ylk0.m216582f(0);

    /* JADX INFO: renamed from: a */
    private InputStream f102434a;

    /* JADX INFO: renamed from: b */
    private IOException f102435b;

    @NonNull
    /* JADX INFO: renamed from: m */
    public static g6f m129246m(@NonNull InputStream inputStream) {
        g6f g6fVarPoll;
        Queue<g6f> queue = f102433c;
        synchronized (queue) {
            g6fVarPoll = queue.poll();
        }
        if (g6fVarPoll == null) {
            g6fVarPoll = new g6f();
        }
        g6fVarPoll.m129248n(inputStream);
        return g6fVarPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f102434a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f102434a.close();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public IOException m129247k() {
        return this.f102435b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f102434a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f102434a.markSupported();
    }

    /* JADX INFO: renamed from: n */
    public void m129248n(@NonNull InputStream inputStream) {
        this.f102434a = inputStream;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f102434a.read();
        } catch (IOException e) {
            this.f102435b = e;
            throw e;
        }
    }

    public void release() {
        this.f102435b = null;
        this.f102434a = null;
        Queue<g6f> queue = f102433c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f102434a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.f102434a.skip(j);
        } catch (IOException e) {
            this.f102435b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f102434a.read(bArr);
        } catch (IOException e) {
            this.f102435b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f102434a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f102435b = e;
            throw e;
        }
    }
}
