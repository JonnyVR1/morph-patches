package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.match.view.MatchSuccessPopViewOpt;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xgx {
    /* JADX INFO: renamed from: a */
    public static void m210966a(MatchSuccessPopViewOpt matchSuccessPopViewOpt, View view) {
        matchSuccessPopViewOpt.f31438a = (MatchSuccessPopViewOpt) view;
        ViewGroup viewGroup = (ViewGroup) view;
        matchSuccessPopViewOpt.f31439b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        matchSuccessPopViewOpt.f31440c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        matchSuccessPopViewOpt.f31441d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
