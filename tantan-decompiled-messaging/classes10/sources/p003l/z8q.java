package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.messages.view.ItemMessageNewSurvey;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class z8q {
    /* JADX INFO: renamed from: a */
    public static void m11363a(ItemMessageNewSurvey itemMessageNewSurvey, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageNewSurvey.a = (LinearLayout) viewGroup.getChildAt(0);
        itemMessageNewSurvey.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemMessageNewSurvey.c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemMessageNewSurvey.d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemMessageNewSurvey.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemMessageNewSurvey.f = viewGroup.getChildAt(1);
    }
}
