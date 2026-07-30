package com.p051p1.mobile.putong.core.p058ui.citytop;

import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.VPullUpRecyclerView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.citytop.b */
/* JADX INFO: loaded from: classes9.dex */
public class C8463b<T> extends C0607k.e {

    /* JADX INFO: renamed from: d */
    public boolean f29567d = false;

    /* JADX INFO: renamed from: e */
    public boolean f29568e = false;

    /* JADX INFO: renamed from: f */
    public boolean f29569f = false;

    /* JADX INFO: renamed from: g */
    public final a<T> f29570g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.citytop.b$a */
    public interface a<T> {
        /* JADX INFO: renamed from: x */
        void mo45788x(View view, float f);

        /* JADX INFO: renamed from: z */
        void mo45791z(T t, boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.citytop.b$b */
    public interface b<T> {
        T getWrapperData();
    }

    public C8463b(a<T> aVar) {
        this.f29570g = aVar;
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
    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: B */
    public void mo3774B(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        KeyEvent.Callback callback = abstractC0569e0.itemView;
        if (callback instanceof b) {
            this.f29570g.mo45791z((T) ((b) callback).getWrapperData(), this.f29568e);
        }
    }

    /* JADX INFO: renamed from: C */
    public float m45792C(int i, float f) {
        float fMo34292B9 = i / CoreModule.m30933P().m143405a().mo34292B9();
        if (fMo34292B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fMo34292B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: k */
    public int mo3784k(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return C0607k.e.m3772t(15, 15);
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? C0607k.e.m3772t(12, 3) : C0607k.e.m3772t(3, 12);
        }
        return C0607k.e.m3772t(0, 0);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: l */
    public float mo3785l(float f) {
        return 2.1474836E9f;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: m */
    public float mo3786m(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        return 0.25f;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: q */
    public boolean mo3790q() {
        return true;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: r */
    public boolean mo3791r() {
        return false;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: u */
    public void mo3792u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0, float f, float f2, int i, boolean z) {
        if (i == 1) {
            float width = recyclerView.getWidth() * mo3786m(abstractC0569e0);
            float fM45792C = m45792C(abstractC0569e0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM45792C = -fM45792C;
            }
            this.f29570g.mo45788x(abstractC0569e0.itemView, fM45792C);
            if (fM45792C > 0.0f) {
                if (z) {
                    this.f29568e = true;
                    this.f29569f = false;
                }
            } else if (fM45792C < 0.0f) {
                if (z) {
                    this.f29568e = false;
                    this.f29569f = true;
                }
            } else if (z) {
                this.f29568e = false;
                this.f29569f = false;
            }
            if (z) {
                this.f29567d = Math.abs(f) > width;
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).m224435F(abstractC0569e0.itemView);
        }
        super.mo3792u(canvas, recyclerView, abstractC0569e0, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: y */
    public boolean mo3796y(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, @NonNull RecyclerView.AbstractC0569e0 abstractC0569e1) {
        return false;
    }
}
