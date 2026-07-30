package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fu40 {
    /* JADX INFO: renamed from: a */
    public static void m6515a(NotifyHeaderView notifyHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        notifyHeaderView.a = (FrameLayout) viewGroup.getChildAt(0);
        notifyHeaderView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        notifyHeaderView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        notifyHeaderView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        notifyHeaderView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        notifyHeaderView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        notifyHeaderView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        notifyHeaderView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        notifyHeaderView.i = (ViewStub) viewGroup.getChildAt(1);
    }
}
