package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fsj0<T extends View> {

    /* JADX INFO: renamed from: a */
    public lsj0 f99083a;

    /* JADX INFO: renamed from: b */
    public String f99084b;

    public fsj0(lsj0 lsj0Var) {
        this.f99083a = lsj0Var;
    }

    /* JADX INFO: renamed from: a */
    public T m122951a(Context context, ViewGroup viewGroup) {
        return (T) LayoutInflater.from(context).inflate(mo122952b(), viewGroup, false);
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo122952b();

    /* JADX INFO: renamed from: c */
    public abstract void mo122953c(T t);
}
