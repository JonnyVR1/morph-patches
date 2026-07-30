package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceDefaultView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zz80 {
    /* JADX INFO: renamed from: a */
    public static void m11463a(PrivilegeEntranceDefaultView privilegeEntranceDefaultView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceDefaultView._texture = viewGroup.getChildAt(0);
        privilegeEntranceDefaultView._border = viewGroup.getChildAt(1);
        privilegeEntranceDefaultView._arrow_right = viewGroup.getChildAt(2);
        privilegeEntranceDefaultView._title = viewGroup.getChildAt(3);
        privilegeEntranceDefaultView._desc = viewGroup.getChildAt(4);
    }
}
