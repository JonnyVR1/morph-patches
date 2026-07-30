package p153l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class w1e0 {

    /* JADX INFO: renamed from: a */
    public ViewGroup f186810a;

    /* JADX INFO: renamed from: b */
    public Runnable f186811b;

    @Nullable
    /* JADX INFO: renamed from: b */
    public static w1e0 m204439b(@NonNull ViewGroup viewGroup) {
        return (w1e0) viewGroup.getTag(gcc0.f103559d);
    }

    /* JADX INFO: renamed from: c */
    public static void m204440c(@NonNull ViewGroup viewGroup, @Nullable w1e0 w1e0Var) {
        viewGroup.setTag(gcc0.f103559d, w1e0Var);
    }

    /* JADX INFO: renamed from: a */
    public void m204441a() {
        Runnable runnable;
        if (m204439b(this.f186810a) != this || (runnable = this.f186811b) == null) {
            return;
        }
        runnable.run();
    }
}
