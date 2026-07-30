package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p153l.vtq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractMessageLite implements MessageLite {
    protected int memoizedHashCode = 0;

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamM92118L = CodedOutputStream.m92118L(bArr);
            writeTo(codedOutputStreamM92118L);
            codedOutputStreamM92118L.m92163a();
            return bArr;
        } catch (IOException e) {
            vtq0.m202761a("Serializing to a byte array threw an IOException (should never happen).", e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream codedOutputStreamM92117K = CodedOutputStream.m92117K(outputStream, CodedOutputStream.m92140v(CodedOutputStream.m92141w(serializedSize) + serializedSize));
        codedOutputStreamM92117K.m92182s0(serializedSize);
        writeTo(codedOutputStreamM92117K);
        codedOutputStreamM92117K.m92149J();
    }

    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {
        /* JADX INFO: renamed from: c */
        public static UninitializedMessageException m92024c(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        @Override // 
        /* JADX INFO: renamed from: a */
        public abstract BuilderType mo91414m();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: b */
        public abstract BuilderType mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite$Builder$a */
        public static final class C15391a extends FilterInputStream {

            /* JADX INFO: renamed from: a */
            public int f66287a;

            public C15391a(InputStream inputStream, int i) {
                super(inputStream);
                this.f66287a = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f66287a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f66287a;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.f66287a -= i4;
                }
                return i4;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.f66287a));
                if (jSkip >= 0) {
                    this.f66287a = (int) (((long) this.f66287a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f66287a <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f66287a--;
                }
                return i;
            }
        }
    }
}
