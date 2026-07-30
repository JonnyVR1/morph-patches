package com.bumptech.glide.manager;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C1058b;
import com.bumptech.glide.C1060d;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p153l.fer;
import p153l.hyk;
import p153l.krd0;
import p153l.l01;
import p153l.m2d0;
import p153l.o2d0;
import p153l.vn80;
import p153l.wg3;
import p153l.ylk0;

/* JADX INFO: renamed from: com.bumptech.glide.manager.m */
/* JADX INFO: loaded from: classes.dex */
public class C1128m implements Handler.Callback {

    /* JADX INFO: renamed from: j */
    private static final b f4672j = new a();

    /* JADX INFO: renamed from: a */
    private volatile m2d0 f4673a;

    /* JADX INFO: renamed from: d */
    private final Handler f4676d;

    /* JADX INFO: renamed from: e */
    private final b f4677e;

    /* JADX INFO: renamed from: i */
    private final InterfaceC1126k f4681i;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    final Map<FragmentManager, RequestManagerFragment> f4674b = new HashMap();

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> f4675c = new HashMap();

    /* JADX INFO: renamed from: f */
    private final l01<View, Fragment> f4678f = new l01<>();

    /* JADX INFO: renamed from: g */
    private final l01<View, android.app.Fragment> f4679g = new l01<>();

    /* JADX INFO: renamed from: h */
    private final Bundle f4680h = new Bundle();

    /* JADX INFO: renamed from: com.bumptech.glide.manager.m$a */
    public class a implements b {
        @Override // com.bumptech.glide.manager.C1128m.b
        @NonNull
        /* JADX INFO: renamed from: a */
        public m2d0 mo5659a(@NonNull ComponentCallbacks2C1057a componentCallbacks2C1057a, @NonNull fer ferVar, @NonNull o2d0 o2d0Var, @NonNull Context context) {
            return new m2d0(componentCallbacks2C1057a, ferVar, o2d0Var, context);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.m$b */
    public interface b {
        @NonNull
        /* JADX INFO: renamed from: a */
        m2d0 mo5659a(@NonNull ComponentCallbacks2C1057a componentCallbacks2C1057a, @NonNull fer ferVar, @NonNull o2d0 o2d0Var, @NonNull Context context);
    }

    public C1128m(@Nullable b bVar, C1060d c1060d) {
        this.f4677e = bVar == null ? f4672j : bVar;
        this.f4676d = new Handler(Looper.getMainLooper(), this);
        this.f4681i = m5636b(c1060d);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: a */
    private static void m5635a(@NonNull Activity activity) {
        if (activity.isDestroyed()) {
            wg3.m206174a("You cannot start a load for a destroyed activity");
        }
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC1126k m5636b(C1060d c1060d) {
        if (hyk.f112128h && hyk.f112127g) {
            return c1060d.m5351a(C1058b.e.class) ? new ComponentCallbacks2C1124i() : new C1125j();
        }
        return new C1122g();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    private static Activity m5637c(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m5637c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(26)
    @Deprecated
    /* JADX INFO: renamed from: d */
    private void m5638d(@NonNull FragmentManager fragmentManager, @NonNull l01<View, android.app.Fragment> l01Var) {
        if (Build.VERSION.SDK_INT < 26) {
            m5639e(fragmentManager, l01Var);
            return;
        }
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                l01Var.put(fragment.getView(), fragment);
                m5638d(fragment.getChildFragmentManager(), l01Var);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    private void m5639e(@NonNull FragmentManager fragmentManager, @NonNull l01<View, android.app.Fragment> l01Var) {
        android.app.Fragment fragment;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f4680h.putInt(Constants.KEY_KEY, i);
            try {
                fragment = fragmentManager.getFragment(this.f4680h, Constants.KEY_KEY);
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                l01Var.put(fragment.getView(), fragment);
                m5638d(fragment.getChildFragmentManager(), l01Var);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m5640f(@Nullable Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m5640f(fragment.getChildFragmentManager().m2590t0(), map);
            }
        }
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: g */
    private android.app.Fragment m5641g(@NonNull View view, @NonNull Activity activity) {
        this.f4679g.clear();
        m5638d(activity.getFragmentManager(), this.f4679g);
        View viewFindViewById = activity.findViewById(R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f4679g.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f4679g.clear();
        return fragment;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    private Fragment m5642h(@NonNull View view, @NonNull FragmentActivity fragmentActivity) {
        this.f4678f.clear();
        m5640f(fragmentActivity.getSupportFragmentManager().m2590t0(), this.f4678f);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f4678f.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f4678f.clear();
        return fragment;
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: i */
    private m2d0 m5643i(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        RequestManagerFragment requestManagerFragmentM5645r = m5645r(fragmentManager, fragment);
        m2d0 m2d0VarM5606e = requestManagerFragmentM5645r.m5606e();
        if (m2d0VarM5606e != null) {
            return m2d0VarM5606e;
        }
        m2d0 m2d0VarMo5659a = this.f4677e.mo5659a(ComponentCallbacks2C1057a.m5319c(context), requestManagerFragmentM5645r.m5605c(), requestManagerFragmentM5645r.m5607f(), context);
        if (z) {
            m2d0VarMo5659a.onStart();
        }
        requestManagerFragmentM5645r.m5609k(m2d0VarMo5659a);
        return m2d0VarMo5659a;
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    private m2d0 m5644p(@NonNull Context context) {
        if (this.f4673a == null) {
            synchronized (this) {
                try {
                    if (this.f4673a == null) {
                        this.f4673a = this.f4677e.mo5659a(ComponentCallbacks2C1057a.m5319c(context.getApplicationContext()), new C1117b(), new C1123h(), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f4673a;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    private RequestManagerFragment m5645r(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment) {
        RequestManagerFragment requestManagerFragment = this.f4674b.get(fragmentManager);
        if (requestManagerFragment != null) {
            return requestManagerFragment;
        }
        RequestManagerFragment requestManagerFragment2 = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment2 != null) {
            return requestManagerFragment2;
        }
        RequestManagerFragment requestManagerFragment3 = new RequestManagerFragment();
        requestManagerFragment3.m5608j(fragment);
        this.f4674b.put(fragmentManager, requestManagerFragment3);
        fragmentManager.beginTransaction().add(requestManagerFragment3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f4676d.obtainMessage(1, fragmentManager).sendToTarget();
        return requestManagerFragment3;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    private SupportRequestManagerFragment m5646t(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment) {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f4675c.get(fragmentManager);
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) fragmentManager.m2558i0("com.bumptech.glide.manager");
        if (supportRequestManagerFragment2 != null) {
            return supportRequestManagerFragment2;
        }
        SupportRequestManagerFragment supportRequestManagerFragment3 = new SupportRequestManagerFragment();
        supportRequestManagerFragment3.m5622f4(fragment);
        this.f4675c.put(fragmentManager, supportRequestManagerFragment3);
        fragmentManager.m2568m().m2807e(supportRequestManagerFragment3, "com.bumptech.glide.manager").mo2709j();
        this.f4676d.obtainMessage(2, fragmentManager).sendToTarget();
        return supportRequestManagerFragment3;
    }

    /* JADX INFO: renamed from: u */
    private static boolean m5647u(Context context) {
        Activity activityM5637c = m5637c(context);
        return activityM5637c == null || !activityM5637c.isFinishing();
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    private m2d0 m5648v(@NonNull Context context, @NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragmentM5646t = m5646t(fragmentManager, fragment);
        m2d0 m2d0VarM5620Z3 = supportRequestManagerFragmentM5646t.m5620Z3();
        if (m2d0VarM5620Z3 != null) {
            return m2d0VarM5620Z3;
        }
        m2d0 m2d0VarMo5659a = this.f4677e.mo5659a(ComponentCallbacks2C1057a.m5319c(context), supportRequestManagerFragmentM5646t.m5619X3(), supportRequestManagerFragmentM5646t.m5621a4(), context);
        if (z) {
            m2d0VarMo5659a.onStart();
        }
        supportRequestManagerFragmentM5646t.m5623g4(m2d0VarMo5659a);
        return m2d0VarMo5659a;
    }

    /* JADX INFO: renamed from: w */
    private boolean m5649w(FragmentManager fragmentManager, boolean z) {
        RequestManagerFragment requestManagerFragment = this.f4674b.get(fragmentManager);
        RequestManagerFragment requestManagerFragment2 = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment2 == requestManagerFragment) {
            return true;
        }
        if (requestManagerFragment2 != null && requestManagerFragment2.m5606e() != null) {
            krd0.m151025a("We've added two fragments with requests! Old: ", requestManagerFragment2, " New: ", requestManagerFragment);
            return false;
        }
        if (z || fragmentManager.isDestroyed()) {
            if (Log.isLoggable("RMRetriever", 5)) {
                fragmentManager.isDestroyed();
            }
            requestManagerFragment.m5605c().m5626c();
            return true;
        }
        FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(requestManagerFragment, "com.bumptech.glide.manager");
        if (requestManagerFragment2 != null) {
            fragmentTransactionAdd.remove(requestManagerFragment2);
        }
        fragmentTransactionAdd.commitAllowingStateLoss();
        this.f4676d.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
        Log.isLoggable("RMRetriever", 3);
        return false;
    }

    /* JADX INFO: renamed from: x */
    private boolean m5650x(androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f4675c.get(fragmentManager);
        SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) fragmentManager.m2558i0("com.bumptech.glide.manager");
        if (supportRequestManagerFragment2 == supportRequestManagerFragment) {
            return true;
        }
        if (supportRequestManagerFragment2 != null && supportRequestManagerFragment2.m5620Z3() != null) {
            krd0.m151025a("We've added two fragments with requests! Old: ", supportRequestManagerFragment2, " New: ", supportRequestManagerFragment);
            return false;
        }
        if (z || fragmentManager.m2497F0()) {
            if (fragmentManager.m2497F0()) {
                Log.isLoggable("RMRetriever", 5);
            } else if (Log.isLoggable("RMRetriever", 6)) {
                Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
            }
            supportRequestManagerFragment.m5619X3().m5626c();
            return true;
        }
        AbstractC0428k abstractC0428kM2807e = fragmentManager.m2568m().m2807e(supportRequestManagerFragment, "com.bumptech.glide.manager");
        if (supportRequestManagerFragment2 != null) {
            abstractC0428kM2807e.mo2716r(supportRequestManagerFragment2);
        }
        abstractC0428kM2807e.mo2711l();
        this.f4676d.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
        Log.isLoggable("RMRetriever", 3);
        return false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        androidx.fragment.app.FragmentManager fragmentManager;
        androidx.fragment.app.FragmentManager fragmentManager2;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = message.arg1 == 1;
        int i = message.what;
        Object objRemove = null;
        if (i != 1) {
            if (i != 2) {
                z = false;
            } else {
                androidx.fragment.app.FragmentManager fragmentManager3 = (androidx.fragment.app.FragmentManager) message.obj;
                if (m5650x(fragmentManager3, z3)) {
                    objRemove = this.f4675c.remove(fragmentManager3);
                    fragmentManager = fragmentManager3;
                    z2 = true;
                    fragmentManager2 = fragmentManager;
                }
                z2 = true;
                z = false;
            }
            fragmentManager2 = null;
        } else {
            FragmentManager fragmentManager4 = (FragmentManager) message.obj;
            if (m5649w(fragmentManager4, z3)) {
                objRemove = this.f4674b.remove(fragmentManager4);
                fragmentManager = fragmentManager4;
                z2 = true;
                fragmentManager2 = fragmentManager;
            }
            z2 = true;
            z = false;
            fragmentManager2 = null;
        }
        if (Log.isLoggable("RMRetriever", 5) && z && objRemove == null) {
            Objects.toString(fragmentManager2);
        }
        return z2;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public m2d0 m5651j(@NonNull Activity activity) {
        if (ylk0.m216594r()) {
            return m5653l(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return m5656o((FragmentActivity) activity);
        }
        m5635a(activity);
        this.f4681i.mo5634a(activity);
        return m5643i(activity, activity.getFragmentManager(), null, m5647u(activity));
    }

    @NonNull
    @TargetApi(17)
    @Deprecated
    /* JADX INFO: renamed from: k */
    public m2d0 m5652k(@NonNull android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            wg3.m206174a("You cannot start a load on a fragment before it is attached");
            return null;
        }
        if (ylk0.m216594r()) {
            return m5653l(fragment.getActivity().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f4681i.mo5634a(fragment.getActivity());
        }
        return m5643i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public m2d0 m5653l(@NonNull Context context) {
        if (context == null) {
            wg3.m206174a("You cannot start a load on a null Context");
            return null;
        }
        if (ylk0.m216595s() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m5656o((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return m5651j((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m5653l(contextWrapper.getBaseContext());
                }
            }
        }
        return m5644p(context);
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public m2d0 m5654m(@NonNull View view) {
        if (ylk0.m216594r()) {
            return m5653l(view.getContext().getApplicationContext());
        }
        vn80.m201944d(view);
        vn80.m201945e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM5637c = m5637c(view.getContext());
        if (activityM5637c == null) {
            return m5653l(view.getContext().getApplicationContext());
        }
        if (!(activityM5637c instanceof FragmentActivity)) {
            android.app.Fragment fragmentM5641g = m5641g(view, activityM5637c);
            return fragmentM5641g == null ? m5651j(activityM5637c) : m5652k(fragmentM5641g);
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityM5637c;
        Fragment fragmentM5642h = m5642h(view, fragmentActivity);
        return fragmentM5642h != null ? m5655n(fragmentM5642h) : m5656o(fragmentActivity);
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public m2d0 m5655n(@NonNull Fragment fragment) {
        vn80.m201945e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (ylk0.m216594r()) {
            return m5653l(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f4681i.mo5634a(fragment.getActivity());
        }
        return m5648v(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public m2d0 m5656o(@NonNull FragmentActivity fragmentActivity) {
        if (ylk0.m216594r()) {
            return m5653l(fragmentActivity.getApplicationContext());
        }
        m5635a(fragmentActivity);
        this.f4681i.mo5634a(fragmentActivity);
        return m5648v(fragmentActivity, fragmentActivity.getSupportFragmentManager(), null, m5647u(fragmentActivity));
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: q */
    public RequestManagerFragment m5657q(Activity activity) {
        return m5645r(activity.getFragmentManager(), null);
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public SupportRequestManagerFragment m5658s(androidx.fragment.app.FragmentManager fragmentManager) {
        return m5646t(fragmentManager, null);
    }
}
