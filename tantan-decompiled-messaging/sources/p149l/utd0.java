package p149l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class utd0 {

    /* JADX INFO: renamed from: a */
    public ViewGroup f178255a;

    /* JADX INFO: renamed from: b */
    public Runnable f178256b;

    @Nullable
    /* JADX INFO: renamed from: b */
    public static utd0 m195301b(@NonNull ViewGroup viewGroup) {
        return (utd0) viewGroup.getTag(a4c0.f67495d);
    }

    /* JADX INFO: renamed from: c */
    public static void m195302c(@NonNull ViewGroup viewGroup, @Nullable utd0 utd0Var) {
        viewGroup.setTag(a4c0.f67495d, utd0Var);
    }

    /* JADX INFO: renamed from: a */
    public void m195303a() {
        Runnable runnable;
        if (m195301b(this.f178255a) != this || (runnable = this.f178256b) == null) {
            return;
        }
        runnable.run();
    }
}
