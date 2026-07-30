package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0318a;
import androidx.datastore.preferences.protobuf.AbstractC0318a.a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p149l.ig3;
import p149l.jfd0;
import p149l.nm80;
import p149l.pkq0;
import p149l.u9r;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0318a<MessageType extends AbstractC0318a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC0321b0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a */
    public static abstract class a<MessageType extends AbstractC0318a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC0321b0.a {
        /* JADX INFO: renamed from: b */
        public static <T> void m1795b(Iterable<T> iterable, List<? super T> list) {
            C0350s.m2339a(iterable);
            if (!(iterable instanceof u9r)) {
                if (iterable instanceof nm80) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    m1796c(iterable, list);
                    return;
                }
            }
            List<?> listMo2363k = ((u9r) iterable).mo2363k();
            u9r u9rVar = (u9r) list;
            int size = list.size();
            for (Object obj : listMo2363k) {
                if (obj == null) {
                    String str = "Element at index " + (u9rVar.size() - size) + " is null.";
                    for (int size2 = u9rVar.size() - 1; size2 >= size; size2--) {
                        u9rVar.remove(size2);
                    }
                    jfd0.m141176a(str);
                    return;
                }
                if (obj instanceof ByteString) {
                    u9rVar.mo2365t((ByteString) obj);
                } else {
                    u9rVar.add((String) obj);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public static <T> void m1796c(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    jfd0.m141176a(str);
                    return;
                }
                list.add(t);
            }
        }

        /* JADX INFO: renamed from: o */
        public static UninitializedMessageException m1797o(InterfaceC0321b0 interfaceC0321b0) {
            return new UninitializedMessageException(interfaceC0321b0);
        }

        @Override // 
        /* JADX INFO: renamed from: d */
        public abstract BuilderType mo1644d();

        /* JADX INFO: renamed from: e */
        public final String m1798e(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        /* JADX INFO: renamed from: f */
        public abstract BuilderType mo1645f(MessageType messagetype);

        /* JADX INFO: renamed from: j */
        public BuilderType m1800j(AbstractC0330g abstractC0330g) throws IOException {
            return (BuilderType) mo1646k(abstractC0330g, C0340l.m2226b());
        }

        /* JADX INFO: renamed from: k */
        public abstract BuilderType mo1646k(AbstractC0330g abstractC0330g, C0340l c0340l) throws IOException;

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0321b0.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public BuilderType mo1799g(InterfaceC0321b0 interfaceC0321b0) {
            if (getDefaultInstanceForType().getClass().isInstance(interfaceC0321b0)) {
                return (BuilderType) mo1645f((AbstractC0318a) interfaceC0321b0);
            }
            ig3.m135964a("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0321b0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) mo1647n(bArr, 0, bArr.length);
        }

        /* JADX INFO: renamed from: n */
        public BuilderType mo1647n(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                AbstractC0330g abstractC0330gM2033j = AbstractC0330g.m2033j(bArr, i, i2);
                m1800j(abstractC0330gM2033j);
                abstractC0330gM2033j.mo2041a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                pkq0.m170054a(m1798e("byte array"), e2);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m1790b(Iterable<T> iterable, List<? super T> list) {
        a.m1795b(iterable, list);
    }

    /* JADX INFO: renamed from: c */
    public int mo1634c() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public int m1791d(InterfaceC0335i0 interfaceC0335i0) {
        int iMo1634c = mo1634c();
        if (iMo1634c != -1) {
            return iMo1634c;
        }
        int iMo1910g = interfaceC0335i0.mo1910g(this);
        mo1635h(iMo1910g);
        return iMo1910g;
    }

    /* JADX INFO: renamed from: e */
    public final String m1792e(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: f */
    public UninitializedMessageException m1793f() {
        return new UninitializedMessageException(this);
    }

    /* JADX INFO: renamed from: h */
    public void mo1635h(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: i */
    public void m1794i(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamM1529g0 = CodedOutputStream.m1529g0(outputStream, CodedOutputStream.m1505J(getSerializedSize()));
        mo1633a(codedOutputStreamM1529g0);
        codedOutputStreamM1529g0.mo1581d0();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0321b0
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamM1531h0 = CodedOutputStream.m1531h0(bArr);
            mo1633a(codedOutputStreamM1531h0);
            codedOutputStreamM1531h0.m1580d();
            return bArr;
        } catch (IOException e) {
            pkq0.m170054a(m1792e("byte array"), e);
            return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0321b0
    public ByteString toByteString() {
        try {
            ByteString.C0280g c0280gNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            mo1633a(c0280gNewCodedBuilder.m1494b());
            return c0280gNewCodedBuilder.m1493a();
        } catch (IOException e) {
            pkq0.m170054a(m1792e("ByteString"), e);
            return null;
        }
    }
}
