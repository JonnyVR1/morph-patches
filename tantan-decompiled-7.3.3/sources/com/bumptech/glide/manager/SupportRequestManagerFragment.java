package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p153l.m2d0;
import p153l.o2d0;

/* JADX INFO: loaded from: classes.dex */
public class SupportRequestManagerFragment extends Fragment {

    /* JADX INFO: renamed from: A */
    private final o2d0 f4660A;

    /* JADX INFO: renamed from: B */
    private final Set<SupportRequestManagerFragment> f4661B;

    /* JADX INFO: renamed from: C */
    @Nullable
    private SupportRequestManagerFragment f4662C;

    /* JADX INFO: renamed from: D */
    @Nullable
    private m2d0 f4663D;

    /* JADX INFO: renamed from: E */
    @Nullable
    private Fragment f4664E;

    /* JADX INFO: renamed from: z */
    private final C1116a f4665z;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.SupportRequestManagerFragment$a */
    public class C1115a implements o2d0 {
        public C1115a() {
        }

        @Override // p153l.o2d0
        @NonNull
        /* JADX INFO: renamed from: a */
        public Set<m2d0> mo5610a() {
            Set<SupportRequestManagerFragment> setM5618W3 = SupportRequestManagerFragment.this.m5618W3();
            HashSet hashSet = new HashSet(setM5618W3.size());
            for (SupportRequestManagerFragment supportRequestManagerFragment : setM5618W3) {
                if (supportRequestManagerFragment.m5620Z3() != null) {
                    hashSet.add(supportRequestManagerFragment.m5620Z3());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + "}";
        }
    }

    @SuppressLint({"ValidFragment"})
    @VisibleForTesting
    public SupportRequestManagerFragment(@NonNull C1116a c1116a) {
        this.f4660A = new C1115a();
        this.f4661B = new HashSet();
        this.f4665z = c1116a;
    }

    /* JADX INFO: renamed from: V3 */
    private void m5611V3(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f4661B.add(supportRequestManagerFragment);
    }

    @Nullable
    /* JADX INFO: renamed from: Y3 */
    private Fragment m5612Y3() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f4664E;
    }

    @Nullable
    /* JADX INFO: renamed from: b4 */
    private static FragmentManager m5613b4(@NonNull Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* JADX INFO: renamed from: c4 */
    private boolean m5614c4(@NonNull Fragment fragment) {
        Fragment fragmentM5612Y3 = m5612Y3();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(fragmentM5612Y3)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* JADX INFO: renamed from: d4 */
    private void m5615d4(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        m5617h4();
        SupportRequestManagerFragment supportRequestManagerFragmentM5658s = ComponentCallbacks2C1057a.m5319c(context).m5335k().m5658s(fragmentManager);
        this.f4662C = supportRequestManagerFragmentM5658s;
        if (equals(supportRequestManagerFragmentM5658s)) {
            return;
        }
        this.f4662C.m5611V3(this);
    }

    /* JADX INFO: renamed from: e4 */
    private void m5616e4(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f4661B.remove(supportRequestManagerFragment);
    }

    /* JADX INFO: renamed from: h4 */
    private void m5617h4() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f4662C;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.m5616e4(this);
            this.f4662C = null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: W3 */
    public Set<SupportRequestManagerFragment> m5618W3() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f4662C;
        if (supportRequestManagerFragment == null) {
            return Collections.EMPTY_SET;
        }
        if (equals(supportRequestManagerFragment)) {
            return Collections.unmodifiableSet(this.f4661B);
        }
        HashSet hashSet = new HashSet();
        for (SupportRequestManagerFragment supportRequestManagerFragment2 : this.f4662C.m5618W3()) {
            if (m5614c4(supportRequestManagerFragment2.m5612Y3())) {
                hashSet.add(supportRequestManagerFragment2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    /* JADX INFO: renamed from: X3 */
    public C1116a m5619X3() {
        return this.f4665z;
    }

    @Nullable
    /* JADX INFO: renamed from: Z3 */
    public m2d0 m5620Z3() {
        return this.f4663D;
    }

    @NonNull
    /* JADX INFO: renamed from: a4 */
    public o2d0 m5621a4() {
        return this.f4660A;
    }

    /* JADX INFO: renamed from: f4 */
    public void m5622f4(@Nullable Fragment fragment) {
        FragmentManager fragmentManagerM5613b4;
        this.f4664E = fragment;
        if (fragment == null || fragment.getContext() == null || (fragmentManagerM5613b4 = m5613b4(fragment)) == null) {
            return;
        }
        m5615d4(fragment.getContext(), fragmentManagerM5613b4);
    }

    /* JADX INFO: renamed from: g4 */
    public void m5623g4(@Nullable m2d0 m2d0Var) {
        this.f4663D = m2d0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager fragmentManagerM5613b4 = m5613b4(this);
        if (fragmentManagerM5613b4 == null) {
            Log.isLoggable("SupportRMFragment", 5);
            return;
        }
        try {
            m5615d4(getContext(), fragmentManagerM5613b4);
        } catch (IllegalStateException unused) {
            Log.isLoggable("SupportRMFragment", 5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f4665z.m5626c();
        m5617h4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f4664E = null;
        m5617h4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f4665z.m5627d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f4665z.m5628e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m5612Y3() + "}";
    }

    public SupportRequestManagerFragment() {
        this(new C1116a());
    }
}
