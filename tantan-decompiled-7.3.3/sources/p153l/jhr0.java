package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class jhr0 implements bhr0 {

    /* JADX INFO: renamed from: a */
    public final zzgaa f121002a;

    /* JADX INFO: renamed from: b */
    public final int f121003b;

    public jhr0(int i, zzgaa zzgaaVar) {
        this.f121003b = i;
        this.f121002a = zzgaaVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: b */
    public static jhr0 m144929b(int i, bgw0 bgw0Var) {
        String str;
        bhr0 khr0Var;
        String str2;
        mqw0 mqw0Var = new mqw0();
        int iM104278t = bgw0Var.m104278t();
        int i2 = -2;
        while (bgw0Var.m104275q() > 8) {
            int iM104282x = bgw0Var.m104282x();
            int iM104277s = bgw0Var.m104277s() + bgw0Var.m104282x();
            bgw0Var.m104268j(iM104277s);
            if (iM104282x != 1414744396) {
                khr0 khr0Var2 = null;
                switch (iM104282x) {
                    case 1718776947:
                        if (i2 != 2) {
                            if (i2 == 1) {
                                int iM104284z = bgw0Var.m104284z();
                                if (iM104284z == 1) {
                                    str = "audio/raw";
                                } else if (iM104284z == 85) {
                                    str = DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG;
                                } else if (iM104284z == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iM104284z != 8192) {
                                    str = iM104284z != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iM104284z2 = bgw0Var.m104284z();
                                    int iM104282x2 = bgw0Var.m104282x();
                                    bgw0Var.m104270l(6);
                                    int iM159428z = mpw0.m159428z(bgw0Var.m104249F());
                                    int iM104284z3 = bgw0Var.m104284z();
                                    byte[] bArr = new byte[iM104284z3];
                                    bgw0Var.m104265g(bArr, 0, iM104284z3);
                                    znr0 znr0Var = new znr0();
                                    znr0Var.m220672w(str);
                                    znr0Var.m220659k0(iM104284z2);
                                    znr0Var.m220673x(iM104282x2);
                                    if ("audio/raw".equals(str) && iM159428z != 0) {
                                        znr0Var.m220666q(iM159428z);
                                    }
                                    if ("audio/mp4a-latm".equals(str) && iM104284z3 > 0) {
                                        znr0Var.m220660l(zzgaa.zzm(bArr));
                                    }
                                    khr0Var = new khr0(znr0Var.m220645D());
                                } else {
                                    y4w0.m214278f("StreamFormatChunk", "Ignoring track with unsupported format tag " + iM104284z);
                                }
                            } else {
                                y4w0.m214278f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(mpw0.m159404b(i2)));
                            }
                            break;
                        } else {
                            bgw0Var.m104270l(4);
                            int iM104282x3 = bgw0Var.m104282x();
                            int iM104282x4 = bgw0Var.m104282x();
                            bgw0Var.m104270l(4);
                            int iM104282x5 = bgw0Var.m104282x();
                            switch (iM104282x5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = YtVideoEncoder.MIME_TYPE;
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                y4w0.m214278f("StreamFormatChunk", "Ignoring track with unsupported compression " + iM104282x5);
                            } else {
                                znr0 znr0Var2 = new znr0();
                                znr0Var2.m220644C(iM104282x3);
                                znr0Var2.m220654i(iM104282x4);
                                znr0Var2.m220672w(str2);
                                khr0Var2 = new khr0(znr0Var2.m220645D());
                            }
                        }
                        khr0Var = khr0Var2;
                        break;
                    case 1751742049:
                        khr0Var = ghr0.m130261a(bgw0Var);
                        break;
                    case 1752331379:
                        khr0Var = hhr0.m135074a(bgw0Var);
                        break;
                    case 1852994675:
                        khr0Var = lhr0.m154243a(bgw0Var);
                        break;
                    default:
                        khr0Var = khr0Var2;
                        break;
                }
            } else {
                khr0Var = m144929b(bgw0Var.m104282x(), bgw0Var);
            }
            if (khr0Var != null) {
                if (khr0Var.zza() == 1752331379) {
                    int i3 = ((hhr0) khr0Var).f109916a;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        y4w0.m214278f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                mqw0Var.m159613g(khr0Var);
            }
            bgw0Var.m104269k(iM104277s);
            bgw0Var.m104268j(iM104278t);
        }
        return new jhr0(i, mqw0Var.m159616j());
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final bhr0 m144930a(Class cls) {
        zzgaa zzgaaVar = this.f121002a;
        int size = zzgaaVar.size();
        int i = 0;
        while (i < size) {
            bhr0 bhr0Var = (bhr0) zzgaaVar.get(i);
            i++;
            if (bhr0Var.getClass() == cls) {
                return bhr0Var;
            }
        }
        return null;
    }

    @Override // p153l.bhr0
    public final int zza() {
        return this.f121003b;
    }
}
