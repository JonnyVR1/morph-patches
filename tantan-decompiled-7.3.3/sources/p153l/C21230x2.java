package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.view.AboutMeNewCaseLayout;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: renamed from: l.x2 */
/* JADX INFO: loaded from: classes10.dex */
public class C21230x2 {
    /* JADX INFO: renamed from: a */
    public static void m209123a(AboutMeNewCaseLayout aboutMeNewCaseLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aboutMeNewCaseLayout.f37567a = (VText) viewGroup.getChildAt(0);
        aboutMeNewCaseLayout.f37568b = (VLinear) viewGroup.getChildAt(1);
        aboutMeNewCaseLayout.f37569c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        aboutMeNewCaseLayout.f37570d = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        aboutMeNewCaseLayout.f37571e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        aboutMeNewCaseLayout.f37572f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
