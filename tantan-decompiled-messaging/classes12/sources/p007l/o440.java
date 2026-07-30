package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.NewPostSelectedTopicItemView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class o440 {
    /* JADX INFO: renamed from: a */
    public static void m12441a(NewPostSelectedTopicItemView newPostSelectedTopicItemView, View view) {
        newPostSelectedTopicItemView.f4662c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPostSelectedTopicItemView.f4663d = (TextView) viewGroup.getChildAt(0);
        newPostSelectedTopicItemView.f4664e = (TextView) viewGroup.getChildAt(1);
        newPostSelectedTopicItemView.f4665f = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m12442b(NewPostSelectedTopicItemView newPostSelectedTopicItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11071J1, viewGroup, false);
        m12441a(newPostSelectedTopicItemView, viewInflate);
        return viewInflate;
    }
}
