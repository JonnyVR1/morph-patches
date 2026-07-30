package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.common.collect.ImmutableList;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class l7g0 implements sp1 {

    /* JADX INFO: renamed from: a */
    public final C1894k f130344a;

    public l7g0(C1894k c1894k) {
        this.f130344a = c1894k;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m153118a(int i) {
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
    public static String m153119b(int i) {
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
    public static sp1 m153120c(ig60 ig60Var) {
        ig60Var.m139809V(4);
        int iM139831u = ig60Var.m139831u();
        int iM139831u2 = ig60Var.m139831u();
        ig60Var.m139809V(4);
        int iM139831u3 = ig60Var.m139831u();
        String strM153118a = m153118a(iM139831u3);
        if (strM153118a != null) {
            C1894k.b bVar = new C1894k.b();
            bVar.m10407n0(iM139831u).m10386S(iM139831u2).m10400g0(strM153118a);
            return new l7g0(bVar.m10374G());
        }
        kyv.m152151i("StreamFormatChunk", "Ignoring track with unsupported compression " + iM139831u3);
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static sp1 m153121d(int i, ig60 ig60Var) {
        if (i == 2) {
            return m153120c(ig60Var);
        }
        if (i == 1) {
            return m153122e(ig60Var);
        }
        kyv.m152151i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + bmk0.m105161p0(i));
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static sp1 m153122e(ig60 ig60Var) {
        int iM139836z = ig60Var.m139836z();
        String strM153119b = m153119b(iM139836z);
        if (strM153119b == null) {
            kyv.m152151i("StreamFormatChunk", "Ignoring track with unsupported format tag " + iM139836z);
            return null;
        }
        int iM139836z2 = ig60Var.m139836z();
        int iM139831u = ig60Var.m139831u();
        ig60Var.m139809V(6);
        int iM105133f0 = bmk0.m105133f0(ig60Var.m139801N());
        int iM139836z3 = ig60Var.m139836z();
        byte[] bArr = new byte[iM139836z3];
        ig60Var.m139822l(bArr, 0, iM139836z3);
        C1894k.b bVar = new C1894k.b();
        bVar.m10400g0(strM153119b).m10377J(iM139836z2).m10401h0(iM139831u);
        if ("audio/raw".equals(strM153119b) && iM105133f0 != 0) {
            bVar.m10394a0(iM105133f0);
        }
        if ("audio/mp4a-latm".equals(strM153119b) && iM139836z3 > 0) {
            bVar.m10389V(ImmutableList.m15740of(bArr));
        }
        return new l7g0(bVar.m10374G());
    }

    @Override // p153l.sp1
    public int getType() {
        return 1718776947;
    }
}
