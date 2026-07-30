package p153l;

import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import org.jetbrains.annotations.NotNull;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class km90 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f127452u;

    /* JADX INFO: renamed from: v */
    public VText f127453v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f127454w;

    /* JADX INFO: renamed from: x */
    public VText f127455x;

    /* JADX INFO: renamed from: y */
    public VText f127456y;

    public km90(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        throw null;
    }

    /* JADX INFO: renamed from: T */
    public View m150418T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lm90.m154850b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m150419U(VText vText, View view) {
        CoreDlg.m46231b(mo53983O().act(), vText.getText() instanceof Spanned ? e1b.m118963U0((Spanned) vText.getText()) : vText.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m150420V(final VText vText) {
        if (!mo53983O().mo52302m0()) {
            vText.setBackgroundDrawable(null);
        }
        vText.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.jm90
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f121654a.m150419U(vText, view);
            }
        });
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        if (!mo53983O().mo52302m0()) {
            jyb.m147537z(jyb.m147507f0(this.f127455x), new y20() { // from class: l.im90
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f115714a.m150420V((VText) obj);
                }
            });
        }
        if (d79.m114703t() && mo53983O().mo52302m0()) {
            bnl0.m105524M(this.f127456y, true);
        }
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m150418T(mo53983O().act().inflater(), viewGroup);
    }
}
