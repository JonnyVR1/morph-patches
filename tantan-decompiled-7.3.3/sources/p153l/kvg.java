package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;

/* JADX INFO: loaded from: classes13.dex */
public class kvg implements o7h {

    /* JADX INFO: renamed from: a */
    public String f128960a;

    /* JADX INFO: renamed from: b */
    public String f128961b;

    /* JADX INFO: renamed from: c */
    public String f128962c;

    public kvg(String str, String str2, String str3) {
        this.f128960a = str;
        this.f128961b = str3;
        this.f128962c = str2;
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: a */
    public Fragment mo108362a(@Nullable dsl dslVar) {
        return FeedModule.m61407M().mo68441b7();
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: b */
    public Bundle mo108363b() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f128960a);
        bundle.putString("user_id", this.f128961b);
        bundle.putString("group_name", this.f128962c);
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
        return FeedGroupTab.GROUP_CHAT;
    }

    @Override // p153l.o7h
    public String getTitle() {
        return "群聊";
    }
}
