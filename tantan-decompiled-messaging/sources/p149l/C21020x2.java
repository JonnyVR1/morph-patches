package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.view.AboutMeNewCaseLayout;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: renamed from: l.x2 */
/* JADX INFO: loaded from: classes10.dex */
public class C21020x2 {
    /* JADX INFO: renamed from: a */
    public static void m206768a(AboutMeNewCaseLayout aboutMeNewCaseLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aboutMeNewCaseLayout.f36719a = (VText) viewGroup.getChildAt(0);
        aboutMeNewCaseLayout.f36720b = (VLinear) viewGroup.getChildAt(1);
        aboutMeNewCaseLayout.f36721c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        aboutMeNewCaseLayout.f36722d = (VText_Medium) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        aboutMeNewCaseLayout.f36723e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        aboutMeNewCaseLayout.f36724f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
