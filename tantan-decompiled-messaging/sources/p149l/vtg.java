package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;

/* JADX INFO: loaded from: classes12.dex */
public class vtg implements z5h {

    /* JADX INFO: renamed from: a */
    public String f182940a;

    /* JADX INFO: renamed from: b */
    public String f182941b;

    /* JADX INFO: renamed from: c */
    public String f182942c;

    public vtg(String str, String str2, String str3) {
        this.f182940a = str;
        this.f182941b = str3;
        this.f182942c = str2;
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: a */
    public Fragment mo95136a(@Nullable qpl qplVar) {
        return FeedModule.m60223M().mo67258b7();
    }

    @Override // p149l.z5h
    /* JADX INFO: renamed from: b */
    public Bundle mo95137b() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f182940a);
        bundle.putString("user_id", this.f182941b);
        bundle.putString("group_name", this.f182942c);
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
        return FeedGroupTab.GROUP_CHAT;
    }

    @Override // p149l.z5h
    public String getTitle() {
        return "群聊";
    }
}
