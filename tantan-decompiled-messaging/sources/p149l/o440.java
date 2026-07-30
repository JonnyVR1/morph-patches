package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.NewPostSelectedTopicItemView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class o440 {
    /* JADX INFO: renamed from: a */
    public static void m162545a(NewPostSelectedTopicItemView newPostSelectedTopicItemView, View view) {
        newPostSelectedTopicItemView.f43201c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPostSelectedTopicItemView.f43202d = (TextView) viewGroup.getChildAt(0);
        newPostSelectedTopicItemView.f43203e = (TextView) viewGroup.getChildAt(1);
        newPostSelectedTopicItemView.f43204f = (VImage) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m162546b(NewPostSelectedTopicItemView newPostSelectedTopicItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142052J1, viewGroup, false);
        m162545a(newPostSelectedTopicItemView, viewInflate);
        return viewInflate;
    }
}
