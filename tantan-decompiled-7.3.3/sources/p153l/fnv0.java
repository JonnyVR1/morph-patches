package p153l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class fnv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f99963a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f99964b;

    /* JADX INFO: renamed from: c */
    public final Context f99965c;

    /* JADX INFO: renamed from: d */
    public final o7w0 f99966d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final View f99967e;

    public fnv0(xvw0 xvw0Var, xvw0 xvw0Var2, Context context, o7w0 o7w0Var, @Nullable ViewGroup viewGroup) {
        this.f99963a = xvw0Var;
        this.f99964b = xvw0Var2;
        this.f99965c = context;
        this.f99966d = o7w0Var;
        this.f99967e = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gnv0 m126383a() throws Exception {
        return new gnv0(this.f99965c, this.f99966d.f145319e, m126385c());
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gnv0 m126384b() throws Exception {
        return new gnv0(this.f99965c, this.f99966d.f145319e, m126385c());
    }

    /* JADX INFO: renamed from: c */
    public final List m126385c() {
        ArrayList arrayList = new ArrayList();
        View view = this.f99967e;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 3;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        sgs0.m185829a(this.f99965c);
        return ((Boolean) jas0.m144075c().m176505a(sgs0.f167926Aa)).booleanValue() ? this.f99964b.mo155969R(new Callable() { // from class: l.dnv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f89847a.m126383a();
            }
        }) : this.f99963a.mo155969R(new Callable() { // from class: l.env0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f94836a.m126384b();
            }
        });
    }
}
