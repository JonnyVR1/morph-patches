package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedPostGuideView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class wuh {
    /* JADX INFO: renamed from: a */
    public static void m207950a(FeedPostGuideView feedPostGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostGuideView.f43298d = (VRelative) viewGroup.getChildAt(0);
        feedPostGuideView.f43299e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostGuideView.f43300f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPostGuideView.f43301g = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostGuideView.f43302h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedPostGuideView.f43303i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
