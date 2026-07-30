package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.ItemMessageNewSurvey;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zaq {
    /* JADX INFO: renamed from: a */
    public static void m219132a(ItemMessageNewSurvey itemMessageNewSurvey, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageNewSurvey.f33194a = (LinearLayout) viewGroup.getChildAt(0);
        itemMessageNewSurvey.f33195b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemMessageNewSurvey.f33196c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemMessageNewSurvey.f33197d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemMessageNewSurvey.f33198e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemMessageNewSurvey.f33199f = (VText) viewGroup.getChildAt(1);
    }
}
