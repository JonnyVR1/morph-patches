package p009l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p009l.xkf;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class alf<T extends xkf> {

    /* JADX INFO: renamed from: a */
    public String f9564a;

    /* JADX INFO: renamed from: b */
    public a<Boolean> f9565b = a.b();

    /* JADX INFO: renamed from: a */
    public abstract void mo11503a(T t, int i, int i2);

    /* JADX INFO: renamed from: b */
    public abstract T mo11504b(@NonNull ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo11505c();

    /* JADX INFO: renamed from: d */
    public c<Boolean> m11506d() {
        return this.f9565b.asObservable();
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo11507e(int i);

    /* JADX INFO: renamed from: f */
    public abstract String mo11508f();

    /* JADX INFO: renamed from: g */
    public void m11509g() {
        this.f9565b.onNext(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: h */
    public void m11510h(String str) {
        this.f9564a = str;
    }
}
