package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.Nullable;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class jrv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f122412a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final ViewGroup f122413b;

    /* JADX INFO: renamed from: c */
    public final Context f122414c;

    /* JADX INFO: renamed from: d */
    public final Set f122415d;

    public jrv0(xvw0 xvw0Var, @Nullable ViewGroup viewGroup, Context context, Set set) {
        this.f122412a = xvw0Var;
        this.f122415d = set;
        this.f122413b = viewGroup;
        this.f122414c = context;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ krv0 m146821a() throws Exception {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168149T5)).booleanValue() && this.f122413b != null && this.f122415d.contains("banner")) {
            return new krv0(Boolean.valueOf(this.f122413b.isHardwareAccelerated()));
        }
        Boolean boolValueOf = null;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168161U5)).booleanValue() && this.f122415d.contains("native")) {
            Context context = this.f122414c;
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
                return new krv0(boolValueOf);
            }
        }
        return new krv0(null);
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 22;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f122412a.mo155969R(new Callable() { // from class: l.irv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f116605a.m146821a();
            }
        });
    }
}
