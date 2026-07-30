package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.topic.topicpost.TopicAddItemView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class d7j0 {
    /* JADX INFO: renamed from: a */
    public static void m114749a(TopicAddItemView topicAddItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicAddItemView.f44105a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicAddItemView.f44106b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        topicAddItemView.f44107c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        topicAddItemView.f44108d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        topicAddItemView.f44109e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m114750b(TopicAddItemView topicAddItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173626a4, viewGroup, false);
        m114749a(topicAddItemView, viewInflate);
        return viewInflate;
    }
}
