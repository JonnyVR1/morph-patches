package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.wcdb.FileUtils;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.nio.ByteBuffer;
import okio.Utf8;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: l.e9 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C16561e9 {

    /* JADX INFO: renamed from: a */
    public static final int[] f89894a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b */
    public static final int[] f89895b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f89896c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d */
    public static final int[] f89897d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e */
    public static final int[] f89898e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, FileUtils.S_IRWXU, 512, 576, 640};

    /* JADX INFO: renamed from: f */
    public static final int[] f89899f = {69, 87, 104, 121, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 208, 243, 278, 348, HttpStatus.EXPECTATION_FAILED_417, 487, 557, 696, 835, 975, RtcEngineEvent.EvtType.EVT_JOIN_PUBILSHER_RESPONSE, 1253, 1393};

    /* JADX INFO: renamed from: l.e9$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final String f89900a;

        /* JADX INFO: renamed from: b */
        public final int f89901b;

        /* JADX INFO: renamed from: c */
        public final int f89902c;

        /* JADX INFO: renamed from: d */
        public final int f89903d;

        /* JADX INFO: renamed from: e */
        public final int f89904e;

        /* JADX INFO: renamed from: f */
        public final int f89905f;

        /* JADX INFO: renamed from: g */
        public final int f89906g;

        public b(@Nullable String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f89900a = str;
            this.f89901b = i;
            this.f89903d = i2;
            this.f89902c = i3;
            this.f89904e = i4;
            this.f89905f = i5;
            this.f89906g = i6;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m115319a(int i, int i2, int i3) {
        return (i * i2) / (i3 * 32);
    }

    /* JADX INFO: renamed from: b */
    public static int m115320b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((vck0.m197805J(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static int m115321c(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f89895b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f89899f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f89898e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* JADX INFO: renamed from: d */
    public static C1871k m115322d(d860 d860Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        c860 c860Var = new c860();
        c860Var.m105669m(d860Var);
        int i = f89895b[c860Var.m105664h(2)];
        c860Var.m105674r(8);
        int i2 = f89897d[c860Var.m105664h(3)];
        if (c860Var.m105664h(1) != 0) {
            i2++;
        }
        int i3 = f89898e[c860Var.m105664h(5)] * 1000;
        c860Var.m105659c();
        d860Var.m110292U(c860Var.m105660d());
        return new C1871k.b().m10334U(str).m10346g0("audio/ac3").m10323J(i2).m10347h0(i).m10328O(drmInitData).m10337X(str2).m10322I(i3).m10341b0(i3).m10320G();
    }

    /* JADX INFO: renamed from: e */
    public static int m115323e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f89894a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* JADX INFO: renamed from: f */
    public static b m115324f(c860 c860Var) {
        int iM115321c;
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
        int iM105661e = c860Var.m105661e();
        c860Var.m105674r(40);
        boolean z = c860Var.m105664h(5) > 10;
        c860Var.m105672p(iM105661e);
        int i10 = -1;
        if (z) {
            c860Var.m105674r(16);
            int iM105664h = c860Var.m105664h(2);
            if (iM105664h == 0) {
                i10 = 0;
            } else if (iM105664h == 1) {
                i10 = 1;
            } else if (iM105664h == 2) {
                i10 = 2;
            }
            c860Var.m105674r(3);
            iM115321c = (c860Var.m105664h(11) + 1) * 2;
            int iM105664h2 = c860Var.m105664h(2);
            if (iM105664h2 == 3) {
                i = f89896c[c860Var.m105664h(2)];
                i5 = 3;
                i6 = 6;
            } else {
                int iM105664h3 = c860Var.m105664h(2);
                int i11 = f89894a[iM105664h3];
                i5 = iM105664h3;
                i = f89895b[iM105664h2];
                i6 = i11;
            }
            i3 = i6 * 256;
            int iM115319a = m115319a(iM115321c, i, i6);
            int iM105664h4 = c860Var.m105664h(3);
            boolean zM105663g = c860Var.m105663g();
            i2 = f89897d[iM105664h4] + (zM105663g ? 1 : 0);
            c860Var.m105674r(10);
            if (c860Var.m105663g()) {
                c860Var.m105674r(8);
            }
            if (iM105664h4 == 0) {
                c860Var.m105674r(5);
                if (c860Var.m105663g()) {
                    c860Var.m105674r(8);
                }
            }
            if (i10 == 1 && c860Var.m105663g()) {
                c860Var.m105674r(16);
            }
            if (c860Var.m105663g()) {
                if (iM105664h4 > 2) {
                    c860Var.m105674r(2);
                }
                if ((iM105664h4 & 1) == 0 || iM105664h4 <= 2) {
                    i8 = 6;
                } else {
                    i8 = 6;
                    c860Var.m105674r(6);
                }
                if ((iM105664h4 & 4) != 0) {
                    c860Var.m105674r(i8);
                }
                if (zM105663g && c860Var.m105663g()) {
                    c860Var.m105674r(5);
                }
                if (i10 == 0) {
                    if (c860Var.m105663g()) {
                        i9 = 6;
                        c860Var.m105674r(6);
                    } else {
                        i9 = 6;
                    }
                    if (iM105664h4 == 0 && c860Var.m105663g()) {
                        c860Var.m105674r(i9);
                    }
                    if (c860Var.m105663g()) {
                        c860Var.m105674r(i9);
                    }
                    int iM105664h5 = c860Var.m105664h(2);
                    if (iM105664h5 == 1) {
                        c860Var.m105674r(5);
                    } else if (iM105664h5 == 2) {
                        c860Var.m105674r(12);
                    } else if (iM105664h5 == 3) {
                        int iM105664h6 = c860Var.m105664h(5);
                        if (c860Var.m105663g()) {
                            c860Var.m105674r(5);
                            if (c860Var.m105663g()) {
                                c860Var.m105674r(4);
                            }
                            if (c860Var.m105663g()) {
                                c860Var.m105674r(4);
                            }
                            if (c860Var.m105663g()) {
                                c860Var.m105674r(4);
                            }
                            if (c860Var.m105663g()) {
                                c860Var.m105674r(4);
                            }
                            if (c860Var.m105663g()) {
                                c860Var.m105674r(4);
                            }
                            if (c860Var.m105663g()) {
                                c860Var.m105674r(4);
                            }
                            if (c860Var.m105663g()) {
                                c860Var.m105674r(4);
                            }
                            if (c860Var.m105663g()) {
                                if (c860Var.m105663g()) {
                                    c860Var.m105674r(4);
                                }
                                if (c860Var.m105663g()) {
                                    c860Var.m105674r(4);
                                }
                            }
                        }
                        if (c860Var.m105663g()) {
                            c860Var.m105674r(5);
                            if (c860Var.m105663g()) {
                                c860Var.m105674r(7);
                                if (c860Var.m105663g()) {
                                    c860Var.m105674r(8);
                                }
                            }
                        }
                        c860Var.m105674r((iM105664h6 + 2) * 8);
                        c860Var.m105659c();
                    }
                    if (iM105664h4 < 2) {
                        if (c860Var.m105663g()) {
                            c860Var.m105674r(14);
                        }
                        if (iM105664h4 == 0 && c860Var.m105663g()) {
                            c860Var.m105674r(14);
                        }
                    }
                    if (c860Var.m105663g()) {
                        if (i5 == 0) {
                            c860Var.m105674r(5);
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (c860Var.m105663g()) {
                                    c860Var.m105674r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c860Var.m105663g()) {
                c860Var.m105674r(5);
                if (iM105664h4 == 2) {
                    c860Var.m105674r(4);
                }
                if (iM105664h4 >= 6) {
                    c860Var.m105674r(2);
                }
                if (c860Var.m105663g()) {
                    c860Var.m105674r(8);
                }
                if (iM105664h4 == 0 && c860Var.m105663g()) {
                    c860Var.m105674r(8);
                }
                if (iM105664h2 < 3) {
                    c860Var.m105673q();
                }
            }
            if (i10 == 0 && i5 != 3) {
                c860Var.m105673q();
            }
            if (i10 == 2 && (i5 == 3 || c860Var.m105663g())) {
                i7 = 6;
                c860Var.m105674r(6);
            } else {
                i7 = 6;
            }
            str = (c860Var.m105663g() && c860Var.m105664h(i7) == 1 && c860Var.m105664h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = iM115319a;
        } else {
            c860Var.m105674r(32);
            int iM105664h7 = c860Var.m105664h(2);
            String str2 = iM105664h7 == 3 ? null : "audio/ac3";
            int iM105664h8 = c860Var.m105664h(6);
            int i13 = f89898e[iM105664h8 / 2] * 1000;
            iM115321c = m115321c(iM105664h7, iM105664h8);
            c860Var.m105674r(8);
            int iM105664h9 = c860Var.m105664h(3);
            if ((iM105664h9 & 1) != 0 && iM105664h9 != 1) {
                c860Var.m105674r(2);
            }
            if ((iM105664h9 & 4) != 0) {
                c860Var.m105674r(2);
            }
            if (iM105664h9 == 2) {
                c860Var.m105674r(2);
            }
            int[] iArr = f89895b;
            i = iM105664h7 < iArr.length ? iArr[iM105664h7] : -1;
            i2 = f89897d[iM105664h9] + (c860Var.m105663g() ? 1 : 0);
            i3 = 1536;
            str = str2;
            i4 = i13;
        }
        return new b(str, i10, i2, i, iM115321c, i3, i4);
    }

    /* JADX INFO: renamed from: g */
    public static int m115325g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return m115321c((b2 & 192) >> 6, b2 & Utf8.REPLACEMENT_BYTE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX INFO: renamed from: h */
    public static C1871k m115326h(d860 d860Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        String str3;
        c860 c860Var = new c860();
        c860Var.m105669m(d860Var);
        int iM105664h = c860Var.m105664h(13) * 1000;
        c860Var.m105674r(3);
        int i = f89895b[c860Var.m105664h(2)];
        c860Var.m105674r(10);
        int i2 = f89897d[c860Var.m105664h(3)];
        if (c860Var.m105664h(1) != 0) {
            i2++;
        }
        c860Var.m105674r(3);
        int iM105664h2 = c860Var.m105664h(4);
        c860Var.m105674r(1);
        if (iM105664h2 > 0) {
            c860Var.m105674r(6);
            if (c860Var.m105664h(1) != 0) {
                i2 += 2;
            }
            c860Var.m105674r(1);
        }
        if (c860Var.m105658b() > 7) {
            c860Var.m105674r(7);
            if (c860Var.m105664h(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        c860Var.m105659c();
        d860Var.m110292U(c860Var.m105660d());
        return new C1871k.b().m10334U(str).m10346g0(str3).m10323J(i2).m10347h0(i).m10328O(drmInitData).m10337X(str2).m10341b0(iM105664h).m10320G();
    }

    /* JADX INFO: renamed from: i */
    public static int m115327i(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* JADX INFO: renamed from: j */
    public static int m115328j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
