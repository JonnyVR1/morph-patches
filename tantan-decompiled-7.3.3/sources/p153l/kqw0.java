package p153l;

import com.google.android.gms.internal.ads.zzfzv;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class kqw0 extends lqw0 {

    /* JADX INFO: renamed from: a */
    public Object[] f128397a;

    /* JADX INFO: renamed from: b */
    public int f128398b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f128399c;

    public kqw0(int i) {
        this.f128397a = new Object[i];
    }

    /* JADX INFO: renamed from: c */
    public final kqw0 m150965c(Object obj) {
        obj.getClass();
        m150968f(this.f128398b + 1);
        Object[] objArr = this.f128397a;
        int i = this.f128398b;
        this.f128398b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final lqw0 m150966d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m150968f(this.f128398b + collection.size());
            if (collection instanceof zzfzv) {
                this.f128398b = ((zzfzv) collection).zza(this.f128397a, this.f128398b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo13498a(it.next());
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m150967e(Object[] objArr, int i) {
        qsw0.m177820b(objArr, 2);
        m150968f(this.f128398b + 2);
        System.arraycopy(objArr, 0, this.f128397a, this.f128398b, 2);
        this.f128398b += 2;
    }

    /* JADX INFO: renamed from: f */
    public final void m150968f(int i) {
        Object[] objArr = this.f128397a;
        int length = objArr.length;
        if (length < i) {
            this.f128397a = Arrays.copyOf(objArr, lqw0.m155511b(length, i));
            this.f128399c = false;
        } else if (this.f128399c) {
            this.f128397a = (Object[]) objArr.clone();
            this.f128399c = false;
        }
    }
}
