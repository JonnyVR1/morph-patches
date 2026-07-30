package p003l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o2j {
    /* JADX INFO: renamed from: a */
    public static Fragment m8387a(FragmentManager fragmentManager) {
        List listT0 = fragmentManager.t0();
        if (listT0.isEmpty()) {
            return null;
        }
        for (int size = listT0.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) listT0.get(size);
            if (fragment != null && fragment.isAdded() && fragment.isVisible()) {
                Fragment fragmentM8387a = m8387a(fragment.getChildFragmentManager());
                return fragmentM8387a != null ? fragmentM8387a : fragment;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static Fragment m8388b(@NonNull FragmentActivity fragmentActivity) {
        return m8387a(fragmentActivity.getSupportFragmentManager());
    }
}
