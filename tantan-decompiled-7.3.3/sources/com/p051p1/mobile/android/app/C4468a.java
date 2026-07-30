package com.p051p1.mobile.android.app;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import p153l.jyb;

/* JADX INFO: renamed from: com.p1.mobile.android.app.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4468a {

    /* JADX INFO: renamed from: a */
    public List<a> f16256a;

    /* JADX INFO: renamed from: com.p1.mobile.android.app.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo21400a(int i, int i2, Intent intent);
    }

    /* JADX INFO: renamed from: a */
    public boolean m21610a(a aVar) {
        return !jyb.m147479J(this.f16256a) && this.f16256a.contains(aVar);
    }

    /* JADX INFO: renamed from: b */
    public boolean m21611b(int i, int i2, Intent intent) {
        synchronized (this) {
            try {
                if (this.f16256a == null) {
                    return false;
                }
                ArrayList arrayList = new ArrayList(this.f16256a);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (((a) arrayList.get(i3)).mo21400a(i, i2, intent)) {
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
    public void m21612c(a aVar) {
        synchronized (this) {
            try {
                if (this.f16256a == null) {
                    this.f16256a = new ArrayList();
                }
                if (!this.f16256a.contains(aVar)) {
                    this.f16256a.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m21613d(a aVar) {
        synchronized (this) {
            try {
                List<a> list = this.f16256a;
                if (list != null) {
                    list.remove(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
