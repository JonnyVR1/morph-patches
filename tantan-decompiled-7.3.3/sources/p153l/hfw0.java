package p153l;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfok;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hfw0 {
    /* JADX INFO: renamed from: a */
    public static hfw0 m134882a(ifw0 ifw0Var, jfw0 jfw0Var) {
        if (ffw0.m125428b()) {
            return new kfw0(ifw0Var, jfw0Var);
        }
        wtq0.m207906a("Method called before OM SDK activation");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo134883b(View view, zzfok zzfokVar, @Nullable String str);

    /* JADX INFO: renamed from: c */
    public abstract void mo134884c();

    /* JADX INFO: renamed from: d */
    public abstract void mo134885d(View view);

    /* JADX INFO: renamed from: e */
    public abstract void mo134886e();
}
