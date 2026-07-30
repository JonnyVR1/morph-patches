package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.match.view.MatchSuccessPopViewOpt;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ydx {
    /* JADX INFO: renamed from: a */
    public static void m214331a(MatchSuccessPopViewOpt matchSuccessPopViewOpt, View view) {
        matchSuccessPopViewOpt.f30590a = (MatchSuccessPopViewOpt) view;
        ViewGroup viewGroup = (ViewGroup) view;
        matchSuccessPopViewOpt.f30591b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        matchSuccessPopViewOpt.f30592c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        matchSuccessPopViewOpt.f30593d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
