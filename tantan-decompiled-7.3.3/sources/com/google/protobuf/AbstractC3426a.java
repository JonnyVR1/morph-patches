package com.google.protobuf;

import com.google.protobuf.AbstractC3426a;
import com.google.protobuf.AbstractC3426a.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import p153l.vbr;
import p153l.vtq0;
import p153l.wg3;

/* JADX INFO: renamed from: com.google.protobuf.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3426a<MessageType extends AbstractC3426a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC3442q {
    protected int memoizedHashCode = 0;

    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        a.addAll(iterable, collection);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (byteString.isValidUtf8()) {
            return;
        }
        wg3.m206174a("Byte string is not UTF-8.");
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamM16966W = CodedOutputStream.m16966W(bArr);
            writeTo(codedOutputStreamM16966W);
            codedOutputStreamM16966W.m17010e();
            return bArr;
        } catch (IOException e) {
            vtq0.m202761a(getSerializingExceptionMessage("byte array"), e);
            return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public ByteString toByteString() {
        try {
            ByteString.C3394e c3394eNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(c3394eNewCodedBuilder.m16944b());
            return c3394eNewCodedBuilder.m16943a();
        } catch (IOException e) {
            vtq0.m202761a(getSerializingExceptionMessage("ByteString"), e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream codedOutputStreamM16965V = CodedOutputStream.m16965V(outputStream, CodedOutputStream.m16950E(CodedOutputStream.m16951F(serializedSize) + serializedSize));
        codedOutputStreamM16965V.m17031y0(serializedSize);
        writeTo(codedOutputStreamM16965V);
        codedOutputStreamM16965V.mo17001T();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamM16965V = CodedOutputStream.m16965V(outputStream, CodedOutputStream.m16950E(getSerializedSize()));
        writeTo(codedOutputStreamM16965V);
        codedOutputStreamM16965V.mo17001T();
    }

    /* JADX INFO: renamed from: com.google.protobuf.a$a */
    public static abstract class a<MessageType extends AbstractC3426a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC3442q.a {
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            iterable.getClass();
            if (iterable instanceof vbr) {
                checkForNullValues(((vbr) iterable).m200728k());
                collection.addAll((Collection) iterable);
            } else {
                if (iterable instanceof Collection) {
                    checkForNullValues(iterable);
                    collection.addAll((Collection) iterable);
                    return;
                }
                for (T t : iterable) {
                    t.getClass();
                    collection.add(t);
                }
            }
        }

        private static void checkForNullValues(Iterable<?> iterable) {
            Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }

        private String getReadingExceptionMessage(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        public static UninitializedMessageException newUninitializedMessageException(InterfaceC3442q interfaceC3442q) {
            return new UninitializedMessageException(interfaceC3442q);
        }

        @Override // 
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType mo225046clone();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        public boolean mergeDelimitedFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            int i = inputStream.read();
            if (i == -1) {
                return false;
            }
            m225051mergeFrom((InputStream) new C22797a(inputStream, C3430e.m17152D(i, inputStream)), c3433h);
            return true;
        }

        @Override // com.google.protobuf.InterfaceC3442q.a
        public abstract BuilderType mergeFrom(C3430e c3430e, C3433h c3433h) throws IOException;

        @Override // com.google.protobuf.InterfaceC3442q.a
        public BuilderType mergeFrom(InterfaceC3442q interfaceC3442q) {
            if (getDefaultInstanceForType().getClass().isInstance(interfaceC3442q)) {
                return (BuilderType) internalMergeFrom((AbstractC3426a) interfaceC3442q);
            }
            wg3.m206174a("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }

        /* JADX INFO: renamed from: com.google.protobuf.a$a$a, reason: collision with other inner class name */
        public static final class C22797a extends FilterInputStream {

            /* JADX INFO: renamed from: a */
            public int f11604a;

            public C22797a(InputStream inputStream, int i) {
                super(inputStream);
                this.f11604a = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f11604a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f11604a;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.f11604a -= i4;
                }
                return i4;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.f11604a));
                if (jSkip >= 0) {
                    this.f11604a = (int) (((long) this.f11604a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f11604a <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f11604a--;
                }
                return i;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, C3433h.m17213b());
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m225049mergeFrom(C3430e c3430e) throws IOException {
            return (BuilderType) mergeFrom(c3430e, C3433h.m17213b());
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m225047mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                C3430e c3430eNewCodedInput = byteString.newCodedInput();
                m225049mergeFrom(c3430eNewCodedInput);
                c3430eNewCodedInput.m17183a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                vtq0.m202761a(getReadingExceptionMessage("ByteString"), e2);
                return null;
            }
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m225048mergeFrom(ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
            try {
                C3430e c3430eNewCodedInput = byteString.newCodedInput();
                mergeFrom(c3430eNewCodedInput, c3433h);
                c3430eNewCodedInput.m17183a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                vtq0.m202761a(getReadingExceptionMessage("ByteString"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC3442q.a
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) m225052mergeFrom(bArr, 0, bArr.length);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m225052mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                C3430e c3430eM17158i = C3430e.m17158i(bArr, i, i2);
                m225049mergeFrom(c3430eM17158i);
                c3430eM17158i.m17183a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                vtq0.m202761a(getReadingExceptionMessage("byte array"), e2);
                return null;
            }
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m225054mergeFrom(byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
            return (BuilderType) m225053mergeFrom(bArr, 0, bArr.length, c3433h);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m225053mergeFrom(byte[] bArr, int i, int i2, C3433h c3433h) throws InvalidProtocolBufferException {
            try {
                C3430e c3430eM17158i = C3430e.m17158i(bArr, i, i2);
                mergeFrom(c3430eM17158i, c3433h);
                c3430eM17158i.m17183a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                vtq0.m202761a(getReadingExceptionMessage("byte array"), e2);
                return null;
            }
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m225050mergeFrom(InputStream inputStream) throws IOException {
            C3430e c3430eM17155f = C3430e.m17155f(inputStream);
            m225049mergeFrom(c3430eM17155f);
            c3430eM17155f.m17183a(0);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m225051mergeFrom(InputStream inputStream, C3433h c3433h) throws IOException {
            C3430e c3430eM17155f = C3430e.m17155f(inputStream);
            mergeFrom(c3430eM17155f, c3433h);
            c3430eM17155f.m17183a(0);
            return this;
        }
    }
}
