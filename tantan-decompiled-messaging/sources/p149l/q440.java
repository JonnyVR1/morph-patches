package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.NewPostTopicItemView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class q440 {
    /* JADX INFO: renamed from: a */
    public static void m172923a(NewPostTopicItemView newPostTopicItemView, View view) {
        newPostTopicItemView.f43210a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newPostTopicItemView.f43211b = (TextView) viewGroup.getChildAt(0);
        newPostTopicItemView.f43212c = (VText) viewGroup.getChildAt(1);
        newPostTopicItemView.f43213d = (TextView) viewGroup.getChildAt(2);
        newPostTopicItemView.f43214e = viewGroup.getChildAt(3);
        newPostTopicItemView.f43215f = (ImageView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m172924b(NewPostTopicItemView newPostTopicItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142059K2, viewGroup, false);
        m172923a(newPostTopicItemView, viewInflate);
        return viewInflate;
    }
}
