package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicFrag;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class l8h implements o7h {

    /* JADX INFO: renamed from: a */
    public List<TopicMoment> f130462a;

    public l8h(List<TopicMoment> list) {
        this.f130462a = list;
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: a */
    public Fragment mo108362a(@Nullable dsl dslVar) {
        FeedGroupTopicFrag feedGroupTopicFrag = new FeedGroupTopicFrag();
        feedGroupTopicFrag.m63227N4(this.f130462a);
        return feedGroupTopicFrag;
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: b */
    public Bundle mo108363b() {
        return null;
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: d */
    public boolean mo108364d() {
        return false;
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: e */
    public FeedGroupTab mo108365e() {
        return FeedGroupTab.GROUP_TOPIC;
    }

    @Override // p153l.o7h
    public String getTitle() {
        return "相关话题";
    }
}
