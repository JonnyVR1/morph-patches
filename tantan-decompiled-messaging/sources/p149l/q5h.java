package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendFrag;

/* JADX INFO: loaded from: classes12.dex */
public class q5h implements z5h {

    /* JADX INFO: renamed from: a */
    public String f152762a;

    public q5h(String str) {
        this.f152762a = str;
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: a */
    public Fragment mo95136a(@Nullable qpl qplVar) {
        return new FeedGroupFriendFrag();
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: b */
    public Bundle mo95137b() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f152762a);
        return bundle;
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: d */
    public boolean mo95138d() {
        return false;
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: e */
    public FeedGroupTab mo95139e() {
        return FeedGroupTab.GROUP_FRIEND;
    }

    @Override // p149l.z5h
    public String getTitle() {
        return "圈友";
    }
}
