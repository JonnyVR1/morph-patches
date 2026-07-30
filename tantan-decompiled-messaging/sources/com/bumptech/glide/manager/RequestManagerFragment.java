package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p149l.juc0;
import p149l.luc0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RequestManagerFragment extends Fragment {

    /* JADX INFO: renamed from: a */
    private final C1099a f4634a;

    /* JADX INFO: renamed from: b */
    private final luc0 f4635b;

    /* JADX INFO: renamed from: c */
    private final Set<RequestManagerFragment> f4636c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private juc0 f4637d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private RequestManagerFragment f4638e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private Fragment f4639f;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.RequestManagerFragment$a */
    public class C1097a implements luc0 {
        public C1097a() {
        }

        @Override // p149l.luc0
        @NonNull
        /* JADX INFO: renamed from: a */
        public Set<juc0> mo5572a() {
            Set<RequestManagerFragment> setM5566b = RequestManagerFragment.this.m5566b();
            HashSet hashSet = new HashSet(setM5566b.size());
            for (RequestManagerFragment requestManagerFragment : setM5566b) {
                if (requestManagerFragment.m5568e() != null) {
                    hashSet.add(requestManagerFragment.m5568e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }

    @SuppressLint({"ValidFragment"})
    @VisibleForTesting
    public RequestManagerFragment(@NonNull C1099a c1099a) {
        this.f4635b = new C1097a();
        this.f4636c = new HashSet();
        this.f4634a = c1099a;
    }

    /* JADX INFO: renamed from: a */
    private void m5560a(RequestManagerFragment requestManagerFragment) {
        this.f4636c.add(requestManagerFragment);
    }

    @Nullable
    @TargetApi(17)
    /* JADX INFO: renamed from: d */
    private Fragment m5561d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f4639f;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: g */
    private boolean m5562g(@NonNull Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m5563h(@NonNull Activity activity) {
        m5565l();
        RequestManagerFragment requestManagerFragmentM5612p = ComponentCallbacks2C1053a.m5309c(activity).m5326k().m5612p(activity);
        this.f4638e = requestManagerFragmentM5612p;
        if (equals(requestManagerFragmentM5612p)) {
            return;
        }
        this.f4638e.m5560a(this);
    }

    /* JADX INFO: renamed from: i */
    private void m5564i(RequestManagerFragment requestManagerFragment) {
        this.f4636c.remove(requestManagerFragment);
    }

    /* JADX INFO: renamed from: l */
    private void m5565l() {
        RequestManagerFragment requestManagerFragment = this.f4638e;
        if (requestManagerFragment != null) {
            requestManagerFragment.m5564i(this);
            this.f4638e = null;
        }
    }

    @NonNull
    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public Set<RequestManagerFragment> m5566b() {
        if (equals(this.f4638e)) {
            return Collections.unmodifiableSet(this.f4636c);
        }
        if (this.f4638e == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        for (RequestManagerFragment requestManagerFragment : this.f4638e.m5566b()) {
            if (m5562g(requestManagerFragment.getParentFragment())) {
                hashSet.add(requestManagerFragment);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C1099a m5567c() {
        return this.f4634a;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public juc0 m5568e() {
        return this.f4637d;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public luc0 m5569f() {
        return this.f4635b;
    }

    /* JADX INFO: renamed from: j */
    public void m5570j(@Nullable Fragment fragment) {
        this.f4639f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m5563h(fragment.getActivity());
    }

    /* JADX INFO: renamed from: k */
    public void m5571k(@Nullable juc0 juc0Var) {
        this.f4637d = juc0Var;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m5563h(activity);
        } catch (IllegalStateException unused) {
            Log.isLoggable("RMFragment", 5);
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f4634a.m5588c();
        m5565l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m5565l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f4634a.m5589d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f4634a.m5590e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m5561d() + "}";
    }

    public RequestManagerFragment() {
        this(new C1099a());
    }
}
