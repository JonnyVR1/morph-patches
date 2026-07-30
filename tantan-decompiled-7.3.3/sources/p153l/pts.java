package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeActiveButton;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class pts {
    /* JADX INFO: renamed from: a */
    public static void m173780a(LiveGuardPrivilegeActiveButton liveGuardPrivilegeActiveButton, View view) {
        liveGuardPrivilegeActiveButton.f51329c = (LiveGuardPrivilegeActiveButton) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardPrivilegeActiveButton.f51330d = (VLinear) viewGroup.getChildAt(0);
        liveGuardPrivilegeActiveButton.f51331e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveGuardPrivilegeActiveButton.f51332f = (LiveTextRollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
