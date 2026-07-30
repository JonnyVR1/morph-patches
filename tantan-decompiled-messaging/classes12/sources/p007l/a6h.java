package p007l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.newest.FeedGroupNewestMomentFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class a6h implements z5h {

    /* JADX INFO: renamed from: a */
    public String f5592a;

    /* JADX INFO: renamed from: b */
    public String f5593b;

    public a6h(String str, String str2) {
        this.f5592a = str;
        this.f5593b = str2;
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: a */
    public Fragment mo8419a(@Nullable qpl qplVar) {
        return new FeedGroupNewestMomentFrag();
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: b */
    public Bundle mo8420b() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f5592a);
        bundle.putString("user_id", this.f5593b);
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
        return FeedGroupTab.GROUP_NEWEST;
    }

    @Override // p007l.z5h
    public String getTitle() {
        return "最新";
    }
}
