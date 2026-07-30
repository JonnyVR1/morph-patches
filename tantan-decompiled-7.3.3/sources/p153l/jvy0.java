package p153l;

import android.content.Context;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.C3386a;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class jvy0 {

    /* JADX INFO: renamed from: i */
    public static final zzai f122858i = zzai.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a */
    public final String f122859a;

    /* JADX INFO: renamed from: b */
    public final String f122860b;

    /* JADX INFO: renamed from: c */
    public final iuy0 f122861c;

    /* JADX INFO: renamed from: d */
    public final h4f0 f122862d;

    /* JADX INFO: renamed from: e */
    public final Task f122863e;

    /* JADX INFO: renamed from: f */
    public final Task f122864f;

    /* JADX INFO: renamed from: g */
    public final String f122865g;

    /* JADX INFO: renamed from: h */
    public final int f122866h;

    public jvy0(Context context, final h4f0 h4f0Var, iuy0 iuy0Var, String str) {
        new HashMap();
        new HashMap();
        this.f122859a = context.getPackageName();
        this.f122860b = tn5.m191875a(context);
        this.f122862d = h4f0Var;
        this.f122861c = iuy0Var;
        gwy0.m132707a();
        this.f122865g = str;
        this.f122863e = C3386a.m16929a().m16932b(new Callable() { // from class: l.evy0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f96062a.m147116a();
            }
        });
        C3386a c3386aM16929a = C3386a.m16929a();
        Objects.requireNonNull(h4f0Var);
        this.f122864f = c3386aM16929a.m16932b(new Callable() { // from class: l.gvy0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h4f0Var.m133571a();
            }
        });
        zzai zzaiVar = f122858i;
        this.f122866h = zzaiVar.containsKey(str) ? DynamiteModule.m12529c(context, (String) zzaiVar.get(str)) : -1;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String m147116a() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f122865g);
    }
}
