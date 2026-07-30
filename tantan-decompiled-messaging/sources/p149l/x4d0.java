package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightSwitchItemView;
import p147v.VSwitch;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class x4d0 {
    /* JADX INFO: renamed from: a */
    public static void m206968a(RightSwitchItemView rightSwitchItemView, View view) {
        rightSwitchItemView.f46120d = (RightSwitchItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightSwitchItemView.f46121e = (VText) viewGroup.getChildAt(0);
        rightSwitchItemView.f46122f = (VSwitch) viewGroup.getChildAt(1);
        rightSwitchItemView.f46123g = viewGroup.getChildAt(2);
        rightSwitchItemView.f46124h = (VText) viewGroup.getChildAt(3);
    }
}
