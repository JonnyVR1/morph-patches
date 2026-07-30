package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubTaskModelView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ces {
    /* JADX INFO: renamed from: a */
    public static void m109452a(LiveFansClubTaskModelView liveFansClubTaskModelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubTaskModelView.f50009a = (VDraweeView) viewGroup.getChildAt(0);
        liveFansClubTaskModelView.f50010b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveFansClubTaskModelView.f50011c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveFansClubTaskModelView.f50012d = (VText) viewGroup.getChildAt(2);
    }
}
