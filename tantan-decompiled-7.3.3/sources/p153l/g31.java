package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
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
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class g31 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f101907a = bmk0.m105165r0("OpusHead");

    /* JADX INFO: renamed from: l.g31$a */
    public static final class C17116a {

        /* JADX INFO: renamed from: a */
        public final int f101908a;

        /* JADX INFO: renamed from: b */
        public int f101909b;

        /* JADX INFO: renamed from: c */
        public int f101910c;

        /* JADX INFO: renamed from: d */
        public long f101911d;

        /* JADX INFO: renamed from: e */
        public final boolean f101912e;

        /* JADX INFO: renamed from: f */
        public final ig60 f101913f;

        /* JADX INFO: renamed from: g */
        public final ig60 f101914g;

        /* JADX INFO: renamed from: h */
        public int f101915h;

        /* JADX INFO: renamed from: i */
        public int f101916i;

        public C17116a(ig60 ig60Var, ig60 ig60Var2, boolean z) throws ParserException {
            this.f101914g = ig60Var;
            this.f101913f = ig60Var2;
            this.f101912e = z;
            ig60Var2.m139808U(12);
            this.f101908a = ig60Var2.m139799L();
            ig60Var.m139808U(12);
            this.f101916i = ig60Var.m139799L();
            csf.m112176a(ig60Var.m139827q() == 1, "first_chunk must be 1");
            this.f101909b = -1;
        }

        /* JADX INFO: renamed from: a */
        public boolean m128700a() {
            int i = this.f101909b + 1;
            this.f101909b = i;
            if (i == this.f101908a) {
                return false;
            }
            boolean z = this.f101912e;
            ig60 ig60Var = this.f101913f;
            this.f101911d = z ? ig60Var.m139800M() : ig60Var.m139797J();
            if (this.f101909b == this.f101915h) {
                this.f101910c = this.f101914g.m139799L();
                this.f101914g.m139809V(4);
                int i2 = this.f101916i - 1;
                this.f101916i = i2;
                this.f101915h = i2 > 0 ? this.f101914g.m139799L() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.g31$b */
    public static final class C17117b {

        /* JADX INFO: renamed from: a */
        public final String f101917a;

        /* JADX INFO: renamed from: b */
        public final byte[] f101918b;

        /* JADX INFO: renamed from: c */
        public final long f101919c;

        /* JADX INFO: renamed from: d */
        public final long f101920d;

        public C17117b(String str, byte[] bArr, long j, long j2) {
            this.f101917a = str;
            this.f101918b = bArr;
            this.f101919c = j;
            this.f101920d = j2;
        }
    }

    /* JADX INFO: renamed from: l.g31$c */
    public static final class C17118c {

        /* JADX INFO: renamed from: a */
        public final Metadata f101921a;

        /* JADX INFO: renamed from: b */
        public final long f101922b;

        public C17118c(Metadata metadata, long j) {
            this.f101921a = metadata;
            this.f101922b = j;
        }
    }

    /* JADX INFO: renamed from: l.g31$d */
    public interface InterfaceC17119d {
        /* JADX INFO: renamed from: a */
        int mo128705a();

        /* JADX INFO: renamed from: b */
        int mo128706b();

        /* JADX INFO: renamed from: c */
        int mo128707c();
    }

    /* JADX INFO: renamed from: l.g31$e */
    public static final class C17120e {

        /* JADX INFO: renamed from: a */
        public final zej0[] f101923a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public C1894k f101924b;

        /* JADX INFO: renamed from: c */
        public int f101925c;

        /* JADX INFO: renamed from: d */
        public int f101926d = 0;

        public C17120e(int i) {
            this.f101923a = new zej0[i];
        }
    }

    /* JADX INFO: renamed from: l.g31$f */
    public static final class C17121f implements InterfaceC17119d {

        /* JADX INFO: renamed from: a */
        public final int f101927a;

        /* JADX INFO: renamed from: b */
        public final int f101928b;

        /* JADX INFO: renamed from: c */
        public final ig60 f101929c;

        public C17121f(f31.C16880b c16880b, C1894k c1894k) {
            ig60 ig60Var = c16880b.f96944b;
            this.f101929c = ig60Var;
            ig60Var.m139808U(12);
            int iM139799L = ig60Var.m139799L();
            if ("audio/raw".equals(c1894k.f7785l)) {
                int iM105139h0 = bmk0.m105139h0(c1894k.f7766A, c1894k.f7798y);
                if (iM139799L == 0 || iM139799L % iM105139h0 != 0) {
                    kyv.m152151i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iM105139h0 + ", stsz sample size: " + iM139799L);
                    iM139799L = iM105139h0;
                }
            }
            this.f101927a = iM139799L == 0 ? -1 : iM139799L;
            this.f101928b = ig60Var.m139799L();
        }

        @Override // p153l.g31.InterfaceC17119d
        /* JADX INFO: renamed from: a */
        public int mo128705a() {
            int i = this.f101927a;
            return i == -1 ? this.f101929c.m139799L() : i;
        }

        @Override // p153l.g31.InterfaceC17119d
        /* JADX INFO: renamed from: b */
        public int mo128706b() {
            return this.f101928b;
        }

        @Override // p153l.g31.InterfaceC17119d
        /* JADX INFO: renamed from: c */
        public int mo128707c() {
            return this.f101927a;
        }
    }

    /* JADX INFO: renamed from: l.g31$g */
    public static final class C17122g implements InterfaceC17119d {

        /* JADX INFO: renamed from: a */
        public final ig60 f101930a;

        /* JADX INFO: renamed from: b */
        public final int f101931b;

        /* JADX INFO: renamed from: c */
        public final int f101932c;

        /* JADX INFO: renamed from: d */
        public int f101933d;

        /* JADX INFO: renamed from: e */
        public int f101934e;

        public C17122g(f31.C16880b c16880b) {
            ig60 ig60Var = c16880b.f96944b;
            this.f101930a = ig60Var;
            ig60Var.m139808U(12);
            this.f101932c = ig60Var.m139799L() & 255;
            this.f101931b = ig60Var.m139799L();
        }

        @Override // p153l.g31.InterfaceC17119d
        /* JADX INFO: renamed from: a */
        public int mo128705a() {
            int i = this.f101932c;
            if (i == 8) {
                return this.f101930a.m139795H();
            }
            if (i == 16) {
                return this.f101930a.m139801N();
            }
            int i2 = this.f101933d;
            this.f101933d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f101934e & 15;
            }
            int iM139795H = this.f101930a.m139795H();
            this.f101934e = iM139795H;
            return (iM139795H & 240) >> 4;
        }

        @Override // p153l.g31.InterfaceC17119d
        /* JADX INFO: renamed from: b */
        public int mo128706b() {
            return this.f101931b;
        }

        @Override // p153l.g31.InterfaceC17119d
        /* JADX INFO: renamed from: c */
        public int mo128707c() {
            return -1;
        }
    }

    /* JADX INFO: renamed from: l.g31$h */
    public static final class C17123h {

        /* JADX INFO: renamed from: a */
        public final int f101935a;

        /* JADX INFO: renamed from: b */
        public final long f101936b;

        /* JADX INFO: renamed from: c */
        public final int f101937c;

        public C17123h(int i, long j, int i2) {
            this.f101935a = i;
            this.f101936b = j;
            this.f101937c = i2;
        }
    }

    /* JADX INFO: renamed from: l.g31$i */
    public static final class C17124i {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Metadata f101938a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Metadata f101939b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Metadata f101940c;

        public C17124i(@Nullable Metadata metadata, @Nullable Metadata metadata2, @Nullable Metadata metadata3) {
            this.f101938a = metadata;
            this.f101939b = metadata2;
            this.f101940c = metadata3;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public static yej0 m128668A(f31.C16879a c16879a, f31.C16880b c16880b, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long[] jArr;
        long[] jArr2;
        f31.C16879a c16879aM123702f;
        Pair<long[], long[]> pairM128682i;
        f31.C16879a c16879a2 = (f31.C16879a) w11.m204369e(c16879a.m123702f(1835297121));
        int iM128678e = m128678e(m128685l(((f31.C16880b) w11.m204369e(c16879a2.m123703g(1751411826))).f96944b));
        if (iM128678e == -1) {
            return null;
        }
        C17123h c17123hM128699z = m128699z(((f31.C16880b) w11.m204369e(c16879a.m123703g(1953196132))).f96944b);
        long j2 = j == -9223372036854775807L ? c17123hM128699z.f101936b : j;
        long j3 = m128690q(c16880b.f96944b).f101922b;
        long jM105110W0 = j2 != -9223372036854775807L ? bmk0.m105110W0(j2, 1000000L, j3) : -9223372036854775807L;
        f31.C16879a c16879a3 = (f31.C16879a) w11.m204369e(((f31.C16879a) w11.m204369e(c16879a2.m123702f(1835626086))).m123702f(1937007212));
        Pair<Long, String> pairM128687n = m128687n(((f31.C16880b) w11.m204369e(c16879a2.m123703g(1835296868))).f96944b);
        f31.C16880b c16880bM123703g = c16879a3.m123703g(1937011556);
        if (c16880bM123703g == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        C17120e c17120eM128697x = m128697x(c16880bM123703g.f96944b, c17123hM128699z.f101935a, c17123hM128699z.f101937c, (String) pairM128687n.second, drmInitData, z2);
        if (z || (c16879aM123702f = c16879a.m123702f(1701082227)) == null || (pairM128682i = m128682i(c16879aM123702f)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairM128682i.first;
            jArr2 = (long[]) pairM128682i.second;
            jArr = jArr3;
        }
        if (c17120eM128697x.f101924b == null) {
            return null;
        }
        return new yej0(c17123hM128699z.f101935a, iM128678e, ((Long) pairM128687n.first).longValue(), j3, jM105110W0, c17120eM128697x.f101924b, c17120eM128697x.f101926d, c17120eM128697x.f101923a, c17120eM128697x.f101925c, jArr, jArr2);
    }

    /* JADX INFO: renamed from: B */
    public static List<ufj0> m128669B(f31.C16879a c16879a, ilj iljVar, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2, adj<yej0, yej0> adjVar) throws ParserException {
        yej0 yej0VarApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c16879a.f96943d.size(); i++) {
            f31.C16879a c16879a2 = c16879a.f96943d.get(i);
            if (c16879a2.f96940a == 1953653099 && (yej0VarApply = adjVar.apply(m128668A(c16879a2, (f31.C16880b) w11.m204369e(c16879a.m123703g(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(m128696w(yej0VarApply, (f31.C16879a) w11.m204369e(((f31.C16879a) w11.m204369e(((f31.C16879a) w11.m204369e(c16879a2.m123702f(1835297121))).m123702f(1835626086))).m123702f(1937007212)), iljVar));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public static C17124i m128670C(f31.C16880b c16880b) {
        ig60 ig60Var = c16880b.f96944b;
        ig60Var.m139808U(8);
        Metadata metadataM128671D = null;
        Metadata metadataM128695v = null;
        Metadata metadataM128673F = null;
        while (ig60Var.m139811a() >= 8) {
            int iM139816f = ig60Var.m139816f();
            int iM139827q = ig60Var.m139827q();
            int iM139827q2 = ig60Var.m139827q();
            if (iM139827q2 == 1835365473) {
                ig60Var.m139808U(iM139816f);
                metadataM128671D = m128671D(ig60Var, iM139816f + iM139827q);
            } else if (iM139827q2 == 1936553057) {
                ig60Var.m139808U(iM139816f);
                metadataM128695v = m128695v(ig60Var, iM139816f + iM139827q);
            } else if (iM139827q2 == -1451722374) {
                metadataM128673F = m128673F(ig60Var);
            }
            ig60Var.m139808U(iM139816f + iM139827q);
        }
        return new C17124i(metadataM128671D, metadataM128695v, metadataM128673F);
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public static Metadata m128671D(ig60 ig60Var, int i) {
        ig60Var.m139809V(8);
        m128679f(ig60Var);
        while (ig60Var.m139816f() < i) {
            int iM139816f = ig60Var.m139816f();
            int iM139827q = ig60Var.m139827q();
            if (ig60Var.m139827q() == 1768715124) {
                ig60Var.m139808U(iM139816f);
                return m128686m(ig60Var, iM139816f + iM139827q);
            }
            ig60Var.m139808U(iM139816f + iM139827q);
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static void m128672E(ig60 ig60Var, int i, int i2, int i3, int i4, int i5, @Nullable DrmInitData drmInitData, C17120e c17120e, int i6) throws ParserException {
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
        DrmInitData drmInitDataM9952c = drmInitData;
        C17120e c17120e2 = c17120e;
        ig60Var.m139808U(i13 + 16);
        ig60Var.m139809V(16);
        int iM139801N = ig60Var.m139801N();
        int iM139801N2 = ig60Var.m139801N();
        ig60Var.m139809V(50);
        int iM139816f = ig60Var.m139816f();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, zej0> pairM128693t = m128693t(ig60Var, i13, i14);
            if (pairM128693t != null) {
                iIntValue = ((Integer) pairM128693t.first).intValue();
                drmInitDataM9952c = drmInitDataM9952c == null ? null : drmInitDataM9952c.m9952c(((zej0) pairM128693t.second).f204031b);
                c17120e2.f101923a[i6] = (zej0) pairM128693t.second;
            }
            ig60Var.m139808U(iM139816f);
        }
        String str4 = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP;
        if (iIntValue == 1831958048) {
            str = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG;
        } else {
            str = iIntValue == 1211250227 ? DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP : null;
        }
        float fM128691r = 1.0f;
        String str5 = null;
        List<byte[]> listM15740of = null;
        byte[] bArrM128692s = null;
        int i15 = -1;
        int iM115496h = -1;
        int i16 = -1;
        int iM115497i = -1;
        ByteBuffer byteBuffer = null;
        C17117b c17117bM128683j = null;
        boolean z = false;
        while (iM139816f - i13 < i14) {
            ig60Var.m139808U(iM139816f);
            int iM139816f2 = ig60Var.m139816f();
            int iM139827q = ig60Var.m139827q();
            if (iM139827q == 0 && ig60Var.m139816f() - i2 == i14) {
                break;
            }
            csf.m112176a(iM139827q > 0, "childAtomSize must be positive");
            int iM139827q2 = ig60Var.m139827q();
            if (iM139827q2 == 1635148611) {
                csf.m112176a(str == null, null);
                ig60Var.m139808U(iM139816f2 + 8);
                pp1 pp1VarM173175b = pp1.m173175b(ig60Var);
                listM15740of = pp1VarM173175b.f153469a;
                c17120e2.f101925c = pp1VarM173175b.f153470b;
                if (!z) {
                    fM128691r = pp1VarM173175b.f153476h;
                }
                str5 = pp1VarM173175b.f153477i;
                i10 = pp1VarM173175b.f153473e;
                i11 = pp1VarM173175b.f153474f;
                i12 = pp1VarM173175b.f153475g;
                str3 = YtVideoEncoder.MIME_TYPE;
            } else {
                if (iM139827q2 == 1752589123) {
                    csf.m112176a(str == null, null);
                    ig60Var.m139808U(iM139816f2 + 8);
                    e2l e2lVarM119112a = e2l.m119112a(ig60Var);
                    listM15740of = e2lVarM119112a.f91788a;
                    c17120e2.f101925c = e2lVarM119112a.f91789b;
                    if (!z) {
                        fM128691r = e2lVarM119112a.f91795h;
                    }
                    str5 = e2lVarM119112a.f91796i;
                    i10 = e2lVarM119112a.f91792e;
                    i11 = e2lVarM119112a.f91793f;
                    i12 = e2lVarM119112a.f91794g;
                    str3 = "video/hevc";
                } else {
                    if (iM139827q2 == 1685480259 || iM139827q2 == 1685485123) {
                        drmInitDataM9952c = drmInitDataM9952c;
                        i7 = iM139816f;
                        iIntValue = iIntValue;
                        str4 = str4;
                        f = fM128691r;
                        list = listM15740of;
                        i8 = iM115496h;
                        i9 = iM115497i;
                        c7e c7eVarM108303a = c7e.m108303a(ig60Var);
                        if (c7eVarM108303a != null) {
                            str5 = c7eVarM108303a.f80108c;
                            str = "video/dolby-vision";
                        }
                    } else {
                        i7 = iM139816f;
                        if (iM139827q2 == 1987076931) {
                            csf.m112176a(str == null, null);
                            str2 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            ig60Var.m139808U(iM139816f2 + 12);
                            ig60Var.m139809V(2);
                            boolean z2 = (ig60Var.m139795H() & 1) != 0;
                            int iM139795H = ig60Var.m139795H();
                            int iM139795H2 = ig60Var.m139795H();
                            iM115496h = df5.m115496h(iM139795H);
                            i16 = z2 ? 1 : 2;
                            iM115497i = df5.m115497i(iM139795H2);
                        } else if (iM139827q2 == 1635135811) {
                            csf.m112176a(str == null, null);
                            str2 = "video/av01";
                        } else if (iM139827q2 == 1668050025) {
                            ByteBuffer byteBufferM128674a = byteBuffer == null ? m128674a() : byteBuffer;
                            byteBufferM128674a.position(21);
                            byteBufferM128674a.putShort(ig60Var.m139791D());
                            byteBufferM128674a.putShort(ig60Var.m139791D());
                            byteBuffer = byteBufferM128674a;
                        } else if (iM139827q2 == 1835295606) {
                            ByteBuffer byteBufferM128674a2 = byteBuffer == null ? m128674a() : byteBuffer;
                            short sM139791D = ig60Var.m139791D();
                            short sM139791D2 = ig60Var.m139791D();
                            short sM139791D3 = ig60Var.m139791D();
                            short sM139791D4 = ig60Var.m139791D();
                            short sM139791D5 = ig60Var.m139791D();
                            short sM139791D6 = ig60Var.m139791D();
                            short sM139791D7 = ig60Var.m139791D();
                            List<byte[]> list2 = listM15740of;
                            short sM139791D8 = ig60Var.m139791D();
                            long jM139797J = ig60Var.m139797J();
                            long jM139797J2 = ig60Var.m139797J();
                            byteBufferM128674a2.position(1);
                            byteBufferM128674a2.putShort(sM139791D5);
                            byteBufferM128674a2.putShort(sM139791D6);
                            byteBufferM128674a2.putShort(sM139791D);
                            byteBufferM128674a2.putShort(sM139791D2);
                            byteBufferM128674a2.putShort(sM139791D3);
                            byteBufferM128674a2.putShort(sM139791D4);
                            byteBufferM128674a2.putShort(sM139791D7);
                            byteBufferM128674a2.putShort(sM139791D8);
                            byteBufferM128674a2.putShort((short) (jM139797J / 10000));
                            byteBufferM128674a2.putShort((short) (jM139797J2 / 10000));
                            byteBuffer = byteBufferM128674a2;
                            listM15740of = list2;
                            fM128691r = fM128691r;
                        } else {
                            drmInitDataM9952c = drmInitDataM9952c;
                            iIntValue = iIntValue;
                            str4 = str4;
                            f = fM128691r;
                            list = listM15740of;
                            if (iM139827q2 == 1681012275) {
                                csf.m112176a(str == null, null);
                                str = str4;
                            } else if (iM139827q2 == 1702061171) {
                                csf.m112176a(str == null, null);
                                c17117bM128683j = m128683j(ig60Var, iM139816f2);
                                String str6 = c17117bM128683j.f101917a;
                                byte[] bArr = c17117bM128683j.f101918b;
                                listM15740of = bArr != null ? ImmutableList.m15740of(bArr) : list;
                                str = str6;
                                fM128691r = f;
                            } else if (iM139827q2 == 1885434736) {
                                fM128691r = m128691r(ig60Var, iM139816f2);
                                listM15740of = list;
                                z = true;
                            } else if (iM139827q2 == 1937126244) {
                                bArrM128692s = m128692s(ig60Var, iM139816f2, iM139827q);
                            } else if (iM139827q2 == 1936995172) {
                                int iM139795H3 = ig60Var.m139795H();
                                ig60Var.m139809V(3);
                                if (iM139795H3 == 0) {
                                    int iM139795H4 = ig60Var.m139795H();
                                    if (iM139795H4 == 0) {
                                        i15 = 0;
                                    } else if (iM139795H4 == 1) {
                                        i15 = 1;
                                    } else if (iM139795H4 == 2) {
                                        i15 = 2;
                                    } else if (iM139795H4 == 3) {
                                        i15 = 3;
                                    }
                                }
                            } else {
                                i8 = iM115496h;
                                if (iM139827q2 == 1668246642) {
                                    i9 = iM115497i;
                                    if (i8 == -1 && i9 == -1) {
                                        int iM139827q3 = ig60Var.m139827q();
                                        if (iM139827q3 == 1852009592 || iM139827q3 == 1852009571) {
                                            int iM139801N3 = ig60Var.m139801N();
                                            int iM139801N4 = ig60Var.m139801N();
                                            ig60Var.m139809V(2);
                                            boolean z3 = iM139827q == 19 && (ig60Var.m139795H() & 128) != 0;
                                            iM115496h = df5.m115496h(iM139801N3);
                                            i16 = z3 ? 1 : 2;
                                            iM115497i = df5.m115497i(iM139801N4);
                                        } else {
                                            kyv.m152151i("AtomParsers", "Unsupported color type: " + f31.m123697a(iM139827q3));
                                        }
                                    }
                                } else {
                                    i9 = iM115497i;
                                }
                            }
                            listM15740of = list;
                            fM128691r = f;
                        }
                        str = str2;
                    }
                    iM115497i = i9;
                    iM115496h = i8;
                    listM15740of = list;
                    fM128691r = f;
                }
                iM139816f = i7 + iM139827q;
                i13 = i2;
                i14 = i3;
                c17120e2 = c17120e;
                iIntValue = iIntValue;
                str4 = str4;
                drmInitDataM9952c = drmInitDataM9952c;
            }
            iM115497i = i12;
            iM115496h = i10;
            i7 = iM139816f;
            i16 = i11;
            str = str3;
            iM139816f = i7 + iM139827q;
            i13 = i2;
            i14 = i3;
            c17120e2 = c17120e;
            iIntValue = iIntValue;
            str4 = str4;
            drmInitDataM9952c = drmInitDataM9952c;
        }
        DrmInitData drmInitData2 = drmInitDataM9952c;
        float f2 = fM128691r;
        List<byte[]> list3 = listM15740of;
        int i17 = iM115496h;
        int i18 = iM115497i;
        if (str == null) {
            return;
        }
        C1894k.b bVarM10382O = new C1894k.b().m10387T(i4).m10400g0(str).m10378K(str5).m10407n0(iM139801N).m10386S(iM139801N2).m10396c0(f2).m10399f0(i5).m10397d0(bArrM128692s).m10403j0(i15).m10389V(list3).m10382O(drmInitData2);
        int i19 = i16;
        if (i17 != -1 || i19 != -1 || i18 != -1 || byteBuffer != null) {
            bVarM10382O.m10379L(new df5(i17, i19, i18, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (c17117bM128683j != null) {
            bVarM10382O.m10376I(Ints.m16523m(c17117bM128683j.f101919c)).m10395b0(Ints.m16523m(c17117bM128683j.f101920d));
        }
        c17120e.f101924b = bVarM10382O.m10374G();
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public static Metadata m128673F(ig60 ig60Var) {
        short sM139791D = ig60Var.m139791D();
        ig60Var.m139809V(2);
        String strM139792E = ig60Var.m139792E(sM139791D);
        int iMax = Math.max(strM139792E.lastIndexOf(43), strM139792E.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(strM139792E.substring(0, iMax)), Float.parseFloat(strM139792E.substring(iMax, strM139792E.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ByteBuffer m128674a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m128675b(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[bmk0.m105162q(4, 0, length)] && jArr[bmk0.m105162q(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m128676c(int i) {
        return i != 1;
    }

    /* JADX INFO: renamed from: d */
    public static int m128677d(ig60 ig60Var, int i, int i2, int i3) throws ParserException {
        int iM139816f = ig60Var.m139816f();
        csf.m112176a(iM139816f >= i2, null);
        while (iM139816f - i2 < i3) {
            ig60Var.m139808U(iM139816f);
            int iM139827q = ig60Var.m139827q();
            csf.m112176a(iM139827q > 0, "childAtomSize must be positive");
            if (ig60Var.m139827q() == i) {
                return iM139816f;
            }
            iM139816f += iM139827q;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static int m128678e(int i) {
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
    public static void m128679f(ig60 ig60Var) {
        int iM139816f = ig60Var.m139816f();
        ig60Var.m139809V(4);
        if (ig60Var.m139827q() != 1751411826) {
            iM139816f += 4;
        }
        ig60Var.m139808U(iM139816f);
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
    public static void m128680g(ig60 ig60Var, int i, int i2, int i3, int i4, String str, boolean z, @Nullable DrmInitData drmInitData, C17120e c17120e, int i5) throws ParserException {
        int iM139801N;
        int iM139796I;
        int iM139827q;
        int iM139799L;
        String str2;
        String str3;
        int i6;
        String str4;
        C17117b c17117bM128683j;
        String str5;
        List<byte[]> listM15740of;
        int iM139827q2;
        boolean z2;
        int iM139827q3;
        int iM128677d;
        byte[] bArr;
        boolean z3;
        int i7 = i2;
        int i8 = i3;
        DrmInitData drmInitDataM9952c = drmInitData;
        ig60Var.m139808U(i7 + 16);
        if (z) {
            iM139801N = ig60Var.m139801N();
            ig60Var.m139809V(6);
        } else {
            ig60Var.m139809V(8);
            iM139801N = 0;
        }
        if (iM139801N == 0 || iM139801N == 1) {
            int iM139801N2 = ig60Var.m139801N();
            ig60Var.m139809V(6);
            iM139796I = ig60Var.m139796I();
            ig60Var.m139808U(ig60Var.m139816f() - 4);
            iM139827q = ig60Var.m139827q();
            if (iM139801N == 1) {
                ig60Var.m139809V(16);
            }
            iM139799L = iM139801N2;
        } else {
            if (iM139801N != 2) {
                return;
            }
            ig60Var.m139809V(16);
            iM139796I = (int) Math.round(ig60Var.m139825o());
            iM139799L = ig60Var.m139799L();
            ig60Var.m139809V(20);
            iM139827q = 0;
        }
        int iM139816f = ig60Var.m139816f();
        int iIntValue = i;
        if (iIntValue == 1701733217) {
            Pair<Integer, zej0> pairM128693t = m128693t(ig60Var, i7, i8);
            if (pairM128693t != null) {
                iIntValue = ((Integer) pairM128693t.first).intValue();
                drmInitDataM9952c = drmInitDataM9952c == null ? null : drmInitDataM9952c.m9952c(((zej0) pairM128693t.second).f204031b);
                c17120e.f101923a[i5] = (zej0) pairM128693t.second;
            }
            ig60Var.m139808U(iM139816f);
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
                    i6 = SQLiteDatabase.CREATE_IF_NECESSARY;
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
                c17117bM128683j = null;
                str5 = null;
                listM15740of = null;
                while (iM139816f - i7 < i8) {
                    ig60Var.m139808U(iM139816f);
                    iM139827q2 = ig60Var.m139827q();
                    if (iM139827q2 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    csf.m112176a(z2, "childAtomSize must be positive");
                    iM139827q3 = ig60Var.m139827q();
                    if (iM139827q3 == 1835557187) {
                        int i9 = iM139827q2 - 13;
                        byte[] bArr2 = new byte[i9];
                        ig60Var.m139808U(iM139816f + 13);
                        ig60Var.m139822l(bArr2, 0, i9);
                        listM15740of = ImmutableList.m15740of(bArr2);
                    } else {
                        if (iM139827q3 != 1702061171 || (z && iM139827q3 == 2002876005)) {
                            if (iM139827q3 == 1702061171) {
                                iM128677d = iM139816f;
                            } else {
                                iM128677d = m128677d(ig60Var, 1702061171, iM139816f, iM139827q2);
                            }
                            if (iM128677d != -1) {
                                c17117bM128683j = m128683j(ig60Var, iM128677d);
                                str4 = c17117bM128683j.f101917a;
                                bArr = c17117bM128683j.f101918b;
                                if (bArr != null) {
                                    if ("audio/mp4a-latm".equals(str4)) {
                                        C21738z1.b bVarM218271f = C21738z1.m218271f(bArr);
                                        iM139796I = bVarM218271f.f202473a;
                                        iM139799L = bVarM218271f.f202474b;
                                        str5 = bVarM218271f.f202475c;
                                    }
                                    listM15740of = ImmutableList.m15740of(bArr);
                                }
                            }
                        } else {
                            if (iM139827q3 == 1684103987) {
                                ig60Var.m139808U(iM139816f + 8);
                                c17120e.f101924b = C21775z8.m218930d(ig60Var, Integer.toString(i4), str, drmInitDataM9952c);
                            } else if (iM139827q3 == 1684366131) {
                                ig60Var.m139808U(iM139816f + 8);
                                c17120e.f101924b = C21775z8.m218934h(ig60Var, Integer.toString(i4), str, drmInitDataM9952c);
                            } else if (iM139827q3 == 1684103988) {
                                ig60Var.m139808U(iM139816f + 8);
                                c17120e.f101924b = C16484d9.m114989b(ig60Var, Integer.toString(i4), str, drmInitDataM9952c);
                            } else if (iM139827q3 == 1684892784) {
                                if (iM139827q <= 0) {
                                    throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + iM139827q, null);
                                }
                                iM139796I = iM139827q;
                                iM139799L = 2;
                            } else if (iM139827q3 == 1684305011 || iM139827q3 == 1969517683) {
                                z3 = false;
                                c17120e.f101924b = new C1894k.b().m10387T(i4).m10400g0(str4).m10377J(iM139799L).m10401h0(iM139796I).m10382O(drmInitDataM9952c).m10391X(str).m10374G();
                            } else if (iM139827q3 == 1682927731) {
                                int i10 = iM139827q2 - 8;
                                byte[] bArr3 = f101907a;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i10);
                                ig60Var.m139808U(iM139816f + 8);
                                ig60Var.m139822l(bArrCopyOf, bArr3.length, i10);
                                listM15740of = w560.m204959a(bArrCopyOf);
                            } else if (iM139827q3 == 1684425825) {
                                byte[] bArr4 = new byte[iM139827q2 - 8];
                                bArr4[0] = 102;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                ig60Var.m139808U(iM139816f + 12);
                                ig60Var.m139822l(bArr4, 4, iM139827q2 - 12);
                                listM15740of = ImmutableList.m15740of(bArr4);
                            } else if (iM139827q3 == 1634492771) {
                                int i11 = iM139827q2 - 12;
                                byte[] bArr5 = new byte[i11];
                                ig60Var.m139808U(iM139816f + 12);
                                ig60Var.m139822l(bArr5, 0, i11);
                                Pair<Integer, Integer> pairM153628h = lc5.m153628h(bArr5);
                                int iIntValue2 = ((Integer) pairM153628h.first).intValue();
                                int iIntValue3 = ((Integer) pairM153628h.second).intValue();
                                listM15740of = ImmutableList.m15740of(bArr5);
                                iM139796I = iIntValue2;
                                iM139799L = iIntValue3;
                            } else {
                                z3 = false;
                            }
                            z3 = false;
                        }
                        iM139816f += iM139827q2;
                        i7 = i2;
                        i8 = i3;
                    }
                    iM139816f += iM139827q2;
                    i7 = i2;
                    i8 = i3;
                }
                if (c17120e.f101924b == null || str4 == null) {
                }
                C1894k.b bVarM10391X = new C1894k.b().m10387T(i4).m10400g0(str4).m10378K(str5).m10377J(iM139799L).m10401h0(iM139796I).m10394a0(i6).m10389V(listM15740of).m10382O(drmInitDataM9952c).m10391X(str);
                if (c17117bM128683j != null) {
                    bVarM10391X.m10376I(Ints.m16523m(c17117bM128683j.f101919c)).m10395b0(Ints.m16523m(c17117bM128683j.f101920d));
                }
                c17120e.f101924b = bVarM10391X.m10374G();
                return;
            }
            str2 = "audio/amr-wb";
        }
        str3 = str2;
        i6 = -1;
        str4 = str3;
        c17117bM128683j = null;
        str5 = null;
        listM15740of = null;
        while (iM139816f - i7 < i8) {
            ig60Var.m139808U(iM139816f);
            iM139827q2 = ig60Var.m139827q();
            if (iM139827q2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            csf.m112176a(z2, "childAtomSize must be positive");
            iM139827q3 = ig60Var.m139827q();
            if (iM139827q3 == 1835557187) {
                int i12 = iM139827q2 - 13;
                byte[] bArr6 = new byte[i12];
                ig60Var.m139808U(iM139816f + 13);
                ig60Var.m139822l(bArr6, 0, i12);
                listM15740of = ImmutableList.m15740of(bArr6);
            } else {
                if (iM139827q3 != 1702061171) {
                    if (iM139827q3 == 1702061171) {
                        iM128677d = iM139816f;
                    } else {
                        iM128677d = m128677d(ig60Var, 1702061171, iM139816f, iM139827q2);
                    }
                    if (iM128677d != -1) {
                        c17117bM128683j = m128683j(ig60Var, iM128677d);
                        str4 = c17117bM128683j.f101917a;
                        bArr = c17117bM128683j.f101918b;
                        if (bArr != null) {
                            if ("audio/mp4a-latm".equals(str4)) {
                                C21738z1.b bVarM218271f2 = C21738z1.m218271f(bArr);
                                iM139796I = bVarM218271f2.f202473a;
                                iM139799L = bVarM218271f2.f202474b;
                                str5 = bVarM218271f2.f202475c;
                            }
                            listM15740of = ImmutableList.m15740of(bArr);
                        }
                    }
                } else {
                    if (iM139827q3 == 1702061171) {
                        iM128677d = iM139816f;
                    } else {
                        iM128677d = m128677d(ig60Var, 1702061171, iM139816f, iM139827q2);
                    }
                    if (iM128677d != -1) {
                        c17117bM128683j = m128683j(ig60Var, iM128677d);
                        str4 = c17117bM128683j.f101917a;
                        bArr = c17117bM128683j.f101918b;
                        if (bArr != null) {
                            if ("audio/mp4a-latm".equals(str4)) {
                                C21738z1.b bVarM218271f3 = C21738z1.m218271f(bArr);
                                iM139796I = bVarM218271f3.f202473a;
                                iM139799L = bVarM218271f3.f202474b;
                                str5 = bVarM218271f3.f202475c;
                            }
                            listM15740of = ImmutableList.m15740of(bArr);
                        }
                    }
                }
                iM139816f += iM139827q2;
                i7 = i2;
                i8 = i3;
            }
            iM139816f += iM139827q2;
            i7 = i2;
            i8 = i3;
        }
        if (c17120e.f101924b == null) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Pair<Integer, zej0> m128681h(ig60 ig60Var, int i, int i2) throws ParserException {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String strM139792E = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            ig60Var.m139808U(i3);
            int iM139827q = ig60Var.m139827q();
            int iM139827q2 = ig60Var.m139827q();
            if (iM139827q2 == 1718775137) {
                numValueOf = Integer.valueOf(ig60Var.m139827q());
            } else if (iM139827q2 == 1935894637) {
                ig60Var.m139809V(4);
                strM139792E = ig60Var.m139792E(4);
            } else if (iM139827q2 == 1935894633) {
                i4 = i3;
                i5 = iM139827q;
            }
            i3 += iM139827q;
        }
        if (!"cenc".equals(strM139792E) && !"cbc1".equals(strM139792E) && !"cens".equals(strM139792E) && !"cbcs".equals(strM139792E)) {
            return null;
        }
        csf.m112176a(numValueOf != null, "frma atom is mandatory");
        csf.m112176a(i4 != -1, "schi atom is mandatory");
        zej0 zej0VarM128694u = m128694u(ig60Var, i4, i5, strM139792E);
        csf.m112176a(zej0VarM128694u != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (zej0) bmk0.m105144j(zej0VarM128694u));
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static Pair<long[], long[]> m128682i(f31.C16879a c16879a) {
        f31.C16880b c16880bM123703g = c16879a.m123703g(1701606260);
        if (c16880bM123703g == null) {
            return null;
        }
        ig60 ig60Var = c16880bM123703g.f96944b;
        ig60Var.m139808U(8);
        int iM123699c = f31.m123699c(ig60Var.m139827q());
        int iM139799L = ig60Var.m139799L();
        long[] jArr = new long[iM139799L];
        long[] jArr2 = new long[iM139799L];
        for (int i = 0; i < iM139799L; i++) {
            jArr[i] = iM123699c == 1 ? ig60Var.m139800M() : ig60Var.m139797J();
            jArr2[i] = iM123699c == 1 ? ig60Var.m139788A() : ig60Var.m139827q();
            if (ig60Var.m139791D() != 1) {
                wg3.m206174a("Unsupported media rate.");
                return null;
            }
            ig60Var.m139809V(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX INFO: renamed from: j */
    public static C17117b m128683j(ig60 ig60Var, int i) {
        ig60Var.m139808U(i + 12);
        ig60Var.m139809V(1);
        m128684k(ig60Var);
        ig60Var.m139809V(2);
        int iM139795H = ig60Var.m139795H();
        if ((iM139795H & 128) != 0) {
            ig60Var.m139809V(2);
        }
        if ((iM139795H & 64) != 0) {
            ig60Var.m139809V(ig60Var.m139795H());
        }
        if ((iM139795H & 32) != 0) {
            ig60Var.m139809V(2);
        }
        ig60Var.m139809V(1);
        m128684k(ig60Var);
        String strM149007h = kb00.m149007h(ig60Var.m139795H());
        if (DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG.equals(strM149007h) || "audio/vnd.dts".equals(strM149007h) || "audio/vnd.dts.hd".equals(strM149007h)) {
            return new C17117b(strM149007h, null, -1L, -1L);
        }
        ig60Var.m139809V(4);
        long jM139797J = ig60Var.m139797J();
        long jM139797J2 = ig60Var.m139797J();
        ig60Var.m139809V(1);
        int iM128684k = m128684k(ig60Var);
        long j = jM139797J2;
        byte[] bArr = new byte[iM128684k];
        ig60Var.m139822l(bArr, 0, iM128684k);
        if (j <= 0) {
            j = -1;
        }
        return new C17117b(strM149007h, bArr, j, jM139797J > 0 ? jM139797J : -1L);
    }

    /* JADX INFO: renamed from: k */
    public static int m128684k(ig60 ig60Var) {
        int iM139795H = ig60Var.m139795H();
        int i = iM139795H & 127;
        while ((iM139795H & 128) == 128) {
            iM139795H = ig60Var.m139795H();
            i = (i << 7) | (iM139795H & 127);
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public static int m128685l(ig60 ig60Var) {
        ig60Var.m139808U(16);
        return ig60Var.m139827q();
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static Metadata m128686m(ig60 ig60Var, int i) {
        ig60Var.m139809V(8);
        ArrayList arrayList = new ArrayList();
        while (ig60Var.m139816f() < i) {
            Metadata.Entry entryM148908c = ka00.m148908c(ig60Var);
            if (entryM148908c != null) {
                arrayList.add(entryM148908c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public static Pair<Long, String> m128687n(ig60 ig60Var) {
        ig60Var.m139808U(8);
        int iM123699c = f31.m123699c(ig60Var.m139827q());
        ig60Var.m139809V(iM123699c == 0 ? 8 : 16);
        long jM139797J = ig60Var.m139797J();
        ig60Var.m139809V(iM123699c == 0 ? 4 : 8);
        int iM139801N = ig60Var.m139801N();
        return Pair.create(Long.valueOf(jM139797J), "" + ((char) (((iM139801N >> 10) & 31) + 96)) + ((char) (((iM139801N >> 5) & 31) + 96)) + ((char) ((iM139801N & 31) + 96)));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static Metadata m128688o(f31.C16879a c16879a) {
        f31.C16880b c16880bM123703g = c16879a.m123703g(1751411826);
        f31.C16880b c16880bM123703g2 = c16879a.m123703g(1801812339);
        f31.C16880b c16880bM123703g3 = c16879a.m123703g(1768715124);
        if (c16880bM123703g == null || c16880bM123703g2 == null || c16880bM123703g3 == null || m128685l(c16880bM123703g.f96944b) != 1835299937) {
            return null;
        }
        ig60 ig60Var = c16880bM123703g2.f96944b;
        ig60Var.m139808U(12);
        int iM139827q = ig60Var.m139827q();
        String[] strArr = new String[iM139827q];
        for (int i = 0; i < iM139827q; i++) {
            int iM139827q2 = ig60Var.m139827q();
            ig60Var.m139809V(4);
            strArr[i] = ig60Var.m139792E(iM139827q2 - 8);
        }
        ig60 ig60Var2 = c16880bM123703g3.f96944b;
        ig60Var2.m139808U(8);
        ArrayList arrayList = new ArrayList();
        while (ig60Var2.m139811a() > 8) {
            int iM139816f = ig60Var2.m139816f();
            int iM139827q3 = ig60Var2.m139827q();
            int iM139827q4 = ig60Var2.m139827q() - 1;
            if (iM139827q4 < 0 || iM139827q4 >= iM139827q) {
                kyv.m152151i("AtomParsers", "Skipped metadata with unknown key index: " + iM139827q4);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryM148911f = ka00.m148911f(ig60Var2, iM139816f + iM139827q3, strArr[iM139827q4]);
                if (mdtaMetadataEntryM148911f != null) {
                    arrayList.add(mdtaMetadataEntryM148911f);
                }
            }
            ig60Var2.m139808U(iM139816f + iM139827q3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX INFO: renamed from: p */
    public static void m128689p(ig60 ig60Var, int i, int i2, int i3, C17120e c17120e) {
        ig60Var.m139808U(i2 + 16);
        if (i == 1835365492) {
            ig60Var.m139789B();
            String strM139789B = ig60Var.m139789B();
            if (strM139789B != null) {
                c17120e.f101924b = new C1894k.b().m10387T(i3).m10400g0(strM139789B).m10374G();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static C17118c m128690q(ig60 ig60Var) {
        long jM139797J;
        ig60Var.m139808U(8);
        if (f31.m123699c(ig60Var.m139827q()) == 0) {
            jM139797J = ig60Var.m139797J();
            ig60Var.m139809V(4);
        } else {
            long jM139788A = ig60Var.m139788A();
            ig60Var.m139809V(8);
            jM139797J = jM139788A;
        }
        return new C17118c(new Metadata(new CreationTime((jM139797J - 2082844800) * 1000)), ig60Var.m139797J());
    }

    /* JADX INFO: renamed from: r */
    public static float m128691r(ig60 ig60Var, int i) {
        ig60Var.m139808U(i + 8);
        return ig60Var.m139799L() / ig60Var.m139799L();
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static byte[] m128692s(ig60 ig60Var, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            ig60Var.m139808U(i3);
            int iM139827q = ig60Var.m139827q();
            if (ig60Var.m139827q() == 1886547818) {
                return Arrays.copyOfRange(ig60Var.m139815e(), i3, iM139827q + i3);
            }
            i3 += iM139827q;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public static Pair<Integer, zej0> m128693t(ig60 ig60Var, int i, int i2) throws ParserException {
        Pair<Integer, zej0> pairM128681h;
        int iM139816f = ig60Var.m139816f();
        while (iM139816f - i < i2) {
            ig60Var.m139808U(iM139816f);
            int iM139827q = ig60Var.m139827q();
            csf.m112176a(iM139827q > 0, "childAtomSize must be positive");
            if (ig60Var.m139827q() == 1936289382 && (pairM128681h = m128681h(ig60Var, iM139816f, iM139827q)) != null) {
                return pairM128681h;
            }
            iM139816f += iM139827q;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static zej0 m128694u(ig60 ig60Var, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            ig60Var.m139808U(i5);
            int iM139827q = ig60Var.m139827q();
            if (ig60Var.m139827q() == 1952804451) {
                int iM123699c = f31.m123699c(ig60Var.m139827q());
                ig60Var.m139809V(1);
                if (iM123699c == 0) {
                    ig60Var.m139809V(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int iM139795H = ig60Var.m139795H();
                    i3 = iM139795H & 15;
                    i4 = (iM139795H & 240) >> 4;
                }
                boolean z = ig60Var.m139795H() == 1;
                int iM139795H2 = ig60Var.m139795H();
                byte[] bArr2 = new byte[16];
                ig60Var.m139822l(bArr2, 0, 16);
                if (z && iM139795H2 == 0) {
                    int iM139795H3 = ig60Var.m139795H();
                    bArr = new byte[iM139795H3];
                    ig60Var.m139822l(bArr, 0, iM139795H3);
                }
                return new zej0(z, str, iM139795H2, bArr2, i4, i3, bArr);
            }
            i5 += iM139827q;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public static Metadata m128695v(ig60 ig60Var, int i) {
        ig60Var.m139809V(12);
        while (ig60Var.m139816f() < i) {
            int iM139816f = ig60Var.m139816f();
            int iM139827q = ig60Var.m139827q();
            if (ig60Var.m139827q() == 1935766900) {
                if (iM139827q < 14) {
                    return null;
                }
                ig60Var.m139809V(5);
                int iM139795H = ig60Var.m139795H();
                if (iM139795H != 12 && iM139795H != 13) {
                    return null;
                }
                float f = iM139795H == 12 ? 240.0f : 120.0f;
                ig60Var.m139809V(1);
                return new Metadata(new SmtaMetadataEntry(f, ig60Var.m139795H()));
            }
            ig60Var.m139808U(iM139816f + iM139827q);
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
    public static ufj0 m128696w(yej0 yej0Var, f31.C16879a c16879a, ilj iljVar) throws ParserException {
        InterfaceC17119d c17122g;
        boolean z;
        int iM139799L;
        int iM139799L2;
        int iM139799L3;
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
        f31.C16880b c16880bM123703g = c16879a.m123703g(1937011578);
        if (c16880bM123703g != null) {
            c17122g = new C17121f(c16880bM123703g, yej0Var.f199371f);
        } else {
            f31.C16880b c16880bM123703g2 = c16879a.m123703g(1937013298);
            if (c16880bM123703g2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            c17122g = new C17122g(c16880bM123703g2);
        }
        int iMo128706b = c17122g.mo128706b();
        if (iMo128706b == 0) {
            return new ufj0(yej0Var, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        f31.C16880b c16880bM123703g3 = c16879a.m123703g(1937007471);
        if (c16880bM123703g3 == null) {
            c16880bM123703g3 = (f31.C16880b) w11.m204369e(c16879a.m123703g(1668232756));
            z = true;
        } else {
            z = false;
        }
        ig60 ig60Var = c16880bM123703g3.f96944b;
        ig60 ig60Var2 = ((f31.C16880b) w11.m204369e(c16879a.m123703g(1937011555))).f96944b;
        ig60 ig60Var3 = ((f31.C16880b) w11.m204369e(c16879a.m123703g(1937011827))).f96944b;
        f31.C16880b c16880bM123703g4 = c16879a.m123703g(1937011571);
        ig60 ig60Var4 = c16880bM123703g4 != null ? c16880bM123703g4.f96944b : null;
        f31.C16880b c16880bM123703g5 = c16879a.m123703g(1668576371);
        ig60 ig60Var5 = c16880bM123703g5 != null ? c16880bM123703g5.f96944b : null;
        C17116a c17116a = new C17116a(ig60Var2, ig60Var, z);
        ig60Var3.m139808U(12);
        int iM139799L4 = ig60Var3.m139799L() - 1;
        int iM139799L5 = ig60Var3.m139799L();
        int iM139799L6 = ig60Var3.m139799L();
        if (ig60Var5 != null) {
            ig60Var5.m139808U(12);
            iM139799L = ig60Var5.m139799L();
        } else {
            iM139799L = 0;
        }
        if (ig60Var4 != null) {
            ig60Var4.m139808U(12);
            iM139799L3 = ig60Var4.m139799L();
            if (iM139799L3 > 0) {
                iM139799L2 = ig60Var4.m139799L() - 1;
                z2 = false;
            } else {
                iM139799L2 = -1;
                z2 = false;
                ig60Var4 = null;
            }
        } else {
            iM139799L2 = -1;
            iM139799L3 = 0;
            z2 = false;
        }
        int iMo128707c = c17122g.mo128707c();
        String str = yej0Var.f199371f.f7785l;
        boolean z5 = (iMo128707c == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iM139799L4 == 0 && iM139799L == 0 && iM139799L3 == 0)) ? z2 ? 1 : 0 : true;
        InterfaceC17119d interfaceC17119d = c17122g;
        if (z5) {
            int i6 = c17116a.f101908a;
            long[] jArr2 = new long[i6];
            int[] iArr8 = new int[i6];
            while (c17116a.m128700a()) {
                int i7 = c17116a.f101909b;
                jArr2[i7] = c17116a.f101911d;
                iArr8[i7] = c17116a.f101910c;
            }
            mri.C18692b c18692bM159707a = mri.m159707a(iMo128707c, jArr2, iArr8, iM139799L6);
            long[] jArr3 = c18692bM159707a.f138381a;
            iArr = c18692bM159707a.f138382b;
            int i8 = c18692bM159707a.f138383c;
            long[] jArr4 = c18692bM159707a.f138384d;
            int[] iArr9 = c18692bM159707a.f138385e;
            j2 = c18692bM159707a.f138386f;
            jArr = jArr3;
            r4 = i8;
            jArrCopyOf = jArr4;
            iArr2 = iArr9;
            j = 0;
        } else {
            long[] jArr5 = new long[iMo128706b];
            j = 0;
            int[] iArrCopyOf = new int[iMo128706b];
            jArrCopyOf = new long[iMo128706b];
            ig60 ig60Var6 = ig60Var5;
            int[] iArrCopyOf2 = new int[iMo128706b];
            ig60 ig60Var7 = ig60Var4;
            int iM139799L7 = iM139799L2;
            int i9 = z2 ? 1 : 0;
            int iM139827q = i9;
            int i10 = iM139827q == true ? 1 : 0;
            int i11 = i10;
            long j4 = 0;
            long j5 = 0;
            int i12 = iM139799L;
            int iM139827q2 = iM139799L6;
            int i13 = iM139799L5;
            int i14 = iM139799L4;
            int i15 = i11 == true ? 1 : 0;
            while (true) {
                if (i9 >= iMo128706b) {
                    boolean z6 = iMo128706b == true ? 1 : 0;
                    i = i13;
                    i2 = i10;
                    break;
                }
                long j6 = j5;
                int i16 = i10;
                boolean zM128700a = true;
                while (i16 == 0) {
                    zM128700a = c17116a.m128700a();
                    if (!zM128700a) {
                        break;
                    }
                    int i17 = i13;
                    long j7 = c17116a.f101911d;
                    i16 = c17116a.f101910c;
                    j6 = j7;
                    i13 = i17;
                    iM139827q2 = iM139827q2;
                    iMo128706b = iMo128706b == true ? 1 : 0;
                }
                int i18 = iMo128706b;
                i = i13;
                int i19 = iM139827q2;
                if (!zM128700a) {
                    kyv.m152151i("AtomParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr5, i9);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i9);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i9);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i9);
                    jArr5 = jArrCopyOf2;
                    iMo128706b = i9;
                    i2 = i16;
                    break;
                }
                if (ig60Var6 != null) {
                    int iM139799L8 = i11 == true ? 1 : 0;
                    while (iM139799L8 == 0 && i12 > 0) {
                        iM139799L8 = ig60Var6.m139799L();
                        iM139827q = ig60Var6.m139827q();
                        i12--;
                    }
                    i11 = iM139799L8 - 1;
                }
                jArr5[i9] = j6;
                int iMo128705a = interfaceC17119d.mo128705a();
                iArrCopyOf[i9] = iMo128705a;
                if (iMo128705a > i15) {
                    i15 = iMo128705a;
                }
                jArrCopyOf[i9] = j4 + ((long) iM139827q);
                iArrCopyOf2[i9] = ig60Var7 == null ? 1 : z2 ? 1 : 0;
                if (i9 == iM139799L7) {
                    iArrCopyOf2[i9] = 1;
                    iM139799L3--;
                    if (iM139799L3 > 0) {
                        iM139799L7 = ((ig60) w11.m204369e(ig60Var7)).m139799L() - 1;
                    }
                }
                j4 += (long) i19;
                int iM139799L9 = i - 1;
                if (iM139799L9 != 0 || i14 <= 0) {
                    iM139827q2 = i19;
                } else {
                    iM139799L9 = ig60Var3.m139799L();
                    i14--;
                    iM139827q2 = ig60Var3.m139827q();
                }
                i13 = iM139799L9;
                long j8 = j6 + ((long) iArrCopyOf[i9]);
                i10 = i16 - 1;
                i9++;
                j5 = j8;
                iMo128706b = i18 == true ? 1 : 0;
            }
            j2 = j4 + ((long) iM139827q);
            if (ig60Var6 == null) {
                z3 = true;
                break;
            }
            while (true) {
                if (i12 <= 0) {
                    z3 = true;
                    break;
                }
                if (ig60Var6.m139799L() != 0) {
                    z3 = z2 ? 1 : 0;
                    break;
                }
                ig60Var6.m139827q();
                i12--;
            }
            if (iM139799L3 != 0 || i != 0 || i2 != 0 || i14 != 0 || i11 != 0 || !z3) {
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                sb.append(yej0Var.f199366a);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(iM139799L3);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i2);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i14);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i11 == true ? 1 : 0 ? 1 : 0);
                sb.append(!z3 ? ", ctts invalid" : "");
                kyv.m152151i("AtomParsers", sb.toString());
            }
            iArr = iArrCopyOf;
            jArr = jArr5;
            r4 = i15 == true ? 1 : 0;
            iArr2 = iArrCopyOf2;
        }
        long j9 = j2;
        long jM105110W0 = bmk0.m105110W0(j9, 1000000L, yej0Var.f199368c);
        long[] jArr6 = yej0Var.f199373h;
        if (jArr6 == null) {
            bmk0.m105114Y0(jArrCopyOf, 1000000L, yej0Var.f199368c);
            return new ufj0(yej0Var, jArr, iArr, r4 == true ? 1 : 0, jArrCopyOf, iArr2, jM105110W0);
        }
        int[] iArr10 = iArr;
        int i20 = iMo128706b;
        int[] iArr11 = iArr10;
        if (jArr6.length == 1 && yej0Var.f199367b == 1 && jArrCopyOf.length >= 2) {
            long j10 = ((long[]) w11.m204369e(yej0Var.f199374i))[z2 ? 1 : 0];
            long jM105110W1 = j10 + bmk0.m105110W0(yej0Var.f199373h[z2 ? 1 : 0], yej0Var.f199368c, yej0Var.f199369d);
            long[] jArr7 = jArr;
            long[] jArr8 = jArrCopyOf;
            jArrCopyOf = jArr8;
            if (m128675b(jArr8, j9, j10, jM105110W1)) {
                long jM105110W2 = bmk0.m105110W0(j10 - jArrCopyOf[z2 ? 1 : 0], yej0Var.f199371f.f7799z, yej0Var.f199368c);
                long jM105110W3 = bmk0.m105110W0(j9 - jM105110W1, yej0Var.f199371f.f7799z, yej0Var.f199368c);
                if (jM105110W2 != j || jM105110W3 != j) {
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j9 = j9;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    iArr3 = iArr11;
                    j9 = j9;
                    if (jM105110W2 <= 2147483647L && jM105110W3 <= 2147483647L) {
                        iljVar.f115580a = (int) jM105110W2;
                        iljVar.f115581b = (int) jM105110W3;
                        bmk0.m105114Y0(jArrCopyOf, 1000000L, yej0Var.f199368c);
                        return new ufj0(yej0Var, jArr7, iArr11, r4 == true ? 1 : 0, jArrCopyOf, iArr2, bmk0.m105110W0(yej0Var.f199373h[z2 ? 1 : 0], 1000000L, yej0Var.f199369d));
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
        long[] jArr9 = yej0Var.f199373h;
        if (jArr9.length == 1 && jArr9[z2 ? 1 : 0] == j) {
            long j11 = ((long[]) w11.m204369e(yej0Var.f199374i))[z2 ? 1 : 0];
            for (int i21 = z2 ? 1 : 0; i21 < jArrCopyOf.length; i21++) {
                jArrCopyOf[i21] = bmk0.m105110W0(jArrCopyOf[i21] - j11, 1000000L, yej0Var.f199368c);
            }
            return new ufj0(yej0Var, jArr, iArr3, r4 == true ? 1 : 0, jArrCopyOf, iArr2, bmk0.m105110W0(j9 - j11, 1000000L, yej0Var.f199368c));
        }
        boolean z7 = yej0Var.f199367b == 1 ? true : z2 ? 1 : 0;
        int[] iArr12 = new int[jArr9.length];
        int[] iArr13 = new int[jArr9.length];
        long[] jArr10 = (long[]) w11.m204369e(yej0Var.f199374i);
        int i22 = z2 ? 1 : 0;
        boolean z8 = i22 == true ? 1 : 0;
        int i23 = z8 ? 1 : 0;
        int i24 = i23;
        boolean z9 = z8;
        while (true) {
            long[] jArr11 = yej0Var.f199373h;
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
                long jM105110W4 = bmk0.m105110W0(j13, yej0Var.f199368c, yej0Var.f199369d);
                iArr7 = iArr14;
                iArr7[i3 == true ? 1 : 0] = bmk0.m105141i(jArrCopyOf, j12, true, true);
                long j14 = j12 + jM105110W4;
                z4 = z2;
                iArr4[i3 == true ? 1 : 0] = bmk0.m105129e(jArrCopyOf, j14, z7, z4);
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
        while (r11 < yej0Var.f199373h.length) {
            long j16 = yej0Var.f199374i[r11];
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
                long jM105110W5 = bmk0.m105110W0(j15, 1000000L, yej0Var.f199369d);
                long jM105110W6 = bmk0.m105110W0(jArrCopyOf[i25] - j16, 1000000L, yej0Var.f199368c);
                int i29 = i26;
                long[] jArr16 = jArrCopyOf;
                if (m128676c(yej0Var.f199367b)) {
                    j3 = j;
                    jM105110W6 = Math.max(j3, jM105110W6);
                } else {
                    j3 = j;
                }
                jArr14[r13] = jM105110W5 + jM105110W6;
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
            j15 += yej0Var.f199373h[r11];
            jArr = jArr;
            jArrCopyOf = jArrCopyOf;
            iArr2 = iArr2;
            z14 = z15;
            iArr17 = iArr18;
            r5 = i28;
            r11++;
            r12 = r13;
        }
        return new ufj0(yej0Var, jArr13, iArr5, r5, jArr14, iArr16, bmk0.m105110W0(j15, 1000000L, yej0Var.f199369d));
    }

    /* JADX INFO: renamed from: x */
    public static C17120e m128697x(ig60 ig60Var, int i, int i2, String str, @Nullable DrmInitData drmInitData, boolean z) throws ParserException {
        ig60Var.m139808U(12);
        int iM139827q = ig60Var.m139827q();
        C17120e c17120e = new C17120e(iM139827q);
        int i3 = 0;
        while (i3 < iM139827q) {
            int iM139816f = ig60Var.m139816f();
            int iM139827q2 = ig60Var.m139827q();
            csf.m112176a(iM139827q2 > 0, "childAtomSize must be positive");
            int iM139827q3 = ig60Var.m139827q();
            if (iM139827q3 == 1635148593 || iM139827q3 == 1635148595 || iM139827q3 == 1701733238 || iM139827q3 == 1831958048 || iM139827q3 == 1836070006 || iM139827q3 == 1752589105 || iM139827q3 == 1751479857 || iM139827q3 == 1932670515 || iM139827q3 == 1211250227 || iM139827q3 == 1987063864 || iM139827q3 == 1987063865 || iM139827q3 == 1635135537 || iM139827q3 == 1685479798 || iM139827q3 == 1685479729 || iM139827q3 == 1685481573 || iM139827q3 == 1685481521) {
                C17120e c17120e2 = c17120e;
                int i4 = i3;
                m128672E(ig60Var, iM139827q3, iM139816f, iM139827q2, i, i2, drmInitData, c17120e2, i4);
                c17120e = c17120e2;
                i3 = i4;
            } else if (iM139827q3 == 1836069985 || iM139827q3 == 1701733217 || iM139827q3 == 1633889587 || iM139827q3 == 1700998451 || iM139827q3 == 1633889588 || iM139827q3 == 1835823201 || iM139827q3 == 1685353315 || iM139827q3 == 1685353317 || iM139827q3 == 1685353320 || iM139827q3 == 1685353324 || iM139827q3 == 1685353336 || iM139827q3 == 1935764850 || iM139827q3 == 1935767394 || iM139827q3 == 1819304813 || iM139827q3 == 1936684916 || iM139827q3 == 1953984371 || iM139827q3 == 778924082 || iM139827q3 == 778924083 || iM139827q3 == 1835557169 || iM139827q3 == 1835560241 || iM139827q3 == 1634492771 || iM139827q3 == 1634492791 || iM139827q3 == 1970037111 || iM139827q3 == 1332770163 || iM139827q3 == 1716281667) {
                C17120e c17120e3 = c17120e;
                m128680g(ig60Var, iM139827q3, iM139816f, iM139827q2, i, str, z, drmInitData, c17120e3, i3);
                c17120e = c17120e3;
            } else if (iM139827q3 == 1414810956 || iM139827q3 == 1954034535 || iM139827q3 == 2004251764 || iM139827q3 == 1937010800 || iM139827q3 == 1664495672) {
                m128698y(ig60Var, iM139827q3, iM139816f, iM139827q2, i, str, c17120e);
            } else if (iM139827q3 == 1835365492) {
                m128689p(ig60Var, iM139827q3, iM139816f, i, c17120e);
            } else if (iM139827q3 == 1667329389) {
                c17120e.f101924b = new C1894k.b().m10387T(i).m10400g0("application/x-camera-motion").m10374G();
            }
            ig60Var.m139808U(iM139816f + iM139827q2);
            i3++;
        }
        return c17120e;
    }

    /* JADX INFO: renamed from: y */
    public static void m128698y(ig60 ig60Var, int i, int i2, int i3, int i4, String str, C17120e c17120e) {
        ig60Var.m139808U(i2 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableListM15740of = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                ig60Var.m139822l(bArr, 0, i5);
                immutableListM15740of = ImmutableList.m15740of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i != 1664495672) {
                wpg0.m207458a();
                return;
            } else {
                c17120e.f101926d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        c17120e.f101924b = new C1894k.b().m10387T(i4).m10400g0(str2).m10391X(str).m10404k0(j).m10389V(immutableListM15740of).m10374G();
    }

    /* JADX INFO: renamed from: z */
    public static C17123h m128699z(ig60 ig60Var) {
        long j;
        ig60Var.m139808U(8);
        int iM123699c = f31.m123699c(ig60Var.m139827q());
        ig60Var.m139809V(iM123699c == 0 ? 8 : 16);
        int iM139827q = ig60Var.m139827q();
        ig60Var.m139809V(4);
        int iM139816f = ig60Var.m139816f();
        int i = iM123699c == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i3 >= i) {
                ig60Var.m139809V(i);
                break;
            }
            if (ig60Var.m139815e()[iM139816f + i3] != -1) {
                long jM139797J = iM123699c == 0 ? ig60Var.m139797J() : ig60Var.m139800M();
                if (jM139797J == 0) {
                    break;
                }
                j = jM139797J;
                break;
            }
            i3++;
        }
        ig60Var.m139809V(16);
        int iM139827q2 = ig60Var.m139827q();
        int iM139827q3 = ig60Var.m139827q();
        ig60Var.m139809V(4);
        int iM139827q4 = ig60Var.m139827q();
        int iM139827q5 = ig60Var.m139827q();
        if (iM139827q2 == 0 && iM139827q3 == 65536 && iM139827q4 == -65536 && iM139827q5 == 0) {
            i2 = 90;
        } else if (iM139827q2 == 0 && iM139827q3 == -65536 && iM139827q4 == 65536 && iM139827q5 == 0) {
            i2 = 270;
        } else if (iM139827q2 == -65536 && iM139827q3 == 0 && iM139827q4 == 0 && iM139827q5 == -65536) {
            i2 = 180;
        }
        return new C17123h(iM139827q, j, i2);
    }
}
