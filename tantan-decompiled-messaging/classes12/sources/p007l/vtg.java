package p007l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vtg implements z5h {

    /* JADX INFO: renamed from: a */
    public String f14293a;

    /* JADX INFO: renamed from: b */
    public String f14294b;

    /* JADX INFO: renamed from: c */
    public String f14295c;

    public vtg(String str, String str2, String str3) {
        this.f14293a = str;
        this.f14294b = str3;
        this.f14295c = str2;
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: a */
    public Fragment mo8419a(@Nullable qpl qplVar) {
        return FeedModule.m1141M().b7();
    }

    @Override // p007l.z5h
    /* JADX INFO: renamed from: b */
    public Bundle mo8420b() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f14293a);
        bundle.putString("user_id", this.f14294b);
        bundle.putString("group_name", this.f14295c);
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
        return FeedGroupTab.GROUP_CHAT;
    }

    @Override // p007l.z5h
    public String getTitle() {
        return "群聊";
    }
}
