package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class SpreadBuilder {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Object> f63519a;

    public SpreadBuilder(int i) {
        this.f63519a = new ArrayList<>(i);
    }

    /* JADX INFO: renamed from: a */
    public void m87530a(Object obj) {
        this.f63519a.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public void m87531b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f63519a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f63519a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f63519a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f63519a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f63519a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* JADX INFO: renamed from: c */
    public int m87532c() {
        return this.f63519a.size();
    }

    /* JADX INFO: renamed from: d */
    public Object[] m87533d(Object[] objArr) {
        return this.f63519a.toArray(objArr);
    }
}
