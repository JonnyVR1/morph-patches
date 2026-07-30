package p149l;

import com.google.android.gms.internal.ads.zzcc;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.util.ArrayDeque;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class mbr0 implements obr0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f133050a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f133051b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final fcr0 f133052c = new fcr0();

    /* JADX INFO: renamed from: d */
    public nbr0 f133053d;

    /* JADX INFO: renamed from: e */
    public int f133054e;

    /* JADX INFO: renamed from: f */
    public int f133055f;

    /* JADX INFO: renamed from: g */
    public long f133056g;

    /* JADX WARN: Code duplicated, block: B:37:0x00b2 A[LOOP:0: B:3:0x0005->B:37:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:60:0x0134  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143 A[LOOP:2: B:61:0x013b->B:64:0x0143, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0152  */
    /* JADX WARN: Code duplicated, block: B:72:0x016c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0179  */
    /* JADX WARN: Code duplicated, block: B:78:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0152, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x0179, please report this as an issue */
    @Override // p149l.obr0
    /* JADX INFO: renamed from: a */
    public final boolean mo153973a(k5r0 k5r0Var) throws IOException {
        int i;
        rbr0 rbr0Var;
        tbr0 tbr0Var;
        long j;
        long j2;
        int i2;
        byte[] bArr;
        String str;
        int i3;
        long j3;
        int i4;
        long jM153975c;
        double dLongBitsToDouble;
        z4r0 z4r0Var;
        int iM120457b;
        int iM120458c;
        f5v0.m119531b(this.f133053d);
        while (true) {
            lbr0 lbr0Var = (lbr0) this.f133051b.peek();
            if (lbr0Var != null && k5r0Var.zzf() >= lbr0Var.f127330b) {
                ((rbr0) this.f133053d).f158677a.m187889h(((lbr0) this.f133051b.pop()).f127329a);
                return true;
            }
            int i5 = this.f133054e;
            if (i5 != 0) {
                if (i5 == 1) {
                }
                nbr0 nbr0Var = this.f133053d;
                i = this.f133055f;
                rbr0Var = (rbr0) nbr0Var;
                tbr0Var = rbr0Var.f158677a;
                switch (i) {
                    case 131:
                    case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                    case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                    case 159:
                    case 176:
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        j = this.f133056g;
                        if (j <= 8) {
                            throw zzcc.zza("Invalid integer size: " + j, null);
                        }
                        rbr0Var.f158677a.m187891j(i, m153975c(k5r0Var, (int) j));
                        this.f133054e = 0;
                        return true;
                    case 134:
                    case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                    case 21358:
                    case 2274716:
                        j2 = this.f133056g;
                        if (j2 <= 2147483647L) {
                            throw zzcc.zza("String element size: " + j2, null);
                        }
                        i2 = (int) j2;
                        if (i2 == 0) {
                            str = "";
                        } else {
                            bArr = new byte[i2];
                            ((z4r0) k5r0Var).mo140050b(bArr, 0, i2, false);
                            while (i2 > 0) {
                                i3 = i2 - 1;
                                if (bArr[i3] == 0) {
                                    i2 = i3;
                                } else {
                                    str = new String(bArr, 0, i2);
                                }
                            }
                            str = new String(bArr, 0, i2);
                        }
                        rbr0Var.f158677a.m187893l(i, str);
                        this.f133054e = 0;
                        return true;
                    case 160:
                    case 166:
                    case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        long jZzf = k5r0Var.zzf();
                        this.f133051b.push(new lbr0(i, this.f133056g + jZzf, null));
                        ((rbr0) this.f133053d).f158677a.m187892k(this.f133055f, jZzf, this.f133056g);
                        this.f133054e = 0;
                        return true;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        tbr0Var.m187888g(i, (int) this.f133056g, k5r0Var);
                        this.f133054e = 0;
                        return true;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        j3 = this.f133056g;
                        if (j3 == 4 && j3 != 8) {
                            throw zzcc.zza("Invalid float size: " + j3, null);
                        }
                        i4 = (int) j3;
                        jM153975c = m153975c(k5r0Var, i4);
                        if (i4 == 4) {
                            dLongBitsToDouble = Float.intBitsToFloat((int) jM153975c);
                        } else {
                            dLongBitsToDouble = Double.longBitsToDouble(jM153975c);
                        }
                        rbr0Var.f158677a.m187890i(i, dLongBitsToDouble);
                        this.f133054e = 0;
                        return true;
                    default:
                        ((z4r0) k5r0Var).m217119k((int) this.f133056g, false);
                        this.f133054e = 0;
                        break;
                }
            } else {
                long jM120460d = this.f133052c.m120460d(k5r0Var, true, false, 4);
                if (jM120460d == -2) {
                    k5r0Var.zzj();
                    while (true) {
                        z4r0Var = (z4r0) k5r0Var;
                        z4r0Var.mo140051c(this.f133050a, 0, 4, false);
                        iM120457b = fcr0.m120457b(this.f133050a[0]);
                        if (iM120457b != -1 && iM120457b <= 4) {
                            iM120458c = (int) fcr0.m120458c(this.f133050a, iM120457b, false);
                            tbr0 tbr0Var2 = ((rbr0) this.f133053d).f158677a;
                            if (iM120458c != 357149030 && iM120458c != 524531317 && iM120458c != 475249515) {
                                if (iM120458c == 374648427) {
                                    iM120458c = 374648427;
                                }
                            }
                        }
                        z4r0Var.m217119k(1, false);
                    }
                    z4r0Var.m217119k(iM120457b, false);
                    jM120460d = iM120458c;
                }
                if (jM120460d == -1) {
                    return false;
                }
                this.f133055f = (int) jM120460d;
                this.f133054e = 1;
            }
            this.f133056g = this.f133052c.m120460d(k5r0Var, false, true, 8);
            this.f133054e = 2;
            nbr0 nbr0Var2 = this.f133053d;
            i = this.f133055f;
            rbr0Var = (rbr0) nbr0Var2;
            tbr0Var = rbr0Var.f158677a;
            switch (i) {
                case 131:
                case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                case 159:
                case 176:
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    j = this.f133056g;
                    if (j <= 8) {
                        throw zzcc.zza("Invalid integer size: " + j, null);
                    }
                    rbr0Var.f158677a.m187891j(i, m153975c(k5r0Var, (int) j));
                    this.f133054e = 0;
                    return true;
                case 134:
                case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                case 21358:
                case 2274716:
                    j2 = this.f133056g;
                    if (j2 <= 2147483647L) {
                        throw zzcc.zza("String element size: " + j2, null);
                    }
                    i2 = (int) j2;
                    if (i2 == 0) {
                        str = "";
                    } else {
                        bArr = new byte[i2];
                        ((z4r0) k5r0Var).mo140050b(bArr, 0, i2, false);
                        while (i2 > 0) {
                            i3 = i2 - 1;
                            if (bArr[i3] == 0) {
                                i2 = i3;
                            } else {
                                str = new String(bArr, 0, i2);
                            }
                        }
                        str = new String(bArr, 0, i2);
                    }
                    rbr0Var.f158677a.m187893l(i, str);
                    this.f133054e = 0;
                    return true;
                case 160:
                case 166:
                case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long jZzf2 = k5r0Var.zzf();
                    this.f133051b.push(new lbr0(i, this.f133056g + jZzf2, null));
                    ((rbr0) this.f133053d).f158677a.m187892k(this.f133055f, jZzf2, this.f133056g);
                    this.f133054e = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    tbr0Var.m187888g(i, (int) this.f133056g, k5r0Var);
                    this.f133054e = 0;
                    return true;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    j3 = this.f133056g;
                    if (j3 == 4) {
                        break;
                    }
                    i4 = (int) j3;
                    jM153975c = m153975c(k5r0Var, i4);
                    if (i4 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jM153975c);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jM153975c);
                    }
                    rbr0Var.f158677a.m187890i(i, dLongBitsToDouble);
                    this.f133054e = 0;
                    return true;
                default:
                    ((z4r0) k5r0Var).m217119k((int) this.f133056g, false);
                    this.f133054e = 0;
                    break;
            }
        }
    }

    @Override // p149l.obr0
    /* JADX INFO: renamed from: b */
    public final void mo153974b(nbr0 nbr0Var) {
        this.f133053d = nbr0Var;
    }

    /* JADX INFO: renamed from: c */
    public final long m153975c(k5r0 k5r0Var, int i) throws IOException {
        ((z4r0) k5r0Var).mo140050b(this.f133050a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f133050a[i2] & 255));
        }
        return j;
    }

    @Override // p149l.obr0
    public final void zzb() {
        this.f133054e = 0;
        this.f133051b.clear();
        this.f133052c.m120461e();
    }
}
