package com.google.protobuf;

import com.google.protobuf.C3434i.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.azk0;
import p153l.onl;
import p153l.wg3;

/* JADX INFO: renamed from: com.google.protobuf.i */
/* JADX INFO: loaded from: classes7.dex */
public final class C3434i<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d */
    public static final C3434i f11631d = new C3434i(true);

    /* JADX INFO: renamed from: b */
    public boolean f11633b;

    /* JADX INFO: renamed from: c */
    public boolean f11634c = false;

    /* JADX INFO: renamed from: a */
    public final C3445t<FieldDescriptorType, Object> f11632a = C3445t.m17348o(16);

    /* JADX INFO: renamed from: com.google.protobuf.i$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11635a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f11636b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f11636b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11636b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11636b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11636b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11636b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11636b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11636b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11636b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11636b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11636b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11636b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11636b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11636b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11636b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11636b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11636b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11636b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11636b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f11635a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11635a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11635a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f11635a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f11635a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f11635a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f11635a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f11635a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f11635a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* JADX INFO: renamed from: D */
        WireFormat.FieldType mo17067D();

        /* JADX INFO: renamed from: E */
        WireFormat.JavaType mo17068E();

        /* JADX INFO: renamed from: c */
        InterfaceC3442q.a mo17071c(InterfaceC3442q.a aVar, InterfaceC3442q interfaceC3442q);

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public C3434i(boolean z) {
        m17239s();
    }

    /* JADX INFO: renamed from: A */
    public static void m17216A(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f11636b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.m17014h0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.m17022p0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.m17028v0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.mo17000J0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.mo17026t0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.mo17020n0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.mo17018l0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.m17007b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.m17024r0((InterfaceC3442q) obj);
                break;
            case 10:
                codedOutputStream.mo17030x0((InterfaceC3442q) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.mo16995E0((String) obj);
                } else {
                    codedOutputStream.mo17012f0((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.m17008c0((byte[]) obj);
                } else {
                    codedOutputStream.mo17012f0((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.mo16998H0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.m17032z0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.m16991A0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.m16992B0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.m16993C0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof C3437l.c)) {
                    codedOutputStream.m17016j0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.m17016j0(((C3437l.c) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m17217d(WireFormat.FieldType fieldType, int i, Object obj) {
        int iM16958M = CodedOutputStream.m16958M(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iM16958M *= 2;
        }
        return iM16958M + m17218e(fieldType, obj);
    }

    /* JADX INFO: renamed from: e */
    public static int m17218e(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f11636b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.m16976l(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m16982r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m16987w(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m16962Q(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m16985u(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m16980p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m16979o(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m16971g(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m16983s((InterfaceC3442q) obj);
            case 10:
                return obj instanceof C3438m ? CodedOutputStream.m16990z((C3438m) obj) : CodedOutputStream.m16949D((InterfaceC3442q) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.m16974j((ByteString) obj) : CodedOutputStream.m16957L((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.m16974j((ByteString) obj) : CodedOutputStream.m16972h((byte[]) obj);
            case 13:
                return CodedOutputStream.m16960O(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m16952G(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m16953H(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m16954I(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m16955J(((Long) obj).longValue());
            case 18:
                return obj instanceof C3437l.c ? CodedOutputStream.m16978n(((C3437l.c) obj).getNumber()) : CodedOutputStream.m16978n(((Integer) obj).intValue());
            default:
                azk0.m101074a("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m17219f(b<?> bVar, Object obj) {
        WireFormat.FieldType fieldTypeMo17067D = bVar.mo17067D();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return m17217d(fieldTypeMo17067D, number, obj);
        }
        int iM17217d = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM17217d += m17218e(fieldTypeMo17067D, it.next());
            }
            return CodedOutputStream.m16958M(number) + iM17217d + CodedOutputStream.m16951F(iM17217d);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM17217d += m17217d(fieldTypeMo17067D, number, it2.next());
        }
        return iM17217d;
    }

    /* JADX INFO: renamed from: m */
    public static int m17220m(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* JADX INFO: renamed from: v */
    public static <T extends b<T>> C3434i<T> m17221v() {
        return new C3434i<>();
    }

    /* JADX INFO: renamed from: w */
    public static Object m17222w(C3430e c3430e, WireFormat.FieldType fieldType, boolean z) throws IOException {
        return z ? WireFormat.m17130d(c3430e, fieldType, WireFormat.Utf8Validation.STRICT) : WireFormat.m17130d(c3430e, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX INFO: renamed from: y */
    public static void m17223y(WireFormat.FieldType fieldType, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (a.f11635a[fieldType.getJavaType().ordinal()]) {
            case 1:
                z2 = obj instanceof Integer;
                break;
            case 2:
                z2 = obj instanceof Long;
                break;
            case 3:
                z2 = obj instanceof Float;
                break;
            case 4:
                z2 = obj instanceof Double;
                break;
            case 5:
                z2 = obj instanceof Boolean;
                break;
            case 6:
                z2 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof ByteString) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof C3437l.c)) {
                    z = false;
                }
                z2 = z;
                break;
            case 9:
                if (!(obj instanceof InterfaceC3442q) && !(obj instanceof C3438m)) {
                    z = false;
                }
                z2 = z;
                break;
        }
        if (z2) {
            return;
        }
        wg3.m206174a("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: renamed from: z */
    public static void m17224z(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.m17023q0(i, (InterfaceC3442q) obj);
        } else {
            codedOutputStream.mo16996F0(i, m17220m(fieldType, false));
            m17216A(codedOutputStream, fieldType, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m17225a(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.isRepeated()) {
            wg3.m206174a("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m17223y(fielddescriptortype.mo17067D(), obj);
        Object objM17228g = m17228g(fielddescriptortype);
        if (objM17228g == null) {
            arrayList = new ArrayList();
            this.f11632a.m17359p(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) objM17228g;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3434i<FieldDescriptorType> clone() {
        C3445t<FieldDescriptorType, Object> c3445t;
        C3434i<FieldDescriptorType> c3434iM17221v = m17221v();
        int i = 0;
        while (true) {
            int iM17353i = this.f11632a.m17353i();
            c3445t = this.f11632a;
            if (i >= iM17353i) {
                break;
            }
            Map.Entry<K, Object> entryM17352h = c3445t.m17352h(i);
            c3434iM17221v.m17242x((b) entryM17352h.getKey(), entryM17352h.getValue());
            i++;
        }
        Iterator it = c3445t.m17355k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c3434iM17221v.m17242x((b) entry.getKey(), entry.getValue());
        }
        c3434iM17221v.f11634c = this.f11634c;
        return c3434iM17221v;
    }

    /* JADX INFO: renamed from: c */
    public final Object m17227c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3434i) {
            return this.f11632a.equals(((C3434i) obj).f11632a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public Object m17228g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f11632a.get(fielddescriptortype);
        return obj instanceof C3438m ? ((C3438m) obj).m17268f() : obj;
    }

    /* JADX INFO: renamed from: h */
    public int m17229h() {
        C3445t<FieldDescriptorType, Object> c3445t;
        int i = 0;
        int iM17230i = 0;
        while (true) {
            int iM17353i = this.f11632a.m17353i();
            c3445t = this.f11632a;
            if (i >= iM17353i) {
                break;
            }
            iM17230i += m17230i(c3445t.m17352h(i));
            i++;
        }
        Iterator it = c3445t.m17355k().iterator();
        while (it.hasNext()) {
            iM17230i += m17230i((Map.Entry) it.next());
        }
        return iM17230i;
    }

    public int hashCode() {
        return this.f11632a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m17230i(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo17068E() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            return m17219f(key, value);
        }
        return value instanceof C3438m ? CodedOutputStream.m16988x(entry.getKey().getNumber(), (C3438m) value) : CodedOutputStream.m16947B(entry.getKey().getNumber(), (InterfaceC3442q) value);
    }

    /* JADX INFO: renamed from: j */
    public Object m17231j(FieldDescriptorType fielddescriptortype, int i) {
        if (!fielddescriptortype.isRepeated()) {
            wg3.m206174a("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objM17228g = m17228g(fielddescriptortype);
        if (objM17228g != null) {
            return ((List) objM17228g).get(i);
        }
        onl.m168333a();
        return null;
    }

    /* JADX INFO: renamed from: k */
    public int m17232k(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            wg3.m206174a("getRepeatedField() can only be called on repeated fields.");
            return 0;
        }
        Object objM17228g = m17228g(fielddescriptortype);
        if (objM17228g == null) {
            return 0;
        }
        return ((List) objM17228g).size();
    }

    /* JADX INFO: renamed from: l */
    public int m17233l() {
        C3445t<FieldDescriptorType, Object> c3445t;
        int i = 0;
        int iM17219f = 0;
        while (true) {
            int iM17353i = this.f11632a.m17353i();
            c3445t = this.f11632a;
            if (i >= iM17353i) {
                break;
            }
            Map.Entry<K, Object> entryM17352h = c3445t.m17352h(i);
            iM17219f += m17219f((b) entryM17352h.getKey(), entryM17352h.getValue());
            i++;
        }
        Iterator it = c3445t.m17355k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM17219f += m17219f((b) entry.getKey(), entry.getValue());
        }
        return iM17219f;
    }

    /* JADX INFO: renamed from: n */
    public boolean m17234n(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            return this.f11632a.get(fielddescriptortype) != null;
        }
        wg3.m206174a("hasField() can only be called on non-repeated fields.");
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m17235o() {
        return this.f11633b;
    }

    /* JADX INFO: renamed from: p */
    public boolean m17236p() {
        int i = 0;
        while (true) {
            int iM17353i = this.f11632a.m17353i();
            C3445t<FieldDescriptorType, Object> c3445t = this.f11632a;
            if (i >= iM17353i) {
                Iterator it = c3445t.m17355k().iterator();
                while (it.hasNext()) {
                    if (!m17237q((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m17237q(c3445t.m17352h(i))) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m17237q(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.mo17068E() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC3442q) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof InterfaceC3442q)) {
                    if (value instanceof C3438m) {
                        return true;
                    }
                    wg3.m206174a("Wrong object type used with protocol message reflection.");
                    return false;
                }
                if (!((InterfaceC3442q) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public Iterator<Map.Entry<FieldDescriptorType, Object>> m17238r() {
        boolean z = this.f11634c;
        C3445t<FieldDescriptorType, Object> c3445t = this.f11632a;
        return z ? new C3438m.c(c3445t.entrySet().iterator()) : c3445t.entrySet().iterator();
    }

    /* JADX INFO: renamed from: s */
    public void m17239s() {
        if (this.f11633b) {
            return;
        }
        this.f11632a.mo17358n();
        this.f11633b = true;
    }

    /* JADX INFO: renamed from: t */
    public void m17240t(C3434i<FieldDescriptorType> c3434i) {
        C3445t<FieldDescriptorType, Object> c3445t;
        int i = 0;
        while (true) {
            int iM17353i = c3434i.f11632a.m17353i();
            c3445t = c3434i.f11632a;
            if (i >= iM17353i) {
                break;
            }
            m17241u(c3445t.m17352h(i));
            i++;
        }
        Iterator it = c3445t.m17355k().iterator();
        while (it.hasNext()) {
            m17241u((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m17241u(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C3438m) {
            value = ((C3438m) value).m17268f();
        }
        if (key.isRepeated()) {
            Object objM17228g = m17228g(key);
            if (objM17228g == null) {
                objM17228g = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM17228g).add(m17227c(it.next()));
            }
            this.f11632a.m17359p(key, objM17228g);
            return;
        }
        if (key.mo17068E() != WireFormat.JavaType.MESSAGE) {
            this.f11632a.m17359p(key, m17227c(value));
            return;
        }
        Object objM17228g2 = m17228g(key);
        if (objM17228g2 == null) {
            this.f11632a.m17359p(key, m17227c(value));
        } else {
            this.f11632a.m17359p(key, key.mo17071c(((InterfaceC3442q) objM17228g2).toBuilder(), (InterfaceC3442q) value).build());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m17242x(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            m17223y(fielddescriptortype.mo17067D(), obj);
        } else {
            if (!(obj instanceof List)) {
                wg3.m206174a("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m17223y(fielddescriptortype.mo17067D(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C3438m) {
            this.f11634c = true;
        }
        this.f11632a.m17359p(fielddescriptortype, obj);
    }

    public C3434i() {
    }
}
