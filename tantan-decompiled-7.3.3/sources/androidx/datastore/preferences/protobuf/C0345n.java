package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p153l.g7b0;
import p153l.qg50;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0345n extends AbstractC0343m<GeneratedMessageLite.C0296d> {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1724a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f1724a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1724a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1724a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1724a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1724a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1724a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1724a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1724a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1724a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1724a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1724a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1724a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1724a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1724a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1724a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1724a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1724a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f1724a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0343m
    /* JADX INFO: renamed from: a */
    public int mo2250a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.C0296d) entry.getKey()).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0343m
    /* JADX INFO: renamed from: b */
    public Object mo2251b(C0341l c0341l, InterfaceC0322b0 interfaceC0322b0, int i) {
        return c0341l.m2229a(interfaceC0322b0, i);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0343m
    /* JADX INFO: renamed from: c */
    public C0348p<GeneratedMessageLite.C0296d> mo2252c(Object obj) {
        return ((GeneratedMessageLite.AbstractC0295c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0343m
    /* JADX INFO: renamed from: d */
    public C0348p<GeneratedMessageLite.C0296d> mo2253d(Object obj) {
        return ((GeneratedMessageLite.AbstractC0295c) obj).m1662C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0343m
    /* JADX INFO: renamed from: e */
    public boolean mo2254e(InterfaceC0322b0 interfaceC0322b0) {
        return interfaceC0322b0 instanceof GeneratedMessageLite.AbstractC0295c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0343m
    /* JADX INFO: renamed from: f */
    public void mo2255f(Object obj) {
        mo2252c(obj).m2315t();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0343m
    /* JADX INFO: renamed from: g */
    public <UT, UB> UB mo2256g(InterfaceC0334h0 interfaceC0334h0, Object obj, C0341l c0341l, C0348p<GeneratedMessageLite.C0296d> c0348p, UB ub, AbstractC0342l0<UT, UB> abstractC0342l0) throws IOException {
        Object objM2307i;
        ArrayList arrayList;
        GeneratedMessageLite.C0297e c0297e = (GeneratedMessageLite.C0297e) obj;
        int iM1670c = c0297e.m1670c();
        Object objValueOf = null;
        if (c0297e.f1578b.isRepeated() && c0297e.f1578b.isPacked()) {
            switch (a.f1724a[c0297e.m1668a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo2002t(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo1999q(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo1945A(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo2008z(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo1994m(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo1950F(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo1996n(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo1980f(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo1951G(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo2006x(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo1992l(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo1986i(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo1970a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC0334h0.mo1946B(arrayList);
                    ub = (UB) C0338j0.m2197z(iM1670c, arrayList, c0297e.f1578b.m1667b(), ub, abstractC0342l0);
                    break;
                default:
                    qg50.m176437a("Type cannot be packed: ", c0297e.f1578b.mo1663D());
                    return null;
            }
            c0348p.m2318x(c0297e.f1578b, arrayList);
            return ub;
        }
        if (c0297e.m1668a() != WireFormat.FieldType.ENUM) {
            switch (a.f1724a[c0297e.m1668a().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(interfaceC0334h0.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(interfaceC0334h0.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(interfaceC0334h0.mo2003u());
                    break;
                case 4:
                    objValueOf = Long.valueOf(interfaceC0334h0.mo1988j());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(interfaceC0334h0.mo1948D());
                    break;
                case 6:
                    objValueOf = Long.valueOf(interfaceC0334h0.mo2005w());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(interfaceC0334h0.mo1952H());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(interfaceC0334h0.mo2007y());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(interfaceC0334h0.mo1974c());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(interfaceC0334h0.mo1958N());
                    break;
                case 11:
                    objValueOf = Long.valueOf(interfaceC0334h0.mo1972b());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(interfaceC0334h0.mo1978e());
                    break;
                case 13:
                    objValueOf = Long.valueOf(interfaceC0334h0.mo1955K());
                    break;
                case 14:
                    wtq0.m207906a("Shouldn't reach here.");
                    return null;
                case 15:
                    objValueOf = interfaceC0334h0.mo1982g();
                    break;
                case 16:
                    objValueOf = interfaceC0334h0.mo1956L();
                    break;
                case 17:
                    objValueOf = interfaceC0334h0.mo1953I(c0297e.m1669b().getClass(), c0341l);
                    break;
                case 18:
                    objValueOf = interfaceC0334h0.mo1990k(c0297e.m1669b().getClass(), c0341l);
                    break;
            }
        } else {
            int iMo1948D = interfaceC0334h0.mo1948D();
            if (c0297e.f1578b.m1667b().findValueByNumber(iMo1948D) == null) {
                return (UB) C0338j0.m2152L(iM1670c, iMo1948D, ub, abstractC0342l0);
            }
            objValueOf = Integer.valueOf(iMo1948D);
        }
        if (c0297e.m1671d()) {
            c0348p.m2304a(c0297e.f1578b, objValueOf);
            return ub;
        }
        int i = a.f1724a[c0297e.m1668a().ordinal()];
        if ((i == 17 || i == 18) && (objM2307i = c0348p.m2307i(c0297e.f1578b)) != null) {
            objValueOf = C0351s.m2347h(objM2307i, objValueOf);
        }
        c0348p.m2318x(c0297e.f1578b, objValueOf);
        return ub;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0343m
    /* JADX INFO: renamed from: h */
    public void mo2257h(InterfaceC0334h0 interfaceC0334h0, Object obj, C0341l c0341l, C0348p<GeneratedMessageLite.C0296d> c0348p) throws IOException {
        GeneratedMessageLite.C0297e c0297e = (GeneratedMessageLite.C0297e) obj;
        c0348p.m2318x(c0297e.f1578b, interfaceC0334h0.mo1990k(c0297e.m1669b().getClass(), c0341l));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0343m
    /* JADX INFO: renamed from: i */
    public void mo2258i(ByteString byteString, Object obj, C0341l c0341l, C0348p<GeneratedMessageLite.C0296d> c0348p) throws IOException {
        GeneratedMessageLite.C0297e c0297e = (GeneratedMessageLite.C0297e) obj;
        InterfaceC0322b0 interfaceC0322b0BuildPartial = c0297e.m1669b().newBuilderForType().buildPartial();
        AbstractC0327e abstractC0327eM1944P = AbstractC0327e.m1944P(ByteBuffer.wrap(byteString.toByteArray()), true);
        g7b0.m129308a().m129309b(interfaceC0322b0BuildPartial, abstractC0327eM1944P, c0341l);
        c0348p.m2318x(c0297e.f1578b, interfaceC0322b0BuildPartial);
        if (abstractC0327eM1944P.mo1997o() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0343m
    /* JADX INFO: renamed from: j */
    public void mo2259j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.C0296d c0296d = (GeneratedMessageLite.C0296d) entry.getKey();
        if (!c0296d.isRepeated()) {
            switch (a.f1724a[c0296d.mo1663D().ordinal()]) {
                case 1:
                    writer.mo1754E(c0296d.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.mo1761L(c0296d.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.mo1758I(c0296d.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.mo1769e(c0296d.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.mo1771g(c0296d.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.mo1780p(c0296d.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.mo1767c(c0296d.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.mo1781q(c0296d.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    writer.mo1778n(c0296d.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    writer.mo1782r(c0296d.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    writer.mo1750A(c0296d.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.mo1764O(c0296d.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.mo1776l(c0296d.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.mo1771g(c0296d.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.mo1772h(c0296d.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.mo1768d(c0296d.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    writer.mo1753D(c0296d.getNumber(), entry.getValue(), g7b0.m129308a().m129311d(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.mo1774j(c0296d.getNumber(), entry.getValue(), g7b0.m129308a().m129311d(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f1724a[c0296d.mo1663D().ordinal()]) {
            case 1:
                C0338j0.m2156P(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 2:
                C0338j0.m2160T(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 3:
                C0338j0.m2163W(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 4:
                C0338j0.m2176e0(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 5:
                C0338j0.m2162V(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 6:
                C0338j0.m2159S(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 7:
                C0338j0.m2158R(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 8:
                C0338j0.m2154N(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 9:
                C0338j0.m2174d0(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 10:
                C0338j0.m2165Y(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 11:
                C0338j0.m2166Z(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 12:
                C0338j0.m2168a0(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 13:
                C0338j0.m2170b0(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 14:
                C0338j0.m2162V(c0296d.getNumber(), (List) entry.getValue(), writer, c0296d.isPacked());
                break;
            case 15:
                C0338j0.m2155O(c0296d.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                C0338j0.m2172c0(c0296d.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    C0338j0.m2161U(c0296d.getNumber(), (List) entry.getValue(), writer, g7b0.m129308a().m129311d(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    C0338j0.m2164X(c0296d.getNumber(), (List) entry.getValue(), writer, g7b0.m129308a().m129311d(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
