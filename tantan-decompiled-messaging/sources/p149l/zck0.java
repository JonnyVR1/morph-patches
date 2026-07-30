package p149l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantan.core.base.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class zck0 {
    /* JADX INFO: renamed from: a */
    public static String m218065a(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        String string;
        String string2;
        long jMax = Math.max(0L, j - qib0.f154693H.guessedCurrentServerTime());
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
                string = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f17544b.getResources().getString(R$string.f55774k);
            } else {
                string = CoreModule.f17544b.getResources().getString(R$string.f55773j);
            }
            sb.append(string);
            return sb.toString();
        }
        sb.append(j5);
        if (z4) {
            string2 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f17544b.getResources().getString(R$string.f55774k);
        } else {
            string2 = CoreModule.f17544b.getResources().getString(R$string.f55773j);
        }
        sb.append(string2);
        long j7 = j4 % 24;
        if (j7 < 10) {
            sb.append("0");
        }
        sb.append(j7);
        sb.append(m218066b() ? "时" : CoreModule.f17544b.getResources().getString(R$string.f55760L));
        long j8 = j3 % 60;
        if (j8 < 10) {
            sb.append("0");
        }
        sb.append(j8);
        sb.append(CoreModule.f17544b.getResources().getString(R$string.f55761M));
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m218066b() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m81303a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }
}
