package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import p153l.c60;
import p153l.ker;
import p153l.u50;
import p153l.w50;
import p153l.x50;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a */
    public Random f77a = new Random();

    /* JADX INFO: renamed from: b */
    public final Map<Integer, String> f78b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<String, Integer> f79c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map<String, C0053d> f80d = new HashMap();

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f81e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public final transient Map<String, C0052c<?>> f82f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Map<String, Object> f83g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Bundle f84h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$a */
    public class C0050a<I> extends c60<I> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f85a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f86b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ x50 f87c;

        public C0050a(String str, int i, x50 x50Var) {
            this.f85a = str;
            this.f86b = i;
            this.f87c = x50Var;
        }

        @Override // p153l.c60
        @NonNull
        /* JADX INFO: renamed from: a */
        public x50<I, ?> mo216a() {
            return this.f87c;
        }

        @Override // p153l.c60
        /* JADX INFO: renamed from: c */
        public void mo217c(I i, @Nullable u50 u50Var) {
            ActivityResultRegistry.this.f81e.add(this.f85a);
            ActivityResultRegistry.this.mo195f(this.f86b, this.f87c, i, u50Var);
        }

        @Override // p153l.c60
        /* JADX INFO: renamed from: d */
        public void mo218d() {
            ActivityResultRegistry.this.m215l(this.f85a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$b */
    public class C0051b<I> extends c60<I> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f89a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f90b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ x50 f91c;

        public C0051b(String str, int i, x50 x50Var) {
            this.f89a = str;
            this.f90b = i;
            this.f91c = x50Var;
        }

        @Override // p153l.c60
        @NonNull
        /* JADX INFO: renamed from: a */
        public x50<I, ?> mo216a() {
            return this.f91c;
        }

        @Override // p153l.c60
        /* JADX INFO: renamed from: c */
        public void mo217c(I i, @Nullable u50 u50Var) {
            ActivityResultRegistry.this.f81e.add(this.f89a);
            ActivityResultRegistry.this.mo195f(this.f90b, this.f91c, i, u50Var);
        }

        @Override // p153l.c60
        /* JADX INFO: renamed from: d */
        public void mo218d() {
            ActivityResultRegistry.this.m215l(this.f89a);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$c */
    public static class C0052c<O> {

        /* JADX INFO: renamed from: a */
        public final w50<O> f93a;

        /* JADX INFO: renamed from: b */
        public final x50<?, O> f94b;

        public C0052c(w50<O> w50Var, x50<?, O> x50Var) {
            this.f93a = w50Var;
            this.f94b = x50Var;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$d */
    public static class C0053d {

        /* JADX INFO: renamed from: a */
        public final Lifecycle f95a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<LifecycleEventObserver> f96b = new ArrayList<>();

        public C0053d(@NonNull Lifecycle lifecycle) {
            this.f95a = lifecycle;
        }

        /* JADX INFO: renamed from: a */
        public void m219a(@NonNull LifecycleEventObserver lifecycleEventObserver) {
            this.f95a.mo2967a(lifecycleEventObserver);
            this.f96b.add(lifecycleEventObserver);
        }

        /* JADX INFO: renamed from: b */
        public void m220b() {
            Iterator<LifecycleEventObserver> it = this.f96b.iterator();
            while (it.hasNext()) {
                this.f95a.mo2970d(it.next());
            }
            this.f96b.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m205a(int i, String str) {
        this.f78b.put(Integer.valueOf(i), str);
        this.f79c.put(str, Integer.valueOf(i));
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public final boolean m206b(int i, int i2, @Nullable Intent intent) {
        String str = this.f78b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f81e.remove(str);
        m208d(str, i2, intent, this.f82f.get(str));
        return true;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final <O> boolean m207c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        w50<?> w50Var;
        String str = this.f78b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f81e.remove(str);
        C0052c<?> c0052c = this.f82f.get(str);
        if (c0052c != null && (w50Var = c0052c.f93a) != null) {
            w50Var.mo2611a(o);
            return true;
        }
        this.f84h.remove(str);
        this.f83g.put(str, o);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final <O> void m208d(String str, int i, @Nullable Intent intent, @Nullable C0052c<O> c0052c) {
        w50<O> w50Var;
        if (c0052c != null && (w50Var = c0052c.f93a) != null) {
            w50Var.mo2611a(c0052c.f94b.mo2619c(i, intent));
        } else {
            this.f83g.remove(str);
            this.f84h.putParcelable(str, new ActivityResult(i, intent));
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m209e() {
        int iNextInt = this.f77a.nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            if (!this.f78b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            iNextInt = this.f77a.nextInt(2147418112);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: f */
    public abstract <I, O> void mo195f(int i, @NonNull x50<I, O> x50Var, @SuppressLint({"UnknownNullness"}) I i2, @Nullable u50 u50Var);

    /* JADX INFO: renamed from: g */
    public final void m210g(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            m205a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
        this.f81e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f77a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f84h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
    }

    /* JADX INFO: renamed from: h */
    public final void m211h(@NonNull Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f78b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f78b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f81e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f84h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f77a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: i */
    public final <I, O> c60<I> m212i(@NonNull String str, @NonNull x50<I, O> x50Var, @NonNull w50<O> w50Var) {
        int iM214k = m214k(str);
        this.f82f.put(str, new C0052c<>(w50Var, x50Var));
        if (this.f83g.containsKey(str)) {
            Object obj = this.f83g.get(str);
            this.f83g.remove(str);
            w50Var.mo2611a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f84h.getParcelable(str);
        if (activityResult != null) {
            this.f84h.remove(str);
            w50Var.mo2611a(x50Var.mo2619c(activityResult.m202b(), activityResult.m201a()));
        }
        return new C0051b(str, iM214k, x50Var);
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public final <I, O> c60<I> m213j(@NonNull final String str, @NonNull ker kerVar, @NonNull final x50<I, O> x50Var, @NonNull final w50<O> w50Var) {
        Lifecycle lifecycle = kerVar.getLifecycle();
        if (lifecycle.mo2968b().isAtLeast(Lifecycle.State.STARTED)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(kerVar);
            Lifecycle.State stateMo2968b = lifecycle.mo2968b();
            sb.append(" is attempting to register while current state is ");
            sb.append(stateMo2968b);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString());
        }
        int iM214k = m214k(str);
        C0053d c0053d = this.f80d.get(str);
        if (c0053d == null) {
            c0053d = new C0053d(lifecycle);
        }
        c0053d.m219a(new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull ker kerVar2, @NonNull Lifecycle.Event event) {
                if (!Lifecycle.Event.ON_START.equals(event)) {
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f82f.remove(str);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            ActivityResultRegistry.this.m215l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f82f.put(str, new C0052c<>(w50Var, x50Var));
                if (ActivityResultRegistry.this.f83g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f83g.get(str);
                    ActivityResultRegistry.this.f83g.remove(str);
                    w50Var.mo2611a(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f84h.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f84h.remove(str);
                    w50Var.mo2611a(x50Var.mo2619c(activityResult.m202b(), activityResult.m201a()));
                }
            }
        });
        this.f80d.put(str, c0053d);
        return new C0050a(str, iM214k, x50Var);
    }

    /* JADX INFO: renamed from: k */
    public final int m214k(String str) {
        Integer num = this.f79c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iM209e = m209e();
        m205a(iM209e, str);
        return iM209e;
    }

    @MainThread
    /* JADX INFO: renamed from: l */
    public final void m215l(@NonNull String str) {
        Integer numRemove;
        if (!this.f81e.contains(str) && (numRemove = this.f79c.remove(str)) != null) {
            this.f78b.remove(numRemove);
        }
        this.f82f.remove(str);
        if (this.f83g.containsKey(str)) {
            Objects.toString(this.f83g.get(str));
            this.f83g.remove(str);
        }
        if (this.f84h.containsKey(str)) {
            Objects.toString(this.f84h.getParcelable(str));
            this.f84h.remove(str);
        }
        C0053d c0053d = this.f80d.get(str);
        if (c0053d != null) {
            c0053d.m220b();
            this.f80d.remove(str);
        }
    }
}
