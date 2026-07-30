package p153l;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.C0482k;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C0679a;

/* JADX INFO: loaded from: classes.dex */
public class y5j implements ryd0 {

    /* JADX INFO: renamed from: a */
    public C0482k f197563a = null;

    /* JADX INFO: renamed from: b */
    public oyd0 f197564b = null;

    /* JADX INFO: renamed from: a */
    public void m214298a(@NonNull Lifecycle.Event event) {
        this.f197563a.m3029i(event);
    }

    /* JADX INFO: renamed from: b */
    public void m214299b() {
        if (this.f197563a == null) {
            this.f197563a = new C0482k(this);
            this.f197564b = oyd0.m169844a(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m214300c() {
        return this.f197563a != null;
    }

    /* JADX INFO: renamed from: d */
    public void m214301d(@Nullable Bundle bundle) {
        this.f197564b.m169846c(bundle);
    }

    /* JADX INFO: renamed from: e */
    public void m214302e(@NonNull Bundle bundle) {
        this.f197564b.m169847d(bundle);
    }

    /* JADX INFO: renamed from: f */
    public void m214303f(@NonNull Lifecycle.State state) {
        this.f197563a.m3034n(state);
    }

    @Override // p153l.ker
    @NonNull
    public Lifecycle getLifecycle() {
        m214299b();
        return this.f197563a;
    }

    @Override // p153l.ryd0
    @NonNull
    public C0679a getSavedStateRegistry() {
        return this.f197564b.getSavedStateRegistry();
    }
}
