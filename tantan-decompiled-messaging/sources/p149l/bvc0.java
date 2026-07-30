package p149l;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class bvc0 {

    /* JADX INFO: renamed from: a */
    private final Set<ttc0> f77422a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    private final List<ttc0> f77423b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private boolean f77424c;

    /* JADX INFO: renamed from: a */
    public boolean m104014a(@Nullable ttc0 ttc0Var) {
        boolean z = true;
        if (ttc0Var == null) {
            return true;
        }
        boolean zRemove = this.f77422a.remove(ttc0Var);
        if (!this.f77423b.remove(ttc0Var) && !zRemove) {
            z = false;
        }
        if (z) {
            ttc0Var.clear();
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public void m104015b() {
        Iterator it = sck0.m183410j(this.f77422a).iterator();
        while (it.hasNext()) {
            m104014a((ttc0) it.next());
        }
        this.f77423b.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m104016c() {
        this.f77424c = true;
        for (ttc0 ttc0Var : sck0.m183410j(this.f77422a)) {
            if (ttc0Var.isRunning() || ttc0Var.isComplete()) {
                ttc0Var.clear();
                this.f77423b.add(ttc0Var);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m104017d() {
        this.f77424c = true;
        for (ttc0 ttc0Var : sck0.m183410j(this.f77422a)) {
            if (ttc0Var.isRunning()) {
                ttc0Var.pause();
                this.f77423b.add(ttc0Var);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m104018e() {
        for (ttc0 ttc0Var : sck0.m183410j(this.f77422a)) {
            if (!ttc0Var.isComplete() && !ttc0Var.mo5642e()) {
                ttc0Var.clear();
                if (this.f77424c) {
                    this.f77423b.add(ttc0Var);
                } else {
                    ttc0Var.mo5645i();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m104019f() {
        this.f77424c = false;
        for (ttc0 ttc0Var : sck0.m183410j(this.f77422a)) {
            if (!ttc0Var.isComplete() && !ttc0Var.isRunning()) {
                ttc0Var.mo5645i();
            }
        }
        this.f77423b.clear();
    }

    /* JADX INFO: renamed from: g */
    public void m104020g(@NonNull ttc0 ttc0Var) {
        this.f77422a.add(ttc0Var);
        if (!this.f77424c) {
            ttc0Var.mo5645i();
            return;
        }
        ttc0Var.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f77423b.add(ttc0Var);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f77422a.size() + ", isPaused=" + this.f77424c + "}";
    }
}
