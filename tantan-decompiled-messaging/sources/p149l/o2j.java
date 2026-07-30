package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class o2j {
    /* JADX INFO: renamed from: a */
    public static Fragment m162298a(FragmentManager fragmentManager) {
        List<Fragment> listM2589t0 = fragmentManager.m2589t0();
        if (listM2589t0.isEmpty()) {
            return null;
        }
        for (int size = listM2589t0.size() - 1; size >= 0; size--) {
            Fragment fragment = listM2589t0.get(size);
            if (fragment != null && fragment.isAdded() && fragment.isVisible()) {
                Fragment fragmentM162298a = m162298a(fragment.getChildFragmentManager());
                return fragmentM162298a != null ? fragmentM162298a : fragment;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static Fragment m162299b(@NonNull FragmentActivity fragmentActivity) {
        return m162298a(fragmentActivity.getSupportFragmentManager());
    }
}
