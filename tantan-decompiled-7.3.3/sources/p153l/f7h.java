package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendFrag;

/* JADX INFO: loaded from: classes13.dex */
public class f7h implements o7h {

    /* JADX INFO: renamed from: a */
    public String f97558a;

    public f7h(String str) {
        this.f97558a = str;
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: a */
    public Fragment mo108362a(@Nullable dsl dslVar) {
        return new FeedGroupFriendFrag();
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: b */
    public Bundle mo108363b() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f97558a);
        return bundle;
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: d */
    public boolean mo108364d() {
        return false;
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: e */
    public FeedGroupTab mo108365e() {
        return FeedGroupTab.GROUP_FRIEND;
    }

    @Override // p153l.o7h
    public String getTitle() {
        return "圈友";
    }
}
