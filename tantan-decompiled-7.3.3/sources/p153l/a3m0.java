package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomClassesView;

/* JADX INFO: loaded from: classes4.dex */
public class a3m0 {
    /* JADX INFO: renamed from: a */
    public static void m95825a(z2m0 z2m0Var, View view) {
        z2m0Var.f202714k = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        z2m0Var.f202715l = viewGroup.getChildAt(0);
        z2m0Var.f202716m = viewGroup.getChildAt(1);
        z2m0Var.f202717n = (ImageView) viewGroup.getChildAt(2);
        z2m0Var.f202718o = (TextView) viewGroup.getChildAt(3);
        z2m0Var.f202719p = (ScrollView) viewGroup.getChildAt(4);
        z2m0Var.f202720q = (VirtualRoomClassesView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        z2m0Var.f202721r = (TextView) viewGroup.getChildAt(5);
    }
}
