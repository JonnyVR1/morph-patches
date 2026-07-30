package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.TopicOfficialItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class i0j0 {
    /* JADX INFO: renamed from: a */
    public static void m133887a(TopicOfficialItemView topicOfficialItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicOfficialItemView.f43232a = (VText) viewGroup.getChildAt(0);
        topicOfficialItemView.f43233b = (VDraweeView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m133888b(TopicOfficialItemView topicOfficialItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142000A5, viewGroup, false);
        m133887a(topicOfficialItemView, viewInflate);
        return viewInflate;
    }
}
