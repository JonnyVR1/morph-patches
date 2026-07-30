package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.campus.SchoolItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f3e0 {
    /* JADX INFO: renamed from: a */
    public static void m6378a(SchoolItemView schoolItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        schoolItemView.f1047a = viewGroup.getChildAt(0);
        schoolItemView.f1048b = viewGroup.getChildAt(1);
        schoolItemView.f1049c = (LinearLayout) viewGroup.getChildAt(2);
        schoolItemView.f1050d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
