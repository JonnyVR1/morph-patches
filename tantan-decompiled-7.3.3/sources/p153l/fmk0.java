package p153l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantan.core.base.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public final class fmk0 {
    /* JADX INFO: renamed from: a */
    public static String m126240a(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        String string;
        String string2;
        long jMax = Math.max(0L, j - uqb0.f180376H.guessedCurrentServerTime());
        long j2 = (jMax / 1000) % 60;
        long j3 = (jMax / Constants.ONE_MIN_IN_MILLIS) % 60;
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
                string = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f18263b.getResources().getString(R$string.f56622k);
            } else {
                string = CoreModule.f18263b.getResources().getString(R$string.f56621j);
            }
            sb.append(string);
            return sb.toString();
        }
        sb.append(j5);
        if (z4) {
            string2 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f18263b.getResources().getString(R$string.f56622k);
        } else {
            string2 = CoreModule.f18263b.getResources().getString(R$string.f56621j);
        }
        sb.append(string2);
        long j7 = j4 % 24;
        if (j7 < 10) {
            sb.append("0");
        }
        sb.append(j7);
        sb.append(m126241b() ? "时" : CoreModule.f18263b.getResources().getString(R$string.f56608L));
        long j8 = j3 % 60;
        if (j8 < 10) {
            sb.append("0");
        }
        sb.append(j8);
        sb.append(CoreModule.f18263b.getResources().getString(R$string.f56609M));
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m126241b() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m82486a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }
}
