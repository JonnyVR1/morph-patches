package org.eclipse.jetty.p004io;

import l.ohg0;
import org.eclipse.jetty.p004io.nio.DirectNIOBuffer;
import org.eclipse.jetty.p004io.nio.IndirectNIOBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractBuffers implements Buffers {
    protected final int _bufferSize;
    protected final Buffers.Type _bufferType;
    protected final int _headerSize;
    protected final Buffers.Type _headerType;
    protected final Buffers.Type _otherType;

    /* JADX INFO: renamed from: org.eclipse.jetty.io.AbstractBuffers$1 */
    public static /* synthetic */ class C06971 {
        static final /* synthetic */ int[] $SwitchMap$org$eclipse$jetty$io$Buffers$Type;

        static {
            int[] iArr = new int[Buffers.Type.values().length];
            $SwitchMap$org$eclipse$jetty$io$Buffers$Type = iArr;
            try {
                iArr[Buffers.Type.BYTE_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$eclipse$jetty$io$Buffers$Type[Buffers.Type.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$eclipse$jetty$io$Buffers$Type[Buffers.Type.INDIRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AbstractBuffers(Buffers.Type type, int i, Buffers.Type type2, int i2, Buffers.Type type3) {
        this._headerType = type;
        this._headerSize = i;
        this._bufferType = type2;
        this._bufferSize = i2;
        this._otherType = type3;
    }

    public int getBufferSize() {
        return this._bufferSize;
    }

    public int getHeaderSize() {
        return this._headerSize;
    }

    public final boolean isBuffer(Buffer buffer) {
        if (buffer.capacity() == this._bufferSize) {
            int i = C06971.$SwitchMap$org$eclipse$jetty$io$Buffers$Type[this._bufferType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return buffer instanceof DirectNIOBuffer;
                }
                if (i == 3) {
                    return buffer instanceof IndirectNIOBuffer;
                }
            } else if ((buffer instanceof ByteArrayBuffer) && !(buffer instanceof IndirectNIOBuffer)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isHeader(Buffer buffer) {
        if (buffer.capacity() == this._headerSize) {
            int i = C06971.$SwitchMap$org$eclipse$jetty$io$Buffers$Type[this._headerType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return buffer instanceof DirectNIOBuffer;
                }
                if (i == 3) {
                    return buffer instanceof IndirectNIOBuffer;
                }
            } else if ((buffer instanceof ByteArrayBuffer) && !(buffer instanceof IndirectNIOBuffer)) {
                return true;
            }
        }
        return false;
    }

    public final Buffer newBuffer() {
        int i = C06971.$SwitchMap$org$eclipse$jetty$io$Buffers$Type[this._bufferType.ordinal()];
        if (i == 1) {
            return new ByteArrayBuffer(this._bufferSize);
        }
        if (i == 2) {
            return new DirectNIOBuffer(this._bufferSize);
        }
        if (i == 3) {
            return new IndirectNIOBuffer(this._bufferSize);
        }
        ohg0.a();
        return null;
    }

    public final Buffer newHeader() {
        int i = C06971.$SwitchMap$org$eclipse$jetty$io$Buffers$Type[this._headerType.ordinal()];
        if (i == 1) {
            return new ByteArrayBuffer(this._headerSize);
        }
        if (i == 2) {
            return new DirectNIOBuffer(this._headerSize);
        }
        if (i == 3) {
            return new IndirectNIOBuffer(this._headerSize);
        }
        ohg0.a();
        return null;
    }

    public String toString() {
        return String.format("%s [%d,%d]", getClass().getSimpleName(), Integer.valueOf(this._headerSize), Integer.valueOf(this._bufferSize));
    }

    public final Buffer newBuffer(int i) {
        int i2 = C06971.$SwitchMap$org$eclipse$jetty$io$Buffers$Type[this._otherType.ordinal()];
        if (i2 == 1) {
            return new ByteArrayBuffer(i);
        }
        if (i2 == 2) {
            return new DirectNIOBuffer(i);
        }
        if (i2 == 3) {
            return new IndirectNIOBuffer(i);
        }
        ohg0.a();
        return null;
    }
}
