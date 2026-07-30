package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightSwitchItemView;
import p151v.VSwitch;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class add0 {
    /* JADX INFO: renamed from: a */
    public static void m97065a(RightSwitchItemView rightSwitchItemView, View view) {
        rightSwitchItemView.f46968d = (RightSwitchItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightSwitchItemView.f46969e = (VText) viewGroup.getChildAt(0);
        rightSwitchItemView.f46970f = (VSwitch) viewGroup.getChildAt(1);
        rightSwitchItemView.f46971g = viewGroup.getChildAt(2);
        rightSwitchItemView.f46972h = (VText) viewGroup.getChildAt(3);
    }
}
