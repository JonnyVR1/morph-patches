package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class whh {
    /* JADX INFO: renamed from: a */
    public static void m203213a(FeedMyInterestPeopleAct feedMyInterestPeopleAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedMyInterestPeopleAct.f42109c = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMyInterestPeopleAct.f42110d = (ViewPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMyInterestPeopleAct.f42111e = (RelativeLayout) viewGroup.getChildAt(1);
        feedMyInterestPeopleAct.f42112f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedMyInterestPeopleAct.f42113g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m203214b(FeedMyInterestPeopleAct feedMyInterestPeopleAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142236m, viewGroup, false);
        m203213a(feedMyInterestPeopleAct, viewInflate);
        return viewInflate;
    }
}
