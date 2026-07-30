package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i1k0<T extends View> {

    /* JADX INFO: renamed from: a */
    public o1k0 f112532a;

    /* JADX INFO: renamed from: b */
    public String f112533b;

    public i1k0(o1k0 o1k0Var) {
        this.f112532a = o1k0Var;
    }

    /* JADX INFO: renamed from: a */
    public T m138115a(Context context, ViewGroup viewGroup) {
        return (T) LayoutInflater.from(context).inflate(mo95708b(), viewGroup, false);
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo95708b();

    /* JADX INFO: renamed from: c */
    public abstract void mo95709c(T t);
}
