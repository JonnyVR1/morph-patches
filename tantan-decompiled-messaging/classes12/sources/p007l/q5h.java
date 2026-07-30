package p007l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class q5h implements z5h {

    /* JADX INFO: renamed from: a */
    public String f12099a;

    public q5h(String str) {
        this.f12099a = str;
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: a */
    public Fragment mo8419a(@Nullable qpl qplVar) {
        return new FeedGroupFriendFrag();
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: b */
    public Bundle mo8420b() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f12099a);
        return bundle;
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: d */
    public boolean mo8421d() {
        return false;
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: e */
    public FeedGroupTab mo8422e() {
        return FeedGroupTab.GROUP_FRIEND;
    }

    @Override // p007l.z5h
    public String getTitle() {
        return "圈友";
    }
}
