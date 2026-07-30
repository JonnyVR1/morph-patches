package p153l;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzafw;
import com.google.android.gms.internal.ads.zzaho;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ygr0 {
    /* JADX INFO: renamed from: a */
    public static int m215873a(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static zzby m215874b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = mpw0.f137957a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                y4w0.m214278f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafw.m13593a(new bgw0(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    y4w0.m214279g("VorbisUtil", "Failed to parse vorbis picture", e);
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
    public static vgr0 m215875c(bgw0 bgw0Var, boolean z, boolean z2) throws zzcc {
        if (z) {
            m215876d(3, bgw0Var, false);
        }
        String strM104259a = bgw0Var.m104259a((int) bgw0Var.m104251H(), cow0.f82931c);
        int length = strM104259a.length();
        long jM104251H = bgw0Var.m104251H();
        String[] strArr = new String[(int) jM104251H];
        int length2 = length + 15;
        for (int i = 0; i < jM104251H; i++) {
            String strM104259a2 = bgw0Var.m104259a((int) bgw0Var.m104251H(), cow0.f82931c);
            strArr[i] = strM104259a2;
            length2 = length2 + 4 + strM104259a2.length();
        }
        if (z2 && (bgw0Var.m104245B() & 1) == 0) {
            throw zzcc.zza("framing bit expected to be set", null);
        }
        return new vgr0(strM104259a, strArr, length2 + 1);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m215876d(int i, bgw0 bgw0Var, boolean z) throws zzcc {
        if (bgw0Var.m104275q() < 7) {
            if (z) {
                return false;
            }
            throw zzcc.zza("too short header: " + bgw0Var.m104275q(), null);
        }
        if (bgw0Var.m104245B() != i) {
            if (z) {
                return false;
            }
            throw zzcc.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (bgw0Var.m104245B() == 118 && bgw0Var.m104245B() == 111 && bgw0Var.m104245B() == 114 && bgw0Var.m104245B() == 98 && bgw0Var.m104245B() == 105 && bgw0Var.m104245B() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzcc.zza("expected characters 'vorbis'", null);
    }
}
