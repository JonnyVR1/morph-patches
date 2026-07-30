package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.drm.DrmInitData;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.nio.ByteBuffer;
import okio.Utf8;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: l.z8 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C21775z8 {

    /* JADX INFO: renamed from: a */
    public static final int[] f203284a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b */
    public static final int[] f203285b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f203286c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d */
    public static final int[] f203287d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e */
    public static final int[] f203288e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f */
    public static final int[] f203289f = {69, 87, 104, 121, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 208, 243, 278, 348, HttpStatus.EXPECTATION_FAILED_417, 487, 557, 696, 835, 975, RtcEngineEvent.EvtType.EVT_JOIN_PUBILSHER_RESPONSE, 1253, 1393};

    /* JADX INFO: renamed from: l.z8$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final String f203290a;

        /* JADX INFO: renamed from: b */
        public final int f203291b;

        /* JADX INFO: renamed from: c */
        public final int f203292c;

        /* JADX INFO: renamed from: d */
        public final int f203293d;

        /* JADX INFO: renamed from: e */
        public final int f203294e;

        /* JADX INFO: renamed from: f */
        public final int f203295f;

        /* JADX INFO: renamed from: g */
        public final int f203296g;

        public b(@Nullable String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f203290a = str;
            this.f203291b = i;
            this.f203293d = i2;
            this.f203292c = i3;
            this.f203294e = i4;
            this.f203295f = i5;
            this.f203296g = i6;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m218927a(int i, int i2, int i3) {
        return (i * i2) / (i3 * 32);
    }

    /* JADX INFO: renamed from: b */
    public static int m218928b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((bmk0.m105083J(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static int m218929c(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f203285b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f203289f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f203288e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* JADX INFO: renamed from: d */
    public static C1894k m218930d(ig60 ig60Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        hg60 hg60Var = new hg60();
        hg60Var.m134910m(ig60Var);
        int i = f203285b[hg60Var.m134905h(2)];
        hg60Var.m134915r(8);
        int i2 = f203287d[hg60Var.m134905h(3)];
        if (hg60Var.m134905h(1) != 0) {
            i2++;
        }
        int i3 = f203288e[hg60Var.m134905h(5)] * 1000;
        hg60Var.m134900c();
        ig60Var.m139808U(hg60Var.m134901d());
        return new C1894k.b().m10388U(str).m10400g0("audio/ac3").m10377J(i2).m10401h0(i).m10382O(drmInitData).m10391X(str2).m10376I(i3).m10395b0(i3).m10374G();
    }

    /* JADX INFO: renamed from: e */
    public static int m218931e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f203284a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* JADX INFO: renamed from: f */
    public static b m218932f(hg60 hg60Var) {
        int iM218929c;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM134902e = hg60Var.m134902e();
        hg60Var.m134915r(40);
        boolean z = hg60Var.m134905h(5) > 10;
        hg60Var.m134913p(iM134902e);
        int i10 = -1;
        if (z) {
            hg60Var.m134915r(16);
            int iM134905h = hg60Var.m134905h(2);
            if (iM134905h == 0) {
                i10 = 0;
            } else if (iM134905h == 1) {
                i10 = 1;
            } else if (iM134905h == 2) {
                i10 = 2;
            }
            hg60Var.m134915r(3);
            iM218929c = (hg60Var.m134905h(11) + 1) * 2;
            int iM134905h2 = hg60Var.m134905h(2);
            if (iM134905h2 == 3) {
                i = f203286c[hg60Var.m134905h(2)];
                i5 = 3;
                i6 = 6;
            } else {
                int iM134905h3 = hg60Var.m134905h(2);
                int i11 = f203284a[iM134905h3];
                i5 = iM134905h3;
                i = f203285b[iM134905h2];
                i6 = i11;
            }
            i3 = i6 * 256;
            int iM218927a = m218927a(iM218929c, i, i6);
            int iM134905h4 = hg60Var.m134905h(3);
            boolean zM134904g = hg60Var.m134904g();
            i2 = f203287d[iM134905h4] + (zM134904g ? 1 : 0);
            hg60Var.m134915r(10);
            if (hg60Var.m134904g()) {
                hg60Var.m134915r(8);
            }
            if (iM134905h4 == 0) {
                hg60Var.m134915r(5);
                if (hg60Var.m134904g()) {
                    hg60Var.m134915r(8);
                }
            }
            if (i10 == 1 && hg60Var.m134904g()) {
                hg60Var.m134915r(16);
            }
            if (hg60Var.m134904g()) {
                if (iM134905h4 > 2) {
                    hg60Var.m134915r(2);
                }
                if ((iM134905h4 & 1) == 0 || iM134905h4 <= 2) {
                    i8 = 6;
                } else {
                    i8 = 6;
                    hg60Var.m134915r(6);
                }
                if ((iM134905h4 & 4) != 0) {
                    hg60Var.m134915r(i8);
                }
                if (zM134904g && hg60Var.m134904g()) {
                    hg60Var.m134915r(5);
                }
                if (i10 == 0) {
                    if (hg60Var.m134904g()) {
                        i9 = 6;
                        hg60Var.m134915r(6);
                    } else {
                        i9 = 6;
                    }
                    if (iM134905h4 == 0 && hg60Var.m134904g()) {
                        hg60Var.m134915r(i9);
                    }
                    if (hg60Var.m134904g()) {
                        hg60Var.m134915r(i9);
                    }
                    int iM134905h5 = hg60Var.m134905h(2);
                    if (iM134905h5 == 1) {
                        hg60Var.m134915r(5);
                    } else if (iM134905h5 == 2) {
                        hg60Var.m134915r(12);
                    } else if (iM134905h5 == 3) {
                        int iM134905h6 = hg60Var.m134905h(5);
                        if (hg60Var.m134904g()) {
                            hg60Var.m134915r(5);
                            if (hg60Var.m134904g()) {
                                hg60Var.m134915r(4);
                            }
                            if (hg60Var.m134904g()) {
                                hg60Var.m134915r(4);
                            }
                            if (hg60Var.m134904g()) {
                                hg60Var.m134915r(4);
                            }
                            if (hg60Var.m134904g()) {
                                hg60Var.m134915r(4);
                            }
                            if (hg60Var.m134904g()) {
                                hg60Var.m134915r(4);
                            }
                            if (hg60Var.m134904g()) {
                                hg60Var.m134915r(4);
                            }
                            if (hg60Var.m134904g()) {
                                hg60Var.m134915r(4);
                            }
                            if (hg60Var.m134904g()) {
                                if (hg60Var.m134904g()) {
                                    hg60Var.m134915r(4);
                                }
                                if (hg60Var.m134904g()) {
                                    hg60Var.m134915r(4);
                                }
                            }
                        }
                        if (hg60Var.m134904g()) {
                            hg60Var.m134915r(5);
                            if (hg60Var.m134904g()) {
                                hg60Var.m134915r(7);
                                if (hg60Var.m134904g()) {
                                    hg60Var.m134915r(8);
                                }
                            }
                        }
                        hg60Var.m134915r((iM134905h6 + 2) * 8);
                        hg60Var.m134900c();
                    }
                    if (iM134905h4 < 2) {
                        if (hg60Var.m134904g()) {
                            hg60Var.m134915r(14);
                        }
                        if (iM134905h4 == 0 && hg60Var.m134904g()) {
                            hg60Var.m134915r(14);
                        }
                    }
                    if (hg60Var.m134904g()) {
                        if (i5 == 0) {
                            hg60Var.m134915r(5);
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (hg60Var.m134904g()) {
                                    hg60Var.m134915r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (hg60Var.m134904g()) {
                hg60Var.m134915r(5);
                if (iM134905h4 == 2) {
                    hg60Var.m134915r(4);
                }
                if (iM134905h4 >= 6) {
                    hg60Var.m134915r(2);
                }
                if (hg60Var.m134904g()) {
                    hg60Var.m134915r(8);
                }
                if (iM134905h4 == 0 && hg60Var.m134904g()) {
                    hg60Var.m134915r(8);
                }
                if (iM134905h2 < 3) {
                    hg60Var.m134914q();
                }
            }
            if (i10 == 0 && i5 != 3) {
                hg60Var.m134914q();
            }
            if (i10 == 2 && (i5 == 3 || hg60Var.m134904g())) {
                i7 = 6;
                hg60Var.m134915r(6);
            } else {
                i7 = 6;
            }
            str = (hg60Var.m134904g() && hg60Var.m134905h(i7) == 1 && hg60Var.m134905h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = iM218927a;
        } else {
            hg60Var.m134915r(32);
            int iM134905h7 = hg60Var.m134905h(2);
            String str2 = iM134905h7 == 3 ? null : "audio/ac3";
            int iM134905h8 = hg60Var.m134905h(6);
            int i13 = f203288e[iM134905h8 / 2] * 1000;
            iM218929c = m218929c(iM134905h7, iM134905h8);
            hg60Var.m134915r(8);
            int iM134905h9 = hg60Var.m134905h(3);
            if ((iM134905h9 & 1) != 0 && iM134905h9 != 1) {
                hg60Var.m134915r(2);
            }
            if ((iM134905h9 & 4) != 0) {
                hg60Var.m134915r(2);
            }
            if (iM134905h9 == 2) {
                hg60Var.m134915r(2);
            }
            int[] iArr = f203285b;
            i = iM134905h7 < iArr.length ? iArr[iM134905h7] : -1;
            i2 = f203287d[iM134905h9] + (hg60Var.m134904g() ? 1 : 0);
            i3 = 1536;
            str = str2;
            i4 = i13;
        }
        return new b(str, i10, i2, i, iM218929c, i3, i4);
    }

    /* JADX INFO: renamed from: g */
    public static int m218933g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return m218929c((b2 & 192) >> 6, b2 & Utf8.REPLACEMENT_BYTE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX INFO: renamed from: h */
    public static C1894k m218934h(ig60 ig60Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        String str3;
        hg60 hg60Var = new hg60();
        hg60Var.m134910m(ig60Var);
        int iM134905h = hg60Var.m134905h(13) * 1000;
        hg60Var.m134915r(3);
        int i = f203285b[hg60Var.m134905h(2)];
        hg60Var.m134915r(10);
        int i2 = f203287d[hg60Var.m134905h(3)];
        if (hg60Var.m134905h(1) != 0) {
            i2++;
        }
        hg60Var.m134915r(3);
        int iM134905h2 = hg60Var.m134905h(4);
        hg60Var.m134915r(1);
        if (iM134905h2 > 0) {
            hg60Var.m134915r(6);
            if (hg60Var.m134905h(1) != 0) {
                i2 += 2;
            }
            hg60Var.m134915r(1);
        }
        if (hg60Var.m134899b() > 7) {
            hg60Var.m134915r(7);
            if (hg60Var.m134905h(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        hg60Var.m134900c();
        ig60Var.m139808U(hg60Var.m134901d());
        return new C1894k.b().m10388U(str).m10400g0(str3).m10377J(i2).m10401h0(i).m10382O(drmInitData).m10391X(str2).m10395b0(iM134905h).m10374G();
    }

    /* JADX INFO: renamed from: i */
    public static int m218935i(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* JADX INFO: renamed from: j */
    public static int m218936j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
