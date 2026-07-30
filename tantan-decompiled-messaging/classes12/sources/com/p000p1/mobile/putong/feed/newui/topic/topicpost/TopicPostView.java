package com.p000p1.mobile.putong.feed.newui.topic.topicpost;

import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import java.util.ArrayList;
import l.e30;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicPostView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TopicAddItemView f4723a;

    /* JADX INFO: renamed from: b */
    public TopicAddItemView f4724b;

    /* JADX INFO: renamed from: c */
    public ArrayList<TopicMoment> f4725c;

    public void setOnAddLocationClickListener(View.OnClickListener onClickListener) {
        xdl0.E0(this.f4724b, onClickListener);
    }

    public void setOnDeleteIconClickListener(View.OnClickListener onClickListener) {
        this.f4723a.setRightIconClickListener(onClickListener);
    }

    public void setSelectedTopics(ArrayList<TopicMoment> arrayList) {
        this.f4725c = arrayList;
    }

    public void setTopicListItemClickListener(e30<TopicMoment> e30Var) {
        throw null;
    }
}
