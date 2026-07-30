package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.NonNull;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class eyd0<T> extends ixd0<T> {

    /* JADX INFO: renamed from: o */
    public T f96422o;

    public eyd0(Context context, String str, T t, boolean z, String str2) {
        super(context, str, t, z, str2);
        this.f96422o = null;
    }

    @Override // p153l.ixd0
    /* JADX INFO: renamed from: b */
    public final T mo107143b() {
        if (this.f117386e) {
            T tMo107144f = mo107144f();
            this.f117387f = tMo107144f;
            this.f117386e = false;
            if (tMo107144f == null) {
                this.f96422o = null;
            } else {
                this.f96422o = mo123196k(this.f96422o, tMo107144f);
            }
        }
        return this.f96422o;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo123193h(@NonNull T t, T t2);

    /* JADX INFO: renamed from: i */
    public boolean m123194i() {
        this.f117387f = null;
        this.f96422o = null;
        boolean zCommit = false;
        this.f117386e = false;
        SharedPreferences.Editor editorRemove = m142511d().edit().remove(this.f117382a);
        if (this.f117385d) {
            editorRemove.apply();
        } else {
            zCommit = editorRemove.commit();
        }
        m123195j();
        C22507a<T> c22507a = this.f117390i;
        if (c22507a != null) {
            c22507a.onNext(null);
        }
        return zCommit;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m123195j() {
        SharedPreferences.Editor editorRemove = m142512e().edit().remove(this.f117383b);
        if (!this.f117385d) {
            return editorRemove.commit();
        }
        editorRemove.apply();
        return false;
    }

    /* JADX INFO: renamed from: k */
    public abstract T mo123196k(T t, @NonNull T t2);

    /* JADX INFO: renamed from: l */
    public boolean m123197l(T t) {
        T t2 = this.f117387f;
        if (t2 != null && mo123193h(t2, t)) {
            return true;
        }
        Pair<SharedPreferences.Editor, SharedPreferences.Editor> pairMo107145g = mo107145g(t);
        if (t == null) {
            this.f117387f = null;
            this.f96422o = null;
        } else {
            this.f117387f = mo123196k(this.f117387f, t);
            this.f96422o = mo123196k(this.f96422o, t);
        }
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
            c22507a.onNext(this.f96422o);
        }
        return z;
    }
}
