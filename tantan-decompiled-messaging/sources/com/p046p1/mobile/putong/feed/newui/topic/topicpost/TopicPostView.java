package com.p046p1.mobile.putong.feed.newui.topic.topicpost;

import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import java.util.ArrayList;
import p149l.e30;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicPostView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TopicAddItemView f43262a;

    /* JADX INFO: renamed from: b */
    public TopicAddItemView f43263b;

    /* JADX INFO: renamed from: c */
    public ArrayList<TopicMoment> f43264c;

    public void setOnAddLocationClickListener(View.OnClickListener onClickListener) {
        xdl0.m208329E0(this.f43263b, onClickListener);
    }

    public void setOnDeleteIconClickListener(View.OnClickListener onClickListener) {
        this.f43262a.setRightIconClickListener(onClickListener);
    }

    public void setSelectedTopics(ArrayList<TopicMoment> arrayList) {
        this.f43264c = arrayList;
    }

    public void setTopicListItemClickListener(e30<TopicMoment> e30Var) {
        throw null;
    }
}
