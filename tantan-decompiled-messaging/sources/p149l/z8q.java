package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.ItemMessageNewSurvey;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z8q {
    /* JADX INFO: renamed from: a */
    public static void m217620a(ItemMessageNewSurvey itemMessageNewSurvey, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageNewSurvey.f32346a = (LinearLayout) viewGroup.getChildAt(0);
        itemMessageNewSurvey.f32347b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemMessageNewSurvey.f32348c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemMessageNewSurvey.f32349d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemMessageNewSurvey.f32350e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemMessageNewSurvey.f32351f = (VText) viewGroup.getChildAt(1);
    }
}
