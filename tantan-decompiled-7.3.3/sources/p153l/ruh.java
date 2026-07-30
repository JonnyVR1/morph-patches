package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideThreeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ruh {
    /* JADX INFO: renamed from: a */
    public static void m183193a(FeedPostGuideThreeView feedPostGuideThreeView, View view) {
        feedPostGuideThreeView.f43165c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostGuideThreeView.f43166d = (VText) viewGroup.getChildAt(0);
        feedPostGuideThreeView.f43167e = (VLinear) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m183194b(FeedPostGuideThreeView feedPostGuideThreeView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173799z2, viewGroup, false);
        m183193a(feedPostGuideThreeView, viewInflate);
        return viewInflate;
    }
}
