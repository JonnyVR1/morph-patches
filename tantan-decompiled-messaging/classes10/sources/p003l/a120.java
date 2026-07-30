package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.MyTabUserHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class a120 {
    /* JADX INFO: renamed from: a */
    public static void m5267a(MyTabUserHeaderView myTabUserHeaderView, View view) {
        myTabUserHeaderView.a = (MyTabUserHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        myTabUserHeaderView.b = (FrameLayout) viewGroup.getChildAt(0);
        myTabUserHeaderView.c = (PrivilegeEntranceView) viewGroup.getChildAt(1);
    }
}
