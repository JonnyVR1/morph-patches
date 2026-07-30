package p153l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class oma0 extends ep90 {

    /* JADX INFO: renamed from: A */
    public boolean f147911A;

    /* JADX INFO: renamed from: u */
    public FrameLayout f147912u;

    /* JADX INFO: renamed from: v */
    public View f147913v;

    /* JADX INFO: renamed from: w */
    public View f147914w;

    /* JADX INFO: renamed from: x */
    public t3m f147915x;

    /* JADX INFO: renamed from: y */
    public WeakReference<Frag> f147916y;

    /* JADX INFO: renamed from: z */
    public x20 f147917z;

    public oma0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f147911A = false;
        this.f147915x = t3mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m168201S(Frag frag, int i, uxj0 uxj0Var) {
        if (frag instanceof npl) {
            ((npl) frag).mo71694l(i >= 0 && i < 100);
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m168203U(View view) {
        if (view != null) {
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m168204V(final View view) {
        if (this.f147911A) {
            return;
        }
        try {
            Frag fragMo68471ue = CoreModule.m30934Q().mo68471ue(mo53983O().userId(), CoreModule.f18264c.f20405m0.m32023L6(mo53983O().userId()) ? mo53983O().from() : "");
            this.f147916y = new WeakReference<>(fragMo68471ue);
            mo53983O().mo52249J1().getChildFragmentManager().m2568m().m2804b(adc0.f70504p7, fragMo68471ue).mo2711l();
            this.f147911A = true;
            fragMo68471ue.creates(new y20() { // from class: l.lma0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f132656a.m168205W((Bundle) obj);
                }
            });
            mo53983O().mo52249J1().m21591l4(new Runnable() { // from class: l.mma0
                @Override // java.lang.Runnable
                public final void run() {
                    oma0.m168203U(view);
                }
            });
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m168205W(Bundle bundle) {
        x20 x20Var = this.f147917z;
        if (x20Var != null) {
            x20Var.call();
            this.f147917z = null;
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m168206X(View view, View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f147912u.isAttachedToWindow() && !this.f147911A && NullChecker.m82486a(mo53983O().mo52249J1().getView()) && mo53983O().mo52249J1().getView().findViewById(adc0.f70504p7) != null) {
            m168204V(view);
        }
        if (!this.f147915x.mo52302m0()) {
            this.f147913v.setVisibility(8);
            this.f147914w.setVisibility(8);
            return;
        }
        int height = view.getHeight();
        int i9 = qa00.f156319f;
        View view3 = this.f147913v;
        if (height > i9) {
            if (view3.getVisibility() == 0) {
                return;
            }
            this.f147914w.setVisibility(0);
            this.f147913v.setVisibility(0);
            return;
        }
        if (view3.getVisibility() != 8) {
            this.f147913v.setVisibility(8);
            this.f147914w.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m168207Y(final int i) {
        final Frag frag;
        if (NullChecker.m82487b(this.f147916y) && (frag = this.f147916y.get()) != null) {
            frag.duringCreated(C22421c.just(uxj0.f181467a)).subscribe(psd0.m173596G(new y20() { // from class: l.nma0
                @Override // p153l.y20
                public final void call(Object obj) {
                    oma0.m168201S(frag, i, (uxj0) obj);
                }
            }));
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: a */
    public void mo168208a(x20 x20Var) {
        if (this.f147911A && NullChecker.m82487b(this.f147916y)) {
            x20Var.call();
        } else {
            this.f147917z = x20Var;
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(final View view) {
        super.mo53911j(view);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.kma0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f127459a.m168206X(view, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(mo53983O().userId());
        if (CoreModule.m30934Q().mo68438a().mo134414f()) {
            return true;
        }
        if (!vq8.m202358b() || vq8.m202357a()) {
            return false;
        }
        return conversationM33859Xe == null || !TEnum.equals(conversationM33859Xe.status, "blocked");
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(new RecyclerView.C0580p(-1, -2));
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        this.f147912u = frameLayout;
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f147912u.setId(adc0.f70504p7);
        linearLayout.addView(this.f147912u);
        View view = new View(viewGroup.getContext());
        this.f147914w = view;
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, qa00.m175859d(19.0f)));
        this.f147914w.setBackgroundResource(dbc0.f86096Dn);
        this.f147914w.setVisibility(8);
        View view2 = new View(viewGroup.getContext());
        this.f147913v = view2;
        view2.setLayoutParams(new LinearLayout.LayoutParams(-1, qa00.f156317d));
        this.f147913v.setBackgroundResource(dbc0.f86192Gn);
        this.f147913v.setVisibility(8);
        linearLayout.addView(this.f147914w);
        linearLayout.addView(this.f147913v);
        return linearLayout;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
    }
}
