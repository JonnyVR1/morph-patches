package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedSelectTopicItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedLinearWithExtraIconsView;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class vzh {
    /* JADX INFO: renamed from: a */
    public static void m204095a(FeedSelectTopicItem feedSelectTopicItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedSelectTopicItem.f40859a = (FeedLinearWithExtraIconsView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedSelectTopicItem.f40860b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedSelectTopicItem.f40861c = (VImage) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m204096b(FeedSelectTopicItem feedSelectTopicItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173674h3, viewGroup, false);
        m204095a(feedSelectTopicItem, viewInflate);
        return viewInflate;
    }
}
