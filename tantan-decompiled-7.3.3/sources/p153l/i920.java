package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.MyTabUserHeaderView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;

/* JADX INFO: loaded from: classes10.dex */
public class i920 {
    /* JADX INFO: renamed from: a */
    public static void m139064a(MyTabUserHeaderView myTabUserHeaderView, View view) {
        myTabUserHeaderView.f27544a = (MyTabUserHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        myTabUserHeaderView.f27545b = (FrameLayout) viewGroup.getChildAt(0);
        myTabUserHeaderView.f27546c = (PrivilegeEntranceView) viewGroup.getChildAt(1);
    }
}
