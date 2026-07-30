package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class i26 {

    /* JADX INFO: renamed from: a */
    public final Set<tl50> f112583a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public volatile Context f112584b;

    /* JADX INFO: renamed from: a */
    public void m138169a(@NonNull tl50 tl50Var) {
        if (this.f112584b != null) {
            tl50Var.mo2470a(this.f112584b);
        }
        this.f112583a.add(tl50Var);
    }

    /* JADX INFO: renamed from: b */
    public void m138170b() {
        this.f112584b = null;
    }

    /* JADX INFO: renamed from: c */
    public void m138171c(@NonNull Context context) {
        this.f112584b = context;
        Iterator<tl50> it = this.f112583a.iterator();
        while (it.hasNext()) {
            it.next().mo2470a(context);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public Context m138172d() {
        return this.f112584b;
    }

    /* JADX INFO: renamed from: e */
    public void m138173e(@NonNull tl50 tl50Var) {
        this.f112583a.remove(tl50Var);
    }
}
