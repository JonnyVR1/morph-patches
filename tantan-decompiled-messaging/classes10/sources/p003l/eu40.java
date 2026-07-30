package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class eu40 {
    /* JADX INFO: renamed from: a */
    public static void m6317a(NotifyHeaderViewV2 notifyHeaderViewV2, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        notifyHeaderViewV2.a = (FrameLayout) viewGroup.getChildAt(0);
        notifyHeaderViewV2.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }
}
