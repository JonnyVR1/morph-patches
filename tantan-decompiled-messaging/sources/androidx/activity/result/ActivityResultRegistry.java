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
import p149l.a60;
import p149l.b60;
import p149l.g60;
import p149l.jcr;
import p149l.y50;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a */
    public Random f77a = new Random();

    /* JADX INFO: renamed from: b */
    public final Map<Integer, String> f78b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<String, Integer> f79c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map<String, C0052d> f80d = new HashMap();

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f81e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public final transient Map<String, C0051c<?>> f82f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Map<String, Object> f83g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Bundle f84h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$a */
    public class C0049a<I> extends g60<I> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f85a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f86b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ b60 f87c;

        public C0049a(String str, int i, b60 b60Var) {
            this.f85a = str;
            this.f86b = i;
            this.f87c = b60Var;
        }

        @Override // p149l.g60
        @NonNull
        /* JADX INFO: renamed from: a */
        public b60<I, ?> mo215a() {
            return this.f87c;
        }

        @Override // p149l.g60
        /* JADX INFO: renamed from: c */
        public void mo216c(I i, @Nullable y50 y50Var) {
            ActivityResultRegistry.this.f81e.add(this.f85a);
            ActivityResultRegistry.this.mo194f(this.f86b, this.f87c, i, y50Var);
        }

        @Override // p149l.g60
        /* JADX INFO: renamed from: d */
        public void mo217d() {
            ActivityResultRegistry.this.m214l(this.f85a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$b */
    public class C0050b<I> extends g60<I> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f89a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f90b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ b60 f91c;

        public C0050b(String str, int i, b60 b60Var) {
            this.f89a = str;
            this.f90b = i;
            this.f91c = b60Var;
        }

        @Override // p149l.g60
        @NonNull
        /* JADX INFO: renamed from: a */
        public b60<I, ?> mo215a() {
            return this.f91c;
        }

        @Override // p149l.g60
        /* JADX INFO: renamed from: c */
        public void mo216c(I i, @Nullable y50 y50Var) {
            ActivityResultRegistry.this.f81e.add(this.f89a);
            ActivityResultRegistry.this.mo194f(this.f90b, this.f91c, i, y50Var);
        }

        @Override // p149l.g60
        /* JADX INFO: renamed from: d */
        public void mo217d() {
            ActivityResultRegistry.this.m214l(this.f89a);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$c */
    public static class C0051c<O> {

        /* JADX INFO: renamed from: a */
        public final a60<O> f93a;

        /* JADX INFO: renamed from: b */
        public final b60<?, O> f94b;

        public C0051c(a60<O> a60Var, b60<?, O> b60Var) {
            this.f93a = a60Var;
            this.f94b = b60Var;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$d */
    public static class C0052d {

        /* JADX INFO: renamed from: a */
        public final Lifecycle f95a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<LifecycleEventObserver> f96b = new ArrayList<>();

        public C0052d(@NonNull Lifecycle lifecycle) {
            this.f95a = lifecycle;
        }

        /* JADX INFO: renamed from: a */
        public void m218a(@NonNull LifecycleEventObserver lifecycleEventObserver) {
            this.f95a.mo2966a(lifecycleEventObserver);
            this.f96b.add(lifecycleEventObserver);
        }

        /* JADX INFO: renamed from: b */
        public void m219b() {
            Iterator<LifecycleEventObserver> it = this.f96b.iterator();
            while (it.hasNext()) {
                this.f95a.mo2969d(it.next());
            }
            this.f96b.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m204a(int i, String str) {
        this.f78b.put(Integer.valueOf(i), str);
        this.f79c.put(str, Integer.valueOf(i));
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public final boolean m205b(int i, int i2, @Nullable Intent intent) {
        String str = this.f78b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f81e.remove(str);
        m207d(str, i2, intent, this.f82f.get(str));
        return true;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final <O> boolean m206c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        a60<?> a60Var;
        String str = this.f78b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f81e.remove(str);
        C0051c<?> c0051c = this.f82f.get(str);
        if (c0051c != null && (a60Var = c0051c.f93a) != null) {
            a60Var.mo2610a(o);
            return true;
        }
        this.f84h.remove(str);
        this.f83g.put(str, o);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final <O> void m207d(String str, int i, @Nullable Intent intent, @Nullable C0051c<O> c0051c) {
        a60<O> a60Var;
        if (c0051c != null && (a60Var = c0051c.f93a) != null) {
            a60Var.mo2610a(c0051c.f94b.mo2618c(i, intent));
        } else {
            this.f83g.remove(str);
            this.f84h.putParcelable(str, new ActivityResult(i, intent));
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m208e() {
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
    public abstract <I, O> void mo194f(int i, @NonNull b60<I, O> b60Var, @SuppressLint({"UnknownNullness"}) I i2, @Nullable y50 y50Var);

    /* JADX INFO: renamed from: g */
    public final void m209g(@Nullable Bundle bundle) {
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
            m204a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
        this.f81e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f77a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f84h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
    }

    /* JADX INFO: renamed from: h */
    public final void m210h(@NonNull Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f78b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f78b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f81e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f84h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f77a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: i */
    public final <I, O> g60<I> m211i(@NonNull String str, @NonNull b60<I, O> b60Var, @NonNull a60<O> a60Var) {
        int iM213k = m213k(str);
        this.f82f.put(str, new C0051c<>(a60Var, b60Var));
        if (this.f83g.containsKey(str)) {
            Object obj = this.f83g.get(str);
            this.f83g.remove(str);
            a60Var.mo2610a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f84h.getParcelable(str);
        if (activityResult != null) {
            this.f84h.remove(str);
            a60Var.mo2610a(b60Var.mo2618c(activityResult.m201b(), activityResult.m200a()));
        }
        return new C0050b(str, iM213k, b60Var);
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public final <I, O> g60<I> m212j(@NonNull final String str, @NonNull jcr jcrVar, @NonNull final b60<I, O> b60Var, @NonNull final a60<O> a60Var) {
        Lifecycle lifecycle = jcrVar.getLifecycle();
        if (lifecycle.mo2967b().isAtLeast(Lifecycle.State.STARTED)) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(jcrVar);
            Lifecycle.State stateMo2967b = lifecycle.mo2967b();
            sb.append(" is attempting to register while current state is ");
            sb.append(stateMo2967b);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString());
        }
        int iM213k = m213k(str);
        C0052d c0052d = this.f80d.get(str);
        if (c0052d == null) {
            c0052d = new C0052d(lifecycle);
        }
        c0052d.m218a(new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull jcr jcrVar2, @NonNull Lifecycle.Event event) {
                if (!Lifecycle.Event.ON_START.equals(event)) {
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f82f.remove(str);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            ActivityResultRegistry.this.m214l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f82f.put(str, new C0051c<>(a60Var, b60Var));
                if (ActivityResultRegistry.this.f83g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f83g.get(str);
                    ActivityResultRegistry.this.f83g.remove(str);
                    a60Var.mo2610a(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f84h.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f84h.remove(str);
                    a60Var.mo2610a(b60Var.mo2618c(activityResult.m201b(), activityResult.m200a()));
                }
            }
        });
        this.f80d.put(str, c0052d);
        return new C0049a(str, iM213k, b60Var);
    }

    /* JADX INFO: renamed from: k */
    public final int m213k(String str) {
        Integer num = this.f79c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iM208e = m208e();
        m204a(iM208e, str);
        return iM208e;
    }

    @MainThread
    /* JADX INFO: renamed from: l */
    public final void m214l(@NonNull String str) {
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
        C0052d c0052d = this.f80d.get(str);
        if (c0052d != null) {
            c0052d.m219b();
            this.f80d.remove(str);
        }
    }
}
