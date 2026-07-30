package p149l;

import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import org.jetbrains.annotations.NotNull;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ge90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f102169u;

    /* JADX INFO: renamed from: v */
    public VText f102170v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f102171w;

    /* JADX INFO: renamed from: x */
    public VText f102172x;

    /* JADX INFO: renamed from: y */
    public VText f102173y;

    public ge90(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        throw null;
    }

    /* JADX INFO: renamed from: T */
    public View m125688T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return he90.m130624b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m125689U(VText vText, View view) {
        CoreDlg.m45048b(mo52800O().act(), vText.getText() instanceof Spanned ? rza.m181741U0((Spanned) vText.getText()) : vText.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m125690V(final VText vText) {
        if (!mo52800O().mo51119m0()) {
            vText.setBackgroundDrawable(null);
        }
        vText.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.fe90
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f97107a.m125689U(vText, view);
            }
        });
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        if (!mo52800O().mo51119m0()) {
            vwb.m200354z(vwb.m200324f0(this.f102172x), new e30() { // from class: l.ee90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f90693a.m125690V((VText) obj);
                }
            });
        }
        if (u59.m191849t() && mo52800O().mo51119m0()) {
            xdl0.m208344M(this.f102173y, true);
        }
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m125688T(mo52800O().act().inflater(), viewGroup);
    }
}
