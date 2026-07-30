package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class er3 {

    /* JADX INFO: renamed from: a */
    private static final AtomicReference<byte[]> f95436a = new AtomicReference<>();

    /* JADX INFO: renamed from: l.er3$b */
    public static final class C16808b {

        /* JADX INFO: renamed from: a */
        final int f95439a;

        /* JADX INFO: renamed from: b */
        final int f95440b;

        /* JADX INFO: renamed from: c */
        final byte[] f95441c;

        public C16808b(@NonNull byte[] bArr, int i, int i2) {
            this.f95441c = bArr;
            this.f95439a = i;
            this.f95440b = i2;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ByteBuffer m122094a(@NonNull File file) throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return mappedByteBufferLoad;
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static ByteBuffer m122095b(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f95436a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(andSet);
            if (i < 0) {
                f95436a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m122097d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    private static C16808b m122096c(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new C16808b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* JADX INFO: renamed from: d */
    public static ByteBuffer m122097d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static byte[] m122098e(@NonNull ByteBuffer byteBuffer) {
        C16808b c16808bM122096c = m122096c(byteBuffer);
        if (c16808bM122096c != null && c16808bM122096c.f95439a == 0 && c16808bM122096c.f95440b == c16808bM122096c.f95441c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        m122097d(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: f */
    public static void m122099f(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        m122097d(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static InputStream m122100g(@NonNull ByteBuffer byteBuffer) {
        return new C16807a(byteBuffer);
    }

    /* JADX INFO: renamed from: l.er3$a */
    public static class C16807a extends InputStream {

        /* JADX INFO: renamed from: a */
        @NonNull
        private final ByteBuffer f95437a;

        /* JADX INFO: renamed from: b */
        private int f95438b = -1;

        public C16807a(@NonNull ByteBuffer byteBuffer) {
            this.f95437a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f95437a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f95438b = this.f95437a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(@NonNull byte[] bArr, int i, int i2) {
            if (!this.f95437a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, available());
            this.f95437a.get(bArr, i, iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i = this.f95438b;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f95437a.position(i);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.f95437a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, available());
            ByteBuffer byteBuffer = this.f95437a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f95437a.hasRemaining()) {
                return this.f95437a.get() & 255;
            }
            return -1;
        }
    }
}
