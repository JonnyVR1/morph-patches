package p007l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.recommend.FeedGroupRecommendMomentFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class n6h implements z5h {

    /* JADX INFO: renamed from: a */
    public String f10682a;

    /* JADX INFO: renamed from: b */
    public String f10683b;

    /* JADX INFO: renamed from: c */
    public String f10684c;

    public n6h(String str, String str2, String str3) {
        this.f10682a = str;
        this.f10683b = str2;
        this.f10684c = str3;
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: a */
    public Fragment mo8419a(@Nullable qpl qplVar) {
        return new FeedGroupRecommendMomentFrag();
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: b */
    public Bundle mo8420b() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f10682a);
        bundle.putString("user_id", this.f10683b);
        bundle.putString("first_append_moment_id", this.f10684c);
        return bundle;
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: d */
    public boolean mo8421d() {
        return true;
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: e */
    public FeedGroupTab mo8422e() {
        return FeedGroupTab.GROUP_RECOMMEND;
    }

    @Override // p007l.z5h
    public String getTitle() {
        return "推荐";
    }
}
