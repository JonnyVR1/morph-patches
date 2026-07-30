package p149l;

import android.content.Context;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.C3363a;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class dmy0 {

    /* JADX INFO: renamed from: i */
    public static final zzai f87009i = zzai.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a */
    public final String f87010a;

    /* JADX INFO: renamed from: b */
    public final String f87011b;

    /* JADX INFO: renamed from: c */
    public final cly0 f87012c;

    /* JADX INFO: renamed from: d */
    public final awe0 f87013d;

    /* JADX INFO: renamed from: e */
    public final Task f87014e;

    /* JADX INFO: renamed from: f */
    public final Task f87015f;

    /* JADX INFO: renamed from: g */
    public final String f87016g;

    /* JADX INFO: renamed from: h */
    public final int f87017h;

    public dmy0(Context context, final awe0 awe0Var, cly0 cly0Var, String str) {
        new HashMap();
        new HashMap();
        this.f87010a = context.getPackageName();
        this.f87011b = pm5.m170295a(context);
        this.f87013d = awe0Var;
        this.f87012c = cly0Var;
        any0.m97836a();
        this.f87016g = str;
        this.f87014e = C3363a.m16874a().m16877b(new Callable() { // from class: l.yly0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f198951a.m112577a();
            }
        });
        C3363a c3363aM16874a = C3363a.m16874a();
        Objects.requireNonNull(awe0Var);
        this.f87015f = c3363aM16874a.m16877b(new Callable() { // from class: l.amy0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return awe0Var.m99265a();
            }
        });
        zzai zzaiVar = f87009i;
        this.f87017h = zzaiVar.containsKey(str) ? DynamiteModule.m12475c(context, (String) zzaiVar.get(str)) : -1;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String m112577a() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f87016g);
    }
}
