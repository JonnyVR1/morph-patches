package p149l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cke extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f81326u;

    /* JADX INFO: renamed from: v */
    public VText f81327v;

    /* JADX INFO: renamed from: w */
    public ImageView f81328w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f81329x;

    /* JADX INFO: renamed from: y */
    public VText f81330y;

    /* JADX INFO: renamed from: z */
    public VText f81331z;

    public cke(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m107399W(View view) {
        m107403V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m107400X(View view) {
        m107403V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m107401Y(View view) {
        m107403V();
    }

    /* JADX INFO: renamed from: U */
    public View m107402U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dke.m112218b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final void m107403V() {
        o6j0.m162859c("e_dislike_type_entrance", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.DO_NOT_WISH);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: d */
    public int mo107404d() {
        return t100.f167259h;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return true;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m107402U(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        VText vText = this.f81331z;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f81327v.setTypeface(typeface);
        this.f81330y.setTypeface(typeface);
        o6j0.m162864h("e_dislike_type_entrance", "p_edit_profile_view", new o6j0.C18854a[0]);
        boolean zM169805r = pj90.m169805r(mo52800O().m94569i2());
        LinearLayout linearLayout = this.f81329x;
        if (zM169805r) {
            xdl0.m208344M(linearLayout, false);
            xdl0.m208344M(this.f81331z, true);
            xdl0.m208344M(this.f81328w, true);
            this.f81331z.setText(mo52800O().m94569i2().profile.extensions.basic.unideal.get(0));
        } else {
            xdl0.m208344M(linearLayout, true);
            xdl0.m208344M(this.f81331z, false);
            xdl0.m208344M(this.f81328w, false);
        }
        xdl0.m208329E0(this.f81331z, new View.OnClickListener() { // from class: l.zje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203400a.m107399W(view);
            }
        });
        xdl0.m208329E0(this.f81329x, new View.OnClickListener() { // from class: l.ake
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70272a.m107400X(view);
            }
        });
        xdl0.m208329E0(this.f81328w, new View.OnClickListener() { // from class: l.bke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76014a.m107401Y(view);
            }
        });
    }
}
