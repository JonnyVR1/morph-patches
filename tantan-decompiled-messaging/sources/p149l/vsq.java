package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealHomeTitleLayoutOpt;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealNumContentLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class vsq {
    /* JADX INFO: renamed from: a */
    public static void m199891a(JustRealHomeTitleLayoutOpt justRealHomeTitleLayoutOpt, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        justRealHomeTitleLayoutOpt.f23112a = (SVGAnimationView) viewGroup.getChildAt(0);
        justRealHomeTitleLayoutOpt.f23113b = (VImage) viewGroup.getChildAt(1);
        justRealHomeTitleLayoutOpt.f23114c = (VText_Default_Bold) viewGroup.getChildAt(2);
        justRealHomeTitleLayoutOpt.f23115d = (VLinear) viewGroup.getChildAt(3);
        justRealHomeTitleLayoutOpt.f23116e = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        justRealHomeTitleLayoutOpt.f23117f = (JustRealNumContentLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        justRealHomeTitleLayoutOpt.f23118g = (VText_Default_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        justRealHomeTitleLayoutOpt.f23119h = (VText_Default_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        justRealHomeTitleLayoutOpt.f23120i = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }
}
