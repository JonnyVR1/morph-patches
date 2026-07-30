package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes12.dex */
public interface p3h<T extends Fragment> {
    /* JADX INFO: renamed from: a */
    T mo167246a(@Nullable qpl qplVar);

    /* JADX INFO: renamed from: b */
    Bundle mo167247b();

    /* JADX INFO: renamed from: c */
    default Fragment m167248c() {
        Bundle bundleMo167247b = mo167247b();
        Fragment fragmentMo167246a = mo167246a(null);
        if (bundleMo167247b != null) {
            fragmentMo167246a.setArguments(bundleMo167247b);
        }
        return fragmentMo167246a;
    }

    String getTitle();
}
