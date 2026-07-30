package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class whh {
    /* JADX INFO: renamed from: a */
    public static void m15813a(FeedMyInterestPeopleAct feedMyInterestPeopleAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedMyInterestPeopleAct.f3570c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMyInterestPeopleAct.f3571d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMyInterestPeopleAct.f3572e = (RelativeLayout) viewGroup.getChildAt(1);
        feedMyInterestPeopleAct.f3573f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedMyInterestPeopleAct.f3574g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m15814b(FeedMyInterestPeopleAct feedMyInterestPeopleAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11255m, viewGroup, false);
        m15813a(feedMyInterestPeopleAct, viewInflate);
        return viewInflate;
    }
}
