package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeActiveButton;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class ors {
    /* JADX INFO: renamed from: a */
    public static void m165678a(LiveGuardPrivilegeActiveButton liveGuardPrivilegeActiveButton, View view) {
        liveGuardPrivilegeActiveButton.f50481c = (LiveGuardPrivilegeActiveButton) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardPrivilegeActiveButton.f50482d = (VLinear) viewGroup.getChildAt(0);
        liveGuardPrivilegeActiveButton.f50483e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveGuardPrivilegeActiveButton.f50484f = (LiveTextRollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
