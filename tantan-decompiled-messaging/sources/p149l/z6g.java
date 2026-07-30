package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class z6g {
    /* JADX INFO: renamed from: a */
    public static void m217394a(y6g y6gVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        y6gVar.f196551k = (FrameLayout) viewGroup.getChildAt(0);
        y6gVar.f196552l = (VImage) viewGroup.getChildAt(1);
        y6gVar.f196553m = (LinearLayout) viewGroup.getChildAt(2);
        y6gVar.f196554n = (LiveFansClubAnchorProfileView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        y6gVar.f196555o = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        y6gVar.f196556p = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        y6gVar.f196557q = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }
}
