package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubTaskModelView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bcs {
    /* JADX INFO: renamed from: a */
    public static void m10225a(LiveFansClubTaskModelView liveFansClubTaskModelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubTaskModelView.f5203a = viewGroup.getChildAt(0);
        liveFansClubTaskModelView.f5204b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveFansClubTaskModelView.f5205c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveFansClubTaskModelView.f5206d = viewGroup.getChildAt(2);
    }
}
