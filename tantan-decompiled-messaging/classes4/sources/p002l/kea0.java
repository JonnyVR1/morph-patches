package p002l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import l.cnl;
import l.d30;
import l.e30;
import l.mcr;
import l.mkd0;
import l.qp8;
import l.roj0;
import l.t100;
import l.u4c0;
import l.x2c0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kea0 extends ah90 {

    /* JADX INFO: renamed from: A */
    public boolean f14293A;

    /* JADX INFO: renamed from: u */
    public FrameLayout f14294u;

    /* JADX INFO: renamed from: v */
    public View f14295v;

    /* JADX INFO: renamed from: w */
    public View f14296w;

    /* JADX INFO: renamed from: x */
    public a1m f14297x;

    /* JADX INFO: renamed from: y */
    public WeakReference<Frag> f14298y;

    /* JADX INFO: renamed from: z */
    public d30 f14299z;

    public kea0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f14293A = false;
        this.f14297x = a1mVar;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m16601S(Frag frag, int i, roj0 roj0Var) {
        if (frag instanceof cnl) {
            ((cnl) frag).l(i >= 0 && i < 100);
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m16603U(View view) {
        if (view != null) {
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m16604V(final View view) {
        if (this.f14293A) {
            return;
        }
        try {
            Frag fragUe = CoreModule.Q().ue(mo3351O().userId(), CoreModule.c.m0.L6(mo3351O().userId()) ? mo3351O().from() : "");
            this.f14298y = new WeakReference<>(fragUe);
            mo3351O().mo1514J1().getChildFragmentManager().m().b(u4c0.n7, fragUe).l();
            this.f14293A = true;
            fragUe.creates(new e30() { // from class: l.hea0
                public final void call(Object obj) {
                    this.f12003a.m16605W((Bundle) obj);
                }
            });
            mo3351O().mo1514J1().l4(new Runnable() { // from class: l.iea0
                @Override // java.lang.Runnable
                public final void run() {
                    kea0.m16603U(view);
                }
            });
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m16605W(Bundle bundle) {
        d30 d30Var = this.f14299z;
        if (d30Var != null) {
            d30Var.call();
            this.f14299z = null;
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m16606X(View view, View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f14294u.isAttachedToWindow() && !this.f14293A && NullChecker.a(mo3351O().mo1514J1().getView()) && mo3351O().mo1514J1().getView().findViewById(u4c0.n7) != null) {
            m16604V(view);
        }
        if (!this.f14297x.mo1570m0()) {
            this.f14295v.setVisibility(8);
            this.f14296w.setVisibility(8);
            return;
        }
        int height = view.getHeight();
        int i9 = t100.f;
        View view3 = this.f14295v;
        if (height > i9) {
            if (view3.getVisibility() == 0) {
                return;
            }
            this.f14296w.setVisibility(0);
            this.f14295v.setVisibility(0);
            return;
        }
        if (view3.getVisibility() != 8) {
            this.f14295v.setVisibility(8);
            this.f14296w.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m16607Y(final int i) {
        final Frag frag;
        if (NullChecker.b(this.f14298y) && (frag = this.f14298y.get()) != null) {
            frag.duringCreated(c.just(roj0.a)).subscribe(mkd0.G(new e30() { // from class: l.jea0
                public final void call(Object obj) {
                    kea0.m16601S(frag, i, (roj0) obj);
                }
            }));
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: a */
    public void mo14451a(d30 d30Var) {
        if (this.f14293A && NullChecker.b(this.f14298y)) {
            d30Var.call();
        } else {
            this.f14299z = d30Var;
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(final View view) {
        super.mo3279j(view);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.gea0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f11388a.m16606X(view, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        Conversation conversationXe = CoreModule.c.f0.Xe(mo3351O().userId());
        if (CoreModule.Q().a().f()) {
            return true;
        }
        if (!qp8.b() || qp8.a()) {
            return false;
        }
        return conversationXe == null || !TEnum.equals(conversationXe.status, "blocked");
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(new RecyclerView.p(-1, -2));
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        this.f14294u = frameLayout;
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f14294u.setId(u4c0.n7);
        linearLayout.addView(this.f14294u);
        View view = new View(viewGroup.getContext());
        this.f14296w = view;
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, t100.d(19.0f)));
        this.f14296w.setBackgroundResource(x2c0.Pm);
        this.f14296w.setVisibility(8);
        View view2 = new View(viewGroup.getContext());
        this.f14295v = view2;
        view2.setLayoutParams(new LinearLayout.LayoutParams(-1, t100.d));
        this.f14295v.setBackgroundResource(x2c0.Sm);
        this.f14295v.setVisibility(8);
        linearLayout.addView(this.f14296w);
        linearLayout.addView(this.f14295v);
        return linearLayout;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
    }
}
