package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.newest.FeedGroupNewestMomentFrag;

/* JADX INFO: loaded from: classes13.dex */
public class p7h implements o7h {

    /* JADX INFO: renamed from: a */
    public String f150937a;

    /* JADX INFO: renamed from: b */
    public String f150938b;

    public p7h(String str, String str2) {
        this.f150937a = str;
        this.f150938b = str2;
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: a */
    public Fragment mo108362a(@Nullable dsl dslVar) {
        return new FeedGroupNewestMomentFrag();
    }

    @Override // p153l.o7h
    /* JADX INFO: renamed from: b */
    public Bundle mo108363b() {
        Bundle bundle = new Bundle();
        bundle.putString("groupId", this.f150937a);
        bundle.putString("user_id", this.f150938b);
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
        return FeedGroupTab.GROUP_NEWEST;
    }

    @Override // p153l.o7h
    public String getTitle() {
        return "最新";
    }
}
