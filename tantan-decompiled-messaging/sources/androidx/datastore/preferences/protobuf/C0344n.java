package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p149l.cza0;
import p149l.j850;
import p149l.qkq0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0344n extends AbstractC0342m<GeneratedMessageLite.C0295d> {

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

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342m
    /* JADX INFO: renamed from: a */
    public int mo2249a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.C0295d) entry.getKey()).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342m
    /* JADX INFO: renamed from: b */
    public Object mo2250b(C0340l c0340l, InterfaceC0321b0 interfaceC0321b0, int i) {
        return c0340l.m2228a(interfaceC0321b0, i);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342m
    /* JADX INFO: renamed from: c */
    public C0347p<GeneratedMessageLite.C0295d> mo2251c(Object obj) {
        return ((GeneratedMessageLite.AbstractC0294c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342m
    /* JADX INFO: renamed from: d */
    public C0347p<GeneratedMessageLite.C0295d> mo2252d(Object obj) {
        return ((GeneratedMessageLite.AbstractC0294c) obj).m1661C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342m
    /* JADX INFO: renamed from: e */
    public boolean mo2253e(InterfaceC0321b0 interfaceC0321b0) {
        return interfaceC0321b0 instanceof GeneratedMessageLite.AbstractC0294c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342m
    /* JADX INFO: renamed from: f */
    public void mo2254f(Object obj) {
        mo2251c(obj).m2314t();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342m
    /* JADX INFO: renamed from: g */
    public <UT, UB> UB mo2255g(InterfaceC0333h0 interfaceC0333h0, Object obj, C0340l c0340l, C0347p<GeneratedMessageLite.C0295d> c0347p, UB ub, AbstractC0341l0<UT, UB> abstractC0341l0) throws IOException {
        Object objM2306i;
        ArrayList arrayList;
        GeneratedMessageLite.C0296e c0296e = (GeneratedMessageLite.C0296e) obj;
        int iM1669c = c0296e.m1669c();
        Object objValueOf = null;
        if (c0296e.f1578b.isRepeated() && c0296e.f1578b.isPacked()) {
            switch (a.f1724a[c0296e.m1667a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo2001t(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo1998q(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo1944A(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo2007z(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo1993m(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo1949F(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo1995n(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo1979f(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo1950G(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo2005x(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo1991l(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo1985i(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo1969a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC0333h0.mo1945B(arrayList);
                    ub = (UB) C0337j0.m2196z(iM1669c, arrayList, c0296e.f1578b.m1666b(), ub, abstractC0341l0);
                    break;
                default:
                    j850.m140190a("Type cannot be packed: ", c0296e.f1578b.mo1662D());
                    return null;
            }
            c0347p.m2317x(c0296e.f1578b, arrayList);
            return ub;
        }
        if (c0296e.m1667a() != WireFormat.FieldType.ENUM) {
            switch (a.f1724a[c0296e.m1667a().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(interfaceC0333h0.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(interfaceC0333h0.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(interfaceC0333h0.mo2002u());
                    break;
                case 4:
                    objValueOf = Long.valueOf(interfaceC0333h0.mo1987j());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(interfaceC0333h0.mo1947D());
                    break;
                case 6:
                    objValueOf = Long.valueOf(interfaceC0333h0.mo2004w());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(interfaceC0333h0.mo1951H());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(interfaceC0333h0.mo2006y());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(interfaceC0333h0.mo1973c());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(interfaceC0333h0.mo1957N());
                    break;
                case 11:
                    objValueOf = Long.valueOf(interfaceC0333h0.mo1971b());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(interfaceC0333h0.mo1977e());
                    break;
                case 13:
                    objValueOf = Long.valueOf(interfaceC0333h0.mo1954K());
                    break;
                case 14:
                    qkq0.m175383a("Shouldn't reach here.");
                    return null;
                case 15:
                    objValueOf = interfaceC0333h0.mo1981g();
                    break;
                case 16:
                    objValueOf = interfaceC0333h0.mo1955L();
                    break;
                case 17:
                    objValueOf = interfaceC0333h0.mo1952I(c0296e.m1668b().getClass(), c0340l);
                    break;
                case 18:
                    objValueOf = interfaceC0333h0.mo1989k(c0296e.m1668b().getClass(), c0340l);
                    break;
            }
        } else {
            int iMo1947D = interfaceC0333h0.mo1947D();
            if (c0296e.f1578b.m1666b().findValueByNumber(iMo1947D) == null) {
                return (UB) C0337j0.m2151L(iM1669c, iMo1947D, ub, abstractC0341l0);
            }
            objValueOf = Integer.valueOf(iMo1947D);
        }
        if (c0296e.m1670d()) {
            c0347p.m2303a(c0296e.f1578b, objValueOf);
            return ub;
        }
        int i = a.f1724a[c0296e.m1667a().ordinal()];
        if ((i == 17 || i == 18) && (objM2306i = c0347p.m2306i(c0296e.f1578b)) != null) {
            objValueOf = C0350s.m2346h(objM2306i, objValueOf);
        }
        c0347p.m2317x(c0296e.f1578b, objValueOf);
        return ub;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342m
    /* JADX INFO: renamed from: h */
    public void mo2256h(InterfaceC0333h0 interfaceC0333h0, Object obj, C0340l c0340l, C0347p<GeneratedMessageLite.C0295d> c0347p) throws IOException {
        GeneratedMessageLite.C0296e c0296e = (GeneratedMessageLite.C0296e) obj;
        c0347p.m2317x(c0296e.f1578b, interfaceC0333h0.mo1989k(c0296e.m1668b().getClass(), c0340l));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342m
    /* JADX INFO: renamed from: i */
    public void mo2257i(ByteString byteString, Object obj, C0340l c0340l, C0347p<GeneratedMessageLite.C0295d> c0347p) throws IOException {
        GeneratedMessageLite.C0296e c0296e = (GeneratedMessageLite.C0296e) obj;
        InterfaceC0321b0 interfaceC0321b0BuildPartial = c0296e.m1668b().newBuilderForType().buildPartial();
        AbstractC0326e abstractC0326eM1943P = AbstractC0326e.m1943P(ByteBuffer.wrap(byteString.toByteArray()), true);
        cza0.m109400a().m109401b(interfaceC0321b0BuildPartial, abstractC0326eM1943P, c0340l);
        c0347p.m2317x(c0296e.f1578b, interfaceC0321b0BuildPartial);
        if (abstractC0326eM1943P.mo1996o() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0342m
    /* JADX INFO: renamed from: j */
    public void mo2258j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.C0295d c0295d = (GeneratedMessageLite.C0295d) entry.getKey();
        if (!c0295d.isRepeated()) {
            switch (a.f1724a[c0295d.mo1662D().ordinal()]) {
                case 1:
                    writer.mo1753E(c0295d.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.mo1760L(c0295d.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.mo1757I(c0295d.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.mo1768e(c0295d.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.mo1770g(c0295d.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.mo1779p(c0295d.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.mo1766c(c0295d.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.mo1780q(c0295d.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    writer.mo1777n(c0295d.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    writer.mo1781r(c0295d.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    writer.mo1749A(c0295d.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.mo1763O(c0295d.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.mo1775l(c0295d.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.mo1770g(c0295d.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.mo1771h(c0295d.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.mo1767d(c0295d.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    writer.mo1752D(c0295d.getNumber(), entry.getValue(), cza0.m109400a().m109403d(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.mo1773j(c0295d.getNumber(), entry.getValue(), cza0.m109400a().m109403d(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f1724a[c0295d.mo1662D().ordinal()]) {
            case 1:
                C0337j0.m2155P(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 2:
                C0337j0.m2159T(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 3:
                C0337j0.m2162W(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 4:
                C0337j0.m2175e0(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 5:
                C0337j0.m2161V(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 6:
                C0337j0.m2158S(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 7:
                C0337j0.m2157R(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 8:
                C0337j0.m2153N(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 9:
                C0337j0.m2173d0(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 10:
                C0337j0.m2164Y(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 11:
                C0337j0.m2165Z(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 12:
                C0337j0.m2167a0(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 13:
                C0337j0.m2169b0(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 14:
                C0337j0.m2161V(c0295d.getNumber(), (List) entry.getValue(), writer, c0295d.isPacked());
                break;
            case 15:
                C0337j0.m2154O(c0295d.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                C0337j0.m2171c0(c0295d.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    C0337j0.m2160U(c0295d.getNumber(), (List) entry.getValue(), writer, cza0.m109400a().m109403d(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    C0337j0.m2163X(c0295d.getNumber(), (List) entry.getValue(), writer, cza0.m109400a().m109403d(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
