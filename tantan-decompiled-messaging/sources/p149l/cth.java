package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideThreeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class cth {
    /* JADX INFO: renamed from: a */
    public static void m108683a(FeedPostGuideThreeView feedPostGuideThreeView, View view) {
        feedPostGuideThreeView.f42317c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostGuideThreeView.f42318d = (VText) viewGroup.getChildAt(0);
        feedPostGuideThreeView.f42319e = (VLinear) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m108684b(FeedPostGuideThreeView feedPostGuideThreeView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142330z2, viewGroup, false);
        m108683a(feedPostGuideThreeView, viewInflate);
        return viewInflate;
    }
}
