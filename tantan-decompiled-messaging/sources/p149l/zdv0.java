package p149l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class zdv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f202721a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f202722b;

    /* JADX INFO: renamed from: c */
    public final Context f202723c;

    /* JADX INFO: renamed from: d */
    public final iyv0 f202724d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final View f202725e;

    public zdv0(rmw0 rmw0Var, rmw0 rmw0Var2, Context context, iyv0 iyv0Var, @Nullable ViewGroup viewGroup) {
        this.f202721a = rmw0Var;
        this.f202722b = rmw0Var2;
        this.f202723c = context;
        this.f202724d = iyv0Var;
        this.f202725e = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aev0 m218206a() throws Exception {
        return new aev0(this.f202723c, this.f202724d.f115495e, m218208c());
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ aev0 m218207b() throws Exception {
        return new aev0(this.f202723c, this.f202724d.f115495e, m218208c());
    }

    /* JADX INFO: renamed from: c */
    public final List m218208c() {
        ArrayList arrayList = new ArrayList();
        View view = this.f202725e;
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

    @Override // p149l.qlv0
    public final int zza() {
        return 3;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        m7s0.m153417a(this.f202723c);
        return ((Boolean) d1s0.m109677c().m144697a(m7s0.f131855Aa)).booleanValue() ? this.f202722b.mo122102R(new Callable() { // from class: l.xdv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f192469a.m218206a();
            }
        }) : this.f202721a.mo122102R(new Callable() { // from class: l.ydv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f197648a.m218207b();
            }
        });
    }
}
