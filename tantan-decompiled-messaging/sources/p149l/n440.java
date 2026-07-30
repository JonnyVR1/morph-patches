package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.NewPostSelectedTopicItemView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class n440 {
    /* JADX INFO: renamed from: a */
    public static void m157796a(NewPostSelectedTopicItemView newPostSelectedTopicItemView, View view) {
        newPostSelectedTopicItemView.f43205g = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPostSelectedTopicItemView.f43206h = (VImage) viewGroup.getChildAt(0);
        newPostSelectedTopicItemView.f43207i = (TextView) viewGroup.getChildAt(1);
        newPostSelectedTopicItemView.f43208j = (TextView) viewGroup.getChildAt(2);
        newPostSelectedTopicItemView.f43209k = (VImage) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m157797b(NewPostSelectedTopicItemView newPostSelectedTopicItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142046I1, viewGroup, false);
        m157796a(newPostSelectedTopicItemView, viewInflate);
        return viewInflate;
    }
}
