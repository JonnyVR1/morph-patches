package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardLeadBoardView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kts {
    /* JADX INFO: renamed from: a */
    public static void m151398a(LiveGuardLeadBoardView liveGuardLeadBoardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardLeadBoardView.f51324d = (VImage) viewGroup.getChildAt(0);
        liveGuardLeadBoardView.f51325e = (VImage) viewGroup.getChildAt(1);
        liveGuardLeadBoardView.f51326f = (VText) viewGroup.getChildAt(2);
        liveGuardLeadBoardView.f51327g = (VImage) viewGroup.getChildAt(3);
        liveGuardLeadBoardView.f51328h = (RecyclerView) viewGroup.getChildAt(4);
    }
}
