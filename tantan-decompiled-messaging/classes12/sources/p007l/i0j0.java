package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.TopicOfficialItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class i0j0 {
    /* JADX INFO: renamed from: a */
    public static void m10755a(TopicOfficialItemView topicOfficialItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicOfficialItemView.f4693a = viewGroup.getChildAt(0);
        topicOfficialItemView.f4694b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10756b(TopicOfficialItemView topicOfficialItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11019A5, viewGroup, false);
        m10755a(topicOfficialItemView, viewInflate);
        return viewInflate;
    }
}
