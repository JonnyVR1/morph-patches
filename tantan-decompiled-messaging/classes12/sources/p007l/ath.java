package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideOneView;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ath {
    /* JADX INFO: renamed from: a */
    public static void m8593a(FeedPostGuideOneView feedPostGuideOneView, View view) {
        feedPostGuideOneView.f3771c = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostGuideOneView.f3772d = viewGroup.getChildAt(0);
        feedPostGuideOneView.f3773e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedPostGuideOneView.f3774f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8594b(FeedPostGuideOneView feedPostGuideOneView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11342y2, viewGroup, false);
        m8593a(feedPostGuideOneView, viewInflate);
        return viewInflate;
    }
}
