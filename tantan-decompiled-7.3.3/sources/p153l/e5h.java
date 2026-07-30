package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes13.dex */
public interface e5h<T extends Fragment> {
    /* JADX INFO: renamed from: a */
    T mo119533a(@Nullable dsl dslVar);

    /* JADX INFO: renamed from: b */
    Bundle mo119534b();

    /* JADX INFO: renamed from: c */
    default Fragment m119535c() {
        Bundle bundleMo119534b = mo119534b();
        Fragment fragmentMo119533a = mo119533a(null);
        if (bundleMo119534b != null) {
            fragmentMo119533a.setArguments(bundleMo119534b);
        }
        return fragmentMo119533a;
    }

    String getTitle();
}
