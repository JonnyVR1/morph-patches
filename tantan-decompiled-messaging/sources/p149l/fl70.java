package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty.PkBountyIndicatorView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty.PkBountyView;

/* JADX INFO: loaded from: classes4.dex */
public class fl70 {
    /* JADX INFO: renamed from: a */
    public static void m121963a(PkBountyView pkBountyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkBountyView.f51768a = (MomoLayUpSVGAImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pkBountyView.f51769b = (PkBountyIndicatorView) viewGroup.getChildAt(1);
    }
}
