package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.campus.SchoolItemView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jbe0 {
    /* JADX INFO: renamed from: a */
    public static void m144201a(SchoolItemView schoolItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        schoolItemView.f29501a = viewGroup.getChildAt(0);
        schoolItemView.f29502b = (VText) viewGroup.getChildAt(1);
        schoolItemView.f29503c = (LinearLayout) viewGroup.getChildAt(2);
        schoolItemView.f29504d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
