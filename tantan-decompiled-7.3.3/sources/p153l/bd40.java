package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.NewPostSelectedTopicItemView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class bd40 {
    /* JADX INFO: renamed from: a */
    public static void m103592a(NewPostSelectedTopicItemView newPostSelectedTopicItemView, View view) {
        newPostSelectedTopicItemView.f44053g = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPostSelectedTopicItemView.f44054h = (VImage) viewGroup.getChildAt(0);
        newPostSelectedTopicItemView.f44055i = (TextView) viewGroup.getChildAt(1);
        newPostSelectedTopicItemView.f44056j = (TextView) viewGroup.getChildAt(2);
        newPostSelectedTopicItemView.f44057k = (VImage) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m103593b(NewPostSelectedTopicItemView newPostSelectedTopicItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173515I1, viewGroup, false);
        m103592a(newPostSelectedTopicItemView, viewInflate);
        return viewInflate;
    }
}
