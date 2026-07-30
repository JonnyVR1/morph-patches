package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;

/* JADX INFO: loaded from: classes13.dex */
public interface o7h {
    /* JADX INFO: renamed from: a */
    Fragment mo108362a(@Nullable dsl dslVar);

    /* JADX INFO: renamed from: b */
    Bundle mo108363b();

    /* JADX INFO: renamed from: c */
    default Fragment m166337c() {
        Bundle bundleMo108363b = mo108363b();
        Fragment fragmentMo108362a = mo108362a(null);
        if (bundleMo108363b != null) {
            fragmentMo108362a.setArguments(bundleMo108363b);
        }
        return fragmentMo108362a;
    }

    /* JADX INFO: renamed from: d */
    boolean mo108364d();

    /* JADX INFO: renamed from: e */
    FeedGroupTab mo108365e();

    String getTitle();
}
