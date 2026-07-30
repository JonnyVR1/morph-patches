package p009l;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeTurboItem;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersItemView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import v.VImage;
import v.VPullUpRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bgo extends k.e {

    /* JADX INFO: renamed from: d */
    public final InterfaceC0780a f10070d;

    /* JADX INFO: renamed from: e */
    public boolean f10071e = false;

    /* JADX INFO: renamed from: f */
    public boolean f10072f = false;

    /* JADX INFO: renamed from: g */
    public boolean f10073g = false;

    /* JADX INFO: renamed from: l.bgo$a */
    public interface InterfaceC0780a {
        /* JADX INFO: renamed from: a */
        void mo11994a(View view, User user, boolean z, boolean z2, boolean z3);

        /* JADX INFO: renamed from: n */
        boolean mo11995n();

        /* JADX INFO: renamed from: o */
        void mo11996o(boolean z);
    }

    public bgo(InterfaceC0780a interfaceC0780a) {
        this.f10070d = interfaceC0780a;
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
    public void m11985B(@NonNull RecyclerView.d0 d0Var, int i) {
        View view;
        if (d0Var == null || (view = d0Var.itemView) == 0) {
            return;
        }
        if (view instanceof IntlMeetLikersItemView) {
            if (!this.f10071e) {
                this.f10070d.mo11996o(this.f10072f);
                return;
            } else {
                IntlMeetLikersItemView intlMeetLikersItemView = (IntlMeetLikersItemView) view;
                this.f10070d.mo11994a(intlMeetLikersItemView, intlMeetLikersItemView.f3028q, this.f10072f, false, false);
                return;
            }
        }
        if (view instanceof IntlMeetFakeLikersItem) {
            this.f10070d.mo11994a(view, ((IntlMeetFakeLikersItem) view).getUser(), this.f10072f, false, false);
        } else if (view instanceof IntlMeetFakeTurboItem) {
            this.f10070d.mo11994a(view, null, this.f10072f, false, false);
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m11986C(View view) {
        return (view instanceof IntlMeetLikersItemView) || (view instanceof IntlMeetFakeLikersItem) || (view instanceof IntlMeetFakeTurboItem);
    }

    /* JADX INFO: renamed from: D */
    public float m11987D(int i, float f) {
        float fB9 = i / CoreModule.P().a().B9();
        if (fB9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fB9, 1.0f));
    }

    /* JADX INFO: renamed from: k */
    public int m11988k(@NonNull RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        if (!m11986C(d0Var.itemView)) {
            return k.e.t(0, 0);
        }
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return k.e.t(15, 15);
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return k.e.t(0, 0);
        }
        int i = 3;
        int i2 = 12;
        if (layoutManager.getOrientation() == 0) {
            i2 = 3;
            i = 12;
        }
        return k.e.t(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public float m11989l(float f) {
        return 2.1474836E9f;
    }

    /* JADX INFO: renamed from: m */
    public float m11990m(@NonNull RecyclerView.d0 d0Var) {
        return 0.25f;
    }

    /* JADX INFO: renamed from: r */
    public boolean m11991r() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public void m11992u(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
        if (i == 1 && (d0Var.itemView instanceof IntlMeetLikersItemView)) {
            float width = recyclerView.getWidth() * m11990m(d0Var);
            float fM11987D = m11987D(d0Var.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM11987D = -fM11987D;
            }
            IntlMeetLikersItemView intlMeetLikersItemView = (IntlMeetLikersItemView) d0Var.itemView;
            VImage vImage = intlMeetLikersItemView.f3017f;
            VImage vImage2 = intlMeetLikersItemView.f3016e;
            boolean zMo11995n = this.f10070d.mo11995n();
            if (fM11987D > 0.0f) {
                if (!zMo11995n) {
                    vImage.setVisibility(0);
                    vImage2.setVisibility(4);
                    vImage.setAlpha(fM11987D);
                }
                if (z) {
                    this.f10072f = true;
                    this.f10073g = false;
                }
            } else if (fM11987D < 0.0f) {
                if (!zMo11995n) {
                    vImage.setVisibility(4);
                    vImage2.setVisibility(0);
                    vImage2.setAlpha(-fM11987D);
                }
                if (z) {
                    this.f10072f = false;
                    this.f10073g = true;
                }
            } else {
                if (!zMo11995n) {
                    vImage.setVisibility(4);
                    vImage2.setVisibility(4);
                }
                if (z) {
                    this.f10072f = false;
                    this.f10073g = false;
                }
            }
            if (z) {
                this.f10071e = Math.abs(f) > width;
            }
        } else if (i == 1 && z) {
            View view = d0Var.itemView;
            if ((view instanceof IntlMeetFakeLikersItem) || (view instanceof IntlMeetFakeTurboItem)) {
                float fM11987D2 = m11987D(view.getMeasuredWidth(), Math.abs(f) * 2.0f);
                if (f <= 0.0f) {
                    fM11987D2 = -fM11987D2;
                }
                this.f10072f = fM11987D2 > 0.0f;
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).F(d0Var.itemView);
        }
        super.u(canvas, recyclerView, d0Var, f, f2, i, z);
    }

    /* JADX INFO: renamed from: y */
    public boolean m11993y(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.d0 d0Var, @NonNull RecyclerView.d0 d0Var2) {
        return false;
    }
}
