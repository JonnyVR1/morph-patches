package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class p7g0 implements SeekableByteChannel {
    private final List<SeekableByteChannel> channels;
    private int currentChannelIdx;
    private long globalPosition;

    public p7g0(List list) {
        Objects.requireNonNull(list, "channels must not be null");
        this.channels = Collections.unmodifiableList(new ArrayList(list));
    }

    public static SeekableByteChannel forSeekableByteChannels(SeekableByteChannel... seekableByteChannelArr) {
        Objects.requireNonNull(seekableByteChannelArr, "channels must not be null");
        return seekableByteChannelArr.length == 1 ? seekableByteChannelArr[0] : new p7g0(Arrays.asList(seekableByteChannelArr));
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Iterator<SeekableByteChannel> it = this.channels.iterator();
        IOException iOException = null;
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                }
            }
        }
        if (iOException != null) {
            throw new IOException("failed to close wrapped channel", iOException);
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        Iterator<SeekableByteChannel> it = this.channels.iterator();
        while (it.hasNext()) {
            if (!it.next().isOpen()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized SeekableByteChannel position(long j) {
        try {
            if (j < 0) {
                throw new IllegalArgumentException("Negative position: " + j);
            }
            if (!isOpen()) {
                throw new ClosedChannelException();
            }
            this.globalPosition = j;
            int i = 0;
            while (i < this.channels.size()) {
                SeekableByteChannel seekableByteChannel = this.channels.get(i);
                long size = seekableByteChannel.size();
                long j2 = -1;
                if (j == -1) {
                    j2 = j;
                    j = 0;
                } else if (j <= size) {
                    this.currentChannelIdx = i;
                } else {
                    j2 = j - size;
                    j = size;
                }
                seekableByteChannel.position(j);
                i++;
                j = j2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer byteBuffer) {
        try {
            if (!isOpen()) {
                throw new ClosedChannelException();
            }
            int i = 0;
            if (!byteBuffer.hasRemaining()) {
                return 0;
            }
            while (byteBuffer.hasRemaining() && this.currentChannelIdx < this.channels.size()) {
                SeekableByteChannel seekableByteChannel = this.channels.get(this.currentChannelIdx);
                int i2 = seekableByteChannel.read(byteBuffer);
                if (i2 == -1) {
                    this.currentChannelIdx++;
                } else {
                    if (seekableByteChannel.position() >= seekableByteChannel.size()) {
                        this.currentChannelIdx++;
                    }
                    i += i2;
                }
            }
            if (i <= 0) {
                return -1;
            }
            this.globalPosition += (long) i;
            return i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long size() throws ClosedChannelException {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        Iterator<SeekableByteChannel> it = this.channels.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel truncate(long j) {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new NonWritableChannelException();
    }

    public synchronized SeekableByteChannel position(long j, long j2) {
        try {
            if (!isOpen()) {
                throw new ClosedChannelException();
            }
            for (int i = 0; i < j; i++) {
                j2 += this.channels.get(i).size();
            }
        } catch (Throwable th) {
            throw th;
        }
        return position(j2);
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long position() {
        return this.globalPosition;
    }
}
