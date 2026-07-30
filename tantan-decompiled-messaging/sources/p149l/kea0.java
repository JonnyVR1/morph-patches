package p149l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class kea0 extends ah90 {

    /* JADX INFO: renamed from: A */
    public boolean f122687A;

    /* JADX INFO: renamed from: u */
    public FrameLayout f122688u;

    /* JADX INFO: renamed from: v */
    public View f122689v;

    /* JADX INFO: renamed from: w */
    public View f122690w;

    /* JADX INFO: renamed from: x */
    public a1m f122691x;

    /* JADX INFO: renamed from: y */
    public WeakReference<Frag> f122692y;

    /* JADX INFO: renamed from: z */
    public d30 f122693z;

    public kea0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f122687A = false;
        this.f122691x = a1mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m145752S(Frag frag, int i, roj0 roj0Var) {
        if (frag instanceof cnl) {
            ((cnl) frag).mo70511l(i >= 0 && i < 100);
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m145754U(View view) {
        if (view != null) {
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m145755V(final View view) {
        if (this.f122687A) {
            return;
        }
        try {
            Frag fragMo67288ue = CoreModule.m29936Q().mo67288ue(mo52800O().userId(), CoreModule.f17545c.f19663m0.m31020L6(mo52800O().userId()) ? mo52800O().from() : "");
            this.f122692y = new WeakReference<>(fragMo67288ue);
            mo52800O().mo51066J1().getChildFragmentManager().m2567m().m2803b(u4c0.f174379n7, fragMo67288ue).mo2710l();
            this.f122687A = true;
            fragMo67288ue.creates(new e30() { // from class: l.hea0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f107345a.m145756W((Bundle) obj);
                }
            });
            mo52800O().mo51066J1().m20592l4(new Runnable() { // from class: l.iea0
                @Override // java.lang.Runnable
                public final void run() {
                    kea0.m145754U(view);
                }
            });
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m145756W(Bundle bundle) {
        d30 d30Var = this.f122693z;
        if (d30Var != null) {
            d30Var.call();
            this.f122693z = null;
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m145757X(View view, View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f122688u.isAttachedToWindow() && !this.f122687A && NullChecker.m81303a(mo52800O().mo51066J1().getView()) && mo52800O().mo51066J1().getView().findViewById(u4c0.f174379n7) != null) {
            m145755V(view);
        }
        if (!this.f122691x.mo51119m0()) {
            this.f122689v.setVisibility(8);
            this.f122690w.setVisibility(8);
            return;
        }
        int height = view.getHeight();
        int i9 = t100.f167257f;
        View view3 = this.f122689v;
        if (height > i9) {
            if (view3.getVisibility() == 0) {
                return;
            }
            this.f122690w.setVisibility(0);
            this.f122689v.setVisibility(0);
            return;
        }
        if (view3.getVisibility() != 8) {
            this.f122689v.setVisibility(8);
            this.f122690w.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m145758Y(final int i) {
        final Frag frag;
        if (NullChecker.m81304b(this.f122692y) && (frag = this.f122692y.get()) != null) {
            frag.duringCreated(C22306c.just(roj0.f160388a)).subscribe(mkd0.m154955G(new e30() { // from class: l.jea0
                @Override // p149l.e30
                public final void call(Object obj) {
                    kea0.m145752S(frag, i, (roj0) obj);
                }
            }));
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: a */
    public void mo131811a(d30 d30Var) {
        if (this.f122687A && NullChecker.m81304b(this.f122692y)) {
            d30Var.call();
        } else {
            this.f122693z = d30Var;
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(final View view) {
        super.mo52728j(view);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.gea0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f102178a.m145757X(view, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(mo52800O().userId());
        if (CoreModule.m29936Q().mo67255a().mo124839f()) {
            return true;
        }
        if (!qp8.m175817b() || qp8.m175816a()) {
            return false;
        }
        return conversationM32856Xe == null || !TEnum.equals(conversationM32856Xe.status, "blocked");
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(new RecyclerView.C0578p(-1, -2));
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        this.f122688u = frameLayout;
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f122688u.setId(u4c0.f174379n7);
        linearLayout.addView(this.f122688u);
        View view = new View(viewGroup.getContext());
        this.f122690w = view;
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, t100.m186890d(19.0f)));
        this.f122690w.setBackgroundResource(x2c0.f189647Pm);
        this.f122690w.setVisibility(8);
        View view2 = new View(viewGroup.getContext());
        this.f122689v = view2;
        view2.setLayoutParams(new LinearLayout.LayoutParams(-1, t100.f167255d));
        this.f122689v.setBackgroundResource(x2c0.f189740Sm);
        this.f122689v.setVisibility(8);
        linearLayout.addView(this.f122690w);
        linearLayout.addView(this.f122689v);
        return linearLayout;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
    }
}
