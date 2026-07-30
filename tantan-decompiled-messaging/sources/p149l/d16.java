package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class d16 {

    /* JADX INFO: renamed from: a */
    public final Set<md50> f83241a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public volatile Context f83242b;

    /* JADX INFO: renamed from: a */
    public void m109596a(@NonNull md50 md50Var) {
        if (this.f83242b != null) {
            md50Var.mo2469a(this.f83242b);
        }
        this.f83241a.add(md50Var);
    }

    /* JADX INFO: renamed from: b */
    public void m109597b() {
        this.f83242b = null;
    }

    /* JADX INFO: renamed from: c */
    public void m109598c(@NonNull Context context) {
        this.f83242b = context;
        Iterator<md50> it = this.f83241a.iterator();
        while (it.hasNext()) {
            it.next().mo2469a(context);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public Context m109599d() {
        return this.f83242b;
    }

    /* JADX INFO: renamed from: e */
    public void m109600e(@NonNull md50 md50Var) {
        this.f83241a.remove(md50Var);
    }
}
