package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class SpreadBuilder {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Object> f64193a;

    public SpreadBuilder(int i) {
        this.f64193a = new ArrayList<>(i);
    }

    /* JADX INFO: renamed from: a */
    public void m88419a(Object obj) {
        this.f64193a.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public void m88420b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f64193a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f64193a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f64193a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f64193a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f64193a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* JADX INFO: renamed from: c */
    public int m88421c() {
        return this.f64193a.size();
    }

    /* JADX INFO: renamed from: d */
    public Object[] m88422d(Object[] objArr) {
        return this.f64193a.toArray(objArr);
    }
}
