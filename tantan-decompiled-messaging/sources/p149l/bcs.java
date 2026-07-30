package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubTaskModelView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bcs {
    /* JADX INFO: renamed from: a */
    public static void m101122a(LiveFansClubTaskModelView liveFansClubTaskModelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubTaskModelView.f49161a = (VDraweeView) viewGroup.getChildAt(0);
        liveFansClubTaskModelView.f49162b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveFansClubTaskModelView.f49163c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveFansClubTaskModelView.f49164d = (VText) viewGroup.getChildAt(2);
    }
}
