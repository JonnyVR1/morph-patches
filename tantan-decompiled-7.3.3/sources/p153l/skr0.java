package p153l;

import com.google.android.gms.internal.ads.zzcc;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.util.ArrayDeque;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class skr0 implements ukr0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f169317a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f169318b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final llr0 f169319c = new llr0();

    /* JADX INFO: renamed from: d */
    public tkr0 f169320d;

    /* JADX INFO: renamed from: e */
    public int f169321e;

    /* JADX INFO: renamed from: f */
    public int f169322f;

    /* JADX INFO: renamed from: g */
    public long f169323g;

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
    @Override // p153l.ukr0
    /* JADX INFO: renamed from: a */
    public final boolean mo186538a(qer0 qer0Var) throws IOException {
        int i;
        xkr0 xkr0Var;
        zkr0 zkr0Var;
        long j;
        long j2;
        int i2;
        byte[] bArr;
        String str;
        int i3;
        long j3;
        int i4;
        long jM186540c;
        double dLongBitsToDouble;
        fer0 fer0Var;
        int iM154785b;
        int iM154786c;
        lev0.m153954b(this.f169320d);
        while (true) {
            rkr0 rkr0Var = (rkr0) this.f169318b.peek();
            if (rkr0Var != null && qer0Var.zzf() >= rkr0Var.f163638b) {
                ((xkr0) this.f169320d).f194811a.m220147h(((rkr0) this.f169318b.pop()).f163637a);
                return true;
            }
            int i5 = this.f169321e;
            if (i5 != 0) {
                if (i5 == 1) {
                }
                tkr0 tkr0Var = this.f169320d;
                i = this.f169322f;
                xkr0Var = (xkr0) tkr0Var;
                zkr0Var = xkr0Var.f194811a;
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
                        j = this.f169323g;
                        if (j <= 8) {
                            throw zzcc.zza("Invalid integer size: " + j, null);
                        }
                        xkr0Var.f194811a.m220149j(i, m186540c(qer0Var, (int) j));
                        this.f169321e = 0;
                        return true;
                    case 134:
                    case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                    case 21358:
                    case 2274716:
                        j2 = this.f169323g;
                        if (j2 <= 2147483647L) {
                            throw zzcc.zza("String element size: " + j2, null);
                        }
                        i2 = (int) j2;
                        if (i2 == 0) {
                            str = "";
                        } else {
                            bArr = new byte[i2];
                            ((fer0) qer0Var).mo125312b(bArr, 0, i2, false);
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
                        xkr0Var.f194811a.m220151l(i, str);
                        this.f169321e = 0;
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
                        long jZzf = qer0Var.zzf();
                        this.f169318b.push(new rkr0(i, this.f169323g + jZzf, null));
                        ((xkr0) this.f169320d).f194811a.m220150k(this.f169322f, jZzf, this.f169323g);
                        this.f169321e = 0;
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
                        zkr0Var.m220146g(i, (int) this.f169323g, qer0Var);
                        this.f169321e = 0;
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
                        j3 = this.f169323g;
                        if (j3 == 4 && j3 != 8) {
                            throw zzcc.zza("Invalid float size: " + j3, null);
                        }
                        i4 = (int) j3;
                        jM186540c = m186540c(qer0Var, i4);
                        if (i4 == 4) {
                            dLongBitsToDouble = Float.intBitsToFloat((int) jM186540c);
                        } else {
                            dLongBitsToDouble = Double.longBitsToDouble(jM186540c);
                        }
                        xkr0Var.f194811a.m220148i(i, dLongBitsToDouble);
                        this.f169321e = 0;
                        return true;
                    default:
                        ((fer0) qer0Var).m125319k((int) this.f169323g, false);
                        this.f169321e = 0;
                        break;
                }
            } else {
                long jM154788d = this.f169319c.m154788d(qer0Var, true, false, 4);
                if (jM154788d == -2) {
                    qer0Var.zzj();
                    while (true) {
                        fer0Var = (fer0) qer0Var;
                        fer0Var.mo125313c(this.f169317a, 0, 4, false);
                        iM154785b = llr0.m154785b(this.f169317a[0]);
                        if (iM154785b != -1 && iM154785b <= 4) {
                            iM154786c = (int) llr0.m154786c(this.f169317a, iM154785b, false);
                            zkr0 zkr0Var2 = ((xkr0) this.f169320d).f194811a;
                            if (iM154786c != 357149030 && iM154786c != 524531317 && iM154786c != 475249515) {
                                if (iM154786c == 374648427) {
                                    iM154786c = 374648427;
                                }
                            }
                        }
                        fer0Var.m125319k(1, false);
                    }
                    fer0Var.m125319k(iM154785b, false);
                    jM154788d = iM154786c;
                }
                if (jM154788d == -1) {
                    return false;
                }
                this.f169322f = (int) jM154788d;
                this.f169321e = 1;
            }
            this.f169323g = this.f169319c.m154788d(qer0Var, false, true, 8);
            this.f169321e = 2;
            tkr0 tkr0Var2 = this.f169320d;
            i = this.f169322f;
            xkr0Var = (xkr0) tkr0Var2;
            zkr0Var = xkr0Var.f194811a;
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
                    j = this.f169323g;
                    if (j <= 8) {
                        throw zzcc.zza("Invalid integer size: " + j, null);
                    }
                    xkr0Var.f194811a.m220149j(i, m186540c(qer0Var, (int) j));
                    this.f169321e = 0;
                    return true;
                case 134:
                case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                case 21358:
                case 2274716:
                    j2 = this.f169323g;
                    if (j2 <= 2147483647L) {
                        throw zzcc.zza("String element size: " + j2, null);
                    }
                    i2 = (int) j2;
                    if (i2 == 0) {
                        str = "";
                    } else {
                        bArr = new byte[i2];
                        ((fer0) qer0Var).mo125312b(bArr, 0, i2, false);
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
                    xkr0Var.f194811a.m220151l(i, str);
                    this.f169321e = 0;
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
                    long jZzf2 = qer0Var.zzf();
                    this.f169318b.push(new rkr0(i, this.f169323g + jZzf2, null));
                    ((xkr0) this.f169320d).f194811a.m220150k(this.f169322f, jZzf2, this.f169323g);
                    this.f169321e = 0;
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
                    zkr0Var.m220146g(i, (int) this.f169323g, qer0Var);
                    this.f169321e = 0;
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
                    j3 = this.f169323g;
                    if (j3 == 4) {
                        break;
                    }
                    i4 = (int) j3;
                    jM186540c = m186540c(qer0Var, i4);
                    if (i4 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jM186540c);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jM186540c);
                    }
                    xkr0Var.f194811a.m220148i(i, dLongBitsToDouble);
                    this.f169321e = 0;
                    return true;
                default:
                    ((fer0) qer0Var).m125319k((int) this.f169323g, false);
                    this.f169321e = 0;
                    break;
            }
        }
    }

    @Override // p153l.ukr0
    /* JADX INFO: renamed from: b */
    public final void mo186539b(tkr0 tkr0Var) {
        this.f169320d = tkr0Var;
    }

    /* JADX INFO: renamed from: c */
    public final long m186540c(qer0 qer0Var, int i) throws IOException {
        ((fer0) qer0Var).mo125312b(this.f169317a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f169317a[i2] & 255));
        }
        return j;
    }

    @Override // p153l.ukr0
    public final void zzb() {
        this.f169321e = 0;
        this.f169318b.clear();
        this.f169319c.m154789e();
    }
}
