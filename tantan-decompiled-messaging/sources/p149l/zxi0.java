package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.topic.topicpost.TopicAddItemView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class zxi0 {
    /* JADX INFO: renamed from: a */
    public static void m220836a(TopicAddItemView topicAddItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicAddItemView.f43257a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        topicAddItemView.f43258b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        topicAddItemView.f43259c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        topicAddItemView.f43260d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        topicAddItemView.f43261e = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m220837b(TopicAddItemView topicAddItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142157a4, viewGroup, false);
        m220836a(topicAddItemView, viewInflate);
        return viewInflate;
    }
}
