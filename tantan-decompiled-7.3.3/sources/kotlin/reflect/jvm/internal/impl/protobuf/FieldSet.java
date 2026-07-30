package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite;
import p153l.azk0;
import p153l.onl;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public final class FieldSet<FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d */
    public static final FieldSet f66318d = new FieldSet(true);

    /* JADX INFO: renamed from: b */
    public boolean f66320b;

    /* JADX INFO: renamed from: c */
    public boolean f66321c = false;

    /* JADX INFO: renamed from: a */
    public final C15409d<FieldDescriptorType, Object> f66319a = C15409d.m92292n(16);

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        /* JADX INFO: renamed from: D */
        WireFormat.FieldType mo92220D();

        /* JADX INFO: renamed from: E */
        WireFormat.JavaType mo92221E();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();

        /* JADX INFO: renamed from: l */
        MessageLite.Builder mo92222l(MessageLite.Builder builder, MessageLite messageLite);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$a */
    public static /* synthetic */ class C15393a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66322a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f66323b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f66323b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66323b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66323b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66323b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66323b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66323b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66323b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f66323b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f66323b[WireFormat.FieldType.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66323b[WireFormat.FieldType.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f66323b[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f66323b[WireFormat.FieldType.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f66323b[WireFormat.FieldType.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f66323b[WireFormat.FieldType.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f66323b[WireFormat.FieldType.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f66323b[WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f66323b[WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f66323b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f66322a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f66322a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f66322a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f66322a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f66322a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f66322a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f66322a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f66322a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f66322a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public FieldSet(boolean z) {
        m92216q();
    }

    /* JADX INFO: renamed from: d */
    public static int m92194d(WireFormat.FieldType fieldType, int i, Object obj) {
        int iM92112E = CodedOutputStream.m92112E(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iM92112E *= 2;
        }
        return iM92112E + m92195e(fieldType, obj);
    }

    /* JADX INFO: renamed from: e */
    public static int m92195e(WireFormat.FieldType fieldType, Object obj) {
        switch (C15393a.f66323b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.m92126h(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m92132n(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m92136r(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m92114G(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m92135q(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m92130l(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m92129k(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m92121c(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m92111D((String) obj);
            case 10:
                return obj instanceof ByteString ? CodedOutputStream.m92124f((ByteString) obj) : CodedOutputStream.m92122d((byte[]) obj);
            case 11:
                return CodedOutputStream.m92113F(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.m92143y(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.m92144z(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.m92108A(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m92110C(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m92133o((MessageLite) obj);
            case 17:
                return obj instanceof LazyField ? CodedOutputStream.m92137s((LazyField) obj) : CodedOutputStream.m92139u((MessageLite) obj);
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.m92128j(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.m92128j(((Integer) obj).intValue());
            default:
                azk0.m101074a("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m92196f(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType fieldTypeMo92220D = fieldDescriptorLite.mo92220D();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return m92194d(fieldTypeMo92220D, number, obj);
        }
        int iM92194d = 0;
        if (fieldDescriptorLite.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM92194d += m92195e(fieldTypeMo92220D, it.next());
            }
            return CodedOutputStream.m92112E(number) + iM92194d + CodedOutputStream.m92141w(iM92194d);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM92194d += m92194d(fieldTypeMo92220D, number, it2.next());
        }
        return iM92194d;
    }

    /* JADX INFO: renamed from: g */
    public static <T extends FieldDescriptorLite<T>> FieldSet<T> m92197g() {
        return f66318d;
    }

    /* JADX INFO: renamed from: l */
    public static int m92198l(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    /* JADX INFO: renamed from: t */
    public static <T extends FieldDescriptorLite<T>> FieldSet<T> m92199t() {
        return new FieldSet<>();
    }

    /* JADX INFO: renamed from: u */
    public static Object m92200u(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z) throws IOException {
        switch (C15393a.f66323b[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(codedInputStream.m92094m());
            case 2:
                return Float.valueOf(codedInputStream.m92098q());
            case 3:
                return Long.valueOf(codedInputStream.m92101t());
            case 4:
                return Long.valueOf(codedInputStream.m92078M());
            case 5:
                return Integer.valueOf(codedInputStream.m92100s());
            case 6:
                return Long.valueOf(codedInputStream.m92097p());
            case 7:
                return Integer.valueOf(codedInputStream.m92096o());
            case 8:
                return Boolean.valueOf(codedInputStream.m92092k());
            case 9:
                return z ? codedInputStream.m92075J() : codedInputStream.m92074I();
            case 10:
                return codedInputStream.m92093l();
            case 11:
                return Integer.valueOf(codedInputStream.m92077L());
            case 12:
                return Integer.valueOf(codedInputStream.m92070E());
            case 13:
                return Long.valueOf(codedInputStream.m92071F());
            case 14:
                return Integer.valueOf(codedInputStream.m92072G());
            case 15:
                return Long.valueOf(codedInputStream.m92073H());
            case 16:
                wg3.m206174a("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 17:
                wg3.m206174a("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 18:
                wg3.m206174a("readPrimitiveField() cannot handle enums.");
                return null;
            default:
                azk0.m101074a("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX INFO: renamed from: w */
    public static void m92201w(WireFormat.FieldType fieldType, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (C15393a.f66322a[fieldType.getJavaType().ordinal()]) {
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
        wg3.m206174a("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: renamed from: x */
    public static void m92202x(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.m92166c0(i, (MessageLite) obj);
        } else {
            codedOutputStream.m92145A0(i, m92198l(fieldType, false));
            m92203y(codedOutputStream, fieldType, obj);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m92203y(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (C15393a.f66323b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.m92158V(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.m92165b0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.m92170g0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.m92148D0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.m92169f0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.m92162Z(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.m92161Y(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.m92153Q(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.m92189z0((String) obj);
                break;
            case 10:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.m92154R((byte[]) obj);
                } else {
                    codedOutputStream.m92156T((ByteString) obj);
                }
                break;
            case 11:
                codedOutputStream.m92147C0(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.m92184u0(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.m92185v0(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.m92186w0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.m92188y0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.m92167d0((MessageLite) obj);
                break;
            case 17:
                codedOutputStream.m92172i0((MessageLite) obj);
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.m92160X(((Integer) obj).intValue());
                } else {
                    codedOutputStream.m92160X(((Internal.EnumLite) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m92204z(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType fieldTypeMo92220D = fieldDescriptorLite.mo92220D();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            if (obj instanceof LazyField) {
                m92202x(codedOutputStream, fieldTypeMo92220D, number, ((LazyField) obj).m92240e());
                return;
            } else {
                m92202x(codedOutputStream, fieldTypeMo92220D, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!fieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m92202x(codedOutputStream, fieldTypeMo92220D, number, it.next());
            }
            return;
        }
        codedOutputStream.m92145A0(number, 2);
        Iterator it2 = list.iterator();
        int iM92195e = 0;
        while (it2.hasNext()) {
            iM92195e += m92195e(fieldTypeMo92220D, it2.next());
        }
        codedOutputStream.m92182s0(iM92195e);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            m92203y(codedOutputStream, fieldTypeMo92220D, it3.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m92205a(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.isRepeated()) {
            wg3.m206174a("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m92201w(fielddescriptortype.mo92220D(), obj);
        Object objM92208h = m92208h(fielddescriptortype);
        if (objM92208h == null) {
            arrayList = new ArrayList();
            this.f66319a.m92302o(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) objM92208h;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FieldSet<FieldDescriptorType> clone() {
        C15409d<FieldDescriptorType, Object> c15409d;
        FieldSet<FieldDescriptorType> fieldSetM92199t = m92199t();
        int i = 0;
        while (true) {
            int iM92297i = this.f66319a.m92297i();
            c15409d = this.f66319a;
            if (i >= iM92297i) {
                break;
            }
            Map.Entry<K, Object> entryM92296h = c15409d.m92296h(i);
            fieldSetM92199t.m92219v((FieldDescriptorLite) entryM92296h.getKey(), entryM92296h.getValue());
            i++;
        }
        Iterator it = c15409d.m92298j().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            fieldSetM92199t.m92219v((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSetM92199t.f66321c = this.f66321c;
        return fieldSetM92199t;
    }

    /* JADX INFO: renamed from: c */
    public final Object m92207c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: h */
    public Object m92208h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f66319a.get(fielddescriptortype);
        return obj instanceof LazyField ? ((LazyField) obj).m92240e() : obj;
    }

    /* JADX INFO: renamed from: i */
    public Object m92209i(FieldDescriptorType fielddescriptortype, int i) {
        if (!fielddescriptortype.isRepeated()) {
            wg3.m206174a("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objM92208h = m92208h(fielddescriptortype);
        if (objM92208h != null) {
            return ((List) objM92208h).get(i);
        }
        onl.m168333a();
        return null;
    }

    /* JADX INFO: renamed from: j */
    public int m92210j(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            wg3.m206174a("getRepeatedField() can only be called on repeated fields.");
            return 0;
        }
        Object objM92208h = m92208h(fielddescriptortype);
        if (objM92208h == null) {
            return 0;
        }
        return ((List) objM92208h).size();
    }

    /* JADX INFO: renamed from: k */
    public int m92211k() {
        C15409d<FieldDescriptorType, Object> c15409d;
        int i = 0;
        int iM92196f = 0;
        while (true) {
            int iM92297i = this.f66319a.m92297i();
            c15409d = this.f66319a;
            if (i >= iM92297i) {
                break;
            }
            Map.Entry<K, Object> entryM92296h = c15409d.m92296h(i);
            iM92196f += m92196f((FieldDescriptorLite) entryM92296h.getKey(), entryM92296h.getValue());
            i++;
        }
        Iterator it = c15409d.m92298j().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM92196f += m92196f((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iM92196f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m92212m(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            return this.f66319a.get(fielddescriptortype) != null;
        }
        wg3.m206174a("hasField() can only be called on non-repeated fields.");
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m92213n() {
        int i = 0;
        while (true) {
            int iM92297i = this.f66319a.m92297i();
            C15409d<FieldDescriptorType, Object> c15409d = this.f66319a;
            if (i >= iM92297i) {
                Iterator it = c15409d.m92298j().iterator();
                while (it.hasNext()) {
                    if (!m92214o((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m92214o(c15409d.m92296h(i))) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m92214o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.mo92221E() == WireFormat.JavaType.MESSAGE) {
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
                    wg3.m206174a("Wrong object type used with protocol message reflection.");
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
    public Iterator<Map.Entry<FieldDescriptorType, Object>> m92215p() {
        boolean z = this.f66321c;
        C15409d<FieldDescriptorType, Object> c15409d = this.f66319a;
        return z ? new LazyField.C15398c(c15409d.entrySet().iterator()) : c15409d.entrySet().iterator();
    }

    /* JADX INFO: renamed from: q */
    public void m92216q() {
        if (this.f66320b) {
            return;
        }
        this.f66319a.mo92301m();
        this.f66320b = true;
    }

    /* JADX INFO: renamed from: r */
    public void m92217r(FieldSet<FieldDescriptorType> fieldSet) {
        C15409d<FieldDescriptorType, Object> c15409d;
        int i = 0;
        while (true) {
            int iM92297i = fieldSet.f66319a.m92297i();
            c15409d = fieldSet.f66319a;
            if (i >= iM92297i) {
                break;
            }
            m92218s(c15409d.m92296h(i));
            i++;
        }
        Iterator it = c15409d.m92298j().iterator();
        while (it.hasNext()) {
            m92218s((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m92218s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).m92240e();
        }
        if (key.isRepeated()) {
            Object objM92208h = m92208h(key);
            if (objM92208h == null) {
                objM92208h = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM92208h).add(m92207c(it.next()));
            }
            this.f66319a.m92302o(key, objM92208h);
            return;
        }
        if (key.mo92221E() != WireFormat.JavaType.MESSAGE) {
            this.f66319a.m92302o(key, m92207c(value));
            return;
        }
        Object objM92208h2 = m92208h(key);
        if (objM92208h2 == null) {
            this.f66319a.m92302o(key, m92207c(value));
        } else {
            this.f66319a.m92302o(key, key.mo92222l(((MessageLite) objM92208h2).toBuilder(), (MessageLite) value).build());
        }
    }

    /* JADX INFO: renamed from: v */
    public void m92219v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            m92201w(fielddescriptortype.mo92220D(), obj);
        } else {
            if (!(obj instanceof List)) {
                wg3.m206174a("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m92201w(fielddescriptortype.mo92220D(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f66321c = true;
        }
        this.f66319a.m92302o(fielddescriptortype, obj);
    }

    public FieldSet() {
    }
}
