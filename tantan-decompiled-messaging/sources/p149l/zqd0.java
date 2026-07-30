package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public abstract class zqd0<T> extends gpd0<T> {
    public zqd0(Context context, String str, T t, boolean z, String str2) {
        super(context, str, t, z, str2);
    }

    @Override // p149l.gpd0
    /* JADX INFO: renamed from: b */
    public T mo108248b() {
        if (this.f103787e) {
            this.f103788f = mo117618f();
            this.f103787e = false;
        }
        return this.f103788f;
    }

    @Override // p149l.gpd0
    /* JADX INFO: renamed from: f */
    public abstract T mo117618f();

    @Override // p149l.gpd0
    /* JADX INFO: renamed from: g */
    public abstract Pair<SharedPreferences.Editor, SharedPreferences.Editor> mo117619g(T t);

    /* JADX INFO: renamed from: h */
    public boolean mo137472h(T t) {
        T t2 = this.f103788f;
        if (t2 != null && t2.equals(t)) {
            return true;
        }
        Pair<SharedPreferences.Editor, SharedPreferences.Editor> pairMo117619g = mo117619g(t);
        this.f103788f = t;
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
            c22392a.onNext(this.f103788f);
        }
        return z;
    }
}
