package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p149l.pkq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractMessageLite implements MessageLite {
    protected int memoizedHashCode = 0;

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamM91227L = CodedOutputStream.m91227L(bArr);
            writeTo(codedOutputStreamM91227L);
            codedOutputStreamM91227L.m91272a();
            return bArr;
        } catch (IOException e) {
            pkq0.m170054a("Serializing to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream codedOutputStreamM91226K = CodedOutputStream.m91226K(outputStream, CodedOutputStream.m91249v(CodedOutputStream.m91250w(serializedSize) + serializedSize));
        codedOutputStreamM91226K.m91291s0(serializedSize);
        writeTo(codedOutputStreamM91226K);
        codedOutputStreamM91226K.m91258J();
    }

    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {
        /* JADX INFO: renamed from: c */
        public static UninitializedMessageException m91133c(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        @Override // 
        /* JADX INFO: renamed from: a */
        public abstract BuilderType mo90523m();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: b */
        public abstract BuilderType mo90459i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder$a */
        public static final class C15284a extends FilterInputStream {

            /* JADX INFO: renamed from: a */
            public int f65613a;

            public C15284a(InputStream inputStream, int i) {
                super(inputStream);
                this.f65613a = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f65613a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f65613a;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.f65613a -= i4;
                }
                return i4;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.f65613a));
                if (jSkip >= 0) {
                    this.f65613a = (int) (((long) this.f65613a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f65613a <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f65613a--;
                }
                return i;
            }
        }
    }
}
