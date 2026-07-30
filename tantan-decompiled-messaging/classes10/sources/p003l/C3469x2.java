package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.view.AboutMeNewCaseLayout;

/* JADX INFO: renamed from: l.x2 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3469x2 {
    /* JADX INFO: renamed from: a */
    public static void m10621a(AboutMeNewCaseLayout aboutMeNewCaseLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aboutMeNewCaseLayout.a = viewGroup.getChildAt(0);
        aboutMeNewCaseLayout.b = viewGroup.getChildAt(1);
        aboutMeNewCaseLayout.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        aboutMeNewCaseLayout.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        aboutMeNewCaseLayout.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        aboutMeNewCaseLayout.f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
