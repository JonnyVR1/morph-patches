package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansBottomSelectView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubEventView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubSweetCompanyView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubLevelView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class g8g {
    /* JADX INFO: renamed from: a */
    public static void m129405a(f8g f8gVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        f8gVar.f97722k = viewGroup.getChildAt(0);
        f8gVar.f97723l = (VImage) viewGroup.getChildAt(1);
        f8gVar.f97724m = (LinearLayout) viewGroup.getChildAt(2);
        f8gVar.f97725n = (LiveFansClubAnchorProfileView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        f8gVar.f97726o = (NestedScrollView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        f8gVar.f97727p = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        f8gVar.f97728q = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        f8gVar.f97729r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        f8gVar.f97730s = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        f8gVar.f97731t = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        f8gVar.f97732u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        f8gVar.f97733v = (LiveFansClubLevelView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        f8gVar.f97734w = (RecyclerView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(5);
        f8gVar.f97735x = (FansClubSweetCompanyView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(6);
        f8gVar.f97736y = (FansClubEventView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0)).getChildAt(7);
        f8gVar.f97737z = (FansBottomSelectView) viewGroup.getChildAt(3);
    }
}
