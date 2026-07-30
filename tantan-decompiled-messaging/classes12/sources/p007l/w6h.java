package p007l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicFrag;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w6h implements z5h {

    /* JADX INFO: renamed from: a */
    public List<TopicMoment> f14432a;

    public w6h(List<TopicMoment> list) {
        this.f14432a = list;
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: a */
    public Fragment mo8419a(@Nullable qpl qplVar) {
        FeedGroupTopicFrag feedGroupTopicFrag = new FeedGroupTopicFrag();
        feedGroupTopicFrag.m3025N4(this.f14432a);
        return feedGroupTopicFrag;
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: b */
    public Bundle mo8420b() {
        return null;
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: d */
    public boolean mo8421d() {
        return false;
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: e */
    public FeedGroupTab mo8422e() {
        return FeedGroupTab.GROUP_TOPIC;
    }

    @Override // p007l.z5h
    public String getTitle() {
        return "相关话题";
    }
}
