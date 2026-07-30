package p153l;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fli0 implements ier {

    /* JADX INFO: renamed from: a */
    private final Set<cli0<?>> f99657a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public void m126140b() {
        this.f99657a.clear();
    }

    @Override // p153l.ier
    /* JADX INFO: renamed from: d */
    public void mo5633d() {
        Iterator it = ylk0.m216586j(this.f99657a).iterator();
        while (it.hasNext()) {
            ((cli0) it.next()).mo5633d();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public List<cli0<?>> m126141f() {
        return ylk0.m216586j(this.f99657a);
    }

    /* JADX INFO: renamed from: h */
    public void m126142h(@NonNull cli0<?> cli0Var) {
        this.f99657a.add(cli0Var);
    }

    /* JADX INFO: renamed from: m */
    public void m126143m(@NonNull cli0<?> cli0Var) {
        this.f99657a.remove(cli0Var);
    }

    @Override // p153l.ier
    public void onDestroy() {
        Iterator it = ylk0.m216586j(this.f99657a).iterator();
        while (it.hasNext()) {
            ((cli0) it.next()).onDestroy();
        }
    }

    @Override // p153l.ier
    public void onStart() {
        Iterator it = ylk0.m216586j(this.f99657a).iterator();
        while (it.hasNext()) {
            ((cli0) it.next()).onStart();
        }
    }
}
