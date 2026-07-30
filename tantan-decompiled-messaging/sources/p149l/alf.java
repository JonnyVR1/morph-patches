package p149l;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.xkf;

/* JADX INFO: loaded from: classes11.dex */
public abstract class alf<T extends xkf> {

    /* JADX INFO: renamed from: a */
    public String f70428a;

    /* JADX INFO: renamed from: b */
    public C22392a<Boolean> f70429b = C22392a.m221512b();

    /* JADX INFO: renamed from: a */
    public abstract void mo97281a(T t, int i, int i2);

    /* JADX INFO: renamed from: b */
    public abstract T mo97282b(@NonNull ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo97283c();

    /* JADX INFO: renamed from: d */
    public C22306c<Boolean> m97284d() {
        return this.f70429b.asObservable();
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo97285e(int i);

    /* JADX INFO: renamed from: f */
    public abstract String mo97286f();

    /* JADX INFO: renamed from: g */
    public void m97287g() {
        this.f70429b.onNext(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: h */
    public void m97288h(String str) {
        this.f70428a = str;
    }
}
