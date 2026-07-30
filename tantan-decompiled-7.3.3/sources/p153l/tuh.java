package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideTwoView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class tuh {
    /* JADX INFO: renamed from: a */
    public static void m192751a(FeedPostGuideTwoView feedPostGuideTwoView, View view) {
        feedPostGuideTwoView.f43170c = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostGuideTwoView.f43171d = (VDraweeView) viewGroup.getChildAt(0);
        feedPostGuideTwoView.f43172e = (VText) viewGroup.getChildAt(1);
        feedPostGuideTwoView.f43173f = (VLinear) viewGroup.getChildAt(2);
        feedPostGuideTwoView.f43174g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedPostGuideTwoView.f43175h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m192752b(FeedPostGuideTwoView feedPostGuideTwoView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173466A2, viewGroup, false);
        m192751a(feedPostGuideTwoView, viewInflate);
        return viewInflate;
    }
}
