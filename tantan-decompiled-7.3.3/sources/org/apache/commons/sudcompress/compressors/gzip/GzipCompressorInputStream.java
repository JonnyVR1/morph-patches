package org.apache.commons.sudcompress.compressors.gzip;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p153l.C20990w1;
import p153l.ezg0;
import p153l.gjg0;
import p153l.vg3;
import p153l.xeg0;
import p153l.xtg0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
public class GzipCompressorInputStream extends gjg0 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int FCOMMENT = 16;
    private static final int FEXTRA = 4;
    private static final int FHCRC = 2;
    private static final int FNAME = 8;
    private static final int FRESERVED = 224;
    private final byte[] buf;
    private int bufUsed;
    private final ezg0 countingStream;
    private final CRC32 crc;
    private final boolean decompressConcatenated;
    private boolean endReached;

    /* JADX INFO: renamed from: in */
    private final InputStream f206803in;
    private Inflater inf;
    private final byte[] oneByte;
    private final GzipParameters parameters;

    public GzipCompressorInputStream(InputStream inputStream, boolean z) throws IOException {
        this.buf = new byte[8192];
        this.inf = new Inflater(true);
        this.crc = new CRC32();
        this.endReached = false;
        this.oneByte = new byte[1];
        this.parameters = new GzipParameters();
        ezg0 ezg0Var = new ezg0(inputStream);
        this.countingStream = ezg0Var;
        if (ezg0Var.markSupported()) {
            this.f206803in = ezg0Var;
        } else {
            this.f206803in = new BufferedInputStream(ezg0Var);
        }
        this.decompressConcatenated = z;
        init(true);
    }

    private boolean init(boolean z) throws IOException {
        int i = this.f206803in.read();
        if (i == -1 && !z) {
            return false;
        }
        if (i != 31 || this.f206803in.read() != 139) {
            throw new IOException(z ? "Input is not in the .gz format" : "Garbage after a valid .gz stream");
        }
        DataInputStream dataInputStream = new DataInputStream(this.f206803in);
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte != 8) {
            C20990w1.m204364a("Unsupported compression method ", unsignedByte, " in the .gz header");
            return false;
        }
        int unsignedByte2 = dataInputStream.readUnsignedByte();
        if ((unsignedByte2 & FRESERVED) != 0) {
            zpg0.m220844a("Reserved flags are set in the .gz header");
            return false;
        }
        this.parameters.setModificationTime(xtg0.m213079a(dataInputStream) * 1000);
        int unsignedByte3 = dataInputStream.readUnsignedByte();
        if (unsignedByte3 == 2) {
            this.parameters.setCompressionLevel(9);
        } else if (unsignedByte3 == 4) {
            this.parameters.setCompressionLevel(1);
        }
        this.parameters.setOperatingSystem(dataInputStream.readUnsignedByte());
        if ((unsignedByte2 & 4) != 0) {
            int unsignedByte4 = (dataInputStream.readUnsignedByte() << 8) | dataInputStream.readUnsignedByte();
            while (true) {
                int i2 = unsignedByte4 - 1;
                if (unsignedByte4 <= 0) {
                    break;
                }
                dataInputStream.readUnsignedByte();
                unsignedByte4 = i2;
            }
        }
        if ((unsignedByte2 & 8) != 0) {
            this.parameters.setFilename(new String(readToNull(dataInputStream), "ISO-8859-1"));
        }
        if ((unsignedByte2 & 16) != 0) {
            this.parameters.setComment(new String(readToNull(dataInputStream), "ISO-8859-1"));
        }
        if ((unsignedByte2 & 2) != 0) {
            dataInputStream.readShort();
        }
        this.inf.reset();
        this.crc.reset();
        return true;
    }

    public static boolean matches(byte[] bArr, int i) {
        return i >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    private static byte[] readToNull(DataInput dataInput) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int unsignedByte = dataInput.readUnsignedByte();
                if (unsignedByte == 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(unsignedByte);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Inflater inflater = this.inf;
        if (inflater != null) {
            inflater.end();
            this.inf = null;
        }
        InputStream inputStream = this.f206803in;
        if (inputStream != System.in) {
            inputStream.close();
        }
    }

    public long getCompressedCount() {
        return this.countingStream.getBytesRead();
    }

    public GzipParameters getMetaData() {
        return this.parameters;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.endReached) {
            return -1;
        }
        int i3 = 0;
        while (i2 > 0) {
            if (this.inf.needsInput()) {
                this.f206803in.mark(this.buf.length);
                int i4 = this.f206803in.read(this.buf);
                this.bufUsed = i4;
                if (i4 == -1) {
                    vg3.m201207a();
                    return 0;
                }
                this.inf.setInput(this.buf, 0, i4);
            }
            try {
                int iInflate = this.inf.inflate(bArr, i, i2);
                this.crc.update(bArr, i, iInflate);
                i += iInflate;
                i2 -= iInflate;
                i3 += iInflate;
                count(iInflate);
                if (this.inf.finished()) {
                    this.f206803in.reset();
                    long remaining = this.bufUsed - this.inf.getRemaining();
                    if (xeg0.m210677b(this.f206803in, remaining) != remaining) {
                        throw new IOException();
                    }
                    this.bufUsed = 0;
                    DataInputStream dataInputStream = new DataInputStream(this.f206803in);
                    if (xtg0.m213079a(dataInputStream) != this.crc.getValue()) {
                        zpg0.m220844a("Gzip-compressed data is corrupt (CRC32 error)");
                        return 0;
                    }
                    if (xtg0.m213079a(dataInputStream) != (this.inf.getBytesWritten() & 4294967295L)) {
                        zpg0.m220844a("Gzip-compressed data is corrupt(uncompressed size mismatch)");
                        return 0;
                    }
                    if (!this.decompressConcatenated || !init(false)) {
                        this.inf.end();
                        this.inf = null;
                        this.endReached = true;
                        if (i3 == 0) {
                            return -1;
                        }
                        return i3;
                    }
                }
            } catch (DataFormatException unused) {
                zpg0.m220844a("Gzip-compressed data is corrupt");
                return 0;
            }
        }
        return i3;
    }

    public GzipCompressorInputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.oneByte, 0, 1) == -1) {
            return -1;
        }
        return this.oneByte[0] & 255;
    }
}
