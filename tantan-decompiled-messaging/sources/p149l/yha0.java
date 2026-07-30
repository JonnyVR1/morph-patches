package p149l;

import android.view.View;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;

/* JADX INFO: loaded from: classes4.dex */
public class yha0 {
    /* JADX INFO: renamed from: a */
    public static void m214796a(View view) {
        if (xdl0.m208412y0() <= 720.0f) {
            xdl0.m208360X(view, 0);
            xdl0.m208357U(view, t100.m186890d(8.0f));
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m214797b(String str) {
        if (str.matches("[ ]+")) {
            ura.m195053e().m195057d().mo33783Xj(OMSTemplateModeType.space);
            return true;
        }
        if (str.matches("\\d+")) {
            ura.m195053e().m195057d().mo33783Xj("number");
            return true;
        }
        if (str.matches("[\\p{P}+`]+")) {
            ura.m195053e().m195057d().mo33783Xj("symbol");
            return true;
        }
        if (!str.matches("[\\p{P}\\d+`]+")) {
            return false;
        }
        ura.m195053e().m195057d().mo33783Xj("number_symbol");
        return true;
    }
}
