package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import p149l.owa0;
import p149l.pyi;
import p149l.xaq0;
import p149l.zei0;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a */
    @NonNull
    public UUID f3409a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public Data f3410b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public Set<String> f3411c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public C0760a f3412d;

    /* JADX INFO: renamed from: e */
    public int f3413e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public Executor f3414f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public CoroutineContext f3415g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public zei0 f3416h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public xaq0 f3417i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public owa0 f3418j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public pyi f3419k;

    /* JADX INFO: renamed from: l */
    public int f3420l;

    /* JADX INFO: renamed from: androidx.work.WorkerParameters$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class C0760a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public List<String> f3421a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public List<Uri> f3422b;

        /* JADX INFO: renamed from: c */
        @Nullable
        @RequiresApi(28)
        public Network f3423c;

        public C0760a() {
            List list = Collections.EMPTY_LIST;
            this.f3421a = list;
            this.f3422b = list;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID uuid, @NonNull Data data, @NonNull Collection<String> collection, @NonNull C0760a c0760a, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @NonNull Executor executor, @NonNull CoroutineContext coroutineContext, @NonNull zei0 zei0Var, @NonNull xaq0 xaq0Var, @NonNull owa0 owa0Var, @NonNull pyi pyiVar) {
        this.f3409a = uuid;
        this.f3410b = data;
        this.f3411c = new HashSet(collection);
        this.f3412d = c0760a;
        this.f3413e = i;
        this.f3420l = i2;
        this.f3414f = executor;
        this.f3415g = coroutineContext;
        this.f3416h = zei0Var;
        this.f3417i = xaq0Var;
        this.f3418j = owa0Var;
        this.f3419k = pyiVar;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public Executor m4359a() {
        return this.f3414f;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: b */
    public pyi m4360b() {
        return this.f3419k;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public UUID m4361c() {
        return this.f3409a;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public Data m4362d() {
        return this.f3410b;
    }

    @Nullable
    @RequiresApi(28)
    /* JADX INFO: renamed from: e */
    public Network m4363e() {
        return this.f3412d.f3423c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: f */
    public owa0 m4364f() {
        return this.f3418j;
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: g */
    public int m4365g() {
        return this.f3413e;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public Set<String> m4366h() {
        return this.f3411c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: i */
    public zei0 m4367i() {
        return this.f3416h;
    }

    @NonNull
    @RequiresApi(24)
    /* JADX INFO: renamed from: j */
    public List<String> m4368j() {
        return this.f3412d.f3421a;
    }

    @NonNull
    @RequiresApi(24)
    /* JADX INFO: renamed from: k */
    public List<Uri> m4369k() {
        return this.f3412d.f3422b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: l */
    public CoroutineContext m4370l() {
        return this.f3415g;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: m */
    public xaq0 m4371m() {
        return this.f3417i;
    }
}
