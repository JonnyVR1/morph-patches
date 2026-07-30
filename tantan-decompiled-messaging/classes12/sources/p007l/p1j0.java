package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class p1j0 {
    /* JADX INFO: renamed from: a */
    public static void m12901a(TopicRecommendUserView topicRecommendUserView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicRecommendUserView.f4049c = viewGroup.getChildAt(0);
        topicRecommendUserView.f4050d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicRecommendUserView.f4051e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
