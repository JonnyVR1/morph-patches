package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.leaderboard.LiveGuardLeadBoardView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jrs {
    /* JADX INFO: renamed from: a */
    public static void m142972a(LiveGuardLeadBoardView liveGuardLeadBoardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveGuardLeadBoardView.f50476d = (VImage) viewGroup.getChildAt(0);
        liveGuardLeadBoardView.f50477e = (VImage) viewGroup.getChildAt(1);
        liveGuardLeadBoardView.f50478f = (VText) viewGroup.getChildAt(2);
        liveGuardLeadBoardView.f50479g = (VImage) viewGroup.getChildAt(3);
        liveGuardLeadBoardView.f50480h = (RecyclerView) viewGroup.getChildAt(4);
    }
}
