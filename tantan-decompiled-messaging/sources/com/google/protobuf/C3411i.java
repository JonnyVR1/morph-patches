package com.google.protobuf;

import com.google.protobuf.C3411i.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.ig3;
import p149l.upk0;
import p149l.zkl;

/* JADX INFO: renamed from: com.google.protobuf.i */
/* JADX INFO: loaded from: classes7.dex */
public final class C3411i<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d */
    public static final C3411i f11594d = new C3411i(true);

    /* JADX INFO: renamed from: b */
    public boolean f11596b;

    /* JADX INFO: renamed from: c */
    public boolean f11597c = false;

    /* JADX INFO: renamed from: a */
    public final C3422t<FieldDescriptorType, Object> f11595a = C3422t.m17293o(16);

    /* JADX INFO: renamed from: com.google.protobuf.i$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11598a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f11599b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f11599b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11599b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11599b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11599b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11599b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11599b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11599b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11599b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11599b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11599b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11599b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11599b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11599b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11599b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11599b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11599b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11599b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11599b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f11598a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11598a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11598a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f11598a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f11598a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f11598a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f11598a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f11598a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f11598a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.i$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* JADX INFO: renamed from: D */
        WireFormat.FieldType mo17012D();

        /* JADX INFO: renamed from: E */
        WireFormat.JavaType mo17013E();

        /* JADX INFO: renamed from: c */
        InterfaceC3419q.a mo17016c(InterfaceC3419q.a aVar, InterfaceC3419q interfaceC3419q);

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public C3411i(boolean z) {
        m17184s();
    }

    /* JADX INFO: renamed from: A */
    public static void m17161A(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f11599b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.m16959h0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.m16967p0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.m16973v0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.mo16945J0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.mo16971t0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.mo16965n0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.mo16963l0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.m16952b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.m16969r0((InterfaceC3419q) obj);
                break;
            case 10:
                codedOutputStream.mo16975x0((InterfaceC3419q) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.mo16940E0((String) obj);
                } else {
                    codedOutputStream.mo16957f0((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.m16953c0((byte[]) obj);
                } else {
                    codedOutputStream.mo16957f0((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.mo16943H0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.m16977z0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.m16936A0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.m16937B0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.m16938C0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof C3414l.c)) {
                    codedOutputStream.m16961j0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.m16961j0(((C3414l.c) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m17162d(WireFormat.FieldType fieldType, int i, Object obj) {
        int iM16903M = CodedOutputStream.m16903M(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iM16903M *= 2;
        }
        return iM16903M + m17163e(fieldType, obj);
    }

    /* JADX INFO: renamed from: e */
    public static int m17163e(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f11599b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.m16921l(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m16927r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m16932w(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m16907Q(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m16930u(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m16925p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m16924o(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m16916g(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m16928s((InterfaceC3419q) obj);
            case 10:
                return obj instanceof C3415m ? CodedOutputStream.m16935z((C3415m) obj) : CodedOutputStream.m16894D((InterfaceC3419q) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.m16919j((ByteString) obj) : CodedOutputStream.m16902L((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.m16919j((ByteString) obj) : CodedOutputStream.m16917h((byte[]) obj);
            case 13:
                return CodedOutputStream.m16905O(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m16897G(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m16898H(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m16899I(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m16900J(((Long) obj).longValue());
            case 18:
                return obj instanceof C3414l.c ? CodedOutputStream.m16923n(((C3414l.c) obj).getNumber()) : CodedOutputStream.m16923n(((Integer) obj).intValue());
            default:
                upk0.m194883a("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m17164f(b<?> bVar, Object obj) {
        WireFormat.FieldType fieldTypeMo17012D = bVar.mo17012D();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return m17162d(fieldTypeMo17012D, number, obj);
        }
        int iM17162d = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM17162d += m17163e(fieldTypeMo17012D, it.next());
            }
            return CodedOutputStream.m16903M(number) + iM17162d + CodedOutputStream.m16896F(iM17162d);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM17162d += m17162d(fieldTypeMo17012D, number, it2.next());
        }
        return iM17162d;
    }

    /* JADX INFO: renamed from: m */
    public static int m17165m(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* JADX INFO: renamed from: v */
    public static <T extends b<T>> C3411i<T> m17166v() {
        return new C3411i<>();
    }

    /* JADX INFO: renamed from: w */
    public static Object m17167w(C3407e c3407e, WireFormat.FieldType fieldType, boolean z) throws IOException {
        return z ? WireFormat.m17075d(c3407e, fieldType, WireFormat.Utf8Validation.STRICT) : WireFormat.m17075d(c3407e, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX INFO: renamed from: y */
    public static void m17168y(WireFormat.FieldType fieldType, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (a.f11598a[fieldType.getJavaType().ordinal()]) {
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
                if (!(obj instanceof Integer) && !(obj instanceof C3414l.c)) {
                    z = false;
                }
                z2 = z;
                break;
            case 9:
                if (!(obj instanceof InterfaceC3419q) && !(obj instanceof C3415m)) {
                    z = false;
                }
                z2 = z;
                break;
        }
        if (z2) {
            return;
        }
        ig3.m135964a("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: renamed from: z */
    public static void m17169z(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.m16968q0(i, (InterfaceC3419q) obj);
        } else {
            codedOutputStream.mo16941F0(i, m17165m(fieldType, false));
            m17161A(codedOutputStream, fieldType, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m17170a(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.isRepeated()) {
            ig3.m135964a("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m17168y(fielddescriptortype.mo17012D(), obj);
        Object objM17173g = m17173g(fielddescriptortype);
        if (objM17173g == null) {
            arrayList = new ArrayList();
            this.f11595a.m17304p(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) objM17173g;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3411i<FieldDescriptorType> clone() {
        C3422t<FieldDescriptorType, Object> c3422t;
        C3411i<FieldDescriptorType> c3411iM17166v = m17166v();
        int i = 0;
        while (true) {
            int iM17298i = this.f11595a.m17298i();
            c3422t = this.f11595a;
            if (i >= iM17298i) {
                break;
            }
            Map.Entry<K, Object> entryM17297h = c3422t.m17297h(i);
            c3411iM17166v.m17187x((b) entryM17297h.getKey(), entryM17297h.getValue());
            i++;
        }
        Iterator it = c3422t.m17300k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c3411iM17166v.m17187x((b) entry.getKey(), entry.getValue());
        }
        c3411iM17166v.f11597c = this.f11597c;
        return c3411iM17166v;
    }

    /* JADX INFO: renamed from: c */
    public final Object m17172c(Object obj) {
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
        if (obj instanceof C3411i) {
            return this.f11595a.equals(((C3411i) obj).f11595a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public Object m17173g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f11595a.get(fielddescriptortype);
        return obj instanceof C3415m ? ((C3415m) obj).m17213f() : obj;
    }

    /* JADX INFO: renamed from: h */
    public int m17174h() {
        C3422t<FieldDescriptorType, Object> c3422t;
        int i = 0;
        int iM17175i = 0;
        while (true) {
            int iM17298i = this.f11595a.m17298i();
            c3422t = this.f11595a;
            if (i >= iM17298i) {
                break;
            }
            iM17175i += m17175i(c3422t.m17297h(i));
            i++;
        }
        Iterator it = c3422t.m17300k().iterator();
        while (it.hasNext()) {
            iM17175i += m17175i((Map.Entry) it.next());
        }
        return iM17175i;
    }

    public int hashCode() {
        return this.f11595a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m17175i(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo17013E() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
            return m17164f(key, value);
        }
        return value instanceof C3415m ? CodedOutputStream.m16933x(entry.getKey().getNumber(), (C3415m) value) : CodedOutputStream.m16892B(entry.getKey().getNumber(), (InterfaceC3419q) value);
    }

    /* JADX INFO: renamed from: j */
    public Object m17176j(FieldDescriptorType fielddescriptortype, int i) {
        if (!fielddescriptortype.isRepeated()) {
            ig3.m135964a("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objM17173g = m17173g(fielddescriptortype);
        if (objM17173g != null) {
            return ((List) objM17173g).get(i);
        }
        zkl.m219192a();
        return null;
    }

    /* JADX INFO: renamed from: k */
    public int m17177k(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            ig3.m135964a("getRepeatedField() can only be called on repeated fields.");
            return 0;
        }
        Object objM17173g = m17173g(fielddescriptortype);
        if (objM17173g == null) {
            return 0;
        }
        return ((List) objM17173g).size();
    }

    /* JADX INFO: renamed from: l */
    public int m17178l() {
        C3422t<FieldDescriptorType, Object> c3422t;
        int i = 0;
        int iM17164f = 0;
        while (true) {
            int iM17298i = this.f11595a.m17298i();
            c3422t = this.f11595a;
            if (i >= iM17298i) {
                break;
            }
            Map.Entry<K, Object> entryM17297h = c3422t.m17297h(i);
            iM17164f += m17164f((b) entryM17297h.getKey(), entryM17297h.getValue());
            i++;
        }
        Iterator it = c3422t.m17300k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM17164f += m17164f((b) entry.getKey(), entry.getValue());
        }
        return iM17164f;
    }

    /* JADX INFO: renamed from: n */
    public boolean m17179n(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            return this.f11595a.get(fielddescriptortype) != null;
        }
        ig3.m135964a("hasField() can only be called on non-repeated fields.");
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m17180o() {
        return this.f11596b;
    }

    /* JADX INFO: renamed from: p */
    public boolean m17181p() {
        int i = 0;
        while (true) {
            int iM17298i = this.f11595a.m17298i();
            C3422t<FieldDescriptorType, Object> c3422t = this.f11595a;
            if (i >= iM17298i) {
                Iterator it = c3422t.m17300k().iterator();
                while (it.hasNext()) {
                    if (!m17182q((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m17182q(c3422t.m17297h(i))) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m17182q(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.mo17013E() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC3419q) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof InterfaceC3419q)) {
                    if (value instanceof C3415m) {
                        return true;
                    }
                    ig3.m135964a("Wrong object type used with protocol message reflection.");
                    return false;
                }
                if (!((InterfaceC3419q) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public Iterator<Map.Entry<FieldDescriptorType, Object>> m17183r() {
        boolean z = this.f11597c;
        C3422t<FieldDescriptorType, Object> c3422t = this.f11595a;
        return z ? new C3415m.c(c3422t.entrySet().iterator()) : c3422t.entrySet().iterator();
    }

    /* JADX INFO: renamed from: s */
    public void m17184s() {
        if (this.f11596b) {
            return;
        }
        this.f11595a.mo17303n();
        this.f11596b = true;
    }

    /* JADX INFO: renamed from: t */
    public void m17185t(C3411i<FieldDescriptorType> c3411i) {
        C3422t<FieldDescriptorType, Object> c3422t;
        int i = 0;
        while (true) {
            int iM17298i = c3411i.f11595a.m17298i();
            c3422t = c3411i.f11595a;
            if (i >= iM17298i) {
                break;
            }
            m17186u(c3422t.m17297h(i));
            i++;
        }
        Iterator it = c3422t.m17300k().iterator();
        while (it.hasNext()) {
            m17186u((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m17186u(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C3415m) {
            value = ((C3415m) value).m17213f();
        }
        if (key.isRepeated()) {
            Object objM17173g = m17173g(key);
            if (objM17173g == null) {
                objM17173g = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM17173g).add(m17172c(it.next()));
            }
            this.f11595a.m17304p(key, objM17173g);
            return;
        }
        if (key.mo17013E() != WireFormat.JavaType.MESSAGE) {
            this.f11595a.m17304p(key, m17172c(value));
            return;
        }
        Object objM17173g2 = m17173g(key);
        if (objM17173g2 == null) {
            this.f11595a.m17304p(key, m17172c(value));
        } else {
            this.f11595a.m17304p(key, key.mo17016c(((InterfaceC3419q) objM17173g2).toBuilder(), (InterfaceC3419q) value).build());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m17187x(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            m17168y(fielddescriptortype.mo17012D(), obj);
        } else {
            if (!(obj instanceof List)) {
                ig3.m135964a("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m17168y(fielddescriptortype.mo17012D(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C3415m) {
            this.f11597c = true;
        }
        this.f11595a.m17304p(fielddescriptortype, obj);
    }

    public C3411i() {
    }
}
