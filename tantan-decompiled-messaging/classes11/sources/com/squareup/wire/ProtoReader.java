package com.squareup.wire;

import java.io.IOException;
import java.net.ProtocolException;
import l.hg3;
import l.ohg0;
import l.qkq0;
import l.rhg0;
import okio.BufferedSource;
import okio.ByteString;
import p009l.aza0;
import p009l.bza0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class ProtoReader {
    private static final int FIELD_ENCODING_MASK = 7;
    private static final int RECURSION_LIMIT = 65;
    private static final int STATE_END_GROUP = 4;
    private static final int STATE_FIXED32 = 5;
    private static final int STATE_FIXED64 = 1;
    private static final int STATE_LENGTH_DELIMITED = 2;
    private static final int STATE_PACKED_TAG = 7;
    private static final int STATE_START_GROUP = 3;
    private static final int STATE_TAG = 6;
    private static final int STATE_VARINT = 0;
    static final int TAG_FIELD_ENCODING_BITS = 3;
    private FieldEncoding nextFieldEncoding;
    private int recursionDepth;
    private final BufferedSource source;
    private long pos = 0;
    private long limit = Long.MAX_VALUE;
    private int state = 2;
    private int tag = -1;
    private long pushedLimit = -1;

    public ProtoReader(BufferedSource bufferedSource) {
        this.source = bufferedSource;
    }

    private void afterPackableScalar(int i) throws IOException {
        if (this.state == i) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j2 = this.limit;
        if (j <= j2) {
            if (j != j2) {
                this.state = 7;
                return;
            }
            this.limit = this.pushedLimit;
            this.pushedLimit = -1L;
            this.state = 6;
            return;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    private long beforeLengthDelimitedScalar() throws IOException {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        long j = this.limit - this.pos;
        this.source.require(j);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j;
    }

    private int internalReadVarint32() throws IOException {
        this.source.require(1L);
        this.pos++;
        byte b = this.source.readByte();
        if (b >= 0) {
            return b;
        }
        int i = b & 127;
        this.source.require(1L);
        this.pos++;
        byte b2 = this.source.readByte();
        if (b2 >= 0) {
            return (b2 << 7) | i;
        }
        int i2 = i | ((b2 & 127) << 7);
        this.source.require(1L);
        this.pos++;
        byte b3 = this.source.readByte();
        if (b3 >= 0) {
            return (b3 << 14) | i2;
        }
        int i3 = i2 | ((b3 & 127) << 14);
        this.source.require(1L);
        this.pos++;
        byte b4 = this.source.readByte();
        if (b4 >= 0) {
            return (b4 << 21) | i3;
        }
        int i4 = i3 | ((b4 & 127) << 21);
        this.source.require(1L);
        this.pos++;
        byte b5 = this.source.readByte();
        int i5 = i4 | (b5 << 28);
        if (b5 < 0) {
            for (int i6 = 0; i6 < 5; i6++) {
                this.source.require(1L);
                this.pos++;
                if (this.source.readByte() < 0) {
                }
            }
            aza0.m11780a("Malformed VARINT");
            return 0;
        }
        return i5;
    }

    private void skipGroup(int i) throws IOException {
        while (this.pos < this.limit && !this.source.exhausted()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                aza0.m11780a("Unexpected tag 0");
                return;
            }
            int i2 = iInternalReadVarint32 >> 3;
            int i3 = iInternalReadVarint32 & 7;
            if (i3 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i3 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i3 == 2) {
                long jInternalReadVarint32 = internalReadVarint32();
                this.pos += jInternalReadVarint32;
                this.source.skip(jInternalReadVarint32);
            } else if (i3 == 3) {
                skipGroup(i2);
            } else if (i3 == 4) {
                if (i2 == i) {
                    return;
                }
                aza0.m11780a("Unexpected end group");
                return;
            } else if (i3 != 5) {
                bza0.m12323a("Unexpected field encoding: ", i3);
                return;
            } else {
                this.state = 5;
                readFixed32();
            }
        }
        hg3.a();
    }

    public long beginMessage() throws IOException {
        if (this.state != 2) {
            qkq0.a("Unexpected call to beginMessage()");
            return 0L;
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > RECURSION_LIMIT) {
            rhg0.a("Wire recursion limit exceeded");
            return 0L;
        }
        long j = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j;
    }

    public void endMessage(long j) throws IOException {
        if (this.state != 6) {
            qkq0.a("Unexpected call to endMessage()");
            return;
        }
        int i = this.recursionDepth - 1;
        this.recursionDepth = i;
        if (i < 0 || this.pushedLimit != -1) {
            qkq0.a("No corresponding call to beginMessage()");
            return;
        }
        if (this.pos == this.limit || i == 0) {
            this.limit = j;
            return;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public int nextTag() throws IOException {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            qkq0.a("Unexpected call to nextTag()");
            return 0;
        }
        while (this.pos < this.limit && !this.source.exhausted()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                aza0.m11780a("Unexpected tag 0");
                return 0;
            }
            int i2 = iInternalReadVarint32 >> 3;
            this.tag = i2;
            int i3 = iInternalReadVarint32 & 7;
            if (i3 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return i2;
            }
            if (i3 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return i2;
            }
            if (i3 == 2) {
                this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                this.state = 2;
                int iInternalReadVarint33 = internalReadVarint32();
                if (iInternalReadVarint33 < 0) {
                    bza0.m12323a("Negative length: ", iInternalReadVarint33);
                    return 0;
                }
                if (this.pushedLimit != -1) {
                    ohg0.a();
                    return 0;
                }
                long j = this.limit;
                this.pushedLimit = j;
                long j2 = this.pos + ((long) iInternalReadVarint33);
                this.limit = j2;
                if (j2 <= j) {
                    return this.tag;
                }
                hg3.a();
                return 0;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    aza0.m11780a("Unexpected end group");
                    return 0;
                }
                if (i3 != 5) {
                    bza0.m12323a("Unexpected field encoding: ", i3);
                    return 0;
                }
                this.nextFieldEncoding = FieldEncoding.FIXED32;
                this.state = 5;
                return i2;
            }
            skipGroup(i2);
        }
        return -1;
    }

    public FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public ByteString readBytes() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.require(jBeforeLengthDelimitedScalar);
        return this.source.readByteString(jBeforeLengthDelimitedScalar);
    }

    public int readFixed32() throws IOException {
        int i = this.state;
        if (i != 5 && i != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.require(4L);
        this.pos += 4;
        int intLe = this.source.readIntLe();
        afterPackableScalar(5);
        return intLe;
    }

    public long readFixed64() throws IOException {
        int i = this.state;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.require(8L);
        this.pos += 8;
        long longLe = this.source.readLongLe();
        afterPackableScalar(1);
        return longLe;
    }

    public String readString() throws IOException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.require(jBeforeLengthDelimitedScalar);
        return this.source.readUtf8(jBeforeLengthDelimitedScalar);
    }

    public int readVarint32() throws IOException {
        int i = this.state;
        if (i == 0 || i == 2) {
            int iInternalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return iInternalReadVarint32;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
    }

    public long readVarint64() throws IOException {
        int i = this.state;
        if (i != 0 && i != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            this.source.require(1L);
            this.pos++;
            byte b = this.source.readByte();
            j |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        aza0.m11780a("WireInput encountered a malformed varint");
        return 0L;
    }

    public void skip() throws IOException {
        int i = this.state;
        if (i == 0) {
            readVarint64();
            return;
        }
        if (i == 1) {
            readFixed64();
            return;
        }
        if (i == 2) {
            this.source.skip(beforeLengthDelimitedScalar());
        } else if (i == 5) {
            readFixed32();
        } else {
            qkq0.a("Unexpected call to skip()");
        }
    }
}
