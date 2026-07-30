package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty.PkBountyIndicatorView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty.PkBountyView;

/* JADX INFO: loaded from: classes4.dex */
public class lt70 {
    /* JADX INFO: renamed from: a */
    public static void m155745a(PkBountyView pkBountyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkBountyView.f52616a = (MomoLayUpSVGAImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pkBountyView.f52617b = (PkBountyIndicatorView) viewGroup.getChildAt(1);
    }
}
