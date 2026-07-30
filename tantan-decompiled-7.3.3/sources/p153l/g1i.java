package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class g1i {
    /* JADX INFO: renamed from: a */
    public static void m128512a(FeedSharelinkView feedSharelinkView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedSharelinkView.f43350a = (VDraweeView) viewGroup.getChildAt(0);
        feedSharelinkView.f43351b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedSharelinkView.f43352c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
