package p153l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.dmf;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gmf<T extends dmf> {

    /* JADX INFO: renamed from: a */
    public String f104972a;

    /* JADX INFO: renamed from: b */
    public C22507a<Boolean> f104973b = C22507a.m222758b();

    /* JADX INFO: renamed from: a */
    public abstract void mo126224a(T t, int i, int i2);

    /* JADX INFO: renamed from: b */
    public abstract T mo126225b(@NonNull ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo126226c();

    /* JADX INFO: renamed from: d */
    public C22421c<Boolean> m130776d() {
        return this.f104973b.asObservable();
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo126227e(int i);

    /* JADX INFO: renamed from: f */
    public abstract String mo126228f();

    /* JADX INFO: renamed from: g */
    public void m130777g() {
        this.f104973b.onNext(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: h */
    public void m130778h(String str) {
        this.f104972a = str;
    }
}
