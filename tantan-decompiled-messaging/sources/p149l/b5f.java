package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class b5f extends InputStream {

    /* JADX INFO: renamed from: c */
    private static final Queue<b5f> f73652c = sck0.m183406f(0);

    /* JADX INFO: renamed from: a */
    private InputStream f73653a;

    /* JADX INFO: renamed from: b */
    private IOException f73654b;

    @NonNull
    /* JADX INFO: renamed from: m */
    public static b5f m100328m(@NonNull InputStream inputStream) {
        b5f b5fVarPoll;
        Queue<b5f> queue = f73652c;
        synchronized (queue) {
            b5fVarPoll = queue.poll();
        }
        if (b5fVarPoll == null) {
            b5fVarPoll = new b5f();
        }
        b5fVarPoll.m100330n(inputStream);
        return b5fVarPoll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f73653a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73653a.close();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public IOException m100329k() {
        return this.f73654b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f73653a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f73653a.markSupported();
    }

    /* JADX INFO: renamed from: n */
    public void m100330n(@NonNull InputStream inputStream) {
        this.f73653a = inputStream;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f73653a.read(bArr);
        } catch (IOException e) {
            this.f73654b = e;
            return -1;
        }
    }

    public void release() {
        this.f73654b = null;
        this.f73653a = null;
        Queue<b5f> queue = f73652c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f73653a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f73653a.skip(j);
        } catch (IOException e) {
            this.f73654b = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f73653a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f73654b = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f73653a.read();
        } catch (IOException e) {
            this.f73654b = e;
            return -1;
        }
    }
}
