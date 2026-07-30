package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;

/* JADX INFO: loaded from: classes12.dex */
public interface z5h {
    /* JADX INFO: renamed from: a */
    Fragment mo95136a(@Nullable qpl qplVar);

    /* JADX INFO: renamed from: b */
    Bundle mo95137b();

    /* JADX INFO: renamed from: c */
    default Fragment m217335c() {
        Bundle bundleMo95137b = mo95137b();
        Fragment fragmentMo95136a = mo95136a(null);
        if (bundleMo95137b != null) {
            fragmentMo95136a.setArguments(bundleMo95137b);
        }
        return fragmentMo95136a;
    }

    /* JADX INFO: renamed from: d */
    boolean mo95138d();

    /* JADX INFO: renamed from: e */
    FeedGroupTab mo95139e();

    String getTitle();
}
