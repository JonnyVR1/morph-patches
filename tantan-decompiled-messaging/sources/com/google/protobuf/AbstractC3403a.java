package com.google.protobuf;

import com.google.protobuf.AbstractC3403a;
import com.google.protobuf.AbstractC3403a.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import p149l.ig3;
import p149l.pkq0;
import p149l.t9r;

/* JADX INFO: renamed from: com.google.protobuf.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3403a<MessageType extends AbstractC3403a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC3419q {
    protected int memoizedHashCode = 0;

    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        a.addAll(iterable, collection);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (byteString.isValidUtf8()) {
            return;
        }
        ig3.m135964a("Byte string is not UTF-8.");
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException(this);
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamM16911W = CodedOutputStream.m16911W(bArr);
            writeTo(codedOutputStreamM16911W);
            codedOutputStreamM16911W.m16955e();
            return bArr;
        } catch (IOException e) {
            pkq0.m170054a(getSerializingExceptionMessage("byte array"), e);
            return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public ByteString toByteString() {
        try {
            ByteString.C3371e c3371eNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(c3371eNewCodedBuilder.m16889b());
            return c3371eNewCodedBuilder.m16888a();
        } catch (IOException e) {
            pkq0.m170054a(getSerializingExceptionMessage("ByteString"), e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream codedOutputStreamM16910V = CodedOutputStream.m16910V(outputStream, CodedOutputStream.m16895E(CodedOutputStream.m16896F(serializedSize) + serializedSize));
        codedOutputStreamM16910V.m16976y0(serializedSize);
        writeTo(codedOutputStreamM16910V);
        codedOutputStreamM16910V.mo16946T();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamM16910V = CodedOutputStream.m16910V(outputStream, CodedOutputStream.m16895E(getSerializedSize()));
        writeTo(codedOutputStreamM16910V);
        codedOutputStreamM16910V.mo16946T();
    }

    /* JADX INFO: renamed from: com.google.protobuf.a$a */
    public static abstract class a<MessageType extends AbstractC3403a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC3419q.a {
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            iterable.getClass();
            if (iterable instanceof t9r) {
                checkForNullValues(((t9r) iterable).m187640k());
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

        public static UninitializedMessageException newUninitializedMessageException(InterfaceC3419q interfaceC3419q) {
            return new UninitializedMessageException(interfaceC3419q);
        }

        @Override // 
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType mo223800clone();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        public boolean mergeDelimitedFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            int i = inputStream.read();
            if (i == -1) {
                return false;
            }
            m223805mergeFrom((InputStream) new C22681a(inputStream, C3407e.m17097D(i, inputStream)), c3410h);
            return true;
        }

        @Override // com.google.protobuf.InterfaceC3419q.a
        public abstract BuilderType mergeFrom(C3407e c3407e, C3410h c3410h) throws IOException;

        @Override // com.google.protobuf.InterfaceC3419q.a
        public BuilderType mergeFrom(InterfaceC3419q interfaceC3419q) {
            if (getDefaultInstanceForType().getClass().isInstance(interfaceC3419q)) {
                return (BuilderType) internalMergeFrom((AbstractC3403a) interfaceC3419q);
            }
            ig3.m135964a("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }

        /* JADX INFO: renamed from: com.google.protobuf.a$a$a, reason: collision with other inner class name */
        public static final class C22681a extends FilterInputStream {

            /* JADX INFO: renamed from: a */
            public int f11567a;

            public C22681a(InputStream inputStream, int i) {
                super(inputStream);
                this.f11567a = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f11567a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f11567a;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.f11567a -= i4;
                }
                return i4;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.f11567a));
                if (jSkip >= 0) {
                    this.f11567a = (int) (((long) this.f11567a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f11567a <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f11567a--;
                }
                return i;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, C3410h.m17158b());
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m223803mergeFrom(C3407e c3407e) throws IOException {
            return (BuilderType) mergeFrom(c3407e, C3410h.m17158b());
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m223801mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                C3407e c3407eNewCodedInput = byteString.newCodedInput();
                m223803mergeFrom(c3407eNewCodedInput);
                c3407eNewCodedInput.m17128a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                pkq0.m170054a(getReadingExceptionMessage("ByteString"), e2);
                return null;
            }
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m223802mergeFrom(ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
            try {
                C3407e c3407eNewCodedInput = byteString.newCodedInput();
                mergeFrom(c3407eNewCodedInput, c3410h);
                c3407eNewCodedInput.m17128a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                pkq0.m170054a(getReadingExceptionMessage("ByteString"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC3419q.a
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) m223806mergeFrom(bArr, 0, bArr.length);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m223806mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                C3407e c3407eM17103i = C3407e.m17103i(bArr, i, i2);
                m223803mergeFrom(c3407eM17103i);
                c3407eM17103i.m17128a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                pkq0.m170054a(getReadingExceptionMessage("byte array"), e2);
                return null;
            }
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m223808mergeFrom(byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
            return (BuilderType) m223807mergeFrom(bArr, 0, bArr.length, c3410h);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m223807mergeFrom(byte[] bArr, int i, int i2, C3410h c3410h) throws InvalidProtocolBufferException {
            try {
                C3407e c3407eM17103i = C3407e.m17103i(bArr, i, i2);
                mergeFrom(c3407eM17103i, c3410h);
                c3407eM17103i.m17128a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                pkq0.m170054a(getReadingExceptionMessage("byte array"), e2);
                return null;
            }
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m223804mergeFrom(InputStream inputStream) throws IOException {
            C3407e c3407eM17100f = C3407e.m17100f(inputStream);
            m223803mergeFrom(c3407eM17100f);
            c3407eM17100f.m17128a(0);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType m223805mergeFrom(InputStream inputStream, C3410h c3410h) throws IOException {
            C3407e c3407eM17100f = C3407e.m17100f(inputStream);
            mergeFrom(c3407eM17100f, c3410h);
            c3407eM17100f.m17128a(0);
            return this;
        }
    }
}
