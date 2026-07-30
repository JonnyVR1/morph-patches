package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q9n {
    /* JADX INFO: renamed from: a */
    public static void m175843a(p9n p9nVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        p9nVar.f151166a = (VText) viewGroup.getChildAt(1);
        p9nVar.f151167b = (VText) viewGroup.getChildAt(2);
        p9nVar.f151168c = (LinearLayout) viewGroup.getChildAt(3);
        p9nVar.f151169d = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        p9nVar.f151170e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
