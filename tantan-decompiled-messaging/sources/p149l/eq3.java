package p149l;

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
public final class eq3 {

    /* JADX INFO: renamed from: a */
    private static final AtomicReference<byte[]> f92753a = new AtomicReference<>();

    /* JADX INFO: renamed from: l.eq3$b */
    public static final class C16667b {

        /* JADX INFO: renamed from: a */
        final int f92756a;

        /* JADX INFO: renamed from: b */
        final int f92757b;

        /* JADX INFO: renamed from: c */
        final byte[] f92758c;

        public C16667b(@NonNull byte[] bArr, int i, int i2) {
            this.f92758c = bArr;
            this.f92756a = i;
            this.f92757b = i2;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ByteBuffer m117702a(@NonNull File file) throws Throwable {
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
    public static ByteBuffer m117703b(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f92753a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(andSet);
            if (i < 0) {
                f92753a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
            byteArrayOutputStream.write(andSet, 0, i);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    private static C16667b m117704c(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new C16667b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static byte[] m117705d(@NonNull ByteBuffer byteBuffer) {
        C16667b c16667bM117704c = m117704c(byteBuffer);
        if (c16667bM117704c != null && c16667bM117704c.f92756a == 0 && c16667bM117704c.f92757b == c16667bM117704c.f92758c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        byteBufferAsReadOnlyBuffer.position(0);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    public static void m117706e(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
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
    /* JADX INFO: renamed from: f */
    public static InputStream m117707f(@NonNull ByteBuffer byteBuffer) {
        return new C16666a(byteBuffer);
    }

    /* JADX INFO: renamed from: l.eq3$a */
    public static class C16666a extends InputStream {

        /* JADX INFO: renamed from: a */
        @NonNull
        private final ByteBuffer f92754a;

        /* JADX INFO: renamed from: b */
        private int f92755b = -1;

        public C16666a(@NonNull ByteBuffer byteBuffer) {
            this.f92754a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f92754a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f92755b = this.f92754a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
            if (!this.f92754a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, available());
            this.f92754a.get(bArr, i, iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i = this.f92755b;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f92754a.position(i);
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            if (!this.f92754a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, available());
            ByteBuffer byteBuffer = this.f92754a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f92754a.hasRemaining()) {
                return this.f92754a.get() & 255;
            }
            return -1;
        }
    }
}
