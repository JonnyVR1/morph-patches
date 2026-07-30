package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC0770h;
import androidx.work.ExistingWorkPolicy;
import androidx.work.InterfaceC0766d;
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
public class aiq0 extends yhq0 {

    /* JADX INFO: renamed from: j */
    public static final String f71561j = qzv.m178831i("WorkContinuationImpl");

    /* JADX INFO: renamed from: a */
    public final xiq0 f71562a;

    /* JADX INFO: renamed from: b */
    public final String f71563b;

    /* JADX INFO: renamed from: c */
    public final ExistingWorkPolicy f71564c;

    /* JADX INFO: renamed from: d */
    public final List<? extends AbstractC0770h> f71565d;

    /* JADX INFO: renamed from: e */
    public final List<String> f71566e;

    /* JADX INFO: renamed from: f */
    public final List<String> f71567f;

    /* JADX INFO: renamed from: g */
    public final List<aiq0> f71568g;

    /* JADX INFO: renamed from: h */
    public boolean f71569h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0766d f71570i;

    public aiq0(@NonNull xiq0 xiq0Var, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends AbstractC0770h> list, @Nullable List<aiq0> list2) {
        this.f71562a = xiq0Var;
        this.f71563b = str;
        this.f71564c = existingWorkPolicy;
        this.f71565d = list;
        this.f71568g = list2;
        this.f71566e = new ArrayList(list.size());
        this.f71567f = new ArrayList();
        if (list2 != null) {
            Iterator<aiq0> it = list2.iterator();
            while (it.hasNext()) {
                this.f71567f.addAll(it.next().f71567f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (existingWorkPolicy == ExistingWorkPolicy.REPLACE && list.get(i).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                wg3.m206174a("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String strM4434b = list.get(i).m4434b();
            this.f71566e.add(strM4434b);
            this.f71567f.add(strM4434b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m98012a(aiq0 aiq0Var) {
        aiq0Var.getClass();
        m2f.m156829b(aiq0Var);
        return Unit.INSTANCE;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: j */
    public static boolean m98013j(@NonNull aiq0 aiq0Var, @NonNull Set<String> set) {
        set.addAll(aiq0Var.m98017d());
        Set<String> setM98014m = m98014m(aiq0Var);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setM98014m.contains(it.next())) {
                return true;
            }
        }
        List<aiq0> listM98019f = aiq0Var.m98019f();
        if (listM98019f != null && !listM98019f.isEmpty()) {
            Iterator<aiq0> it2 = listM98019f.iterator();
            while (it2.hasNext()) {
                if (m98013j(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(aiq0Var.m98017d());
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: m */
    public static Set<String> m98014m(@NonNull aiq0 aiq0Var) {
        HashSet hashSet = new HashSet();
        List<aiq0> listM98019f = aiq0Var.m98019f();
        if (listM98019f != null && !listM98019f.isEmpty()) {
            Iterator<aiq0> it = listM98019f.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().m98017d());
            }
        }
        return hashSet;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public InterfaceC0766d m98015b() {
        if (this.f71569h) {
            qzv.m178829e().mo178839k(f71561j, "Already enqueued work ids (" + TextUtils.join(", ", this.f71566e) + ")");
        } else {
            this.f71570i = OperationKt.m4347d(this.f71562a.m211158n().getTracer(), "EnqueueRunnable_" + m98016c().name(), this.f71562a.m211165w().mo216346d(), new Function0() { // from class: l.zhq0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return aiq0.m98012a(this.f204444a);
                }
            });
        }
        return this.f71570i;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public ExistingWorkPolicy m98016c() {
        return this.f71564c;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public List<String> m98017d() {
        return this.f71566e;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public String m98018e() {
        return this.f71563b;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public List<aiq0> m98019f() {
        return this.f71568g;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public List<? extends AbstractC0770h> m98020g() {
        return this.f71565d;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public xiq0 m98021h() {
        return this.f71562a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: i */
    public boolean m98022i() {
        return m98013j(this, new HashSet());
    }

    /* JADX INFO: renamed from: k */
    public boolean m98023k() {
        return this.f71569h;
    }

    /* JADX INFO: renamed from: l */
    public void m98024l() {
        this.f71569h = true;
    }

    public aiq0(@NonNull xiq0 xiq0Var, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends AbstractC0770h> list) {
        this(xiq0Var, str, existingWorkPolicy, list, null);
    }

    public aiq0(@NonNull xiq0 xiq0Var, @NonNull List<? extends AbstractC0770h> list) {
        this(xiq0Var, null, ExistingWorkPolicy.KEEP, list, null);
    }
}
