package com.bumptech.glide.manager;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p149l.e01;
import p149l.ecr;
import p149l.ig3;
import p149l.juc0;
import p149l.luc0;
import p149l.qf80;
import p149l.sck0;

/* JADX INFO: renamed from: com.bumptech.glide.manager.h */
/* JADX INFO: loaded from: classes.dex */
public class C1106h implements Handler.Callback {

    /* JADX INFO: renamed from: i */
    private static final b f4651i = new a();

    /* JADX INFO: renamed from: a */
    private volatile juc0 f4652a;

    /* JADX INFO: renamed from: d */
    private final Handler f4655d;

    /* JADX INFO: renamed from: e */
    private final b f4656e;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    final Map<FragmentManager, RequestManagerFragment> f4653b = new HashMap();

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> f4654c = new HashMap();

    /* JADX INFO: renamed from: f */
    private final e01<View, Fragment> f4657f = new e01<>();

    /* JADX INFO: renamed from: g */
    private final e01<View, android.app.Fragment> f4658g = new e01<>();

    /* JADX INFO: renamed from: h */
    private final Bundle f4659h = new Bundle();

    /* JADX INFO: renamed from: com.bumptech.glide.manager.h$a */
    public class a implements b {
        @Override // com.bumptech.glide.manager.C1106h.b
        @NonNull
        /* JADX INFO: renamed from: a */
        public juc0 mo5614a(@NonNull ComponentCallbacks2C1053a componentCallbacks2C1053a, @NonNull ecr ecrVar, @NonNull luc0 luc0Var, @NonNull Context context) {
            return new juc0(componentCallbacks2C1053a, ecrVar, luc0Var, context);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.h$b */
    public interface b {
        @NonNull
        /* JADX INFO: renamed from: a */
        juc0 mo5614a(@NonNull ComponentCallbacks2C1053a componentCallbacks2C1053a, @NonNull ecr ecrVar, @NonNull luc0 luc0Var, @NonNull Context context);
    }

    public C1106h(@Nullable b bVar) {
        this.f4656e = bVar == null ? f4651i : bVar;
        this.f4655d = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: a */
    private static void m5593a(@NonNull Activity activity) {
        if (activity.isDestroyed()) {
            ig3.m135964a("You cannot start a load for a destroyed activity");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    private static Activity m5594b(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m5594b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(26)
    @Deprecated
    /* JADX INFO: renamed from: c */
    private void m5595c(@NonNull FragmentManager fragmentManager, @NonNull e01<View, android.app.Fragment> e01Var) {
        if (Build.VERSION.SDK_INT < 26) {
            m5596d(fragmentManager, e01Var);
            return;
        }
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                e01Var.put(fragment.getView(), fragment);
                m5595c(fragment.getChildFragmentManager(), e01Var);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    private void m5596d(@NonNull FragmentManager fragmentManager, @NonNull e01<View, android.app.Fragment> e01Var) {
        android.app.Fragment fragment;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f4659h.putInt(Constants.KEY_KEY, i);
            try {
                fragment = fragmentManager.getFragment(this.f4659h, Constants.KEY_KEY);
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                e01Var.put(fragment.getView(), fragment);
                m5595c(fragment.getChildFragmentManager(), e01Var);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m5597e(@Nullable Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m5597e(fragment.getChildFragmentManager().m2589t0(), map);
            }
        }
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: f */
    private android.app.Fragment m5598f(@NonNull View view, @NonNull Activity activity) {
        this.f4658g.clear();
        m5595c(activity.getFragmentManager(), this.f4658g);
        View viewFindViewById = activity.findViewById(R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f4658g.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f4658g.clear();
        return fragment;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    private Fragment m5599g(@NonNull View view, @NonNull FragmentActivity fragmentActivity) {
        this.f4657f.clear();
        m5597e(fragmentActivity.getSupportFragmentManager().m2589t0(), this.f4657f);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f4657f.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f4657f.clear();
        return fragment;
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: h */
    private juc0 m5600h(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        RequestManagerFragment requestManagerFragmentM5602q = m5602q(fragmentManager, fragment, z);
        juc0 juc0VarM5568e = requestManagerFragmentM5602q.m5568e();
        if (juc0VarM5568e != null) {
            return juc0VarM5568e;
        }
        juc0 juc0VarMo5614a = this.f4656e.mo5614a(ComponentCallbacks2C1053a.m5309c(context), requestManagerFragmentM5602q.m5567c(), requestManagerFragmentM5602q.m5569f(), context);
        requestManagerFragmentM5602q.m5571k(juc0VarMo5614a);
        return juc0VarMo5614a;
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    private juc0 m5601o(@NonNull Context context) {
        if (this.f4652a == null) {
            synchronized (this) {
                try {
                    if (this.f4652a == null) {
                        this.f4652a = this.f4656e.mo5614a(ComponentCallbacks2C1053a.m5309c(context.getApplicationContext()), new C1100b(), new C1104f(), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f4652a;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    private RequestManagerFragment m5602q(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment == null && (requestManagerFragment = this.f4653b.get(fragmentManager)) == null) {
            requestManagerFragment = new RequestManagerFragment();
            requestManagerFragment.m5570j(fragment);
            if (z) {
                requestManagerFragment.m5567c().m5589d();
            }
            this.f4653b.put(fragmentManager, requestManagerFragment);
            fragmentManager.beginTransaction().add(requestManagerFragment, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f4655d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment;
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    private SupportRequestManagerFragment m5603s(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.m2557i0("com.bumptech.glide.manager");
        if (supportRequestManagerFragment == null && (supportRequestManagerFragment = this.f4654c.get(fragmentManager)) == null) {
            supportRequestManagerFragment = new SupportRequestManagerFragment();
            supportRequestManagerFragment.m5584f4(fragment);
            if (z) {
                supportRequestManagerFragment.m5581X3().m5589d();
            }
            this.f4654c.put(fragmentManager, supportRequestManagerFragment);
            fragmentManager.m2567m().m2806e(supportRequestManagerFragment, "com.bumptech.glide.manager").mo2708j();
            this.f4655d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment;
    }

    /* JADX INFO: renamed from: t */
    private static boolean m5604t(Context context) {
        Activity activityM5594b = m5594b(context);
        return activityM5594b == null || !activityM5594b.isFinishing();
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    private juc0 m5605u(@NonNull Context context, @NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragmentM5603s = m5603s(fragmentManager, fragment, z);
        juc0 juc0VarM5582Z3 = supportRequestManagerFragmentM5603s.m5582Z3();
        if (juc0VarM5582Z3 != null) {
            return juc0VarM5582Z3;
        }
        juc0 juc0VarMo5614a = this.f4656e.mo5614a(ComponentCallbacks2C1053a.m5309c(context), supportRequestManagerFragmentM5603s.m5581X3(), supportRequestManagerFragmentM5603s.m5583a4(), context);
        supportRequestManagerFragmentM5603s.m5585g4(juc0VarMo5614a);
        return juc0VarMo5614a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        ComponentCallbacks componentCallbacksRemove;
        int i = message.what;
        boolean z = true;
        if (i == 1) {
            obj = (FragmentManager) message.obj;
            componentCallbacksRemove = this.f4653b.remove(obj);
        } else if (i != 2) {
            componentCallbacksRemove = null;
            z = false;
            obj = null;
        } else {
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            componentCallbacksRemove = this.f4654c.remove(obj);
        }
        if (z && componentCallbacksRemove == null && Log.isLoggable("RMRetriever", 5)) {
            Objects.toString(obj);
        }
        return z;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public juc0 m5606i(@NonNull Activity activity) {
        if (sck0.m183416p()) {
            return m5608k(activity.getApplicationContext());
        }
        m5593a(activity);
        return m5600h(activity, activity.getFragmentManager(), null, m5604t(activity));
    }

    @NonNull
    @TargetApi(17)
    @Deprecated
    /* JADX INFO: renamed from: j */
    public juc0 m5607j(@NonNull android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            ig3.m135964a("You cannot start a load on a fragment before it is attached");
            return null;
        }
        if (sck0.m183416p()) {
            return m5608k(fragment.getActivity().getApplicationContext());
        }
        return m5600h(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public juc0 m5608k(@NonNull Context context) {
        if (context == null) {
            ig3.m135964a("You cannot start a load on a null Context");
            return null;
        }
        if (sck0.m183417q() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return m5611n((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return m5606i((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m5608k(contextWrapper.getBaseContext());
                }
            }
        }
        return m5601o(context);
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public juc0 m5609l(@NonNull View view) {
        if (sck0.m183416p()) {
            return m5608k(view.getContext().getApplicationContext());
        }
        qf80.m174276d(view);
        qf80.m174277e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM5594b = m5594b(view.getContext());
        if (activityM5594b == null) {
            return m5608k(view.getContext().getApplicationContext());
        }
        if (!(activityM5594b instanceof FragmentActivity)) {
            android.app.Fragment fragmentM5598f = m5598f(view, activityM5594b);
            return fragmentM5598f == null ? m5606i(activityM5594b) : m5607j(fragmentM5598f);
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityM5594b;
        Fragment fragmentM5599g = m5599g(view, fragmentActivity);
        return fragmentM5599g != null ? m5610m(fragmentM5599g) : m5611n(fragmentActivity);
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public juc0 m5610m(@NonNull Fragment fragment) {
        qf80.m174277e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (sck0.m183416p()) {
            return m5608k(fragment.getContext().getApplicationContext());
        }
        return m5605u(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public juc0 m5611n(@NonNull FragmentActivity fragmentActivity) {
        if (sck0.m183416p()) {
            return m5608k(fragmentActivity.getApplicationContext());
        }
        m5593a(fragmentActivity);
        return m5605u(fragmentActivity, fragmentActivity.getSupportFragmentManager(), null, m5604t(fragmentActivity));
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: p */
    public RequestManagerFragment m5612p(Activity activity) {
        return m5602q(activity.getFragmentManager(), null, m5604t(activity));
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public SupportRequestManagerFragment m5613r(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return m5603s(fragmentManager, null, m5604t(context));
    }
}
