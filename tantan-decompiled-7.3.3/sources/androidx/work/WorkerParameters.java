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
import p153l.ckq0;
import p153l.k1j;
import p153l.s4b0;
import p153l.zni0;

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
    public C0762a f3412d;

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
    public zni0 f3416h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public ckq0 f3417i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public s4b0 f3418j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public k1j f3419k;

    /* JADX INFO: renamed from: l */
    public int f3420l;

    /* JADX INFO: renamed from: androidx.work.WorkerParameters$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class C0762a {

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

        public C0762a() {
            List list = Collections.EMPTY_LIST;
            this.f3421a = list;
            this.f3422b = list;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@NonNull UUID uuid, @NonNull Data data, @NonNull Collection<String> collection, @NonNull C0762a c0762a, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @NonNull Executor executor, @NonNull CoroutineContext coroutineContext, @NonNull zni0 zni0Var, @NonNull ckq0 ckq0Var, @NonNull s4b0 s4b0Var, @NonNull k1j k1jVar) {
        this.f3409a = uuid;
        this.f3410b = data;
        this.f3411c = new HashSet(collection);
        this.f3412d = c0762a;
        this.f3413e = i;
        this.f3420l = i2;
        this.f3414f = executor;
        this.f3415g = coroutineContext;
        this.f3416h = zni0Var;
        this.f3417i = ckq0Var;
        this.f3418j = s4b0Var;
        this.f3419k = k1jVar;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public Executor m4361a() {
        return this.f3414f;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: b */
    public k1j m4362b() {
        return this.f3419k;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public UUID m4363c() {
        return this.f3409a;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public Data m4364d() {
        return this.f3410b;
    }

    @Nullable
    @RequiresApi(28)
    /* JADX INFO: renamed from: e */
    public Network m4365e() {
        return this.f3412d.f3423c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: f */
    public s4b0 m4366f() {
        return this.f3418j;
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: g */
    public int m4367g() {
        return this.f3413e;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public Set<String> m4368h() {
        return this.f3411c;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: i */
    public zni0 m4369i() {
        return this.f3416h;
    }

    @NonNull
    @RequiresApi(24)
    /* JADX INFO: renamed from: j */
    public List<String> m4370j() {
        return this.f3412d.f3421a;
    }

    @NonNull
    @RequiresApi(24)
    /* JADX INFO: renamed from: k */
    public List<Uri> m4371k() {
        return this.f3412d.f3422b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: l */
    public CoroutineContext m4372l() {
        return this.f3415g;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: m */
    public ckq0 m4373m() {
        return this.f3417i;
    }
}
