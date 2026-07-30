package p007l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface z5h {
    /* JADX INFO: renamed from: a */
    Fragment mo8419a(@Nullable qpl qplVar);

    /* JADX INFO: renamed from: b */
    Bundle mo8420b();

    /* JADX INFO: renamed from: c */
    default Fragment m17224c() {
        Bundle bundleMo8420b = mo8420b();
        Fragment fragmentMo8419a = mo8419a(null);
        if (bundleMo8420b != null) {
            fragmentMo8419a.setArguments(bundleMo8420b);
        }
        return fragmentMo8419a;
    }

    /* JADX INFO: renamed from: d */
    boolean mo8421d();

    /* JADX INFO: renamed from: e */
    FeedGroupTab mo8422e();

    String getTitle();
}
