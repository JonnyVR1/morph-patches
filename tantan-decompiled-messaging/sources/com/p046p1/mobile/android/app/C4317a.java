package com.p046p1.mobile.android.app;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import p149l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.android.app.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4317a {

    /* JADX INFO: renamed from: a */
    public List<a> f15537a;

    /* JADX INFO: renamed from: com.p1.mobile.android.app.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo20401a(int i, int i2, Intent intent);
    }

    /* JADX INFO: renamed from: a */
    public boolean m20611a(a aVar) {
        return !vwb.m200296J(this.f15537a) && this.f15537a.contains(aVar);
    }

    /* JADX INFO: renamed from: b */
    public boolean m20612b(int i, int i2, Intent intent) {
        synchronized (this) {
            try {
                if (this.f15537a == null) {
                    return false;
                }
                ArrayList arrayList = new ArrayList(this.f15537a);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (((a) arrayList.get(i3)).mo20401a(i, i2, intent)) {
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
    public void m20613c(a aVar) {
        synchronized (this) {
            try {
                if (this.f15537a == null) {
                    this.f15537a = new ArrayList();
                }
                if (!this.f15537a.contains(aVar)) {
                    this.f15537a.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m20614d(a aVar) {
        synchronized (this) {
            try {
                List<a> list = this.f15537a;
                if (list != null) {
                    list.remove(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
