package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.newest.FeedGroupNewestMomentFrag;

/* JADX INFO: loaded from: classes12.dex */
public class a6h implements z5h {

    /* JADX INFO: renamed from: a */
    public String f67768a;

    /* JADX INFO: renamed from: b */
    public String f67769b;

    public a6h(String str, String str2) {
        this.f67768a = str;
        this.f67769b = str2;
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: a */
    public Fragment mo95136a(@Nullable qpl qplVar) {
        return new FeedGroupNewestMomentFrag();
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: b */
    public Bundle mo95137b() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f67768a);
        bundle.putString("user_id", this.f67769b);
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
        return FeedGroupTab.GROUP_NEWEST;
    }

    @Override // p149l.z5h
    public String getTitle() {
        return "最新";
    }
}
