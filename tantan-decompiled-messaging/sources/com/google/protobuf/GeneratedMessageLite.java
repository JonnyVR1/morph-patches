package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.AbstractC3380b;
import com.immomo.push.p040pb.NotifyInfo;
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
import p149l.bpj0;
import p149l.i860;
import p149l.ig3;
import p149l.o6z;
import p149l.ohg0;
import p149l.pkq0;
import p149l.zmc0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC3380b<MessageType, BuilderType>> extends AbstractC3403a<MessageType, BuilderType> {
    protected bpj0 unknownFields = bpj0.m103067c();
    protected int memoizedSerializedSize = -1;

    public static class EqualsVisitor implements InterfaceC3386h {
        static final EqualsVisitor INSTANCE = new EqualsVisitor();

        /* JADX INFO: renamed from: a */
        public static final NotEqualsException f11532a = new NotEqualsException();

        public static final class NotEqualsException extends RuntimeException {
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: a */
        public C3411i<C3382d> mo16992a(C3411i<C3382d> c3411i, C3411i<C3382d> c3411i2) {
            if (c3411i.equals(c3411i2)) {
                return c3411i;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: b */
        public C3414l.e mo16993b(C3414l.e eVar, C3414l.e eVar2) {
            if (eVar.equals(eVar2)) {
                return eVar;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: c */
        public void mo16994c(boolean z) {
            if (z) {
                throw f11532a;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: d */
        public boolean mo16995d(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: e */
        public int mo16996e(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: f */
        public String mo16997f(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: g */
        public <T> C3414l.h<T> mo16998g(C3414l.h<T> hVar, C3414l.h<T> hVar2) {
            if (hVar.equals(hVar2)) {
                return hVar;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: h */
        public ByteString mo16999h(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            if (z == z2 && byteString.equals(byteString2)) {
                return byteString;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: i */
        public long mo17000i(boolean z, long j, boolean z2, long j2) {
            if (z == z2 && j == j2) {
                return j;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: j */
        public double mo17001j(boolean z, double d, boolean z2, double d2) {
            if (z == z2 && d == d2) {
                return d;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: k */
        public Object mo17002k(boolean z, Object obj, Object obj2) {
            if (z && ((GeneratedMessageLite) obj).equals(this, (InterfaceC3419q) obj2)) {
                return obj;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: l */
        public <K, V> MapFieldLite<K, V> mo17003l(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            if (mapFieldLite.equals(mapFieldLite2)) {
                return mapFieldLite;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: m */
        public bpj0 mo17004m(bpj0 bpj0Var, bpj0 bpj0Var2) {
            if (bpj0Var.equals(bpj0Var2)) {
                return bpj0Var;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: n */
        public C3414l.f mo17005n(C3414l.f fVar, C3414l.f fVar2) {
            if (fVar.equals(fVar2)) {
                return fVar;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: o */
        public <T extends InterfaceC3419q> T mo17006o(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw f11532a;
            }
            ((GeneratedMessageLite) t).equals(this, t2);
            return t;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: p */
        public float mo17007p(boolean z, float f, boolean z2, float f2) {
            if (z == z2 && f == f2) {
                return f;
            }
            throw f11532a;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: q */
        public C3414l.g mo17008q(C3414l.g gVar, C3414l.g gVar2) {
            if (gVar.equals(gVar2)) {
                return gVar;
            }
            throw f11532a;
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

        public SerializedForm(InterfaceC3419q interfaceC3419q) {
            this.messageClassName = interfaceC3419q.getClass().getName();
            this.asBytes = interfaceC3419q.toByteArray();
        }

        /* JADX INFO: renamed from: of */
        public static SerializedForm m17009of(InterfaceC3419q interfaceC3419q) {
            return new SerializedForm(interfaceC3419q);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                Field declaredField = Class.forName(this.messageClassName).getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((InterfaceC3419q) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
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

        public Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = Class.forName(this.messageClassName).getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((InterfaceC3419q) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
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

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$a */
    public static /* synthetic */ class C3379a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11537a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f11537a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11537a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$c */
    public static class C3381c<T extends GeneratedMessageLite<T, ?>> extends AbstractC3404b<T> {

        /* JADX INFO: renamed from: b */
        public T f11538b;

        public C3381c(T t) {
            this.f11538b = t;
        }

        @Override // p149l.i860
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public T mo17010c(C3407e c3407e, C3410h c3410h) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.parsePartialFrom(this.f11538b, c3407e, c3410h);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$d */
    public static final class C3382d implements C3411i.b<C3382d> {

        /* JADX INFO: renamed from: a */
        public final C3414l.d<?> f11539a;

        /* JADX INFO: renamed from: b */
        public final int f11540b;

        /* JADX INFO: renamed from: c */
        public final WireFormat.FieldType f11541c;

        /* JADX INFO: renamed from: d */
        public final boolean f11542d;

        /* JADX INFO: renamed from: e */
        public final boolean f11543e;

        public C3382d(C3414l.d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f11539a = dVar;
            this.f11540b = i;
            this.f11541c = fieldType;
            this.f11542d = z;
            this.f11543e = z2;
        }

        @Override // com.google.protobuf.C3411i.b
        /* JADX INFO: renamed from: D */
        public WireFormat.FieldType mo17012D() {
            return this.f11541c;
        }

        @Override // com.google.protobuf.C3411i.b
        /* JADX INFO: renamed from: E */
        public WireFormat.JavaType mo17013E() {
            return this.f11541c.getJavaType();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C3382d c3382d) {
            return this.f11540b - c3382d.f11540b;
        }

        /* JADX INFO: renamed from: b */
        public C3414l.d<?> m17015b() {
            return this.f11539a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.C3411i.b
        /* JADX INFO: renamed from: c */
        public InterfaceC3419q.a mo17016c(InterfaceC3419q.a aVar, InterfaceC3419q interfaceC3419q) {
            return ((AbstractC3380b) aVar).mergeFrom((GeneratedMessageLite) interfaceC3419q);
        }

        @Override // com.google.protobuf.C3411i.b
        public int getNumber() {
            return this.f11540b;
        }

        @Override // com.google.protobuf.C3411i.b
        public boolean isPacked() {
            return this.f11543e;
        }

        @Override // com.google.protobuf.C3411i.b
        public boolean isRepeated() {
            return this.f11542d;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$e */
    public static class C3383e<ContainingType extends InterfaceC3419q, Type> extends AbstractC3409g<ContainingType, Type> {

        /* JADX INFO: renamed from: a */
        public final ContainingType f11544a;

        /* JADX INFO: renamed from: b */
        public final Type f11545b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC3419q f11546c;

        /* JADX INFO: renamed from: d */
        public final C3382d f11547d;

        public C3383e(ContainingType containingtype, Type type, InterfaceC3419q interfaceC3419q, C3382d c3382d, Class cls) {
            if (containingtype == null) {
                ig3.m135964a("Null containingTypeDefaultInstance");
                throw null;
            }
            if (c3382d.mo17012D() == WireFormat.FieldType.MESSAGE && interfaceC3419q == null) {
                ig3.m135964a("Null messageDefaultInstance");
                throw null;
            }
            this.f11544a = containingtype;
            this.f11545b = type;
            this.f11546c = interfaceC3419q;
            this.f11547d = c3382d;
        }

        /* JADX INFO: renamed from: b */
        public Object m17017b(Object obj) {
            if (!this.f11547d.isRepeated()) {
                return m17021f(obj);
            }
            if (this.f11547d.mo17013E() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(m17021f(it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: c */
        public ContainingType m17018c() {
            return this.f11544a;
        }

        /* JADX INFO: renamed from: d */
        public InterfaceC3419q m17019d() {
            return this.f11546c;
        }

        /* JADX INFO: renamed from: e */
        public int m17020e() {
            return this.f11547d.getNumber();
        }

        /* JADX INFO: renamed from: f */
        public Object m17021f(Object obj) {
            return this.f11547d.mo17013E() == WireFormat.JavaType.ENUM ? this.f11547d.f11539a.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        /* JADX INFO: renamed from: g */
        public Object m17022g(Object obj) {
            return this.f11547d.mo17013E() == WireFormat.JavaType.ENUM ? Integer.valueOf(((C3414l.c) obj).getNumber()) : obj;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$g */
    public static class C3385g implements InterfaceC3386h {
        public static final C3385g INSTANCE = new C3385g();

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: a */
        public C3411i<C3382d> mo16992a(C3411i<C3382d> c3411i, C3411i<C3382d> c3411i2) {
            if (c3411i.m17180o()) {
                c3411i = c3411i.clone();
            }
            c3411i.m17185t(c3411i2);
            return c3411i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: b */
        public C3414l.e mo16993b(C3414l.e eVar, C3414l.e eVar2) {
            C3414l.e eVarMo17088d;
            int size = eVar.size();
            int size2 = eVar2.size();
            C3414l.e eVar3 = eVar;
            eVar3 = eVar;
            if (size > 0 && size2 > 0) {
                if (!eVar.mo17085q()) {
                    eVarMo17088d = eVar;
                    eVarMo17088d = eVar.mo17088d(size2 + size);
                }
                eVarMo17088d = eVar;
                eVarMo17088d.addAll(eVar2);
                eVar3 = eVarMo17088d;
            }
            return size > 0 ? eVar3 : eVar2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: c */
        public void mo16994c(boolean z) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: d */
        public boolean mo16995d(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: e */
        public int mo16996e(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: f */
        public String mo16997f(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: g */
        public <T> C3414l.h<T> mo16998g(C3414l.h<T> hVar, C3414l.h<T> hVar2) {
            int size = hVar.size();
            int size2 = hVar2.size();
            if (size > 0 && size2 > 0) {
                if (!hVar.mo17085q()) {
                    hVar = hVar.mo17088d(size2 + size);
                }
                hVar.addAll(hVar2);
            }
            return size > 0 ? hVar : hVar2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: h */
        public ByteString mo16999h(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            return z2 ? byteString2 : byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: i */
        public long mo17000i(boolean z, long j, boolean z2, long j2) {
            return z2 ? j2 : j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: j */
        public double mo17001j(boolean z, double d, boolean z2, double d2) {
            return z2 ? d2 : d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: k */
        public Object mo17002k(boolean z, Object obj, Object obj2) {
            return z ? mo17006o((InterfaceC3419q) obj, (InterfaceC3419q) obj2) : obj2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: l */
        public <K, V> MapFieldLite<K, V> mo17003l(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            if (!mapFieldLite2.isEmpty()) {
                if (!mapFieldLite.isMutable()) {
                    mapFieldLite = mapFieldLite.mutableCopy();
                }
                mapFieldLite.mergeFrom(mapFieldLite2);
            }
            return mapFieldLite;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: m */
        public bpj0 mo17004m(bpj0 bpj0Var, bpj0 bpj0Var2) {
            return bpj0Var2 == bpj0.m103067c() ? bpj0Var : bpj0.m103068i(bpj0Var, bpj0Var2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: n */
        public C3414l.f mo17005n(C3414l.f fVar, C3414l.f fVar2) {
            C3414l.f fVarMo17088d;
            int size = fVar.size();
            int size2 = fVar2.size();
            C3414l.f fVar3 = fVar;
            fVar3 = fVar;
            if (size > 0 && size2 > 0) {
                if (!fVar.mo17085q()) {
                    fVarMo17088d = fVar;
                    fVarMo17088d = fVar.mo17088d(size2 + size);
                }
                fVarMo17088d = fVar;
                fVarMo17088d.addAll(fVar2);
                fVar3 = fVarMo17088d;
            }
            return size > 0 ? fVar3 : fVar2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: o */
        public <T extends InterfaceC3419q> T mo17006o(T t, T t2) {
            if (t == null || t2 == null) {
                return t != null ? t : t2;
            }
            return (T) t.toBuilder().mergeFrom(t2).build();
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: p */
        public float mo17007p(boolean z, float f, boolean z2, float f2) {
            return z2 ? f2 : f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: q */
        public C3414l.g mo17008q(C3414l.g gVar, C3414l.g gVar2) {
            C3414l.g gVarMo17088d;
            int size = gVar.size();
            int size2 = gVar2.size();
            C3414l.g gVar3 = gVar;
            gVar3 = gVar;
            if (size > 0 && size2 > 0) {
                if (!gVar.mo17085q()) {
                    gVarMo17088d = gVar;
                    gVarMo17088d = gVar.mo17088d(size2 + size);
                }
                gVarMo17088d = gVar;
                gVarMo17088d.addAll(gVar2);
                gVar3 = gVarMo17088d;
            }
            return size > 0 ? gVar3 : gVar2;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$h */
    public interface InterfaceC3386h {
        /* JADX INFO: renamed from: a */
        C3411i<C3382d> mo16992a(C3411i<C3382d> c3411i, C3411i<C3382d> c3411i2);

        /* JADX INFO: renamed from: b */
        C3414l.e mo16993b(C3414l.e eVar, C3414l.e eVar2);

        /* JADX INFO: renamed from: c */
        void mo16994c(boolean z);

        /* JADX INFO: renamed from: d */
        boolean mo16995d(boolean z, boolean z2, boolean z3, boolean z4);

        /* JADX INFO: renamed from: e */
        int mo16996e(boolean z, int i, boolean z2, int i2);

        /* JADX INFO: renamed from: f */
        String mo16997f(boolean z, String str, boolean z2, String str2);

        /* JADX INFO: renamed from: g */
        <T> C3414l.h<T> mo16998g(C3414l.h<T> hVar, C3414l.h<T> hVar2);

        /* JADX INFO: renamed from: h */
        ByteString mo16999h(boolean z, ByteString byteString, boolean z2, ByteString byteString2);

        /* JADX INFO: renamed from: i */
        long mo17000i(boolean z, long j, boolean z2, long j2);

        /* JADX INFO: renamed from: j */
        double mo17001j(boolean z, double d, boolean z2, double d2);

        /* JADX INFO: renamed from: k */
        Object mo17002k(boolean z, Object obj, Object obj2);

        /* JADX INFO: renamed from: l */
        <K, V> MapFieldLite<K, V> mo17003l(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2);

        /* JADX INFO: renamed from: m */
        bpj0 mo17004m(bpj0 bpj0Var, bpj0 bpj0Var2);

        /* JADX INFO: renamed from: n */
        C3414l.f mo17005n(C3414l.f fVar, C3414l.f fVar2);

        /* JADX INFO: renamed from: o */
        <T extends InterfaceC3419q> T mo17006o(T t, T t2);

        /* JADX INFO: renamed from: p */
        float mo17007p(boolean z, float f, boolean z2, float f2);

        /* JADX INFO: renamed from: q */
        C3414l.g mo17008q(C3414l.g gVar, C3414l.g gVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType, T> C3383e<MessageType, T> checkIsLite(AbstractC3409g<MessageType, T> abstractC3409g) {
        if (abstractC3409g.m17157a()) {
            return (C3383e) abstractC3409g;
        }
        ig3.m135964a("Expected a lite extension.");
        return null;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    public static C3414l.a emptyBooleanList() {
        return C3406d.m17086g();
    }

    public static C3414l.b emptyDoubleList() {
        return C3408f.m17147g();
    }

    public static C3414l.e emptyFloatList() {
        return C3412j.m17188g();
    }

    public static C3414l.f emptyIntList() {
        return C3413k.m17197g();
    }

    public static C3414l.g emptyLongList() {
        return C3417o.m17267g();
    }

    public static <E> C3414l.h<E> emptyProtobufList() {
        return C3421s.m17287c();
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == bpj0.m103067c()) {
            this.unknownFields = bpj0.m103069j();
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

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        return t.dynamicMethod(MethodToInvoke.IS_INITIALIZED, Boolean.valueOf(z)) != null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.l$f] */
    public static C3414l.f mutableCopy(C3414l.f fVar) {
        int size = fVar.size();
        return fVar.mo17088d(size == 0 ? 10 : size * 2);
    }

    public static <ContainingType extends InterfaceC3419q, Type> C3383e<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC3419q interfaceC3419q, C3414l.d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new C3383e<>(containingtype, Collections.EMPTY_LIST, interfaceC3419q, new C3382d(dVar, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends InterfaceC3419q, Type> C3383e<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC3419q interfaceC3419q, C3414l.d<?> dVar, int i, WireFormat.FieldType fieldType, Class cls) {
        return new C3383e<>(containingtype, type, interfaceC3419q, new C3382d(dVar, i, fieldType, false, false), cls);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, C3410h.m17158b()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, C3407e.m17100f(inputStream), C3410h.m17158b()));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, C3410h c3410h) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            C3407e c3407eM17100f = C3407e.m17100f(new AbstractC3403a.a.C22681a(inputStream, C3407e.m17097D(i, inputStream)));
            T t2 = (T) parsePartialFrom(t, c3407eM17100f, c3410h);
            try {
                c3407eM17100f.m17128a(0);
                return t2;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(t2);
            }
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C3407e c3407e, C3410h c3410h) throws InvalidProtocolBufferException {
        T t2 = (T) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            t2.dynamicMethod(MethodToInvoke.MERGE_FROM_STREAM, c3407e, c3410h);
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

    @Override // p149l.o6z
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public final i860<MessageType> getParserForType() {
        return (i860) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    public int hashCode(C3384f c3384f) {
        if (this.memoizedHashCode == 0) {
            int i = c3384f.f11548a;
            c3384f.f11548a = 0;
            visit(c3384f, this);
            this.memoizedHashCode = c3384f.f11548a;
            c3384f.f11548a = i;
        }
        return this.memoizedHashCode;
    }

    public void makeImmutable() {
        dynamicMethod(MethodToInvoke.MAKE_IMMUTABLE);
        this.unknownFields.m103072d();
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.m103075g(i, byteString);
    }

    public final void mergeUnknownFields(bpj0 bpj0Var) {
        this.unknownFields = bpj0.m103068i(this.unknownFields, bpj0Var);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.m103076h(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public boolean parseUnknownField(int i, C3407e c3407e) throws IOException {
        if (WireFormat.m17073b(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.m103073e(i, c3407e);
    }

    @Override // com.google.protobuf.InterfaceC3419q
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    public String toString() {
        return C3420r.m17286e(this, super.toString());
    }

    public void visit(InterfaceC3386h interfaceC3386h, MessageType messagetype) {
        dynamicMethod(MethodToInvoke.VISIT, interfaceC3386h, messagetype);
        this.unknownFields = interfaceC3386h.mo17004m(this.unknownFields, messagetype.unknownFields);
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$b */
    public static abstract class AbstractC3380b<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC3380b<MessageType, BuilderType>> extends AbstractC3403a.a<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;
        protected boolean isBuilt = false;

        public AbstractC3380b(MessageType messagetype) {
            this.defaultInstance = messagetype;
            this.instance = (MessageType) messagetype.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        @Override // com.google.protobuf.InterfaceC3419q.a
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractC3403a.a.newUninitializedMessageException(messagetype);
        }

        @Override // com.google.protobuf.InterfaceC3419q.a
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
        public final BuilderType m223798clear() {
            this.instance = (MessageType) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.AbstractC3403a.a
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType mo223800clone() {
            NotifyInfo.C3953b c3953b = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            c3953b.mergeFrom(buildPartial());
            return c3953b;
        }

        public void copyOnWrite() {
            if (this.isBuilt) {
                MessageType messagetype = (MessageType) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                messagetype.visit(C3385g.INSTANCE, this.instance);
                this.instance = messagetype;
                this.isBuilt = false;
            }
        }

        @Override // p149l.o6z
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.AbstractC3403a.a, com.google.protobuf.InterfaceC3419q.a
        public BuilderType mergeFrom(C3407e c3407e, C3410h c3410h) throws IOException {
            copyOnWrite();
            try {
                this.instance.dynamicMethod(MethodToInvoke.MERGE_FROM_STREAM, c3407e, c3410h);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        @Override // p149l.o6z
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // com.google.protobuf.AbstractC3403a.a
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) mergeFrom((GeneratedMessageLite) messagetype);
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            this.instance.visit(C3385g.INSTANCE, messagetype);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$f */
    public static class C3384f implements InterfaceC3386h {

        /* JADX INFO: renamed from: a */
        public int f11548a;

        public C3384f() {
            this.f11548a = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: a */
        public C3411i<C3382d> mo16992a(C3411i<C3382d> c3411i, C3411i<C3382d> c3411i2) {
            this.f11548a = (this.f11548a * 53) + c3411i.hashCode();
            return c3411i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: b */
        public C3414l.e mo16993b(C3414l.e eVar, C3414l.e eVar2) {
            this.f11548a = (this.f11548a * 53) + eVar.hashCode();
            return eVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: c */
        public void mo16994c(boolean z) {
            if (z) {
                ohg0.m164364a();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: d */
        public boolean mo16995d(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f11548a = (this.f11548a * 53) + C3414l.m17207b(z2);
            return z2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: e */
        public int mo16996e(boolean z, int i, boolean z2, int i2) {
            this.f11548a = (this.f11548a * 53) + i;
            return i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: f */
        public String mo16997f(boolean z, String str, boolean z2, String str2) {
            this.f11548a = (this.f11548a * 53) + str.hashCode();
            return str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: g */
        public <T> C3414l.h<T> mo16998g(C3414l.h<T> hVar, C3414l.h<T> hVar2) {
            this.f11548a = (this.f11548a * 53) + hVar.hashCode();
            return hVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: h */
        public ByteString mo16999h(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            this.f11548a = (this.f11548a * 53) + byteString.hashCode();
            return byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: i */
        public long mo17000i(boolean z, long j, boolean z2, long j2) {
            this.f11548a = (this.f11548a * 53) + C3414l.m17210e(j);
            return j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: j */
        public double mo17001j(boolean z, double d, boolean z2, double d2) {
            this.f11548a = (this.f11548a * 53) + C3414l.m17210e(Double.doubleToLongBits(d));
            return d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: k */
        public Object mo17002k(boolean z, Object obj, Object obj2) {
            return mo17006o((InterfaceC3419q) obj, (InterfaceC3419q) obj2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: l */
        public <K, V> MapFieldLite<K, V> mo17003l(MapFieldLite<K, V> mapFieldLite, MapFieldLite<K, V> mapFieldLite2) {
            this.f11548a = (this.f11548a * 53) + mapFieldLite.hashCode();
            return mapFieldLite;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: m */
        public bpj0 mo17004m(bpj0 bpj0Var, bpj0 bpj0Var2) {
            this.f11548a = (this.f11548a * 53) + bpj0Var.hashCode();
            return bpj0Var;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: n */
        public C3414l.f mo17005n(C3414l.f fVar, C3414l.f fVar2) {
            this.f11548a = (this.f11548a * 53) + fVar.hashCode();
            return fVar;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: o */
        public <T extends InterfaceC3419q> T mo17006o(T t, T t2) {
            int iHashCode;
            if (t != null) {
                iHashCode = t instanceof GeneratedMessageLite ? ((GeneratedMessageLite) t).hashCode(this) : t.hashCode();
            } else {
                iHashCode = 37;
            }
            this.f11548a = (this.f11548a * 53) + iHashCode;
            return t;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: p */
        public float mo17007p(boolean z, float f, boolean z2, float f2) {
            this.f11548a = (this.f11548a * 53) + Float.floatToIntBits(f);
            return f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.InterfaceC3386h
        /* JADX INFO: renamed from: q */
        public C3414l.g mo17008q(C3414l.g gVar, C3414l.g gVar2) {
            this.f11548a = (this.f11548a * 53) + gVar.hashCode();
            return gVar;
        }

        public /* synthetic */ C3384f(C3379a c3379a) {
            this();
        }
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> void makeImmutable(T t) {
        t.dynamicMethod(MethodToInvoke.MAKE_IMMUTABLE);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, C3410h c3410h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, c3410h));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.l$g] */
    public static C3414l.g mutableCopy(C3414l.g gVar) {
        int size = gVar.size();
        return gVar.mo17088d(size == 0 ? 10 : size * 2);
    }

    @Override // p149l.o6z
    public final boolean isInitialized() {
        return dynamicMethod(MethodToInvoke.IS_INITIALIZED, Boolean.TRUE) != null;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, c3410h));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.l$e] */
    public static C3414l.e mutableCopy(C3414l.e eVar) {
        int size = eVar.size();
        return eVar.mo17088d(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, C3410h.m17158b()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.l$b] */
    public static C3414l.b mutableCopy(C3414l.b bVar) {
        int size = bVar.size();
        return bVar.mo17088d(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, c3410h));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, byteString, C3410h.m17158b()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.l$a] */
    public static C3414l.a mutableCopy(C3414l.a aVar) {
        int size = aVar.size();
        return aVar.mo17088d(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, C3410h c3410h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, C3407e.m17100f(inputStream), c3410h));
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements o6z {
        protected C3411i<C3382d> extensions = C3411i.m17166v();

        private void verifyExtensionContainingType(C3383e<MessageType, ?> c3383e) {
            if (c3383e.m17018c() == getDefaultInstanceForType()) {
                return;
            }
            ig3.m135964a("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.m17181p();
        }

        public int extensionsSerializedSize() {
            return this.extensions.m17178l();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.m17174h();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, p149l.o6z
        public /* bridge */ /* synthetic */ InterfaceC3419q getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public final <Type> Type getExtension(AbstractC3409g<MessageType, Type> abstractC3409g) {
            C3383e<MessageType, ?> c3383eCheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3409g);
            verifyExtensionContainingType(c3383eCheckIsLite);
            Object objM17173g = this.extensions.m17173g(c3383eCheckIsLite.f11547d);
            return objM17173g == null ? c3383eCheckIsLite.f11545b : (Type) c3383eCheckIsLite.m17017b(objM17173g);
        }

        public final <Type> int getExtensionCount(AbstractC3409g<MessageType, List<Type>> abstractC3409g) {
            C3383e<MessageType, ?> c3383eCheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3409g);
            verifyExtensionContainingType(c3383eCheckIsLite);
            return this.extensions.m17177k(c3383eCheckIsLite.f11547d);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public abstract /* synthetic */ int getSerializedSize();

        public final <Type> boolean hasExtension(AbstractC3409g<MessageType, Type> abstractC3409g) {
            C3383e<MessageType, ?> c3383eCheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3409g);
            verifyExtensionContainingType(c3383eCheckIsLite);
            return this.extensions.m17179n(c3383eCheckIsLite.f11547d);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final void makeImmutable() {
            super.makeImmutable();
            this.extensions.m17184s();
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.m17180o()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.m17185t(messagetype.extensions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.InterfaceC3419q
        public /* bridge */ /* synthetic */ InterfaceC3419q.a newBuilderForType() {
            return super.newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.C3378a newExtensionWriter() {
            return new C3378a(this, false, null);
        }

        public ExtendableMessage<MessageType, BuilderType>.C3378a newMessageSetExtensionWriter() {
            return new C3378a(this, true, null);
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0010  */
        public <MessageType extends InterfaceC3419q> boolean parseUnknownField(MessageType messagetype, C3407e c3407e, C3410h c3410h, int i) throws IOException {
            boolean z;
            boolean z2;
            Object objBuild;
            InterfaceC3419q interfaceC3419q;
            int iM17073b = WireFormat.m17073b(i);
            int iM17072a = WireFormat.m17072a(i);
            C3383e c3383eM17160a = c3410h.m17160a(messagetype, iM17072a);
            if (c3383eM17160a == null) {
                z2 = true;
                z = false;
            } else if (iM17073b == C3411i.m17165m(c3383eM17160a.f11547d.mo17012D(), false)) {
                z2 = false;
                z = false;
            } else {
                C3382d c3382d = c3383eM17160a.f11547d;
                if (c3382d.f11542d && c3382d.f11541c.isPackable() && iM17073b == C3411i.m17165m(c3383eM17160a.f11547d.mo17012D(), true)) {
                    z = true;
                    z2 = false;
                } else {
                    z2 = true;
                    z = false;
                }
            }
            if (z2) {
                return parseUnknownField(i, c3407e);
            }
            if (z) {
                int iM17132l = c3407e.m17132l(c3407e.m17107C());
                if (c3383eM17160a.f11547d.mo17012D() == WireFormat.FieldType.ENUM) {
                    while (c3407e.m17129d() > 0) {
                        C3414l.c cVarFindValueByNumber = c3383eM17160a.f11547d.m17015b().findValueByNumber(c3407e.m17136p());
                        if (cVarFindValueByNumber == null) {
                            return true;
                        }
                        this.extensions.m17170a(c3383eM17160a.f11547d, c3383eM17160a.m17022g(cVarFindValueByNumber));
                    }
                } else {
                    while (c3407e.m17129d() > 0) {
                        this.extensions.m17170a(c3383eM17160a.f11547d, C3411i.m17167w(c3407e, c3383eM17160a.f11547d.mo17012D(), false));
                    }
                }
                c3407e.m17131k(iM17132l);
            } else {
                int i2 = C3379a.f11537a[c3383eM17160a.f11547d.mo17013E().ordinal()];
                if (i2 == 1) {
                    InterfaceC3419q.a builder = (c3383eM17160a.f11547d.isRepeated() || (interfaceC3419q = (InterfaceC3419q) this.extensions.m17173g(c3383eM17160a.f11547d)) == null) ? null : interfaceC3419q.toBuilder();
                    if (builder == null) {
                        builder = c3383eM17160a.m17019d().newBuilderForType();
                    }
                    if (c3383eM17160a.f11547d.mo17012D() == WireFormat.FieldType.GROUP) {
                        c3407e.m17140t(c3383eM17160a.m17020e(), builder, c3410h);
                    } else {
                        c3407e.m17144x(builder, c3410h);
                    }
                    objBuild = builder.build();
                } else if (i2 != 2) {
                    objBuild = C3411i.m17167w(c3407e, c3383eM17160a.f11547d.mo17012D(), false);
                } else {
                    int iM17136p = c3407e.m17136p();
                    C3414l.c cVarFindValueByNumber2 = c3383eM17160a.f11547d.m17015b().findValueByNumber(iM17136p);
                    if (cVarFindValueByNumber2 == null) {
                        mergeVarintField(iM17072a, iM17136p);
                        return true;
                    }
                    objBuild = cVarFindValueByNumber2;
                }
                boolean zIsRepeated = c3383eM17160a.f11547d.isRepeated();
                C3411i<C3382d> c3411i = this.extensions;
                if (zIsRepeated) {
                    c3411i.m17170a(c3383eM17160a.f11547d, c3383eM17160a.m17022g(objBuild));
                } else {
                    c3411i.m17187x(c3383eM17160a.f11547d, c3383eM17160a.m17022g(objBuild));
                }
            }
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.InterfaceC3419q
        public /* bridge */ /* synthetic */ InterfaceC3419q.a toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final void visit(InterfaceC3386h interfaceC3386h, MessageType messagetype) {
            super.visit(interfaceC3386h, messagetype);
            this.extensions = interfaceC3386h.mo16992a(this.extensions, messagetype.extensions);
        }

        @Override // com.google.protobuf.InterfaceC3419q
        public abstract /* synthetic */ void writeTo(CodedOutputStream codedOutputStream) throws IOException;

        public final <Type> Type getExtension(AbstractC3409g<MessageType, List<Type>> abstractC3409g, int i) {
            C3383e<MessageType, ?> c3383eCheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3409g);
            verifyExtensionContainingType(c3383eCheckIsLite);
            return (Type) c3383eCheckIsLite.m17021f(this.extensions.m17176j(c3383eCheckIsLite.f11547d, i));
        }

        /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$ExtendableMessage$a */
        public class C3378a {

            /* JADX INFO: renamed from: a */
            public final Iterator<Map.Entry<C3382d, Object>> f11533a;

            /* JADX INFO: renamed from: b */
            public Map.Entry<C3382d, Object> f11534b;

            /* JADX INFO: renamed from: c */
            public final boolean f11535c;

            public C3378a(boolean z) {
                Iterator itM17183r = ExtendableMessage.this.extensions.m17183r();
                this.f11533a = itM17183r;
                if (itM17183r.hasNext()) {
                    this.f11534b = (Map.Entry) itM17183r.next();
                }
                this.f11535c = z;
            }

            public /* synthetic */ C3378a(ExtendableMessage extendableMessage, boolean z, C3379a c3379a) {
                this(z);
            }
        }
    }

    public static <E> C3414l.h<E> mutableCopy(C3414l.h<E> hVar) {
        int size = hVar.size();
        return hVar.mo17088d(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C3407e c3407e) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, c3407e, C3410h.m17158b());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C3407e c3407e, C3410h c3410h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, c3407e, c3410h));
    }

    public int hashCode() {
        if (this.memoizedHashCode == 0) {
            C3384f c3384f = new C3384f(null);
            visit(c3384f, this);
            this.memoizedHashCode = c3384f.f11548a;
        }
        return this.memoizedHashCode;
    }

    public boolean equals(EqualsVisitor equalsVisitor, InterfaceC3419q interfaceC3419q) {
        if (this == interfaceC3419q) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(interfaceC3419q)) {
            return false;
        }
        visit(equalsVisitor, (GeneratedMessageLite) interfaceC3419q);
        return true;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C3407e c3407e) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, c3407e, C3410h.m17158b());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, ByteString byteString, C3410h c3410h) throws InvalidProtocolBufferException {
        C3407e c3407eNewCodedInput = byteString.newCodedInput();
        T t2 = (T) parsePartialFrom(t, c3407eNewCodedInput, c3410h);
        try {
            c3407eNewCodedInput.m17128a(0);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, C3410h c3410h) throws InvalidProtocolBufferException {
        C3407e c3407eM17102h = C3407e.m17102h(bArr);
        T t2 = (T) parsePartialFrom(t, c3407eM17102h, c3410h);
        try {
            c3407eM17102h.m17128a(0);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }
}
