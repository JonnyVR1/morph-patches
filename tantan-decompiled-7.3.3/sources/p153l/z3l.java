package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.page.setting.privacy.view.HideLiveAnchorLevelView;
import p151v.VSwitch;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class z3l {
    /* JADX INFO: renamed from: a */
    public static void m218488a(HideLiveAnchorLevelView hideLiveAnchorLevelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hideLiveAnchorLevelView.f47052d = (VText) viewGroup.getChildAt(0);
        hideLiveAnchorLevelView.f47053e = (VSwitch) viewGroup.getChildAt(1);
        hideLiveAnchorLevelView.f47054f = (VText) viewGroup.getChildAt(2);
    }
}
