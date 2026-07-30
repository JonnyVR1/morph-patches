package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.AbstractC0292a;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p149l.byv;
import p149l.cza0;
import p149l.gdc0;
import p149l.hi80;
import p149l.ipj0;
import p149l.j860;
import p149l.ohg0;
import p149l.p6z;
import p149l.pkq0;
import p149l.zmc0;

/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC0292a<MessageType, BuilderType>> extends AbstractC0318a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected C0343m0 unknownFields = C0343m0.m2261e();
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

        public SerializedForm(InterfaceC0321b0 interfaceC0321b0) {
            Class<?> cls = interfaceC0321b0.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = interfaceC0321b0.toByteArray();
        }

        /* JADX INFO: renamed from: of */
        public static SerializedForm m1643of(InterfaceC0321b0 interfaceC0321b0) {
            return new SerializedForm(interfaceC0321b0);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((InterfaceC0321b0) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                pkq0.m170054a("Unable to understand proto buffer", e);
                return null;
            } catch (ClassNotFoundException e2) {
                zmc0.m219321a("Unable to find proto buffer class: ", this.messageClassName, e2);
                return null;
            } catch (IllegalAccessException e3) {
                pkq0.m170054a("Unable to call parsePartialFrom", e3);
                return null;
            } catch (NoSuchFieldException e4) {
                zmc0.m219321a("Unable to find defaultInstance in ", this.messageClassName, e4);
                return null;
            } catch (SecurityException e5) {
                zmc0.m219321a("Unable to call defaultInstance in ", this.messageClassName, e5);
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
                return ((InterfaceC0321b0) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                pkq0.m170054a("Unable to understand proto buffer", e);
                return null;
            } catch (ClassNotFoundException e2) {
                zmc0.m219321a("Unable to find proto buffer class: ", this.messageClassName, e2);
                return null;
            } catch (IllegalAccessException e3) {
                pkq0.m170054a("Unable to call parsePartialFrom", e3);
                return null;
            } catch (NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (SecurityException e4) {
                zmc0.m219321a("Unable to call DEFAULT_INSTANCE in ", this.messageClassName, e4);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$a */
    public static abstract class AbstractC0292a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC0292a<MessageType, BuilderType>> extends AbstractC0318a.a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a */
        public final MessageType f1568a;

        /* JADX INFO: renamed from: b */
        public MessageType f1569b;

        /* JADX INFO: renamed from: c */
        public boolean f1570c = false;

        public AbstractC0292a(MessageType messagetype) {
            this.f1568a = messagetype;
            this.f1569b = (MessageType) messagetype.m1638m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0321b0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractC0318a.a.m1797o(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0321b0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public MessageType buildPartial() {
            boolean z = this.f1570c;
            MessageType messagetype = this.f1569b;
            if (z) {
                return messagetype;
            }
            messagetype.m1641u();
            this.f1570c = true;
            return this.f1569b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0318a.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType mo1644d() {
            hi80.C17322a c17322a = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            c17322a.m1655w(buildPartial());
            return c17322a;
        }

        /* JADX INFO: renamed from: s */
        public void m1651s() {
            if (this.f1570c) {
                MessageType messagetype = (MessageType) this.f1569b.m1638m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                m1658z(messagetype, this.f1569b);
                this.f1569b = messagetype;
                this.f1570c = false;
            }
        }

        @Override // p149l.p6z
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public MessageType getDefaultInstanceForType() {
            return this.f1568a;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0318a.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public BuilderType mo1645f(MessageType messagetype) {
            return (BuilderType) m1655w(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0318a.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public BuilderType mo1646k(AbstractC0330g abstractC0330g, C0340l c0340l) throws IOException {
            m1651s();
            try {
                cza0.m109400a().m109404e(this.f1569b).mo1906e(this.f1569b, C0332h.m2112P(abstractC0330g), c0340l);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* JADX INFO: renamed from: w */
        public BuilderType m1655w(MessageType messagetype) {
            m1651s();
            m1658z(this.f1569b, messagetype);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0318a.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public BuilderType mo1647n(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return (BuilderType) m1657y(bArr, i, i2, C0340l.m2226b());
        }

        /* JADX INFO: renamed from: y */
        public BuilderType m1657y(byte[] bArr, int i, int i2, C0340l c0340l) throws InvalidProtocolBufferException {
            m1651s();
            try {
                cza0.m109400a().m109404e(this.f1569b).mo1916j(this.f1569b, bArr, i, i + i2, new C0324d.b(c0340l));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                pkq0.m170054a("Reading from byte array should not throw IOException.", e2);
                return null;
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* JADX INFO: renamed from: z */
        public final void m1658z(MessageType messagetype, MessageType messagetype2) {
            cza0.m109400a().m109404e(messagetype).mo1899a(messagetype, messagetype2);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$b */
    public static class C0293b<T extends GeneratedMessageLite<T, ?>> extends AbstractC0320b<T> {

        /* JADX INFO: renamed from: b */
        public final T f1571b;

        public C0293b(T t) {
            this.f1571b = t;
        }

        @Override // p149l.j860
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T mo1659a(AbstractC0330g abstractC0330g, C0340l c0340l) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.m1631z(this.f1571b, abstractC0330g, c0340l);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$c */
    public static abstract class AbstractC0294c<MessageType extends AbstractC0294c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements p6z {
        protected C0347p<C0295d> extensions = C0347p.m2297h();

        /* JADX INFO: renamed from: C */
        public C0347p<C0295d> m1661C() {
            if (this.extensions.m2311o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, p149l.p6z
        public /* bridge */ /* synthetic */ InterfaceC0321b0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.InterfaceC0321b0
        public /* bridge */ /* synthetic */ InterfaceC0321b0.a newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.InterfaceC0321b0
        public /* bridge */ /* synthetic */ InterfaceC0321b0.a toBuilder() {
            return super.toBuilder();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$d */
    public static final class C0295d implements C0347p.b<C0295d> {

        /* JADX INFO: renamed from: a */
        public final C0350s.d<?> f1572a;

        /* JADX INFO: renamed from: b */
        public final int f1573b;

        /* JADX INFO: renamed from: c */
        public final WireFormat.FieldType f1574c;

        /* JADX INFO: renamed from: d */
        public final boolean f1575d;

        /* JADX INFO: renamed from: e */
        public final boolean f1576e;

        @Override // androidx.datastore.preferences.protobuf.C0347p.b
        /* JADX INFO: renamed from: D */
        public WireFormat.FieldType mo1662D() {
            return this.f1574c;
        }

        @Override // androidx.datastore.preferences.protobuf.C0347p.b
        /* JADX INFO: renamed from: E */
        public WireFormat.JavaType mo1663E() {
            return this.f1574c.getJavaType();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.C0347p.b
        /* JADX INFO: renamed from: G */
        public InterfaceC0321b0.a mo1664G(InterfaceC0321b0.a aVar, InterfaceC0321b0 interfaceC0321b0) {
            return ((AbstractC0292a) aVar).m1655w((GeneratedMessageLite) interfaceC0321b0);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0295d c0295d) {
            return this.f1573b - c0295d.f1573b;
        }

        /* JADX INFO: renamed from: b */
        public C0350s.d<?> m1666b() {
            return this.f1572a;
        }

        @Override // androidx.datastore.preferences.protobuf.C0347p.b
        public int getNumber() {
            return this.f1573b;
        }

        @Override // androidx.datastore.preferences.protobuf.C0347p.b
        public boolean isPacked() {
            return this.f1576e;
        }

        @Override // androidx.datastore.preferences.protobuf.C0347p.b
        public boolean isRepeated() {
            return this.f1575d;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$e */
    public static class C0296e<ContainingType extends InterfaceC0321b0, Type> extends AbstractC0338k<ContainingType, Type> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0321b0 f1577a;

        /* JADX INFO: renamed from: b */
        public final C0295d f1578b;

        /* JADX INFO: renamed from: a */
        public WireFormat.FieldType m1667a() {
            return this.f1578b.mo1662D();
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC0321b0 m1668b() {
            return this.f1577a;
        }

        /* JADX INFO: renamed from: c */
        public int m1669c() {
            return this.f1578b.getNumber();
        }

        /* JADX INFO: renamed from: d */
        public boolean m1670d() {
            return this.f1578b.f1575d;
        }
    }

    /* JADX INFO: renamed from: A */
    public static <T extends GeneratedMessageLite<?, ?>> void m1622A(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* JADX INFO: renamed from: k */
    public static <T extends GeneratedMessageLite<T, ?>> T m1623k(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.m1793f().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    /* JADX INFO: renamed from: p */
    public static <E> C0350s.i<E> m1624p() {
        return C0331g0.m2108f();
    }

    /* JADX INFO: renamed from: q */
    public static <T extends GeneratedMessageLite<?, ?>> T m1625q(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                byv.m104511a("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) ipj0.m137521j(cls)).getDefaultInstanceForType();
        if (t2 != null) {
            defaultInstanceMap.put(cls, t2);
            return t2;
        }
        ohg0.m164364a();
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static Object m1626s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            pkq0.m170054a("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            pkq0.m170054a("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static final <T extends GeneratedMessageLite<T, ?>> boolean m1627t(T t, boolean z) {
        byte bByteValue = ((Byte) t.m1638m(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo1900b = cza0.m109400a().m109404e(t).mo1900b(t);
        if (z) {
            t.m1639n(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zMo1900b ? t : null);
        }
        return zMo1900b;
    }

    /* JADX INFO: renamed from: v */
    public static <E> C0350s.i<E> m1628v(C0350s.i<E> iVar) {
        int size = iVar.size();
        return iVar.mo2014d(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: renamed from: x */
    public static Object m1629x(InterfaceC0321b0 interfaceC0321b0, String str, Object[] objArr) {
        return new gdc0(interfaceC0321b0, str, objArr);
    }

    /* JADX INFO: renamed from: y */
    public static <T extends GeneratedMessageLite<T, ?>> T m1630y(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) m1623k(m1631z(t, AbstractC0330g.m2029f(inputStream), C0340l.m2226b()));
    }

    /* JADX INFO: renamed from: z */
    public static <T extends GeneratedMessageLite<T, ?>> T m1631z(T t, AbstractC0330g abstractC0330g, C0340l c0340l) throws InvalidProtocolBufferException {
        T t2 = (T) t.m1638m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            InterfaceC0335i0 interfaceC0335i0M109404e = cza0.m109400a().m109404e(t2);
            interfaceC0335i0M109404e.mo1906e(t2, C0332h.m2112P(abstractC0330g), c0340l);
            interfaceC0335i0M109404e.mo1908f(t2);
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

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0321b0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) m1638m(MethodToInvoke.NEW_BUILDER);
        buildertype.m1655w(this);
        return buildertype;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0321b0
    /* JADX INFO: renamed from: a */
    public void mo1633a(CodedOutputStream codedOutputStream) throws IOException {
        cza0.m109400a().m109404e(this).mo1902c(this, C0334i.m2121P(codedOutputStream));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0318a
    /* JADX INFO: renamed from: c */
    public int mo1634c() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getDefaultInstanceForType().getClass().isInstance(obj)) {
            return cza0.m109400a().m109404e(this).mo1904d(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0321b0
    public final j860<MessageType> getParserForType() {
        return (j860) m1638m(MethodToInvoke.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0321b0
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = cza0.m109400a().m109404e(this).mo1910g(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0318a
    /* JADX INFO: renamed from: h */
    public void mo1635h(int i) {
        this.memoizedSerializedSize = i;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iMo1914i = cza0.m109400a().m109404e(this).mo1914i(this);
        this.memoizedHashCode = iMo1914i;
        return iMo1914i;
    }

    @Override // p149l.p6z
    public final boolean isInitialized() {
        return m1627t(this, true);
    }

    /* JADX INFO: renamed from: j */
    public Object m1636j() throws Exception {
        return m1638m(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: renamed from: l */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC0292a<MessageType, BuilderType>> BuilderType m1637l() {
        return (BuilderType) m1638m(MethodToInvoke.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: m */
    public Object m1638m(MethodToInvoke methodToInvoke) {
        return mo1463o(methodToInvoke, null, null);
    }

    /* JADX INFO: renamed from: n */
    public Object m1639n(MethodToInvoke methodToInvoke, Object obj) {
        return mo1463o(methodToInvoke, obj, null);
    }

    /* JADX INFO: renamed from: o */
    public abstract Object mo1463o(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    @Override // p149l.p6z
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) m1638m(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public String toString() {
        return C0323c0.m1825e(this, super.toString());
    }

    /* JADX INFO: renamed from: u */
    public void m1641u() {
        cza0.m109400a().m109404e(this).mo1908f(this);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0321b0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) m1638m(MethodToInvoke.NEW_BUILDER);
    }
}
