package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class j5j {
    /* JADX INFO: renamed from: a */
    public static Fragment m143526a(FragmentManager fragmentManager) {
        List<Fragment> listM2590t0 = fragmentManager.m2590t0();
        if (listM2590t0.isEmpty()) {
            return null;
        }
        for (int size = listM2590t0.size() - 1; size >= 0; size--) {
            Fragment fragment = listM2590t0.get(size);
            if (fragment != null && fragment.isAdded() && fragment.isVisible()) {
                Fragment fragmentM143526a = m143526a(fragment.getChildFragmentManager());
                return fragmentM143526a != null ? fragmentM143526a : fragment;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static Fragment m143527b(@NonNull FragmentActivity fragmentActivity) {
        return m143526a(fragmentActivity.getSupportFragmentManager());
    }
}
