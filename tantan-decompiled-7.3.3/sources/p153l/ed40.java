package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.NewPostTopicItemView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ed40 {
    /* JADX INFO: renamed from: a */
    public static void m120421a(NewPostTopicItemView newPostTopicItemView, View view) {
        newPostTopicItemView.f44058a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPostTopicItemView.f44059b = (TextView) viewGroup.getChildAt(0);
        newPostTopicItemView.f44060c = (VText) viewGroup.getChildAt(1);
        newPostTopicItemView.f44061d = (TextView) viewGroup.getChildAt(2);
        newPostTopicItemView.f44062e = viewGroup.getChildAt(3);
        newPostTopicItemView.f44063f = (ImageView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m120422b(NewPostTopicItemView newPostTopicItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173528K2, viewGroup, false);
        m120421a(newPostTopicItemView, viewInflate);
        return viewInflate;
    }
}
