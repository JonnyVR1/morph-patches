package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideTwoView;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class eth {
    /* JADX INFO: renamed from: a */
    public static void m9958a(FeedPostGuideTwoView feedPostGuideTwoView, View view) {
        feedPostGuideTwoView.f3783c = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostGuideTwoView.f3784d = viewGroup.getChildAt(0);
        feedPostGuideTwoView.f3785e = viewGroup.getChildAt(1);
        feedPostGuideTwoView.f3786f = viewGroup.getChildAt(2);
        feedPostGuideTwoView.f3787g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedPostGuideTwoView.f3788h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9959b(FeedPostGuideTwoView feedPostGuideTwoView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11016A2, viewGroup, false);
        m9958a(feedPostGuideTwoView, viewInflate);
        return viewInflate;
    }
}
