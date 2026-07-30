package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzae;
import com.tencent.wcdb.FileUtils;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.nio.ByteBuffer;
import okio.Utf8;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class z3r0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f201396a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b */
    public static final int[] f201397b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f201398c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d */
    public static final int[] f201399d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e */
    public static final int[] f201400e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, FileUtils.S_IRWXU, 512, 576, 640};

    /* JADX INFO: renamed from: f */
    public static final int[] f201401f = {69, 87, 104, 121, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 208, 243, 278, 348, HttpStatus.EXPECTATION_FAILED_417, 487, 557, 696, 835, 975, RtcEngineEvent.EvtType.EVT_JOIN_PUBILSHER_RESPONSE, 1253, 1393};

    /* JADX INFO: renamed from: a */
    public static int m217054a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f201396a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* JADX INFO: renamed from: b */
    public static int m217055b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return m217059f((b & 192) >> 6, b & Utf8.REPLACEMENT_BYTE);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i2 + i2;
    }

    /* JADX INFO: renamed from: c */
    public static mhr0 m217056c(v6w0 v6w0Var, String str, String str2, @Nullable zzae zzaeVar) {
        x5w0 x5w0Var = new x5w0();
        x5w0Var.m207155i(v6w0Var);
        int i = f201397b[x5w0Var.m207150d(2)];
        x5w0Var.m207159m(8);
        int i2 = f201399d[x5w0Var.m207150d(3)];
        if (x5w0Var.m207150d(1) != 0) {
            i2++;
        }
        int i3 = f201400e[x5w0Var.m207150d(5)] * 1000;
        x5w0Var.m207151e();
        v6w0Var.m197262k(x5w0Var.m207148b());
        ter0 ter0Var = new ter0();
        ter0Var.m188604k(str);
        ter0Var.m188618w("audio/ac3");
        ter0Var.m188605k0(i2);
        ter0Var.m188619x(i);
        ter0Var.m188596e(zzaeVar);
        ter0Var.m188609n(str2);
        ter0Var.m188603j0(i3);
        ter0Var.m188613r(i3);
        return ter0Var.m188591D();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX INFO: renamed from: d */
    public static mhr0 m217057d(v6w0 v6w0Var, String str, String str2, @Nullable zzae zzaeVar) {
        String str3;
        x5w0 x5w0Var = new x5w0();
        x5w0Var.m207155i(v6w0Var);
        int iM207150d = x5w0Var.m207150d(13) * 1000;
        x5w0Var.m207159m(3);
        int i = f201397b[x5w0Var.m207150d(2)];
        x5w0Var.m207159m(10);
        int i2 = f201399d[x5w0Var.m207150d(3)];
        if (x5w0Var.m207150d(1) != 0) {
            i2++;
        }
        x5w0Var.m207159m(3);
        int iM207150d2 = x5w0Var.m207150d(4);
        x5w0Var.m207159m(1);
        if (iM207150d2 > 0) {
            x5w0Var.m207159m(6);
            if (x5w0Var.m207150d(1) != 0) {
                i2 += 2;
            }
            x5w0Var.m207159m(1);
        }
        if (x5w0Var.m207147a() > 7) {
            x5w0Var.m207159m(7);
            if (x5w0Var.m207150d(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        x5w0Var.m207151e();
        v6w0Var.m197262k(x5w0Var.m207148b());
        ter0 ter0Var = new ter0();
        ter0Var.m188604k(str);
        ter0Var.m188618w(str3);
        ter0Var.m188605k0(i2);
        ter0Var.m188619x(i);
        ter0Var.m188596e(zzaeVar);
        ter0Var.m188609n(str2);
        ter0Var.m188613r(iM207150d);
        return ter0Var.m188591D();
    }

    /* JADX INFO: renamed from: e */
    public static y3r0 m217058e(x5w0 x5w0Var) {
        int iM217059f;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM207149c = x5w0Var.m207149c();
        x5w0Var.m207159m(40);
        int iM207150d = x5w0Var.m207150d(5);
        x5w0Var.m207157k(iM207149c);
        int i9 = -1;
        if (iM207150d > 10) {
            x5w0Var.m207159m(16);
            int iM207150d2 = x5w0Var.m207150d(2);
            if (iM207150d2 == 0) {
                i9 = 0;
            } else if (iM207150d2 == 1) {
                i9 = 1;
            } else if (iM207150d2 == 2) {
                i9 = 2;
            }
            x5w0Var.m207159m(3);
            int iM207150d3 = x5w0Var.m207150d(11) + 1;
            int iM207150d4 = x5w0Var.m207150d(2);
            if (iM207150d4 == 3) {
                i = f201398c[x5w0Var.m207150d(2)];
                i6 = 6;
                i5 = 3;
            } else {
                int iM207150d5 = x5w0Var.m207150d(2);
                int i10 = f201396a[iM207150d5];
                i5 = iM207150d5;
                i = f201397b[iM207150d4];
                i6 = i10;
            }
            iM217059f = iM207150d3 + iM207150d3;
            int i11 = (iM217059f * i) / (i6 * 32);
            int iM207150d6 = x5w0Var.m207150d(3);
            boolean zM207161o = x5w0Var.m207161o();
            i2 = f201399d[iM207150d6] + (zM207161o ? 1 : 0);
            x5w0Var.m207159m(10);
            if (x5w0Var.m207161o()) {
                x5w0Var.m207159m(8);
            }
            if (iM207150d6 == 0) {
                x5w0Var.m207159m(5);
                if (x5w0Var.m207161o()) {
                    x5w0Var.m207159m(8);
                }
                i7 = 0;
                iM207150d6 = 0;
            } else {
                i7 = iM207150d6;
            }
            if (i9 == 1) {
                if (x5w0Var.m207161o()) {
                    x5w0Var.m207159m(16);
                }
                i8 = 1;
            } else {
                i8 = i9;
            }
            if (x5w0Var.m207161o()) {
                if (i7 > 2) {
                    x5w0Var.m207159m(2);
                }
                if ((i7 & 1) != 0 && i7 > 2) {
                    x5w0Var.m207159m(6);
                }
                if ((i7 & 4) != 0) {
                    x5w0Var.m207159m(6);
                }
                if (zM207161o && x5w0Var.m207161o()) {
                    x5w0Var.m207159m(5);
                }
                if (i8 == 0) {
                    if (x5w0Var.m207161o()) {
                        x5w0Var.m207159m(6);
                    }
                    if (i7 == 0 && x5w0Var.m207161o()) {
                        x5w0Var.m207159m(6);
                    }
                    if (x5w0Var.m207161o()) {
                        x5w0Var.m207159m(6);
                    }
                    int iM207150d7 = x5w0Var.m207150d(2);
                    if (iM207150d7 == 1) {
                        x5w0Var.m207159m(5);
                    } else if (iM207150d7 == 2) {
                        x5w0Var.m207159m(12);
                    } else if (iM207150d7 == 3) {
                        int iM207150d8 = x5w0Var.m207150d(5);
                        if (x5w0Var.m207161o()) {
                            x5w0Var.m207159m(5);
                            if (x5w0Var.m207161o()) {
                                x5w0Var.m207159m(4);
                            }
                            if (x5w0Var.m207161o()) {
                                x5w0Var.m207159m(4);
                            }
                            if (x5w0Var.m207161o()) {
                                x5w0Var.m207159m(4);
                            }
                            if (x5w0Var.m207161o()) {
                                x5w0Var.m207159m(4);
                            }
                            if (x5w0Var.m207161o()) {
                                x5w0Var.m207159m(4);
                            }
                            if (x5w0Var.m207161o()) {
                                x5w0Var.m207159m(4);
                            }
                            if (x5w0Var.m207161o()) {
                                x5w0Var.m207159m(4);
                            }
                            if (x5w0Var.m207161o()) {
                                if (x5w0Var.m207161o()) {
                                    x5w0Var.m207159m(4);
                                }
                                if (x5w0Var.m207161o()) {
                                    x5w0Var.m207159m(4);
                                }
                            }
                        }
                        if (x5w0Var.m207161o()) {
                            x5w0Var.m207159m(5);
                            if (x5w0Var.m207161o()) {
                                x5w0Var.m207159m(7);
                                if (x5w0Var.m207161o()) {
                                    x5w0Var.m207159m(8);
                                }
                            }
                        }
                        x5w0Var.m207159m((iM207150d8 + 2) * 8);
                        x5w0Var.m207151e();
                    }
                    if (i7 < 2) {
                        if (x5w0Var.m207161o()) {
                            x5w0Var.m207159m(14);
                        }
                        if (iM207150d6 == 0 && x5w0Var.m207161o()) {
                            x5w0Var.m207159m(14);
                        }
                    }
                    if (!x5w0Var.m207161o()) {
                        i8 = 0;
                    } else if (i5 == 0) {
                        x5w0Var.m207159m(5);
                        i8 = 0;
                        i5 = 0;
                    } else {
                        for (int i12 = 0; i12 < i6; i12++) {
                            if (x5w0Var.m207161o()) {
                                x5w0Var.m207159m(5);
                            }
                        }
                        i8 = 0;
                    }
                }
            }
            if (x5w0Var.m207161o()) {
                x5w0Var.m207159m(5);
                if (i7 == 2) {
                    x5w0Var.m207159m(4);
                    i7 = 2;
                }
                if (i7 >= 6) {
                    x5w0Var.m207159m(2);
                }
                if (x5w0Var.m207161o()) {
                    x5w0Var.m207159m(8);
                }
                if (i7 == 0 && x5w0Var.m207161o()) {
                    x5w0Var.m207159m(8);
                }
                if (iM207150d4 < 3) {
                    x5w0Var.m207158l();
                }
            }
            if (i8 == 0 && i5 != 3) {
                x5w0Var.m207158l();
            }
            if (i8 == 2 && (i5 == 3 || x5w0Var.m207161o())) {
                x5w0Var.m207159m(6);
            }
            i3 = i6 * 256;
            str = (x5w0Var.m207161o() && x5w0Var.m207150d(6) == 1 && x5w0Var.m207150d(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i11;
        } else {
            x5w0Var.m207159m(32);
            int iM207150d9 = x5w0Var.m207150d(2);
            String str2 = iM207150d9 == 3 ? null : "audio/ac3";
            int iM207150d10 = x5w0Var.m207150d(6);
            int i13 = f201400e[iM207150d10 / 2] * 1000;
            iM217059f = m217059f(iM207150d9, iM207150d10);
            x5w0Var.m207159m(8);
            int iM207150d11 = x5w0Var.m207150d(3);
            if ((iM207150d11 & 1) != 0 && iM207150d11 != 1) {
                x5w0Var.m207159m(2);
            }
            if ((iM207150d11 & 4) != 0) {
                x5w0Var.m207159m(2);
            }
            if (iM207150d11 == 2) {
                x5w0Var.m207159m(2);
            }
            i = iM207150d9 < 3 ? f201397b[iM207150d9] : -1;
            i2 = f201399d[iM207150d11] + (x5w0Var.m207161o() ? 1 : 0);
            i3 = 1536;
            str = str2;
            i4 = i13;
        }
        return new y3r0(str, i9, i2, i, iM217059f, i3, i4, null);
    }

    /* JADX INFO: renamed from: f */
    public static int m217059f(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = f201397b[i];
        if (i4 == 44100) {
            int i5 = f201401f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f201400e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
