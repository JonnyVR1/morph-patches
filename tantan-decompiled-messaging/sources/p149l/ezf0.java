package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.common.collect.ImmutableList;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ezf0 implements lp1 {

    /* JADX INFO: renamed from: a */
    public final C1871k f93894a;

    public ezf0(C1871k c1871k) {
        this.f93894a = c1871k;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m118945a(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return YtVideoEncoder.MIME_TYPE;
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m118946b(int i) {
        if (i == 1) {
            return "audio/raw";
        }
        if (i == 85) {
            return DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG;
        }
        if (i == 255) {
            return "audio/mp4a-latm";
        }
        if (i == 8192) {
            return "audio/ac3";
        }
        if (i != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static lp1 m118947c(d860 d860Var) {
        d860Var.m110293V(4);
        int iM110315u = d860Var.m110315u();
        int iM110315u2 = d860Var.m110315u();
        d860Var.m110293V(4);
        int iM110315u3 = d860Var.m110315u();
        String strM118945a = m118945a(iM110315u3);
        if (strM118945a != null) {
            C1871k.b bVar = new C1871k.b();
            bVar.m10353n0(iM110315u).m10332S(iM110315u2).m10346g0(strM118945a);
            return new ezf0(bVar.m10320G());
        }
        jwv.m143689i("StreamFormatChunk", "Ignoring track with unsupported compression " + iM110315u3);
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static lp1 m118948d(int i, d860 d860Var) {
        if (i == 2) {
            return m118947c(d860Var);
        }
        if (i == 1) {
            return m118949e(d860Var);
        }
        jwv.m143689i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + vck0.m197883p0(i));
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static lp1 m118949e(d860 d860Var) {
        int iM110320z = d860Var.m110320z();
        String strM118946b = m118946b(iM110320z);
        if (strM118946b == null) {
            jwv.m143689i("StreamFormatChunk", "Ignoring track with unsupported format tag " + iM110320z);
            return null;
        }
        int iM110320z2 = d860Var.m110320z();
        int iM110315u = d860Var.m110315u();
        d860Var.m110293V(6);
        int iM197855f0 = vck0.m197855f0(d860Var.m110285N());
        int iM110320z3 = d860Var.m110320z();
        byte[] bArr = new byte[iM110320z3];
        d860Var.m110306l(bArr, 0, iM110320z3);
        C1871k.b bVar = new C1871k.b();
        bVar.m10346g0(strM118946b).m10323J(iM110320z2).m10347h0(iM110315u);
        if ("audio/raw".equals(strM118946b) && iM197855f0 != 0) {
            bVar.m10340a0(iM197855f0);
        }
        if ("audio/mp4a-latm".equals(strM118946b) && iM110320z3 > 0) {
            bVar.m10335V(ImmutableList.m15686of(bArr));
        }
        return new ezf0(bVar.m10320G());
    }

    @Override // p149l.lp1
    public int getType() {
        return 1718776947;
    }
}
