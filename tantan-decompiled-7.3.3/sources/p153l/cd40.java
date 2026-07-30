package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.NewPostSelectedTopicItemView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class cd40 {
    /* JADX INFO: renamed from: a */
    public static void m109122a(NewPostSelectedTopicItemView newPostSelectedTopicItemView, View view) {
        newPostSelectedTopicItemView.f44049c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPostSelectedTopicItemView.f44050d = (TextView) viewGroup.getChildAt(0);
        newPostSelectedTopicItemView.f44051e = (TextView) viewGroup.getChildAt(1);
        newPostSelectedTopicItemView.f44052f = (VImage) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m109123b(NewPostSelectedTopicItemView newPostSelectedTopicItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173521J1, viewGroup, false);
        m109122a(newPostSelectedTopicItemView, viewInflate);
        return viewInflate;
    }
}
