package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.recommend.FeedGroupRecommendMomentFrag;

/* JADX INFO: loaded from: classes13.dex */
public class c8h implements o7h {

    /* JADX INFO: renamed from: a */
    public String f80213a;

    /* JADX INFO: renamed from: b */
    public String f80214b;

    /* JADX INFO: renamed from: c */
    public String f80215c;

    public c8h(String str, String str2, String str3) {
        this.f80213a = str;
        this.f80214b = str2;
        this.f80215c = str3;
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: a */
    public Fragment mo108362a(@Nullable dsl dslVar) {
        return new FeedGroupRecommendMomentFrag();
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: b */
    public Bundle mo108363b() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f80213a);
        bundle.putString("user_id", this.f80214b);
        bundle.putString("first_append_moment_id", this.f80215c);
        return bundle;
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: d */
    public boolean mo108364d() {
        return true;
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: e */
    public FeedGroupTab mo108365e() {
        return FeedGroupTab.GROUP_RECOMMEND;
    }

    @Override // p153l.o7h
    public String getTitle() {
        return "推荐";
    }
}
