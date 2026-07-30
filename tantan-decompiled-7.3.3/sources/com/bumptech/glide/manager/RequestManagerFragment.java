package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p153l.m2d0;
import p153l.o2d0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RequestManagerFragment extends Fragment {

    /* JADX INFO: renamed from: a */
    private final C1116a f4653a;

    /* JADX INFO: renamed from: b */
    private final o2d0 f4654b;

    /* JADX INFO: renamed from: c */
    private final Set<RequestManagerFragment> f4655c;

    /* JADX INFO: renamed from: d */
    @Nullable
    private m2d0 f4656d;

    /* JADX INFO: renamed from: e */
    @Nullable
    private RequestManagerFragment f4657e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private Fragment f4658f;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.RequestManagerFragment$a */
    public class C1113a implements o2d0 {
        public C1113a() {
        }

        @Override // p153l.o2d0
        @NonNull
        /* JADX INFO: renamed from: a */
        public Set<m2d0> mo5610a() {
            Set<RequestManagerFragment> setM5604b = RequestManagerFragment.this.m5604b();
            HashSet hashSet = new HashSet(setM5604b.size());
            for (RequestManagerFragment requestManagerFragment : setM5604b) {
                if (requestManagerFragment.m5606e() != null) {
                    hashSet.add(requestManagerFragment.m5606e());
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
    public RequestManagerFragment(@NonNull C1116a c1116a) {
        this.f4654b = new C1113a();
        this.f4655c = new HashSet();
        this.f4653a = c1116a;
    }

    /* JADX INFO: renamed from: a */
    private void m5598a(RequestManagerFragment requestManagerFragment) {
        this.f4655c.add(requestManagerFragment);
    }

    @Nullable
    @TargetApi(17)
    /* JADX INFO: renamed from: d */
    private Fragment m5599d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f4658f;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: g */
    private boolean m5600g(@NonNull Fragment fragment) {
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
    private void m5601h(@NonNull Activity activity) {
        m5603l();
        RequestManagerFragment requestManagerFragmentM5657q = ComponentCallbacks2C1057a.m5319c(activity).m5335k().m5657q(activity);
        this.f4657e = requestManagerFragmentM5657q;
        if (equals(requestManagerFragmentM5657q)) {
            return;
        }
        this.f4657e.m5598a(this);
    }

    /* JADX INFO: renamed from: i */
    private void m5602i(RequestManagerFragment requestManagerFragment) {
        this.f4655c.remove(requestManagerFragment);
    }

    /* JADX INFO: renamed from: l */
    private void m5603l() {
        RequestManagerFragment requestManagerFragment = this.f4657e;
        if (requestManagerFragment != null) {
            requestManagerFragment.m5602i(this);
            this.f4657e = null;
        }
    }

    @NonNull
    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public Set<RequestManagerFragment> m5604b() {
        if (equals(this.f4657e)) {
            return Collections.unmodifiableSet(this.f4655c);
        }
        if (this.f4657e == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        for (RequestManagerFragment requestManagerFragment : this.f4657e.m5604b()) {
            if (m5600g(requestManagerFragment.getParentFragment())) {
                hashSet.add(requestManagerFragment);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C1116a m5605c() {
        return this.f4653a;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public m2d0 m5606e() {
        return this.f4656d;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public o2d0 m5607f() {
        return this.f4654b;
    }

    /* JADX INFO: renamed from: j */
    public void m5608j(@Nullable Fragment fragment) {
        this.f4658f = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m5601h(fragment.getActivity());
    }

    /* JADX INFO: renamed from: k */
    public void m5609k(@Nullable m2d0 m2d0Var) {
        this.f4656d = m2d0Var;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m5601h(activity);
        } catch (IllegalStateException unused) {
            Log.isLoggable("RMFragment", 5);
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f4653a.m5626c();
        m5603l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m5603l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f4653a.m5627d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f4653a.m5628e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m5599d() + "}";
    }

    public RequestManagerFragment() {
        this(new C1116a());
    }
}
