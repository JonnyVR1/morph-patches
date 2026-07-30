package p002l;

import android.view.View;
import l.t100;
import l.ura;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yha0 {
    /* JADX INFO: renamed from: a */
    public static void m26717a(View view) {
        if (xdl0.y0() <= 720.0f) {
            xdl0.X(view, 0);
            xdl0.U(view, t100.d(8.0f));
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m26718b(String str) {
        if (str.matches("[ ]+")) {
            ura.e().d().Xj("space");
            return true;
        }
        if (str.matches("\\d+")) {
            ura.e().d().Xj("number");
            return true;
        }
        if (str.matches("[\\p{P}+`]+")) {
            ura.e().d().Xj("symbol");
            return true;
        }
        if (!str.matches("[\\p{P}\\d+`]+")) {
            return false;
        }
        ura.e().d().Xj("number_symbol");
        return true;
    }
}
