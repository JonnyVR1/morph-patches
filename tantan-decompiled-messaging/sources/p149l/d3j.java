package p149l;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.C0481k;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C0677a;

/* JADX INFO: loaded from: classes.dex */
public class d3j implements pqd0 {

    /* JADX INFO: renamed from: a */
    public C0481k f84229a = null;

    /* JADX INFO: renamed from: b */
    public mqd0 f84230b = null;

    /* JADX INFO: renamed from: a */
    public void m109925a(@NonNull Lifecycle.Event event) {
        this.f84229a.m3028i(event);
    }

    /* JADX INFO: renamed from: b */
    public void m109926b() {
        if (this.f84229a == null) {
            this.f84229a = new C0481k(this);
            this.f84230b = mqd0.m155882a(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m109927c() {
        return this.f84229a != null;
    }

    /* JADX INFO: renamed from: d */
    public void m109928d(@Nullable Bundle bundle) {
        this.f84230b.m155884c(bundle);
    }

    /* JADX INFO: renamed from: e */
    public void m109929e(@NonNull Bundle bundle) {
        this.f84230b.m155885d(bundle);
    }

    /* JADX INFO: renamed from: f */
    public void m109930f(@NonNull Lifecycle.State state) {
        this.f84229a.m3033n(state);
    }

    @Override // p149l.jcr
    @NonNull
    public Lifecycle getLifecycle() {
        m109926b();
        return this.f84229a;
    }

    @Override // p149l.pqd0
    @NonNull
    public C0677a getSavedStateRegistry() {
        return this.f84230b.getSavedStateRegistry();
    }
}
