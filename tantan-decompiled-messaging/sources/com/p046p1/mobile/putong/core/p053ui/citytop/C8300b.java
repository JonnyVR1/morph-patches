package com.p046p1.mobile.putong.core.p053ui.citytop;

import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.VPullUpRecyclerView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.citytop.b */
/* JADX INFO: loaded from: classes10.dex */
public class C8300b<T> extends C0605k.e {

    /* JADX INFO: renamed from: d */
    public boolean f28719d = false;

    /* JADX INFO: renamed from: e */
    public boolean f28720e = false;

    /* JADX INFO: renamed from: f */
    public boolean f28721f = false;

    /* JADX INFO: renamed from: g */
    public final a<T> f28722g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.citytop.b$a */
    public interface a<T> {
        /* JADX INFO: renamed from: x */
        void mo44605x(View view, float f);

        /* JADX INFO: renamed from: z */
        void mo44608z(T t, boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.citytop.b$b */
    public interface b<T> {
        T getWrapperData();
    }

    public C8300b(a<T> aVar) {
        this.f28722g = aVar;
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
    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: B */
    public void mo3773B(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        KeyEvent.Callback callback = abstractC0566d0.itemView;
        if (callback instanceof b) {
            this.f28722g.mo44608z((T) ((b) callback).getWrapperData(), this.f28720e);
        }
    }

    /* JADX INFO: renamed from: C */
    public float m44609C(int i, float f) {
        float fMo33289B9 = i / CoreModule.m29935P().m94651a().mo33289B9();
        if (fMo33289B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fMo33289B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: k */
    public int mo3783k(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return C0605k.e.m3771t(15, 15);
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? C0605k.e.m3771t(12, 3) : C0605k.e.m3771t(3, 12);
        }
        return C0605k.e.m3771t(0, 0);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: l */
    public float mo3784l(float f) {
        return 2.1474836E9f;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: m */
    public float mo3785m(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        return 0.25f;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: q */
    public boolean mo3789q() {
        return true;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: r */
    public boolean mo3790r() {
        return false;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: u */
    public void mo3791u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0, float f, float f2, int i, boolean z) {
        if (i == 1) {
            float width = recyclerView.getWidth() * mo3785m(abstractC0566d0);
            float fM44609C = m44609C(abstractC0566d0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM44609C = -fM44609C;
            }
            this.f28722g.mo44605x(abstractC0566d0.itemView, fM44609C);
            if (fM44609C > 0.0f) {
                if (z) {
                    this.f28720e = true;
                    this.f28721f = false;
                }
            } else if (fM44609C < 0.0f) {
                if (z) {
                    this.f28720e = false;
                    this.f28721f = true;
                }
            } else if (z) {
                this.f28720e = false;
                this.f28721f = false;
            }
            if (z) {
                this.f28719d = Math.abs(f) > width;
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).m223189F(abstractC0566d0.itemView);
        }
        super.mo3791u(canvas, recyclerView, abstractC0566d0, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: y */
    public boolean mo3795y(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d1) {
        return false;
    }
}
