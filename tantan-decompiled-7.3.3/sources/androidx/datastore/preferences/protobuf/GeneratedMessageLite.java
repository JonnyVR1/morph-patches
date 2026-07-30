package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.AbstractC0293a;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p153l.evc0;
import p153l.g7b0;
import p153l.lyj0;
import p153l.mfz;
import p153l.mq80;
import p153l.nlc0;
import p153l.og60;
import p153l.vtq0;
import p153l.wpg0;
import p153l.yzv;

/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC0293a<MessageType, BuilderType>> extends AbstractC0319a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected C0344m0 unknownFields = C0344m0.m2262e();
    protected int memoizedSerializedSize = -1;

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final Class<?> messageClass;
        private final String messageClassName;

        public SerializedForm(InterfaceC0322b0 interfaceC0322b0) {
            Class<?> cls = interfaceC0322b0.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = interfaceC0322b0.toByteArray();
        }

        /* JADX INFO: renamed from: of */
        public static SerializedForm m1644of(InterfaceC0322b0 interfaceC0322b0) {
            return new SerializedForm(interfaceC0322b0);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((InterfaceC0322b0) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                vtq0.m202761a("Unable to understand proto buffer", e);
                return null;
            } catch (ClassNotFoundException e2) {
                evc0.m122777a("Unable to find proto buffer class: ", this.messageClassName, e2);
                return null;
            } catch (IllegalAccessException e3) {
                vtq0.m202761a("Unable to call parsePartialFrom", e3);
                return null;
            } catch (NoSuchFieldException e4) {
                evc0.m122777a("Unable to find defaultInstance in ", this.messageClassName, e4);
                return null;
            } catch (SecurityException e5) {
                evc0.m122777a("Unable to call defaultInstance in ", this.messageClassName, e5);
                return null;
            }
        }

        private Class<?> resolveMessageClass() throws ClassNotFoundException {
            Class<?> cls = this.messageClass;
            return cls != null ? cls : Class.forName(this.messageClassName);
        }

        public Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((InterfaceC0322b0) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                vtq0.m202761a("Unable to understand proto buffer", e);
                return null;
            } catch (ClassNotFoundException e2) {
                evc0.m122777a("Unable to find proto buffer class: ", this.messageClassName, e2);
                return null;
            } catch (IllegalAccessException e3) {
                vtq0.m202761a("Unable to call parsePartialFrom", e3);
                return null;
            } catch (NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (SecurityException e4) {
                evc0.m122777a("Unable to call DEFAULT_INSTANCE in ", this.messageClassName, e4);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$a */
    public static abstract class AbstractC0293a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC0293a<MessageType, BuilderType>> extends AbstractC0319a.a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a */
        public final MessageType f1568a;

        /* JADX INFO: renamed from: b */
        public MessageType f1569b;

        /* JADX INFO: renamed from: c */
        public boolean f1570c = false;

        public AbstractC0293a(MessageType messagetype) {
            this.f1568a = messagetype;
            this.f1569b = (MessageType) messagetype.m1639m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0322b0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractC0319a.a.m1798o(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0322b0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public MessageType buildPartial() {
            boolean z = this.f1570c;
            MessageType messagetype = this.f1569b;
            if (z) {
                return messagetype;
            }
            messagetype.m1642u();
            this.f1570c = true;
            return this.f1569b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0319a.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType mo1645d() {
            mq80.C18671a c18671a = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            c18671a.m1656w(buildPartial());
            return c18671a;
        }

        /* JADX INFO: renamed from: s */
        public void m1652s() {
            if (this.f1570c) {
                MessageType messagetype = (MessageType) this.f1569b.m1639m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                m1659z(messagetype, this.f1569b);
                this.f1569b = messagetype;
                this.f1570c = false;
            }
        }

        @Override // p153l.mfz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public MessageType getDefaultInstanceForType() {
            return this.f1568a;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0319a.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public BuilderType mo1646f(MessageType messagetype) {
            return (BuilderType) m1656w(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0319a.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public BuilderType mo1647k(AbstractC0331g abstractC0331g, C0341l c0341l) throws IOException {
            m1652s();
            try {
                g7b0.m129308a().m129312e(this.f1569b).mo1907e(this.f1569b, C0333h.m2113P(abstractC0331g), c0341l);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* JADX INFO: renamed from: w */
        public BuilderType m1656w(MessageType messagetype) {
            m1652s();
            m1659z(this.f1569b, messagetype);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0319a.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public BuilderType mo1648n(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return (BuilderType) m1658y(bArr, i, i2, C0341l.m2227b());
        }

        /* JADX INFO: renamed from: y */
        public BuilderType m1658y(byte[] bArr, int i, int i2, C0341l c0341l) throws InvalidProtocolBufferException {
            m1652s();
            try {
                g7b0.m129308a().m129312e(this.f1569b).mo1917j(this.f1569b, bArr, i, i + i2, new C0325d.b(c0341l));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                vtq0.m202761a("Reading from byte array should not throw IOException.", e2);
                return null;
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* JADX INFO: renamed from: z */
        public final void m1659z(MessageType messagetype, MessageType messagetype2) {
            g7b0.m129308a().m129312e(messagetype).mo1900a(messagetype, messagetype2);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$b */
    public static class C0294b<T extends GeneratedMessageLite<T, ?>> extends AbstractC0321b<T> {

        /* JADX INFO: renamed from: b */
        public final T f1571b;

        public C0294b(T t) {
            this.f1571b = t;
        }

        @Override // p153l.og60
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T mo1660a(AbstractC0331g abstractC0331g, C0341l c0341l) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.m1632z(this.f1571b, abstractC0331g, c0341l);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$c */
    public static abstract class AbstractC0295c<MessageType extends AbstractC0295c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements mfz {
        protected C0348p<C0296d> extensions = C0348p.m2298h();

        /* JADX INFO: renamed from: C */
        public C0348p<C0296d> m1662C() {
            if (this.extensions.m2312o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, p153l.mfz
        public /* bridge */ /* synthetic */ InterfaceC0322b0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.InterfaceC0322b0
        public /* bridge */ /* synthetic */ InterfaceC0322b0.a newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.InterfaceC0322b0
        public /* bridge */ /* synthetic */ InterfaceC0322b0.a toBuilder() {
            return super.toBuilder();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$d */
    public static final class C0296d implements C0348p.b<C0296d> {

        /* JADX INFO: renamed from: a */
        public final C0351s.d<?> f1572a;

        /* JADX INFO: renamed from: b */
        public final int f1573b;

        /* JADX INFO: renamed from: c */
        public final WireFormat.FieldType f1574c;

        /* JADX INFO: renamed from: d */
        public final boolean f1575d;

        /* JADX INFO: renamed from: e */
        public final boolean f1576e;

        @Override // androidx.datastore.preferences.protobuf.C0348p.b
        /* JADX INFO: renamed from: D */
        public WireFormat.FieldType mo1663D() {
            return this.f1574c;
        }

        @Override // androidx.datastore.preferences.protobuf.C0348p.b
        /* JADX INFO: renamed from: E */
        public WireFormat.JavaType mo1664E() {
            return this.f1574c.getJavaType();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.C0348p.b
        /* JADX INFO: renamed from: G */
        public InterfaceC0322b0.a mo1665G(InterfaceC0322b0.a aVar, InterfaceC0322b0 interfaceC0322b0) {
            return ((AbstractC0293a) aVar).m1656w((GeneratedMessageLite) interfaceC0322b0);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0296d c0296d) {
            return this.f1573b - c0296d.f1573b;
        }

        /* JADX INFO: renamed from: b */
        public C0351s.d<?> m1667b() {
            return this.f1572a;
        }

        @Override // androidx.datastore.preferences.protobuf.C0348p.b
        public int getNumber() {
            return this.f1573b;
        }

        @Override // androidx.datastore.preferences.protobuf.C0348p.b
        public boolean isPacked() {
            return this.f1576e;
        }

        @Override // androidx.datastore.preferences.protobuf.C0348p.b
        public boolean isRepeated() {
            return this.f1575d;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$e */
    public static class C0297e<ContainingType extends InterfaceC0322b0, Type> extends AbstractC0339k<ContainingType, Type> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0322b0 f1577a;

        /* JADX INFO: renamed from: b */
        public final C0296d f1578b;

        /* JADX INFO: renamed from: a */
        public WireFormat.FieldType m1668a() {
            return this.f1578b.mo1663D();
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC0322b0 m1669b() {
            return this.f1577a;
        }

        /* JADX INFO: renamed from: c */
        public int m1670c() {
            return this.f1578b.getNumber();
        }

        /* JADX INFO: renamed from: d */
        public boolean m1671d() {
            return this.f1578b.f1575d;
        }
    }

    /* JADX INFO: renamed from: A */
    public static <T extends GeneratedMessageLite<?, ?>> void m1623A(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* JADX INFO: renamed from: k */
    public static <T extends GeneratedMessageLite<T, ?>> T m1624k(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.m1794f().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    /* JADX INFO: renamed from: p */
    public static <E> C0351s.i<E> m1625p() {
        return C0332g0.m2109f();
    }

    /* JADX INFO: renamed from: q */
    public static <T extends GeneratedMessageLite<?, ?>> T m1626q(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                yzv.m218057a("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) lyj0.m156326j(cls)).getDefaultInstanceForType();
        if (t2 != null) {
            defaultInstanceMap.put(cls, t2);
            return t2;
        }
        wpg0.m207458a();
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static Object m1627s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            vtq0.m202761a("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            vtq0.m202761a("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static final <T extends GeneratedMessageLite<T, ?>> boolean m1628t(T t, boolean z) {
        byte bByteValue = ((Byte) t.m1639m(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo1901b = g7b0.m129308a().m129312e(t).mo1901b(t);
        if (z) {
            t.m1640n(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zMo1901b ? t : null);
        }
        return zMo1901b;
    }

    /* JADX INFO: renamed from: v */
    public static <E> C0351s.i<E> m1629v(C0351s.i<E> iVar) {
        int size = iVar.size();
        return iVar.mo2015d(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: renamed from: x */
    public static Object m1630x(InterfaceC0322b0 interfaceC0322b0, String str, Object[] objArr) {
        return new nlc0(interfaceC0322b0, str, objArr);
    }

    /* JADX INFO: renamed from: y */
    public static <T extends GeneratedMessageLite<T, ?>> T m1631y(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) m1624k(m1632z(t, AbstractC0331g.m2030f(inputStream), C0341l.m2227b()));
    }

    /* JADX INFO: renamed from: z */
    public static <T extends GeneratedMessageLite<T, ?>> T m1632z(T t, AbstractC0331g abstractC0331g, C0341l c0341l) throws InvalidProtocolBufferException {
        T t2 = (T) t.m1639m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            InterfaceC0336i0 interfaceC0336i0M129312e = g7b0.m129308a().m129312e(t2);
            interfaceC0336i0M129312e.mo1907e(t2, C0333h.m2113P(abstractC0331g), c0341l);
            interfaceC0336i0M129312e.mo1909f(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0322b0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) m1639m(MethodToInvoke.NEW_BUILDER);
        buildertype.m1656w(this);
        return buildertype;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0322b0
    /* JADX INFO: renamed from: a */
    public void mo1634a(CodedOutputStream codedOutputStream) throws IOException {
        g7b0.m129308a().m129312e(this).mo1903c(this, C0335i.m2122P(codedOutputStream));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0319a
    /* JADX INFO: renamed from: c */
    public int mo1635c() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getDefaultInstanceForType().getClass().isInstance(obj)) {
            return g7b0.m129308a().m129312e(this).mo1905d(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0322b0
    public final og60<MessageType> getParserForType() {
        return (og60) m1639m(MethodToInvoke.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0322b0
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = g7b0.m129308a().m129312e(this).mo1911g(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0319a
    /* JADX INFO: renamed from: h */
    public void mo1636h(int i) {
        this.memoizedSerializedSize = i;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iMo1915i = g7b0.m129308a().m129312e(this).mo1915i(this);
        this.memoizedHashCode = iMo1915i;
        return iMo1915i;
    }

    @Override // p153l.mfz
    public final boolean isInitialized() {
        return m1628t(this, true);
    }

    /* JADX INFO: renamed from: j */
    public Object m1637j() throws Exception {
        return m1639m(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: renamed from: l */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC0293a<MessageType, BuilderType>> BuilderType m1638l() {
        return (BuilderType) m1639m(MethodToInvoke.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: m */
    public Object m1639m(MethodToInvoke methodToInvoke) {
        return mo1464o(methodToInvoke, null, null);
    }

    /* JADX INFO: renamed from: n */
    public Object m1640n(MethodToInvoke methodToInvoke, Object obj) {
        return mo1464o(methodToInvoke, obj, null);
    }

    /* JADX INFO: renamed from: o */
    public abstract Object mo1464o(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    @Override // p153l.mfz
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) m1639m(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public String toString() {
        return C0324c0.m1826e(this, super.toString());
    }

    /* JADX INFO: renamed from: u */
    public void m1642u() {
        g7b0.m129308a().m129312e(this).mo1909f(this);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0322b0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) m1639m(MethodToInvoke.NEW_BUILDER);
    }
}
