package com.p051p1.mobile.putong.feed.newui.topic.topicpost;

import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import java.util.ArrayList;
import p153l.bnl0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class TopicPostView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TopicAddItemView f44110a;

    /* JADX INFO: renamed from: b */
    public TopicAddItemView f44111b;

    /* JADX INFO: renamed from: c */
    public ArrayList<TopicMoment> f44112c;

    public void setOnAddLocationClickListener(View.OnClickListener onClickListener) {
        bnl0.m105509E0(this.f44111b, onClickListener);
    }

    public void setOnDeleteIconClickListener(View.OnClickListener onClickListener) {
        this.f44110a.setRightIconClickListener(onClickListener);
    }

    public void setSelectedTopics(ArrayList<TopicMoment> arrayList) {
        this.f44112c = arrayList;
    }

    public void setTopicListItemClickListener(y20<TopicMoment> y20Var) {
        throw null;
    }
}
