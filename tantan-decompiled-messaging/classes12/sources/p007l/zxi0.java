package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.topic.topicpost.TopicAddItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zxi0 {
    /* JADX INFO: renamed from: a */
    public static void m17575a(TopicAddItemView topicAddItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicAddItemView.f4718a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicAddItemView.f4719b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        topicAddItemView.f4720c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        topicAddItemView.f4721d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        topicAddItemView.f4722e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m17576b(TopicAddItemView topicAddItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11176a4, viewGroup, false);
        m17575a(topicAddItemView, viewInflate);
        return viewInflate;
    }
}
