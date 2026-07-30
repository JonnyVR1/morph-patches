package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rzh {
    /* JADX INFO: renamed from: a */
    public static void m13972a(FeedSharelinkView feedSharelinkView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedSharelinkView.f3963a = viewGroup.getChildAt(0);
        feedSharelinkView.f3964b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedSharelinkView.f3965c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
