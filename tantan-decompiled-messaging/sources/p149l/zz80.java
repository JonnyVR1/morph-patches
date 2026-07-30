package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceDefaultView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zz80 {
    /* JADX INFO: renamed from: a */
    public static void m221008a(PrivilegeEntranceDefaultView privilegeEntranceDefaultView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceDefaultView._texture = (VImage) viewGroup.getChildAt(0);
        privilegeEntranceDefaultView._border = (VImage) viewGroup.getChildAt(1);
        privilegeEntranceDefaultView._arrow_right = (VImage) viewGroup.getChildAt(2);
        privilegeEntranceDefaultView._title = (VText) viewGroup.getChildAt(3);
        privilegeEntranceDefaultView._desc = (VText) viewGroup.getChildAt(4);
    }
}
