package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsUnPrivilegeView;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mjm0 {
    /* JADX INFO: renamed from: a */
    public static void m158595a(VisitorsUnPrivilegeView visitorsUnPrivilegeView, View view) {
        visitorsUnPrivilegeView.f38968a = (VisitorsUnPrivilegeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsUnPrivilegeView.f38969b = (VRelative) viewGroup.getChildAt(0);
        visitorsUnPrivilegeView.f38970c = (HeaderFrameWrapper) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        visitorsUnPrivilegeView.f38971d = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        visitorsUnPrivilegeView.f38972e = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        visitorsUnPrivilegeView.f38973f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        visitorsUnPrivilegeView.f38974g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        visitorsUnPrivilegeView.f38975h = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
