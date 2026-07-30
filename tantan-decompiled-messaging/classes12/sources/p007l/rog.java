package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.status.display.view.FeedAutoScrollView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rog {
    /* JADX INFO: renamed from: a */
    public static void m13941a(FeedAutoScrollView feedAutoScrollView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAutoScrollView.f4359a = viewGroup.getChildAt(0);
        feedAutoScrollView.f4360b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedAutoScrollView.f4361c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedAutoScrollView.f4362d = viewGroup.getChildAt(1);
        feedAutoScrollView.f4363e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedAutoScrollView.f4364f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
