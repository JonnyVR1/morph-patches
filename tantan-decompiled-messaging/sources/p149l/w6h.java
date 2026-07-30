package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicFrag;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class w6h implements z5h {

    /* JADX INFO: renamed from: a */
    public List<TopicMoment> f184843a;

    public w6h(List<TopicMoment> list) {
        this.f184843a = list;
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: a */
    public Fragment mo95136a(@Nullable qpl qplVar) {
        FeedGroupTopicFrag feedGroupTopicFrag = new FeedGroupTopicFrag();
        feedGroupTopicFrag.m62044N4(this.f184843a);
        return feedGroupTopicFrag;
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: b */
    public Bundle mo95137b() {
        return null;
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: d */
    public boolean mo95138d() {
        return false;
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: e */
    public FeedGroupTab mo95139e() {
        return FeedGroupTab.GROUP_TOPIC;
    }

    @Override // p149l.z5h
    public String getTitle() {
        return "相关话题";
    }
}
