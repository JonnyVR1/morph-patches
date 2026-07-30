package org.eclipse.jetty.p127io.nio;

import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import org.eclipse.jetty.p127io.AbstractBuffer;
import org.eclipse.jetty.p127io.Buffer;
import p153l.iig0;

/* JADX INFO: loaded from: classes2.dex */
public class RandomAccessFileBuffer extends AbstractBuffer implements Buffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    final int _capacity;
    final FileChannel _channel;
    final RandomAccessFile _file;

    public RandomAccessFileBuffer(File file, int i, int i2) throws FileNotFoundException {
        super(i2, true);
        this._capacity = i;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, i2 == 2 ? "rw" : "r");
        this._file = randomAccessFile;
        this._channel = randomAccessFile.getChannel();
        setGetIndex(0);
        setPutIndex((int) file.length());
    }

    @Override // org.eclipse.jetty.p127io.Buffer
    public byte[] array() {
        return null;
    }

    @Override // org.eclipse.jetty.p127io.Buffer
    public int capacity() {
        return this._capacity;
    }

    @Override // org.eclipse.jetty.p127io.AbstractBuffer, org.eclipse.jetty.p127io.Buffer
    public void clear() {
        try {
            synchronized (this._file) {
                super.clear();
                this._file.setLength(0L);
            }
        } catch (Exception e) {
            iig0.m140070a(e);
        }
    }

    @Override // org.eclipse.jetty.p127io.AbstractBuffer, org.eclipse.jetty.p127io.Buffer
    public byte peek() {
        byte b;
        synchronized (this._file) {
            try {
                try {
                    if (this._get != this._file.getFilePointer()) {
                        this._file.seek(this._get);
                    }
                    b = this._file.readByte();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // org.eclipse.jetty.p127io.Buffer
    public void poke(int i, byte b) {
        synchronized (this._file) {
            try {
                try {
                    this._file.seek(i);
                    this._file.writeByte(b);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int writeTo(WritableByteChannel writableByteChannel, int i, int i2) throws IOException {
        int iTransferTo;
        synchronized (this._file) {
            iTransferTo = (int) this._channel.transferTo(i, i2, writableByteChannel);
        }
        return iTransferTo;
    }

    @Override // org.eclipse.jetty.p127io.AbstractBuffer, org.eclipse.jetty.p127io.Buffer
    public int poke(int i, byte[] bArr, int i2, int i3) {
        synchronized (this._file) {
            try {
                try {
                    this._file.seek(i);
                    this._file.write(bArr, i2, i3);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i3;
    }

    public RandomAccessFileBuffer(File file, int i) throws FileNotFoundException {
        super(2, true);
        this._capacity = i;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this._file = randomAccessFile;
        this._channel = randomAccessFile.getChannel();
        setGetIndex(0);
        setPutIndex((int) file.length());
    }

    @Override // org.eclipse.jetty.p127io.Buffer
    public byte peek(int i) {
        byte b;
        synchronized (this._file) {
            try {
                try {
                    this._file.seek(i);
                    b = this._file.readByte();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public RandomAccessFileBuffer(File file) throws FileNotFoundException {
        super(2, true);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this._file = randomAccessFile;
        this._channel = randomAccessFile.getChannel();
        this._capacity = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        setGetIndex(0);
        setPutIndex((int) file.length());
    }

    @Override // org.eclipse.jetty.p127io.Buffer
    public int peek(int i, byte[] bArr, int i2, int i3) {
        int i4;
        synchronized (this._file) {
            try {
                try {
                    this._file.seek(i);
                    i4 = this._file.read(bArr, i2, i3);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }
}
