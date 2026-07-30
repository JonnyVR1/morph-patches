package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.NewPostSelectedTopicItemView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class n440 {
    /* JADX INFO: renamed from: a */
    public static void m12068a(NewPostSelectedTopicItemView newPostSelectedTopicItemView, View view) {
        newPostSelectedTopicItemView.f4666g = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPostSelectedTopicItemView.f4667h = viewGroup.getChildAt(0);
        newPostSelectedTopicItemView.f4668i = (TextView) viewGroup.getChildAt(1);
        newPostSelectedTopicItemView.f4669j = (TextView) viewGroup.getChildAt(2);
        newPostSelectedTopicItemView.f4670k = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m12069b(NewPostSelectedTopicItemView newPostSelectedTopicItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11065I1, viewGroup, false);
        m12068a(newPostSelectedTopicItemView, viewInflate);
        return viewInflate;
    }
}
