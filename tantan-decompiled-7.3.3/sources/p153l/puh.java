package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideOneView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class puh {
    /* JADX INFO: renamed from: a */
    public static void m173881a(FeedPostGuideOneView feedPostGuideOneView, View view) {
        feedPostGuideOneView.f43158c = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostGuideOneView.f43159d = (VText) viewGroup.getChildAt(0);
        feedPostGuideOneView.f43160e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedPostGuideOneView.f43161f = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m173882b(FeedPostGuideOneView feedPostGuideOneView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173792y2, viewGroup, false);
        m173881a(feedPostGuideOneView, viewInflate);
        return viewInflate;
    }
}
