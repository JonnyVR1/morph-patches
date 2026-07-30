package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.Nullable;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class div0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f86429a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final ViewGroup f86430b;

    /* JADX INFO: renamed from: c */
    public final Context f86431c;

    /* JADX INFO: renamed from: d */
    public final Set f86432d;

    public div0(rmw0 rmw0Var, @Nullable ViewGroup viewGroup, Context context, Set set) {
        this.f86429a = rmw0Var;
        this.f86432d = set;
        this.f86430b = viewGroup;
        this.f86431c = context;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eiv0 m111928a() throws Exception {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132078T5)).booleanValue() && this.f86430b != null && this.f86432d.contains("banner")) {
            return new eiv0(Boolean.valueOf(this.f86430b.isHardwareAccelerated()));
        }
        Boolean boolValueOf = null;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132090U5)).booleanValue() && this.f86432d.contains("native")) {
            Context context = this.f86431c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new eiv0(boolValueOf);
            }
        }
        return new eiv0(null);
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 22;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f86429a.mo122102R(new Callable() { // from class: l.civ0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f81116a.m111928a();
            }
        });
    }
}
