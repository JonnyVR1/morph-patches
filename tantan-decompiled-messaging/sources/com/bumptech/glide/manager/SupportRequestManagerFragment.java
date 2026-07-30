package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p149l.juc0;
import p149l.luc0;

/* JADX INFO: loaded from: classes.dex */
public class SupportRequestManagerFragment extends Fragment {

    /* JADX INFO: renamed from: A */
    private final luc0 f4641A;

    /* JADX INFO: renamed from: B */
    private final Set<SupportRequestManagerFragment> f4642B;

    /* JADX INFO: renamed from: C */
    @Nullable
    private SupportRequestManagerFragment f4643C;

    /* JADX INFO: renamed from: D */
    @Nullable
    private juc0 f4644D;

    /* JADX INFO: renamed from: E */
    @Nullable
    private Fragment f4645E;

    /* JADX INFO: renamed from: z */
    private final C1099a f4646z;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.SupportRequestManagerFragment$a */
    public class C1098a implements luc0 {
        public C1098a() {
        }

        @Override // p149l.luc0
        @NonNull
        /* JADX INFO: renamed from: a */
        public Set<juc0> mo5572a() {
            Set<SupportRequestManagerFragment> setM5580W3 = SupportRequestManagerFragment.this.m5580W3();
            HashSet hashSet = new HashSet(setM5580W3.size());
            for (SupportRequestManagerFragment supportRequestManagerFragment : setM5580W3) {
                if (supportRequestManagerFragment.m5582Z3() != null) {
                    hashSet.add(supportRequestManagerFragment.m5582Z3());
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
    public SupportRequestManagerFragment(@NonNull C1099a c1099a) {
        this.f4641A = new C1098a();
        this.f4642B = new HashSet();
        this.f4646z = c1099a;
    }

    /* JADX INFO: renamed from: V3 */
    private void m5573V3(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f4642B.add(supportRequestManagerFragment);
    }

    @Nullable
    /* JADX INFO: renamed from: Y3 */
    private Fragment m5574Y3() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f4645E;
    }

    @Nullable
    /* JADX INFO: renamed from: b4 */
    private static FragmentManager m5575b4(@NonNull Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* JADX INFO: renamed from: c4 */
    private boolean m5576c4(@NonNull Fragment fragment) {
        Fragment fragmentM5574Y3 = m5574Y3();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(fragmentM5574Y3)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* JADX INFO: renamed from: d4 */
    private void m5577d4(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        m5579h4();
        SupportRequestManagerFragment supportRequestManagerFragmentM5613r = ComponentCallbacks2C1053a.m5309c(context).m5326k().m5613r(context, fragmentManager);
        this.f4643C = supportRequestManagerFragmentM5613r;
        if (equals(supportRequestManagerFragmentM5613r)) {
            return;
        }
        this.f4643C.m5573V3(this);
    }

    /* JADX INFO: renamed from: e4 */
    private void m5578e4(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f4642B.remove(supportRequestManagerFragment);
    }

    /* JADX INFO: renamed from: h4 */
    private void m5579h4() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f4643C;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.m5578e4(this);
            this.f4643C = null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: W3 */
    public Set<SupportRequestManagerFragment> m5580W3() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f4643C;
        if (supportRequestManagerFragment == null) {
            return Collections.EMPTY_SET;
        }
        if (equals(supportRequestManagerFragment)) {
            return Collections.unmodifiableSet(this.f4642B);
        }
        HashSet hashSet = new HashSet();
        for (SupportRequestManagerFragment supportRequestManagerFragment2 : this.f4643C.m5580W3()) {
            if (m5576c4(supportRequestManagerFragment2.m5574Y3())) {
                hashSet.add(supportRequestManagerFragment2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    /* JADX INFO: renamed from: X3 */
    public C1099a m5581X3() {
        return this.f4646z;
    }

    @Nullable
    /* JADX INFO: renamed from: Z3 */
    public juc0 m5582Z3() {
        return this.f4644D;
    }

    @NonNull
    /* JADX INFO: renamed from: a4 */
    public luc0 m5583a4() {
        return this.f4641A;
    }

    /* JADX INFO: renamed from: f4 */
    public void m5584f4(@Nullable Fragment fragment) {
        FragmentManager fragmentManagerM5575b4;
        this.f4645E = fragment;
        if (fragment == null || fragment.getContext() == null || (fragmentManagerM5575b4 = m5575b4(fragment)) == null) {
            return;
        }
        m5577d4(fragment.getContext(), fragmentManagerM5575b4);
    }

    /* JADX INFO: renamed from: g4 */
    public void m5585g4(@Nullable juc0 juc0Var) {
        this.f4644D = juc0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager fragmentManagerM5575b4 = m5575b4(this);
        if (fragmentManagerM5575b4 == null) {
            Log.isLoggable("SupportRMFragment", 5);
            return;
        }
        try {
            m5577d4(getContext(), fragmentManagerM5575b4);
        } catch (IllegalStateException unused) {
            Log.isLoggable("SupportRMFragment", 5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f4646z.m5588c();
        m5579h4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f4645E = null;
        m5579h4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f4646z.m5589d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f4646z.m5590e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m5574Y3() + "}";
    }

    public SupportRequestManagerFragment() {
        this(new C1099a());
    }
}
