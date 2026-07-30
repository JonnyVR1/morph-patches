package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.settings.notification.TeamAccountSelectView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zfi0 {
    /* JADX INFO: renamed from: a */
    public static void m11395a(TeamAccountSelectView teamAccountSelectView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        teamAccountSelectView.a = viewGroup.getChildAt(0);
        teamAccountSelectView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        teamAccountSelectView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        teamAccountSelectView.d = viewGroup.getChildAt(1);
        teamAccountSelectView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        teamAccountSelectView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        teamAccountSelectView.g = viewGroup.getChildAt(2);
        teamAccountSelectView.h = viewGroup.getChildAt(3);
        teamAccountSelectView.i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        teamAccountSelectView.j = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
