package com.p000p1.mobile.putong.core.p001ui.citytop;

import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p1.mobile.putong.core.CoreModule;
import v.VPullUpRecyclerView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.citytop.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3075b<T> extends k.e {

    /* JADX INFO: renamed from: d */
    public boolean f1113d = false;

    /* JADX INFO: renamed from: e */
    public boolean f1114e = false;

    /* JADX INFO: renamed from: f */
    public boolean f1115f = false;

    /* JADX INFO: renamed from: g */
    public final a<T> f1116g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.citytop.b$a */
    public interface a<T> {
        /* JADX INFO: renamed from: x */
        void mo1911x(View view, float f);

        /* JADX INFO: renamed from: z */
        void mo1914z(T t, boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.citytop.b$b */
    public interface b<T> {
        T getWrapperData();
    }

    public C3075b(a<T> aVar) {
        this.f1116g = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: B */
    public void m1915B(RecyclerView.d0 d0Var, int i) {
        KeyEvent.Callback callback = d0Var.itemView;
        if (callback instanceof b) {
            this.f1116g.mo1914z((T) ((b) callback).getWrapperData(), this.f1114e);
        }
    }

    /* JADX INFO: renamed from: C */
    public float m1916C(int i, float f) {
        float fB9 = i / CoreModule.P().a().B9();
        if (fB9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fB9, 1.0f));
    }

    /* JADX INFO: renamed from: k */
    public int m1917k(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.d0 d0Var) {
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return k.e.t(15, 15);
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return layoutManager.getOrientation() == 0 ? k.e.t(12, 3) : k.e.t(3, 12);
        }
        return k.e.t(0, 0);
    }

    /* JADX INFO: renamed from: l */
    public float m1918l(float f) {
        return 2.1474836E9f;
    }

    /* JADX INFO: renamed from: m */
    public float m1919m(RecyclerView.d0 d0Var) {
        return 0.25f;
    }

    /* JADX INFO: renamed from: q */
    public boolean m1920q() {
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m1921r() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public void m1922u(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
        if (i == 1) {
            float width = recyclerView.getWidth() * m1919m(d0Var);
            float fM1916C = m1916C(d0Var.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM1916C = -fM1916C;
            }
            this.f1116g.mo1911x(d0Var.itemView, fM1916C);
            if (fM1916C > 0.0f) {
                if (z) {
                    this.f1114e = true;
                    this.f1115f = false;
                }
            } else if (fM1916C < 0.0f) {
                if (z) {
                    this.f1114e = false;
                    this.f1115f = true;
                }
            } else if (z) {
                this.f1114e = false;
                this.f1115f = false;
            }
            if (z) {
                this.f1113d = Math.abs(f) > width;
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).F(d0Var.itemView);
        }
        super.u(canvas, recyclerView, d0Var, f, f2, i, z);
    }

    /* JADX INFO: renamed from: y */
    public boolean m1923y(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.d0 d0Var, @NonNull RecyclerView.d0 d0Var2) {
        return false;
    }
}
