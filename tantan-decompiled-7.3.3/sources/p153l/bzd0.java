package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class bzd0<T> extends ixd0<T> {
    public bzd0(Context context, String str, T t, boolean z, String str2) {
        super(context, str, t, z, str2);
    }

    @Override // p153l.ixd0
    /* JADX INFO: renamed from: b */
    public T mo107143b() {
        if (this.f117386e) {
            this.f117387f = mo107144f();
            this.f117386e = false;
        }
        return this.f117387f;
    }

    @Override // p153l.ixd0
    /* JADX INFO: renamed from: f */
    public abstract T mo107144f();

    @Override // p153l.ixd0
    /* JADX INFO: renamed from: g */
    public abstract Pair<SharedPreferences.Editor, SharedPreferences.Editor> mo107145g(T t);

    /* JADX INFO: renamed from: h */
    public boolean mo107146h(T t) {
        T t2 = this.f117387f;
        if (t2 != null && t2.equals(t)) {
            return true;
        }
        Pair<SharedPreferences.Editor, SharedPreferences.Editor> pairMo107145g = mo107145g(t);
        this.f117387f = t;
        boolean z = false;
        this.f117386e = false;
        if (this.f117385d) {
            ((SharedPreferences.Editor) pairMo107145g.first).apply();
            ((SharedPreferences.Editor) pairMo107145g.second).apply();
        } else {
            z = ((SharedPreferences.Editor) pairMo107145g.first).commit() && ((SharedPreferences.Editor) pairMo107145g.second).commit();
        }
        C22507a<T> c22507a = this.f117390i;
        if (c22507a != null) {
            c22507a.onNext(this.f117387f);
        }
        return z;
    }
}
