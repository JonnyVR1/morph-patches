package p153l;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class e3d0 {

    /* JADX INFO: renamed from: a */
    private final Set<y1d0> f91950a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    private final Set<y1d0> f91951b = new HashSet();

    /* JADX INFO: renamed from: c */
    private boolean f91952c;

    /* JADX INFO: renamed from: a */
    public boolean m119269a(@Nullable y1d0 y1d0Var) {
        boolean z = true;
        if (y1d0Var == null) {
            return true;
        }
        boolean zRemove = this.f91950a.remove(y1d0Var);
        if (!this.f91951b.remove(y1d0Var) && !zRemove) {
            z = false;
        }
        if (z) {
            y1d0Var.clear();
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public void m119270b() {
        Iterator it = ylk0.m216586j(this.f91950a).iterator();
        while (it.hasNext()) {
            m119269a((y1d0) it.next());
        }
        this.f91951b.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m119271c() {
        this.f91952c = true;
        for (y1d0 y1d0Var : ylk0.m216586j(this.f91950a)) {
            if (y1d0Var.isRunning() || y1d0Var.isComplete()) {
                y1d0Var.clear();
                this.f91951b.add(y1d0Var);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m119272d() {
        this.f91952c = true;
        for (y1d0 y1d0Var : ylk0.m216586j(this.f91950a)) {
            if (y1d0Var.isRunning()) {
                y1d0Var.pause();
                this.f91951b.add(y1d0Var);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m119273e() {
        for (y1d0 y1d0Var : ylk0.m216586j(this.f91950a)) {
            if (!y1d0Var.isComplete() && !y1d0Var.mo5696e()) {
                y1d0Var.clear();
                if (this.f91952c) {
                    this.f91951b.add(y1d0Var);
                } else {
                    y1d0Var.mo5699j();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m119274f() {
        this.f91952c = false;
        for (y1d0 y1d0Var : ylk0.m216586j(this.f91950a)) {
            if (!y1d0Var.isComplete() && !y1d0Var.isRunning()) {
                y1d0Var.mo5699j();
            }
        }
        this.f91951b.clear();
    }

    /* JADX INFO: renamed from: g */
    public void m119275g(@NonNull y1d0 y1d0Var) {
        this.f91950a.add(y1d0Var);
        if (!this.f91952c) {
            y1d0Var.mo5699j();
            return;
        }
        y1d0Var.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f91951b.add(y1d0Var);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f91950a.size() + ", isPaused=" + this.f91952c + "}";
    }
}
