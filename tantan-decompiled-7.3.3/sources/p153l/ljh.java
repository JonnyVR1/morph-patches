package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class ljh {
    /* JADX INFO: renamed from: a */
    public static void m154507a(FeedMyInterestPeopleAct feedMyInterestPeopleAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedMyInterestPeopleAct.f42957c = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMyInterestPeopleAct.f42958d = (ViewPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMyInterestPeopleAct.f42959e = (RelativeLayout) viewGroup.getChildAt(1);
        feedMyInterestPeopleAct.f42960f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedMyInterestPeopleAct.f42961g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m154508b(FeedMyInterestPeopleAct feedMyInterestPeopleAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173705m, viewGroup, false);
        m154507a(feedMyInterestPeopleAct, viewInflate);
        return viewInflate;
    }
}
