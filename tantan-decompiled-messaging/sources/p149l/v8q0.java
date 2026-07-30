package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC0768h;
import androidx.work.ExistingWorkPolicy;
import androidx.work.InterfaceC0764d;
import androidx.work.OperationKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class v8q0 extends t8q0 {

    /* JADX INFO: renamed from: j */
    public static final String f180569j = txv.m190978i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a */
    public final s9q0 f180570a;

    /* JADX INFO: renamed from: b */
    public final String f180571b;

    /* JADX INFO: renamed from: c */
    public final ExistingWorkPolicy f180572c;

    /* JADX INFO: renamed from: d */
    public final List<? extends AbstractC0768h> f180573d;

    /* JADX INFO: renamed from: e */
    public final List<String> f180574e;

    /* JADX INFO: renamed from: f */
    public final List<String> f180575f;

    /* JADX INFO: renamed from: g */
    public final List<v8q0> f180576g;

    /* JADX INFO: renamed from: h */
    public boolean f180577h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0764d f180578i;

    public v8q0(@NonNull s9q0 s9q0Var, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends AbstractC0768h> list, @Nullable List<v8q0> list2) {
        this.f180570a = s9q0Var;
        this.f180571b = str;
        this.f180572c = existingWorkPolicy;
        this.f180573d = list;
        this.f180576g = list2;
        this.f180574e = new ArrayList(list.size());
        this.f180575f = new ArrayList();
        if (list2 != null) {
            Iterator<v8q0> it = list2.iterator();
            while (it.hasNext()) {
                this.f180575f.addAll(it.next().f180575f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (existingWorkPolicy == ExistingWorkPolicy.REPLACE && list.get(i).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                ig3.m135964a("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String strM4432b = list.get(i).m4432b();
            this.f180574e.add(strM4432b);
            this.f180575f.add(strM4432b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m197480a(v8q0 v8q0Var) {
        v8q0Var.getClass();
        h1f.m129025b(v8q0Var);
        return Unit.INSTANCE;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: j */
    public static boolean m197481j(@NonNull v8q0 v8q0Var, @NonNull Set<String> set) {
        set.addAll(v8q0Var.m197485d());
        Set<String> setM197482m = m197482m(v8q0Var);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setM197482m.contains(it.next())) {
                return true;
            }
        }
        List<v8q0> listM197487f = v8q0Var.m197487f();
        if (listM197487f != null && !listM197487f.isEmpty()) {
            Iterator<v8q0> it2 = listM197487f.iterator();
            while (it2.hasNext()) {
                if (m197481j(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(v8q0Var.m197485d());
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: m */
    public static Set<String> m197482m(@NonNull v8q0 v8q0Var) {
        HashSet hashSet = new HashSet();
        List<v8q0> listM197487f = v8q0Var.m197487f();
        if (listM197487f != null && !listM197487f.isEmpty()) {
            Iterator<v8q0> it = listM197487f.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().m197485d());
            }
        }
        return hashSet;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public InterfaceC0764d m197483b() {
        if (this.f180577h) {
            txv.m190976e().mo190986k(f180569j, "Already enqueued work ids (" + TextUtils.join(", ", this.f180574e) + ")");
        } else {
            this.f180578i = OperationKt.m4345d(this.f180570a.m182745n().getTracer(), "EnqueueRunnable_" + m197484c().name(), this.f180570a.m182752w().mo187638d(), new Function0() { // from class: l.u8q0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v8q0.m197480a(this.f175152a);
                }
            });
        }
        return this.f180578i;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public ExistingWorkPolicy m197484c() {
        return this.f180572c;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public List<String> m197485d() {
        return this.f180574e;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public String m197486e() {
        return this.f180571b;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public List<v8q0> m197487f() {
        return this.f180576g;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public List<? extends AbstractC0768h> m197488g() {
        return this.f180573d;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public s9q0 m197489h() {
        return this.f180570a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: i */
    public boolean m197490i() {
        return m197481j(this, new HashSet());
    }

    /* JADX INFO: renamed from: k */
    public boolean m197491k() {
        return this.f180577h;
    }

    /* JADX INFO: renamed from: l */
    public void m197492l() {
        this.f180577h = true;
    }

    public v8q0(@NonNull s9q0 s9q0Var, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends AbstractC0768h> list) {
        this(s9q0Var, str, existingWorkPolicy, list, null);
    }

    public v8q0(@NonNull s9q0 s9q0Var, @NonNull List<? extends AbstractC0768h> list) {
        this(s9q0Var, null, ExistingWorkPolicy.KEEP, list, null);
    }
}
