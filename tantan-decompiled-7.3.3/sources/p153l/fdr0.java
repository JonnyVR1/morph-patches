package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzae;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.nio.ByteBuffer;
import okio.Utf8;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class fdr0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f98494a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b */
    public static final int[] f98495b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f98496c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d */
    public static final int[] f98497d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e */
    public static final int[] f98498e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f */
    public static final int[] f98499f = {69, 87, 104, 121, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 208, 243, 278, 348, HttpStatus.EXPECTATION_FAILED_417, 487, 557, 696, 835, 975, RtcEngineEvent.EvtType.EVT_JOIN_PUBILSHER_RESPONSE, 1253, 1393};

    /* JADX INFO: renamed from: a */
    public static int m125129a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f98494a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* JADX INFO: renamed from: b */
    public static int m125130b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return m125134f((b & 192) >> 6, b & Utf8.REPLACEMENT_BYTE);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i2 + i2;
    }

    /* JADX INFO: renamed from: c */
    public static sqr0 m125131c(bgw0 bgw0Var, String str, String str2, @Nullable zzae zzaeVar) {
        dfw0 dfw0Var = new dfw0();
        dfw0Var.m115557i(bgw0Var);
        int i = f98495b[dfw0Var.m115552d(2)];
        dfw0Var.m115561m(8);
        int i2 = f98497d[dfw0Var.m115552d(3)];
        if (dfw0Var.m115552d(1) != 0) {
            i2++;
        }
        int i3 = f98498e[dfw0Var.m115552d(5)] * 1000;
        dfw0Var.m115553e();
        bgw0Var.m104269k(dfw0Var.m115550b());
        znr0 znr0Var = new znr0();
        znr0Var.m220658k(str);
        znr0Var.m220672w("audio/ac3");
        znr0Var.m220659k0(i2);
        znr0Var.m220673x(i);
        znr0Var.m220650e(zzaeVar);
        znr0Var.m220663n(str2);
        znr0Var.m220657j0(i3);
        znr0Var.m220667r(i3);
        return znr0Var.m220645D();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX INFO: renamed from: d */
    public static sqr0 m125132d(bgw0 bgw0Var, String str, String str2, @Nullable zzae zzaeVar) {
        String str3;
        dfw0 dfw0Var = new dfw0();
        dfw0Var.m115557i(bgw0Var);
        int iM115552d = dfw0Var.m115552d(13) * 1000;
        dfw0Var.m115561m(3);
        int i = f98495b[dfw0Var.m115552d(2)];
        dfw0Var.m115561m(10);
        int i2 = f98497d[dfw0Var.m115552d(3)];
        if (dfw0Var.m115552d(1) != 0) {
            i2++;
        }
        dfw0Var.m115561m(3);
        int iM115552d2 = dfw0Var.m115552d(4);
        dfw0Var.m115561m(1);
        if (iM115552d2 > 0) {
            dfw0Var.m115561m(6);
            if (dfw0Var.m115552d(1) != 0) {
                i2 += 2;
            }
            dfw0Var.m115561m(1);
        }
        if (dfw0Var.m115549a() > 7) {
            dfw0Var.m115561m(7);
            if (dfw0Var.m115552d(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        dfw0Var.m115553e();
        bgw0Var.m104269k(dfw0Var.m115550b());
        znr0 znr0Var = new znr0();
        znr0Var.m220658k(str);
        znr0Var.m220672w(str3);
        znr0Var.m220659k0(i2);
        znr0Var.m220673x(i);
        znr0Var.m220650e(zzaeVar);
        znr0Var.m220663n(str2);
        znr0Var.m220667r(iM115552d);
        return znr0Var.m220645D();
    }

    /* JADX INFO: renamed from: e */
    public static edr0 m125133e(dfw0 dfw0Var) {
        int iM125134f;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM115551c = dfw0Var.m115551c();
        dfw0Var.m115561m(40);
        int iM115552d = dfw0Var.m115552d(5);
        dfw0Var.m115559k(iM115551c);
        int i9 = -1;
        if (iM115552d > 10) {
            dfw0Var.m115561m(16);
            int iM115552d2 = dfw0Var.m115552d(2);
            if (iM115552d2 == 0) {
                i9 = 0;
            } else if (iM115552d2 == 1) {
                i9 = 1;
            } else if (iM115552d2 == 2) {
                i9 = 2;
            }
            dfw0Var.m115561m(3);
            int iM115552d3 = dfw0Var.m115552d(11) + 1;
            int iM115552d4 = dfw0Var.m115552d(2);
            if (iM115552d4 == 3) {
                i = f98496c[dfw0Var.m115552d(2)];
                i6 = 6;
                i5 = 3;
            } else {
                int iM115552d5 = dfw0Var.m115552d(2);
                int i10 = f98494a[iM115552d5];
                i5 = iM115552d5;
                i = f98495b[iM115552d4];
                i6 = i10;
            }
            iM125134f = iM115552d3 + iM115552d3;
            int i11 = (iM125134f * i) / (i6 * 32);
            int iM115552d6 = dfw0Var.m115552d(3);
            boolean zM115563o = dfw0Var.m115563o();
            i2 = f98497d[iM115552d6] + (zM115563o ? 1 : 0);
            dfw0Var.m115561m(10);
            if (dfw0Var.m115563o()) {
                dfw0Var.m115561m(8);
            }
            if (iM115552d6 == 0) {
                dfw0Var.m115561m(5);
                if (dfw0Var.m115563o()) {
                    dfw0Var.m115561m(8);
                }
                i7 = 0;
                iM115552d6 = 0;
            } else {
                i7 = iM115552d6;
            }
            if (i9 == 1) {
                if (dfw0Var.m115563o()) {
                    dfw0Var.m115561m(16);
                }
                i8 = 1;
            } else {
                i8 = i9;
            }
            if (dfw0Var.m115563o()) {
                if (i7 > 2) {
                    dfw0Var.m115561m(2);
                }
                if ((i7 & 1) != 0 && i7 > 2) {
                    dfw0Var.m115561m(6);
                }
                if ((i7 & 4) != 0) {
                    dfw0Var.m115561m(6);
                }
                if (zM115563o && dfw0Var.m115563o()) {
                    dfw0Var.m115561m(5);
                }
                if (i8 == 0) {
                    if (dfw0Var.m115563o()) {
                        dfw0Var.m115561m(6);
                    }
                    if (i7 == 0 && dfw0Var.m115563o()) {
                        dfw0Var.m115561m(6);
                    }
                    if (dfw0Var.m115563o()) {
                        dfw0Var.m115561m(6);
                    }
                    int iM115552d7 = dfw0Var.m115552d(2);
                    if (iM115552d7 == 1) {
                        dfw0Var.m115561m(5);
                    } else if (iM115552d7 == 2) {
                        dfw0Var.m115561m(12);
                    } else if (iM115552d7 == 3) {
                        int iM115552d8 = dfw0Var.m115552d(5);
                        if (dfw0Var.m115563o()) {
                            dfw0Var.m115561m(5);
                            if (dfw0Var.m115563o()) {
                                dfw0Var.m115561m(4);
                            }
                            if (dfw0Var.m115563o()) {
                                dfw0Var.m115561m(4);
                            }
                            if (dfw0Var.m115563o()) {
                                dfw0Var.m115561m(4);
                            }
                            if (dfw0Var.m115563o()) {
                                dfw0Var.m115561m(4);
                            }
                            if (dfw0Var.m115563o()) {
                                dfw0Var.m115561m(4);
                            }
                            if (dfw0Var.m115563o()) {
                                dfw0Var.m115561m(4);
                            }
                            if (dfw0Var.m115563o()) {
                                dfw0Var.m115561m(4);
                            }
                            if (dfw0Var.m115563o()) {
                                if (dfw0Var.m115563o()) {
                                    dfw0Var.m115561m(4);
                                }
                                if (dfw0Var.m115563o()) {
                                    dfw0Var.m115561m(4);
                                }
                            }
                        }
                        if (dfw0Var.m115563o()) {
                            dfw0Var.m115561m(5);
                            if (dfw0Var.m115563o()) {
                                dfw0Var.m115561m(7);
                                if (dfw0Var.m115563o()) {
                                    dfw0Var.m115561m(8);
                                }
                            }
                        }
                        dfw0Var.m115561m((iM115552d8 + 2) * 8);
                        dfw0Var.m115553e();
                    }
                    if (i7 < 2) {
                        if (dfw0Var.m115563o()) {
                            dfw0Var.m115561m(14);
                        }
                        if (iM115552d6 == 0 && dfw0Var.m115563o()) {
                            dfw0Var.m115561m(14);
                        }
                    }
                    if (!dfw0Var.m115563o()) {
                        i8 = 0;
                    } else if (i5 == 0) {
                        dfw0Var.m115561m(5);
                        i8 = 0;
                        i5 = 0;
                    } else {
                        for (int i12 = 0; i12 < i6; i12++) {
                            if (dfw0Var.m115563o()) {
                                dfw0Var.m115561m(5);
                            }
                        }
                        i8 = 0;
                    }
                }
            }
            if (dfw0Var.m115563o()) {
                dfw0Var.m115561m(5);
                if (i7 == 2) {
                    dfw0Var.m115561m(4);
                    i7 = 2;
                }
                if (i7 >= 6) {
                    dfw0Var.m115561m(2);
                }
                if (dfw0Var.m115563o()) {
                    dfw0Var.m115561m(8);
                }
                if (i7 == 0 && dfw0Var.m115563o()) {
                    dfw0Var.m115561m(8);
                }
                if (iM115552d4 < 3) {
                    dfw0Var.m115560l();
                }
            }
            if (i8 == 0 && i5 != 3) {
                dfw0Var.m115560l();
            }
            if (i8 == 2 && (i5 == 3 || dfw0Var.m115563o())) {
                dfw0Var.m115561m(6);
            }
            i3 = i6 * 256;
            str = (dfw0Var.m115563o() && dfw0Var.m115552d(6) == 1 && dfw0Var.m115552d(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i11;
        } else {
            dfw0Var.m115561m(32);
            int iM115552d9 = dfw0Var.m115552d(2);
            String str2 = iM115552d9 == 3 ? null : "audio/ac3";
            int iM115552d10 = dfw0Var.m115552d(6);
            int i13 = f98498e[iM115552d10 / 2] * 1000;
            iM125134f = m125134f(iM115552d9, iM115552d10);
            dfw0Var.m115561m(8);
            int iM115552d11 = dfw0Var.m115552d(3);
            if ((iM115552d11 & 1) != 0 && iM115552d11 != 1) {
                dfw0Var.m115561m(2);
            }
            if ((iM115552d11 & 4) != 0) {
                dfw0Var.m115561m(2);
            }
            if (iM115552d11 == 2) {
                dfw0Var.m115561m(2);
            }
            i = iM115552d9 < 3 ? f98495b[iM115552d9] : -1;
            i2 = f98497d[iM115552d11] + (dfw0Var.m115563o() ? 1 : 0);
            i3 = 1536;
            str = str2;
            i4 = i13;
        }
        return new edr0(str, i9, i2, i, iM125134f, i3, i4, null);
    }

    /* JADX INFO: renamed from: f */
    public static int m125134f(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = f98495b[i];
        if (i4 == 44100) {
            int i5 = f98499f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f98498e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
