package p149l;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.container.CreationTime;
import com.google.android.exoplayer2.container.Mp4LocationData;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class z21 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f201116a = vck0.m197887r0("OpusHead");

    /* JADX INFO: renamed from: l.z21$a */
    public static final class C21596a {

        /* JADX INFO: renamed from: a */
        public final int f201117a;

        /* JADX INFO: renamed from: b */
        public int f201118b;

        /* JADX INFO: renamed from: c */
        public int f201119c;

        /* JADX INFO: renamed from: d */
        public long f201120d;

        /* JADX INFO: renamed from: e */
        public final boolean f201121e;

        /* JADX INFO: renamed from: f */
        public final d860 f201122f;

        /* JADX INFO: renamed from: g */
        public final d860 f201123g;

        /* JADX INFO: renamed from: h */
        public int f201124h;

        /* JADX INFO: renamed from: i */
        public int f201125i;

        public C21596a(d860 d860Var, d860 d860Var2, boolean z) throws ParserException {
            this.f201123g = d860Var;
            this.f201122f = d860Var2;
            this.f201121e = z;
            d860Var2.m110292U(12);
            this.f201117a = d860Var2.m110283L();
            d860Var.m110292U(12);
            this.f201125i = d860Var.m110283L();
            vqf.m199482a(d860Var.m110311q() == 1, "first_chunk must be 1");
            this.f201118b = -1;
        }

        /* JADX INFO: renamed from: a */
        public boolean m216858a() {
            int i = this.f201118b + 1;
            this.f201118b = i;
            if (i == this.f201117a) {
                return false;
            }
            boolean z = this.f201121e;
            d860 d860Var = this.f201122f;
            this.f201120d = z ? d860Var.m110284M() : d860Var.m110281J();
            if (this.f201118b == this.f201124h) {
                this.f201119c = this.f201123g.m110283L();
                this.f201123g.m110293V(4);
                int i2 = this.f201125i - 1;
                this.f201125i = i2;
                this.f201124h = i2 > 0 ? this.f201123g.m110283L() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.z21$b */
    public static final class C21597b {

        /* JADX INFO: renamed from: a */
        public final String f201126a;

        /* JADX INFO: renamed from: b */
        public final byte[] f201127b;

        /* JADX INFO: renamed from: c */
        public final long f201128c;

        /* JADX INFO: renamed from: d */
        public final long f201129d;

        public C21597b(String str, byte[] bArr, long j, long j2) {
            this.f201126a = str;
            this.f201127b = bArr;
            this.f201128c = j;
            this.f201129d = j2;
        }
    }

    /* JADX INFO: renamed from: l.z21$c */
    public static final class C21598c {

        /* JADX INFO: renamed from: a */
        public final Metadata f201130a;

        /* JADX INFO: renamed from: b */
        public final long f201131b;

        public C21598c(Metadata metadata, long j) {
            this.f201130a = metadata;
            this.f201131b = j;
        }
    }

    /* JADX INFO: renamed from: l.z21$d */
    public interface InterfaceC21599d {
        /* JADX INFO: renamed from: a */
        int mo216863a();

        /* JADX INFO: renamed from: b */
        int mo216864b();

        /* JADX INFO: renamed from: c */
        int mo216865c();
    }

    /* JADX INFO: renamed from: l.z21$e */
    public static final class C21600e {

        /* JADX INFO: renamed from: a */
        public final v5j0[] f201132a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public C1871k f201133b;

        /* JADX INFO: renamed from: c */
        public int f201134c;

        /* JADX INFO: renamed from: d */
        public int f201135d = 0;

        public C21600e(int i) {
            this.f201132a = new v5j0[i];
        }
    }

    /* JADX INFO: renamed from: l.z21$f */
    public static final class C21601f implements InterfaceC21599d {

        /* JADX INFO: renamed from: a */
        public final int f201136a;

        /* JADX INFO: renamed from: b */
        public final int f201137b;

        /* JADX INFO: renamed from: c */
        public final d860 f201138c;

        public C21601f(y21.C21285b c21285b, C1871k c1871k) {
            d860 d860Var = c21285b.f195480b;
            this.f201138c = d860Var;
            d860Var.m110292U(12);
            int iM110283L = d860Var.m110283L();
            if ("audio/raw".equals(c1871k.f7748l)) {
                int iM197861h0 = vck0.m197861h0(c1871k.f7729A, c1871k.f7761y);
                if (iM110283L == 0 || iM110283L % iM197861h0 != 0) {
                    jwv.m143689i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iM197861h0 + ", stsz sample size: " + iM110283L);
                    iM110283L = iM197861h0;
                }
            }
            this.f201136a = iM110283L == 0 ? -1 : iM110283L;
            this.f201137b = d860Var.m110283L();
        }

        @Override // p149l.z21.InterfaceC21599d
        /* JADX INFO: renamed from: a */
        public int mo216863a() {
            int i = this.f201136a;
            return i == -1 ? this.f201138c.m110283L() : i;
        }

        @Override // p149l.z21.InterfaceC21599d
        /* JADX INFO: renamed from: b */
        public int mo216864b() {
            return this.f201137b;
        }

        @Override // p149l.z21.InterfaceC21599d
        /* JADX INFO: renamed from: c */
        public int mo216865c() {
            return this.f201136a;
        }
    }

    /* JADX INFO: renamed from: l.z21$g */
    public static final class C21602g implements InterfaceC21599d {

        /* JADX INFO: renamed from: a */
        public final d860 f201139a;

        /* JADX INFO: renamed from: b */
        public final int f201140b;

        /* JADX INFO: renamed from: c */
        public final int f201141c;

        /* JADX INFO: renamed from: d */
        public int f201142d;

        /* JADX INFO: renamed from: e */
        public int f201143e;

        public C21602g(y21.C21285b c21285b) {
            d860 d860Var = c21285b.f195480b;
            this.f201139a = d860Var;
            d860Var.m110292U(12);
            this.f201141c = d860Var.m110283L() & 255;
            this.f201140b = d860Var.m110283L();
        }

        @Override // p149l.z21.InterfaceC21599d
        /* JADX INFO: renamed from: a */
        public int mo216863a() {
            int i = this.f201141c;
            if (i == 8) {
                return this.f201139a.m110279H();
            }
            if (i == 16) {
                return this.f201139a.m110285N();
            }
            int i2 = this.f201142d;
            this.f201142d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f201143e & 15;
            }
            int iM110279H = this.f201139a.m110279H();
            this.f201143e = iM110279H;
            return (iM110279H & 240) >> 4;
        }

        @Override // p149l.z21.InterfaceC21599d
        /* JADX INFO: renamed from: b */
        public int mo216864b() {
            return this.f201140b;
        }

        @Override // p149l.z21.InterfaceC21599d
        /* JADX INFO: renamed from: c */
        public int mo216865c() {
            return -1;
        }
    }

    /* JADX INFO: renamed from: l.z21$h */
    public static final class C21603h {

        /* JADX INFO: renamed from: a */
        public final int f201144a;

        /* JADX INFO: renamed from: b */
        public final long f201145b;

        /* JADX INFO: renamed from: c */
        public final int f201146c;

        public C21603h(int i, long j, int i2) {
            this.f201144a = i;
            this.f201145b = j;
            this.f201146c = i2;
        }
    }

    /* JADX INFO: renamed from: l.z21$i */
    public static final class C21604i {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Metadata f201147a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Metadata f201148b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Metadata f201149c;

        public C21604i(@Nullable Metadata metadata, @Nullable Metadata metadata2, @Nullable Metadata metadata3) {
            this.f201147a = metadata;
            this.f201148b = metadata2;
            this.f201149c = metadata3;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public static u5j0 m216826A(y21.C21284a c21284a, y21.C21285b c21285b, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long[] jArr;
        long[] jArr2;
        y21.C21284a c21284aM212346f;
        Pair<long[], long[]> pairM216840i;
        y21.C21284a c21284a2 = (y21.C21284a) p11.m167011e(c21284a.m212346f(1835297121));
        int iM216836e = m216836e(m216843l(((y21.C21285b) p11.m167011e(c21284a2.m212347g(1751411826))).f195480b));
        if (iM216836e == -1) {
            return null;
        }
        C21603h c21603hM216857z = m216857z(((y21.C21285b) p11.m167011e(c21284a.m212347g(1953196132))).f195480b);
        long j2 = j == -9223372036854775807L ? c21603hM216857z.f201145b : j;
        long j3 = m216848q(c21285b.f195480b).f201131b;
        long jM197832W0 = j2 != -9223372036854775807L ? vck0.m197832W0(j2, 1000000L, j3) : -9223372036854775807L;
        y21.C21284a c21284a3 = (y21.C21284a) p11.m167011e(((y21.C21284a) p11.m167011e(c21284a2.m212346f(1835626086))).m212346f(1937007212));
        Pair<Long, String> pairM216845n = m216845n(((y21.C21285b) p11.m167011e(c21284a2.m212347g(1835296868))).f195480b);
        y21.C21285b c21285bM212347g = c21284a3.m212347g(1937011556);
        if (c21285bM212347g == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        C21600e c21600eM216855x = m216855x(c21285bM212347g.f195480b, c21603hM216857z.f201144a, c21603hM216857z.f201146c, (String) pairM216845n.second, drmInitData, z2);
        if (z || (c21284aM212346f = c21284a.m212346f(1701082227)) == null || (pairM216840i = m216840i(c21284aM212346f)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairM216840i.first;
            jArr2 = (long[]) pairM216840i.second;
            jArr = jArr3;
        }
        if (c21600eM216855x.f201133b == null) {
            return null;
        }
        return new u5j0(c21603hM216857z.f201144a, iM216836e, ((Long) pairM216845n.first).longValue(), j3, jM197832W0, c21600eM216855x.f201133b, c21600eM216855x.f201135d, c21600eM216855x.f201132a, c21600eM216855x.f201134c, jArr, jArr2);
    }

    /* JADX INFO: renamed from: B */
    public static List<q6j0> m216827B(y21.C21284a c21284a, pij pijVar, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2, gaj<u5j0, u5j0> gajVar) throws ParserException {
        u5j0 u5j0VarApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c21284a.f195479d.size(); i++) {
            y21.C21284a c21284a2 = c21284a.f195479d.get(i);
            if (c21284a2.f195476a == 1953653099 && (u5j0VarApply = gajVar.apply(m216826A(c21284a2, (y21.C21285b) p11.m167011e(c21284a.m212347g(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(m216854w(u5j0VarApply, (y21.C21284a) p11.m167011e(((y21.C21284a) p11.m167011e(((y21.C21284a) p11.m167011e(c21284a2.m212346f(1835297121))).m212346f(1835626086))).m212346f(1937007212)), pijVar));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public static C21604i m216828C(y21.C21285b c21285b) {
        d860 d860Var = c21285b.f195480b;
        d860Var.m110292U(8);
        Metadata metadataM216829D = null;
        Metadata metadataM216853v = null;
        Metadata metadataM216831F = null;
        while (d860Var.m110295a() >= 8) {
            int iM110300f = d860Var.m110300f();
            int iM110311q = d860Var.m110311q();
            int iM110311q2 = d860Var.m110311q();
            if (iM110311q2 == 1835365473) {
                d860Var.m110292U(iM110300f);
                metadataM216829D = m216829D(d860Var, iM110300f + iM110311q);
            } else if (iM110311q2 == 1936553057) {
                d860Var.m110292U(iM110300f);
                metadataM216853v = m216853v(d860Var, iM110300f + iM110311q);
            } else if (iM110311q2 == -1451722374) {
                metadataM216831F = m216831F(d860Var);
            }
            d860Var.m110292U(iM110300f + iM110311q);
        }
        return new C21604i(metadataM216829D, metadataM216853v, metadataM216831F);
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public static Metadata m216829D(d860 d860Var, int i) {
        d860Var.m110293V(8);
        m216837f(d860Var);
        while (d860Var.m110300f() < i) {
            int iM110300f = d860Var.m110300f();
            int iM110311q = d860Var.m110311q();
            if (d860Var.m110311q() == 1768715124) {
                d860Var.m110292U(iM110300f);
                return m216844m(d860Var, iM110300f + iM110311q);
            }
            d860Var.m110292U(iM110300f + iM110311q);
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static void m216830E(d860 d860Var, int i, int i2, int i3, int i4, int i5, @Nullable DrmInitData drmInitData, C21600e c21600e, int i6) throws ParserException {
        String str;
        int i7;
        float f;
        List<byte[]> list;
        int i8;
        int i9;
        String str2;
        int i10;
        int i11;
        int i12;
        String str3;
        int i13 = i2;
        int i14 = i3;
        DrmInitData drmInitDataM9898c = drmInitData;
        C21600e c21600e2 = c21600e;
        d860Var.m110292U(i13 + 16);
        d860Var.m110293V(16);
        int iM110285N = d860Var.m110285N();
        int iM110285N2 = d860Var.m110285N();
        d860Var.m110293V(50);
        int iM110300f = d860Var.m110300f();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, v5j0> pairM216851t = m216851t(d860Var, i13, i14);
            if (pairM216851t != null) {
                iIntValue = ((Integer) pairM216851t.first).intValue();
                drmInitDataM9898c = drmInitDataM9898c == null ? null : drmInitDataM9898c.m9898c(((v5j0) pairM216851t.second).f180058b);
                c21600e2.f201132a[i6] = (v5j0) pairM216851t.second;
            }
            d860Var.m110292U(iM110300f);
        }
        String str4 = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP;
        if (iIntValue == 1831958048) {
            str = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG;
        } else {
            str = iIntValue == 1211250227 ? DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP : null;
        }
        float fM216849r = 1.0f;
        String str5 = null;
        List<byte[]> listM15686of = null;
        byte[] bArrM216850s = null;
        int i15 = -1;
        int iM111099h = -1;
        int i16 = -1;
        int iM111100i = -1;
        ByteBuffer byteBuffer = null;
        C21597b c21597bM216841j = null;
        boolean z = false;
        while (iM110300f - i13 < i14) {
            d860Var.m110292U(iM110300f);
            int iM110300f2 = d860Var.m110300f();
            int iM110311q = d860Var.m110311q();
            if (iM110311q == 0 && d860Var.m110300f() - i2 == i14) {
                break;
            }
            vqf.m199482a(iM110311q > 0, "childAtomSize must be positive");
            int iM110311q2 = d860Var.m110311q();
            if (iM110311q2 == 1635148611) {
                vqf.m199482a(str == null, null);
                d860Var.m110292U(iM110300f2 + 8);
                ip1 ip1VarM137437b = ip1.m137437b(d860Var);
                listM15686of = ip1VarM137437b.f114242a;
                c21600e2.f201134c = ip1VarM137437b.f114243b;
                if (!z) {
                    fM216849r = ip1VarM137437b.f114249h;
                }
                str5 = ip1VarM137437b.f114250i;
                i10 = ip1VarM137437b.f114246e;
                i11 = ip1VarM137437b.f114247f;
                i12 = ip1VarM137437b.f114248g;
                str3 = YtVideoEncoder.MIME_TYPE;
            } else {
                if (iM110311q2 == 1752589123) {
                    vqf.m199482a(str == null, null);
                    d860Var.m110292U(iM110300f2 + 8);
                    ozk ozkVarM166888a = ozk.m166888a(d860Var);
                    listM15686of = ozkVarM166888a.f146474a;
                    c21600e2.f201134c = ozkVarM166888a.f146475b;
                    if (!z) {
                        fM216849r = ozkVarM166888a.f146481h;
                    }
                    str5 = ozkVarM166888a.f146482i;
                    i10 = ozkVarM166888a.f146478e;
                    i11 = ozkVarM166888a.f146479f;
                    i12 = ozkVarM166888a.f146480g;
                    str3 = "video/hevc";
                } else {
                    if (iM110311q2 == 1685480259 || iM110311q2 == 1685485123) {
                        drmInitDataM9898c = drmInitDataM9898c;
                        i7 = iM110300f;
                        iIntValue = iIntValue;
                        str4 = str4;
                        f = fM216849r;
                        list = listM15686of;
                        i8 = iM111099h;
                        i9 = iM111100i;
                        o5e o5eVarM162779a = o5e.m162779a(d860Var);
                        if (o5eVarM162779a != null) {
                            str5 = o5eVarM162779a.f141893c;
                            str = "video/dolby-vision";
                        }
                    } else {
                        i7 = iM110300f;
                        if (iM110311q2 == 1987076931) {
                            vqf.m199482a(str == null, null);
                            str2 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            d860Var.m110292U(iM110300f2 + 12);
                            d860Var.m110293V(2);
                            boolean z2 = (d860Var.m110279H() & 1) != 0;
                            int iM110279H = d860Var.m110279H();
                            int iM110279H2 = d860Var.m110279H();
                            iM111099h = de5.m111099h(iM110279H);
                            i16 = z2 ? 1 : 2;
                            iM111100i = de5.m111100i(iM110279H2);
                        } else if (iM110311q2 == 1635135811) {
                            vqf.m199482a(str == null, null);
                            str2 = "video/av01";
                        } else if (iM110311q2 == 1668050025) {
                            ByteBuffer byteBufferM216832a = byteBuffer == null ? m216832a() : byteBuffer;
                            byteBufferM216832a.position(21);
                            byteBufferM216832a.putShort(d860Var.m110275D());
                            byteBufferM216832a.putShort(d860Var.m110275D());
                            byteBuffer = byteBufferM216832a;
                        } else if (iM110311q2 == 1835295606) {
                            ByteBuffer byteBufferM216832a2 = byteBuffer == null ? m216832a() : byteBuffer;
                            short sM110275D = d860Var.m110275D();
                            short sM110275D2 = d860Var.m110275D();
                            short sM110275D3 = d860Var.m110275D();
                            short sM110275D4 = d860Var.m110275D();
                            short sM110275D5 = d860Var.m110275D();
                            short sM110275D6 = d860Var.m110275D();
                            short sM110275D7 = d860Var.m110275D();
                            List<byte[]> list2 = listM15686of;
                            short sM110275D8 = d860Var.m110275D();
                            long jM110281J = d860Var.m110281J();
                            long jM110281J2 = d860Var.m110281J();
                            byteBufferM216832a2.position(1);
                            byteBufferM216832a2.putShort(sM110275D5);
                            byteBufferM216832a2.putShort(sM110275D6);
                            byteBufferM216832a2.putShort(sM110275D);
                            byteBufferM216832a2.putShort(sM110275D2);
                            byteBufferM216832a2.putShort(sM110275D3);
                            byteBufferM216832a2.putShort(sM110275D4);
                            byteBufferM216832a2.putShort(sM110275D7);
                            byteBufferM216832a2.putShort(sM110275D8);
                            byteBufferM216832a2.putShort((short) (jM110281J / 10000));
                            byteBufferM216832a2.putShort((short) (jM110281J2 / 10000));
                            byteBuffer = byteBufferM216832a2;
                            listM15686of = list2;
                            fM216849r = fM216849r;
                        } else {
                            drmInitDataM9898c = drmInitDataM9898c;
                            iIntValue = iIntValue;
                            str4 = str4;
                            f = fM216849r;
                            list = listM15686of;
                            if (iM110311q2 == 1681012275) {
                                vqf.m199482a(str == null, null);
                                str = str4;
                            } else if (iM110311q2 == 1702061171) {
                                vqf.m199482a(str == null, null);
                                c21597bM216841j = m216841j(d860Var, iM110300f2);
                                String str6 = c21597bM216841j.f201126a;
                                byte[] bArr = c21597bM216841j.f201127b;
                                listM15686of = bArr != null ? ImmutableList.m15686of(bArr) : list;
                                str = str6;
                                fM216849r = f;
                            } else if (iM110311q2 == 1885434736) {
                                fM216849r = m216849r(d860Var, iM110300f2);
                                listM15686of = list;
                                z = true;
                            } else if (iM110311q2 == 1937126244) {
                                bArrM216850s = m216850s(d860Var, iM110300f2, iM110311q);
                            } else if (iM110311q2 == 1936995172) {
                                int iM110279H3 = d860Var.m110279H();
                                d860Var.m110293V(3);
                                if (iM110279H3 == 0) {
                                    int iM110279H4 = d860Var.m110279H();
                                    if (iM110279H4 == 0) {
                                        i15 = 0;
                                    } else if (iM110279H4 == 1) {
                                        i15 = 1;
                                    } else if (iM110279H4 == 2) {
                                        i15 = 2;
                                    } else if (iM110279H4 == 3) {
                                        i15 = 3;
                                    }
                                }
                            } else {
                                i8 = iM111099h;
                                if (iM110311q2 == 1668246642) {
                                    i9 = iM111100i;
                                    if (i8 == -1 && i9 == -1) {
                                        int iM110311q3 = d860Var.m110311q();
                                        if (iM110311q3 == 1852009592 || iM110311q3 == 1852009571) {
                                            int iM110285N3 = d860Var.m110285N();
                                            int iM110285N4 = d860Var.m110285N();
                                            d860Var.m110293V(2);
                                            boolean z3 = iM110311q == 19 && (d860Var.m110279H() & 128) != 0;
                                            iM111099h = de5.m111099h(iM110285N3);
                                            i16 = z3 ? 1 : 2;
                                            iM111100i = de5.m111100i(iM110285N4);
                                        } else {
                                            jwv.m143689i("AtomParsers", "Unsupported color type: " + y21.m212341a(iM110311q3));
                                        }
                                    }
                                } else {
                                    i9 = iM111100i;
                                }
                            }
                            listM15686of = list;
                            fM216849r = f;
                        }
                        str = str2;
                    }
                    iM111100i = i9;
                    iM111099h = i8;
                    listM15686of = list;
                    fM216849r = f;
                }
                iM110300f = i7 + iM110311q;
                i13 = i2;
                i14 = i3;
                c21600e2 = c21600e;
                iIntValue = iIntValue;
                str4 = str4;
                drmInitDataM9898c = drmInitDataM9898c;
            }
            iM111100i = i12;
            iM111099h = i10;
            i7 = iM110300f;
            i16 = i11;
            str = str3;
            iM110300f = i7 + iM110311q;
            i13 = i2;
            i14 = i3;
            c21600e2 = c21600e;
            iIntValue = iIntValue;
            str4 = str4;
            drmInitDataM9898c = drmInitDataM9898c;
        }
        DrmInitData drmInitData2 = drmInitDataM9898c;
        float f2 = fM216849r;
        List<byte[]> list3 = listM15686of;
        int i17 = iM111099h;
        int i18 = iM111100i;
        if (str == null) {
            return;
        }
        C1871k.b bVarM10328O = new C1871k.b().m10333T(i4).m10346g0(str).m10324K(str5).m10353n0(iM110285N).m10332S(iM110285N2).m10342c0(f2).m10345f0(i5).m10343d0(bArrM216850s).m10349j0(i15).m10335V(list3).m10328O(drmInitData2);
        int i19 = i16;
        if (i17 != -1 || i19 != -1 || i18 != -1 || byteBuffer != null) {
            bVarM10328O.m10325L(new de5(i17, i19, i18, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (c21597bM216841j != null) {
            bVarM10328O.m10322I(Ints.m16468m(c21597bM216841j.f201128c)).m10341b0(Ints.m16468m(c21597bM216841j.f201129d));
        }
        c21600e.f201133b = bVarM10328O.m10320G();
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public static Metadata m216831F(d860 d860Var) {
        short sM110275D = d860Var.m110275D();
        d860Var.m110293V(2);
        String strM110276E = d860Var.m110276E(sM110275D);
        int iMax = Math.max(strM110276E.lastIndexOf(43), strM110276E.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(strM110276E.substring(0, iMax)), Float.parseFloat(strM110276E.substring(iMax, strM110276E.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ByteBuffer m216832a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m216833b(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[vck0.m197884q(4, 0, length)] && jArr[vck0.m197884q(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m216834c(int i) {
        return i != 1;
    }

    /* JADX INFO: renamed from: d */
    public static int m216835d(d860 d860Var, int i, int i2, int i3) throws ParserException {
        int iM110300f = d860Var.m110300f();
        vqf.m199482a(iM110300f >= i2, null);
        while (iM110300f - i2 < i3) {
            d860Var.m110292U(iM110300f);
            int iM110311q = d860Var.m110311q();
            vqf.m199482a(iM110311q > 0, "childAtomSize must be positive");
            if (d860Var.m110311q() == i) {
                return iM110300f;
            }
            iM110300f += iM110311q;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static int m216836e(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    /* JADX INFO: renamed from: f */
    public static void m216837f(d860 d860Var) {
        int iM110300f = d860Var.m110300f();
        d860Var.m110293V(4);
        if (d860Var.m110311q() != 1751411826) {
            iM110300f += 4;
        }
        d860Var.m110292U(iM110300f);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0173  */
    /* JADX WARN: Code duplicated, block: B:102:0x0176  */
    /* JADX WARN: Code duplicated, block: B:105:0x0185  */
    /* JADX WARN: Code duplicated, block: B:108:0x019c  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:173:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x016a  */
    /* JADX INFO: renamed from: g */
    public static void m216838g(d860 d860Var, int i, int i2, int i3, int i4, String str, boolean z, @Nullable DrmInitData drmInitData, C21600e c21600e, int i5) throws ParserException {
        int iM110285N;
        int iM110280I;
        int iM110311q;
        int iM110283L;
        String str2;
        String str3;
        int i6;
        String str4;
        C21597b c21597bM216841j;
        String str5;
        List<byte[]> listM15686of;
        int iM110311q2;
        boolean z2;
        int iM110311q3;
        int iM216835d;
        byte[] bArr;
        boolean z3;
        int i7 = i2;
        int i8 = i3;
        DrmInitData drmInitDataM9898c = drmInitData;
        d860Var.m110292U(i7 + 16);
        if (z) {
            iM110285N = d860Var.m110285N();
            d860Var.m110293V(6);
        } else {
            d860Var.m110293V(8);
            iM110285N = 0;
        }
        if (iM110285N == 0 || iM110285N == 1) {
            int iM110285N2 = d860Var.m110285N();
            d860Var.m110293V(6);
            iM110280I = d860Var.m110280I();
            d860Var.m110292U(d860Var.m110300f() - 4);
            iM110311q = d860Var.m110311q();
            if (iM110285N == 1) {
                d860Var.m110293V(16);
            }
            iM110283L = iM110285N2;
        } else {
            if (iM110285N != 2) {
                return;
            }
            d860Var.m110293V(16);
            iM110280I = (int) Math.round(d860Var.m110309o());
            iM110283L = d860Var.m110283L();
            d860Var.m110293V(20);
            iM110311q = 0;
        }
        int iM110300f = d860Var.m110300f();
        int iIntValue = i;
        if (iIntValue == 1701733217) {
            Pair<Integer, v5j0> pairM216851t = m216851t(d860Var, i7, i8);
            if (pairM216851t != null) {
                iIntValue = ((Integer) pairM216851t.first).intValue();
                drmInitDataM9898c = drmInitDataM9898c == null ? null : drmInitDataM9898c.m9898c(((v5j0) pairM216851t.second).f180058b);
                c21600e.f201132a[i5] = (v5j0) pairM216851t.second;
            }
            d860Var.m110292U(iM110300f);
        }
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP;
        } else {
            if (iIntValue != 1935767394) {
                str3 = "audio/raw";
                if (iIntValue == 1819304813 || iIntValue == 1936684916) {
                    i6 = 2;
                } else if (iIntValue == 1953984371) {
                    i6 = 268435456;
                } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                    str2 = DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG;
                } else if (iIntValue == 1835557169) {
                    str2 = "audio/mha1";
                } else if (iIntValue == 1835560241) {
                    str2 = "audio/mhm1";
                } else if (iIntValue == 1634492771) {
                    str2 = "audio/alac";
                } else if (iIntValue == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (iIntValue == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (iIntValue == 1332770163) {
                    str2 = "audio/opus";
                } else if (iIntValue == 1716281667) {
                    str2 = "audio/flac";
                } else if (iIntValue == 1835823201) {
                    str2 = "audio/true-hd";
                } else {
                    i6 = -1;
                    str3 = null;
                }
                str4 = str3;
                c21597bM216841j = null;
                str5 = null;
                listM15686of = null;
                while (iM110300f - i7 < i8) {
                    d860Var.m110292U(iM110300f);
                    iM110311q2 = d860Var.m110311q();
                    if (iM110311q2 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    vqf.m199482a(z2, "childAtomSize must be positive");
                    iM110311q3 = d860Var.m110311q();
                    if (iM110311q3 == 1835557187) {
                        int i9 = iM110311q2 - 13;
                        byte[] bArr2 = new byte[i9];
                        d860Var.m110292U(iM110300f + 13);
                        d860Var.m110306l(bArr2, 0, i9);
                        listM15686of = ImmutableList.m15686of(bArr2);
                    } else {
                        if (iM110311q3 != 1702061171 || (z && iM110311q3 == 2002876005)) {
                            if (iM110311q3 == 1702061171) {
                                iM216835d = iM110300f;
                            } else {
                                iM216835d = m216835d(d860Var, 1702061171, iM110300f, iM110311q2);
                            }
                            if (iM216835d != -1) {
                                c21597bM216841j = m216841j(d860Var, iM216835d);
                                str4 = c21597bM216841j.f201126a;
                                bArr = c21597bM216841j.f201127b;
                                if (bArr != null) {
                                    if ("audio/mp4a-latm".equals(str4)) {
                                        C21594z1.b bVarM216778f = C21594z1.m216778f(bArr);
                                        iM110280I = bVarM216778f.f201034a;
                                        iM110283L = bVarM216778f.f201035b;
                                        str5 = bVarM216778f.f201036c;
                                    }
                                    listM15686of = ImmutableList.m15686of(bArr);
                                }
                            }
                        } else {
                            if (iM110311q3 == 1684103987) {
                                d860Var.m110292U(iM110300f + 8);
                                c21600e.f201133b = C16561e9.m115322d(d860Var, Integer.toString(i4), str, drmInitDataM9898c);
                            } else if (iM110311q3 == 1684366131) {
                                d860Var.m110292U(iM110300f + 8);
                                c21600e.f201133b = C16561e9.m115326h(d860Var, Integer.toString(i4), str, drmInitDataM9898c);
                            } else if (iM110311q3 == 1684103988) {
                                d860Var.m110292U(iM110300f + 8);
                                c21600e.f201133b = C17507i9.m134994b(d860Var, Integer.toString(i4), str, drmInitDataM9898c);
                            } else if (iM110311q3 == 1684892784) {
                                if (iM110311q <= 0) {
                                    throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + iM110311q, null);
                                }
                                iM110280I = iM110311q;
                                iM110283L = 2;
                            } else if (iM110311q3 == 1684305011 || iM110311q3 == 1969517683) {
                                z3 = false;
                                c21600e.f201133b = new C1871k.b().m10333T(i4).m10346g0(str4).m10323J(iM110283L).m10347h0(iM110280I).m10328O(drmInitDataM9898c).m10337X(str).m10320G();
                            } else if (iM110311q3 == 1682927731) {
                                int i10 = iM110311q2 - 8;
                                byte[] bArr3 = f201116a;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i10);
                                d860Var.m110292U(iM110300f + 8);
                                d860Var.m110306l(bArrCopyOf, bArr3.length, i10);
                                listM15686of = rx50.m181470a(bArrCopyOf);
                            } else if (iM110311q3 == 1684425825) {
                                byte[] bArr4 = new byte[iM110311q2 - 8];
                                bArr4[0] = 102;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                d860Var.m110292U(iM110300f + 12);
                                d860Var.m110306l(bArr4, 4, iM110311q2 - 12);
                                listM15686of = ImmutableList.m15686of(bArr4);
                            } else if (iM110311q3 == 1634492771) {
                                int i11 = iM110311q2 - 12;
                                byte[] bArr5 = new byte[i11];
                                d860Var.m110292U(iM110300f + 12);
                                d860Var.m110306l(bArr5, 0, i11);
                                Pair<Integer, Integer> pairM149206h = lb5.m149206h(bArr5);
                                int iIntValue2 = ((Integer) pairM149206h.first).intValue();
                                int iIntValue3 = ((Integer) pairM149206h.second).intValue();
                                listM15686of = ImmutableList.m15686of(bArr5);
                                iM110280I = iIntValue2;
                                iM110283L = iIntValue3;
                            } else {
                                z3 = false;
                            }
                            z3 = false;
                        }
                        iM110300f += iM110311q2;
                        i7 = i2;
                        i8 = i3;
                    }
                    iM110300f += iM110311q2;
                    i7 = i2;
                    i8 = i3;
                }
                if (c21600e.f201133b == null || str4 == null) {
                }
                C1871k.b bVarM10337X = new C1871k.b().m10333T(i4).m10346g0(str4).m10324K(str5).m10323J(iM110283L).m10347h0(iM110280I).m10340a0(i6).m10335V(listM15686of).m10328O(drmInitDataM9898c).m10337X(str);
                if (c21597bM216841j != null) {
                    bVarM10337X.m10322I(Ints.m16468m(c21597bM216841j.f201128c)).m10341b0(Ints.m16468m(c21597bM216841j.f201129d));
                }
                c21600e.f201133b = bVarM10337X.m10320G();
                return;
            }
            str2 = "audio/amr-wb";
        }
        str3 = str2;
        i6 = -1;
        str4 = str3;
        c21597bM216841j = null;
        str5 = null;
        listM15686of = null;
        while (iM110300f - i7 < i8) {
            d860Var.m110292U(iM110300f);
            iM110311q2 = d860Var.m110311q();
            if (iM110311q2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            vqf.m199482a(z2, "childAtomSize must be positive");
            iM110311q3 = d860Var.m110311q();
            if (iM110311q3 == 1835557187) {
                int i12 = iM110311q2 - 13;
                byte[] bArr6 = new byte[i12];
                d860Var.m110292U(iM110300f + 13);
                d860Var.m110306l(bArr6, 0, i12);
                listM15686of = ImmutableList.m15686of(bArr6);
            } else {
                if (iM110311q3 != 1702061171) {
                    if (iM110311q3 == 1702061171) {
                        iM216835d = iM110300f;
                    } else {
                        iM216835d = m216835d(d860Var, 1702061171, iM110300f, iM110311q2);
                    }
                    if (iM216835d != -1) {
                        c21597bM216841j = m216841j(d860Var, iM216835d);
                        str4 = c21597bM216841j.f201126a;
                        bArr = c21597bM216841j.f201127b;
                        if (bArr != null) {
                            if ("audio/mp4a-latm".equals(str4)) {
                                C21594z1.b bVarM216778f2 = C21594z1.m216778f(bArr);
                                iM110280I = bVarM216778f2.f201034a;
                                iM110283L = bVarM216778f2.f201035b;
                                str5 = bVarM216778f2.f201036c;
                            }
                            listM15686of = ImmutableList.m15686of(bArr);
                        }
                    }
                } else {
                    if (iM110311q3 == 1702061171) {
                        iM216835d = iM110300f;
                    } else {
                        iM216835d = m216835d(d860Var, 1702061171, iM110300f, iM110311q2);
                    }
                    if (iM216835d != -1) {
                        c21597bM216841j = m216841j(d860Var, iM216835d);
                        str4 = c21597bM216841j.f201126a;
                        bArr = c21597bM216841j.f201127b;
                        if (bArr != null) {
                            if ("audio/mp4a-latm".equals(str4)) {
                                C21594z1.b bVarM216778f3 = C21594z1.m216778f(bArr);
                                iM110280I = bVarM216778f3.f201034a;
                                iM110283L = bVarM216778f3.f201035b;
                                str5 = bVarM216778f3.f201036c;
                            }
                            listM15686of = ImmutableList.m15686of(bArr);
                        }
                    }
                }
                iM110300f += iM110311q2;
                i7 = i2;
                i8 = i3;
            }
            iM110300f += iM110311q2;
            i7 = i2;
            i8 = i3;
        }
        if (c21600e.f201133b == null) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Pair<Integer, v5j0> m216839h(d860 d860Var, int i, int i2) throws ParserException {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String strM110276E = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            d860Var.m110292U(i3);
            int iM110311q = d860Var.m110311q();
            int iM110311q2 = d860Var.m110311q();
            if (iM110311q2 == 1718775137) {
                numValueOf = Integer.valueOf(d860Var.m110311q());
            } else if (iM110311q2 == 1935894637) {
                d860Var.m110293V(4);
                strM110276E = d860Var.m110276E(4);
            } else if (iM110311q2 == 1935894633) {
                i4 = i3;
                i5 = iM110311q;
            }
            i3 += iM110311q;
        }
        if (!"cenc".equals(strM110276E) && !"cbc1".equals(strM110276E) && !"cens".equals(strM110276E) && !"cbcs".equals(strM110276E)) {
            return null;
        }
        vqf.m199482a(numValueOf != null, "frma atom is mandatory");
        vqf.m199482a(i4 != -1, "schi atom is mandatory");
        v5j0 v5j0VarM216852u = m216852u(d860Var, i4, i5, strM110276E);
        vqf.m199482a(v5j0VarM216852u != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (v5j0) vck0.m197866j(v5j0VarM216852u));
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static Pair<long[], long[]> m216840i(y21.C21284a c21284a) {
        y21.C21285b c21285bM212347g = c21284a.m212347g(1701606260);
        if (c21285bM212347g == null) {
            return null;
        }
        d860 d860Var = c21285bM212347g.f195480b;
        d860Var.m110292U(8);
        int iM212343c = y21.m212343c(d860Var.m110311q());
        int iM110283L = d860Var.m110283L();
        long[] jArr = new long[iM110283L];
        long[] jArr2 = new long[iM110283L];
        for (int i = 0; i < iM110283L; i++) {
            jArr[i] = iM212343c == 1 ? d860Var.m110284M() : d860Var.m110281J();
            jArr2[i] = iM212343c == 1 ? d860Var.m110272A() : d860Var.m110311q();
            if (d860Var.m110275D() != 1) {
                ig3.m135964a("Unsupported media rate.");
                return null;
            }
            d860Var.m110293V(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX INFO: renamed from: j */
    public static C21597b m216841j(d860 d860Var, int i) {
        d860Var.m110292U(i + 12);
        d860Var.m110293V(1);
        m216842k(d860Var);
        d860Var.m110293V(2);
        int iM110279H = d860Var.m110279H();
        if ((iM110279H & 128) != 0) {
            d860Var.m110293V(2);
        }
        if ((iM110279H & 64) != 0) {
            d860Var.m110293V(d860Var.m110279H());
        }
        if ((iM110279H & 32) != 0) {
            d860Var.m110293V(2);
        }
        d860Var.m110293V(1);
        m216842k(d860Var);
        String strM157526h = n200.m157526h(d860Var.m110279H());
        if (DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG.equals(strM157526h) || "audio/vnd.dts".equals(strM157526h) || "audio/vnd.dts.hd".equals(strM157526h)) {
            return new C21597b(strM157526h, null, -1L, -1L);
        }
        d860Var.m110293V(4);
        long jM110281J = d860Var.m110281J();
        long jM110281J2 = d860Var.m110281J();
        d860Var.m110293V(1);
        int iM216842k = m216842k(d860Var);
        long j = jM110281J2;
        byte[] bArr = new byte[iM216842k];
        d860Var.m110306l(bArr, 0, iM216842k);
        if (j <= 0) {
            j = -1;
        }
        return new C21597b(strM157526h, bArr, j, jM110281J > 0 ? jM110281J : -1L);
    }

    /* JADX INFO: renamed from: k */
    public static int m216842k(d860 d860Var) {
        int iM110279H = d860Var.m110279H();
        int i = iM110279H & 127;
        while ((iM110279H & 128) == 128) {
            iM110279H = d860Var.m110279H();
            i = (i << 7) | (iM110279H & 127);
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public static int m216843l(d860 d860Var) {
        d860Var.m110292U(16);
        return d860Var.m110311q();
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static Metadata m216844m(d860 d860Var, int i) {
        d860Var.m110293V(8);
        ArrayList arrayList = new ArrayList();
        while (d860Var.m110300f() < i) {
            Metadata.Entry entryM157318c = n100.m157318c(d860Var);
            if (entryM157318c != null) {
                arrayList.add(entryM157318c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public static Pair<Long, String> m216845n(d860 d860Var) {
        d860Var.m110292U(8);
        int iM212343c = y21.m212343c(d860Var.m110311q());
        d860Var.m110293V(iM212343c == 0 ? 8 : 16);
        long jM110281J = d860Var.m110281J();
        d860Var.m110293V(iM212343c == 0 ? 4 : 8);
        int iM110285N = d860Var.m110285N();
        return Pair.create(Long.valueOf(jM110281J), "" + ((char) (((iM110285N >> 10) & 31) + 96)) + ((char) (((iM110285N >> 5) & 31) + 96)) + ((char) ((iM110285N & 31) + 96)));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static Metadata m216846o(y21.C21284a c21284a) {
        y21.C21285b c21285bM212347g = c21284a.m212347g(1751411826);
        y21.C21285b c21285bM212347g2 = c21284a.m212347g(1801812339);
        y21.C21285b c21285bM212347g3 = c21284a.m212347g(1768715124);
        if (c21285bM212347g == null || c21285bM212347g2 == null || c21285bM212347g3 == null || m216843l(c21285bM212347g.f195480b) != 1835299937) {
            return null;
        }
        d860 d860Var = c21285bM212347g2.f195480b;
        d860Var.m110292U(12);
        int iM110311q = d860Var.m110311q();
        String[] strArr = new String[iM110311q];
        for (int i = 0; i < iM110311q; i++) {
            int iM110311q2 = d860Var.m110311q();
            d860Var.m110293V(4);
            strArr[i] = d860Var.m110276E(iM110311q2 - 8);
        }
        d860 d860Var2 = c21285bM212347g3.f195480b;
        d860Var2.m110292U(8);
        ArrayList arrayList = new ArrayList();
        while (d860Var2.m110295a() > 8) {
            int iM110300f = d860Var2.m110300f();
            int iM110311q3 = d860Var2.m110311q();
            int iM110311q4 = d860Var2.m110311q() - 1;
            if (iM110311q4 < 0 || iM110311q4 >= iM110311q) {
                jwv.m143689i("AtomParsers", "Skipped metadata with unknown key index: " + iM110311q4);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryM157321f = n100.m157321f(d860Var2, iM110300f + iM110311q3, strArr[iM110311q4]);
                if (mdtaMetadataEntryM157321f != null) {
                    arrayList.add(mdtaMetadataEntryM157321f);
                }
            }
            d860Var2.m110292U(iM110300f + iM110311q3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX INFO: renamed from: p */
    public static void m216847p(d860 d860Var, int i, int i2, int i3, C21600e c21600e) {
        d860Var.m110292U(i2 + 16);
        if (i == 1835365492) {
            d860Var.m110273B();
            String strM110273B = d860Var.m110273B();
            if (strM110273B != null) {
                c21600e.f201133b = new C1871k.b().m10333T(i3).m10346g0(strM110273B).m10320G();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static C21598c m216848q(d860 d860Var) {
        long jM110281J;
        d860Var.m110292U(8);
        if (y21.m212343c(d860Var.m110311q()) == 0) {
            jM110281J = d860Var.m110281J();
            d860Var.m110293V(4);
        } else {
            long jM110272A = d860Var.m110272A();
            d860Var.m110293V(8);
            jM110281J = jM110272A;
        }
        return new C21598c(new Metadata(new CreationTime((jM110281J - 2082844800) * 1000)), d860Var.m110281J());
    }

    /* JADX INFO: renamed from: r */
    public static float m216849r(d860 d860Var, int i) {
        d860Var.m110292U(i + 8);
        return d860Var.m110283L() / d860Var.m110283L();
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static byte[] m216850s(d860 d860Var, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            d860Var.m110292U(i3);
            int iM110311q = d860Var.m110311q();
            if (d860Var.m110311q() == 1886547818) {
                return Arrays.copyOfRange(d860Var.m110299e(), i3, iM110311q + i3);
            }
            i3 += iM110311q;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public static Pair<Integer, v5j0> m216851t(d860 d860Var, int i, int i2) throws ParserException {
        Pair<Integer, v5j0> pairM216839h;
        int iM110300f = d860Var.m110300f();
        while (iM110300f - i < i2) {
            d860Var.m110292U(iM110300f);
            int iM110311q = d860Var.m110311q();
            vqf.m199482a(iM110311q > 0, "childAtomSize must be positive");
            if (d860Var.m110311q() == 1936289382 && (pairM216839h = m216839h(d860Var, iM110300f, iM110311q)) != null) {
                return pairM216839h;
            }
            iM110300f += iM110311q;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static v5j0 m216852u(d860 d860Var, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            d860Var.m110292U(i5);
            int iM110311q = d860Var.m110311q();
            if (d860Var.m110311q() == 1952804451) {
                int iM212343c = y21.m212343c(d860Var.m110311q());
                d860Var.m110293V(1);
                if (iM212343c == 0) {
                    d860Var.m110293V(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int iM110279H = d860Var.m110279H();
                    i3 = iM110279H & 15;
                    i4 = (iM110279H & 240) >> 4;
                }
                boolean z = d860Var.m110279H() == 1;
                int iM110279H2 = d860Var.m110279H();
                byte[] bArr2 = new byte[16];
                d860Var.m110306l(bArr2, 0, 16);
                if (z && iM110279H2 == 0) {
                    int iM110279H3 = d860Var.m110279H();
                    bArr = new byte[iM110279H3];
                    d860Var.m110306l(bArr, 0, iM110279H3);
                }
                return new v5j0(z, str, iM110279H2, bArr2, i4, i3, bArr);
            }
            i5 += iM110311q;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public static Metadata m216853v(d860 d860Var, int i) {
        d860Var.m110293V(12);
        while (d860Var.m110300f() < i) {
            int iM110300f = d860Var.m110300f();
            int iM110311q = d860Var.m110311q();
            if (d860Var.m110311q() == 1935766900) {
                if (iM110311q < 14) {
                    return null;
                }
                d860Var.m110293V(5);
                int iM110279H = d860Var.m110279H();
                if (iM110279H != 12 && iM110279H != 13) {
                    return null;
                }
                float f = iM110279H == 12 ? 240.0f : 120.0f;
                d860Var.m110293V(1);
                return new Metadata(new SmtaMetadataEntry(f, d860Var.m110279H()));
            }
            d860Var.m110292U(iM110300f + iM110311q);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [int] */
    /* JADX WARN: Type inference failed for: r12v16, types: [int] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /* JADX INFO: renamed from: w */
    public static q6j0 m216854w(u5j0 u5j0Var, y21.C21284a c21284a, pij pijVar) throws ParserException {
        InterfaceC21599d c21602g;
        boolean z;
        int iM110283L;
        int iM110283L2;
        int iM110283L3;
        boolean z2;
        long j;
        long[] jArrCopyOf;
        int i;
        int i2;
        long j2;
        boolean z3;
        int[] iArr;
        long[] jArr;
        ?? r4;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        long j3;
        int[] iArr6;
        int[] iArr7;
        int i3;
        boolean z4;
        int i4;
        int i5;
        y21.C21285b c21285bM212347g = c21284a.m212347g(1937011578);
        if (c21285bM212347g != null) {
            c21602g = new C21601f(c21285bM212347g, u5j0Var.f174724f);
        } else {
            y21.C21285b c21285bM212347g2 = c21284a.m212347g(1937013298);
            if (c21285bM212347g2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            c21602g = new C21602g(c21285bM212347g2);
        }
        int iMo216864b = c21602g.mo216864b();
        if (iMo216864b == 0) {
            return new q6j0(u5j0Var, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        y21.C21285b c21285bM212347g3 = c21284a.m212347g(1937007471);
        if (c21285bM212347g3 == null) {
            c21285bM212347g3 = (y21.C21285b) p11.m167011e(c21284a.m212347g(1668232756));
            z = true;
        } else {
            z = false;
        }
        d860 d860Var = c21285bM212347g3.f195480b;
        d860 d860Var2 = ((y21.C21285b) p11.m167011e(c21284a.m212347g(1937011555))).f195480b;
        d860 d860Var3 = ((y21.C21285b) p11.m167011e(c21284a.m212347g(1937011827))).f195480b;
        y21.C21285b c21285bM212347g4 = c21284a.m212347g(1937011571);
        d860 d860Var4 = c21285bM212347g4 != null ? c21285bM212347g4.f195480b : null;
        y21.C21285b c21285bM212347g5 = c21284a.m212347g(1668576371);
        d860 d860Var5 = c21285bM212347g5 != null ? c21285bM212347g5.f195480b : null;
        C21596a c21596a = new C21596a(d860Var2, d860Var, z);
        d860Var3.m110292U(12);
        int iM110283L4 = d860Var3.m110283L() - 1;
        int iM110283L5 = d860Var3.m110283L();
        int iM110283L6 = d860Var3.m110283L();
        if (d860Var5 != null) {
            d860Var5.m110292U(12);
            iM110283L = d860Var5.m110283L();
        } else {
            iM110283L = 0;
        }
        if (d860Var4 != null) {
            d860Var4.m110292U(12);
            iM110283L3 = d860Var4.m110283L();
            if (iM110283L3 > 0) {
                iM110283L2 = d860Var4.m110283L() - 1;
                z2 = false;
            } else {
                iM110283L2 = -1;
                z2 = false;
                d860Var4 = null;
            }
        } else {
            iM110283L2 = -1;
            iM110283L3 = 0;
            z2 = false;
        }
        int iMo216865c = c21602g.mo216865c();
        String str = u5j0Var.f174724f.f7748l;
        boolean z5 = (iMo216865c == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iM110283L4 == 0 && iM110283L == 0 && iM110283L3 == 0)) ? z2 ? 1 : 0 : true;
        InterfaceC21599d interfaceC21599d = c21602g;
        if (z5) {
            int i6 = c21596a.f201117a;
            long[] jArr2 = new long[i6];
            int[] iArr8 = new int[i6];
            while (c21596a.m216858a()) {
                int i7 = c21596a.f201118b;
                jArr2[i7] = c21596a.f201120d;
                iArr8[i7] = c21596a.f201119c;
            }
            qoi.C19549b c19549bM175749a = qoi.m175749a(iMo216865c, jArr2, iArr8, iM110283L6);
            long[] jArr3 = c19549bM175749a.f155576a;
            iArr = c19549bM175749a.f155577b;
            int i8 = c19549bM175749a.f155578c;
            long[] jArr4 = c19549bM175749a.f155579d;
            int[] iArr9 = c19549bM175749a.f155580e;
            j2 = c19549bM175749a.f155581f;
            jArr = jArr3;
            r4 = i8;
            jArrCopyOf = jArr4;
            iArr2 = iArr9;
            j = 0;
        } else {
            long[] jArr5 = new long[iMo216864b];
            j = 0;
            int[] iArrCopyOf = new int[iMo216864b];
            jArrCopyOf = new long[iMo216864b];
            d860 d860Var6 = d860Var5;
            int[] iArrCopyOf2 = new int[iMo216864b];
            d860 d860Var7 = d860Var4;
            int iM110283L7 = iM110283L2;
            int i9 = z2 ? 1 : 0;
            int iM110311q = i9;
            int i10 = iM110311q == true ? 1 : 0;
            int i11 = i10;
            long j4 = 0;
            long j5 = 0;
            int i12 = iM110283L;
            int iM110311q2 = iM110283L6;
            int i13 = iM110283L5;
            int i14 = iM110283L4;
            int i15 = i11 == true ? 1 : 0;
            while (true) {
                if (i9 >= iMo216864b) {
                    boolean z6 = iMo216864b == true ? 1 : 0;
                    i = i13;
                    i2 = i10;
                    break;
                }
                long j6 = j5;
                int i16 = i10;
                boolean zM216858a = true;
                while (i16 == 0) {
                    zM216858a = c21596a.m216858a();
                    if (!zM216858a) {
                        break;
                    }
                    int i17 = i13;
                    long j7 = c21596a.f201120d;
                    i16 = c21596a.f201119c;
                    j6 = j7;
                    i13 = i17;
                    iM110311q2 = iM110311q2;
                    iMo216864b = iMo216864b == true ? 1 : 0;
                }
                int i18 = iMo216864b;
                i = i13;
                int i19 = iM110311q2;
                if (!zM216858a) {
                    jwv.m143689i("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr5, i9);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i9);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i9);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i9);
                    jArr5 = jArrCopyOf2;
                    iMo216864b = i9;
                    i2 = i16;
                    break;
                }
                if (d860Var6 != null) {
                    int iM110283L8 = i11 == true ? 1 : 0;
                    while (iM110283L8 == 0 && i12 > 0) {
                        iM110283L8 = d860Var6.m110283L();
                        iM110311q = d860Var6.m110311q();
                        i12--;
                    }
                    i11 = iM110283L8 - 1;
                }
                jArr5[i9] = j6;
                int iMo216863a = interfaceC21599d.mo216863a();
                iArrCopyOf[i9] = iMo216863a;
                if (iMo216863a > i15) {
                    i15 = iMo216863a;
                }
                jArrCopyOf[i9] = j4 + ((long) iM110311q);
                iArrCopyOf2[i9] = d860Var7 == null ? 1 : z2 ? 1 : 0;
                if (i9 == iM110283L7) {
                    iArrCopyOf2[i9] = 1;
                    iM110283L3--;
                    if (iM110283L3 > 0) {
                        iM110283L7 = ((d860) p11.m167011e(d860Var7)).m110283L() - 1;
                    }
                }
                j4 += (long) i19;
                int iM110283L9 = i - 1;
                if (iM110283L9 != 0 || i14 <= 0) {
                    iM110311q2 = i19;
                } else {
                    iM110283L9 = d860Var3.m110283L();
                    i14--;
                    iM110311q2 = d860Var3.m110311q();
                }
                i13 = iM110283L9;
                long j8 = j6 + ((long) iArrCopyOf[i9]);
                i10 = i16 - 1;
                i9++;
                j5 = j8;
                iMo216864b = i18 == true ? 1 : 0;
            }
            j2 = j4 + ((long) iM110311q);
            if (d860Var6 == null) {
                z3 = true;
                break;
            }
            while (true) {
                if (i12 <= 0) {
                    z3 = true;
                    break;
                }
                if (d860Var6.m110283L() != 0) {
                    z3 = z2 ? 1 : 0;
                    break;
                }
                d860Var6.m110311q();
                i12--;
            }
            if (iM110283L3 != 0 || i != 0 || i2 != 0 || i14 != 0 || i11 != 0 || !z3) {
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                sb.append(u5j0Var.f174719a);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(iM110283L3);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i2);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i14);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i11 == true ? 1 : 0 ? 1 : 0);
                sb.append(!z3 ? ", ctts invalid" : "");
                jwv.m143689i("AtomParsers", sb.toString());
            }
            iArr = iArrCopyOf;
            jArr = jArr5;
            r4 = i15 == true ? 1 : 0;
            iArr2 = iArrCopyOf2;
        }
        long j9 = j2;
        long jM197832W0 = vck0.m197832W0(j9, 1000000L, u5j0Var.f174721c);
        long[] jArr6 = u5j0Var.f174726h;
        if (jArr6 == null) {
            vck0.m197836Y0(jArrCopyOf, 1000000L, u5j0Var.f174721c);
            return new q6j0(u5j0Var, jArr, iArr, r4 == true ? 1 : 0, jArrCopyOf, iArr2, jM197832W0);
        }
        int[] iArr10 = iArr;
        int i20 = iMo216864b;
        int[] iArr11 = iArr10;
        if (jArr6.length == 1 && u5j0Var.f174720b == 1 && jArrCopyOf.length >= 2) {
            long j10 = ((long[]) p11.m167011e(u5j0Var.f174727i))[z2 ? 1 : 0];
            long jM197832W1 = j10 + vck0.m197832W0(u5j0Var.f174726h[z2 ? 1 : 0], u5j0Var.f174721c, u5j0Var.f174722d);
            long[] jArr7 = jArr;
            long[] jArr8 = jArrCopyOf;
            jArrCopyOf = jArr8;
            if (m216833b(jArr8, j9, j10, jM197832W1)) {
                long jM197832W2 = vck0.m197832W0(j10 - jArrCopyOf[z2 ? 1 : 0], u5j0Var.f174724f.f7762z, u5j0Var.f174721c);
                long jM197832W3 = vck0.m197832W0(j9 - jM197832W1, u5j0Var.f174724f.f7762z, u5j0Var.f174721c);
                if (jM197832W2 != j || jM197832W3 != j) {
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j9 = j9;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j9 = j9;
                    if (jM197832W2 <= 2147483647L && jM197832W3 <= 2147483647L) {
                        pijVar.f149573a = (int) jM197832W2;
                        pijVar.f149574b = (int) jM197832W3;
                        vck0.m197836Y0(jArrCopyOf, 1000000L, u5j0Var.f174721c);
                        return new q6j0(u5j0Var, jArr7, iArr11, r4 == true ? 1 : 0, jArrCopyOf, iArr2, vck0.m197832W0(u5j0Var.f174726h[z2 ? 1 : 0], 1000000L, u5j0Var.f174722d));
                    }
                }
            }
            iArr3 = iArr11;
            iArr3 = iArr11;
            iArr3 = iArr11;
            j9 = j9;
            iArr3 = iArr11;
            iArr3 = iArr11;
            iArr3 = iArr11;
            j9 = j9;
            jArr = jArr7;
            iArr3 = iArr11;
        }
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        iArr3 = iArr11;
        long[] jArr9 = u5j0Var.f174726h;
        if (jArr9.length == 1 && jArr9[z2 ? 1 : 0] == j) {
            long j11 = ((long[]) p11.m167011e(u5j0Var.f174727i))[z2 ? 1 : 0];
            for (int i21 = z2 ? 1 : 0; i21 < jArrCopyOf.length; i21++) {
                jArrCopyOf[i21] = vck0.m197832W0(jArrCopyOf[i21] - j11, 1000000L, u5j0Var.f174721c);
            }
            return new q6j0(u5j0Var, jArr, iArr3, r4 == true ? 1 : 0, jArrCopyOf, iArr2, vck0.m197832W0(j9 - j11, 1000000L, u5j0Var.f174721c));
        }
        boolean z7 = u5j0Var.f174720b == 1 ? true : z2 ? 1 : 0;
        int[] iArr12 = new int[jArr9.length];
        int[] iArr13 = new int[jArr9.length];
        long[] jArr10 = (long[]) p11.m167011e(u5j0Var.f174727i);
        int i22 = z2 ? 1 : 0;
        boolean z8 = i22 == true ? 1 : 0;
        int i23 = z8 ? 1 : 0;
        int i24 = i23;
        boolean z9 = z8;
        while (true) {
            long[] jArr11 = u5j0Var.f174726h;
            iArr4 = iArr13;
            if (i22 >= jArr11.length) {
                break;
            }
            int[] iArr14 = iArr12;
            long[] jArr12 = jArr10;
            long j12 = jArr12[i22];
            if (j12 != -1) {
                long j13 = jArr11[i22];
                i3 = i22;
                boolean z10 = z9 ? 1 : 0;
                long jM197832W4 = vck0.m197832W0(j13, u5j0Var.f174721c, u5j0Var.f174722d);
                iArr7 = iArr14;
                iArr7[i3 == true ? 1 : 0] = vck0.m197863i(jArrCopyOf, j12, true, true);
                long j14 = j12 + jM197832W4;
                z4 = z2;
                iArr4[i3 == true ? 1 : 0] = vck0.m197851e(jArrCopyOf, j14, z7, z4);
                while (true) {
                    i4 = iArr7[i3 == true ? 1 : 0];
                    i5 = iArr4[i3 == true ? 1 : 0];
                    if (i4 >= i5 || (iArr2[i4] & 1) != 0) {
                        break;
                    }
                    iArr7[i3 == true ? 1 : 0] = i4 + 1;
                }
                i23 += i5 - i4;
                z9 = (z10 ? 1 : 0) | (i24 != i4 ? true : z4 ? 1 : 0);
                i24 = i5;
            } else {
                iArr7 = iArr14;
                i3 = i22;
                boolean z11 = z9 ? 1 : 0;
                z4 = z2;
            }
            jArr10 = jArr12;
            z2 = z4;
            iArr13 = iArr4;
            i22 = i3 + 1;
            iArr12 = iArr7;
            z9 = z9;
        }
        int[] iArr15 = iArr12;
        boolean z12 = z2;
        boolean z13 = (z9 ? 1 : 0 ? 1 : 0) | (i23 != i20 ? true : z12);
        long[] jArr13 = z13 != 0 ? new long[i23] : jArr;
        if (z13 != 0) {
            iArr6 = new int[i23];
        } else {
            iArr5 = iArr3;
        }
        if (z13 != 0) {
            iArr5 = iArr6;
            r4 = z12;
        }
        int[] iArr16 = z13 != 0 ? new int[i23] : iArr2;
        long[] jArr14 = new long[i23];
        ?? r12 = z12;
        long j15 = j;
        boolean z14 = z13;
        int[] iArr17 = iArr3;
        ?? r5 = r4;
        ?? r11 = z12;
        while (r11 < u5j0Var.f174726h.length) {
            long j16 = u5j0Var.f174727i[r11];
            int i25 = iArr15[r11];
            boolean z15 = z14;
            int i26 = iArr4[r11];
            ?? r38 = r5;
            if (z15 != 0) {
                int i27 = i26 - i25;
                System.arraycopy(jArr, i25, jArr13, r12, i27);
                System.arraycopy(iArr17, i25, iArr5, r12, i27);
                System.arraycopy(iArr2, i25, iArr16, r12, i27);
            }
            int i28 = r38 == true ? 1 : 0;
            int[] iArr18 = iArr17;
            ?? r13 = r12;
            while (i25 < i26) {
                long[] jArr15 = jArr;
                int[] iArr19 = iArr18;
                long jM197832W5 = vck0.m197832W0(j15, 1000000L, u5j0Var.f174722d);
                long jM197832W6 = vck0.m197832W0(jArrCopyOf[i25] - j16, 1000000L, u5j0Var.f174721c);
                int i29 = i26;
                long[] jArr16 = jArrCopyOf;
                if (m216834c(u5j0Var.f174720b)) {
                    j3 = j;
                    jM197832W6 = Math.max(j3, jM197832W6);
                } else {
                    j3 = j;
                }
                jArr14[r13] = jM197832W5 + jM197832W6;
                if (z15 != 0 && iArr5[r13] > i28) {
                    i28 = iArr19[i25];
                }
                i25++;
                j = j3;
                jArr = jArr15;
                iArr18 = iArr19;
                jArrCopyOf = jArr16;
                iArr2 = iArr2;
                i26 = i29;
                i28 = i28;
                r13++;
            }
            j15 += u5j0Var.f174726h[r11];
            jArr = jArr;
            jArrCopyOf = jArrCopyOf;
            iArr2 = iArr2;
            z14 = z15;
            iArr17 = iArr18;
            r5 = i28;
            r11++;
            r12 = r13;
        }
        return new q6j0(u5j0Var, jArr13, iArr5, r5, jArr14, iArr16, vck0.m197832W0(j15, 1000000L, u5j0Var.f174722d));
    }

    /* JADX INFO: renamed from: x */
    public static C21600e m216855x(d860 d860Var, int i, int i2, String str, @Nullable DrmInitData drmInitData, boolean z) throws ParserException {
        d860Var.m110292U(12);
        int iM110311q = d860Var.m110311q();
        C21600e c21600e = new C21600e(iM110311q);
        int i3 = 0;
        while (i3 < iM110311q) {
            int iM110300f = d860Var.m110300f();
            int iM110311q2 = d860Var.m110311q();
            vqf.m199482a(iM110311q2 > 0, "childAtomSize must be positive");
            int iM110311q3 = d860Var.m110311q();
            if (iM110311q3 == 1635148593 || iM110311q3 == 1635148595 || iM110311q3 == 1701733238 || iM110311q3 == 1831958048 || iM110311q3 == 1836070006 || iM110311q3 == 1752589105 || iM110311q3 == 1751479857 || iM110311q3 == 1932670515 || iM110311q3 == 1211250227 || iM110311q3 == 1987063864 || iM110311q3 == 1987063865 || iM110311q3 == 1635135537 || iM110311q3 == 1685479798 || iM110311q3 == 1685479729 || iM110311q3 == 1685481573 || iM110311q3 == 1685481521) {
                C21600e c21600e2 = c21600e;
                int i4 = i3;
                m216830E(d860Var, iM110311q3, iM110300f, iM110311q2, i, i2, drmInitData, c21600e2, i4);
                c21600e = c21600e2;
                i3 = i4;
            } else if (iM110311q3 == 1836069985 || iM110311q3 == 1701733217 || iM110311q3 == 1633889587 || iM110311q3 == 1700998451 || iM110311q3 == 1633889588 || iM110311q3 == 1835823201 || iM110311q3 == 1685353315 || iM110311q3 == 1685353317 || iM110311q3 == 1685353320 || iM110311q3 == 1685353324 || iM110311q3 == 1685353336 || iM110311q3 == 1935764850 || iM110311q3 == 1935767394 || iM110311q3 == 1819304813 || iM110311q3 == 1936684916 || iM110311q3 == 1953984371 || iM110311q3 == 778924082 || iM110311q3 == 778924083 || iM110311q3 == 1835557169 || iM110311q3 == 1835560241 || iM110311q3 == 1634492771 || iM110311q3 == 1634492791 || iM110311q3 == 1970037111 || iM110311q3 == 1332770163 || iM110311q3 == 1716281667) {
                C21600e c21600e3 = c21600e;
                m216838g(d860Var, iM110311q3, iM110300f, iM110311q2, i, str, z, drmInitData, c21600e3, i3);
                c21600e = c21600e3;
            } else if (iM110311q3 == 1414810956 || iM110311q3 == 1954034535 || iM110311q3 == 2004251764 || iM110311q3 == 1937010800 || iM110311q3 == 1664495672) {
                m216856y(d860Var, iM110311q3, iM110300f, iM110311q2, i, str, c21600e);
            } else if (iM110311q3 == 1835365492) {
                m216847p(d860Var, iM110311q3, iM110300f, i, c21600e);
            } else if (iM110311q3 == 1667329389) {
                c21600e.f201133b = new C1871k.b().m10333T(i).m10346g0("application/x-camera-motion").m10320G();
            }
            d860Var.m110292U(iM110300f + iM110311q2);
            i3++;
        }
        return c21600e;
    }

    /* JADX INFO: renamed from: y */
    public static void m216856y(d860 d860Var, int i, int i2, int i3, int i4, String str, C21600e c21600e) {
        d860Var.m110292U(i2 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableListM15686of = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                d860Var.m110306l(bArr, 0, i5);
                immutableListM15686of = ImmutableList.m15686of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i != 1664495672) {
                ohg0.m164364a();
                return;
            } else {
                c21600e.f201135d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        c21600e.f201133b = new C1871k.b().m10333T(i4).m10346g0(str2).m10337X(str).m10350k0(j).m10335V(immutableListM15686of).m10320G();
    }

    /* JADX INFO: renamed from: z */
    public static C21603h m216857z(d860 d860Var) {
        long j;
        d860Var.m110292U(8);
        int iM212343c = y21.m212343c(d860Var.m110311q());
        d860Var.m110293V(iM212343c == 0 ? 8 : 16);
        int iM110311q = d860Var.m110311q();
        d860Var.m110293V(4);
        int iM110300f = d860Var.m110300f();
        int i = iM212343c == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i3 >= i) {
                d860Var.m110293V(i);
                break;
            }
            if (d860Var.m110299e()[iM110300f + i3] != -1) {
                long jM110281J = iM212343c == 0 ? d860Var.m110281J() : d860Var.m110284M();
                if (jM110281J == 0) {
                    break;
                }
                j = jM110281J;
                break;
            }
            i3++;
        }
        d860Var.m110293V(16);
        int iM110311q2 = d860Var.m110311q();
        int iM110311q3 = d860Var.m110311q();
        d860Var.m110293V(4);
        int iM110311q4 = d860Var.m110311q();
        int iM110311q5 = d860Var.m110311q();
        if (iM110311q2 == 0 && iM110311q3 == 65536 && iM110311q4 == -65536 && iM110311q5 == 0) {
            i2 = 90;
        } else if (iM110311q2 == 0 && iM110311q3 == -65536 && iM110311q4 == 65536 && iM110311q5 == 0) {
            i2 = 270;
        } else if (iM110311q2 == -65536 && iM110311q3 == 0 && iM110311q4 == 0 && iM110311q5 == -65536) {
            i2 = 180;
        }
        return new C21603h(iM110311q, j, i2);
    }
}
