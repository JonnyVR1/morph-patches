package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.campus.SchoolItemView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f3e0 {
    /* JADX INFO: renamed from: a */
    public static void m119258a(SchoolItemView schoolItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        schoolItemView.f28653a = viewGroup.getChildAt(0);
        schoolItemView.f28654b = (VText) viewGroup.getChildAt(1);
        schoolItemView.f28655c = (LinearLayout) viewGroup.getChildAt(2);
        schoolItemView.f28656d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
