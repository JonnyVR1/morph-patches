package p149l;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzafw;
import com.google.android.gms.internal.ads.zzaho;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class s7r0 {
    /* JADX INFO: renamed from: a */
    public static int m182514a(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static zzby m182515b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = ggw0.f102568a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                svv0.m186111f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafw.m13539a(new v6w0(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    svv0.m186112g("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzaho(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzby(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static p7r0 m182516c(v6w0 v6w0Var, boolean z, boolean z2) throws zzcc {
        if (z) {
            m182517d(3, v6w0Var, false);
        }
        String strM197252a = v6w0Var.m197252a((int) v6w0Var.m197244H(), wew0.f185990c);
        int length = strM197252a.length();
        long jM197244H = v6w0Var.m197244H();
        String[] strArr = new String[(int) jM197244H];
        int length2 = length + 15;
        for (int i = 0; i < jM197244H; i++) {
            String strM197252a2 = v6w0Var.m197252a((int) v6w0Var.m197244H(), wew0.f185990c);
            strArr[i] = strM197252a2;
            length2 = length2 + 4 + strM197252a2.length();
        }
        if (z2 && (v6w0Var.m197238B() & 1) == 0) {
            throw zzcc.zza("framing bit expected to be set", null);
        }
        return new p7r0(strM197252a, strArr, length2 + 1);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m182517d(int i, v6w0 v6w0Var, boolean z) throws zzcc {
        if (v6w0Var.m197268q() < 7) {
            if (z) {
                return false;
            }
            throw zzcc.zza("too short header: " + v6w0Var.m197268q(), null);
        }
        if (v6w0Var.m197238B() != i) {
            if (z) {
                return false;
            }
            throw zzcc.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (v6w0Var.m197238B() == 118 && v6w0Var.m197238B() == 111 && v6w0Var.m197238B() == 114 && v6w0Var.m197238B() == 98 && v6w0Var.m197238B() == 105 && v6w0Var.m197238B() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzcc.zza("expected characters 'vorbis'", null);
    }
}
