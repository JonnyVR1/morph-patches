package p002l;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import l.e30;
import l.he90;
import l.mcr;
import l.rza;
import l.u59;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ge90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f11383u;

    /* JADX INFO: renamed from: v */
    public VText f11384v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f11385w;

    /* JADX INFO: renamed from: x */
    public VText f11386x;

    /* JADX INFO: renamed from: y */
    public VText f11387y;

    public ge90(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        throw null;
    }

    /* JADX INFO: renamed from: T */
    public View m13764T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return he90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m13765U(VText vText, View view) {
        CoreDlg.b(mo3351O().act(), vText.getText() instanceof Spanned ? rza.U0((Spanned) vText.getText()) : vText.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m13766V(final VText vText) {
        if (!mo3351O().mo1570m0()) {
            vText.setBackgroundDrawable((Drawable) null);
        }
        vText.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.fe90
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f10304a.m13765U(vText, view);
            }
        });
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        if (!mo3351O().mo1570m0()) {
            vwb.z(vwb.f0(new VText[]{this.f11386x}), new e30() { // from class: l.ee90
                public final void call(Object obj) {
                    this.f9689a.m13766V((VText) obj);
                }
            });
        }
        if (u59.t() && mo3351O().mo1570m0()) {
            xdl0.M(this.f11387y, true);
        }
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m13764T(mo3351O().act().inflater(), viewGroup);
    }
}
