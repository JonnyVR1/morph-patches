package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceDefaultView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class d890 {
    /* JADX INFO: renamed from: a */
    public static void m114831a(PrivilegeEntranceDefaultView privilegeEntranceDefaultView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceDefaultView._texture = (VImage) viewGroup.getChildAt(0);
        privilegeEntranceDefaultView._border = (VImage) viewGroup.getChildAt(1);
        privilegeEntranceDefaultView._arrow_right = (VImage) viewGroup.getChildAt(2);
        privilegeEntranceDefaultView._title = (VText) viewGroup.getChildAt(3);
        privilegeEntranceDefaultView._desc = (VText) viewGroup.getChildAt(4);
    }
}
