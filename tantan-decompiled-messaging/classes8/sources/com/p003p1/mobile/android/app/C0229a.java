package com.p003p1.mobile.android.app;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.android.app.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0229a {

    /* JADX INFO: renamed from: a */
    public List<a> f1236a;

    /* JADX INFO: renamed from: com.p1.mobile.android.app.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo672a(int i, int i2, Intent intent);
    }

    /* JADX INFO: renamed from: a */
    public boolean m882a(a aVar) {
        return !vwb.J(this.f1236a) && this.f1236a.contains(aVar);
    }

    /* JADX INFO: renamed from: b */
    public boolean m883b(int i, int i2, Intent intent) {
        synchronized (this) {
            try {
                if (this.f1236a == null) {
                    return false;
                }
                ArrayList arrayList = new ArrayList(this.f1236a);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (((a) arrayList.get(i3)).mo672a(i, i2, intent)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m884c(a aVar) {
        synchronized (this) {
            try {
                if (this.f1236a == null) {
                    this.f1236a = new ArrayList();
                }
                if (!this.f1236a.contains(aVar)) {
                    this.f1236a.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m885d(a aVar) {
        synchronized (this) {
            try {
                List<a> list = this.f1236a;
                if (list != null) {
                    list.remove(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
