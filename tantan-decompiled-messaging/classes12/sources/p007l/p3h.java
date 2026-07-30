package p007l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface p3h<T extends Fragment> {
    /* JADX INFO: renamed from: a */
    T mo12905a(@Nullable qpl qplVar);

    /* JADX INFO: renamed from: b */
    Bundle mo12906b();

    /* JADX INFO: renamed from: c */
    default Fragment m12907c() {
        Bundle bundleMo12906b = mo12906b();
        Fragment fragmentMo12905a = mo12905a(null);
        if (bundleMo12906b != null) {
            fragmentMo12905a.setArguments(bundleMo12906b);
        }
        return fragmentMo12905a;
    }

    String getTitle();
}
