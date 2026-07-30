package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.MyTabUserHeaderView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;

/* JADX INFO: loaded from: classes10.dex */
public class a120 {
    /* JADX INFO: renamed from: a */
    public static void m94505a(MyTabUserHeaderView myTabUserHeaderView, View view) {
        myTabUserHeaderView.f26696a = (MyTabUserHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        myTabUserHeaderView.f26697b = (FrameLayout) viewGroup.getChildAt(0);
        myTabUserHeaderView.f26698c = (PrivilegeEntranceView) viewGroup.getChildAt(1);
    }
}
