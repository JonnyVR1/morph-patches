package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class d8r0 implements v7r0 {

    /* JADX INFO: renamed from: a */
    public final zzgaa f84890a;

    /* JADX INFO: renamed from: b */
    public final int f84891b;

    public d8r0(int i, zzgaa zzgaaVar) {
        this.f84891b = i;
        this.f84890a = zzgaaVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: b */
    public static d8r0 m110338b(int i, v6w0 v6w0Var) {
        String str;
        v7r0 e8r0Var;
        String str2;
        ghw0 ghw0Var = new ghw0();
        int iM197271t = v6w0Var.m197271t();
        int i2 = -2;
        while (v6w0Var.m197268q() > 8) {
            int iM197275x = v6w0Var.m197275x();
            int iM197270s = v6w0Var.m197270s() + v6w0Var.m197275x();
            v6w0Var.m197261j(iM197270s);
            if (iM197275x != 1414744396) {
                e8r0 e8r0Var2 = null;
                switch (iM197275x) {
                    case 1718776947:
                        if (i2 != 2) {
                            if (i2 == 1) {
                                int iM197277z = v6w0Var.m197277z();
                                if (iM197277z == 1) {
                                    str = "audio/raw";
                                } else if (iM197277z == 85) {
                                    str = DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG;
                                } else if (iM197277z == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iM197277z != 8192) {
                                    str = iM197277z != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iM197277z2 = v6w0Var.m197277z();
                                    int iM197275x2 = v6w0Var.m197275x();
                                    v6w0Var.m197263l(6);
                                    int iM126084z = ggw0.m126084z(v6w0Var.m197242F());
                                    int iM197277z3 = v6w0Var.m197277z();
                                    byte[] bArr = new byte[iM197277z3];
                                    v6w0Var.m197258g(bArr, 0, iM197277z3);
                                    ter0 ter0Var = new ter0();
                                    ter0Var.m188618w(str);
                                    ter0Var.m188605k0(iM197277z2);
                                    ter0Var.m188619x(iM197275x2);
                                    if ("audio/raw".equals(str) && iM126084z != 0) {
                                        ter0Var.m188612q(iM126084z);
                                    }
                                    if ("audio/mp4a-latm".equals(str) && iM197277z3 > 0) {
                                        ter0Var.m188606l(zzgaa.zzm(bArr));
                                    }
                                    e8r0Var = new e8r0(ter0Var.m188591D());
                                } else {
                                    svv0.m186111f("StreamFormatChunk", "Ignoring track with unsupported format tag " + iM197277z);
                                }
                            } else {
                                svv0.m186111f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(ggw0.m126060b(i2)));
                            }
                            break;
                        } else {
                            v6w0Var.m197263l(4);
                            int iM197275x3 = v6w0Var.m197275x();
                            int iM197275x4 = v6w0Var.m197275x();
                            v6w0Var.m197263l(4);
                            int iM197275x5 = v6w0Var.m197275x();
                            switch (iM197275x5) {
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
                                svv0.m186111f("StreamFormatChunk", "Ignoring track with unsupported compression " + iM197275x5);
                            } else {
                                ter0 ter0Var2 = new ter0();
                                ter0Var2.m188590C(iM197275x3);
                                ter0Var2.m188600i(iM197275x4);
                                ter0Var2.m188618w(str2);
                                e8r0Var2 = new e8r0(ter0Var2.m188591D());
                            }
                        }
                        e8r0Var = e8r0Var2;
                        break;
                    case 1751742049:
                        e8r0Var = a8r0.m95357a(v6w0Var);
                        break;
                    case 1752331379:
                        e8r0Var = b8r0.m100788a(v6w0Var);
                        break;
                    case 1852994675:
                        e8r0Var = f8r0.m120039a(v6w0Var);
                        break;
                    default:
                        e8r0Var = e8r0Var2;
                        break;
                }
            } else {
                e8r0Var = m110338b(v6w0Var.m197275x(), v6w0Var);
            }
            if (e8r0Var != null) {
                if (e8r0Var.zza() == 1752331379) {
                    int i3 = ((b8r0) e8r0Var).f74153a;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        svv0.m186111f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                ghw0Var.m126240g(e8r0Var);
            }
            v6w0Var.m197262k(iM197270s);
            v6w0Var.m197261j(iM197271t);
        }
        return new d8r0(i, ghw0Var.m126243j());
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final v7r0 m110339a(Class cls) {
        zzgaa zzgaaVar = this.f84890a;
        int size = zzgaaVar.size();
        int i = 0;
        while (i < size) {
            v7r0 v7r0Var = (v7r0) zzgaaVar.get(i);
            i++;
            if (v7r0Var.getClass() == cls) {
                return v7r0Var;
            }
        }
        return null;
    }

    @Override // p149l.v7r0
    public final int zza() {
        return this.f84891b;
    }
}
