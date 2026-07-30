package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class fsj0<T extends View> {

    /* JADX INFO: renamed from: a */
    public lsj0 f10626a;

    /* JADX INFO: renamed from: b */
    public String f10627b;

    public fsj0(lsj0 lsj0Var) {
        this.f10626a = lsj0Var;
    }

    /* JADX INFO: renamed from: a */
    public T m13482a(Context context, ViewGroup viewGroup) {
        return (T) LayoutInflater.from(context).inflate(mo13483b(), viewGroup, false);
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo13483b();

    /* JADX INFO: renamed from: c */
    public abstract void mo13484c(T t);
}
