package p149l;

import com.google.android.gms.internal.ads.zzfzv;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ehw0 extends fhw0 {

    /* JADX INFO: renamed from: a */
    public Object[] f91519a;

    /* JADX INFO: renamed from: b */
    public int f91520b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f91521c;

    public ehw0(int i) {
        this.f91519a = new Object[i];
    }

    /* JADX INFO: renamed from: c */
    public final ehw0 m116605c(Object obj) {
        obj.getClass();
        m116608f(this.f91520b + 1);
        Object[] objArr = this.f91519a;
        int i = this.f91520b;
        this.f91520b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final fhw0 m116606d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m116608f(this.f91520b + collection.size());
            if (collection instanceof zzfzv) {
                this.f91520b = ((zzfzv) collection).zza(this.f91519a, this.f91520b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo13444a(it.next());
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m116607e(Object[] objArr, int i) {
        kjw0.m146281b(objArr, 2);
        m116608f(this.f91520b + 2);
        System.arraycopy(objArr, 0, this.f91519a, this.f91520b, 2);
        this.f91520b += 2;
    }

    /* JADX INFO: renamed from: f */
    public final void m116608f(int i) {
        Object[] objArr = this.f91519a;
        int length = objArr.length;
        if (length < i) {
            this.f91519a = Arrays.copyOf(objArr, fhw0.m121469b(length, i));
            this.f91521c = false;
        } else if (this.f91521c) {
            this.f91519a = (Object[]) objArr.clone();
            this.f91521c = false;
        }
    }
}
