package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.AbstractC3403b;
import com.immomo.push.p045pb.NotifyInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.evc0;
import p153l.eyj0;
import p153l.lfz;
import p153l.ng60;
import p153l.vtq0;
import p153l.wg3;
import p153l.wpg0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC3403b<MessageType, BuilderType>> extends AbstractC3426a<MessageType, BuilderType> {
    protected eyj0 unknownFields = eyj0.m123201c();
    protected int memoizedSerializedSize = -1;

    public static class EqualsVisitor implements InterfaceC3409h {
        static final EqualsVisitor INSTANCE = new EqualsVisitor();

        /* JADX INFO: renamed from: a */
        public static final NotEqualsException f11569a = new NotEqualsException();

        public static final class NotEqualsException extends RuntimeException {
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: a */
        public C3434i<C3405d> mo17047a(C3434i<C3405d> c3434i, C3434i<C3405d> c3434i2) {
            if (c3434i.equals(c3434i2)) {
                return c3434i;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: b */
        public C3437l.e mo17048b(C3437l.e eVar, C3437l.e eVar2) {
            if (eVar.equals(eVar2)) {
                return eVar;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: c */
        public void mo17049c(boolean z) {
            if (z) {
                throw f11569a;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: d */
        public boolean mo17050d(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: e */
        public int mo17051e(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: f */
        public String mo17052f(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: g */
        public <T> C3437l.h<T> mo17053g(C3437l.h<T> hVar, C3437l.h<T> hVar2) {
            if (hVar.equals(hVar2)) {
                return hVar;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: h */
        public ByteString mo17054h(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            if (z == z2 && byteString.equals(byteString2)) {
                return byteString;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: i */
        public long mo17055i(boolean z, long j, boolean z2, long j2) {
            if (z == z2 && j == j2) {
                return j;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: j */
        public double mo17056j(boolean z, double d, boolean z2, double d2) {
            if (z == z2 && d == d2) {
                return d;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: k */
        public Object mo17057k(boolean z, Object obj, Object obj2) {
            if (z && ((GeneratedMessageLite) obj).equals(this, (InterfaceC3442q) obj2)) {
                return obj;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: l */
        public <K, V> MapFieldLite<K, V> mo17058l(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            if (mapFieldLite.equals(mapFieldLite2)) {
                return mapFieldLite;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: m */
        public eyj0 mo17059m(eyj0 eyj0Var, eyj0 eyj0Var2) {
            if (eyj0Var.equals(eyj0Var2)) {
                return eyj0Var;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: n */
        public C3437l.f mo17060n(C3437l.f fVar, C3437l.f fVar2) {
            if (fVar.equals(fVar2)) {
                return fVar;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: o */
        public <T extends InterfaceC3442q> T mo17061o(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw f11569a;
            }
            ((GeneratedMessageLite) t).equals(this, t2);
            return t;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: p */
        public float mo17062p(boolean z, float f, boolean z2, float f2) {
            if (z == z2 && f == f2) {
                return f;
            }
            throw f11569a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: q */
        public C3437l.g mo17063q(C3437l.g gVar, C3437l.g gVar2) {
            if (gVar.equals(gVar2)) {
                return gVar;
            }
            throw f11569a;
        }
    }

    public enum MethodToInvoke {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final String messageClassName;

        public SerializedForm(InterfaceC3442q interfaceC3442q) {
            this.messageClassName = interfaceC3442q.getClass().getName();
            this.asBytes = interfaceC3442q.toByteArray();
        }

        /* JADX INFO: renamed from: of */
        public static SerializedForm m17064of(InterfaceC3442q interfaceC3442q) {
            return new SerializedForm(interfaceC3442q);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                Field declaredField = Class.forName(this.messageClassName).getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((InterfaceC3442q) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
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

        public Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = Class.forName(this.messageClassName).getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((InterfaceC3442q) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
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

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$a */
    public static /* synthetic */ class C3402a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11574a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f11574a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11574a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$c */
    public static class C3404c<T extends GeneratedMessageLite<T, ?>> extends AbstractC3427b<T> {

        /* JADX INFO: renamed from: b */
        public T f11575b;

        public C3404c(T t) {
            this.f11575b = t;
        }

        @Override // p153l.ng60
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public T mo17065c(C3430e c3430e, C3433h c3433h) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.parsePartialFrom(this.f11575b, c3430e, c3433h);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$d */
    public static final class C3405d implements C3434i.b<C3405d> {

        /* JADX INFO: renamed from: a */
        public final C3437l.d<?> f11576a;

        /* JADX INFO: renamed from: b */
        public final int f11577b;

        /* JADX INFO: renamed from: c */
        public final WireFormat.FieldType f11578c;

        /* JADX INFO: renamed from: d */
        public final boolean f11579d;

        /* JADX INFO: renamed from: e */
        public final boolean f11580e;

        public C3405d(C3437l.d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f11576a = dVar;
            this.f11577b = i;
            this.f11578c = fieldType;
            this.f11579d = z;
            this.f11580e = z2;
        }

        @Override // com.google.protobuf.C3434i.b
        /* JADX INFO: renamed from: D */
        public WireFormat.FieldType mo17067D() {
            return this.f11578c;
        }

        @Override // com.google.protobuf.C3434i.b
        /* JADX INFO: renamed from: E */
        public WireFormat.JavaType mo17068E() {
            return this.f11578c.getJavaType();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C3405d c3405d) {
            return this.f11577b - c3405d.f11577b;
        }

        /* JADX INFO: renamed from: b */
        public C3437l.d<?> m17070b() {
            return this.f11576a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.C3434i.b
        /* JADX INFO: renamed from: c */
        public InterfaceC3442q.a mo17071c(InterfaceC3442q.a aVar, InterfaceC3442q interfaceC3442q) {
            return ((AbstractC3403b) aVar).mergeFrom((GeneratedMessageLite) interfaceC3442q);
        }

        @Override // com.google.protobuf.C3434i.b
        public int getNumber() {
            return this.f11577b;
        }

        @Override // com.google.protobuf.C3434i.b
        public boolean isPacked() {
            return this.f11580e;
        }

        @Override // com.google.protobuf.C3434i.b
        public boolean isRepeated() {
            return this.f11579d;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$e */
    public static class C3406e<ContainingType extends InterfaceC3442q, Type> extends AbstractC3432g<ContainingType, Type> {

        /* JADX INFO: renamed from: a */
        public final ContainingType f11581a;

        /* JADX INFO: renamed from: b */
        public final Type f11582b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC3442q f11583c;

        /* JADX INFO: renamed from: d */
        public final C3405d f11584d;

        public C3406e(ContainingType containingtype, Type type, InterfaceC3442q interfaceC3442q, C3405d c3405d, Class cls) {
            if (containingtype == null) {
                wg3.m206174a("Null containingTypeDefaultInstance");
                throw null;
            }
            if (c3405d.mo17067D() == WireFormat.FieldType.MESSAGE && interfaceC3442q == null) {
                wg3.m206174a("Null messageDefaultInstance");
                throw null;
            }
            this.f11581a = containingtype;
            this.f11582b = type;
            this.f11583c = interfaceC3442q;
            this.f11584d = c3405d;
        }

        /* JADX INFO: renamed from: b */
        public Object m17072b(Object obj) {
            if (!this.f11584d.isRepeated()) {
                return m17076f(obj);
            }
            if (this.f11584d.mo17068E() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(m17076f(it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: c */
        public ContainingType m17073c() {
            return this.f11581a;
        }

        /* JADX INFO: renamed from: d */
        public InterfaceC3442q m17074d() {
            return this.f11583c;
        }

        /* JADX INFO: renamed from: e */
        public int m17075e() {
            return this.f11584d.getNumber();
        }

        /* JADX INFO: renamed from: f */
        public Object m17076f(Object obj) {
            return this.f11584d.mo17068E() == WireFormat.JavaType.ENUM ? this.f11584d.f11576a.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        /* JADX INFO: renamed from: g */
        public Object m17077g(Object obj) {
            return this.f11584d.mo17068E() == WireFormat.JavaType.ENUM ? Integer.valueOf(((C3437l.c) obj).getNumber()) : obj;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$g */
    public static class C3408g implements InterfaceC3409h {
        public static final C3408g INSTANCE = new C3408g();

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: a */
        public C3434i<C3405d> mo17047a(C3434i<C3405d> c3434i, C3434i<C3405d> c3434i2) {
            if (c3434i.m17235o()) {
                c3434i = c3434i.clone();
            }
            c3434i.m17240t(c3434i2);
            return c3434i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: b */
        public C3437l.e mo17048b(C3437l.e eVar, C3437l.e eVar2) {
            C3437l.e eVarMo17143d;
            int size = eVar.size();
            int size2 = eVar2.size();
            C3437l.e eVar3 = eVar;
            eVar3 = eVar;
            if (size > 0 && size2 > 0) {
                if (!eVar.mo17140q()) {
                    eVarMo17143d = eVar;
                    eVarMo17143d = eVar.mo17143d(size2 + size);
                }
                eVarMo17143d = eVar;
                eVarMo17143d.addAll(eVar2);
                eVar3 = eVarMo17143d;
            }
            return size > 0 ? eVar3 : eVar2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: c */
        public void mo17049c(boolean z) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: d */
        public boolean mo17050d(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: e */
        public int mo17051e(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: f */
        public String mo17052f(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: g */
        public <T> C3437l.h<T> mo17053g(C3437l.h<T> hVar, C3437l.h<T> hVar2) {
            int size = hVar.size();
            int size2 = hVar2.size();
            if (size > 0 && size2 > 0) {
                if (!hVar.mo17140q()) {
                    hVar = hVar.mo17143d(size2 + size);
                }
                hVar.addAll(hVar2);
            }
            return size > 0 ? hVar : hVar2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: h */
        public ByteString mo17054h(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            return z2 ? byteString2 : byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: i */
        public long mo17055i(boolean z, long j, boolean z2, long j2) {
            return z2 ? j2 : j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: j */
        public double mo17056j(boolean z, double d, boolean z2, double d2) {
            return z2 ? d2 : d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: k */
        public Object mo17057k(boolean z, Object obj, Object obj2) {
            return z ? mo17061o((InterfaceC3442q) obj, (InterfaceC3442q) obj2) : obj2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: l */
        public <K, V> MapFieldLite<K, V> mo17058l(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            if (!mapFieldLite2.isEmpty()) {
                if (!mapFieldLite.isMutable()) {
                    mapFieldLite = mapFieldLite.mutableCopy();
                }
                mapFieldLite.mergeFrom(mapFieldLite2);
            }
            return mapFieldLite;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: m */
        public eyj0 mo17059m(eyj0 eyj0Var, eyj0 eyj0Var2) {
            return eyj0Var2 == eyj0.m123201c() ? eyj0Var : eyj0.m123202i(eyj0Var, eyj0Var2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: n */
        public C3437l.f mo17060n(C3437l.f fVar, C3437l.f fVar2) {
            C3437l.f fVarMo17143d;
            int size = fVar.size();
            int size2 = fVar2.size();
            C3437l.f fVar3 = fVar;
            fVar3 = fVar;
            if (size > 0 && size2 > 0) {
                if (!fVar.mo17140q()) {
                    fVarMo17143d = fVar;
                    fVarMo17143d = fVar.mo17143d(size2 + size);
                }
                fVarMo17143d = fVar;
                fVarMo17143d.addAll(fVar2);
                fVar3 = fVarMo17143d;
            }
            return size > 0 ? fVar3 : fVar2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: o */
        public <T extends InterfaceC3442q> T mo17061o(T t, T t2) {
            if (t == null || t2 == null) {
                return t != null ? t : t2;
            }
            return (T) t.toBuilder().mergeFrom(t2).build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: p */
        public float mo17062p(boolean z, float f, boolean z2, float f2) {
            return z2 ? f2 : f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: q */
        public C3437l.g mo17063q(C3437l.g gVar, C3437l.g gVar2) {
            C3437l.g gVarMo17143d;
            int size = gVar.size();
            int size2 = gVar2.size();
            C3437l.g gVar3 = gVar;
            gVar3 = gVar;
            if (size > 0 && size2 > 0) {
                if (!gVar.mo17140q()) {
                    gVarMo17143d = gVar;
                    gVarMo17143d = gVar.mo17143d(size2 + size);
                }
                gVarMo17143d = gVar;
                gVarMo17143d.addAll(gVar2);
                gVar3 = gVarMo17143d;
            }
            return size > 0 ? gVar3 : gVar2;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$h */
    public interface InterfaceC3409h {
        /* JADX INFO: renamed from: a */
        C3434i<C3405d> mo17047a(C3434i<C3405d> c3434i, C3434i<C3405d> c3434i2);

        /* JADX INFO: renamed from: b */
        C3437l.e mo17048b(C3437l.e eVar, C3437l.e eVar2);

        /* JADX INFO: renamed from: c */
        void mo17049c(boolean z);

        /* JADX INFO: renamed from: d */
        boolean mo17050d(boolean z, boolean z2, boolean z3, boolean z4);

        /* JADX INFO: renamed from: e */
        int mo17051e(boolean z, int i, boolean z2, int i2);

        /* JADX INFO: renamed from: f */
        String mo17052f(boolean z, String str, boolean z2, String str2);

        /* JADX INFO: renamed from: g */
        <T> C3437l.h<T> mo17053g(C3437l.h<T> hVar, C3437l.h<T> hVar2);

        /* JADX INFO: renamed from: h */
        ByteString mo17054h(boolean z, ByteString byteString, boolean z2, ByteString byteString2);

        /* JADX INFO: renamed from: i */
        long mo17055i(boolean z, long j, boolean z2, long j2);

        /* JADX INFO: renamed from: j */
        double mo17056j(boolean z, double d, boolean z2, double d2);

        /* JADX INFO: renamed from: k */
        Object mo17057k(boolean z, Object obj, Object obj2);

        /* JADX INFO: renamed from: l */
        <K, V> MapFieldLite<K, V> mo17058l(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2);

        /* JADX INFO: renamed from: m */
        eyj0 mo17059m(eyj0 eyj0Var, eyj0 eyj0Var2);

        /* JADX INFO: renamed from: n */
        C3437l.f mo17060n(C3437l.f fVar, C3437l.f fVar2);

        /* JADX INFO: renamed from: o */
        <T extends InterfaceC3442q> T mo17061o(T t, T t2);

        /* JADX INFO: renamed from: p */
        float mo17062p(boolean z, float f, boolean z2, float f2);

        /* JADX INFO: renamed from: q */
        C3437l.g mo17063q(C3437l.g gVar, C3437l.g gVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType, T> C3406e<MessageType, T> checkIsLite(AbstractC3432g<MessageType, T> abstractC3432g) {
        if (abstractC3432g.m17212a()) {
            return (C3406e) abstractC3432g;
        }
        wg3.m206174a("Expected a lite extension.");
        return null;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    public static C3437l.a emptyBooleanList() {
        return C3429d.m17141g();
    }

    public static C3437l.b emptyDoubleList() {
        return C3431f.m17202g();
    }

    public static C3437l.e emptyFloatList() {
        return C3435j.m17243g();
    }

    public static C3437l.f emptyIntList() {
        return C3436k.m17252g();
    }

    public static C3437l.g emptyLongList() {
        return C3440o.m17322g();
    }

    public static <E> C3437l.h<E> emptyProtobufList() {
        return C3444s.m17342c();
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == eyj0.m123201c()) {
            this.unknownFields = eyj0.m123203j();
        }
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
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

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        return t.dynamicMethod(MethodToInvoke.IS_INITIALIZED, Boolean.valueOf(z)) != null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.l$f] */
    public static C3437l.f mutableCopy(C3437l.f fVar) {
        int size = fVar.size();
        return fVar.mo17143d(size == 0 ? 10 : size * 2);
    }

    public static <ContainingType extends InterfaceC3442q, Type> C3406e<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC3442q interfaceC3442q, C3437l.d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new C3406e<>(containingtype, Collections.EMPTY_LIST, interfaceC3442q, new C3405d(dVar, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends InterfaceC3442q, Type> C3406e<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC3442q interfaceC3442q, C3437l.d<?> dVar, int i, WireFormat.FieldType fieldType, Class cls) {
        return new C3406e<>(containingtype, type, interfaceC3442q, new C3405d(dVar, i, fieldType, false, false), cls);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, C3433h.m17213b()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, C3430e.m17155f(inputStream), C3433h.m17213b()));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, C3433h c3433h) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            C3430e c3430eM17155f = C3430e.m17155f(new AbstractC3426a.a.C22797a(inputStream, C3430e.m17152D(i, inputStream)));
            T t2 = (T) parsePartialFrom(t, c3430eM17155f, c3433h);
            try {
                c3430eM17155f.m17183a(0);
                return t2;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(t2);
            }
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C3430e c3430e, C3433h c3433h) throws InvalidProtocolBufferException {
        T t2 = (T) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            t2.dynamicMethod(MethodToInvoke.MERGE_FROM_STREAM, c3430e, c3433h);
            t2.makeImmutable();
            return t2;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw e;
        }
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(obj)) {
            return false;
        }
        try {
            visit(EqualsVisitor.INSTANCE, (GeneratedMessageLite) obj);
            return true;
        } catch (EqualsVisitor.NotEqualsException unused) {
            return false;
        }
    }

    @Override // p153l.lfz
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public final ng60<MessageType> getParserForType() {
        return (ng60) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    public int hashCode(C3407f c3407f) {
        if (this.memoizedHashCode == 0) {
            int i = c3407f.f11585a;
            c3407f.f11585a = 0;
            visit(c3407f, this);
            this.memoizedHashCode = c3407f.f11585a;
            c3407f.f11585a = i;
        }
        return this.memoizedHashCode;
    }

    public void makeImmutable() {
        dynamicMethod(MethodToInvoke.MAKE_IMMUTABLE);
        this.unknownFields.m123206d();
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.m123209g(i, byteString);
    }

    public final void mergeUnknownFields(eyj0 eyj0Var) {
        this.unknownFields = eyj0.m123202i(this.unknownFields, eyj0Var);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.m123210h(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public boolean parseUnknownField(int i, C3430e c3430e) throws IOException {
        if (WireFormat.m17128b(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.m123207e(i, c3430e);
    }

    @Override // com.google.protobuf.InterfaceC3442q
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    public String toString() {
        return C3443r.m17341e(this, super.toString());
    }

    public void visit(InterfaceC3409h interfaceC3409h, MessageType messagetype) {
        dynamicMethod(MethodToInvoke.VISIT, interfaceC3409h, messagetype);
        this.unknownFields = interfaceC3409h.mo17059m(this.unknownFields, messagetype.unknownFields);
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$b */
    public static abstract class AbstractC3403b<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC3403b<MessageType, BuilderType>> extends AbstractC3426a.a<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;
        protected boolean isBuilt = false;

        public AbstractC3403b(MessageType messagetype) {
            this.defaultInstance = messagetype;
            this.instance = (MessageType) messagetype.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        @Override // com.google.protobuf.InterfaceC3442q.a
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractC3426a.a.newUninitializedMessageException(messagetype);
        }

        @Override // com.google.protobuf.InterfaceC3442q.a
        public MessageType buildPartial() {
            boolean z = this.isBuilt;
            MessageType messagetype = this.instance;
            if (z) {
                return messagetype;
            }
            messagetype.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
        public final BuilderType m225044clear() {
            this.instance = (MessageType) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.AbstractC3426a.a
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType mo225046clone() {
            NotifyInfo.C4104b c4104b = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            c4104b.mergeFrom(buildPartial());
            return c4104b;
        }

        public void copyOnWrite() {
            if (this.isBuilt) {
                MessageType messagetype = (MessageType) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                messagetype.visit(C3408g.INSTANCE, this.instance);
                this.instance = messagetype;
                this.isBuilt = false;
            }
        }

        @Override // p153l.lfz
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.AbstractC3426a.a, com.google.protobuf.InterfaceC3442q.a
        public BuilderType mergeFrom(C3430e c3430e, C3433h c3433h) throws IOException {
            copyOnWrite();
            try {
                this.instance.dynamicMethod(MethodToInvoke.MERGE_FROM_STREAM, c3430e, c3433h);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        @Override // p153l.lfz
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // com.google.protobuf.AbstractC3426a.a
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) mergeFrom((GeneratedMessageLite) messagetype);
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            this.instance.visit(C3408g.INSTANCE, messagetype);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$f */
    public static class C3407f implements InterfaceC3409h {

        /* JADX INFO: renamed from: a */
        public int f11585a;

        public C3407f() {
            this.f11585a = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: a */
        public C3434i<C3405d> mo17047a(C3434i<C3405d> c3434i, C3434i<C3405d> c3434i2) {
            this.f11585a = (this.f11585a * 53) + c3434i.hashCode();
            return c3434i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: b */
        public C3437l.e mo17048b(C3437l.e eVar, C3437l.e eVar2) {
            this.f11585a = (this.f11585a * 53) + eVar.hashCode();
            return eVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: c */
        public void mo17049c(boolean z) {
            if (z) {
                wpg0.m207458a();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: d */
        public boolean mo17050d(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f11585a = (this.f11585a * 53) + C3437l.m17262b(z2);
            return z2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: e */
        public int mo17051e(boolean z, int i, boolean z2, int i2) {
            this.f11585a = (this.f11585a * 53) + i;
            return i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: f */
        public String mo17052f(boolean z, String str, boolean z2, String str2) {
            this.f11585a = (this.f11585a * 53) + str.hashCode();
            return str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: g */
        public <T> C3437l.h<T> mo17053g(C3437l.h<T> hVar, C3437l.h<T> hVar2) {
            this.f11585a = (this.f11585a * 53) + hVar.hashCode();
            return hVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: h */
        public ByteString mo17054h(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            this.f11585a = (this.f11585a * 53) + byteString.hashCode();
            return byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: i */
        public long mo17055i(boolean z, long j, boolean z2, long j2) {
            this.f11585a = (this.f11585a * 53) + C3437l.m17265e(j);
            return j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: j */
        public double mo17056j(boolean z, double d, boolean z2, double d2) {
            this.f11585a = (this.f11585a * 53) + C3437l.m17265e(Double.doubleToLongBits(d));
            return d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: k */
        public Object mo17057k(boolean z, Object obj, Object obj2) {
            return mo17061o((InterfaceC3442q) obj, (InterfaceC3442q) obj2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: l */
        public <K, V> MapFieldLite<K, V> mo17058l(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            this.f11585a = (this.f11585a * 53) + mapFieldLite.hashCode();
            return mapFieldLite;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: m */
        public eyj0 mo17059m(eyj0 eyj0Var, eyj0 eyj0Var2) {
            this.f11585a = (this.f11585a * 53) + eyj0Var.hashCode();
            return eyj0Var;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: n */
        public C3437l.f mo17060n(C3437l.f fVar, C3437l.f fVar2) {
            this.f11585a = (this.f11585a * 53) + fVar.hashCode();
            return fVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: o */
        public <T extends InterfaceC3442q> T mo17061o(T t, T t2) {
            int iHashCode;
            if (t != null) {
                iHashCode = t instanceof GeneratedMessageLite ? ((GeneratedMessageLite) t).hashCode(this) : t.hashCode();
            } else {
                iHashCode = 37;
            }
            this.f11585a = (this.f11585a * 53) + iHashCode;
            return t;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: p */
        public float mo17062p(boolean z, float f, boolean z2, float f2) {
            this.f11585a = (this.f11585a * 53) + Float.floatToIntBits(f);
            return f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3409h
        /* JADX INFO: renamed from: q */
        public C3437l.g mo17063q(C3437l.g gVar, C3437l.g gVar2) {
            this.f11585a = (this.f11585a * 53) + gVar.hashCode();
            return gVar;
        }

        public /* synthetic */ C3407f(C3402a c3402a) {
            this();
        }
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> void makeImmutable(T t) {
        t.dynamicMethod(MethodToInvoke.MAKE_IMMUTABLE);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, C3433h c3433h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, c3433h));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.l$g] */
    public static C3437l.g mutableCopy(C3437l.g gVar) {
        int size = gVar.size();
        return gVar.mo17143d(size == 0 ? 10 : size * 2);
    }

    @Override // p153l.lfz
    public final boolean isInitialized() {
        return dynamicMethod(MethodToInvoke.IS_INITIALIZED, Boolean.TRUE) != null;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, c3433h));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.l$e] */
    public static C3437l.e mutableCopy(C3437l.e eVar) {
        int size = eVar.size();
        return eVar.mo17143d(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, C3433h.m17213b()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.l$b] */
    public static C3437l.b mutableCopy(C3437l.b bVar) {
        int size = bVar.size();
        return bVar.mo17143d(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, c3433h));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, byteString, C3433h.m17213b()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.l$a] */
    public static C3437l.a mutableCopy(C3437l.a aVar) {
        int size = aVar.size();
        return aVar.mo17143d(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, C3433h c3433h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, C3430e.m17155f(inputStream), c3433h));
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements lfz {
        protected C3434i<C3405d> extensions = C3434i.m17221v();

        private void verifyExtensionContainingType(C3406e<MessageType, ?> c3406e) {
            if (c3406e.m17073c() == getDefaultInstanceForType()) {
                return;
            }
            wg3.m206174a("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.m17236p();
        }

        public int extensionsSerializedSize() {
            return this.extensions.m17233l();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.m17229h();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, p153l.lfz
        public /* bridge */ /* synthetic */ InterfaceC3442q getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public final <Type> Type getExtension(AbstractC3432g<MessageType, Type> abstractC3432g) {
            C3406e<MessageType, ?> c3406eCheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3432g);
            verifyExtensionContainingType(c3406eCheckIsLite);
            Object objM17228g = this.extensions.m17228g(c3406eCheckIsLite.f11584d);
            return objM17228g == null ? c3406eCheckIsLite.f11582b : (Type) c3406eCheckIsLite.m17072b(objM17228g);
        }

        public final <Type> int getExtensionCount(AbstractC3432g<MessageType, List<Type>> abstractC3432g) {
            C3406e<MessageType, ?> c3406eCheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3432g);
            verifyExtensionContainingType(c3406eCheckIsLite);
            return this.extensions.m17232k(c3406eCheckIsLite.f11584d);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public abstract /* synthetic */ int getSerializedSize();

        public final <Type> boolean hasExtension(AbstractC3432g<MessageType, Type> abstractC3432g) {
            C3406e<MessageType, ?> c3406eCheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3432g);
            verifyExtensionContainingType(c3406eCheckIsLite);
            return this.extensions.m17234n(c3406eCheckIsLite.f11584d);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final void makeImmutable() {
            super.makeImmutable();
            this.extensions.m17239s();
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.m17235o()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.m17240t(messagetype.extensions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.InterfaceC3442q
        public /* bridge */ /* synthetic */ InterfaceC3442q.a newBuilderForType() {
            return super.newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.C3401a newExtensionWriter() {
            return new C3401a(this, false, null);
        }

        public ExtendableMessage<MessageType, BuilderType>.C3401a newMessageSetExtensionWriter() {
            return new C3401a(this, true, null);
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0010  */
        public <MessageType extends InterfaceC3442q> boolean parseUnknownField(MessageType messagetype, C3430e c3430e, C3433h c3433h, int i) throws IOException {
            boolean z;
            boolean z2;
            Object objBuild;
            InterfaceC3442q interfaceC3442q;
            int iM17128b = WireFormat.m17128b(i);
            int iM17127a = WireFormat.m17127a(i);
            C3406e c3406eM17215a = c3433h.m17215a(messagetype, iM17127a);
            if (c3406eM17215a == null) {
                z2 = true;
                z = false;
            } else if (iM17128b == C3434i.m17220m(c3406eM17215a.f11584d.mo17067D(), false)) {
                z2 = false;
                z = false;
            } else {
                C3405d c3405d = c3406eM17215a.f11584d;
                if (c3405d.f11579d && c3405d.f11578c.isPackable() && iM17128b == C3434i.m17220m(c3406eM17215a.f11584d.mo17067D(), true)) {
                    z = true;
                    z2 = false;
                } else {
                    z2 = true;
                    z = false;
                }
            }
            if (z2) {
                return parseUnknownField(i, c3430e);
            }
            if (z) {
                int iM17187l = c3430e.m17187l(c3430e.m17162C());
                if (c3406eM17215a.f11584d.mo17067D() == WireFormat.FieldType.ENUM) {
                    while (c3430e.m17184d() > 0) {
                        C3437l.c cVarFindValueByNumber = c3406eM17215a.f11584d.m17070b().findValueByNumber(c3430e.m17191p());
                        if (cVarFindValueByNumber == null) {
                            return true;
                        }
                        this.extensions.m17225a(c3406eM17215a.f11584d, c3406eM17215a.m17077g(cVarFindValueByNumber));
                    }
                } else {
                    while (c3430e.m17184d() > 0) {
                        this.extensions.m17225a(c3406eM17215a.f11584d, C3434i.m17222w(c3430e, c3406eM17215a.f11584d.mo17067D(), false));
                    }
                }
                c3430e.m17186k(iM17187l);
            } else {
                int i2 = C3402a.f11574a[c3406eM17215a.f11584d.mo17068E().ordinal()];
                if (i2 == 1) {
                    InterfaceC3442q.a builder = (c3406eM17215a.f11584d.isRepeated() || (interfaceC3442q = (InterfaceC3442q) this.extensions.m17228g(c3406eM17215a.f11584d)) == null) ? null : interfaceC3442q.toBuilder();
                    if (builder == null) {
                        builder = c3406eM17215a.m17074d().newBuilderForType();
                    }
                    if (c3406eM17215a.f11584d.mo17067D() == WireFormat.FieldType.GROUP) {
                        c3430e.m17195t(c3406eM17215a.m17075e(), builder, c3433h);
                    } else {
                        c3430e.m17199x(builder, c3433h);
                    }
                    objBuild = builder.build();
                } else if (i2 != 2) {
                    objBuild = C3434i.m17222w(c3430e, c3406eM17215a.f11584d.mo17067D(), false);
                } else {
                    int iM17191p = c3430e.m17191p();
                    C3437l.c cVarFindValueByNumber2 = c3406eM17215a.f11584d.m17070b().findValueByNumber(iM17191p);
                    if (cVarFindValueByNumber2 == null) {
                        mergeVarintField(iM17127a, iM17191p);
                        return true;
                    }
                    objBuild = cVarFindValueByNumber2;
                }
                boolean zIsRepeated = c3406eM17215a.f11584d.isRepeated();
                C3434i<C3405d> c3434i = this.extensions;
                if (zIsRepeated) {
                    c3434i.m17225a(c3406eM17215a.f11584d, c3406eM17215a.m17077g(objBuild));
                } else {
                    c3434i.m17242x(c3406eM17215a.f11584d, c3406eM17215a.m17077g(objBuild));
                }
            }
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.InterfaceC3442q
        public /* bridge */ /* synthetic */ InterfaceC3442q.a toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final void visit(InterfaceC3409h interfaceC3409h, MessageType messagetype) {
            super.visit(interfaceC3409h, messagetype);
            this.extensions = interfaceC3409h.mo17047a(this.extensions, messagetype.extensions);
        }

        @Override // com.google.protobuf.InterfaceC3442q
        public abstract /* synthetic */ void writeTo(CodedOutputStream codedOutputStream) throws IOException;

        public final <Type> Type getExtension(AbstractC3432g<MessageType, List<Type>> abstractC3432g, int i) {
            C3406e<MessageType, ?> c3406eCheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3432g);
            verifyExtensionContainingType(c3406eCheckIsLite);
            return (Type) c3406eCheckIsLite.m17076f(this.extensions.m17231j(c3406eCheckIsLite.f11584d, i));
        }

        /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$ExtendableMessage$a */
        public class C3401a {

            /* JADX INFO: renamed from: a */
            public final Iterator<Map.Entry<C3405d, Object>> f11570a;

            /* JADX INFO: renamed from: b */
            public Map.Entry<C3405d, Object> f11571b;

            /* JADX INFO: renamed from: c */
            public final boolean f11572c;

            public C3401a(boolean z) {
                Iterator itM17238r = ExtendableMessage.this.extensions.m17238r();
                this.f11570a = itM17238r;
                if (itM17238r.hasNext()) {
                    this.f11571b = (Map.Entry) itM17238r.next();
                }
                this.f11572c = z;
            }

            public /* synthetic */ C3401a(ExtendableMessage extendableMessage, boolean z, C3402a c3402a) {
                this(z);
            }
        }
    }

    public static <E> C3437l.h<E> mutableCopy(C3437l.h<E> hVar) {
        int size = hVar.size();
        return hVar.mo17143d(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C3430e c3430e) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, c3430e, C3433h.m17213b());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C3430e c3430e, C3433h c3433h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, c3430e, c3433h));
    }

    public int hashCode() {
        if (this.memoizedHashCode == 0) {
            C3407f c3407f = new C3407f(null);
            visit(c3407f, this);
            this.memoizedHashCode = c3407f.f11585a;
        }
        return this.memoizedHashCode;
    }

    public boolean equals(EqualsVisitor equalsVisitor, InterfaceC3442q interfaceC3442q) {
        if (this == interfaceC3442q) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(interfaceC3442q)) {
            return false;
        }
        visit(equalsVisitor, (GeneratedMessageLite) interfaceC3442q);
        return true;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C3430e c3430e) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, c3430e, C3433h.m17213b());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, ByteString byteString, C3433h c3433h) throws InvalidProtocolBufferException {
        C3430e c3430eNewCodedInput = byteString.newCodedInput();
        T t2 = (T) parsePartialFrom(t, c3430eNewCodedInput, c3433h);
        try {
            c3430eNewCodedInput.m17183a(0);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, C3433h c3433h) throws InvalidProtocolBufferException {
        C3430e c3430eM17157h = C3430e.m17157h(bArr);
        T t2 = (T) parsePartialFrom(t, c3430eM17157h, c3433h);
        try {
            c3430eM17157h.m17183a(0);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }
}
