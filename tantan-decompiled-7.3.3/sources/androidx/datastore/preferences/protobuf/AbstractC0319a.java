package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0319a;
import androidx.datastore.preferences.protobuf.AbstractC0319a.a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p153l.mnd0;
import p153l.ru80;
import p153l.vtq0;
import p153l.wbr;
import p153l.wg3;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0319a<MessageType extends AbstractC0319a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC0322b0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a */
    public static abstract class a<MessageType extends AbstractC0319a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC0322b0.a {
        /* JADX INFO: renamed from: b */
        public static <T> void m1796b(Iterable<T> iterable, List<? super T> list) {
            C0351s.m2340a(iterable);
            if (!(iterable instanceof wbr)) {
                if (iterable instanceof ru80) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    m1797c(iterable, list);
                    return;
                }
            }
            List<?> listMo2364k = ((wbr) iterable).mo2364k();
            wbr wbrVar = (wbr) list;
            int size = list.size();
            for (Object obj : listMo2364k) {
                if (obj == null) {
                    String str = "Element at index " + (wbrVar.size() - size) + " is null.";
                    for (int size2 = wbrVar.size() - 1; size2 >= size; size2--) {
                        wbrVar.remove(size2);
                    }
                    mnd0.m159157a(str);
                    return;
                }
                if (obj instanceof ByteString) {
                    wbrVar.mo2366t((ByteString) obj);
                } else {
                    wbrVar.add((String) obj);
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public static <T> void m1797c(Iterable<T> iterable, List<? super T> list) {
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
                    mnd0.m159157a(str);
                    return;
                }
                list.add(t);
            }
        }

        /* JADX INFO: renamed from: o */
        public static UninitializedMessageException m1798o(InterfaceC0322b0 interfaceC0322b0) {
            return new UninitializedMessageException(interfaceC0322b0);
        }

        @Override // 
        /* JADX INFO: renamed from: d */
        public abstract BuilderType mo1645d();

        /* JADX INFO: renamed from: e */
        public final String m1799e(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        /* JADX INFO: renamed from: f */
        public abstract BuilderType mo1646f(MessageType messagetype);

        /* JADX INFO: renamed from: j */
        public BuilderType m1801j(AbstractC0331g abstractC0331g) throws IOException {
            return (BuilderType) mo1647k(abstractC0331g, C0341l.m2227b());
        }

        /* JADX INFO: renamed from: k */
        public abstract BuilderType mo1647k(AbstractC0331g abstractC0331g, C0341l c0341l) throws IOException;

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0322b0.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public BuilderType mo1800g(InterfaceC0322b0 interfaceC0322b0) {
            if (getDefaultInstanceForType().getClass().isInstance(interfaceC0322b0)) {
                return (BuilderType) mo1646f((AbstractC0319a) interfaceC0322b0);
            }
            wg3.m206174a("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0322b0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) mo1648n(bArr, 0, bArr.length);
        }

        /* JADX INFO: renamed from: n */
        public BuilderType mo1648n(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                AbstractC0331g abstractC0331gM2034j = AbstractC0331g.m2034j(bArr, i, i2);
                m1801j(abstractC0331gM2034j);
                abstractC0331gM2034j.mo2042a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                vtq0.m202761a(m1799e("byte array"), e2);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m1791b(Iterable<T> iterable, List<? super T> list) {
        a.m1796b(iterable, list);
    }

    /* JADX INFO: renamed from: c */
    public int mo1635c() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public int m1792d(InterfaceC0336i0 interfaceC0336i0) {
        int iMo1635c = mo1635c();
        if (iMo1635c != -1) {
            return iMo1635c;
        }
        int iMo1911g = interfaceC0336i0.mo1911g(this);
        mo1636h(iMo1911g);
        return iMo1911g;
    }

    /* JADX INFO: renamed from: e */
    public final String m1793e(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: f */
    public UninitializedMessageException m1794f() {
        return new UninitializedMessageException(this);
    }

    /* JADX INFO: renamed from: h */
    public void mo1636h(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: i */
    public void m1795i(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamM1530g0 = CodedOutputStream.m1530g0(outputStream, CodedOutputStream.m1506J(getSerializedSize()));
        mo1634a(codedOutputStreamM1530g0);
        codedOutputStreamM1530g0.mo1582d0();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0322b0
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamM1532h0 = CodedOutputStream.m1532h0(bArr);
            mo1634a(codedOutputStreamM1532h0);
            codedOutputStreamM1532h0.m1581d();
            return bArr;
        } catch (IOException e) {
            vtq0.m202761a(m1793e("byte array"), e);
            return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0322b0
    public ByteString toByteString() {
        try {
            ByteString.C0281g c0281gNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            mo1634a(c0281gNewCodedBuilder.m1495b());
            return c0281gNewCodedBuilder.m1494a();
        } catch (IOException e) {
            vtq0.m202761a(m1793e("ByteString"), e);
            return null;
        }
    }
}
