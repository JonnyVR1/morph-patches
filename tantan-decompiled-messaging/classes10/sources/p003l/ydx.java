package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.match.view.MatchSuccessPopViewOpt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ydx {
    /* JADX INFO: renamed from: a */
    public static void m11171a(MatchSuccessPopViewOpt matchSuccessPopViewOpt, View view) {
        matchSuccessPopViewOpt.a = (MatchSuccessPopViewOpt) view;
        ViewGroup viewGroup = (ViewGroup) view;
        matchSuccessPopViewOpt.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        matchSuccessPopViewOpt.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        matchSuccessPopViewOpt.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
