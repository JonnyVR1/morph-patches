package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardInfoView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeView;
import p151v.VImage;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zts {
    /* JADX INFO: renamed from: a */
    public static void m221570a(LiveGuardPrivilegeView liveGuardPrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardPrivilegeView.f51352d = (VText) viewGroup.getChildAt(2);
        liveGuardPrivilegeView.f51353e = (VText) viewGroup.getChildAt(3);
        liveGuardPrivilegeView.f51354f = (VImage) viewGroup.getChildAt(4);
        liveGuardPrivilegeView.f51355g = (LiveGuardInfoView) viewGroup.getChildAt(5);
        liveGuardPrivilegeView.f51356h = (VPager) viewGroup.getChildAt(6);
        liveGuardPrivilegeView.f51357i = (ViewPager2) viewGroup.getChildAt(7);
        liveGuardPrivilegeView.f51358j = (VImage) viewGroup.getChildAt(8);
    }
}
