package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.AnchorGuardView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class lm0 {
    /* JADX INFO: renamed from: a */
    public static void m154824a(AnchorGuardView anchorGuardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        anchorGuardView.f51253d = (ConstraintLayout) viewGroup.getChildAt(0);
        anchorGuardView.f51254e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        anchorGuardView.f51255f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        anchorGuardView.f51256g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        anchorGuardView.f51257h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        anchorGuardView.f51258i = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        anchorGuardView.f51259j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        anchorGuardView.f51260k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        anchorGuardView.f51261l = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        anchorGuardView.f51262m = (Group) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        anchorGuardView.f51263n = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        anchorGuardView.f51264o = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(10);
    }
}
