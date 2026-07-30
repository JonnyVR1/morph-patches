package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.NewPostTopicItemView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class q440 {
    /* JADX INFO: renamed from: a */
    public static void m13383a(NewPostTopicItemView newPostTopicItemView, View view) {
        newPostTopicItemView.f4671a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPostTopicItemView.f4672b = (TextView) viewGroup.getChildAt(0);
        newPostTopicItemView.f4673c = viewGroup.getChildAt(1);
        newPostTopicItemView.f4674d = (TextView) viewGroup.getChildAt(2);
        newPostTopicItemView.f4675e = viewGroup.getChildAt(3);
        newPostTopicItemView.f4676f = (ImageView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m13384b(NewPostTopicItemView newPostTopicItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11078K2, viewGroup, false);
        m13383a(newPostTopicItemView, viewInflate);
        return viewInflate;
    }
}
