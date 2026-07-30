package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeActiveButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ors {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m19696a(LiveGuardPrivilegeActiveButton liveGuardPrivilegeActiveButton, View view) {
        liveGuardPrivilegeActiveButton.f6523c = (LiveGuardPrivilegeActiveButton) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardPrivilegeActiveButton.f6524d = viewGroup.getChildAt(0);
        liveGuardPrivilegeActiveButton.f6525e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveGuardPrivilegeActiveButton.f6526f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
