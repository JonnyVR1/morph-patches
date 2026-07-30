package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomClassesView;

/* JADX INFO: loaded from: classes4.dex */
public class wtl0 {
    /* JADX INFO: renamed from: a */
    public static void m205541a(vtl0 vtl0Var, View view) {
        vtl0Var.f182979k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vtl0Var.f182980l = viewGroup.getChildAt(0);
        vtl0Var.f182981m = viewGroup.getChildAt(1);
        vtl0Var.f182982n = (ImageView) viewGroup.getChildAt(2);
        vtl0Var.f182983o = (TextView) viewGroup.getChildAt(3);
        vtl0Var.f182984p = (ScrollView) viewGroup.getChildAt(4);
        vtl0Var.f182985q = (VirtualRoomClassesView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        vtl0Var.f182986r = (TextView) viewGroup.getChildAt(5);
    }
}
