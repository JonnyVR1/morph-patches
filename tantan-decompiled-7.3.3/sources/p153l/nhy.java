package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import p151v.VFrame;
import p151v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class nhy {
    /* JADX INFO: renamed from: a */
    public static void m163255a(mhy mhyVar, View view) {
        mhyVar.f136899k = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mhyVar.f136900l = (HourBoardDialogTopAnimView) viewGroup.getChildAt(0);
        mhyVar.f136901m = (TabLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mhyVar.f136902n = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mhyVar.f136903o = (VPager) viewGroup.getChildAt(2);
    }
}
