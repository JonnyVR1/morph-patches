package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.NonNull;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public abstract class cqd0<T> extends gpd0<T> {

    /* JADX INFO: renamed from: o */
    public T f82061o;

    public cqd0(Context context, String str, T t, boolean z, String str2) {
        super(context, str, t, z, str2);
        this.f82061o = null;
    }

    @Override // p149l.gpd0
    /* JADX INFO: renamed from: b */
    public final T mo108248b() {
        if (this.f103787e) {
            T tMo117618f = mo117618f();
            this.f103788f = tMo117618f;
            this.f103787e = false;
            if (tMo117618f == null) {
                this.f82061o = null;
            } else {
                this.f82061o = mo108252k(this.f82061o, tMo117618f);
            }
        }
        return this.f82061o;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo108249h(@NonNull T t, T t2);

    /* JADX INFO: renamed from: i */
    public boolean m108250i() {
        this.f103788f = null;
        this.f82061o = null;
        boolean zCommit = false;
        this.f103787e = false;
        SharedPreferences.Editor editorRemove = m127349d().edit().remove(this.f103783a);
        if (this.f103786d) {
            editorRemove.apply();
        } else {
            zCommit = editorRemove.commit();
        }
        m108251j();
        C22392a<T> c22392a = this.f103791i;
        if (c22392a != null) {
            c22392a.onNext(null);
        }
        return zCommit;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m108251j() {
        SharedPreferences.Editor editorRemove = m127350e().edit().remove(this.f103784b);
        if (!this.f103786d) {
            return editorRemove.commit();
        }
        editorRemove.apply();
        return false;
    }

    /* JADX INFO: renamed from: k */
    public abstract T mo108252k(T t, @NonNull T t2);

    /* JADX INFO: renamed from: l */
    public boolean m108253l(T t) {
        T t2 = this.f103788f;
        if (t2 != null && mo108249h(t2, t)) {
            return true;
        }
        Pair<SharedPreferences.Editor, SharedPreferences.Editor> pairMo117619g = mo117619g(t);
        if (t == null) {
            this.f103788f = null;
            this.f82061o = null;
        } else {
            this.f103788f = mo108252k(this.f103788f, t);
            this.f82061o = mo108252k(this.f82061o, t);
        }
        boolean z = false;
        this.f103787e = false;
        if (this.f103786d) {
            ((SharedPreferences.Editor) pairMo117619g.first).apply();
            ((SharedPreferences.Editor) pairMo117619g.second).apply();
        } else {
            z = ((SharedPreferences.Editor) pairMo117619g.first).commit() && ((SharedPreferences.Editor) pairMo117619g.second).commit();
        }
        C22392a<T> c22392a = this.f103791i;
        if (c22392a != null) {
            c22392a.onNext(this.f82061o);
        }
        return z;
    }
}
