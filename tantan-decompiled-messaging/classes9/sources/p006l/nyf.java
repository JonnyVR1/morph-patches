package p006l;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.FakeLikersItem;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.IntlFakeLikersItem;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.IntlFakeTurboItem;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.header.PicksHeaderView;
import com.p1.mobile.putong.data.User;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nyf extends k.e {

    /* JADX INFO: renamed from: f */
    public static float f17929f = 1.5f;

    /* JADX INFO: renamed from: d */
    public InterfaceC1066a f17930d;

    /* JADX INFO: renamed from: e */
    public boolean f17931e = false;

    /* JADX INFO: renamed from: l.nyf$a */
    public interface InterfaceC1066a {
        /* JADX INFO: renamed from: a */
        void mo14980a(View view, User user, int i, boolean z, int i2);
    }

    public nyf(InterfaceC1066a interfaceC1066a) {
        this.f17930d = interfaceC1066a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: B */
    public void m20265B(RecyclerView.d0 d0Var, int i) {
        View view = d0Var.itemView;
        if (view instanceof FakeLikersItem) {
            this.f17930d.mo14980a(view, ((FakeLikersItem) view).getUser(), i, this.f17931e, d0Var.getAdapterPosition());
        } else if (view instanceof IntlFakeLikersItem) {
            this.f17930d.mo14980a(view, ((IntlFakeLikersItem) view).getUser(), i, this.f17931e, d0Var.getAdapterPosition());
        } else if (view instanceof IntlFakeTurboItem) {
            this.f17930d.mo14980a(view, null, i, this.f17931e, d0Var.getAdapterPosition());
        }
    }

    /* JADX INFO: renamed from: C */
    public float m20266C(int i, float f) {
        float f2 = i / f17929f;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / f2, 1.0f));
    }

    /* JADX INFO: renamed from: k */
    public int m20267k(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            View view = d0Var.itemView;
            if ((view instanceof FakeLikersItem) || (view instanceof IntlFakeLikersItem) || (view instanceof IntlFakeTurboItem)) {
                return k.e.t(15, 15);
            }
        }
        if ((layoutManager instanceof LinearLayoutManager) && (d0Var.itemView instanceof FakeLikersItem)) {
            return layoutManager.getOrientation() == 0 ? k.e.t(12, 3) : k.e.t(3, 12);
        }
        View view2 = d0Var.itemView;
        if (view2 instanceof PicksHeaderView) {
            view2.setElevation(10.0f);
        }
        return k.e.t(0, 0);
    }

    /* JADX INFO: renamed from: m */
    public float m20268m(RecyclerView.d0 d0Var) {
        return 0.25f;
    }

    /* JADX INFO: renamed from: q */
    public boolean m20269q() {
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m20270r() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public void m20271u(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
        if (i == 1) {
            float fM20266C = m20266C(d0Var.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM20266C = -fM20266C;
            }
            if (fM20266C > 0.0f) {
                if (z) {
                    this.f17931e = true;
                }
            } else if (z) {
                this.f17931e = false;
            }
        }
        super.u(canvas, recyclerView, d0Var, f, f2, i, z);
    }

    /* JADX INFO: renamed from: y */
    public boolean m20272y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
        return false;
    }
}
