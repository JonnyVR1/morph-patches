package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.tantan.core.base.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class zck0 {
    /* JADX INFO: renamed from: a */
    public static String m28688a(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        String string;
        String string2;
        long jMax = Math.max(0L, j - qib0.f19784H.guessedCurrentServerTime());
        long j2 = (jMax / 1000) % 60;
        long j3 = (jMax / 60000) % 60;
        long j4 = jMax / 3600000;
        long j5 = jMax / 86400000;
        long j6 = jMax % 86400000;
        if (!z && jMax <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (j5 <= 0 || z3) {
            if (j4 < 10) {
                sb.append("0");
            }
            sb.append(j4);
            sb.append(":");
            if (j3 < 10) {
                sb.append("0");
            }
            sb.append(j3);
            if (z) {
                sb.append(":");
                if (j2 < 10) {
                    sb.append("0");
                }
                sb.append(j2);
            }
            return sb.toString();
        }
        if (!z2) {
            if (j6 != 0) {
                j5++;
            }
            sb.append(j5);
            if (z4) {
                string = " " + CoreModule.f1533b.getResources().getString(R.string.k);
            } else {
                string = CoreModule.f1533b.getResources().getString(R.string.j);
            }
            sb.append(string);
            return sb.toString();
        }
        sb.append(j5);
        if (z4) {
            string2 = " " + CoreModule.f1533b.getResources().getString(R.string.k);
        } else {
            string2 = CoreModule.f1533b.getResources().getString(R.string.j);
        }
        sb.append(string2);
        long j7 = j4 % 24;
        if (j7 < 10) {
            sb.append("0");
        }
        sb.append(j7);
        sb.append(m28689b() ? "时" : CoreModule.f1533b.getResources().getString(R.string.L));
        long j8 = j3 % 60;
        if (j8 < 10) {
            sb.append("0");
        }
        sb.append(j8);
        sb.append(CoreModule.f1533b.getResources().getString(R.string.M));
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m28689b() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }
}
