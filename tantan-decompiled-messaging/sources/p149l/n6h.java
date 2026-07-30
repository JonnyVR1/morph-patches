package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.recommend.FeedGroupRecommendMomentFrag;

/* JADX INFO: loaded from: classes12.dex */
public class n6h implements z5h {

    /* JADX INFO: renamed from: a */
    public String f137402a;

    /* JADX INFO: renamed from: b */
    public String f137403b;

    /* JADX INFO: renamed from: c */
    public String f137404c;

    public n6h(String str, String str2, String str3) {
        this.f137402a = str;
        this.f137403b = str2;
        this.f137404c = str3;
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: a */
    public Fragment mo95136a(@Nullable qpl qplVar) {
        return new FeedGroupRecommendMomentFrag();
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: b */
    public Bundle mo95137b() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f137402a);
        bundle.putString("user_id", this.f137403b);
        bundle.putString("first_append_moment_id", this.f137404c);
        return bundle;
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: d */
    public boolean mo95138d() {
        return true;
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: e */
    public FeedGroupTab mo95139e() {
        return FeedGroupTab.GROUP_RECOMMEND;
    }

    @Override // p149l.z5h
    public String getTitle() {
        return "推荐";
    }
}
