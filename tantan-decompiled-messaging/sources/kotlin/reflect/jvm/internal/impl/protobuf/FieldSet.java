package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite;
import p149l.ig3;
import p149l.upk0;
import p149l.zkl;

/* JADX INFO: loaded from: classes2.dex */
public final class FieldSet<FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d */
    public static final FieldSet f65644d = new FieldSet(true);

    /* JADX INFO: renamed from: b */
    public boolean f65646b;

    /* JADX INFO: renamed from: c */
    public boolean f65647c = false;

    /* JADX INFO: renamed from: a */
    public final C15302d<FieldDescriptorType, Object> f65645a = C15302d.m91401n(16);

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        /* JADX INFO: renamed from: D */
        WireFormat.FieldType mo91329D();

        /* JADX INFO: renamed from: E */
        WireFormat.JavaType mo91330E();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();

        /* JADX INFO: renamed from: l */
        MessageLite.Builder mo91331l(MessageLite.Builder builder, MessageLite messageLite);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$a */
    public static /* synthetic */ class C15286a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65648a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f65649b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f65649b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65649b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65649b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65649b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f65649b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65649b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65649b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f65649b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f65649b[WireFormat.FieldType.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f65649b[WireFormat.FieldType.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f65649b[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f65649b[WireFormat.FieldType.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f65649b[WireFormat.FieldType.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f65649b[WireFormat.FieldType.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f65649b[WireFormat.FieldType.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f65649b[WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f65649b[WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f65649b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f65648a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f65648a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f65648a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f65648a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f65648a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f65648a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f65648a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f65648a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f65648a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public FieldSet(boolean z) {
        m91325q();
    }

    /* JADX INFO: renamed from: d */
    public static int m91303d(WireFormat.FieldType fieldType, int i, Object obj) {
        int iM91221E = CodedOutputStream.m91221E(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iM91221E *= 2;
        }
        return iM91221E + m91304e(fieldType, obj);
    }

    /* JADX INFO: renamed from: e */
    public static int m91304e(WireFormat.FieldType fieldType, Object obj) {
        switch (C15286a.f65649b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.m91235h(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m91241n(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m91245r(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m91223G(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m91244q(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m91239l(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m91238k(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m91230c(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m91220D((String) obj);
            case 10:
                return obj instanceof ByteString ? CodedOutputStream.m91233f((ByteString) obj) : CodedOutputStream.m91231d((byte[]) obj);
            case 11:
                return CodedOutputStream.m91222F(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.m91252y(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.m91253z(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.m91217A(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m91219C(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m91242o((MessageLite) obj);
            case 17:
                return obj instanceof LazyField ? CodedOutputStream.m91246s((LazyField) obj) : CodedOutputStream.m91248u((MessageLite) obj);
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.m91237j(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.m91237j(((Integer) obj).intValue());
            default:
                upk0.m194883a("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m91305f(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType fieldTypeMo91329D = fieldDescriptorLite.mo91329D();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return m91303d(fieldTypeMo91329D, number, obj);
        }
        int iM91303d = 0;
        if (fieldDescriptorLite.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM91303d += m91304e(fieldTypeMo91329D, it.next());
            }
            return CodedOutputStream.m91221E(number) + iM91303d + CodedOutputStream.m91250w(iM91303d);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM91303d += m91303d(fieldTypeMo91329D, number, it2.next());
        }
        return iM91303d;
    }

    /* JADX INFO: renamed from: g */
    public static <T extends FieldDescriptorLite<T>> FieldSet<T> m91306g() {
        return f65644d;
    }

    /* JADX INFO: renamed from: l */
    public static int m91307l(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* JADX INFO: renamed from: t */
    public static <T extends FieldDescriptorLite<T>> FieldSet<T> m91308t() {
        return new FieldSet<>();
    }

    /* JADX INFO: renamed from: u */
    public static Object m91309u(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z) throws IOException {
        switch (C15286a.f65649b[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(codedInputStream.m91203m());
            case 2:
                return Float.valueOf(codedInputStream.m91207q());
            case 3:
                return Long.valueOf(codedInputStream.m91210t());
            case 4:
                return Long.valueOf(codedInputStream.m91187M());
            case 5:
                return Integer.valueOf(codedInputStream.m91209s());
            case 6:
                return Long.valueOf(codedInputStream.m91206p());
            case 7:
                return Integer.valueOf(codedInputStream.m91205o());
            case 8:
                return Boolean.valueOf(codedInputStream.m91201k());
            case 9:
                return z ? codedInputStream.m91184J() : codedInputStream.m91183I();
            case 10:
                return codedInputStream.m91202l();
            case 11:
                return Integer.valueOf(codedInputStream.m91186L());
            case 12:
                return Integer.valueOf(codedInputStream.m91179E());
            case 13:
                return Long.valueOf(codedInputStream.m91180F());
            case 14:
                return Integer.valueOf(codedInputStream.m91181G());
            case 15:
                return Long.valueOf(codedInputStream.m91182H());
            case 16:
                ig3.m135964a("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 17:
                ig3.m135964a("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 18:
                ig3.m135964a("readPrimitiveField() cannot handle enums.");
                return null;
            default:
                upk0.m194883a("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX INFO: renamed from: w */
    public static void m91310w(WireFormat.FieldType fieldType, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (C15286a.f65648a[fieldType.getJavaType().ordinal()]) {
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
                if (!(obj instanceof Integer) && !(obj instanceof Internal.EnumLite)) {
                    z = false;
                }
                z2 = z;
                break;
            case 9:
                if (!(obj instanceof MessageLite) && !(obj instanceof LazyField)) {
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

    /* JADX INFO: renamed from: x */
    public static void m91311x(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.m91275c0(i, (MessageLite) obj);
        } else {
            codedOutputStream.m91254A0(i, m91307l(fieldType, false));
            m91312y(codedOutputStream, fieldType, obj);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m91312y(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (C15286a.f65649b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.m91267V(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.m91274b0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.m91279g0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.m91257D0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.m91278f0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.m91271Z(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.m91270Y(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.m91262Q(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.m91298z0((String) obj);
                break;
            case 10:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.m91263R((byte[]) obj);
                } else {
                    codedOutputStream.m91265T((ByteString) obj);
                }
                break;
            case 11:
                codedOutputStream.m91256C0(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.m91293u0(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.m91294v0(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.m91295w0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.m91297y0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.m91276d0((MessageLite) obj);
                break;
            case 17:
                codedOutputStream.m91281i0((MessageLite) obj);
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.m91269X(((Integer) obj).intValue());
                } else {
                    codedOutputStream.m91269X(((Internal.EnumLite) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m91313z(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType fieldTypeMo91329D = fieldDescriptorLite.mo91329D();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            if (obj instanceof LazyField) {
                m91311x(codedOutputStream, fieldTypeMo91329D, number, ((LazyField) obj).m91349e());
                return;
            } else {
                m91311x(codedOutputStream, fieldTypeMo91329D, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!fieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m91311x(codedOutputStream, fieldTypeMo91329D, number, it.next());
            }
            return;
        }
        codedOutputStream.m91254A0(number, 2);
        Iterator it2 = list.iterator();
        int iM91304e = 0;
        while (it2.hasNext()) {
            iM91304e += m91304e(fieldTypeMo91329D, it2.next());
        }
        codedOutputStream.m91291s0(iM91304e);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            m91312y(codedOutputStream, fieldTypeMo91329D, it3.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m91314a(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.isRepeated()) {
            ig3.m135964a("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m91310w(fielddescriptortype.mo91329D(), obj);
        Object objM91317h = m91317h(fielddescriptortype);
        if (objM91317h == null) {
            arrayList = new ArrayList();
            this.f65645a.m91411o(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) objM91317h;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FieldSet<FieldDescriptorType> clone() {
        C15302d<FieldDescriptorType, Object> c15302d;
        FieldSet<FieldDescriptorType> fieldSetM91308t = m91308t();
        int i = 0;
        while (true) {
            int iM91406i = this.f65645a.m91406i();
            c15302d = this.f65645a;
            if (i >= iM91406i) {
                break;
            }
            Map.Entry<K, Object> entryM91405h = c15302d.m91405h(i);
            fieldSetM91308t.m91328v((FieldDescriptorLite) entryM91405h.getKey(), entryM91405h.getValue());
            i++;
        }
        Iterator it = c15302d.m91407j().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            fieldSetM91308t.m91328v((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSetM91308t.f65647c = this.f65647c;
        return fieldSetM91308t;
    }

    /* JADX INFO: renamed from: c */
    public final Object m91316c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: h */
    public Object m91317h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f65645a.get(fielddescriptortype);
        return obj instanceof LazyField ? ((LazyField) obj).m91349e() : obj;
    }

    /* JADX INFO: renamed from: i */
    public Object m91318i(FieldDescriptorType fielddescriptortype, int i) {
        if (!fielddescriptortype.isRepeated()) {
            ig3.m135964a("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objM91317h = m91317h(fielddescriptortype);
        if (objM91317h != null) {
            return ((List) objM91317h).get(i);
        }
        zkl.m219192a();
        return null;
    }

    /* JADX INFO: renamed from: j */
    public int m91319j(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            ig3.m135964a("getRepeatedField() can only be called on repeated fields.");
            return 0;
        }
        Object objM91317h = m91317h(fielddescriptortype);
        if (objM91317h == null) {
            return 0;
        }
        return ((List) objM91317h).size();
    }

    /* JADX INFO: renamed from: k */
    public int m91320k() {
        C15302d<FieldDescriptorType, Object> c15302d;
        int i = 0;
        int iM91305f = 0;
        while (true) {
            int iM91406i = this.f65645a.m91406i();
            c15302d = this.f65645a;
            if (i >= iM91406i) {
                break;
            }
            Map.Entry<K, Object> entryM91405h = c15302d.m91405h(i);
            iM91305f += m91305f((FieldDescriptorLite) entryM91405h.getKey(), entryM91405h.getValue());
            i++;
        }
        Iterator it = c15302d.m91407j().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM91305f += m91305f((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iM91305f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m91321m(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            return this.f65645a.get(fielddescriptortype) != null;
        }
        ig3.m135964a("hasField() can only be called on non-repeated fields.");
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m91322n() {
        int i = 0;
        while (true) {
            int iM91406i = this.f65645a.m91406i();
            C15302d<FieldDescriptorType, Object> c15302d = this.f65645a;
            if (i >= iM91406i) {
                Iterator it = c15302d.m91407j().iterator();
                while (it.hasNext()) {
                    if (!m91323o((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m91323o(c15302d.m91405h(i))) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m91323o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.mo91330E() == WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((MessageLite) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof MessageLite)) {
                    if (value instanceof LazyField) {
                        return true;
                    }
                    ig3.m135964a("Wrong object type used with protocol message reflection.");
                    return false;
                }
                if (!((MessageLite) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public Iterator<Map.Entry<FieldDescriptorType, Object>> m91324p() {
        boolean z = this.f65647c;
        C15302d<FieldDescriptorType, Object> c15302d = this.f65645a;
        return z ? new LazyField.C15291c(c15302d.entrySet().iterator()) : c15302d.entrySet().iterator();
    }

    /* JADX INFO: renamed from: q */
    public void m91325q() {
        if (this.f65646b) {
            return;
        }
        this.f65645a.mo91410m();
        this.f65646b = true;
    }

    /* JADX INFO: renamed from: r */
    public void m91326r(FieldSet<FieldDescriptorType> fieldSet) {
        C15302d<FieldDescriptorType, Object> c15302d;
        int i = 0;
        while (true) {
            int iM91406i = fieldSet.f65645a.m91406i();
            c15302d = fieldSet.f65645a;
            if (i >= iM91406i) {
                break;
            }
            m91327s(c15302d.m91405h(i));
            i++;
        }
        Iterator it = c15302d.m91407j().iterator();
        while (it.hasNext()) {
            m91327s((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m91327s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).m91349e();
        }
        if (key.isRepeated()) {
            Object objM91317h = m91317h(key);
            if (objM91317h == null) {
                objM91317h = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM91317h).add(m91316c(it.next()));
            }
            this.f65645a.m91411o(key, objM91317h);
            return;
        }
        if (key.mo91330E() != WireFormat.JavaType.MESSAGE) {
            this.f65645a.m91411o(key, m91316c(value));
            return;
        }
        Object objM91317h2 = m91317h(key);
        if (objM91317h2 == null) {
            this.f65645a.m91411o(key, m91316c(value));
        } else {
            this.f65645a.m91411o(key, key.mo91331l(((MessageLite) objM91317h2).toBuilder(), (MessageLite) value).build());
        }
    }

    /* JADX INFO: renamed from: v */
    public void m91328v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            m91310w(fielddescriptortype.mo91329D(), obj);
        } else {
            if (!(obj instanceof List)) {
                ig3.m135964a("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m91310w(fielddescriptortype.mo91329D(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f65647c = true;
        }
        this.f65645a.m91411o(fielddescriptortype, obj);
    }

    public FieldSet() {
    }
}
